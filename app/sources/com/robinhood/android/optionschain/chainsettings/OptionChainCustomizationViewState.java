package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.android.optionchain.chainsettings.OptionChainEntryPointType;
import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainCustomizationViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u008e\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\rHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u0011\u0010-\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationViewState;", "", "entryPointId", "", "entryPointType", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;", "headerTitle", "highlightedMetric", "Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "selectedMetricOne", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "selectedMetricTwo", "highlightedCategoryIndex", "", "highlightedCategoryLabel", "availableMetrics", "Lcom/robinhood/models/db/OptionChainAvailableMetrics;", "metricsInHighlightedCategory", "Lkotlinx/collections/immutable/ImmutableList;", "userSeenContext", "Lcom/robinhood/models/api/OptionSeenContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;Ljava/lang/String;Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/db/OptionChainAvailableMetrics;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/OptionSeenContext;)V", "getEntryPointId", "()Ljava/lang/String;", "getEntryPointType", "()Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;", "getHeaderTitle", "getHighlightedMetric", "()Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "getSelectedMetricOne", "()Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "getSelectedMetricTwo", "getHighlightedCategoryIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHighlightedCategoryLabel", "getAvailableMetrics", "()Lcom/robinhood/models/db/OptionChainAvailableMetrics;", "getMetricsInHighlightedCategory", "()Lkotlinx/collections/immutable/ImmutableList;", "getUserSeenContext", "()Lcom/robinhood/models/api/OptionSeenContext;", "selectedMetricLabelOne", "getSelectedMetricLabelOne", "selectedMetricLabelTwo", "getSelectedMetricLabelTwo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;Ljava/lang/String;Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/db/OptionChainAvailableMetrics;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/OptionSeenContext;)Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationViewState;", "equals", "", "other", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainCustomizationViewState {
    public static final int $stable = 8;
    private final OptionChainAvailableMetrics availableMetrics;
    private final String entryPointId;
    private final OptionChainEntryPointType entryPointType;
    private final String headerTitle;
    private final Integer highlightedCategoryIndex;
    private final String highlightedCategoryLabel;
    private final OptionChainCustomizationDataState2 highlightedMetric;
    private final ImmutableList<OptionChainAvailableMetrics.Metric> metricsInHighlightedCategory;
    private final String selectedMetricLabelOne;
    private final String selectedMetricLabelTwo;
    private final OptionChainAvailableMetrics.Metric selectedMetricOne;
    private final OptionChainAvailableMetrics.Metric selectedMetricTwo;
    private final OptionSeenContext userSeenContext;

    public static /* synthetic */ OptionChainCustomizationViewState copy$default(OptionChainCustomizationViewState optionChainCustomizationViewState, String str, OptionChainEntryPointType optionChainEntryPointType, String str2, OptionChainCustomizationDataState2 optionChainCustomizationDataState2, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, Integer num, String str3, OptionChainAvailableMetrics optionChainAvailableMetrics, ImmutableList immutableList, OptionSeenContext optionSeenContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionChainCustomizationViewState.entryPointId;
        }
        if ((i & 2) != 0) {
            optionChainEntryPointType = optionChainCustomizationViewState.entryPointType;
        }
        if ((i & 4) != 0) {
            str2 = optionChainCustomizationViewState.headerTitle;
        }
        if ((i & 8) != 0) {
            optionChainCustomizationDataState2 = optionChainCustomizationViewState.highlightedMetric;
        }
        if ((i & 16) != 0) {
            metric = optionChainCustomizationViewState.selectedMetricOne;
        }
        if ((i & 32) != 0) {
            metric2 = optionChainCustomizationViewState.selectedMetricTwo;
        }
        if ((i & 64) != 0) {
            num = optionChainCustomizationViewState.highlightedCategoryIndex;
        }
        if ((i & 128) != 0) {
            str3 = optionChainCustomizationViewState.highlightedCategoryLabel;
        }
        if ((i & 256) != 0) {
            optionChainAvailableMetrics = optionChainCustomizationViewState.availableMetrics;
        }
        if ((i & 512) != 0) {
            immutableList = optionChainCustomizationViewState.metricsInHighlightedCategory;
        }
        if ((i & 1024) != 0) {
            optionSeenContext = optionChainCustomizationViewState.userSeenContext;
        }
        ImmutableList immutableList2 = immutableList;
        OptionSeenContext optionSeenContext2 = optionSeenContext;
        String str4 = str3;
        OptionChainAvailableMetrics optionChainAvailableMetrics2 = optionChainAvailableMetrics;
        OptionChainAvailableMetrics.Metric metric3 = metric2;
        Integer num2 = num;
        OptionChainAvailableMetrics.Metric metric4 = metric;
        String str5 = str2;
        return optionChainCustomizationViewState.copy(str, optionChainEntryPointType, str5, optionChainCustomizationDataState2, metric4, metric3, num2, str4, optionChainAvailableMetrics2, immutableList2, optionSeenContext2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntryPointId() {
        return this.entryPointId;
    }

    public final ImmutableList<OptionChainAvailableMetrics.Metric> component10() {
        return this.metricsInHighlightedCategory;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionSeenContext getUserSeenContext() {
        return this.userSeenContext;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainEntryPointType getEntryPointType() {
        return this.entryPointType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChainCustomizationDataState2 getHighlightedMetric() {
        return this.highlightedMetric;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getSelectedMetricOne() {
        return this.selectedMetricOne;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChainAvailableMetrics.Metric getSelectedMetricTwo() {
        return this.selectedMetricTwo;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getHighlightedCategoryIndex() {
        return this.highlightedCategoryIndex;
    }

    /* renamed from: component8, reason: from getter */
    public final String getHighlightedCategoryLabel() {
        return this.highlightedCategoryLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionChainAvailableMetrics getAvailableMetrics() {
        return this.availableMetrics;
    }

    public final OptionChainCustomizationViewState copy(String entryPointId, OptionChainEntryPointType entryPointType, String headerTitle, OptionChainCustomizationDataState2 highlightedMetric, OptionChainAvailableMetrics.Metric selectedMetricOne, OptionChainAvailableMetrics.Metric selectedMetricTwo, Integer highlightedCategoryIndex, String highlightedCategoryLabel, OptionChainAvailableMetrics availableMetrics, ImmutableList<OptionChainAvailableMetrics.Metric> metricsInHighlightedCategory, OptionSeenContext userSeenContext) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        Intrinsics.checkNotNullParameter(selectedMetricOne, "selectedMetricOne");
        Intrinsics.checkNotNullParameter(selectedMetricTwo, "selectedMetricTwo");
        Intrinsics.checkNotNullParameter(metricsInHighlightedCategory, "metricsInHighlightedCategory");
        return new OptionChainCustomizationViewState(entryPointId, entryPointType, headerTitle, highlightedMetric, selectedMetricOne, selectedMetricTwo, highlightedCategoryIndex, highlightedCategoryLabel, availableMetrics, metricsInHighlightedCategory, userSeenContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainCustomizationViewState)) {
            return false;
        }
        OptionChainCustomizationViewState optionChainCustomizationViewState = (OptionChainCustomizationViewState) other;
        return Intrinsics.areEqual(this.entryPointId, optionChainCustomizationViewState.entryPointId) && this.entryPointType == optionChainCustomizationViewState.entryPointType && Intrinsics.areEqual(this.headerTitle, optionChainCustomizationViewState.headerTitle) && this.highlightedMetric == optionChainCustomizationViewState.highlightedMetric && Intrinsics.areEqual(this.selectedMetricOne, optionChainCustomizationViewState.selectedMetricOne) && Intrinsics.areEqual(this.selectedMetricTwo, optionChainCustomizationViewState.selectedMetricTwo) && Intrinsics.areEqual(this.highlightedCategoryIndex, optionChainCustomizationViewState.highlightedCategoryIndex) && Intrinsics.areEqual(this.highlightedCategoryLabel, optionChainCustomizationViewState.highlightedCategoryLabel) && Intrinsics.areEqual(this.availableMetrics, optionChainCustomizationViewState.availableMetrics) && Intrinsics.areEqual(this.metricsInHighlightedCategory, optionChainCustomizationViewState.metricsInHighlightedCategory) && this.userSeenContext == optionChainCustomizationViewState.userSeenContext;
    }

    public int hashCode() {
        String str = this.entryPointId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OptionChainEntryPointType optionChainEntryPointType = this.entryPointType;
        int iHashCode2 = (((((((((iHashCode + (optionChainEntryPointType == null ? 0 : optionChainEntryPointType.hashCode())) * 31) + this.headerTitle.hashCode()) * 31) + this.highlightedMetric.hashCode()) * 31) + this.selectedMetricOne.hashCode()) * 31) + this.selectedMetricTwo.hashCode()) * 31;
        Integer num = this.highlightedCategoryIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.highlightedCategoryLabel;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OptionChainAvailableMetrics optionChainAvailableMetrics = this.availableMetrics;
        int iHashCode5 = (((iHashCode4 + (optionChainAvailableMetrics == null ? 0 : optionChainAvailableMetrics.hashCode())) * 31) + this.metricsInHighlightedCategory.hashCode()) * 31;
        OptionSeenContext optionSeenContext = this.userSeenContext;
        return iHashCode5 + (optionSeenContext != null ? optionSeenContext.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainCustomizationViewState(entryPointId=" + this.entryPointId + ", entryPointType=" + this.entryPointType + ", headerTitle=" + this.headerTitle + ", highlightedMetric=" + this.highlightedMetric + ", selectedMetricOne=" + this.selectedMetricOne + ", selectedMetricTwo=" + this.selectedMetricTwo + ", highlightedCategoryIndex=" + this.highlightedCategoryIndex + ", highlightedCategoryLabel=" + this.highlightedCategoryLabel + ", availableMetrics=" + this.availableMetrics + ", metricsInHighlightedCategory=" + this.metricsInHighlightedCategory + ", userSeenContext=" + this.userSeenContext + ")";
    }

    public OptionChainCustomizationViewState(String str, OptionChainEntryPointType optionChainEntryPointType, String headerTitle, OptionChainCustomizationDataState2 highlightedMetric, OptionChainAvailableMetrics.Metric selectedMetricOne, OptionChainAvailableMetrics.Metric selectedMetricTwo, Integer num, String str2, OptionChainAvailableMetrics optionChainAvailableMetrics, ImmutableList<OptionChainAvailableMetrics.Metric> metricsInHighlightedCategory, OptionSeenContext optionSeenContext) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        Intrinsics.checkNotNullParameter(selectedMetricOne, "selectedMetricOne");
        Intrinsics.checkNotNullParameter(selectedMetricTwo, "selectedMetricTwo");
        Intrinsics.checkNotNullParameter(metricsInHighlightedCategory, "metricsInHighlightedCategory");
        this.entryPointId = str;
        this.entryPointType = optionChainEntryPointType;
        this.headerTitle = headerTitle;
        this.highlightedMetric = highlightedMetric;
        this.selectedMetricOne = selectedMetricOne;
        this.selectedMetricTwo = selectedMetricTwo;
        this.highlightedCategoryIndex = num;
        this.highlightedCategoryLabel = str2;
        this.availableMetrics = optionChainAvailableMetrics;
        this.metricsInHighlightedCategory = metricsInHighlightedCategory;
        this.userSeenContext = optionSeenContext;
        this.selectedMetricLabelOne = selectedMetricOne.getMetricLabel();
        this.selectedMetricLabelTwo = selectedMetricTwo.getMetricLabel();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OptionChainCustomizationViewState(String str, OptionChainEntryPointType optionChainEntryPointType, String str2, OptionChainCustomizationDataState2 optionChainCustomizationDataState2, OptionChainAvailableMetrics.Metric metric, OptionChainAvailableMetrics.Metric metric2, Integer num, String str3, OptionChainAvailableMetrics optionChainAvailableMetrics, ImmutableList immutableList, OptionSeenContext optionSeenContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        OptionSeenContext optionSeenContext2;
        ImmutableList immutableList2;
        OptionChainAvailableMetrics optionChainAvailableMetrics2;
        str = (i & 1) != 0 ? null : str;
        optionChainEntryPointType = (i & 2) != 0 ? null : optionChainEntryPointType;
        num = (i & 64) != 0 ? null : num;
        if ((i & 256) != 0) {
            optionSeenContext2 = optionSeenContext;
            immutableList2 = immutableList;
            optionChainAvailableMetrics2 = null;
        } else {
            optionSeenContext2 = optionSeenContext;
            immutableList2 = immutableList;
            optionChainAvailableMetrics2 = optionChainAvailableMetrics;
        }
        this(str, optionChainEntryPointType, str2, optionChainCustomizationDataState2, metric, metric2, num, str3, optionChainAvailableMetrics2, immutableList2, optionSeenContext2);
    }

    public final String getEntryPointId() {
        return this.entryPointId;
    }

    public final OptionChainEntryPointType getEntryPointType() {
        return this.entryPointType;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
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

    public final String getHighlightedCategoryLabel() {
        return this.highlightedCategoryLabel;
    }

    public final OptionChainAvailableMetrics getAvailableMetrics() {
        return this.availableMetrics;
    }

    public final ImmutableList<OptionChainAvailableMetrics.Metric> getMetricsInHighlightedCategory() {
        return this.metricsInHighlightedCategory;
    }

    public final OptionSeenContext getUserSeenContext() {
        return this.userSeenContext;
    }

    public final String getSelectedMetricLabelOne() {
        return this.selectedMetricLabelOne;
    }

    public final String getSelectedMetricLabelTwo() {
        return this.selectedMetricLabelTwo;
    }
}
