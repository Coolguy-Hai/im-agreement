package org.im.agreement.protocol.infoObject;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {

    private String userId;
    private String userName;
    private String userSex; //optical
    private String userLocation; //optical
    private String userState;
    private String userIp;
    private List<MessageInfo> messages = new ArrayList<MessageInfo>();

    public UserInfo(String userId, String userName, String userSex, String userLocation, String userState, String userIp, List<MessageInfo> messages) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userLocation = userLocation;
        this.userState = userState;
        this.userIp = userIp;
        this.messages = messages;
    }

    public List<MessageInfo> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageInfo> messages) {
        this.messages = messages;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }
}
