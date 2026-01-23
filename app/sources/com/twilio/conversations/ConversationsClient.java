package com.twilio.conversations;

import android.content.Context;
import android.text.TextUtils;
import com.twilio.conversations.ConversationsClientImpl;
import com.twilio.conversations.content.ContentTemplate;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface ConversationsClient {

    public interface ConversationBuilder {
        void build(CallbackListener<Conversation> callbackListener);

        ConversationBuilder withAttributes(Attributes attributes);

        ConversationBuilder withFriendlyName(String str);

        ConversationBuilder withUniqueName(String str);
    }

    void addListener(ConversationsClientListener conversationsClientListener);

    ConversationBuilder conversationBuilder();

    void createConversation(String str, CallbackListener<Conversation> callbackListener);

    void getAndSubscribeUser(String str, CallbackListener<User> callbackListener);

    ConnectionState getConnectionState();

    CancellationToken getContentTemplates(CallbackListener<List<ContentTemplate>> callbackListener);

    void getConversation(String str, CallbackListener<Conversation> callbackListener);

    List<Conversation> getMyConversations();

    String getMyIdentity();

    User getMyUser();

    List<Participant> getParticipantsByIdentity(String str);

    Properties getProperties();

    List<User> getSubscribedUsers();

    CancellationToken getTemporaryContentUrlsForMedia(List<Media> list, CallbackListener<Map<String, String>> callbackListener);

    CancellationToken getTemporaryContentUrlsForMediaSids(List<String> list, CallbackListener<Map<String, String>> callbackListener);

    void handleNotification(NotificationPayload notificationPayload);

    boolean isReachabilityEnabled();

    void registerFCMToken(FCMToken fCMToken, StatusListener statusListener);

    void removeAllListeners();

    void removeListener(ConversationsClientListener conversationsClientListener);

    void shutdown();

    void synchronizeConversations();

    void unregisterFCMToken(FCMToken fCMToken, StatusListener statusListener);

    void updateToken(String str, StatusListener statusListener);

    static void setLogLevel(LogLevel logLevel) {
        ConversationsClientImpl.setLogLevel(logLevel.mValue);
    }

    static void create(Context context, String str, Properties properties, CallbackListener<ConversationsClient> callbackListener) {
        ConversationsClientImpl.create(context, str, properties, callbackListener);
    }

    static String getSdkVersion() {
        return ConversationsClientImpl.getSdkVersion();
    }

    public enum SynchronizationStatus {
        STARTED(0),
        CONVERSATIONS_COMPLETED(1),
        COMPLETED(2),
        FAILED(3),
        SYNCHRONIZATION_DISABLED(4);

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
    }

    public enum ConnectionState {
        CONNECTING(0),
        CONNECTED(1),
        DISCONNECTED(2),
        DENIED(3),
        ERROR(4),
        FATAL_ERROR(5);

        private final int value;

        ConnectionState(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static ConnectionState fromInt(int i) {
            for (ConnectionState connectionState : values()) {
                if (connectionState.getValue() == i) {
                    return connectionState;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for ConnectionState");
        }
    }

    public interface Properties {
        public static final int DEFAULT_COMMAND_TIMEOUT = 10000;
        public static final int MIN_COMMAND_TIMEOUT = 10000;

        public interface Builder {
            Properties createProperties();

            Builder setCommandTimeout(int i);

            Builder setDeferCertificateTrustToPlatform(boolean z);

            Builder setRegion(String str);

            Builder setSynchronizeOnStartup(boolean z);

            Builder setUseProxy(boolean z);
        }

        int getCommandTimeout();

        boolean getDeferCA();

        String getRegion();

        boolean getSynchronizeOnStartup();

        boolean useProxy();

        static Builder newBuilder() {
            return new ConversationsClientImpl.PropertiesImpl.BuilderImpl();
        }
    }

    public enum LogLevel {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6),
        ASSERT(7),
        SILENT(8);

        final int mValue;

        LogLevel(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }

        public static LogLevel fromInt(int i) {
            for (LogLevel logLevel : values()) {
                if (logLevel.getValue() == i) {
                    return logLevel;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for LogLevel");
        }
    }

    public static class FCMToken {
        private final String token;

        public FCMToken(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Token must not be empty");
            }
            this.token = str;
        }

        public String getToken() {
            return this.token;
        }
    }
}
