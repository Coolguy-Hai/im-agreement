package org.im.agreement.protocol.login;

import org.im.agreement.protocol.Address;
import org.im.agreement.protocol.Command;
import org.im.agreement.protocol.Packet;

import java.net.InetSocketAddress;

public class LoginRequest extends Packet {

    private String userId;
    private String userPassword;

    public LoginRequest(String userId, String userPassword, Address sendRemoteAddress) {
        this.sendRemoteAddress = sendRemoteAddress;
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public Byte getCommand() {
        return Command.LoginRequest;
    }
}
