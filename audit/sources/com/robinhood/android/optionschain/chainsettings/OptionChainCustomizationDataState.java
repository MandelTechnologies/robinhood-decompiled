package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003JR\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;", "highlightedMetric", "Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "selectedMetricOne", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "selectedMetricTwo", "highlightedCategoryIndex", "", "availableMetrics", "Lcom/robinhood/models/db/OptionChainAvailableMetrics;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChainAvailableMetrics;)V", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;", "getHighlightedMetric", "()Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "getSelectedMetricOne", "()Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "getSelectedMetricTwo", "getHighlightedCategoryIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvailableMetrics", "()Lcom/robinhood/models/db/OptionChainAvailableMetrics;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "strategyType", "Lcom/robinhood/models/api/OptionStrategyType;", "getStrategyType", "()Lcom/robinhood/models/api/OptionStrategyType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChainAvailableMetrics;)Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;", "equals", "", "other", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainCustomizationDataState {
    public static final int $stable = 8;
    private final OptionChainAvailableMetrics availableMetrics;
    private final Integer highlightedCategoryIndex;
    private final OptionChainCustomizationDataState2 highlightedMetric;
    private final OptionChainCustomizationLaunchMode launchMode;
    private final OrderSide orderSide;
    private final OptionChainAvailableMetrics.Metric selectedMetricOne;
    private final OptionChainAvailableMetrics.Metric selectedMetricTwo;
    private final OptionStrategyType strategyType;

    public static /* synthetic */ OptionChainCustomizationDataState copy$default(OptionChainCustomizationDataState optionChainCustomizationDataState, OptionChainCustomizationLaunchMode optionChainCustomizationLaunchMode, OptionChainCustomizationDataState2 optionChainCustomizationDataState2, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, Integer num, OptionChainAvailableMetrics optionChainAvailableMetrics, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainCustomizationLaunchMode = optionChainCustomizationDataState.launchMode;
        }
        if ((i & 2) != 0) {
            optionChainCustomizationDataState2 = optionChainCustomizationDataState.highlightedMetric;
        }
        if ((i & 4) != 0) {
            metric = optionChainCustomizationDataState.selectedMetricOne;
        }
        if ((i & 8) != 0) {
            metric2 = optionChainCustomizationDataState.selectedMetricTwo;
        }
        if ((i & 16) != 0) {
            num = optionChainCustomizationDataState.highlightedCategoryIndex;
        }
        if ((i & 32) != 0) {
            optionChainAvailableMetrics = optionChainCustomizationDataState.availableMetrics;
        }
        Integer num2 = num;
        OptionChainAvailableMetrics optionChainAvailableMetrics2 = optionChainAvailableMetrics;
        return optionChainCustomizationDataState.copy(optionChainCustomizationLaunchMode, optionChainCustomizationDataState2, metric, metric2, num2, optionChainAvailableMetrics2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainCustomizationLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainCustomizationDataState2 getHighlightedMetric() {
        return this.highlightedMetric;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getSelectedMetricOne() {
        return this.selectedMetricOne;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getSelectedMetricTwo() {
        return this.selectedMetricTwo;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHighlightedCategoryIndex() {
        return this.highlightedCategoryIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChainAvailableMetrics getAvailableMetrics() {
        return this.availableMetrics;
    }

    public final OptionChainCustomizationDataState copy(OptionChainCustomizationLaunchMode launchMode, OptionChainCustomizationDataState2 highlightedMetric, OptionChainAvailableMetrics.Metric selectedMetricOne, OptionChainAvailableMetrics.Metric selectedMetricTwo, Integer highlightedCategoryIndex, OptionChainAvailableMetrics availableMetrics) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        return new OptionChainCustomizationDataState(launchMode, highlightedMetric, selectedMetricOne, selectedMetricTwo, highlightedCategoryIndex, availableMetrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainCustomizationDataState)) {
            return false;
        }
        OptionChainCustomizationDataState optionChainCustomizationDataState = (OptionChainCustomizationDataState) other;
        return Intrinsics.areEqual(this.launchMode, optionChainCustomizationDataState.launchMode) && this.highlightedMetric == optionChainCustomizationDataState.highlightedMetric && Intrinsics.areEqual(this.selectedMetricOne, optionChainCustomizationDataState.selectedMetricOne) && Intrinsics.areEqual(this.selectedMetricTwo, optionChainCustomizationDataState.selectedMetricTwo) && Intrinsics.areEqual(this.highlightedCategoryIndex, optionChainCustomizationDataState.highlightedCategoryIndex) && Intrinsics.areEqual(this.availableMetrics, optionChainCustomizationDataState.availableMetrics);
    }

    public int hashCode() {
        int iHashCode = ((this.launchMode.hashCode() * 31) + this.highlightedMetric.hashCode()) * 31;
        OptionChainAvailableMetrics.Metric metric = this.selectedMetricOne;
        int iHashCode2 = (iHashCode + (metric == null ? 0 : metric.hashCode())) * 31;
        OptionChainAvailableMetrics.Metric metric2 = this.selectedMetricTwo;
        int iHashCode3 = (iHashCode2 + (metric2 == null ? 0 : metric2.hashCode())) * 31;
        Integer num = this.highlightedCategoryIndex;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OptionChainAvailableMetrics optionChainAvailableMetrics = this.availableMetrics;
        return iHashCode4 + (optionChainAvailableMetrics != null ? optionChainAvailableMetrics.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainCustomizationDataState(launchMode=" + this.launchMode + ", highlightedMetric=" + this.highlightedMetric + ", selectedMetricOne=" + this.selectedMetricOne + ", selectedMetricTwo=" + this.selectedMetricTwo + ", highlightedCategoryIndex=" + this.highlightedCategoryIndex + ", availableMetrics=" + this.availableMetrics + ")";
    }

    public OptionChainCustomizationDataState(OptionChainCustomizationLaunchMode launchMode, OptionChainCustomizationDataState2 highlightedMetric, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, Integer num, OptionChainAvailableMetrics optionChainAvailableMetrics) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        this.launchMode = launchMode;
        this.highlightedMetric = highlightedMetric;
        this.selectedMetricOne = metric;
        this.selectedMetricTwo = metric2;
        this.highlightedCategoryIndex = num;
        this.availableMetrics = optionChainAvailableMetrics;
        OptionChainCustomizationLaunchMode.MainChain mainChain = launchMode instanceof OptionChainCustomizationLaunchMode.MainChain ? (OptionChainCustomizationLaunchMode.MainChain) launchMode : null;
        this.orderSide = mainChain != null ? mainChain.getOrderSide() : null;
        OptionChainCustomizationLaunchMode.StrategyBuilder strategyBuilder = launchMode instanceof OptionChainCustomizationLaunchMode.StrategyBuilder ? (OptionChainCustomizationLaunchMode.StrategyBuilder) launchMode : null;
        this.strategyType = strategyBuilder != null ? strategyBuilder.getStrategyType() : null;
    }

    public final OptionChainCustomizationLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public /* synthetic */ OptionChainCustomizationDataState(OptionChainCustomizationLaunchMode optionChainCustomizationLaunchMode, OptionChainCustomizationDataState2 optionChainCustomizationDataState2, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, Integer num, OptionChainAvailableMetrics optionChainAvailableMetrics, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionChainCustomizationLaunchMode, (i & 2) != 0 ? OptionChainCustomizationDataState2.METRIC_ONE : optionChainCustomizationDataState2, (i & 4) != 0 ? null : metric, (i & 8) != 0 ? null : metric2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : optionChainAvailableMetrics);
    }

    public final OptionChainCustomizationDataState2 getHighlightedMetric() {
        return this.highlightedMetric;
    }

    public final OptionChainAvailableMetrics.Metric getSelectedMetricOne() {
        return this.selectedMetricOne;
    }

    public final OptionChainAvailableMetrics.Metric getSelectedMetricTwo() {
        return this.selectedMetricTwo;
    }

    public final Integer getHighlightedCategoryIndex() {
        return this.highlightedCategoryIndex;
    }

    public final OptionChainAvailableMetrics getAvailableMetrics() {
        return this.availableMetrics;
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final OptionStrategyType getStrategyType() {
        return this.strategyType;
    }
}
