package com.robinhood.android.lib.conversations;

import com.twilio.conversations.Conversation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationEvent;", "", "<init>", "()V", "None", "SynchronizationChanged", "Lcom/robinhood/android/lib/conversations/ConversationEvent$None;", "Lcom/robinhood/android/lib/conversations/ConversationEvent$SynchronizationChanged;", "Lcom/robinhood/android/lib/conversations/MessageEvent;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ConversationEvent {
    public /* synthetic */ ConversationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationEvent() {
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationEvent$None;", "Lcom/robinhood/android/lib/conversations/ConversationEvent;", "<init>", "()V", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class None extends ConversationEvent {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationEvent$SynchronizationChanged;", "Lcom/robinhood/android/lib/conversations/ConversationEvent;", "conversation", "Lcom/twilio/conversations/Conversation;", "<init>", "(Lcom/twilio/conversations/Conversation;)V", "getConversation", "()Lcom/twilio/conversations/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SynchronizationChanged extends ConversationEvent {
        private final Conversation conversation;

        public static /* synthetic */ SynchronizationChanged copy$default(SynchronizationChanged synchronizationChanged, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversation = synchronizationChanged.conversation;
            }
            return synchronizationChanged.copy(conversation);
        }

        /* renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        public final SynchronizationChanged copy(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new SynchronizationChanged(conversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SynchronizationChanged) && Intrinsics.areEqual(this.conversation, ((SynchronizationChanged) other).conversation);
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "SynchronizationChanged(conversation=" + this.conversation + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SynchronizationChanged(Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.conversation = conversation;
        }

        public final Conversation getConversation() {
            return this.conversation;
        }
    }
}
