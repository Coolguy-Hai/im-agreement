package org.im.agreement.protocol.login;

import org.im.agreement.protocol.Command;
import org.im.agreement.protocol.Packet;
import org.im.agreement.protocol.login.infoObject.GroupInfo;
import org.im.agreement.protocol.login.infoObject.MessageInfo;
import org.im.agreement.protocol.login.infoObject.UserInfo;

import java.util.List;

public class LoginResponse extends Packet {

    private boolean success; //是否登录成功，即密码是否正确
    private List<UserInfo> userInfos;
    private List<GroupInfo> groupInfos;
    private List<MessageInfo> messageInfos;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    public List<GroupInfo> getGroupInfos() {
        return groupInfos;
    }

    public void setGroupInfos(List<GroupInfo> groupInfos) {
        this.groupInfos = groupInfos;
    }

    public List<MessageInfo> getMessageInfos() {
        return messageInfos;
    }

    public void setMessageInfos(List<MessageInfo> messageInfos) {
        this.messageInfos = messageInfos;
    }

    @Override
    public Byte getCommand() {
        return Command.LoginResponse;
    }
}
