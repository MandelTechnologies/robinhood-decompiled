package com.robinhood.android.equities.orderactions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityPendingOrderActionViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/EquityPendingOrderActionViewState;", "", "finishAction", "Lcom/robinhood/android/equities/orderactions/FinishAction;", "dialog", "Lcom/robinhood/android/equities/orderactions/Dialog;", "<init>", "(Lcom/robinhood/android/equities/orderactions/FinishAction;Lcom/robinhood/android/equities/orderactions/Dialog;)V", "getFinishAction", "()Lcom/robinhood/android/equities/orderactions/FinishAction;", "getDialog", "()Lcom/robinhood/android/equities/orderactions/Dialog;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityPendingOrderActionViewState {
    public static final int $stable = 0;
    private final EquityPendingOrderActionDataState2 dialog;
    private final EquityPendingOrderActionViewState2 finishAction;

    public static /* synthetic */ EquityPendingOrderActionViewState copy$default(EquityPendingOrderActionViewState equityPendingOrderActionViewState, EquityPendingOrderActionViewState2 equityPendingOrderActionViewState2, EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2, int i, Object obj) {
        if ((i & 1) != 0) {
            equityPendingOrderActionViewState2 = equityPendingOrderActionViewState.finishAction;
        }
        if ((i & 2) != 0) {
            equityPendingOrderActionDataState2 = equityPendingOrderActionViewState.dialog;
        }
        return equityPendingOrderActionViewState.copy(equityPendingOrderActionViewState2, equityPendingOrderActionDataState2);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityPendingOrderActionViewState2 getFinishAction() {
        return this.finishAction;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityPendingOrderActionDataState2 getDialog() {
        return this.dialog;
    }

    public final EquityPendingOrderActionViewState copy(EquityPendingOrderActionViewState2 finishAction, EquityPendingOrderActionDataState2 dialog) {
        return new EquityPendingOrderActionViewState(finishAction, dialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityPendingOrderActionViewState)) {
            return false;
        }
        EquityPendingOrderActionViewState equityPendingOrderActionViewState = (EquityPendingOrderActionViewState) other;
        return Intrinsics.areEqual(this.finishAction, equityPendingOrderActionViewState.finishAction) && Intrinsics.areEqual(this.dialog, equityPendingOrderActionViewState.dialog);
    }

    public int hashCode() {
        EquityPendingOrderActionViewState2 equityPendingOrderActionViewState2 = this.finishAction;
        int iHashCode = (equityPendingOrderActionViewState2 == null ? 0 : equityPendingOrderActionViewState2.hashCode()) * 31;
        EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2 = this.dialog;
        return iHashCode + (equityPendingOrderActionDataState2 != null ? equityPendingOrderActionDataState2.hashCode() : 0);
    }

    public String toString() {
        return "EquityPendingOrderActionViewState(finishAction=" + this.finishAction + ", dialog=" + this.dialog + ")";
    }

    public EquityPendingOrderActionViewState(EquityPendingOrderActionViewState2 equityPendingOrderActionViewState2, EquityPendingOrderActionDataState2 equityPendingOrderActionDataState2) {
        this.finishAction = equityPendingOrderActionViewState2;
        this.dialog = equityPendingOrderActionDataState2;
    }

    public final EquityPendingOrderActionViewState2 getFinishAction() {
        return this.finishAction;
    }

    public final EquityPendingOrderActionDataState2 getDialog() {
        return this.dialog;
    }
}
