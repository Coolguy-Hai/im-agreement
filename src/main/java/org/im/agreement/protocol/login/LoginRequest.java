package org.im.agreement.protocol.login;

import org.im.agreement.protocol.Command;
import org.im.agreement.protocol.Packet;

public class LoginRequest extends Packet {

    private String userId;
    private String userPassword;

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
