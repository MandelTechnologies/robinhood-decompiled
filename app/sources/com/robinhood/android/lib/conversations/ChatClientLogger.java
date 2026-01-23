package com.robinhood.android.lib.conversations;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.lib.conversations.ClientEvent;
import com.robinhood.android.lib.conversations.ClientEvent2;
import com.robinhood.android.lib.conversations.ClientEvent3;
import com.robinhood.android.lib.conversations.ClientEvent5;
import com.robinhood.models.api.MarginCall;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData;
import com.twilio.conversations.ConversationsClient;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: ChatClientLogger.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ChatClientLogger;", "", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "<init>", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "logClientEvent", "", "event", "Lcom/robinhood/android/lib/conversations/ClientEvent;", "logClientEvent$lib_conversations_externalDebug", "logShutdown", "logShutdown$lib_conversations_externalDebug", "logConversationLoad", "logConversationLoad$lib_conversations_externalDebug", "logTokenEvent", "connectionState", "Lcom/twilio/conversations/ConversationsClient$ConnectionState;", MarginCall.STATE_EXPIRED, "", "logTokenEvent$lib_conversations_externalDebug", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ChatClientLogger {
    private final SharedEventLogger eventLogger;

    public ChatClientLogger(SharedEventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final void logClientEvent$lib_conversations_externalDebug(ClientEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ClientEvent.Starting) {
            Timber.INSTANCE.mo3356i("Chat status - Initializing the SDK", new Object[0]);
            return;
        }
        if (event instanceof ClientEvent.Failed) {
            Timber.INSTANCE.mo3356i("Chat status - Failed to initialize the SDK", new Object[0]);
            SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(this.eventLogger, null, null, TwilioConversationsSdkEventData.Action.INITIALIZATION_FAILED, 3, null);
            return;
        }
        if (event instanceof ClientEvent.Started.Ready) {
            Timber.INSTANCE.mo3356i("Chat status - SDK is Initialized", new Object[0]);
            SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(this.eventLogger, TwilioConversationsSdkEventData.ConnectionState.CONNECTED, null, TwilioConversationsSdkEventData.Action.INITIALIZED, 2, null);
            return;
        }
        if (event instanceof ClientEvent2.ConnectionStateChange) {
            SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(this.eventLogger, EventDatas.getEventData(((ClientEvent2.ConnectionStateChange) event).getState()), null, TwilioConversationsSdkEventData.Action.CONNECTION_STATUS_CHANGE, 2, null);
            return;
        }
        if (event instanceof ClientEvent3.SynchronizationChange) {
            SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(this.eventLogger, null, EventDatas.getEventData(((ClientEvent3.SynchronizationChange) event).getConversation()), TwilioConversationsSdkEventData.Action.CONVERSATION_SYNC_STATUS_CHANGE, 1, null);
            return;
        }
        if (!(event instanceof ClientEvent.NotStarted) && !(event instanceof ClientEvent2.Synchronization) && !(event instanceof ClientEvent3.Added) && !(event instanceof ClientEvent3.Deleted) && !(event instanceof ClientEvent3.Updated) && !(event instanceof ClientEvent4) && !(event instanceof ClientEvent5.Subscribed) && !(event instanceof ClientEvent5.Unsubscribed) && !(event instanceof ClientEvent5.Updated)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void logShutdown$lib_conversations_externalDebug() {
        SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(this.eventLogger, null, null, TwilioConversationsSdkEventData.Action.SHUTDOWN, 3, null);
    }

    public final void logConversationLoad$lib_conversations_externalDebug() {
        SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(this.eventLogger, null, null, TwilioConversationsSdkEventData.Action.LOAD_CONVERSATION, 3, null);
    }

    public final void logTokenEvent$lib_conversations_externalDebug(ConversationsClient.ConnectionState connectionState, boolean expired) {
        TwilioConversationsSdkEventData.Action action;
        SharedEventLogger sharedEventLogger = this.eventLogger;
        TwilioConversationsSdkEventData.ConnectionState eventData = EventDatas.getEventData(connectionState);
        if (expired) {
            action = TwilioConversationsSdkEventData.Action.TOKEN_EXPIRED;
        } else {
            action = TwilioConversationsSdkEventData.Action.TOKEN_ABOUT_TO_EXPIRE;
        }
        SharedEventLogger.DefaultImpls.logTwilioConversationsSdkEvent$default(sharedEventLogger, eventData, null, action, 2, null);
    }
}
