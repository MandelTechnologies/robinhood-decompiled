package com.salesforce.android.smi.network.internal.api.sse;

import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerSentEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "", "<init>", "()V", "Connection", "ConversationEntryEvent", "Error", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$ConversationEntryEvent;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Error;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ServerSentEvent {
    public /* synthetic */ ServerSentEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ServerSentEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "<init>", "()V", "Connecting", "Open", "Closed", "Ping", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Closed;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Connecting;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Open;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Ping;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Connection extends ServerSentEvent {
        public /* synthetic */ Connection(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ServerSentEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Connecting;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "<init>", "()V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Connecting extends Connection {
            public static final Connecting INSTANCE = new Connecting();

            private Connecting() {
                super(null);
            }
        }

        private Connection() {
            super(null);
        }

        /* compiled from: ServerSentEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Open;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "<init>", "()V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Open extends Connection {
            public static final Open INSTANCE = new Open();

            private Open() {
                super(null);
            }
        }

        /* compiled from: ServerSentEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Closed;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "<init>", "()V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Closed extends Connection {
            public static final Closed INSTANCE = new Closed();

            private Closed() {
                super(null);
            }
        }

        /* compiled from: ServerSentEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection$Ping;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "<init>", "()V", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Ping extends Connection {
            public static final Ping INSTANCE = new Ping();

            private Ping() {
                super(null);
            }
        }
    }

    private ServerSentEvent() {
    }

    /* compiled from: ServerSentEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$ConversationEntryEvent;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "", "eventId", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventId", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getConversationEntry", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class ConversationEntryEvent extends ServerSentEvent {
        private final ConversationEntry conversationEntry;
        private final String eventId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationEntryEvent)) {
                return false;
            }
            ConversationEntryEvent conversationEntryEvent = (ConversationEntryEvent) other;
            return Intrinsics.areEqual(this.eventId, conversationEntryEvent.eventId) && Intrinsics.areEqual(this.conversationEntry, conversationEntryEvent.conversationEntry);
        }

        public int hashCode() {
            return (this.eventId.hashCode() * 31) + this.conversationEntry.hashCode();
        }

        public String toString() {
            return "ConversationEntryEvent(eventId=" + this.eventId + ", conversationEntry=" + this.conversationEntry + ")";
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final ConversationEntry getConversationEntry() {
            return this.conversationEntry;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationEntryEvent(String eventId, ConversationEntry conversationEntry) {
            super(null);
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
            this.eventId = eventId;
            this.conversationEntry = conversationEntry;
        }
    }

    /* compiled from: ServerSentEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Error;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Error extends ServerSentEvent {
        private final Throwable cause;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public /* synthetic */ Error(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
