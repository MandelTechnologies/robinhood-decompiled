package com.robinhood.android.trade.options;

import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTimeInForcePickerComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerRowState;", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "selectedTimeInForce", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getSelectedTimeInForce", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderTimeInForcePickerRowState {
    public static final int $stable = 0;
    private final OrderTimeInForce selectedTimeInForce;
    private final OrderTimeInForce timeInForce;

    public static /* synthetic */ OptionOrderTimeInForcePickerRowState copy$default(OptionOrderTimeInForcePickerRowState optionOrderTimeInForcePickerRowState, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTimeInForce = optionOrderTimeInForcePickerRowState.timeInForce;
        }
        if ((i & 2) != 0) {
            orderTimeInForce2 = optionOrderTimeInForcePickerRowState.selectedTimeInForce;
        }
        return optionOrderTimeInForcePickerRowState.copy(orderTimeInForce, orderTimeInForce2);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final OptionOrderTimeInForcePickerRowState copy(OrderTimeInForce timeInForce, OrderTimeInForce selectedTimeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        return new OptionOrderTimeInForcePickerRowState(timeInForce, selectedTimeInForce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderTimeInForcePickerRowState)) {
            return false;
        }
        OptionOrderTimeInForcePickerRowState optionOrderTimeInForcePickerRowState = (OptionOrderTimeInForcePickerRowState) other;
        return this.timeInForce == optionOrderTimeInForcePickerRowState.timeInForce && this.selectedTimeInForce == optionOrderTimeInForcePickerRowState.selectedTimeInForce;
    }

    public int hashCode() {
        return (this.timeInForce.hashCode() * 31) + this.selectedTimeInForce.hashCode();
    }

    public String toString() {
        return "OptionOrderTimeInForcePickerRowState(timeInForce=" + this.timeInForce + ", selectedTimeInForce=" + this.selectedTimeInForce + ")";
    }

    public OptionOrderTimeInForcePickerRowState(OrderTimeInForce timeInForce, OrderTimeInForce selectedTimeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        this.timeInForce = timeInForce;
        this.selectedTimeInForce = selectedTimeInForce;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }
}
