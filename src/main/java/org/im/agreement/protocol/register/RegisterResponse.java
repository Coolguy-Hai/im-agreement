package org.im.agreement.protocol.register;

import org.im.agreement.protocol.Command;
import org.im.agreement.protocol.Packet;

public class RegisterResponse extends Packet {
    private boolean success;
    public RegisterResponse(boolean success){
        this.success = success;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public Byte getCommand() {
        return Command.RegisterResponse;
    }
}
