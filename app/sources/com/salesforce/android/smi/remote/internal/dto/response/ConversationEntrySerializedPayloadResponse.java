package com.salesforce.android.smi.remote.internal.dto.response;

import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryStatus;
import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEntrySerializedPayloadResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntrySerializedPayloadResponse;", "", "senderDisplayName", "", "sender", "Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "payload", "entryType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "identifier", "clientTimestamp", "", "timestamp", "status", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "<init>", "(Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;Ljava/lang/String;JJLcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;)V", "getSenderDisplayName", "()Ljava/lang/String;", "getSender", "()Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "getPayload", "getEntryType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/ConversationEntryType;", "getIdentifier", "getClientTimestamp", "()J", "getTimestamp", "getStatus", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "entryId", "getEntryId", "toCoreConversationEntry", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/CoreConversationEntry;", "conversationId", "Ljava/util/UUID;", "entryPayload", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "toCoreConversationEntry$remote_release", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ConversationEntrySerializedPayloadResponse {
    private final long clientTimestamp;
    private final String entryId;
    private final ConversationEntryType entryType;
    private final String identifier;
    private final String payload;
    private final CoreParticipant sender;
    private final String senderDisplayName;
    private final transient ConversationEntryStatus status;
    private final long timestamp;

    public ConversationEntrySerializedPayloadResponse(String senderDisplayName, CoreParticipant sender, @Json(name = "entryPayload") String payload, ConversationEntryType entryType, String identifier, long j, @Json(name = "transcriptedTimestamp") long j2, ConversationEntryStatus status) {
        Intrinsics.checkNotNullParameter(senderDisplayName, "senderDisplayName");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(status, "status");
        this.senderDisplayName = senderDisplayName;
        this.sender = sender;
        this.payload = payload;
        this.entryType = entryType;
        this.identifier = identifier;
        this.clientTimestamp = j;
        this.timestamp = j2;
        this.status = status;
        this.entryId = String.valueOf(j2);
    }

    public final String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    public final CoreParticipant getSender() {
        return this.sender;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final ConversationEntryType getEntryType() {
        return this.entryType;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final long getClientTimestamp() {
        return this.clientTimestamp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ConversationEntryStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ ConversationEntrySerializedPayloadResponse(String str, CoreParticipant coreParticipant, String str2, ConversationEntryType conversationEntryType, String str3, long j, long j2, ConversationEntryStatus conversationEntryStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, coreParticipant, str2, conversationEntryType, str3, j, j2, (i & 128) != 0 ? ConversationEntryStatus.Sent : conversationEntryStatus);
    }

    public final String getEntryId() {
        return this.entryId;
    }

    public final CoreConversationEntry toCoreConversationEntry$remote_release(UUID conversationId, EntryPayload entryPayload) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(entryPayload, "entryPayload");
        return toCoreConversationEntry$remote_release(conversationId, entryPayload, this.status);
    }

    public final CoreConversationEntry toCoreConversationEntry$remote_release(UUID conversationId, EntryPayload entryPayload, ConversationEntryStatus status) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(entryPayload, "entryPayload");
        Intrinsics.checkNotNullParameter(status, "status");
        return new CoreConversationEntry(this.senderDisplayName, conversationId, this.sender, entryPayload, this.entryType, this.identifier, Long.valueOf(this.timestamp), this.timestamp, status, null, 512, null);
    }
}
