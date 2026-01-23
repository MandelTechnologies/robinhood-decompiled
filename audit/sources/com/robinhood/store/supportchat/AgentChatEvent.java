package com.robinhood.store.supportchat;

import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: AgentChatEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/store/supportchat/AgentChatEvent;", "", "Message", "Typing", "LastAgentReadMessageData", "Lcom/robinhood/store/supportchat/AgentChatEvent$LastAgentReadMessageData;", "Lcom/robinhood/store/supportchat/AgentChatEvent$Message;", "Lcom/robinhood/store/supportchat/AgentChatEvent$Typing;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AgentChatEvent {

    /* compiled from: AgentChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/supportchat/AgentChatEvent$Message;", "Lcom/robinhood/store/supportchat/AgentChatEvent;", "orderedMessages", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "<init>", "(Ljava/util/List;)V", "getOrderedMessages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Message implements AgentChatEvent {
        private final List<SocketChatMessage> orderedMessages;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Message copy$default(Message message, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = message.orderedMessages;
            }
            return message.copy(list);
        }

        public final List<SocketChatMessage> component1() {
            return this.orderedMessages;
        }

        public final Message copy(List<SocketChatMessage> orderedMessages) {
            Intrinsics.checkNotNullParameter(orderedMessages, "orderedMessages");
            return new Message(orderedMessages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Message) && Intrinsics.areEqual(this.orderedMessages, ((Message) other).orderedMessages);
        }

        public int hashCode() {
            return this.orderedMessages.hashCode();
        }

        public String toString() {
            return "Message(orderedMessages=" + this.orderedMessages + ")";
        }

        public Message(List<SocketChatMessage> orderedMessages) {
            Intrinsics.checkNotNullParameter(orderedMessages, "orderedMessages");
            this.orderedMessages = orderedMessages;
        }

        public final List<SocketChatMessage> getOrderedMessages() {
            return this.orderedMessages;
        }
    }

    /* compiled from: AgentChatEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/supportchat/AgentChatEvent$Typing;", "Lcom/robinhood/store/supportchat/AgentChatEvent;", "isTyping", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typing implements AgentChatEvent {
        private final boolean isTyping;

        public static /* synthetic */ Typing copy$default(Typing typing, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = typing.isTyping;
            }
            return typing.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTyping() {
            return this.isTyping;
        }

        public final Typing copy(boolean isTyping) {
            return new Typing(isTyping);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Typing) && this.isTyping == ((Typing) other).isTyping;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTyping);
        }

        public String toString() {
            return "Typing(isTyping=" + this.isTyping + ")";
        }

        public Typing(boolean z) {
            this.isTyping = z;
        }

        public final boolean isTyping() {
            return this.isTyping;
        }
    }

    /* compiled from: AgentChatEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/supportchat/AgentChatEvent$LastAgentReadMessageData;", "Lcom/robinhood/store/supportchat/AgentChatEvent;", "", "lastAgentReadMessageIndex", "j$/time/Instant", "lastAgentReadMessageTimestamp", "<init>", "(JLj$/time/Instant;)V", "component1", "()J", "component2", "()Lj$/time/Instant;", "copy", "(JLj$/time/Instant;)Lcom/robinhood/store/supportchat/AgentChatEvent$LastAgentReadMessageData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getLastAgentReadMessageIndex", "Lj$/time/Instant;", "getLastAgentReadMessageTimestamp", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LastAgentReadMessageData implements AgentChatEvent {
        private final long lastAgentReadMessageIndex;
        private final Instant lastAgentReadMessageTimestamp;

        public static /* synthetic */ LastAgentReadMessageData copy$default(LastAgentReadMessageData lastAgentReadMessageData, long j, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                j = lastAgentReadMessageData.lastAgentReadMessageIndex;
            }
            if ((i & 2) != 0) {
                instant = lastAgentReadMessageData.lastAgentReadMessageTimestamp;
            }
            return lastAgentReadMessageData.copy(j, instant);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLastAgentReadMessageIndex() {
            return this.lastAgentReadMessageIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getLastAgentReadMessageTimestamp() {
            return this.lastAgentReadMessageTimestamp;
        }

        public final LastAgentReadMessageData copy(long lastAgentReadMessageIndex, Instant lastAgentReadMessageTimestamp) {
            Intrinsics.checkNotNullParameter(lastAgentReadMessageTimestamp, "lastAgentReadMessageTimestamp");
            return new LastAgentReadMessageData(lastAgentReadMessageIndex, lastAgentReadMessageTimestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastAgentReadMessageData)) {
                return false;
            }
            LastAgentReadMessageData lastAgentReadMessageData = (LastAgentReadMessageData) other;
            return this.lastAgentReadMessageIndex == lastAgentReadMessageData.lastAgentReadMessageIndex && Intrinsics.areEqual(this.lastAgentReadMessageTimestamp, lastAgentReadMessageData.lastAgentReadMessageTimestamp);
        }

        public int hashCode() {
            return (Long.hashCode(this.lastAgentReadMessageIndex) * 31) + this.lastAgentReadMessageTimestamp.hashCode();
        }

        public String toString() {
            return "LastAgentReadMessageData(lastAgentReadMessageIndex=" + this.lastAgentReadMessageIndex + ", lastAgentReadMessageTimestamp=" + this.lastAgentReadMessageTimestamp + ")";
        }

        public LastAgentReadMessageData(long j, Instant lastAgentReadMessageTimestamp) {
            Intrinsics.checkNotNullParameter(lastAgentReadMessageTimestamp, "lastAgentReadMessageTimestamp");
            this.lastAgentReadMessageIndex = j;
            this.lastAgentReadMessageTimestamp = lastAgentReadMessageTimestamp;
        }

        public final long getLastAgentReadMessageIndex() {
            return this.lastAgentReadMessageIndex;
        }

        public final Instant getLastAgentReadMessageTimestamp() {
            return this.lastAgentReadMessageTimestamp;
        }
    }
}
