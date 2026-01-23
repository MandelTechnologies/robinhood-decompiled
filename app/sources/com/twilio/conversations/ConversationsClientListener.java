package com.twilio.conversations;

import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.User;
import com.twilio.util.ErrorInfo;

/* loaded from: classes12.dex */
public interface ConversationsClientListener {
    void onAddedToConversationNotification(String str);

    void onClientSynchronization(ConversationsClient.SynchronizationStatus synchronizationStatus);

    void onConnectionStateChange(ConversationsClient.ConnectionState connectionState);

    void onConversationAdded(Conversation conversation);

    void onConversationDeleted(Conversation conversation);

    void onConversationSynchronizationChange(Conversation conversation);

    void onConversationUpdated(Conversation conversation, Conversation.UpdateReason updateReason);

    void onError(ErrorInfo errorInfo);

    void onNewMessageNotification(String str, String str2, long j);

    void onNotificationFailed(ErrorInfo errorInfo);

    void onNotificationSubscribed();

    void onRemovedFromConversationNotification(String str);

    void onTokenAboutToExpire();

    void onTokenExpired();

    void onUserSubscribed(User user);

    void onUserUnsubscribed(User user);

    void onUserUpdated(User user, User.UpdateReason updateReason);
}
