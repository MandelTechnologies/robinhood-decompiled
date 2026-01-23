package com.robinhood.android.cash.rhy.tab.p076ui.transfers;

import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFundsBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÂ\u0003JW\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0019HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetViewState;", "", "cashCushionStatus", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "promptCashCushionWhenSkipped", "", "hasVisitedCashCushionUpsell", "showCashCushionUpsellEvent", "Lcom/robinhood/udf/UiEvent;", "", "dismissEvent", "cardShipmentPendingFunding", "<init>", "(Lcom/robinhood/models/db/bonfire/CashCushionStatus;ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Z)V", "getCashCushionStatus", "()Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "getPromptCashCushionWhenSkipped", "()Z", "getHasVisitedCashCushionUpsell", "getShowCashCushionUpsellEvent", "()Lcom/robinhood/udf/UiEvent;", "getDismissEvent", "shouldShowCashCushionUpsell", "getShouldShowCashCushionUpsell", "upsellBodyTextRes", "", "getUpsellBodyTextRes", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TransferFundsBottomSheetViewState {
    public static final int $stable = 8;
    private final boolean cardShipmentPendingFunding;
    private final CashCushionStatus cashCushionStatus;
    private final UiEvent<Unit> dismissEvent;
    private final boolean hasVisitedCashCushionUpsell;
    private final boolean promptCashCushionWhenSkipped;
    private final UiEvent<Unit> showCashCushionUpsellEvent;

    public TransferFundsBottomSheetViewState() {
        this(null, false, false, null, null, false, 63, null);
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getCardShipmentPendingFunding() {
        return this.cardShipmentPendingFunding;
    }

    public static /* synthetic */ TransferFundsBottomSheetViewState copy$default(TransferFundsBottomSheetViewState transferFundsBottomSheetViewState, CashCushionStatus cashCushionStatus, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            cashCushionStatus = transferFundsBottomSheetViewState.cashCushionStatus;
        }
        if ((i & 2) != 0) {
            z = transferFundsBottomSheetViewState.promptCashCushionWhenSkipped;
        }
        if ((i & 4) != 0) {
            z2 = transferFundsBottomSheetViewState.hasVisitedCashCushionUpsell;
        }
        if ((i & 8) != 0) {
            uiEvent = transferFundsBottomSheetViewState.showCashCushionUpsellEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = transferFundsBottomSheetViewState.dismissEvent;
        }
        if ((i & 32) != 0) {
            z3 = transferFundsBottomSheetViewState.cardShipmentPendingFunding;
        }
        UiEvent uiEvent3 = uiEvent2;
        boolean z4 = z3;
        return transferFundsBottomSheetViewState.copy(cashCushionStatus, z, z2, uiEvent, uiEvent3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final CashCushionStatus getCashCushionStatus() {
        return this.cashCushionStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPromptCashCushionWhenSkipped() {
        return this.promptCashCushionWhenSkipped;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasVisitedCashCushionUpsell() {
        return this.hasVisitedCashCushionUpsell;
    }

    public final UiEvent<Unit> component4() {
        return this.showCashCushionUpsellEvent;
    }

    public final UiEvent<Unit> component5() {
        return this.dismissEvent;
    }

    public final TransferFundsBottomSheetViewState copy(CashCushionStatus cashCushionStatus, boolean promptCashCushionWhenSkipped, boolean hasVisitedCashCushionUpsell, UiEvent<Unit> showCashCushionUpsellEvent, UiEvent<Unit> dismissEvent, boolean cardShipmentPendingFunding) {
        return new TransferFundsBottomSheetViewState(cashCushionStatus, promptCashCushionWhenSkipped, hasVisitedCashCushionUpsell, showCashCushionUpsellEvent, dismissEvent, cardShipmentPendingFunding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferFundsBottomSheetViewState)) {
            return false;
        }
        TransferFundsBottomSheetViewState transferFundsBottomSheetViewState = (TransferFundsBottomSheetViewState) other;
        return Intrinsics.areEqual(this.cashCushionStatus, transferFundsBottomSheetViewState.cashCushionStatus) && this.promptCashCushionWhenSkipped == transferFundsBottomSheetViewState.promptCashCushionWhenSkipped && this.hasVisitedCashCushionUpsell == transferFundsBottomSheetViewState.hasVisitedCashCushionUpsell && Intrinsics.areEqual(this.showCashCushionUpsellEvent, transferFundsBottomSheetViewState.showCashCushionUpsellEvent) && Intrinsics.areEqual(this.dismissEvent, transferFundsBottomSheetViewState.dismissEvent) && this.cardShipmentPendingFunding == transferFundsBottomSheetViewState.cardShipmentPendingFunding;
    }

    public int hashCode() {
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        int iHashCode = (((((cashCushionStatus == null ? 0 : cashCushionStatus.hashCode()) * 31) + Boolean.hashCode(this.promptCashCushionWhenSkipped)) * 31) + Boolean.hashCode(this.hasVisitedCashCushionUpsell)) * 31;
        UiEvent<Unit> uiEvent = this.showCashCushionUpsellEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.dismissEvent;
        return ((iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.cardShipmentPendingFunding);
    }

    public String toString() {
        return "TransferFundsBottomSheetViewState(cashCushionStatus=" + this.cashCushionStatus + ", promptCashCushionWhenSkipped=" + this.promptCashCushionWhenSkipped + ", hasVisitedCashCushionUpsell=" + this.hasVisitedCashCushionUpsell + ", showCashCushionUpsellEvent=" + this.showCashCushionUpsellEvent + ", dismissEvent=" + this.dismissEvent + ", cardShipmentPendingFunding=" + this.cardShipmentPendingFunding + ")";
    }

    public TransferFundsBottomSheetViewState(CashCushionStatus cashCushionStatus, boolean z, boolean z2, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, boolean z3) {
        this.cashCushionStatus = cashCushionStatus;
        this.promptCashCushionWhenSkipped = z;
        this.hasVisitedCashCushionUpsell = z2;
        this.showCashCushionUpsellEvent = uiEvent;
        this.dismissEvent = uiEvent2;
        this.cardShipmentPendingFunding = z3;
    }

    public /* synthetic */ TransferFundsBottomSheetViewState(CashCushionStatus cashCushionStatus, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cashCushionStatus, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? false : z3);
    }

    public final CashCushionStatus getCashCushionStatus() {
        return this.cashCushionStatus;
    }

    public final boolean getPromptCashCushionWhenSkipped() {
        return this.promptCashCushionWhenSkipped;
    }

    public final boolean getHasVisitedCashCushionUpsell() {
        return this.hasVisitedCashCushionUpsell;
    }

    public final UiEvent<Unit> getShowCashCushionUpsellEvent() {
        return this.showCashCushionUpsellEvent;
    }

    public final UiEvent<Unit> getDismissEvent() {
        return this.dismissEvent;
    }

    public final boolean getShouldShowCashCushionUpsell() {
        CashCushionStatus cashCushionStatus = this.cashCushionStatus;
        return (cashCushionStatus == null || cashCushionStatus.getEnabled() || this.hasVisitedCashCushionUpsell || !this.promptCashCushionWhenSkipped) ? false : true;
    }

    public final int getUpsellBodyTextRes() {
        if (this.cardShipmentPendingFunding) {
            return C10285R.string.rhy_transfer_funds_hook_description_card_gated;
        }
        return C10285R.string.rhy_transfer_funds_hook_description;
    }
}
