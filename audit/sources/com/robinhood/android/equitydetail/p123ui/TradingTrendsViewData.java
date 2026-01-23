package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/TradingTrendsViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentId", "", "tradingTrendsState", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;)V", "getInstrumentId", "()Ljava/lang/String;", "getTradingTrendsState", "()Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TradingTrendsViewData extends DetailData {
    public static final int $stable = 8;
    private final String instrumentId;
    private final ApiStockDetail.Section section;
    private final TradingTrendsChartSectionState3 tradingTrendsState;

    public static /* synthetic */ TradingTrendsViewData copy$default(TradingTrendsViewData tradingTrendsViewData, String str, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingTrendsViewData.instrumentId;
        }
        if ((i & 2) != 0) {
            tradingTrendsChartSectionState3 = tradingTrendsViewData.tradingTrendsState;
        }
        return tradingTrendsViewData.copy(str, tradingTrendsChartSectionState3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final TradingTrendsChartSectionState3 getTradingTrendsState() {
        return this.tradingTrendsState;
    }

    public final TradingTrendsViewData copy(String instrumentId, TradingTrendsChartSectionState3 tradingTrendsState) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(tradingTrendsState, "tradingTrendsState");
        return new TradingTrendsViewData(instrumentId, tradingTrendsState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingTrendsViewData)) {
            return false;
        }
        TradingTrendsViewData tradingTrendsViewData = (TradingTrendsViewData) other;
        return Intrinsics.areEqual(this.instrumentId, tradingTrendsViewData.instrumentId) && Intrinsics.areEqual(this.tradingTrendsState, tradingTrendsViewData.tradingTrendsState);
    }

    public int hashCode() {
        return (this.instrumentId.hashCode() * 31) + this.tradingTrendsState.hashCode();
    }

    public String toString() {
        return "TradingTrendsViewData(instrumentId=" + this.instrumentId + ", tradingTrendsState=" + this.tradingTrendsState + ")";
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final TradingTrendsChartSectionState3 getTradingTrendsState() {
        return this.tradingTrendsState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingTrendsViewData(String instrumentId, TradingTrendsChartSectionState3 tradingTrendsState) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(tradingTrendsState, "tradingTrendsState");
        this.instrumentId = instrumentId;
        this.tradingTrendsState = tradingTrendsState;
        this.section = ApiStockDetail.Section.TRADING_TRENDS;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
