package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;", "", "hasSelectedTemplate", "", "allIndicators", "Lkotlinx/collections/immutable/ImmutableList;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorDto;", "popularIndicators", "selectedIndicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getHasSelectedTemplate", "()Z", "getAllIndicators", "()Lkotlinx/collections/immutable/ImmutableList;", "getPopularIndicators", "getSelectedIndicators", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AddIndicatorScreenState {
    public static final int $stable = 8;
    private final ImmutableList<IndicatorDto> allIndicators;
    private final boolean hasSelectedTemplate;
    private final ImmutableList<IndicatorDto> popularIndicators;
    private final ImmutableList<IndicatorStateDto> selectedIndicators;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddIndicatorScreenState copy$default(AddIndicatorScreenState addIndicatorScreenState, boolean z, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addIndicatorScreenState.hasSelectedTemplate;
        }
        if ((i & 2) != 0) {
            immutableList = addIndicatorScreenState.allIndicators;
        }
        if ((i & 4) != 0) {
            immutableList2 = addIndicatorScreenState.popularIndicators;
        }
        if ((i & 8) != 0) {
            immutableList3 = addIndicatorScreenState.selectedIndicators;
        }
        return addIndicatorScreenState.copy(z, immutableList, immutableList2, immutableList3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSelectedTemplate() {
        return this.hasSelectedTemplate;
    }

    public final ImmutableList<IndicatorDto> component2() {
        return this.allIndicators;
    }

    public final ImmutableList<IndicatorDto> component3() {
        return this.popularIndicators;
    }

    public final ImmutableList<IndicatorStateDto> component4() {
        return this.selectedIndicators;
    }

    public final AddIndicatorScreenState copy(boolean hasSelectedTemplate, ImmutableList<IndicatorDto> allIndicators, ImmutableList<IndicatorDto> popularIndicators, ImmutableList<IndicatorStateDto> selectedIndicators) {
        Intrinsics.checkNotNullParameter(allIndicators, "allIndicators");
        Intrinsics.checkNotNullParameter(popularIndicators, "popularIndicators");
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        return new AddIndicatorScreenState(hasSelectedTemplate, allIndicators, popularIndicators, selectedIndicators);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddIndicatorScreenState)) {
            return false;
        }
        AddIndicatorScreenState addIndicatorScreenState = (AddIndicatorScreenState) other;
        return this.hasSelectedTemplate == addIndicatorScreenState.hasSelectedTemplate && Intrinsics.areEqual(this.allIndicators, addIndicatorScreenState.allIndicators) && Intrinsics.areEqual(this.popularIndicators, addIndicatorScreenState.popularIndicators) && Intrinsics.areEqual(this.selectedIndicators, addIndicatorScreenState.selectedIndicators);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.hasSelectedTemplate) * 31) + this.allIndicators.hashCode()) * 31) + this.popularIndicators.hashCode()) * 31) + this.selectedIndicators.hashCode();
    }

    public String toString() {
        return "AddIndicatorScreenState(hasSelectedTemplate=" + this.hasSelectedTemplate + ", allIndicators=" + this.allIndicators + ", popularIndicators=" + this.popularIndicators + ", selectedIndicators=" + this.selectedIndicators + ")";
    }

    public AddIndicatorScreenState(boolean z, ImmutableList<IndicatorDto> allIndicators, ImmutableList<IndicatorDto> popularIndicators, ImmutableList<IndicatorStateDto> selectedIndicators) {
        Intrinsics.checkNotNullParameter(allIndicators, "allIndicators");
        Intrinsics.checkNotNullParameter(popularIndicators, "popularIndicators");
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        this.hasSelectedTemplate = z;
        this.allIndicators = allIndicators;
        this.popularIndicators = popularIndicators;
        this.selectedIndicators = selectedIndicators;
    }

    public final boolean getHasSelectedTemplate() {
        return this.hasSelectedTemplate;
    }

    public final ImmutableList<IndicatorDto> getAllIndicators() {
        return this.allIndicators;
    }

    public final ImmutableList<IndicatorDto> getPopularIndicators() {
        return this.popularIndicators;
    }

    public final ImmutableList<IndicatorStateDto> getSelectedIndicators() {
        return this.selectedIndicators;
    }
}
