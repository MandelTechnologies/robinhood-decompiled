package com.robinhood.store.supportchat;

import com.robinhood.models.p355ui.p356v2.ChatbotSession;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatSession.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/store/supportchat/SupportChatSession;", "", "inquiryId", "Ljava/util/UUID;", "chatbotSession", "Lcom/robinhood/models/ui/v2/ChatbotSession;", "agentChatSession", "Lcom/robinhood/store/supportchat/AgentChatSession;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/v2/ChatbotSession;Lcom/robinhood/store/supportchat/AgentChatSession;)V", "getInquiryId", "()Ljava/util/UUID;", "getChatbotSession", "()Lcom/robinhood/models/ui/v2/ChatbotSession;", "getAgentChatSession", "()Lcom/robinhood/store/supportchat/AgentChatSession;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SupportChatSession {
    private final AgentChatSession agentChatSession;
    private final ChatbotSession chatbotSession;
    private final UUID inquiryId;

    public static /* synthetic */ SupportChatSession copy$default(SupportChatSession supportChatSession, UUID uuid, ChatbotSession chatbotSession, AgentChatSession agentChatSession, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = supportChatSession.inquiryId;
        }
        if ((i & 2) != 0) {
            chatbotSession = supportChatSession.chatbotSession;
        }
        if ((i & 4) != 0) {
            agentChatSession = supportChatSession.agentChatSession;
        }
        return supportChatSession.copy(uuid, chatbotSession, agentChatSession);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component2, reason: from getter */
    public final ChatbotSession getChatbotSession() {
        return this.chatbotSession;
    }

    /* renamed from: component3, reason: from getter */
    public final AgentChatSession getAgentChatSession() {
        return this.agentChatSession;
    }

    public final SupportChatSession copy(UUID inquiryId, ChatbotSession chatbotSession, AgentChatSession agentChatSession) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        return new SupportChatSession(inquiryId, chatbotSession, agentChatSession);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportChatSession)) {
            return false;
        }
        SupportChatSession supportChatSession = (SupportChatSession) other;
        return Intrinsics.areEqual(this.inquiryId, supportChatSession.inquiryId) && Intrinsics.areEqual(this.chatbotSession, supportChatSession.chatbotSession) && Intrinsics.areEqual(this.agentChatSession, supportChatSession.agentChatSession);
    }

    public int hashCode() {
        int iHashCode = this.inquiryId.hashCode() * 31;
        ChatbotSession chatbotSession = this.chatbotSession;
        int iHashCode2 = (iHashCode + (chatbotSession == null ? 0 : chatbotSession.hashCode())) * 31;
        AgentChatSession agentChatSession = this.agentChatSession;
        return iHashCode2 + (agentChatSession != null ? agentChatSession.hashCode() : 0);
    }

    public String toString() {
        return "SupportChatSession(inquiryId=" + this.inquiryId + ", chatbotSession=" + this.chatbotSession + ", agentChatSession=" + this.agentChatSession + ")";
    }

    public SupportChatSession(UUID inquiryId, ChatbotSession chatbotSession, AgentChatSession agentChatSession) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        this.inquiryId = inquiryId;
        this.chatbotSession = chatbotSession;
        this.agentChatSession = agentChatSession;
    }

    public /* synthetic */ SupportChatSession(UUID uuid, ChatbotSession chatbotSession, AgentChatSession agentChatSession, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : chatbotSession, (i & 4) != 0 ? null : agentChatSession);
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final ChatbotSession getChatbotSession() {
        return this.chatbotSession;
    }

    public final AgentChatSession getAgentChatSession() {
        return this.agentChatSession;
    }
}
