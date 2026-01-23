package com.robinhood.android.advanced.alert;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AdvancedAlertCreateBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetViewState;", "", "currentPriceDouble", "", "<init>", "(D)V", "getCurrentPriceDouble", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AdvancedAlertCreateBottomSheetViewState {
    public static final int $stable = 0;
    private final double currentPriceDouble;

    public AdvancedAlertCreateBottomSheetViewState() {
        this(0.0d, 1, null);
    }

    public static /* synthetic */ AdvancedAlertCreateBottomSheetViewState copy$default(AdvancedAlertCreateBottomSheetViewState advancedAlertCreateBottomSheetViewState, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = advancedAlertCreateBottomSheetViewState.currentPriceDouble;
        }
        return advancedAlertCreateBottomSheetViewState.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final double getCurrentPriceDouble() {
        return this.currentPriceDouble;
    }

    public final AdvancedAlertCreateBottomSheetViewState copy(double currentPriceDouble) {
        return new AdvancedAlertCreateBottomSheetViewState(currentPriceDouble);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdvancedAlertCreateBottomSheetViewState) && Double.compare(this.currentPriceDouble, ((AdvancedAlertCreateBottomSheetViewState) other).currentPriceDouble) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.currentPriceDouble);
    }

    public String toString() {
        return "AdvancedAlertCreateBottomSheetViewState(currentPriceDouble=" + this.currentPriceDouble + ")";
    }

    public AdvancedAlertCreateBottomSheetViewState(double d) {
        this.currentPriceDouble = d;
    }

    public /* synthetic */ AdvancedAlertCreateBottomSheetViewState(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d);
    }

    public final double getCurrentPriceDouble() {
        return this.currentPriceDouble;
    }
}
