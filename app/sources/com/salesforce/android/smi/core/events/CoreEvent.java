package com.salesforce.android.smi.core.events;

import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.internal.api.sse.ServerSentEvent;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent;", "", "<init>", "()V", "ConversationEvent", "Connection", "Error", "Lcom/salesforce/android/smi/core/events/CoreEvent$Connection;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "Lcom/salesforce/android/smi/core/events/CoreEvent$Error;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CoreEvent {
    public /* synthetic */ CoreEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CoreEvent() {
    }

    /* compiled from: CoreEvent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "Lcom/salesforce/android/smi/core/events/CoreEvent;", "conversationId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getConversationId", "()Ljava/util/UUID;", "Entry", "TypingIndicator", "ProgressIndicator", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent$Entry;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent$ProgressIndicator;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent$TypingIndicator;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class ConversationEvent extends CoreEvent {
        private final UUID conversationId;

        public /* synthetic */ ConversationEvent(UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid);
        }

        private ConversationEvent(UUID uuid) {
            super(null);
            this.conversationId = uuid;
        }

        public final UUID getConversationId() {
            return this.conversationId;
        }

        /* compiled from: CoreEvent.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent$Entry;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getConversationEntry", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Entry extends ConversationEvent {
            private final ConversationEntry conversationEntry;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Entry) && Intrinsics.areEqual(this.conversationEntry, ((Entry) other).conversationEntry);
            }

            public int hashCode() {
                return this.conversationEntry.hashCode();
            }

            public String toString() {
                return "Entry(conversationEntry=" + this.conversationEntry + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Entry(ConversationEntry conversationEntry) {
                super(conversationEntry.getConversationId(), null);
                Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
                this.conversationEntry = conversationEntry;
            }
        }

        /* compiled from: CoreEvent.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent$TypingIndicator;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "Lcom/salesforce/android/smi/core/events/TypingIndicatorStatus;", "Lcom/salesforce/android/smi/core/data/domain/conversationEntry/entryPayload/event/typing/TypingIndicatorStatus;", "status", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lcom/salesforce/android/smi/core/events/TypingIndicatorStatus;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getConversationEntry", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "Lcom/salesforce/android/smi/core/events/TypingIndicatorStatus;", "getStatus", "()Lcom/salesforce/android/smi/core/events/TypingIndicatorStatus;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Deprecated
        public static final /* data */ class TypingIndicator extends ConversationEvent {
            private final ConversationEntry conversationEntry;
            private final TypingIndicatorStatus status;

            /* compiled from: CoreEvent.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ConversationEntryType.values().length];
                    try {
                        iArr[ConversationEntryType.TypingStoppedIndicator.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TypingIndicator)) {
                    return false;
                }
                TypingIndicator typingIndicator = (TypingIndicator) other;
                return Intrinsics.areEqual(this.conversationEntry, typingIndicator.conversationEntry) && this.status == typingIndicator.status;
            }

            public int hashCode() {
                return (this.conversationEntry.hashCode() * 31) + this.status.hashCode();
            }

            public String toString() {
                return "TypingIndicator(conversationEntry=" + this.conversationEntry + ", status=" + this.status + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ TypingIndicator(ConversationEntry conversationEntry, TypingIndicatorStatus typingIndicatorStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 2) != 0) {
                    if (WhenMappings.$EnumSwitchMapping$0[conversationEntry.getEntryType().ordinal()] == 1) {
                        typingIndicatorStatus = TypingIndicatorStatus.Stopped;
                    } else {
                        typingIndicatorStatus = TypingIndicatorStatus.Started;
                    }
                }
                this(conversationEntry, typingIndicatorStatus);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TypingIndicator(ConversationEntry conversationEntry, TypingIndicatorStatus status) {
                super(conversationEntry.getConversationId(), null);
                Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
                Intrinsics.checkNotNullParameter(status, "status");
                this.conversationEntry = conversationEntry;
                this.status = status;
            }
        }

        /* compiled from: CoreEvent.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent$ProgressIndicator;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getConversationEntry", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ProgressIndicator extends ConversationEvent {
            private final ConversationEntry conversationEntry;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProgressIndicator) && Intrinsics.areEqual(this.conversationEntry, ((ProgressIndicator) other).conversationEntry);
            }

            public int hashCode() {
                return this.conversationEntry.hashCode();
            }

            public String toString() {
                return "ProgressIndicator(conversationEntry=" + this.conversationEntry + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProgressIndicator(ConversationEntry conversationEntry) {
                super(conversationEntry.getConversationId(), null);
                Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
                this.conversationEntry = conversationEntry;
            }

            public final ConversationEntry getConversationEntry() {
                return this.conversationEntry;
            }
        }
    }

    /* compiled from: CoreEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent$Connection;", "Lcom/salesforce/android/smi/core/events/CoreEvent;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "event", "<init>", "(Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "getEvent", "()Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Connection extends CoreEvent {
        private final ServerSentEvent.Connection event;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Connection) && Intrinsics.areEqual(this.event, ((Connection) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "Connection(event=" + this.event + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Connection(ServerSentEvent.Connection event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }
    }

    /* compiled from: CoreEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/core/events/CoreEvent$Error;", "Lcom/salesforce/android/smi/core/events/CoreEvent;", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Error extends CoreEvent {
        private final Exception exception;
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.exception, error.exception);
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.exception.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ", exception=" + this.exception + ")";
        }

        public /* synthetic */ Error(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new Exception("Unknown Exception") : exc);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.message = message;
            this.exception = exception;
        }
    }
}
