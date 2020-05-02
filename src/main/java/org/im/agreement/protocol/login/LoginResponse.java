package org.im.agreement.protocol.login;

import org.im.agreement.protocol.Address;
import org.im.agreement.protocol.Command;
import org.im.agreement.protocol.Packet;
import org.im.agreement.protocol.infoObject.GroupInfo;
import org.im.agreement.protocol.infoObject.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class LoginResponse extends Packet {

    private boolean success; //是否登录成功，即密码是否正确
    private List<UserInfo> userInfos = new ArrayList<UserInfo>();
    private List<GroupInfo> groupInfos = new ArrayList<GroupInfo>();

    public LoginResponse(){

    }

    public LoginResponse(boolean success, List<UserInfo> userInfos, List<GroupInfo> groupInfos, Address sendRemoteAddress) {
        this.sendRemoteAddress = sendRemoteAddress;
        this.success = success;
        this.userInfos = userInfos;
        this.groupInfos = groupInfos;
    }

    public LoginResponse(boolean success) {
        this.success = success;
    }

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

    @Override
    public Byte getCommand() {
        return Command.LoginResponse;
    }
}
