package com.robinhood.android.lib.store.mcw.data;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformQuickConversionResponse.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionResponse;", "", "refId", "Ljava/util/UUID;", "orderId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getRefId", "()Ljava/util/UUID;", "getOrderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PerformQuickConversionResponse {
    public static final int $stable = 8;
    private final UUID orderId;
    private final UUID refId;

    public static /* synthetic */ PerformQuickConversionResponse copy$default(PerformQuickConversionResponse performQuickConversionResponse, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = performQuickConversionResponse.refId;
        }
        if ((i & 2) != 0) {
            uuid2 = performQuickConversionResponse.orderId;
        }
        return performQuickConversionResponse.copy(uuid, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    public final PerformQuickConversionResponse copy(UUID refId, UUID orderId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new PerformQuickConversionResponse(refId, orderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformQuickConversionResponse)) {
            return false;
        }
        PerformQuickConversionResponse performQuickConversionResponse = (PerformQuickConversionResponse) other;
        return Intrinsics.areEqual(this.refId, performQuickConversionResponse.refId) && Intrinsics.areEqual(this.orderId, performQuickConversionResponse.orderId);
    }

    public int hashCode() {
        return (this.refId.hashCode() * 31) + this.orderId.hashCode();
    }

    public String toString() {
        return "PerformQuickConversionResponse(refId=" + this.refId + ", orderId=" + this.orderId + ")";
    }

    public PerformQuickConversionResponse(UUID refId, UUID orderId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.refId = refId;
        this.orderId = orderId;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }
}
