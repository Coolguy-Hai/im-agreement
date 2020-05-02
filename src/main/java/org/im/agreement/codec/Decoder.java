package org.im.agreement.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.im.agreement.protocol.Address;
import org.im.agreement.protocol.Packet;
import org.im.agreement.util.SerializationUtil;


import java.util.List;

public class Decoder extends MessageToMessageDecoder<DatagramPacket> {

    @Override
    protected void decode(ChannelHandlerContext ctx, DatagramPacket in, List<Object> out) {
        ByteBuf buf = in.content();
        String hostName = in.sender().getHostName();
        int port = in.sender().getPort();

        if (buf.readableBytes() < 4) {
            return;
        }
        buf.markReaderIndex();
        int dataLength = buf.readInt();
        if (buf.readableBytes() < dataLength) {
            buf.resetReaderIndex();
            return;
        }
        byte command = buf.readByte();  //读取指令

        //byte check = in.readByte(); //读取校验码，后面计算后与之作比较以验证是否发生错误
        byte[] data = new byte[dataLength - 1]; //指令占了一位，剔除掉
        buf.readBytes(data);
        Packet object = SerializationUtil.deserialize(data, Packet.get(command));
        object.setReceiveRemoteAddress(new Address(hostName, port));
        out.add(object); //根据command解析成特定的对象
    }
}
/**
 * 可靠传输实现
 * 1. 在客户端建立一个消息链表，每个要发送的信息都先存入该链表中，设置一个类进行统一的消息发送
 * 2. 为链表中的每一个消息编号，将该编号加入消息中一同发送至服务器
 * 3. 服务器收到消息并确认正确后发送ACK和对应的消息序号
 * 4. 客户端收到ACK后，根据对应的序号将消息从消息链表中删除
 * 5. 如果客户端未收到消息或者收到NAK，则进行消息重发
 * 6. 单个消息重发一定次数后，说明网络或系统存在异常，停止重发，并向用户报错
 *
 * */




































