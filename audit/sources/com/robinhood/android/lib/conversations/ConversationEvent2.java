package com.robinhood.android.lib.conversations;

import com.twilio.conversations.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/MessageEvent;", "Lcom/robinhood/android/lib/conversations/ConversationEvent;", "<init>", "()V", "message", "Lcom/twilio/conversations/Message;", "getMessage", "()Lcom/twilio/conversations/Message;", "Added", "Updated", "Deleted", "Lcom/robinhood/android/lib/conversations/MessageEvent$Added;", "Lcom/robinhood/android/lib/conversations/MessageEvent$Deleted;", "Lcom/robinhood/android/lib/conversations/MessageEvent$Updated;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.MessageEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class ConversationEvent2 extends ConversationEvent {
    public /* synthetic */ ConversationEvent2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Message getMessage();

    private ConversationEvent2() {
        super(null);
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/MessageEvent$Added;", "Lcom/robinhood/android/lib/conversations/MessageEvent;", "message", "Lcom/twilio/conversations/Message;", "<init>", "(Lcom/twilio/conversations/Message;)V", "getMessage", "()Lcom/twilio/conversations/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.MessageEvent$Added, reason: from toString */
    public static final /* data */ class Added extends ConversationEvent2 {
        private final Message message;

        public static /* synthetic */ Added copy$default(Added added, Message message, int i, Object obj) {
            if ((i & 1) != 0) {
                message = added.message;
            }
            return added.copy(message);
        }

        /* renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final Added copy(Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Added(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Added) && Intrinsics.areEqual(this.message, ((Added) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Added(message=" + this.message + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent2
        public Message getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Added(Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/MessageEvent$Updated;", "Lcom/robinhood/android/lib/conversations/MessageEvent;", "message", "Lcom/twilio/conversations/Message;", "reason", "Lcom/twilio/conversations/Message$UpdateReason;", "<init>", "(Lcom/twilio/conversations/Message;Lcom/twilio/conversations/Message$UpdateReason;)V", "getMessage", "()Lcom/twilio/conversations/Message;", "getReason", "()Lcom/twilio/conversations/Message$UpdateReason;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.MessageEvent$Updated, reason: from toString */
    public static final /* data */ class Updated extends ConversationEvent2 {
        private final Message message;
        private final Message.UpdateReason reason;

        public static /* synthetic */ Updated copy$default(Updated updated, Message message, Message.UpdateReason updateReason, int i, Object obj) {
            if ((i & 1) != 0) {
                message = updated.message;
            }
            if ((i & 2) != 0) {
                updateReason = updated.reason;
            }
            return updated.copy(message, updateReason);
        }

        /* renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Message.UpdateReason getReason() {
            return this.reason;
        }

        public final Updated copy(Message message, Message.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Updated(message, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Updated)) {
                return false;
            }
            Updated updated = (Updated) other;
            return Intrinsics.areEqual(this.message, updated.message) && this.reason == updated.reason;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Updated(message=" + this.message + ", reason=" + this.reason + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent2
        public Message getMessage() {
            return this.message;
        }

        public final Message.UpdateReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Updated(Message message, Message.UpdateReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.reason = reason;
        }
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/MessageEvent$Deleted;", "Lcom/robinhood/android/lib/conversations/MessageEvent;", "message", "Lcom/twilio/conversations/Message;", "<init>", "(Lcom/twilio/conversations/Message;)V", "getMessage", "()Lcom/twilio/conversations/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.MessageEvent$Deleted, reason: from toString */
    public static final /* data */ class Deleted extends ConversationEvent2 {
        private final Message message;

        public static /* synthetic */ Deleted copy$default(Deleted deleted, Message message, int i, Object obj) {
            if ((i & 1) != 0) {
                message = deleted.message;
            }
            return deleted.copy(message);
        }

        /* renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        public final Deleted copy(Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Deleted(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deleted) && Intrinsics.areEqual(this.message, ((Deleted) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Deleted(message=" + this.message + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent2
        public Message getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Deleted(Message message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }
    }
}
