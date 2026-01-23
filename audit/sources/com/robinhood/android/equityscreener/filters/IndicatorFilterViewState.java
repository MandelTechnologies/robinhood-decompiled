package com.robinhood.android.equityscreener.filters;

import com.robinhood.equityscreener.models.p294db.AllIndicatorsResponse;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorFilterViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/IndicatorFilterViewState;", "", "allIndicatorsResponse", "Lcom/robinhood/equityscreener/models/db/AllIndicatorsResponse;", "isLoading", "", "indicatorKey", "", "scanResults", "Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "filter", "Lcom/robinhood/equityscreener/models/db/Screener$Filter;", "indicator", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "<init>", "(Lcom/robinhood/equityscreener/models/db/AllIndicatorsResponse;ZLjava/lang/String;Lcom/robinhood/equityscreener/models/db/ScanResultResponse;Lcom/robinhood/equityscreener/models/db/Screener$Filter;Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;)V", "getAllIndicatorsResponse", "()Lcom/robinhood/equityscreener/models/db/AllIndicatorsResponse;", "()Z", "getIndicatorKey", "()Ljava/lang/String;", "getScanResults", "()Lcom/robinhood/equityscreener/models/db/ScanResultResponse;", "getFilter", "()Lcom/robinhood/equityscreener/models/db/Screener$Filter;", "getIndicator", "()Lcom/robinhood/models/serverdriven/experimental/api/ScreenerIndicator;", "filteredResultsStr", "getFilteredResultsStr", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IndicatorFilterViewState {
    public static final int $stable = 8;
    private final AllIndicatorsResponse allIndicatorsResponse;
    private final Screener.Filter filter;
    private final String filteredResultsStr;
    private final ScreenerIndicator indicator;
    private final String indicatorKey;
    private final boolean isLoading;
    private final ScanResultResponse scanResults;

    public IndicatorFilterViewState() {
        this(null, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ IndicatorFilterViewState copy$default(IndicatorFilterViewState indicatorFilterViewState, AllIndicatorsResponse allIndicatorsResponse, boolean z, String str, ScanResultResponse scanResultResponse, Screener.Filter filter, ScreenerIndicator screenerIndicator, int i, Object obj) {
        if ((i & 1) != 0) {
            allIndicatorsResponse = indicatorFilterViewState.allIndicatorsResponse;
        }
        if ((i & 2) != 0) {
            z = indicatorFilterViewState.isLoading;
        }
        if ((i & 4) != 0) {
            str = indicatorFilterViewState.indicatorKey;
        }
        if ((i & 8) != 0) {
            scanResultResponse = indicatorFilterViewState.scanResults;
        }
        if ((i & 16) != 0) {
            filter = indicatorFilterViewState.filter;
        }
        if ((i & 32) != 0) {
            screenerIndicator = indicatorFilterViewState.indicator;
        }
        Screener.Filter filter2 = filter;
        ScreenerIndicator screenerIndicator2 = screenerIndicator;
        return indicatorFilterViewState.copy(allIndicatorsResponse, z, str, scanResultResponse, filter2, screenerIndicator2);
    }

    /* renamed from: component1, reason: from getter */
    public final AllIndicatorsResponse getAllIndicatorsResponse() {
        return this.allIndicatorsResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIndicatorKey() {
        return this.indicatorKey;
    }

    /* renamed from: component4, reason: from getter */
    public final ScanResultResponse getScanResults() {
        return this.scanResults;
    }

    /* renamed from: component5, reason: from getter */
    public final Screener.Filter getFilter() {
        return this.filter;
    }

    /* renamed from: component6, reason: from getter */
    public final ScreenerIndicator getIndicator() {
        return this.indicator;
    }

    public final IndicatorFilterViewState copy(AllIndicatorsResponse allIndicatorsResponse, boolean isLoading, String indicatorKey, ScanResultResponse scanResults, Screener.Filter filter, ScreenerIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        return new IndicatorFilterViewState(allIndicatorsResponse, isLoading, indicatorKey, scanResults, filter, indicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorFilterViewState)) {
            return false;
        }
        IndicatorFilterViewState indicatorFilterViewState = (IndicatorFilterViewState) other;
        return Intrinsics.areEqual(this.allIndicatorsResponse, indicatorFilterViewState.allIndicatorsResponse) && this.isLoading == indicatorFilterViewState.isLoading && Intrinsics.areEqual(this.indicatorKey, indicatorFilterViewState.indicatorKey) && Intrinsics.areEqual(this.scanResults, indicatorFilterViewState.scanResults) && Intrinsics.areEqual(this.filter, indicatorFilterViewState.filter) && Intrinsics.areEqual(this.indicator, indicatorFilterViewState.indicator);
    }

    public int hashCode() {
        AllIndicatorsResponse allIndicatorsResponse = this.allIndicatorsResponse;
        int iHashCode = (((((allIndicatorsResponse == null ? 0 : allIndicatorsResponse.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.indicatorKey.hashCode()) * 31;
        ScanResultResponse scanResultResponse = this.scanResults;
        int iHashCode2 = (iHashCode + (scanResultResponse == null ? 0 : scanResultResponse.hashCode())) * 31;
        Screener.Filter filter = this.filter;
        int iHashCode3 = (iHashCode2 + (filter == null ? 0 : filter.hashCode())) * 31;
        ScreenerIndicator screenerIndicator = this.indicator;
        return iHashCode3 + (screenerIndicator != null ? screenerIndicator.hashCode() : 0);
    }

    public String toString() {
        return "IndicatorFilterViewState(allIndicatorsResponse=" + this.allIndicatorsResponse + ", isLoading=" + this.isLoading + ", indicatorKey=" + this.indicatorKey + ", scanResults=" + this.scanResults + ", filter=" + this.filter + ", indicator=" + this.indicator + ")";
    }

    public IndicatorFilterViewState(AllIndicatorsResponse allIndicatorsResponse, boolean z, String indicatorKey, ScanResultResponse scanResultResponse, Screener.Filter filter, ScreenerIndicator screenerIndicator) {
        String subtitle;
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        this.allIndicatorsResponse = allIndicatorsResponse;
        this.isLoading = z;
        this.indicatorKey = indicatorKey;
        this.scanResults = scanResultResponse;
        this.filter = filter;
        this.indicator = screenerIndicator;
        this.filteredResultsStr = (scanResultResponse == null || (subtitle = scanResultResponse.getSubtitle()) == null) ? "" : subtitle;
    }

    public final AllIndicatorsResponse getAllIndicatorsResponse() {
        return this.allIndicatorsResponse;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ IndicatorFilterViewState(AllIndicatorsResponse allIndicatorsResponse, boolean z, String str, ScanResultResponse scanResultResponse, Screener.Filter filter, ScreenerIndicator screenerIndicator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : allIndicatorsResponse, (i & 2) != 0 ? true : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : scanResultResponse, (i & 16) != 0 ? null : filter, (i & 32) != 0 ? null : screenerIndicator);
    }

    public final String getIndicatorKey() {
        return this.indicatorKey;
    }

    public final ScanResultResponse getScanResults() {
        return this.scanResults;
    }

    public final Screener.Filter getFilter() {
        return this.filter;
    }

    public final ScreenerIndicator getIndicator() {
        return this.indicator;
    }

    public final String getFilteredResultsStr() {
        return this.filteredResultsStr;
    }
}
