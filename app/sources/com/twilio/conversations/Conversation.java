package com.twilio.conversations;

import com.twilio.conversations.content.ContentTemplateVariable;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/* loaded from: classes12.dex */
public interface Conversation {

    public interface MessageBuilder {
        MessageBuilder addMedia(InputStream inputStream, String str, String str2, MediaUploadListener mediaUploadListener);

        UnsentMessage build();

        CancellationToken buildAndSend(CallbackListener<Message> callbackListener);

        MessageBuilder setAttributes(Attributes attributes);

        MessageBuilder setBody(String str);

        MessageBuilder setContentTemplate(String str);

        MessageBuilder setContentTemplate(String str, List<ContentTemplateVariable> list);

        MessageBuilder setEmailBody(InputStream inputStream, String str, MediaUploadListener mediaUploadListener);

        MessageBuilder setEmailBody(String str, String str2);

        MessageBuilder setEmailHistory(InputStream inputStream, String str, MediaUploadListener mediaUploadListener);

        MessageBuilder setEmailHistory(String str, String str2);

        MessageBuilder setSubject(String str);
    }

    public interface UnsentMessage {
        CancellationToken send(CallbackListener<Message> callbackListener);
    }

    void addListener(ConversationListener conversationListener);

    void addParticipantByAddress(String str, String str2, Attributes attributes, StatusListener statusListener);

    void addParticipantByIdentity(String str, Attributes attributes, StatusListener statusListener);

    void advanceLastReadMessageIndex(long j, CallbackListener<Long> callbackListener);

    void destroy(StatusListener statusListener);

    Attributes getAttributes();

    String getCreatedBy();

    String getDateCreated();

    Date getDateCreatedAsDate();

    String getDateUpdated();

    Date getDateUpdatedAsDate();

    String getFriendlyName();

    Date getLastMessageDate();

    Long getLastMessageIndex();

    void getLastMessages(int i, CallbackListener<List<Message>> callbackListener);

    Long getLastReadMessageIndex();

    ConversationLimits getLimits();

    void getMessageByIndex(long j, CallbackListener<Message> callbackListener);

    void getMessagesAfter(long j, int i, CallbackListener<List<Message>> callbackListener);

    void getMessagesBefore(long j, int i, CallbackListener<List<Message>> callbackListener);

    void getMessagesCount(CallbackListener<Long> callbackListener);

    NotificationLevel getNotificationLevel();

    Participant getParticipantByIdentity(String str);

    Participant getParticipantBySid(String str);

    void getParticipantsCount(CallbackListener<Long> callbackListener);

    List<Participant> getParticipantsList();

    String getSid();

    ConversationState getState();

    Date getStateDateUpdatedAsDate();

    ConversationStatus getStatus();

    SynchronizationStatus getSynchronizationStatus();

    String getUniqueName();

    void getUnreadMessagesCount(CallbackListener<Long> callbackListener);

    void join(StatusListener statusListener);

    void leave(StatusListener statusListener);

    MessageBuilder prepareMessage();

    void removeAllListeners();

    void removeListener(ConversationListener conversationListener);

    void removeMessage(Message message, StatusListener statusListener);

    void removeParticipant(Participant participant, StatusListener statusListener);

    void removeParticipantByIdentity(String str, StatusListener statusListener);

    void setAllMessagesRead(CallbackListener<Long> callbackListener);

    void setAllMessagesUnread(CallbackListener<Long> callbackListener);

    void setAttributes(Attributes attributes, StatusListener statusListener);

    void setFriendlyName(String str, StatusListener statusListener);

    void setLastReadMessageIndex(long j, CallbackListener<Long> callbackListener);

    void setNotificationLevel(NotificationLevel notificationLevel, StatusListener statusListener);

    void setUniqueName(String str, StatusListener statusListener);

    void typing();

    public enum NotificationLevel {
        DEFAULT(0),
        MUTED(1);

        private final int value;

        NotificationLevel(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static NotificationLevel fromInt(int i) {
            for (NotificationLevel notificationLevel : values()) {
                if (notificationLevel.getValue() == i) {
                    return notificationLevel;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for NotificationLevel");
        }
    }

    public enum ConversationStatus {
        JOINED(1),
        NOT_PARTICIPATING(2);

        private final int value;

        ConversationStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static ConversationStatus fromInt(int i) {
            for (ConversationStatus conversationStatus : values()) {
                if (conversationStatus.getValue() == i) {
                    return conversationStatus;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for ConversationStatus");
        }
    }

    public enum ConversationState {
        UNDEFINED(0),
        ACTIVE(1),
        INACTIVE(2),
        CLOSED(3);

        private final int value;

        ConversationState(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static ConversationState fromInt(int i) {
            for (ConversationState conversationState : values()) {
                if (conversationState.getValue() == i) {
                    return conversationState;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for ConversationState");
        }
    }

    public enum SynchronizationStatus {
        NONE(0),
        IDENTIFIER(1),
        METADATA(2),
        ALL(3),
        FAILED(4);

        private final int value;

        SynchronizationStatus(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static SynchronizationStatus fromInt(int i) {
            for (SynchronizationStatus synchronizationStatus : values()) {
                if (synchronizationStatus.getValue() == i) {
                    return synchronizationStatus;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for SynchronizationStatus");
        }

        public boolean isAtLeast(SynchronizationStatus synchronizationStatus) {
            SynchronizationStatus synchronizationStatus2 = FAILED;
            return (synchronizationStatus == synchronizationStatus2 || this == synchronizationStatus2 || getValue() < synchronizationStatus.getValue()) ? false : true;
        }
    }

    public enum UpdateReason {
        STATUS(1),
        LAST_READ_MESSAGE_INDEX(2),
        UNIQUE_NAME(3),
        FRIENDLY_NAME(4),
        ATTRIBUTES(5),
        LAST_MESSAGE(6),
        NOTIFICATION_LEVEL(7),
        STATE(8);

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
