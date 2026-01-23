package com.robinhood.shared.equities.subzero;

import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShortingInfo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "", "instrumentId", "Ljava/util/UUID;", "fee", "Ljava/math/BigDecimal;", "dailyFee", "feeTimestamp", "", "inventoryRange", "Lcom/robinhood/shared/equities/subzero/ShortingInventoryRange;", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/shared/equities/subzero/ShortingInventoryRange;)V", "getInstrumentId", "()Ljava/util/UUID;", "getFee", "()Ljava/math/BigDecimal;", "getDailyFee", "getFeeTimestamp", "()Ljava/lang/String;", "getInventoryRange", "()Lcom/robinhood/shared/equities/subzero/ShortingInventoryRange;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShortingInfo {
    private final BigDecimal dailyFee;
    private final BigDecimal fee;
    private final String feeTimestamp;
    private final UUID instrumentId;
    private final ShortingInventoryRange inventoryRange;

    public static /* synthetic */ ShortingInfo copy$default(ShortingInfo shortingInfo, UUID uuid, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, ShortingInventoryRange shortingInventoryRange, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = shortingInfo.instrumentId;
        }
        if ((i & 2) != 0) {
            bigDecimal = shortingInfo.fee;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = shortingInfo.dailyFee;
        }
        if ((i & 8) != 0) {
            str = shortingInfo.feeTimestamp;
        }
        if ((i & 16) != 0) {
            shortingInventoryRange = shortingInfo.inventoryRange;
        }
        ShortingInventoryRange shortingInventoryRange2 = shortingInventoryRange;
        BigDecimal bigDecimal3 = bigDecimal2;
        return shortingInfo.copy(uuid, bigDecimal, bigDecimal3, str, shortingInventoryRange2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getDailyFee() {
        return this.dailyFee;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFeeTimestamp() {
        return this.feeTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final ShortingInventoryRange getInventoryRange() {
        return this.inventoryRange;
    }

    public final ShortingInfo copy(UUID instrumentId, BigDecimal fee, BigDecimal dailyFee, String feeTimestamp, ShortingInventoryRange inventoryRange) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new ShortingInfo(instrumentId, fee, dailyFee, feeTimestamp, inventoryRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortingInfo)) {
            return false;
        }
        ShortingInfo shortingInfo = (ShortingInfo) other;
        return Intrinsics.areEqual(this.instrumentId, shortingInfo.instrumentId) && Intrinsics.areEqual(this.fee, shortingInfo.fee) && Intrinsics.areEqual(this.dailyFee, shortingInfo.dailyFee) && Intrinsics.areEqual(this.feeTimestamp, shortingInfo.feeTimestamp) && this.inventoryRange == shortingInfo.inventoryRange;
    }

    public int hashCode() {
        int iHashCode = this.instrumentId.hashCode() * 31;
        BigDecimal bigDecimal = this.fee;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.dailyFee;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.feeTimestamp;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ShortingInventoryRange shortingInventoryRange = this.inventoryRange;
        return iHashCode4 + (shortingInventoryRange != null ? shortingInventoryRange.hashCode() : 0);
    }

    public String toString() {
        return "ShortingInfo(instrumentId=" + this.instrumentId + ", fee=" + this.fee + ", dailyFee=" + this.dailyFee + ", feeTimestamp=" + this.feeTimestamp + ", inventoryRange=" + this.inventoryRange + ")";
    }

    public ShortingInfo(UUID instrumentId, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, ShortingInventoryRange shortingInventoryRange) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.fee = bigDecimal;
        this.dailyFee = bigDecimal2;
        this.feeTimestamp = str;
        this.inventoryRange = shortingInventoryRange;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final BigDecimal getFee() {
        return this.fee;
    }

    public final BigDecimal getDailyFee() {
        return this.dailyFee;
    }

    public final String getFeeTimestamp() {
        return this.feeTimestamp;
    }

    public final ShortingInventoryRange getInventoryRange() {
        return this.inventoryRange;
    }
}
