package com.robinhood.android.chart.blackwidowadvancedchart;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/SlideUpScreenState;", "", "addIndicatorScreenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;", "<init>", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;)V", "getAddIndicatorScreenState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SlideUpScreenState {
    public static final int $stable = 8;
    private final AddIndicatorScreenState addIndicatorScreenState;

    public static /* synthetic */ SlideUpScreenState copy$default(SlideUpScreenState slideUpScreenState, AddIndicatorScreenState addIndicatorScreenState, int i, Object obj) {
        if ((i & 1) != 0) {
            addIndicatorScreenState = slideUpScreenState.addIndicatorScreenState;
        }
        return slideUpScreenState.copy(addIndicatorScreenState);
    }

    /* renamed from: component1, reason: from getter */
    public final AddIndicatorScreenState getAddIndicatorScreenState() {
        return this.addIndicatorScreenState;
    }

    public final SlideUpScreenState copy(AddIndicatorScreenState addIndicatorScreenState) {
        return new SlideUpScreenState(addIndicatorScreenState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SlideUpScreenState) && Intrinsics.areEqual(this.addIndicatorScreenState, ((SlideUpScreenState) other).addIndicatorScreenState);
    }

    public int hashCode() {
        AddIndicatorScreenState addIndicatorScreenState = this.addIndicatorScreenState;
        if (addIndicatorScreenState == null) {
            return 0;
        }
        return addIndicatorScreenState.hashCode();
    }

    public String toString() {
        return "SlideUpScreenState(addIndicatorScreenState=" + this.addIndicatorScreenState + ")";
    }

    public SlideUpScreenState(AddIndicatorScreenState addIndicatorScreenState) {
        this.addIndicatorScreenState = addIndicatorScreenState;
    }

    public final AddIndicatorScreenState getAddIndicatorScreenState() {
        return this.addIndicatorScreenState;
    }
}
