package com.robinhood.android.equity.ordercheck.p122ui;

import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderChecksBreakdownRowView.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/State;", "", "breakdownRow", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$Section$BreakdownRow;", "showTopDivider", "", "<init>", "(Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$Section$BreakdownRow;Z)V", "getBreakdownRow", "()Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$Section$BreakdownRow;", "getShowTopDivider", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class State {
    public static final int $stable = 8;
    private final VisibleEquityOrderChecksAlert.Section.BreakdownRow breakdownRow;
    private final boolean showTopDivider;

    public static /* synthetic */ State copy$default(State state, VisibleEquityOrderChecksAlert.Section.BreakdownRow breakdownRow, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            breakdownRow = state.breakdownRow;
        }
        if ((i & 2) != 0) {
            z = state.showTopDivider;
        }
        return state.copy(breakdownRow, z);
    }

    /* renamed from: component1, reason: from getter */
    public final VisibleEquityOrderChecksAlert.Section.BreakdownRow getBreakdownRow() {
        return this.breakdownRow;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowTopDivider() {
        return this.showTopDivider;
    }

    public final State copy(VisibleEquityOrderChecksAlert.Section.BreakdownRow breakdownRow, boolean showTopDivider) {
        Intrinsics.checkNotNullParameter(breakdownRow, "breakdownRow");
        return new State(breakdownRow, showTopDivider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return Intrinsics.areEqual(this.breakdownRow, state.breakdownRow) && this.showTopDivider == state.showTopDivider;
    }

    public int hashCode() {
        return (this.breakdownRow.hashCode() * 31) + Boolean.hashCode(this.showTopDivider);
    }

    public String toString() {
        return "State(breakdownRow=" + this.breakdownRow + ", showTopDivider=" + this.showTopDivider + ")";
    }

    public State(VisibleEquityOrderChecksAlert.Section.BreakdownRow breakdownRow, boolean z) {
        Intrinsics.checkNotNullParameter(breakdownRow, "breakdownRow");
        this.breakdownRow = breakdownRow;
        this.showTopDivider = z;
    }

    public final VisibleEquityOrderChecksAlert.Section.BreakdownRow getBreakdownRow() {
        return this.breakdownRow;
    }

    public final boolean getShowTopDivider() {
        return this.showTopDivider;
    }
}
