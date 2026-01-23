package com.salesforce.android.smi.network.data.domain.conversation;

import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import com.salesforce.android.smi.network.data.domain.participant.Participant;
import com.salesforce.android.smi.network.data.domain.prechat.PreChatField;
import com.salesforce.android.smi.network.data.domain.prechat.termsAndConditions.TermsAndConditions;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreConversation.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u00109\u001a\u00020\u0017HÆ\u0003J¦\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0017HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\r\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006B"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversation/CoreConversation;", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "identifier", "Ljava/util/UUID;", "developerName", "", "participants", "", "Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "createdAt", "", "inboundHighWatermarkEntry", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "outboundHighWatermarkEntry", "preChatFields", "Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatField;", "activeParticipants", "Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "lastActivity", "preChatSubmissionTimestamp", "termsAndConditions", "Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "unreadMessageCount", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Ljava/util/List;Ljava/util/List;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Ljava/lang/Long;Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;I)V", "getIdentifier", "()Ljava/util/UUID;", "getDeveloperName", "()Ljava/lang/String;", "getParticipants", "()Ljava/util/List;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInboundHighWatermarkEntry", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "getOutboundHighWatermarkEntry", "getPreChatFields", "getActiveParticipants", "getLastActivity", "getPreChatSubmissionTimestamp", "getTermsAndConditions", "()Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;", "getUnreadMessageCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Ljava/util/List;Ljava/util/List;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Ljava/lang/Long;Lcom/salesforce/android/smi/network/data/domain/prechat/termsAndConditions/TermsAndConditions;I)Lcom/salesforce/android/smi/network/data/domain/conversation/CoreConversation;", "equals", "", "other", "", "hashCode", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CoreConversation implements Conversation {
    private final List<Participant> activeParticipants;
    private final Long createdAt;
    private final String developerName;
    private final UUID identifier;
    private final ConversationEntry inboundHighWatermarkEntry;
    private final ConversationEntry lastActivity;
    private final ConversationEntry outboundHighWatermarkEntry;
    private final List<CoreParticipant> participants;
    private final List<PreChatField> preChatFields;
    private final Long preChatSubmissionTimestamp;
    private final TermsAndConditions termsAndConditions;
    private final int unreadMessageCount;

    public static /* synthetic */ CoreConversation copy$default(CoreConversation coreConversation, UUID uuid, String str, List list, Long l, ConversationEntry conversationEntry, ConversationEntry conversationEntry2, List list2, List list3, ConversationEntry conversationEntry3, Long l2, TermsAndConditions termsAndConditions, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = coreConversation.identifier;
        }
        if ((i2 & 2) != 0) {
            str = coreConversation.developerName;
        }
        if ((i2 & 4) != 0) {
            list = coreConversation.participants;
        }
        if ((i2 & 8) != 0) {
            l = coreConversation.createdAt;
        }
        if ((i2 & 16) != 0) {
            conversationEntry = coreConversation.inboundHighWatermarkEntry;
        }
        if ((i2 & 32) != 0) {
            conversationEntry2 = coreConversation.outboundHighWatermarkEntry;
        }
        if ((i2 & 64) != 0) {
            list2 = coreConversation.preChatFields;
        }
        if ((i2 & 128) != 0) {
            list3 = coreConversation.activeParticipants;
        }
        if ((i2 & 256) != 0) {
            conversationEntry3 = coreConversation.lastActivity;
        }
        if ((i2 & 512) != 0) {
            l2 = coreConversation.preChatSubmissionTimestamp;
        }
        if ((i2 & 1024) != 0) {
            termsAndConditions = coreConversation.termsAndConditions;
        }
        if ((i2 & 2048) != 0) {
            i = coreConversation.unreadMessageCount;
        }
        TermsAndConditions termsAndConditions2 = termsAndConditions;
        int i3 = i;
        ConversationEntry conversationEntry4 = conversationEntry3;
        Long l3 = l2;
        List list4 = list2;
        List list5 = list3;
        ConversationEntry conversationEntry5 = conversationEntry;
        ConversationEntry conversationEntry6 = conversationEntry2;
        return coreConversation.copy(uuid, str, list, l, conversationEntry5, conversationEntry6, list4, list5, conversationEntry4, l3, termsAndConditions2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getPreChatSubmissionTimestamp() {
        return this.preChatSubmissionTimestamp;
    }

    /* renamed from: component11, reason: from getter */
    public final TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: component12, reason: from getter */
    public final int getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeveloperName() {
        return this.developerName;
    }

    public final List<CoreParticipant> component3() {
        return this.participants;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final ConversationEntry getInboundHighWatermarkEntry() {
        return this.inboundHighWatermarkEntry;
    }

    /* renamed from: component6, reason: from getter */
    public final ConversationEntry getOutboundHighWatermarkEntry() {
        return this.outboundHighWatermarkEntry;
    }

    public final List<PreChatField> component7() {
        return this.preChatFields;
    }

    public final List<Participant> component8() {
        return this.activeParticipants;
    }

    /* renamed from: component9, reason: from getter */
    public final ConversationEntry getLastActivity() {
        return this.lastActivity;
    }

    public final CoreConversation copy(UUID identifier, String developerName, List<CoreParticipant> participants, Long createdAt, ConversationEntry inboundHighWatermarkEntry, ConversationEntry outboundHighWatermarkEntry, List<? extends PreChatField> preChatFields, List<? extends Participant> activeParticipants, ConversationEntry lastActivity, Long preChatSubmissionTimestamp, TermsAndConditions termsAndConditions, int unreadMessageCount) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(participants, "participants");
        Intrinsics.checkNotNullParameter(activeParticipants, "activeParticipants");
        return new CoreConversation(identifier, developerName, participants, createdAt, inboundHighWatermarkEntry, outboundHighWatermarkEntry, preChatFields, activeParticipants, lastActivity, preChatSubmissionTimestamp, termsAndConditions, unreadMessageCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreConversation)) {
            return false;
        }
        CoreConversation coreConversation = (CoreConversation) other;
        return Intrinsics.areEqual(this.identifier, coreConversation.identifier) && Intrinsics.areEqual(this.developerName, coreConversation.developerName) && Intrinsics.areEqual(this.participants, coreConversation.participants) && Intrinsics.areEqual(this.createdAt, coreConversation.createdAt) && Intrinsics.areEqual(this.inboundHighWatermarkEntry, coreConversation.inboundHighWatermarkEntry) && Intrinsics.areEqual(this.outboundHighWatermarkEntry, coreConversation.outboundHighWatermarkEntry) && Intrinsics.areEqual(this.preChatFields, coreConversation.preChatFields) && Intrinsics.areEqual(this.activeParticipants, coreConversation.activeParticipants) && Intrinsics.areEqual(this.lastActivity, coreConversation.lastActivity) && Intrinsics.areEqual(this.preChatSubmissionTimestamp, coreConversation.preChatSubmissionTimestamp) && Intrinsics.areEqual(this.termsAndConditions, coreConversation.termsAndConditions) && this.unreadMessageCount == coreConversation.unreadMessageCount;
    }

    public int hashCode() {
        int iHashCode = ((((this.identifier.hashCode() * 31) + this.developerName.hashCode()) * 31) + this.participants.hashCode()) * 31;
        Long l = this.createdAt;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        ConversationEntry conversationEntry = this.inboundHighWatermarkEntry;
        int iHashCode3 = (iHashCode2 + (conversationEntry == null ? 0 : conversationEntry.hashCode())) * 31;
        ConversationEntry conversationEntry2 = this.outboundHighWatermarkEntry;
        int iHashCode4 = (iHashCode3 + (conversationEntry2 == null ? 0 : conversationEntry2.hashCode())) * 31;
        List<PreChatField> list = this.preChatFields;
        int iHashCode5 = (((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.activeParticipants.hashCode()) * 31;
        ConversationEntry conversationEntry3 = this.lastActivity;
        int iHashCode6 = (iHashCode5 + (conversationEntry3 == null ? 0 : conversationEntry3.hashCode())) * 31;
        Long l2 = this.preChatSubmissionTimestamp;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        TermsAndConditions termsAndConditions = this.termsAndConditions;
        return ((iHashCode7 + (termsAndConditions != null ? termsAndConditions.hashCode() : 0)) * 31) + Integer.hashCode(this.unreadMessageCount);
    }

    public String toString() {
        return "CoreConversation(identifier=" + this.identifier + ", developerName=" + this.developerName + ", participants=" + this.participants + ", createdAt=" + this.createdAt + ", inboundHighWatermarkEntry=" + this.inboundHighWatermarkEntry + ", outboundHighWatermarkEntry=" + this.outboundHighWatermarkEntry + ", preChatFields=" + this.preChatFields + ", activeParticipants=" + this.activeParticipants + ", lastActivity=" + this.lastActivity + ", preChatSubmissionTimestamp=" + this.preChatSubmissionTimestamp + ", termsAndConditions=" + this.termsAndConditions + ", unreadMessageCount=" + this.unreadMessageCount + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoreConversation(UUID identifier, String developerName, List<CoreParticipant> participants, Long l, ConversationEntry conversationEntry, ConversationEntry conversationEntry2, List<? extends PreChatField> list, List<? extends Participant> activeParticipants, ConversationEntry conversationEntry3, Long l2, TermsAndConditions termsAndConditions, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(participants, "participants");
        Intrinsics.checkNotNullParameter(activeParticipants, "activeParticipants");
        this.identifier = identifier;
        this.developerName = developerName;
        this.participants = participants;
        this.createdAt = l;
        this.inboundHighWatermarkEntry = conversationEntry;
        this.outboundHighWatermarkEntry = conversationEntry2;
        this.preChatFields = list;
        this.activeParticipants = activeParticipants;
        this.lastActivity = conversationEntry3;
        this.preChatSubmissionTimestamp = l2;
        this.termsAndConditions = termsAndConditions;
        this.unreadMessageCount = i;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public UUID getIdentifier() {
        return this.identifier;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public String getDeveloperName() {
        return this.developerName;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public List<CoreParticipant> getParticipants() {
        return this.participants;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public Long getCreatedAt() {
        return this.createdAt;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public ConversationEntry getInboundHighWatermarkEntry() {
        return this.inboundHighWatermarkEntry;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public ConversationEntry getOutboundHighWatermarkEntry() {
        return this.outboundHighWatermarkEntry;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public List<PreChatField> getPreChatFields() {
        return this.preChatFields;
    }

    public /* synthetic */ CoreConversation(UUID uuid, String str, List list, Long l, ConversationEntry conversationEntry, ConversationEntry conversationEntry2, List list2, List list3, ConversationEntry conversationEntry3, Long l2, TermsAndConditions termsAndConditions, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, list, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : conversationEntry, (i2 & 32) != 0 ? null : conversationEntry2, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 256) != 0 ? null : conversationEntry3, (i2 & 512) != 0 ? null : l2, (i2 & 1024) != 0 ? null : termsAndConditions, (i2 & 2048) != 0 ? 0 : i);
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public List<Participant> getActiveParticipants() {
        return this.activeParticipants;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public ConversationEntry getLastActivity() {
        return this.lastActivity;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public Long getPreChatSubmissionTimestamp() {
        return this.preChatSubmissionTimestamp;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversation.Conversation
    public int getUnreadMessageCount() {
        return this.unreadMessageCount;
    }
}
