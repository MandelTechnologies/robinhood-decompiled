package com.robinhood.android.lib.conversations;

import com.twilio.conversations.ConversationsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ClientEvent;", "", "<init>", "()V", "NotStarted", "Starting", "Started", "Failed", "Lcom/robinhood/android/lib/conversations/ClientEvent$Failed;", "Lcom/robinhood/android/lib/conversations/ClientEvent$NotStarted;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Starting;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ClientEvent {
    public /* synthetic */ ClientEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ClientEvent() {
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ClientEvent$NotStarted;", "Lcom/robinhood/android/lib/conversations/ClientEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NotStarted extends ClientEvent {
        public static final NotStarted INSTANCE = new NotStarted();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return -1258957400;
        }

        public String toString() {
            return "NotStarted";
        }

        private NotStarted() {
            super(null);
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ClientEvent$Starting;", "Lcom/robinhood/android/lib/conversations/ClientEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Starting extends ClientEvent {
        public static final Starting INSTANCE = new Starting();

        public boolean equals(Object other) {
            return this == other || (other instanceof Starting);
        }

        public int hashCode() {
            return -102473158;
        }

        public String toString() {
            return "Starting";
        }

        private Starting() {
            super(null);
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "Lcom/robinhood/android/lib/conversations/ClientEvent;", "<init>", "()V", "client", "Lcom/twilio/conversations/ConversationsClient;", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "Ready", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started$Ready;", "Lcom/robinhood/android/lib/conversations/ConnectivityEvent;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent;", "Lcom/robinhood/android/lib/conversations/ErrorEvent;", "Lcom/robinhood/android/lib/conversations/UserEvent;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Started extends ClientEvent {
        public /* synthetic */ Started(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ConversationsClient getClient();

        private Started() {
            super(null);
        }

        /* compiled from: ClientEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ClientEvent$Started$Ready;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "client", "Lcom/twilio/conversations/ConversationsClient;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ready extends Started {
            private final ConversationsClient client;

            public static /* synthetic */ Ready copy$default(Ready ready, ConversationsClient conversationsClient, int i, Object obj) {
                if ((i & 1) != 0) {
                    conversationsClient = ready.client;
                }
                return ready.copy(conversationsClient);
            }

            /* renamed from: component1, reason: from getter */
            public final ConversationsClient getClient() {
                return this.client;
            }

            public final Ready copy(ConversationsClient client) {
                Intrinsics.checkNotNullParameter(client, "client");
                return new Ready(client);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ready) && Intrinsics.areEqual(this.client, ((Ready) other).client);
            }

            public int hashCode() {
                return this.client.hashCode();
            }

            public String toString() {
                return "Ready(client=" + this.client + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ready(ConversationsClient client) {
                super(null);
                Intrinsics.checkNotNullParameter(client, "client");
                this.client = client;
            }

            @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
            public ConversationsClient getClient() {
                return this.client;
            }
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ClientEvent$Failed;", "Lcom/robinhood/android/lib/conversations/ClientEvent;", "exception", "Lcom/robinhood/android/lib/conversations/ChatException;", "<init>", "(Lcom/robinhood/android/lib/conversations/ChatException;)V", "getException", "()Lcom/robinhood/android/lib/conversations/ChatException;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failed extends ClientEvent {
        private final ChatException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(ChatException exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final ChatException getException() {
            return this.exception;
        }
    }
}
