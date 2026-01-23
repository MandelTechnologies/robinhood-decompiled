package com.robinhood.android.trade.options.profitloss;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;", "", "currentProfitLoss", "Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;", "infoBarValues", "Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;", "lastLoadedChartParams", "Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;Lcom/robinhood/android/trade/options/profitloss/ChartParams;)V", "getCurrentProfitLoss", "()Lcom/robinhood/android/trade/options/profitloss/CurrentProfitLoss;", "getInfoBarValues", "()Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;", "getLastLoadedChartParams", "()Lcom/robinhood/android/trade/options/profitloss/ChartParams;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitLossAdditionalInfo {
    public static final int $stable = 8;
    private final CurrentProfitLoss currentProfitLoss;
    private final InfoBarValues infoBarValues;
    private final ChartParams lastLoadedChartParams;

    public static /* synthetic */ ProfitLossAdditionalInfo copy$default(ProfitLossAdditionalInfo profitLossAdditionalInfo, CurrentProfitLoss currentProfitLoss, InfoBarValues infoBarValues, ChartParams chartParams, int i, Object obj) {
        if ((i & 1) != 0) {
            currentProfitLoss = profitLossAdditionalInfo.currentProfitLoss;
        }
        if ((i & 2) != 0) {
            infoBarValues = profitLossAdditionalInfo.infoBarValues;
        }
        if ((i & 4) != 0) {
            chartParams = profitLossAdditionalInfo.lastLoadedChartParams;
        }
        return profitLossAdditionalInfo.copy(currentProfitLoss, infoBarValues, chartParams);
    }

    /* renamed from: component1, reason: from getter */
    public final CurrentProfitLoss getCurrentProfitLoss() {
        return this.currentProfitLoss;
    }

    /* renamed from: component2, reason: from getter */
    public final InfoBarValues getInfoBarValues() {
        return this.infoBarValues;
    }

    /* renamed from: component3, reason: from getter */
    public final ChartParams getLastLoadedChartParams() {
        return this.lastLoadedChartParams;
    }

    public final ProfitLossAdditionalInfo copy(CurrentProfitLoss currentProfitLoss, InfoBarValues infoBarValues, ChartParams lastLoadedChartParams) {
        Intrinsics.checkNotNullParameter(lastLoadedChartParams, "lastLoadedChartParams");
        return new ProfitLossAdditionalInfo(currentProfitLoss, infoBarValues, lastLoadedChartParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitLossAdditionalInfo)) {
            return false;
        }
        ProfitLossAdditionalInfo profitLossAdditionalInfo = (ProfitLossAdditionalInfo) other;
        return Intrinsics.areEqual(this.currentProfitLoss, profitLossAdditionalInfo.currentProfitLoss) && Intrinsics.areEqual(this.infoBarValues, profitLossAdditionalInfo.infoBarValues) && Intrinsics.areEqual(this.lastLoadedChartParams, profitLossAdditionalInfo.lastLoadedChartParams);
    }

    public int hashCode() {
        CurrentProfitLoss currentProfitLoss = this.currentProfitLoss;
        int iHashCode = (currentProfitLoss == null ? 0 : currentProfitLoss.hashCode()) * 31;
        InfoBarValues infoBarValues = this.infoBarValues;
        return ((iHashCode + (infoBarValues != null ? infoBarValues.hashCode() : 0)) * 31) + this.lastLoadedChartParams.hashCode();
    }

    public String toString() {
        return "ProfitLossAdditionalInfo(currentProfitLoss=" + this.currentProfitLoss + ", infoBarValues=" + this.infoBarValues + ", lastLoadedChartParams=" + this.lastLoadedChartParams + ")";
    }

    public ProfitLossAdditionalInfo(CurrentProfitLoss currentProfitLoss, InfoBarValues infoBarValues, ChartParams lastLoadedChartParams) {
        Intrinsics.checkNotNullParameter(lastLoadedChartParams, "lastLoadedChartParams");
        this.currentProfitLoss = currentProfitLoss;
        this.infoBarValues = infoBarValues;
        this.lastLoadedChartParams = lastLoadedChartParams;
    }

    public final CurrentProfitLoss getCurrentProfitLoss() {
        return this.currentProfitLoss;
    }

    public final InfoBarValues getInfoBarValues() {
        return this.infoBarValues;
    }

    public final ChartParams getLastLoadedChartParams() {
        return this.lastLoadedChartParams;
    }
}
