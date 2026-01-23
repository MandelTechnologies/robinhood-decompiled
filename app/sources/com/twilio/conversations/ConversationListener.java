package com.twilio.conversations;

import com.twilio.conversations.Message;
import com.twilio.conversations.Participant;

/* loaded from: classes12.dex */
public interface ConversationListener {
    void onMessageAdded(Message message);

    void onMessageDeleted(Message message);

    void onMessageUpdated(Message message, Message.UpdateReason updateReason);

    void onParticipantAdded(Participant participant);

    void onParticipantDeleted(Participant participant);

    void onParticipantUpdated(Participant participant, Participant.UpdateReason updateReason);

    void onSynchronizationChanged(Conversation conversation);

    void onTypingEnded(Conversation conversation, Participant participant);

    void onTypingStarted(Conversation conversation, Participant participant);
}
