package com.twilio.conversations;

import android.os.Handler;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.Message;
import com.twilio.conversations.Messages.MessageBuilderImpl;
import com.twilio.conversations.Participant;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.internal.DateUtils;
import com.twilio.conversations.internal.HandlerUtil;
import com.twilio.conversations.internal.RethrowingForwarder;
import com.twilio.conversations.internal.StatusListenerForwarder;
import com.twilio.util.TwilioLogger;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmClassMapping;
import kotlin.reflect.KClass;
import org.json.JSONException;

/* loaded from: classes12.dex */
final class ConversationImpl implements Conversation, Disposable {
    private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(ConversationImpl.class));
    private boolean isDisposed = false;
    private ConversationListenerForwarder listenerForwarder = new ConversationListenerForwarder();
    protected long nativeHandle;

    private native void nativeDestroy(StatusListener statusListener);

    private native void nativeDispose();

    private native String nativeGetAttributes();

    private native ConversationLimits nativeGetConversationLimits();

    private native String nativeGetLastMessageDate();

    private native Participants nativeGetMembers();

    private native void nativeGetMembersCount(CallbackListener<Long> callbackListener);

    private native Messages nativeGetMessages();

    private native void nativeGetMessagesCount(CallbackListener<Long> callbackListener);

    private native void nativeGetUnconsumedMessagesCount(CallbackListener<Long> callbackListener);

    private native void nativeJoin(StatusListener statusListener);

    private native void nativeLeave(StatusListener statusListener);

    private native void nativeSetAttributes(String str, StatusListener statusListener);

    private native void nativeSetFriendlyName(String str, StatusListener statusListener);

    private native void nativeSetNotificationLevel(Conversation.NotificationLevel notificationLevel, StatusListener statusListener);

    private native void nativeSetUniqueName(String str, StatusListener statusListener);

    @Override // com.twilio.conversations.Conversation
    public native String getCreatedBy();

    @Override // com.twilio.conversations.Conversation
    public native String getDateCreated();

    @Override // com.twilio.conversations.Conversation
    public native String getDateUpdated();

    @Override // com.twilio.conversations.Conversation
    public native String getFriendlyName();

    @Override // com.twilio.conversations.Conversation
    public native Long getLastMessageIndex();

    @Override // com.twilio.conversations.Conversation
    public native Conversation.NotificationLevel getNotificationLevel();

    @Override // com.twilio.conversations.Conversation
    public native String getSid();

    @Override // com.twilio.conversations.Conversation
    public native Conversation.ConversationState getState();

    @Override // com.twilio.conversations.Conversation
    public native Date getStateDateUpdatedAsDate();

    @Override // com.twilio.conversations.Conversation
    public native Conversation.ConversationStatus getStatus();

    @Override // com.twilio.conversations.Conversation
    public native Conversation.SynchronizationStatus getSynchronizationStatus();

    @Override // com.twilio.conversations.Conversation
    public native String getUniqueName();

    @Override // com.twilio.conversations.Conversation
    public native void typing();

    protected ConversationImpl(long j) {
        this.nativeHandle = j;
    }

    @Override // com.twilio.conversations.Conversation
    public void setFriendlyName(String str, StatusListener statusListener) {
        checkDisposed("setFriendlyName");
        nativeSetFriendlyName(str, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void setNotificationLevel(Conversation.NotificationLevel notificationLevel, StatusListener statusListener) {
        checkDisposed("setNotificationLevel");
        nativeSetNotificationLevel(notificationLevel, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public ConversationLimits getLimits() {
        checkDisposed("getConversationLimits");
        return nativeGetConversationLimits();
    }

    @Override // com.twilio.conversations.Conversation
    public void setUniqueName(String str, StatusListener statusListener) {
        checkDisposed("setUniqueName");
        nativeSetUniqueName(str, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public Attributes getAttributes() {
        checkDisposed("getAttributes");
        try {
            return Attributes.parse(nativeGetAttributes());
        } catch (JSONException e) {
            logger.m3192e("Unable to parse conversation attributes", e);
            return Attributes.DEFAULT;
        }
    }

    @Override // com.twilio.conversations.Conversation
    public void setAttributes(Attributes attributes, StatusListener statusListener) {
        checkDisposed("setAttributes");
        nativeSetAttributes(attributes.toString(), new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void addListener(ConversationListener conversationListener) {
        checkDisposed("addListener");
        if (conversationListener == null) {
            return;
        }
        this.listenerForwarder.addListener(getSid(), conversationListener, HandlerUtil.setupListenerHandler());
        ((ConversationListener) RethrowingForwarder.create(conversationListener, ListenerException.class)).onSynchronizationChanged(this);
    }

    @Override // com.twilio.conversations.Conversation
    public void removeListener(ConversationListener conversationListener) {
        checkDisposed("removeListener");
        this.listenerForwarder.removeListener(getSid(), conversationListener);
    }

    @Override // com.twilio.conversations.Conversation
    public void removeAllListeners() {
        checkDisposed("removeAllListeners");
        this.listenerForwarder.removeAllListeners(getSid());
    }

    @Override // com.twilio.conversations.Conversation
    public void join(StatusListener statusListener) {
        checkDisposed("join");
        nativeJoin(new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void leave(StatusListener statusListener) {
        checkDisposed("leave");
        nativeLeave(new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void destroy(StatusListener statusListener) {
        checkDisposed("destroy");
        nativeDestroy(new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public Date getDateCreatedAsDate() {
        checkDisposed("getDateCreatedAsDate");
        return DateUtils.parseIso8601DateTime(getDateCreated());
    }

    @Override // com.twilio.conversations.Conversation
    public Date getDateUpdatedAsDate() {
        checkDisposed("getDateUpdatedAsDate");
        return DateUtils.parseIso8601DateTime(getDateUpdated());
    }

    @Override // com.twilio.conversations.Conversation
    public Date getLastMessageDate() {
        checkDisposed("getLastMessageDate");
        String strNativeGetLastMessageDate = nativeGetLastMessageDate();
        if (strNativeGetLastMessageDate == null) {
            return null;
        }
        return DateUtils.parseIso8601DateTime(strNativeGetLastMessageDate);
    }

    @Override // com.twilio.conversations.Conversation
    public void getMessagesCount(CallbackListener<Long> callbackListener) {
        checkDisposed("getMessagesCount");
        nativeGetMessagesCount(new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void getUnreadMessagesCount(CallbackListener<Long> callbackListener) {
        checkDisposed("getUnreadMessagesCount");
        nativeGetUnconsumedMessagesCount(new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void getParticipantsCount(CallbackListener<Long> callbackListener) {
        checkDisposed("getParticipantsCount");
        nativeGetMembersCount(new CallbackListenerForwarder(callbackListener));
    }

    private Messages getMessages() {
        Messages messagesNativeGetMessages = nativeGetMessages();
        if (messagesNativeGetMessages != null) {
            return messagesNativeGetMessages;
        }
        throw new IllegalStateException("Messages are not available at the moment. Synchronize the conversation first.");
    }

    @Override // com.twilio.conversations.Conversation
    public Conversation.MessageBuilder prepareMessage() {
        checkDisposed("prepareMessage");
        Messages messages = getMessages();
        Objects.requireNonNull(messages);
        return messages.new MessageBuilderImpl();
    }

    @Override // com.twilio.conversations.Conversation
    public void removeMessage(Message message, StatusListener statusListener) {
        checkDisposed("removeMessage");
        getMessages().nativeRemoveMessage(message, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public Long getLastReadMessageIndex() {
        checkDisposed("getLastReadMessageIndex");
        return getMessages().nativeGetLastConsumedMessageIndex();
    }

    @Override // com.twilio.conversations.Conversation
    public void setLastReadMessageIndex(long j, CallbackListener<Long> callbackListener) {
        checkDisposed("setLastReadMessageIndex");
        getMessages().nativeSetLastConsumedMessageIndexWithResult(j, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void advanceLastReadMessageIndex(long j, CallbackListener<Long> callbackListener) {
        checkDisposed("advanceLastReadMessageIndex");
        getMessages().nativeAdvanceLastConsumedMessageIndexWithResult(j, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void setAllMessagesRead(CallbackListener<Long> callbackListener) {
        checkDisposed("setAllMessagesRead");
        getMessages().nativeSetAllMessagesConsumedWithResult(new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void setAllMessagesUnread(CallbackListener<Long> callbackListener) {
        checkDisposed("setAllMessagesUnread");
        getMessages().nativeSetNoMessagesConsumedWithResult(new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void getMessagesBefore(long j, int i, CallbackListener<List<Message>> callbackListener) {
        checkDisposed("getMessagesBefore");
        getMessages().nativeGetMessagesBefore(j, i, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void getMessagesAfter(long j, int i, CallbackListener<List<Message>> callbackListener) {
        checkDisposed("getMessagesAfter");
        getMessages().nativeGetMessagesAfter(j, i, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void getLastMessages(int i, CallbackListener<List<Message>> callbackListener) {
        checkDisposed("getLastMessages");
        getMessages().nativeGetLastMessages(i, new CallbackListenerForwarder(callbackListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void getMessageByIndex(long j, CallbackListener<Message> callbackListener) {
        checkDisposed("getMessageByIndex");
        getMessages().nativeGetMessageByIndex(j, new CallbackListenerForwarder(callbackListener));
    }

    private Participants getParticipants() {
        Participants participantsNativeGetMembers = nativeGetMembers();
        if (participantsNativeGetMembers != null) {
            return participantsNativeGetMembers;
        }
        throw new IllegalStateException("Participants are not available at the moment. Synchronize the conversation first.");
    }

    @Override // com.twilio.conversations.Conversation
    public List<Participant> getParticipantsList() {
        return getParticipants().nativeGetMembersList();
    }

    @Override // com.twilio.conversations.Conversation
    public Participant getParticipantByIdentity(String str) {
        return getParticipants().nativeGetMember(str);
    }

    @Override // com.twilio.conversations.Conversation
    public Participant getParticipantBySid(String str) {
        return getParticipants().nativeGetMemberBySid(str);
    }

    @Override // com.twilio.conversations.Conversation
    public void addParticipantByIdentity(String str, Attributes attributes, StatusListener statusListener) {
        checkDisposed("addParticipantByIdentity");
        if (attributes == null) {
            attributes = Attributes.DEFAULT;
        }
        getParticipants().nativeAddByIdentity(str, attributes.toString(), new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void addParticipantByAddress(String str, String str2, Attributes attributes, StatusListener statusListener) {
        checkDisposed("addParticipantByAddress");
        if (attributes == null) {
            attributes = Attributes.DEFAULT;
        }
        getParticipants().nativeAddByAddress(str, str2, attributes.toString(), new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void removeParticipant(Participant participant, StatusListener statusListener) {
        checkDisposed("removeParticipant");
        getParticipants().nativeRemove(participant, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Conversation
    public void removeParticipantByIdentity(String str, StatusListener statusListener) {
        checkDisposed("removeParticipantByIdentity");
        getParticipants().nativeRemoveByIdentity(str, new StatusListenerForwarder(statusListener));
    }

    @Override // com.twilio.conversations.Disposable
    public void dispose() {
        synchronized (this) {
            try {
                checkDisposed("dispose");
                if (!this.isDisposed) {
                    nativeDispose();
                }
                this.nativeHandle = 0L;
                this.isDisposed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void checkDisposed(String str) {
        if (this.isDisposed) {
            logger.m3191e("Attempt to use disposed object in Conversation#" + str);
        }
    }

    private static class ConversationListenerForwarder implements ConversationListener {
        private static final TwilioLogger logger = TwilioLogger.getLogger((KClass<?>) JvmClassMapping.getKotlinClass(ConversationListenerForwarder.class));
        private Map<String, Map<ConversationListener, Handler>> conversationListenerMap;

        private ConversationListenerForwarder() {
            this.conversationListenerMap = new HashMap();
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onMessageAdded(final Message message) {
            Map<ConversationListener, Handler> map;
            if (message == null) {
                logger.m3191e("onMessageAdded called with null message - this shouldn't happen");
                return;
            }
            Conversation conversation = message.getConversation();
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onMessageAdded conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onMessageAdded conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onMessageAdded conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onMessageAdded handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onMessageAdded calling listener");
                                        key.onMessageAdded(message);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onMessageUpdated(final Message message, final Message.UpdateReason updateReason) {
            Map<ConversationListener, Handler> map;
            if (message == null) {
                logger.m3191e("onMessageUpdated called with null message - this shouldn't happen");
                return;
            }
            Conversation conversation = message.getConversation();
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onMessageUpdated conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onMessageUpdated conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onMessageUpdated conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onMessageUpdated handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onMessageUpdated calling listener");
                                        key.onMessageUpdated(message, updateReason);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onMessageDeleted(final Message message) {
            Map<ConversationListener, Handler> map;
            if (message == null) {
                logger.m3191e("onMessageDeleted called with null message - this shouldn't happen");
                return;
            }
            Conversation conversation = message.getConversation();
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onMessageDeleted conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onMessageDeleted conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onMessageDeleted conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onMessageDeleted handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onMessageDeleted calling listener");
                                        key.onMessageDeleted(message);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onParticipantAdded(final Participant participant) {
            Map<ConversationListener, Handler> map;
            if (participant == null) {
                logger.m3191e("onParticipantAdded called with null participant - this shouldn't happen");
                return;
            }
            Conversation conversation = participant.getConversation();
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onParticipantAdded conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onParticipantAdded conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onParticipantAdded conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onParticipantAdded handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onParticipantAdded calling listener");
                                        key.onParticipantAdded(participant);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onParticipantUpdated(final Participant participant, final Participant.UpdateReason updateReason) {
            Map<ConversationListener, Handler> map;
            if (participant == null) {
                logger.m3191e("onParticipantUpdated called with null participant - this shouldn't happen");
                return;
            }
            Conversation conversation = participant.getConversation();
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onParticipantUpdated conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onParticipantUpdated conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onParticipantUpdated conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onParticipantUpdated handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onParticipantUpdated calling listener");
                                        key.onParticipantUpdated(participant, updateReason);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onParticipantDeleted(final Participant participant) {
            Map<ConversationListener, Handler> map;
            if (participant == null) {
                logger.m3191e("onParticipantDeleted called with null participant - this shouldn't happen");
                return;
            }
            Conversation conversation = participant.getConversation();
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onParticipantDeleted conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onParticipantDeleted conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onParticipantDeleted conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onParticipantDeleted handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.6
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onParticipantDeleted calling listener");
                                        key.onParticipantDeleted(participant);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onTypingStarted(final Conversation conversation, final Participant participant) {
            Map<ConversationListener, Handler> map;
            if (participant == null) {
                logger.m3191e("onTypingStarted called with null participant - this shouldn't happen");
                return;
            }
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onTypingStarted conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onTypingStarted conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onTypingStarted conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onTypingStarted handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.7
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onTypingStarted calling listener");
                                        key.onTypingStarted(conversation, participant);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onTypingEnded(final Conversation conversation, final Participant participant) {
            Map<ConversationListener, Handler> map;
            if (participant == null) {
                logger.m3191e("onTypingEnded called with null participant - this shouldn't happen");
                return;
            }
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onTypingEnded conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onTypingEnded conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onTypingEnded conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onTypingEnded handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onTypingEnded calling listener");
                                        key.onTypingEnded(conversation, participant);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onSynchronizationChanged(final Conversation conversation) {
            Map<ConversationListener, Handler> map;
            TwilioLogger twilioLogger = logger;
            twilioLogger.m3188d("onSynchronizationChanged conversation " + conversation.getSid() + "|" + conversation.hashCode());
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(conversation.getSid());
            }
            if (map == null) {
                return;
            }
            synchronized (map) {
                try {
                    twilioLogger.m3188d("onSynchronizationChanged conversation listeners " + map.toString());
                    for (Map.Entry<ConversationListener, Handler> entry : map.entrySet()) {
                        final ConversationListener key = entry.getKey();
                        TwilioLogger twilioLogger2 = logger;
                        twilioLogger2.m3188d("onSynchronizationChanged conversation listener " + key.hashCode());
                        Handler value = entry.getValue();
                        if (value != null) {
                            twilioLogger2.m3188d("onSynchronizationChanged handler not null.");
                            value.post(new Runnable() { // from class: com.twilio.conversations.ConversationImpl.ConversationListenerForwarder.9
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (key != null) {
                                        ConversationListenerForwarder.logger.m3188d("onSynchronizationChanged calling listener");
                                        key.onSynchronizationChanged(conversation);
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void addListener(String str, ConversationListener conversationListener, Handler handler) {
            Map<ConversationListener, Handler> map;
            ConversationListener conversationListener2 = (ConversationListener) RethrowingForwarder.create(conversationListener, ListenerException.class);
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(str);
            }
            if (map != null) {
                synchronized (map) {
                    map.put(conversationListener2, handler);
                }
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(conversationListener2, handler);
            synchronized (this.conversationListenerMap) {
                this.conversationListenerMap.put(str, map2);
            }
        }

        void removeListener(String str, ConversationListener conversationListener) {
            Map<ConversationListener, Handler> map;
            synchronized (this.conversationListenerMap) {
                map = this.conversationListenerMap.get(str);
            }
            if (map != null) {
                ConversationListener conversationListener2 = (ConversationListener) RethrowingForwarder.create(conversationListener, ListenerException.class);
                synchronized (map) {
                    map.remove(conversationListener2);
                }
            }
        }

        void removeAllListeners(String str) {
            synchronized (this.conversationListenerMap) {
                this.conversationListenerMap.remove(str);
            }
        }
    }
}
