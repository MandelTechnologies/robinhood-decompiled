package com.robinhood.android.indexes.api.fundamentals;

import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ApiIndexFundamentals.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u009c\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b9\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b:\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010%¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentals;", "", "Ljava/util/UUID;", "id", "", "symbol", "Ljava/math/BigDecimal;", "high_52_weeks", "low_52_weeks", "market_cap", "pe_ratio", "high", "low", "open", "previous_close", "j$/time/LocalDate", "previous_close_date", "j$/time/Instant", "updated_at", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lj$/time/LocalDate;", "component12", "()Lj$/time/Instant;", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;)Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentals;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getSymbol", "Ljava/math/BigDecimal;", "getHigh_52_weeks", "getLow_52_weeks", "getMarket_cap", "getPe_ratio", "getHigh", "getLow", "getOpen", "getPrevious_close", "Lj$/time/LocalDate;", "getPrevious_close_date", "Lj$/time/Instant;", "getUpdated_at", "lib-models-indexes-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiIndexFundamentals {
    private final BigDecimal high;
    private final BigDecimal high_52_weeks;
    private final UUID id;
    private final BigDecimal low;
    private final BigDecimal low_52_weeks;
    private final BigDecimal market_cap;
    private final BigDecimal open;
    private final BigDecimal pe_ratio;
    private final BigDecimal previous_close;
    private final LocalDate previous_close_date;
    private final String symbol;
    private final Instant updated_at;

    public static /* synthetic */ ApiIndexFundamentals copy$default(ApiIndexFundamentals apiIndexFundamentals, UUID uuid, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, LocalDate localDate, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiIndexFundamentals.id;
        }
        if ((i & 2) != 0) {
            str = apiIndexFundamentals.symbol;
        }
        if ((i & 4) != 0) {
            bigDecimal = apiIndexFundamentals.high_52_weeks;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = apiIndexFundamentals.low_52_weeks;
        }
        if ((i & 16) != 0) {
            bigDecimal3 = apiIndexFundamentals.market_cap;
        }
        if ((i & 32) != 0) {
            bigDecimal4 = apiIndexFundamentals.pe_ratio;
        }
        if ((i & 64) != 0) {
            bigDecimal5 = apiIndexFundamentals.high;
        }
        if ((i & 128) != 0) {
            bigDecimal6 = apiIndexFundamentals.low;
        }
        if ((i & 256) != 0) {
            bigDecimal7 = apiIndexFundamentals.open;
        }
        if ((i & 512) != 0) {
            bigDecimal8 = apiIndexFundamentals.previous_close;
        }
        if ((i & 1024) != 0) {
            localDate = apiIndexFundamentals.previous_close_date;
        }
        if ((i & 2048) != 0) {
            instant = apiIndexFundamentals.updated_at;
        }
        LocalDate localDate2 = localDate;
        Instant instant2 = instant;
        BigDecimal bigDecimal9 = bigDecimal7;
        BigDecimal bigDecimal10 = bigDecimal8;
        BigDecimal bigDecimal11 = bigDecimal5;
        BigDecimal bigDecimal12 = bigDecimal6;
        BigDecimal bigDecimal13 = bigDecimal3;
        BigDecimal bigDecimal14 = bigDecimal4;
        return apiIndexFundamentals.copy(uuid, str, bigDecimal, bigDecimal2, bigDecimal13, bigDecimal14, bigDecimal11, bigDecimal12, bigDecimal9, bigDecimal10, localDate2, instant2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final BigDecimal getPrevious_close() {
        return this.previous_close;
    }

    /* renamed from: component11, reason: from getter */
    public final LocalDate getPrevious_close_date() {
        return this.previous_close_date;
    }

    /* renamed from: component12, reason: from getter */
    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getHigh_52_weeks() {
        return this.high_52_weeks;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getLow_52_weeks() {
        return this.low_52_weeks;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getMarket_cap() {
        return this.market_cap;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getPe_ratio() {
        return this.pe_ratio;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getHigh() {
        return this.high;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getLow() {
        return this.low;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getOpen() {
        return this.open;
    }

    public final ApiIndexFundamentals copy(UUID id, String symbol, BigDecimal high_52_weeks, BigDecimal low_52_weeks, BigDecimal market_cap, BigDecimal pe_ratio, BigDecimal high, BigDecimal low, BigDecimal open, BigDecimal previous_close, LocalDate previous_close_date, Instant updated_at) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new ApiIndexFundamentals(id, symbol, high_52_weeks, low_52_weeks, market_cap, pe_ratio, high, low, open, previous_close, previous_close_date, updated_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiIndexFundamentals)) {
            return false;
        }
        ApiIndexFundamentals apiIndexFundamentals = (ApiIndexFundamentals) other;
        return Intrinsics.areEqual(this.id, apiIndexFundamentals.id) && Intrinsics.areEqual(this.symbol, apiIndexFundamentals.symbol) && Intrinsics.areEqual(this.high_52_weeks, apiIndexFundamentals.high_52_weeks) && Intrinsics.areEqual(this.low_52_weeks, apiIndexFundamentals.low_52_weeks) && Intrinsics.areEqual(this.market_cap, apiIndexFundamentals.market_cap) && Intrinsics.areEqual(this.pe_ratio, apiIndexFundamentals.pe_ratio) && Intrinsics.areEqual(this.high, apiIndexFundamentals.high) && Intrinsics.areEqual(this.low, apiIndexFundamentals.low) && Intrinsics.areEqual(this.open, apiIndexFundamentals.open) && Intrinsics.areEqual(this.previous_close, apiIndexFundamentals.previous_close) && Intrinsics.areEqual(this.previous_close_date, apiIndexFundamentals.previous_close_date) && Intrinsics.areEqual(this.updated_at, apiIndexFundamentals.updated_at);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31;
        BigDecimal bigDecimal = this.high_52_weeks;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.low_52_weeks;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.market_cap;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.pe_ratio;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.high;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.low;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.open;
        int iHashCode8 = (iHashCode7 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.previous_close;
        int iHashCode9 = (iHashCode8 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        LocalDate localDate = this.previous_close_date;
        int iHashCode10 = (iHashCode9 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Instant instant = this.updated_at;
        return iHashCode10 + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "ApiIndexFundamentals(id=" + this.id + ", symbol=" + this.symbol + ", high_52_weeks=" + this.high_52_weeks + ", low_52_weeks=" + this.low_52_weeks + ", market_cap=" + this.market_cap + ", pe_ratio=" + this.pe_ratio + ", high=" + this.high + ", low=" + this.low + ", open=" + this.open + ", previous_close=" + this.previous_close + ", previous_close_date=" + this.previous_close_date + ", updated_at=" + this.updated_at + ")";
    }

    public ApiIndexFundamentals(UUID id, String symbol, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, LocalDate localDate, Instant instant) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.id = id;
        this.symbol = symbol;
        this.high_52_weeks = bigDecimal;
        this.low_52_weeks = bigDecimal2;
        this.market_cap = bigDecimal3;
        this.pe_ratio = bigDecimal4;
        this.high = bigDecimal5;
        this.low = bigDecimal6;
        this.open = bigDecimal7;
        this.previous_close = bigDecimal8;
        this.previous_close_date = localDate;
        this.updated_at = instant;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final BigDecimal getHigh_52_weeks() {
        return this.high_52_weeks;
    }

    public final BigDecimal getLow_52_weeks() {
        return this.low_52_weeks;
    }

    public final BigDecimal getMarket_cap() {
        return this.market_cap;
    }

    public final BigDecimal getPe_ratio() {
        return this.pe_ratio;
    }

    public final BigDecimal getHigh() {
        return this.high;
    }

    public final BigDecimal getLow() {
        return this.low;
    }

    public final BigDecimal getOpen() {
        return this.open;
    }

    public final BigDecimal getPrevious_close() {
        return this.previous_close;
    }

    public final LocalDate getPrevious_close_date() {
        return this.previous_close_date;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }
}
