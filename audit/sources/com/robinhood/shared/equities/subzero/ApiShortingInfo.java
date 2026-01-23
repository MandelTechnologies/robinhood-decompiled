package com.robinhood.shared.equities.subzero;

import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiShortingInfo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiShortingInfo;", "", "instrument_id", "Ljava/util/UUID;", "fee", "Ljava/math/BigDecimal;", "daily_fee", "fee_timestamp", "", "inventory_range", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getInstrument_id", "()Ljava/util/UUID;", "getFee", "()Ljava/math/BigDecimal;", "getDaily_fee", "getFee_timestamp", "()Ljava/lang/String;", "getInventory_range", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiShortingInfo {
    private final BigDecimal daily_fee;
    private final BigDecimal fee;
    private final String fee_timestamp;
    private final UUID instrument_id;
    private final String inventory_range;

    public static /* synthetic */ ApiShortingInfo copy$default(ApiShortingInfo apiShortingInfo, UUID uuid, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiShortingInfo.instrument_id;
        }
        if ((i & 2) != 0) {
            bigDecimal = apiShortingInfo.fee;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = apiShortingInfo.daily_fee;
        }
        if ((i & 8) != 0) {
            str = apiShortingInfo.fee_timestamp;
        }
        if ((i & 16) != 0) {
            str2 = apiShortingInfo.inventory_range;
        }
        String str3 = str2;
        BigDecimal bigDecimal3 = bigDecimal2;
        return apiShortingInfo.copy(uuid, bigDecimal, bigDecimal3, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getDaily_fee() {
        return this.daily_fee;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFee_timestamp() {
        return this.fee_timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInventory_range() {
        return this.inventory_range;
    }

    public final ApiShortingInfo copy(UUID instrument_id, BigDecimal fee, BigDecimal daily_fee, String fee_timestamp, String inventory_range) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        return new ApiShortingInfo(instrument_id, fee, daily_fee, fee_timestamp, inventory_range);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiShortingInfo)) {
            return false;
        }
        ApiShortingInfo apiShortingInfo = (ApiShortingInfo) other;
        return Intrinsics.areEqual(this.instrument_id, apiShortingInfo.instrument_id) && Intrinsics.areEqual(this.fee, apiShortingInfo.fee) && Intrinsics.areEqual(this.daily_fee, apiShortingInfo.daily_fee) && Intrinsics.areEqual(this.fee_timestamp, apiShortingInfo.fee_timestamp) && Intrinsics.areEqual(this.inventory_range, apiShortingInfo.inventory_range);
    }

    public int hashCode() {
        int iHashCode = this.instrument_id.hashCode() * 31;
        BigDecimal bigDecimal = this.fee;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.daily_fee;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.fee_timestamp;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inventory_range;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiShortingInfo(instrument_id=" + this.instrument_id + ", fee=" + this.fee + ", daily_fee=" + this.daily_fee + ", fee_timestamp=" + this.fee_timestamp + ", inventory_range=" + this.inventory_range + ")";
    }

    public ApiShortingInfo(UUID instrument_id, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        this.instrument_id = instrument_id;
        this.fee = bigDecimal;
        this.daily_fee = bigDecimal2;
        this.fee_timestamp = str;
        this.inventory_range = str2;
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final BigDecimal getFee() {
        return this.fee;
    }

    public final BigDecimal getDaily_fee() {
        return this.daily_fee;
    }

    public final String getFee_timestamp() {
        return this.fee_timestamp;
    }

    public final String getInventory_range() {
        return this.inventory_range;
    }
}
