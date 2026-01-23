package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.models.p320db.OptionChain;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitAndLossChartFormatParams.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;", "", "tradeValueMultiplier", "Ljava/math/BigDecimal;", "isFullyExpanded", "", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Ljava/math/BigDecimal;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getTradeValueMultiplier", "()Ljava/math/BigDecimal;", "()Z", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsProfitAndLossChartPostProcessParams {
    public static final int $stable = 8;
    private final boolean isFullyExpanded;
    private final BigDecimal tradeValueMultiplier;
    private final OptionChain.UnderlyingType underlyingType;

    public static /* synthetic */ OptionsProfitAndLossChartPostProcessParams copy$default(OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams, BigDecimal bigDecimal, boolean z, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = optionsProfitAndLossChartPostProcessParams.tradeValueMultiplier;
        }
        if ((i & 2) != 0) {
            z = optionsProfitAndLossChartPostProcessParams.isFullyExpanded;
        }
        if ((i & 4) != 0) {
            underlyingType = optionsProfitAndLossChartPostProcessParams.underlyingType;
        }
        return optionsProfitAndLossChartPostProcessParams.copy(bigDecimal, z, underlyingType);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getTradeValueMultiplier() {
        return this.tradeValueMultiplier;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFullyExpanded() {
        return this.isFullyExpanded;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final OptionsProfitAndLossChartPostProcessParams copy(BigDecimal tradeValueMultiplier, boolean isFullyExpanded, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(tradeValueMultiplier, "tradeValueMultiplier");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return new OptionsProfitAndLossChartPostProcessParams(tradeValueMultiplier, isFullyExpanded, underlyingType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitAndLossChartPostProcessParams)) {
            return false;
        }
        OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams = (OptionsProfitAndLossChartPostProcessParams) other;
        return Intrinsics.areEqual(this.tradeValueMultiplier, optionsProfitAndLossChartPostProcessParams.tradeValueMultiplier) && this.isFullyExpanded == optionsProfitAndLossChartPostProcessParams.isFullyExpanded && this.underlyingType == optionsProfitAndLossChartPostProcessParams.underlyingType;
    }

    public int hashCode() {
        return (((this.tradeValueMultiplier.hashCode() * 31) + Boolean.hashCode(this.isFullyExpanded)) * 31) + this.underlyingType.hashCode();
    }

    public String toString() {
        return "OptionsProfitAndLossChartPostProcessParams(tradeValueMultiplier=" + this.tradeValueMultiplier + ", isFullyExpanded=" + this.isFullyExpanded + ", underlyingType=" + this.underlyingType + ")";
    }

    public OptionsProfitAndLossChartPostProcessParams(BigDecimal tradeValueMultiplier, boolean z, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(tradeValueMultiplier, "tradeValueMultiplier");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.tradeValueMultiplier = tradeValueMultiplier;
        this.isFullyExpanded = z;
        this.underlyingType = underlyingType;
    }

    public final BigDecimal getTradeValueMultiplier() {
        return this.tradeValueMultiplier;
    }

    public final boolean isFullyExpanded() {
        return this.isFullyExpanded;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }
}
