package com.twilio.conversations;

import java.util.Date;

/* loaded from: classes12.dex */
public interface Participant {
    void getAndSubscribeUser(CallbackListener<User> callbackListener);

    Attributes getAttributes();

    String getChannel();

    Conversation getConversation();

    String getDateCreated();

    Date getDateCreatedAsDate();

    String getDateUpdated();

    Date getDateUpdatedAsDate();

    String getIdentity();

    Long getLastReadMessageIndex();

    String getLastReadTimestamp();

    String getSid();

    void remove(StatusListener statusListener);

    void setAttributes(Attributes attributes, StatusListener statusListener);

    public enum UpdateReason {
        LAST_READ_MESSAGE_INDEX(0),
        LAST_READ_TIMESTAMP(1),
        ATTRIBUTES(2);

        private final int value;

        UpdateReason(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static UpdateReason fromInt(int i) {
            for (UpdateReason updateReason : values()) {
                if (updateReason.getValue() == i) {
                    return updateReason;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for UpdateReason");
        }
    }
}
