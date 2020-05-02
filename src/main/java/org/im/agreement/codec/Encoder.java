package org.im.agreement.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.im.agreement.protocol.Packet;
import org.im.agreement.util.SerializationUtil;

import java.net.InetSocketAddress;
import java.util.List;


public class Encoder extends MessageToMessageEncoder<Packet> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet in, List<Object> out) {
        byte[] data = SerializationUtil.serialize(in);
        InetSocketAddress address = new InetSocketAddress(in.getSendRemoteAddress().getHost(), in.getSendRemoteAddress().getPort());

        //out.writeByte(校验码); 根据编码后的字节码，添加一位校验码，随着数据一并发送
        ByteBuf buffer = ctx.alloc().buffer(data.length + 5);
        buffer.writeInt(data.length + 1);
        buffer.writeByte(in.getCommand()); //添加指令
        buffer.writeBytes(data);
        out.add(new DatagramPacket(buffer, address));
    }

}
