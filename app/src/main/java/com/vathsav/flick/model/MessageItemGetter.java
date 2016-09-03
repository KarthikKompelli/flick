package com.vathsav.flick.model;

/**
 * Created by vathsav on 03/09/16.
 */
public class MessageItemGetter {
    private String message_id;
    private String sender_name;
    private String message_body;
    private String message_timestamp;

    public MessageItemGetter(String message_id, String sender_name, String message_body, String message_timestamp) {
        this.message_id = message_id;
        this.sender_name = sender_name;
        this.message_body = message_body;
        this.message_timestamp = message_timestamp;
    }

    public String getMessageId() {
        return message_id;
    }

    public String getSenderName() {
        return sender_name;
    }

    public String getMessageBody() {
        return message_body;
    }

    public String getMessageTimestamp() {
        return message_timestamp;
    }
}