package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorStateList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedChartIndicatorListViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListViewState;", "", "indicatorStateList", "Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "addIndicatorExperimentVariant", "Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3$Variant;", "<init>", "(Lcom/robinhood/android/advanced/chart/IndicatorStateList;Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3$Variant;)V", "getIndicatorStateList", "()Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "getAddIndicatorExperimentVariant", "()Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3$Variant;", "indicatorStateListWithVariants", "", "Lcom/robinhood/android/advancedchart/config/IndicatorViewItemState;", "getIndicatorStateListWithVariants", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AdvancedChartIndicatorListViewState {
    public static final int $stable = 8;
    private final AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant addIndicatorExperimentVariant;
    private final IndicatorStateList indicatorStateList;
    private final List<IndicatorViewItemState> indicatorStateListWithVariants;

    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedChartIndicatorListViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdvancedChartIndicatorListViewState copy$default(AdvancedChartIndicatorListViewState advancedChartIndicatorListViewState, IndicatorStateList indicatorStateList, AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            indicatorStateList = advancedChartIndicatorListViewState.indicatorStateList;
        }
        if ((i & 2) != 0) {
            variant = advancedChartIndicatorListViewState.addIndicatorExperimentVariant;
        }
        return advancedChartIndicatorListViewState.copy(indicatorStateList, variant);
    }

    /* renamed from: component1, reason: from getter */
    public final IndicatorStateList getIndicatorStateList() {
        return this.indicatorStateList;
    }

    /* renamed from: component2, reason: from getter */
    public final AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant getAddIndicatorExperimentVariant() {
        return this.addIndicatorExperimentVariant;
    }

    public final AdvancedChartIndicatorListViewState copy(IndicatorStateList indicatorStateList, AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant addIndicatorExperimentVariant) {
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        Intrinsics.checkNotNullParameter(addIndicatorExperimentVariant, "addIndicatorExperimentVariant");
        return new AdvancedChartIndicatorListViewState(indicatorStateList, addIndicatorExperimentVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartIndicatorListViewState)) {
            return false;
        }
        AdvancedChartIndicatorListViewState advancedChartIndicatorListViewState = (AdvancedChartIndicatorListViewState) other;
        return Intrinsics.areEqual(this.indicatorStateList, advancedChartIndicatorListViewState.indicatorStateList) && this.addIndicatorExperimentVariant == advancedChartIndicatorListViewState.addIndicatorExperimentVariant;
    }

    public int hashCode() {
        return (this.indicatorStateList.hashCode() * 31) + this.addIndicatorExperimentVariant.hashCode();
    }

    public String toString() {
        return "AdvancedChartIndicatorListViewState(indicatorStateList=" + this.indicatorStateList + ", addIndicatorExperimentVariant=" + this.addIndicatorExperimentVariant + ")";
    }

    public AdvancedChartIndicatorListViewState(IndicatorStateList indicatorStateList, AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant addIndicatorExperimentVariant) {
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        Intrinsics.checkNotNullParameter(addIndicatorExperimentVariant, "addIndicatorExperimentVariant");
        this.indicatorStateList = indicatorStateList;
        this.addIndicatorExperimentVariant = addIndicatorExperimentVariant;
        List<IndicatorState> indicatorStates = indicatorStateList.getIndicatorStates();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indicatorStates, 10));
        Iterator<T> it = indicatorStates.iterator();
        while (it.hasNext()) {
            arrayList.add(new IndicatorViewItemState((IndicatorState) it.next(), this.addIndicatorExperimentVariant == AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant.BOTTOM_BUTTON_WITH_TOGGLE));
        }
        this.indicatorStateListWithVariants = arrayList;
    }

    public /* synthetic */ AdvancedChartIndicatorListViewState(IndicatorStateList indicatorStateList, AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IndicatorStateList(CollectionsKt.emptyList(), 0L) : indicatorStateList, (i & 2) != 0 ? AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant.CONTROL : variant);
    }

    public final IndicatorStateList getIndicatorStateList() {
        return this.indicatorStateList;
    }

    public final AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant getAddIndicatorExperimentVariant() {
        return this.addIndicatorExperimentVariant;
    }

    public final List<IndicatorViewItemState> getIndicatorStateListWithVariants() {
        return this.indicatorStateListWithVariants;
    }
}
