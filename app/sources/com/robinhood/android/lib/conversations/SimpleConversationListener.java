package com.robinhood.android.lib.conversations;

import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationListener;
import com.twilio.conversations.Message;
import com.twilio.conversations.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleConversationListener.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/SimpleConversationListener;", "Lcom/twilio/conversations/ConversationListener;", "<init>", "()V", "onMessageAdded", "", "message", "Lcom/twilio/conversations/Message;", "onMessageUpdated", "reason", "Lcom/twilio/conversations/Message$UpdateReason;", "onMessageDeleted", "onParticipantAdded", "participant", "Lcom/twilio/conversations/Participant;", "onParticipantUpdated", "Lcom/twilio/conversations/Participant$UpdateReason;", "onParticipantDeleted", "onTypingStarted", "conversation", "Lcom/twilio/conversations/Conversation;", "onTypingEnded", "onSynchronizationChanged", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public class SimpleConversationListener implements ConversationListener {
    @Override // com.twilio.conversations.ConversationListener
    public void onMessageAdded(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onMessageDeleted(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onMessageUpdated(Message message, Message.UpdateReason reason) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onParticipantAdded(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onParticipantDeleted(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onParticipantUpdated(Participant participant, Participant.UpdateReason reason) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onSynchronizationChanged(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onTypingEnded(Conversation conversation, Participant participant) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(participant, "participant");
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onTypingStarted(Conversation conversation, Participant participant) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(participant, "participant");
    }
}
