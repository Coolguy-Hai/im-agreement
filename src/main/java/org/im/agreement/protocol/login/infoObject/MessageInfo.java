package org.im.agreement.protocol.login.infoObject;

import java.util.Date;

public class MessageInfo {

    private Byte messageType; //0 person/1 group
    private String userName;
    private String bufMessage;
    private Date bufDate;

    public MessageInfo(String bufMessage, Date bufDate, String userName, Byte messageType) {
        this.userName = userName;
        this.bufMessage = bufMessage;
        this.bufDate = bufDate;
        this.messageType = messageType;
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBufMessage() {
        return bufMessage;
    }

    public void setBufMessage(String bufMessage) {
        this.bufMessage = bufMessage;
    }

    public Date getBufDate() {
        return bufDate;
    }

    public void setBufDate(Date bufDate) {
        this.bufDate = bufDate;
    }
}
