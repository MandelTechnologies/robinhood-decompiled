package com.robinhood.store.supportchat;

import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.store.supportchat.AgentChatEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: AgentChatSession.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b\u0006\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/store/supportchat/AgentChatSession;", "", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "isTyping", "", "cursor", "lastAgentReadMessageIndex", "j$/time/Instant", "lastAgentReadMessageTimestamp", "<init>", "(Ljava/util/List;ZLjava/lang/Long;Ljava/lang/Long;Lj$/time/Instant;)V", "getLastMessageCursor", "(Ljava/util/List;)Ljava/lang/Long;", "Lcom/robinhood/store/supportchat/AgentChatEvent;", "event", "accept$lib_store_support_chat_externalRelease", "(Lcom/robinhood/store/supportchat/AgentChatEvent;)Lcom/robinhood/store/supportchat/AgentChatSession;", "accept", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/Long;", "component4", "component5", "()Lj$/time/Instant;", "copy", "(Ljava/util/List;ZLjava/lang/Long;Ljava/lang/Long;Lj$/time/Instant;)Lcom/robinhood/store/supportchat/AgentChatSession;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "Z", "Ljava/lang/Long;", "getCursor", "getLastAgentReadMessageIndex", "Lj$/time/Instant;", "getLastAgentReadMessageTimestamp", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class AgentChatSession {
    private final Long cursor;
    private final boolean isTyping;
    private final Long lastAgentReadMessageIndex;
    private final Instant lastAgentReadMessageTimestamp;
    private final List<SocketChatMessage> messages;

    public AgentChatSession() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ AgentChatSession copy$default(AgentChatSession agentChatSession, List list, boolean z, Long l, Long l2, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            list = agentChatSession.messages;
        }
        if ((i & 2) != 0) {
            z = agentChatSession.isTyping;
        }
        if ((i & 4) != 0) {
            l = agentChatSession.cursor;
        }
        if ((i & 8) != 0) {
            l2 = agentChatSession.lastAgentReadMessageIndex;
        }
        if ((i & 16) != 0) {
            instant = agentChatSession.lastAgentReadMessageTimestamp;
        }
        Instant instant2 = instant;
        Long l3 = l;
        return agentChatSession.copy(list, z, l3, l2, instant2);
    }

    public final List<SocketChatMessage> component1() {
        return this.messages;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTyping() {
        return this.isTyping;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getCursor() {
        return this.cursor;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getLastAgentReadMessageIndex() {
        return this.lastAgentReadMessageIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getLastAgentReadMessageTimestamp() {
        return this.lastAgentReadMessageTimestamp;
    }

    public final AgentChatSession copy(List<SocketChatMessage> messages, boolean isTyping, Long cursor, Long lastAgentReadMessageIndex, Instant lastAgentReadMessageTimestamp) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new AgentChatSession(messages, isTyping, cursor, lastAgentReadMessageIndex, lastAgentReadMessageTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentChatSession)) {
            return false;
        }
        AgentChatSession agentChatSession = (AgentChatSession) other;
        return Intrinsics.areEqual(this.messages, agentChatSession.messages) && this.isTyping == agentChatSession.isTyping && Intrinsics.areEqual(this.cursor, agentChatSession.cursor) && Intrinsics.areEqual(this.lastAgentReadMessageIndex, agentChatSession.lastAgentReadMessageIndex) && Intrinsics.areEqual(this.lastAgentReadMessageTimestamp, agentChatSession.lastAgentReadMessageTimestamp);
    }

    public int hashCode() {
        int iHashCode = ((this.messages.hashCode() * 31) + Boolean.hashCode(this.isTyping)) * 31;
        Long l = this.cursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.lastAgentReadMessageIndex;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Instant instant = this.lastAgentReadMessageTimestamp;
        return iHashCode3 + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "AgentChatSession(messages=" + this.messages + ", isTyping=" + this.isTyping + ", cursor=" + this.cursor + ", lastAgentReadMessageIndex=" + this.lastAgentReadMessageIndex + ", lastAgentReadMessageTimestamp=" + this.lastAgentReadMessageTimestamp + ")";
    }

    public AgentChatSession(List<SocketChatMessage> messages, boolean z, Long l, Long l2, Instant instant) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
        this.isTyping = z;
        this.cursor = l;
        this.lastAgentReadMessageIndex = l2;
        this.lastAgentReadMessageTimestamp = instant;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AgentChatSession(java.util.List r2, boolean r3, java.lang.Long r4, java.lang.Long r5, p479j$.time.Instant r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r8 = r7 & 2
            if (r8 == 0) goto Ld
            r3 = 0
        Ld:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L13
            r4 = r0
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            r5 = r0
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L23
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L29
        L23:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L29:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.store.supportchat.AgentChatSession.<init>(java.util.List, boolean, java.lang.Long, java.lang.Long, j$.time.Instant, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<SocketChatMessage> getMessages() {
        return this.messages;
    }

    public final boolean isTyping() {
        return this.isTyping;
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Long getLastAgentReadMessageIndex() {
        return this.lastAgentReadMessageIndex;
    }

    public final Instant getLastAgentReadMessageTimestamp() {
        return this.lastAgentReadMessageTimestamp;
    }

    public final AgentChatSession accept$lib_store_support_chat_externalRelease(AgentChatEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AgentChatEvent.Message) {
            List<SocketChatMessage> orderedMessages = ((AgentChatEvent.Message) event).getOrderedMessages();
            return copy$default(this, orderedMessages, false, getLastMessageCursor(orderedMessages), null, null, 26, null);
        }
        if (event instanceof AgentChatEvent.Typing) {
            return copy$default(this, null, ((AgentChatEvent.Typing) event).isTyping(), null, null, null, 29, null);
        }
        if (!(event instanceof AgentChatEvent.LastAgentReadMessageData)) {
            throw new NoWhenBranchMatchedException();
        }
        AgentChatEvent.LastAgentReadMessageData lastAgentReadMessageData = (AgentChatEvent.LastAgentReadMessageData) event;
        return copy$default(this, null, false, null, Long.valueOf(lastAgentReadMessageData.getLastAgentReadMessageIndex()), lastAgentReadMessageData.getLastAgentReadMessageTimestamp(), 7, null);
    }

    private final Long getLastMessageCursor(List<SocketChatMessage> list) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        long jMin = Long.MAX_VALUE;
        while (it.hasNext()) {
            jMin = Math.min(jMin, ((SocketChatMessage) it.next()).getIndex());
        }
        if (jMin == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(jMin);
    }
}
