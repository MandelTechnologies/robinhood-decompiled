package com.salesforce.android.smi.remote.internal.dto.request.acknowledgement;

import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeliveryAcknowledgeEntriesRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/DeliveryAcknowledgeEntriesRequest;", "", "acks", "", "Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/AcknowledgementEntry;", "conversationId", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;Ljava/util/UUID;)V", "getAcks", "()Ljava/util/List;", "getConversationId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryAcknowledgeEntriesRequest {
    private final List<AcknowledgementEntry> acks;
    private final transient UUID conversationId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryAcknowledgeEntriesRequest copy$default(DeliveryAcknowledgeEntriesRequest deliveryAcknowledgeEntriesRequest, List list, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deliveryAcknowledgeEntriesRequest.acks;
        }
        if ((i & 2) != 0) {
            uuid = deliveryAcknowledgeEntriesRequest.conversationId;
        }
        return deliveryAcknowledgeEntriesRequest.copy(list, uuid);
    }

    public final List<AcknowledgementEntry> component1() {
        return this.acks;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final DeliveryAcknowledgeEntriesRequest copy(List<? extends AcknowledgementEntry> acks, UUID conversationId) {
        Intrinsics.checkNotNullParameter(acks, "acks");
        return new DeliveryAcknowledgeEntriesRequest(acks, conversationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryAcknowledgeEntriesRequest)) {
            return false;
        }
        DeliveryAcknowledgeEntriesRequest deliveryAcknowledgeEntriesRequest = (DeliveryAcknowledgeEntriesRequest) other;
        return Intrinsics.areEqual(this.acks, deliveryAcknowledgeEntriesRequest.acks) && Intrinsics.areEqual(this.conversationId, deliveryAcknowledgeEntriesRequest.conversationId);
    }

    public int hashCode() {
        int iHashCode = this.acks.hashCode() * 31;
        UUID uuid = this.conversationId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "DeliveryAcknowledgeEntriesRequest(acks=" + this.acks + ", conversationId=" + this.conversationId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryAcknowledgeEntriesRequest(List<? extends AcknowledgementEntry> acks, UUID uuid) {
        Intrinsics.checkNotNullParameter(acks, "acks");
        this.acks = acks;
        this.conversationId = uuid;
    }

    public /* synthetic */ DeliveryAcknowledgeEntriesRequest(List list, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : uuid);
    }

    public final List<AcknowledgementEntry> getAcks() {
        return this.acks;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }
}
