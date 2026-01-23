package com.salesforce.android.smi.network.data.domain.conversation;

import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.participant.Participant;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditions;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: Conversation.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0014\u0010 \u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u0004\u0018\u00010#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "", "identifier", "Ljava/util/UUID;", "getIdentifier", "()Ljava/util/UUID;", "developerName", "", "getDeveloperName", "()Ljava/lang/String;", "participants", "", "Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "getParticipants", "()Ljava/util/List;", "createdAt", "", "getCreatedAt", "()Ljava/lang/Long;", "inboundHighWatermarkEntry", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getInboundHighWatermarkEntry", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "outboundHighWatermarkEntry", "getOutboundHighWatermarkEntry", "preChatFields", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "getPreChatFields", "activeParticipants", "getActiveParticipants", "lastActivity", "getLastActivity", "preChatSubmissionTimestamp", "getPreChatSubmissionTimestamp", "termsAndConditions", "Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "getTermsAndConditions", "()Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "unreadMessageCount", "", "getUnreadMessageCount", "()I", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Conversation {
    List<Participant> getActiveParticipants();

    Long getCreatedAt();

    String getDeveloperName();

    UUID getIdentifier();

    ConversationEntry getInboundHighWatermarkEntry();

    ConversationEntry getLastActivity();

    ConversationEntry getOutboundHighWatermarkEntry();

    List<Participant> getParticipants();

    List<PreChatField> getPreChatFields();

    Long getPreChatSubmissionTimestamp();

    TermsAndConditions getTermsAndConditions();

    int getUnreadMessageCount();
}
