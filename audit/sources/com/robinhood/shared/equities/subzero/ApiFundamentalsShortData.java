package com.robinhood.shared.equities.subzero;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiFundamentalsShort.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortData;", "", "symbol", "", "instrumentId", "exchangeSymbol", "dailyData", "", "Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortDailyData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "getInstrumentId", "getExchangeSymbol", "getDailyData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-equity-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ApiFundamentalsShortData {
    private final List<ApiFundamentalsShortDailyData> dailyData;
    private final String exchangeSymbol;
    private final String instrumentId;
    private final String symbol;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiFundamentalsShortData copy$default(ApiFundamentalsShortData apiFundamentalsShortData, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiFundamentalsShortData.symbol;
        }
        if ((i & 2) != 0) {
            str2 = apiFundamentalsShortData.instrumentId;
        }
        if ((i & 4) != 0) {
            str3 = apiFundamentalsShortData.exchangeSymbol;
        }
        if ((i & 8) != 0) {
            list = apiFundamentalsShortData.dailyData;
        }
        return apiFundamentalsShortData.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExchangeSymbol() {
        return this.exchangeSymbol;
    }

    public final List<ApiFundamentalsShortDailyData> component4() {
        return this.dailyData;
    }

    public final ApiFundamentalsShortData copy(String symbol, @Json(name = "instrument_id") String instrumentId, @Json(name = "exchange_symbol") String exchangeSymbol, @Json(name = "shares_short") List<ApiFundamentalsShortDailyData> dailyData) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(exchangeSymbol, "exchangeSymbol");
        Intrinsics.checkNotNullParameter(dailyData, "dailyData");
        return new ApiFundamentalsShortData(symbol, instrumentId, exchangeSymbol, dailyData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiFundamentalsShortData)) {
            return false;
        }
        ApiFundamentalsShortData apiFundamentalsShortData = (ApiFundamentalsShortData) other;
        return Intrinsics.areEqual(this.symbol, apiFundamentalsShortData.symbol) && Intrinsics.areEqual(this.instrumentId, apiFundamentalsShortData.instrumentId) && Intrinsics.areEqual(this.exchangeSymbol, apiFundamentalsShortData.exchangeSymbol) && Intrinsics.areEqual(this.dailyData, apiFundamentalsShortData.dailyData);
    }

    public int hashCode() {
        return (((((this.symbol.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.exchangeSymbol.hashCode()) * 31) + this.dailyData.hashCode();
    }

    public String toString() {
        return "ApiFundamentalsShortData(symbol=" + this.symbol + ", instrumentId=" + this.instrumentId + ", exchangeSymbol=" + this.exchangeSymbol + ", dailyData=" + this.dailyData + ")";
    }

    public ApiFundamentalsShortData(String symbol, @Json(name = "instrument_id") String instrumentId, @Json(name = "exchange_symbol") String exchangeSymbol, @Json(name = "shares_short") List<ApiFundamentalsShortDailyData> dailyData) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(exchangeSymbol, "exchangeSymbol");
        Intrinsics.checkNotNullParameter(dailyData, "dailyData");
        this.symbol = symbol;
        this.instrumentId = instrumentId;
        this.exchangeSymbol = exchangeSymbol;
        this.dailyData = dailyData;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final String getExchangeSymbol() {
        return this.exchangeSymbol;
    }

    public final List<ApiFundamentalsShortDailyData> getDailyData() {
        return this.dailyData;
    }
}
