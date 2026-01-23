package com.salesforce.android.smi.network.data.domain.conversationEntry;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.NetworkError;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import com.salesforce.android.smi.network.data.domain.participant.Participant;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreConversationEntry.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jv\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006A"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "senderDisplayName", "", "conversationId", "Ljava/util/UUID;", "sender", "Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "payload", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "identifier", "transcriptedTimestamp", "", "timestamp", "status", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "error", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/salesforce/android/smi/network/data/domain/participant/Participant;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;Ljava/lang/String;Ljava/lang/Long;JLcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;)V", "conversationEntry", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)V", "getSenderDisplayName", "()Ljava/lang/String;", "getConversationId", "()Ljava/util/UUID;", "getSender", "()Lcom/salesforce/android/smi/network/data/domain/participant/Participant;", "getPayload", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getIdentifier", "getTranscriptedTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimestamp", "()J", "getStatus", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "getError", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;", "entryId", "getEntryId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/util/UUID;Lcom/salesforce/android/smi/network/data/domain/participant/Participant;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;Ljava/lang/String;Ljava/lang/Long;JLcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkError;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CoreConversationEntry implements ConversationEntry {
    private final UUID conversationId;
    private final String entryId;
    private final ConversationEntryType entryType;
    private final NetworkError error;
    private final String identifier;
    private final EntryPayload payload;
    private final Participant sender;
    private final String senderDisplayName;
    private final ConversationEntryStatus status;
    private final long timestamp;
    private final Long transcriptedTimestamp;

    public static /* synthetic */ CoreConversationEntry copy$default(CoreConversationEntry coreConversationEntry, String str, UUID uuid, Participant participant, EntryPayload entryPayload, ConversationEntryType conversationEntryType, String str2, Long l, long j, ConversationEntryStatus conversationEntryStatus, NetworkError networkError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coreConversationEntry.senderDisplayName;
        }
        if ((i & 2) != 0) {
            uuid = coreConversationEntry.conversationId;
        }
        if ((i & 4) != 0) {
            participant = coreConversationEntry.sender;
        }
        if ((i & 8) != 0) {
            entryPayload = coreConversationEntry.payload;
        }
        if ((i & 16) != 0) {
            conversationEntryType = coreConversationEntry.entryType;
        }
        if ((i & 32) != 0) {
            str2 = coreConversationEntry.identifier;
        }
        if ((i & 64) != 0) {
            l = coreConversationEntry.transcriptedTimestamp;
        }
        if ((i & 128) != 0) {
            j = coreConversationEntry.timestamp;
        }
        if ((i & 256) != 0) {
            conversationEntryStatus = coreConversationEntry.status;
        }
        if ((i & 512) != 0) {
            networkError = coreConversationEntry.error;
        }
        long j2 = j;
        String str3 = str2;
        Long l2 = l;
        EntryPayload entryPayload2 = entryPayload;
        ConversationEntryType conversationEntryType2 = conversationEntryType;
        Participant participant2 = participant;
        return coreConversationEntry.copy(str, uuid, participant2, entryPayload2, conversationEntryType2, str3, l2, j2, conversationEntryStatus, networkError);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /* renamed from: component10, reason: from getter */
    public final NetworkError getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component3, reason: from getter */
    public final Participant getSender() {
        return this.sender;
    }

    /* renamed from: component4, reason: from getter */
    public final EntryPayload getPayload() {
        return this.payload;
    }

    /* renamed from: component5, reason: from getter */
    public final ConversationEntryType getEntryType() {
        return this.entryType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getTranscriptedTimestamp() {
        return this.transcriptedTimestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component9, reason: from getter */
    public final ConversationEntryStatus getStatus() {
        return this.status;
    }

    public final CoreConversationEntry copy(String senderDisplayName, UUID conversationId, Participant sender, EntryPayload payload, ConversationEntryType entryType, String identifier, Long transcriptedTimestamp, long timestamp, ConversationEntryStatus status, NetworkError error) {
        Intrinsics.checkNotNullParameter(senderDisplayName, "senderDisplayName");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(status, "status");
        return new CoreConversationEntry(senderDisplayName, conversationId, sender, payload, entryType, identifier, transcriptedTimestamp, timestamp, status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreConversationEntry)) {
            return false;
        }
        CoreConversationEntry coreConversationEntry = (CoreConversationEntry) other;
        return Intrinsics.areEqual(this.senderDisplayName, coreConversationEntry.senderDisplayName) && Intrinsics.areEqual(this.conversationId, coreConversationEntry.conversationId) && Intrinsics.areEqual(this.sender, coreConversationEntry.sender) && Intrinsics.areEqual(this.payload, coreConversationEntry.payload) && this.entryType == coreConversationEntry.entryType && Intrinsics.areEqual(this.identifier, coreConversationEntry.identifier) && Intrinsics.areEqual(this.transcriptedTimestamp, coreConversationEntry.transcriptedTimestamp) && this.timestamp == coreConversationEntry.timestamp && this.status == coreConversationEntry.status && Intrinsics.areEqual(this.error, coreConversationEntry.error);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.senderDisplayName.hashCode() * 31) + this.conversationId.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.payload.hashCode()) * 31) + this.entryType.hashCode()) * 31) + this.identifier.hashCode()) * 31;
        Long l = this.transcriptedTimestamp;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31) + this.status.hashCode()) * 31;
        NetworkError networkError = this.error;
        return iHashCode2 + (networkError != null ? networkError.hashCode() : 0);
    }

    public String toString() {
        return "CoreConversationEntry(senderDisplayName=" + this.senderDisplayName + ", conversationId=" + this.conversationId + ", sender=" + this.sender + ", payload=" + this.payload + ", entryType=" + this.entryType + ", identifier=" + this.identifier + ", transcriptedTimestamp=" + this.transcriptedTimestamp + ", timestamp=" + this.timestamp + ", status=" + this.status + ", error=" + this.error + ")";
    }

    public CoreConversationEntry(String senderDisplayName, UUID conversationId, Participant sender, EntryPayload payload, ConversationEntryType entryType, String identifier, Long l, long j, ConversationEntryStatus status, NetworkError networkError) {
        String string2;
        Intrinsics.checkNotNullParameter(senderDisplayName, "senderDisplayName");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(status, "status");
        this.senderDisplayName = senderDisplayName;
        this.conversationId = conversationId;
        this.sender = sender;
        this.payload = payload;
        this.entryType = entryType;
        this.identifier = identifier;
        this.transcriptedTimestamp = l;
        this.timestamp = j;
        this.status = status;
        this.error = networkError;
        this.entryId = (l == null || (string2 = l.toString()) == null) ? getIdentifier() : string2;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public UUID getConversationId() {
        return this.conversationId;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public Participant getSender() {
        return this.sender;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public EntryPayload getPayload() {
        return this.payload;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public ConversationEntryType getEntryType() {
        return this.entryType;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public String getIdentifier() {
        return this.identifier;
    }

    public final Long getTranscriptedTimestamp() {
        return this.transcriptedTimestamp;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CoreConversationEntry(String str, UUID uuid, Participant participant, EntryPayload entryPayload, ConversationEntryType conversationEntryType, String str2, Long l, long j, ConversationEntryStatus conversationEntryStatus, NetworkError networkError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        l = (i & 64) != 0 ? null : l;
        this(str, uuid, participant, entryPayload, conversationEntryType, str2, l, (i & 128) != 0 ? l != null ? l.longValue() : new Date().getTime() : j, (i & 256) != 0 ? ConversationEntryStatus.Sending : conversationEntryStatus, (i & 512) != 0 ? null : networkError);
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public ConversationEntryStatus getStatus() {
        return this.status;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public NetworkError getError() {
        return this.error;
    }

    @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry
    public String getEntryId() {
        return this.entryId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CoreConversationEntry(ConversationEntry conversationEntry) {
        Intrinsics.checkNotNullParameter(conversationEntry, "conversationEntry");
        String senderDisplayName = conversationEntry.getSenderDisplayName();
        UUID conversationId = conversationEntry.getConversationId();
        Participant sender = conversationEntry.getSender();
        Intrinsics.checkNotNull(sender, "null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.participant.CoreParticipant");
        CoreParticipant coreParticipant = (CoreParticipant) sender;
        EntryPayload payload = conversationEntry.getPayload();
        ConversationEntryType entryType = conversationEntry.getEntryType();
        String identifier = conversationEntry.getIdentifier();
        CoreConversationEntry coreConversationEntry = conversationEntry instanceof CoreConversationEntry ? (CoreConversationEntry) conversationEntry : null;
        this(senderDisplayName, conversationId, coreParticipant, payload, entryType, identifier, coreConversationEntry != null ? coreConversationEntry.transcriptedTimestamp : null, conversationEntry.getTimestamp(), conversationEntry.getStatus(), conversationEntry.getError());
    }
}
