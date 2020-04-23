package org.im.agreement.protocol.register;

import org.im.agreement.protocol.Command;
import org.im.agreement.protocol.Packet;

public class RegisterRequest extends Packet {

    private String userId;
    private String userPassword;
    public RegisterRequest(String userId, String userPassword){
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    @Override
    public Byte getCommand() {
        return Command.RegisterRequest;
    }
}
