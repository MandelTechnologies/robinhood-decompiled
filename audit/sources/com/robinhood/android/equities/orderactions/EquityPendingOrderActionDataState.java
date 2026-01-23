package com.robinhood.android.equities.orderactions;

import com.robinhood.models.p320db.Order;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityPendingOrderActionDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionDataState;", "", "isFinished", "", "orderToReplace", "Lcom/robinhood/models/db/Order;", "dialog", "Lcom/robinhood/android/equities/orderactions/Dialog;", "<init>", "(ZLcom/robinhood/models/db/Order;Lcom/robinhood/android/equities/orderactions/Dialog;)V", "()Z", "getOrderToReplace", "()Lcom/robinhood/models/db/Order;", "getDialog", "()Lcom/robinhood/android/equities/orderactions/Dialog;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityPendingOrderActionDataState {
    public static final int $stable = 8;
    private final EquityPendingOrderActionDataState2 dialog;
    private final boolean isFinished;
    private final Order orderToReplace;

    public EquityPendingOrderActionDataState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ EquityPendingOrderActionDataState copy$default(EquityPendingOrderActionDataState equityPendingOrderActionDataState, boolean z, Order order, EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = equityPendingOrderActionDataState.isFinished;
        }
        if ((i & 2) != 0) {
            order = equityPendingOrderActionDataState.orderToReplace;
        }
        if ((i & 4) != 0) {
            equityPendingOrderActionDataState2 = equityPendingOrderActionDataState.dialog;
        }
        return equityPendingOrderActionDataState.copy(z, order, equityPendingOrderActionDataState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    /* renamed from: component2, reason: from getter */
    public final Order getOrderToReplace() {
        return this.orderToReplace;
    }

    /* renamed from: component3, reason: from getter */
    public final EquityPendingOrderActionDataState2 getDialog() {
        return this.dialog;
    }

    public final EquityPendingOrderActionDataState copy(boolean isFinished, Order orderToReplace, EquityPendingOrderActionDataState2 dialog) {
        return new EquityPendingOrderActionDataState(isFinished, orderToReplace, dialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityPendingOrderActionDataState)) {
            return false;
        }
        EquityPendingOrderActionDataState equityPendingOrderActionDataState = (EquityPendingOrderActionDataState) other;
        return this.isFinished == equityPendingOrderActionDataState.isFinished && Intrinsics.areEqual(this.orderToReplace, equityPendingOrderActionDataState.orderToReplace) && Intrinsics.areEqual(this.dialog, equityPendingOrderActionDataState.dialog);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFinished) * 31;
        Order order = this.orderToReplace;
        int iHashCode2 = (iHashCode + (order == null ? 0 : order.hashCode())) * 31;
        EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2 = this.dialog;
        return iHashCode2 + (equityPendingOrderActionDataState2 != null ? equityPendingOrderActionDataState2.hashCode() : 0);
    }

    public String toString() {
        return "EquityPendingOrderActionDataState(isFinished=" + this.isFinished + ", orderToReplace=" + this.orderToReplace + ", dialog=" + this.dialog + ")";
    }

    public EquityPendingOrderActionDataState(boolean z, Order order, EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2) {
        this.isFinished = z;
        this.orderToReplace = order;
        this.dialog = equityPendingOrderActionDataState2;
    }

    public /* synthetic */ EquityPendingOrderActionDataState(boolean z, Order order, EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : order, (i & 4) != 0 ? null : equityPendingOrderActionDataState2);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public final Order getOrderToReplace() {
        return this.orderToReplace;
    }

    public final EquityPendingOrderActionDataState2 getDialog() {
        return this.dialog;
    }
}
