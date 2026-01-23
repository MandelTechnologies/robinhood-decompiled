package com.twilio.conversations;

import com.twilio.conversations.content.ContentData;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public interface Message {
    AggregatedDeliveryReceipt getAggregatedDeliveryReceipt();

    List<Media> getAttachedMedia();

    Attributes getAttributes();

    String getAuthor();

    String getBody();

    CancellationToken getContentData(CallbackListener<ContentData> callbackListener);

    String getContentSid();

    Conversation getConversation();

    String getConversationSid();

    String getDateCreated();

    Date getDateCreatedAsDate();

    String getDateUpdated();

    Date getDateUpdatedAsDate();

    void getDetailedDeliveryReceiptList(CallbackListener<List<DetailedDeliveryReceipt>> callbackListener);

    Media getEmailBody();

    Media getEmailBody(String str);

    Media getEmailHistory();

    Media getEmailHistory(String str);

    String getLastUpdatedBy();

    List<Media> getMediaByCategories(Set<MediaCategory> set);

    long getMessageIndex();

    Participant getParticipant();

    String getParticipantSid();

    String getSid();

    String getSubject();

    CancellationToken getTemporaryContentUrlsForAttachedMedia(CallbackListener<Map<String, String>> callbackListener);

    CancellationToken getTemporaryContentUrlsForMedia(List<Media> list, CallbackListener<Map<String, String>> callbackListener);

    CancellationToken getTemporaryContentUrlsForMediaSids(List<String> list, CallbackListener<Map<String, String>> callbackListener);

    void setAttributes(Attributes attributes, StatusListener statusListener);

    void updateBody(String str, StatusListener statusListener);

    public enum UpdateReason {
        BODY(0),
        ATTRIBUTES(1),
        DELIVERY_RECEIPT(2),
        SUBJECT(3);

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
            throw new IllegalStateException("Invalid value " + i + " for Message.UpdateReason");
        }
    }
}
