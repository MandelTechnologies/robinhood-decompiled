package com.robinhood.shared.equities.subzero;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: ApiFundamentalsShort.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JV\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyData;", "", "Ljava/math/BigDecimal;", "sharesShort", "sharesUpperBound", "sharesLowerBound", "pcFreeFloat", "pcFreeFloatUpperBound", "pcFreeFloatLowerBound", "j$/time/LocalDate", InquiryField.DateField.TYPE, "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lj$/time/LocalDate;", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;)Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getSharesShort", "getSharesUpperBound", "getSharesLowerBound", "getPcFreeFloat", "getPcFreeFloatUpperBound", "getPcFreeFloatLowerBound", "Lj$/time/LocalDate;", "getDate", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiFundamentalsShortDailyData {
    private final LocalDate date;
    private final BigDecimal pcFreeFloat;
    private final BigDecimal pcFreeFloatLowerBound;
    private final BigDecimal pcFreeFloatUpperBound;
    private final BigDecimal sharesLowerBound;
    private final BigDecimal sharesShort;
    private final BigDecimal sharesUpperBound;

    public static /* synthetic */ ApiFundamentalsShortDailyData copy$default(ApiFundamentalsShortDailyData apiFundamentalsShortDailyData, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = apiFundamentalsShortDailyData.sharesShort;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = apiFundamentalsShortDailyData.sharesUpperBound;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = apiFundamentalsShortDailyData.sharesLowerBound;
        }
        if ((i & 8) != 0) {
            bigDecimal4 = apiFundamentalsShortDailyData.pcFreeFloat;
        }
        if ((i & 16) != 0) {
            bigDecimal5 = apiFundamentalsShortDailyData.pcFreeFloatUpperBound;
        }
        if ((i & 32) != 0) {
            bigDecimal6 = apiFundamentalsShortDailyData.pcFreeFloatLowerBound;
        }
        if ((i & 64) != 0) {
            localDate = apiFundamentalsShortDailyData.date;
        }
        BigDecimal bigDecimal7 = bigDecimal6;
        LocalDate localDate2 = localDate;
        BigDecimal bigDecimal8 = bigDecimal5;
        BigDecimal bigDecimal9 = bigDecimal3;
        return apiFundamentalsShortDailyData.copy(bigDecimal, bigDecimal2, bigDecimal9, bigDecimal4, bigDecimal8, bigDecimal7, localDate2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getSharesShort() {
        return this.sharesShort;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getSharesUpperBound() {
        return this.sharesUpperBound;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getSharesLowerBound() {
        return this.sharesLowerBound;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getPcFreeFloat() {
        return this.pcFreeFloat;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getPcFreeFloatUpperBound() {
        return this.pcFreeFloatUpperBound;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getPcFreeFloatLowerBound() {
        return this.pcFreeFloatLowerBound;
    }

    /* renamed from: component7, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public final ApiFundamentalsShortDailyData copy(@Json(name = "shares_short") BigDecimal sharesShort, @Json(name = "shares_upper_bound") BigDecimal sharesUpperBound, @Json(name = "shares_lower_bound") BigDecimal sharesLowerBound, @Json(name = "pc_freefloat") BigDecimal pcFreeFloat, @Json(name = "pc_freefloat_upper_bound") BigDecimal pcFreeFloatUpperBound, @Json(name = "pc_freefloat_lower_bound") BigDecimal pcFreeFloatLowerBound, LocalDate date) {
        Intrinsics.checkNotNullParameter(sharesShort, "sharesShort");
        Intrinsics.checkNotNullParameter(sharesUpperBound, "sharesUpperBound");
        Intrinsics.checkNotNullParameter(sharesLowerBound, "sharesLowerBound");
        Intrinsics.checkNotNullParameter(pcFreeFloat, "pcFreeFloat");
        Intrinsics.checkNotNullParameter(pcFreeFloatUpperBound, "pcFreeFloatUpperBound");
        Intrinsics.checkNotNullParameter(pcFreeFloatLowerBound, "pcFreeFloatLowerBound");
        Intrinsics.checkNotNullParameter(date, "date");
        return new ApiFundamentalsShortDailyData(sharesShort, sharesUpperBound, sharesLowerBound, pcFreeFloat, pcFreeFloatUpperBound, pcFreeFloatLowerBound, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiFundamentalsShortDailyData)) {
            return false;
        }
        ApiFundamentalsShortDailyData apiFundamentalsShortDailyData = (ApiFundamentalsShortDailyData) other;
        return Intrinsics.areEqual(this.sharesShort, apiFundamentalsShortDailyData.sharesShort) && Intrinsics.areEqual(this.sharesUpperBound, apiFundamentalsShortDailyData.sharesUpperBound) && Intrinsics.areEqual(this.sharesLowerBound, apiFundamentalsShortDailyData.sharesLowerBound) && Intrinsics.areEqual(this.pcFreeFloat, apiFundamentalsShortDailyData.pcFreeFloat) && Intrinsics.areEqual(this.pcFreeFloatUpperBound, apiFundamentalsShortDailyData.pcFreeFloatUpperBound) && Intrinsics.areEqual(this.pcFreeFloatLowerBound, apiFundamentalsShortDailyData.pcFreeFloatLowerBound) && Intrinsics.areEqual(this.date, apiFundamentalsShortDailyData.date);
    }

    public int hashCode() {
        return (((((((((((this.sharesShort.hashCode() * 31) + this.sharesUpperBound.hashCode()) * 31) + this.sharesLowerBound.hashCode()) * 31) + this.pcFreeFloat.hashCode()) * 31) + this.pcFreeFloatUpperBound.hashCode()) * 31) + this.pcFreeFloatLowerBound.hashCode()) * 31) + this.date.hashCode();
    }

    public String toString() {
        return "ApiFundamentalsShortDailyData(sharesShort=" + this.sharesShort + ", sharesUpperBound=" + this.sharesUpperBound + ", sharesLowerBound=" + this.sharesLowerBound + ", pcFreeFloat=" + this.pcFreeFloat + ", pcFreeFloatUpperBound=" + this.pcFreeFloatUpperBound + ", pcFreeFloatLowerBound=" + this.pcFreeFloatLowerBound + ", date=" + this.date + ")";
    }

    public ApiFundamentalsShortDailyData(@Json(name = "shares_short") BigDecimal sharesShort, @Json(name = "shares_upper_bound") BigDecimal sharesUpperBound, @Json(name = "shares_lower_bound") BigDecimal sharesLowerBound, @Json(name = "pc_freefloat") BigDecimal pcFreeFloat, @Json(name = "pc_freefloat_upper_bound") BigDecimal pcFreeFloatUpperBound, @Json(name = "pc_freefloat_lower_bound") BigDecimal pcFreeFloatLowerBound, LocalDate date) {
        Intrinsics.checkNotNullParameter(sharesShort, "sharesShort");
        Intrinsics.checkNotNullParameter(sharesUpperBound, "sharesUpperBound");
        Intrinsics.checkNotNullParameter(sharesLowerBound, "sharesLowerBound");
        Intrinsics.checkNotNullParameter(pcFreeFloat, "pcFreeFloat");
        Intrinsics.checkNotNullParameter(pcFreeFloatUpperBound, "pcFreeFloatUpperBound");
        Intrinsics.checkNotNullParameter(pcFreeFloatLowerBound, "pcFreeFloatLowerBound");
        Intrinsics.checkNotNullParameter(date, "date");
        this.sharesShort = sharesShort;
        this.sharesUpperBound = sharesUpperBound;
        this.sharesLowerBound = sharesLowerBound;
        this.pcFreeFloat = pcFreeFloat;
        this.pcFreeFloatUpperBound = pcFreeFloatUpperBound;
        this.pcFreeFloatLowerBound = pcFreeFloatLowerBound;
        this.date = date;
    }

    public final BigDecimal getSharesShort() {
        return this.sharesShort;
    }

    public final BigDecimal getSharesUpperBound() {
        return this.sharesUpperBound;
    }

    public final BigDecimal getSharesLowerBound() {
        return this.sharesLowerBound;
    }

    public final BigDecimal getPcFreeFloat() {
        return this.pcFreeFloat;
    }

    public final BigDecimal getPcFreeFloatUpperBound() {
        return this.pcFreeFloatUpperBound;
    }

    public final BigDecimal getPcFreeFloatLowerBound() {
        return this.pcFreeFloatLowerBound;
    }

    public final LocalDate getDate() {
        return this.date;
    }
}
