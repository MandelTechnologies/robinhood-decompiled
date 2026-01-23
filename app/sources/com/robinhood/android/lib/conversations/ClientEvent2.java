package com.robinhood.android.lib.conversations;

import com.robinhood.android.lib.conversations.ClientEvent;
import com.twilio.conversations.ConversationsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConnectivityEvent;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "<init>", "()V", "ConnectionStateChange", "Synchronization", "Lcom/robinhood/android/lib/conversations/ConnectivityEvent$ConnectionStateChange;", "Lcom/robinhood/android/lib/conversations/ConnectivityEvent$Synchronization;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ConnectivityEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class ClientEvent2 extends ClientEvent.Started {
    public /* synthetic */ ClientEvent2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ClientEvent2() {
        super(null);
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConnectivityEvent$ConnectionStateChange;", "Lcom/robinhood/android/lib/conversations/ConnectivityEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "state", "Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/ConversationsClient$ConnectionState;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getState", "()Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConnectivityEvent$ConnectionStateChange, reason: from toString */
    public static final /* data */ class ConnectionStateChange extends ClientEvent2 {
        private final ConversationsClient client;
        private final ConversationsClient.ConnectionState state;

        public static /* synthetic */ ConnectionStateChange copy$default(ConnectionStateChange connectionStateChange, ConversationsClient conversationsClient, ConversationsClient.ConnectionState connectionState, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = connectionStateChange.client;
            }
            if ((i & 2) != 0) {
                connectionState = connectionStateChange.state;
            }
            return connectionStateChange.copy(conversationsClient, connectionState);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final ConversationsClient.ConnectionState getState() {
            return this.state;
        }

        public final ConnectionStateChange copy(ConversationsClient client, ConversationsClient.ConnectionState state) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(state, "state");
            return new ConnectionStateChange(client, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectionStateChange)) {
                return false;
            }
            ConnectionStateChange connectionStateChange = (ConnectionStateChange) other;
            return Intrinsics.areEqual(this.client, connectionStateChange.client) && this.state == connectionStateChange.state;
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "ConnectionStateChange(client=" + this.client + ", state=" + this.state + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        public final ConversationsClient.ConnectionState getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionStateChange(ConversationsClient client, ConversationsClient.ConnectionState state) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(state, "state");
            this.client = client;
            this.state = state;
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConnectivityEvent$Synchronization;", "Lcom/robinhood/android/lib/conversations/ConnectivityEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "status", "Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getStatus", "()Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConnectivityEvent$Synchronization, reason: from toString */
    public static final /* data */ class Synchronization extends ClientEvent2 {
        private final ConversationsClient client;
        private final ConversationsClient.SynchronizationStatus status;

        public static /* synthetic */ Synchronization copy$default(Synchronization synchronization, ConversationsClient conversationsClient, ConversationsClient.SynchronizationStatus synchronizationStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = synchronization.client;
            }
            if ((i & 2) != 0) {
                synchronizationStatus = synchronization.status;
            }
            return synchronization.copy(conversationsClient, synchronizationStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final ConversationsClient.SynchronizationStatus getStatus() {
            return this.status;
        }

        public final Synchronization copy(ConversationsClient client, ConversationsClient.SynchronizationStatus status) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Synchronization(client, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Synchronization)) {
                return false;
            }
            Synchronization synchronization = (Synchronization) other;
            return Intrinsics.areEqual(this.client, synchronization.client) && this.status == synchronization.status;
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.status.hashCode();
        }

        public String toString() {
            return "Synchronization(client=" + this.client + ", status=" + this.status + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        public final ConversationsClient.SynchronizationStatus getStatus() {
            return this.status;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Synchronization(ConversationsClient client, ConversationsClient.SynchronizationStatus status) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(status, "status");
            this.client = client;
            this.status = status;
        }
    }
}
