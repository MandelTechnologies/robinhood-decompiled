package com.twilio.conversations.internal;

import android.os.Handler;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.ConversationsClientListener;
import com.twilio.conversations.ListenerException;
import com.twilio.conversations.User;
import com.twilio.util.ErrorInfo;
import com.twilio.util.TwilioLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;

/* loaded from: classes12.dex */
public class ConversationsClientListenerForwarder implements ConversationsClientListener {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(ConversationsClientListenerForwarder.class));
    Map<ConversationsClientListener, Handler> listeners = new ConcurrentHashMap();
    private ConversationsClient.SynchronizationStatus rememberedClientSyncState = null;
    private ConversationsClient.ConnectionState rememberedClientConnectState = null;

    private interface ListenerNotifier {
        void onNotify(ConversationsClientListener conversationsClientListener);
    }

    public void addListener(ConversationsClientListener conversationsClientListener) {
        if (conversationsClientListener == null) {
            throw new IllegalArgumentException("Listener cannot be null");
        }
        Handler handler = HandlerUtil.setupListenerHandler();
        ConversationsClientListener conversationsClientListener2 = (ConversationsClientListener) RethrowingForwarder.create(conversationsClientListener, ListenerException.class);
        this.listeners.put(conversationsClientListener2, handler);
        ConversationsClient.SynchronizationStatus synchronizationStatus = this.rememberedClientSyncState;
        if (synchronizationStatus != null) {
            conversationsClientListener2.onClientSynchronization(synchronizationStatus);
        }
        ConversationsClient.ConnectionState connectionState = this.rememberedClientConnectState;
        if (connectionState != null) {
            conversationsClientListener2.onConnectionStateChange(connectionState);
        }
    }

    public void removeListener(ConversationsClientListener conversationsClientListener) {
        if (conversationsClientListener == null) {
            throw new IllegalArgumentException("Listener cannot be null");
        }
        this.listeners.remove((ConversationsClientListener) RethrowingForwarder.create(conversationsClientListener, ListenerException.class));
    }

    public void removeAllListeners() {
        this.listeners.clear();
    }

    private void logConversation(String str, Conversation conversation) {
        logger.m3188d(str + " sid|" + conversation.getSid() + "| " + conversation.hashCode());
    }

    private void notifyListeners(final ListenerNotifier listenerNotifier) {
        for (Map.Entry<ConversationsClientListener, Handler> entry : this.listeners.entrySet()) {
            final ConversationsClientListener key = entry.getKey();
            entry.getValue().post(new Runnable() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.1
                @Override // java.lang.Runnable
                public void run() {
                    listenerNotifier.onNotify(key);
                }
            });
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationAdded(final Conversation conversation) {
        if (conversation == null) {
            return;
        }
        logConversation("onConversationAdded", conversation);
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.2
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onConversationAdded(conversation);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationUpdated(final Conversation conversation, final Conversation.UpdateReason updateReason) {
        if (conversation == null) {
            return;
        }
        logConversation("onConversationUpdated", conversation);
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.3
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onConversationUpdated(conversation, updateReason);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationDeleted(final Conversation conversation) {
        if (conversation == null) {
            return;
        }
        logConversation("onConversationDeleted", conversation);
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.4
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onConversationDeleted(conversation);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onUserUpdated(final User user, final User.UpdateReason updateReason) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.5
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onUserUpdated(user, updateReason);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onUserSubscribed(final User user) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.6
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onUserSubscribed(user);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onUserUnsubscribed(final User user) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.7
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onUserUnsubscribed(user);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onError(final ErrorInfo errorInfo) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.8
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onError(errorInfo);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onNewMessageNotification(final String str, final String str2, final long j) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.9
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onNewMessageNotification(str, str2, j);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onAddedToConversationNotification(final String str) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.10
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onAddedToConversationNotification(str);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onRemovedFromConversationNotification(final String str) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.11
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onRemovedFromConversationNotification(str);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onNotificationSubscribed() {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.12
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onNotificationSubscribed();
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onNotificationFailed(final ErrorInfo errorInfo) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.13
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onNotificationFailed(errorInfo);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationSynchronizationChange(final Conversation conversation) {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.14
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onConversationSynchronizationChange(conversation);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onClientSynchronization(final ConversationsClient.SynchronizationStatus synchronizationStatus) {
        logger.m3188d("Client synchronization update - " + synchronizationStatus.toString());
        this.rememberedClientSyncState = synchronizationStatus;
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.15
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onClientSynchronization(synchronizationStatus);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConnectionStateChange(final ConversationsClient.ConnectionState connectionState) {
        this.rememberedClientConnectState = connectionState;
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.16
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onConnectionStateChange(connectionState);
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onTokenExpired() {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.17
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onTokenExpired();
            }
        });
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onTokenAboutToExpire() {
        notifyListeners(new ListenerNotifier() { // from class: com.twilio.conversations.internal.ConversationsClientListenerForwarder.18
            @Override // com.twilio.conversations.internal.ConversationsClientListenerForwarder.ListenerNotifier
            public void onNotify(ConversationsClientListener conversationsClientListener) {
                conversationsClientListener.onTokenAboutToExpire();
            }
        });
    }
}
