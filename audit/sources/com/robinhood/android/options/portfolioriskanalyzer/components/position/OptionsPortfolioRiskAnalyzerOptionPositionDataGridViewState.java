package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState;", "", "delta", "Ljava/math/BigDecimal;", "gamma", "theta", "vega", "currentPrice", "avgCostOrCredit", "isCost", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Z)V", "getDelta", "()Ljava/math/BigDecimal;", "getGamma", "getTheta", "getVega", "getCurrentPrice", "getAvgCostOrCredit", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState {
    public static final int $stable = 8;
    private final BigDecimal avgCostOrCredit;
    private final BigDecimal currentPrice;
    private final BigDecimal delta;
    private final BigDecimal gamma;
    private final boolean isCost;
    private final BigDecimal theta;
    private final BigDecimal vega;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState copy$default(OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.delta;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.gamma;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.theta;
        }
        if ((i & 8) != 0) {
            bigDecimal4 = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.vega;
        }
        if ((i & 16) != 0) {
            bigDecimal5 = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.currentPrice;
        }
        if ((i & 32) != 0) {
            bigDecimal6 = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.avgCostOrCredit;
        }
        if ((i & 64) != 0) {
            z = optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.isCost;
        }
        BigDecimal bigDecimal7 = bigDecimal6;
        boolean z2 = z;
        BigDecimal bigDecimal8 = bigDecimal5;
        BigDecimal bigDecimal9 = bigDecimal3;
        return optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.copy(bigDecimal, bigDecimal2, bigDecimal9, bigDecimal4, bigDecimal8, bigDecimal7, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getDelta() {
        return this.delta;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getGamma() {
        return this.gamma;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getTheta() {
        return this.theta;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getVega() {
        return this.vega;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getAvgCostOrCredit() {
        return this.avgCostOrCredit;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCost() {
        return this.isCost;
    }

    public final OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState copy(BigDecimal delta, BigDecimal gamma, BigDecimal theta, BigDecimal vega, BigDecimal currentPrice, BigDecimal avgCostOrCredit, boolean isCost) {
        return new OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState(delta, gamma, theta, vega, currentPrice, avgCostOrCredit, isCost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState = (OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState) other;
        return Intrinsics.areEqual(this.delta, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.delta) && Intrinsics.areEqual(this.gamma, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.gamma) && Intrinsics.areEqual(this.theta, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.theta) && Intrinsics.areEqual(this.vega, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.vega) && Intrinsics.areEqual(this.currentPrice, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.currentPrice) && Intrinsics.areEqual(this.avgCostOrCredit, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.avgCostOrCredit) && this.isCost == optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState.isCost;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.delta;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.gamma;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.theta;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.vega;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.currentPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.avgCostOrCredit;
        return ((iHashCode5 + (bigDecimal6 != null ? bigDecimal6.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCost);
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState(delta=" + this.delta + ", gamma=" + this.gamma + ", theta=" + this.theta + ", vega=" + this.vega + ", currentPrice=" + this.currentPrice + ", avgCostOrCredit=" + this.avgCostOrCredit + ", isCost=" + this.isCost + ")";
    }

    public OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z) {
        this.delta = bigDecimal;
        this.gamma = bigDecimal2;
        this.theta = bigDecimal3;
        this.vega = bigDecimal4;
        this.currentPrice = bigDecimal5;
        this.avgCostOrCredit = bigDecimal6;
        this.isCost = z;
    }

    public final BigDecimal getDelta() {
        return this.delta;
    }

    public final BigDecimal getGamma() {
        return this.gamma;
    }

    public final BigDecimal getTheta() {
        return this.theta;
    }

    public final BigDecimal getVega() {
        return this.vega;
    }

    public final BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    public final BigDecimal getAvgCostOrCredit() {
        return this.avgCostOrCredit;
    }

    public final boolean isCost() {
        return this.isCost;
    }
}
