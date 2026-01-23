package com.salesforce.android.smi.remote.internal.dto.response;

import com.salesforce.android.smi.network.data.domain.conversation.CoreConversation;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import com.squareup.moshi.Json;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalCoreConversation.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/response/InternalCoreConversation;", "", "identifier", "Ljava/util/UUID;", "participants", "", "Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "startTimestamp", "", "<init>", "(Ljava/util/UUID;Ljava/util/List;J)V", "getIdentifier", "()Ljava/util/UUID;", "getParticipants", "()Ljava/util/List;", "getStartTimestamp", "()J", "toCoreConversation", "Lcom/salesforce/android/smi/network/data/domain/conversation/CoreConversation;", "developerName", "", "toCoreConversation$remote_release", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InternalCoreConversation {
    private final UUID identifier;
    private final List<CoreParticipant> participants;
    private final long startTimestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalCoreConversation copy$default(InternalCoreConversation internalCoreConversation, UUID uuid, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = internalCoreConversation.identifier;
        }
        if ((i & 2) != 0) {
            list = internalCoreConversation.participants;
        }
        if ((i & 4) != 0) {
            j = internalCoreConversation.startTimestamp;
        }
        return internalCoreConversation.copy(uuid, list, j);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getIdentifier() {
        return this.identifier;
    }

    public final List<CoreParticipant> component2() {
        return this.participants;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final InternalCoreConversation copy(@Json(name = "conversationId") UUID identifier, List<CoreParticipant> participants, long startTimestamp) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(participants, "participants");
        return new InternalCoreConversation(identifier, participants, startTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalCoreConversation)) {
            return false;
        }
        InternalCoreConversation internalCoreConversation = (InternalCoreConversation) other;
        return Intrinsics.areEqual(this.identifier, internalCoreConversation.identifier) && Intrinsics.areEqual(this.participants, internalCoreConversation.participants) && this.startTimestamp == internalCoreConversation.startTimestamp;
    }

    public int hashCode() {
        return (((this.identifier.hashCode() * 31) + this.participants.hashCode()) * 31) + Long.hashCode(this.startTimestamp);
    }

    public String toString() {
        return "InternalCoreConversation(identifier=" + this.identifier + ", participants=" + this.participants + ", startTimestamp=" + this.startTimestamp + ")";
    }

    public InternalCoreConversation(@Json(name = "conversationId") UUID identifier, List<CoreParticipant> participants, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(participants, "participants");
        this.identifier = identifier;
        this.participants = participants;
        this.startTimestamp = j;
    }

    public /* synthetic */ InternalCoreConversation(UUID uuid, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, list, (i & 4) != 0 ? 0L : j);
    }

    public final UUID getIdentifier() {
        return this.identifier;
    }

    public final List<CoreParticipant> getParticipants() {
        return this.participants;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final CoreConversation toCoreConversation$remote_release(String developerName) {
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        return new CoreConversation(this.identifier, developerName, this.participants, Long.valueOf(this.startTimestamp), null, null, null, null, null, null, null, 0, 4080, null);
    }
}
