package org.im.agreement.protocol.login.infoObject;

import java.util.ArrayList;
import java.util.List;

public class GroupInfo {

    private String groupId;
    private String groupNumber;
    private String groupOwnerId;
    private String groupSuperId;
    private List<MessageInfo> messages = new ArrayList<MessageInfo>();

    public GroupInfo(String groupId, String groupNumber, String groupOwnerId, String groupSuperId, List<MessageInfo> messages) {
        this.groupId = groupId;
        this.groupNumber = groupNumber;
        this.groupOwnerId = groupOwnerId;
        this.groupSuperId = groupSuperId;
        this.messages = messages;
    }

    public List<MessageInfo> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageInfo> messages) {
        this.messages = messages;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupOwnerId() {
        return groupOwnerId;
    }

    public void setGroupOwnerId(String groupOwnerId) {
        this.groupOwnerId = groupOwnerId;
    }

    public String getGroupSuperId() {
        return groupSuperId;
    }

    public void setGroupSuperId(String groupSuperId) {
        this.groupSuperId = groupSuperId;
    }
}
