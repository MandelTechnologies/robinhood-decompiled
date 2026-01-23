package com.robinhood.android.cash.cushion.upsell;

import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashCushionUpsellBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetViewState;", "", "loading", "", "dismissEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "launchCashCushionDetailsEvent", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashCushionDetails;", "error", "", "<init>", "(ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getLoading", "()Z", "getDismissEvent", "()Lcom/robinhood/udf/UiEvent;", "getLaunchCashCushionDetailsEvent", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CashCushionUpsellBottomSheetViewState {
    public static final int $stable = 8;
    private final UiEvent<CashCushionStatus> dismissEvent;
    private final UiEvent<Throwable> error;
    private final UiEvent<LegacyIntentKey.CashCushionDetails> launchCashCushionDetailsEvent;
    private final boolean loading;

    public CashCushionUpsellBottomSheetViewState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashCushionUpsellBottomSheetViewState copy$default(CashCushionUpsellBottomSheetViewState cashCushionUpsellBottomSheetViewState, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cashCushionUpsellBottomSheetViewState.loading;
        }
        if ((i & 2) != 0) {
            uiEvent = cashCushionUpsellBottomSheetViewState.dismissEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = cashCushionUpsellBottomSheetViewState.launchCashCushionDetailsEvent;
        }
        if ((i & 8) != 0) {
            uiEvent3 = cashCushionUpsellBottomSheetViewState.error;
        }
        return cashCushionUpsellBottomSheetViewState.copy(z, uiEvent, uiEvent2, uiEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final UiEvent<CashCushionStatus> component2() {
        return this.dismissEvent;
    }

    public final UiEvent<LegacyIntentKey.CashCushionDetails> component3() {
        return this.launchCashCushionDetailsEvent;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    public final CashCushionUpsellBottomSheetViewState copy(boolean loading, UiEvent<CashCushionStatus> dismissEvent, UiEvent<LegacyIntentKey.CashCushionDetails> launchCashCushionDetailsEvent, UiEvent<Throwable> error) {
        return new CashCushionUpsellBottomSheetViewState(loading, dismissEvent, launchCashCushionDetailsEvent, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashCushionUpsellBottomSheetViewState)) {
            return false;
        }
        CashCushionUpsellBottomSheetViewState cashCushionUpsellBottomSheetViewState = (CashCushionUpsellBottomSheetViewState) other;
        return this.loading == cashCushionUpsellBottomSheetViewState.loading && Intrinsics.areEqual(this.dismissEvent, cashCushionUpsellBottomSheetViewState.dismissEvent) && Intrinsics.areEqual(this.launchCashCushionDetailsEvent, cashCushionUpsellBottomSheetViewState.launchCashCushionDetailsEvent) && Intrinsics.areEqual(this.error, cashCushionUpsellBottomSheetViewState.error);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        UiEvent<CashCushionStatus> uiEvent = this.dismissEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<LegacyIntentKey.CashCushionDetails> uiEvent2 = this.launchCashCushionDetailsEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.error;
        return iHashCode3 + (uiEvent3 != null ? uiEvent3.hashCode() : 0);
    }

    public String toString() {
        return "CashCushionUpsellBottomSheetViewState(loading=" + this.loading + ", dismissEvent=" + this.dismissEvent + ", launchCashCushionDetailsEvent=" + this.launchCashCushionDetailsEvent + ", error=" + this.error + ")";
    }

    public CashCushionUpsellBottomSheetViewState(boolean z, UiEvent<CashCushionStatus> uiEvent, UiEvent<LegacyIntentKey.CashCushionDetails> uiEvent2, UiEvent<Throwable> uiEvent3) {
        this.loading = z;
        this.dismissEvent = uiEvent;
        this.launchCashCushionDetailsEvent = uiEvent2;
        this.error = uiEvent3;
    }

    public /* synthetic */ CashCushionUpsellBottomSheetViewState(boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? null : uiEvent3);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final UiEvent<CashCushionStatus> getDismissEvent() {
        return this.dismissEvent;
    }

    public final UiEvent<LegacyIntentKey.CashCushionDetails> getLaunchCashCushionDetailsEvent() {
        return this.launchCashCushionDetailsEvent;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }
}
