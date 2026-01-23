package com.robinhood.android.cash.cushion.details;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.bonfire.CashCushionDetails;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CashCushionDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÂ\u0003Jc\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsViewState;", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/bonfire/CashCushionDetails;", "status", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "primaryCtaLoading", "", "secondaryCtaEnabled", "error", "Lcom/robinhood/udf/UiEvent;", "", "dismissEvent", "showManageButtonWhenEnabled", "<init>", "(Lcom/robinhood/models/db/bonfire/CashCushionDetails;Lcom/robinhood/models/db/bonfire/CashCushionStatus;ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Z)V", "getDetails", "()Lcom/robinhood/models/db/bonfire/CashCushionDetails;", "getStatus", "()Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "getPrimaryCtaLoading", "()Z", "getSecondaryCtaEnabled", "getError", "()Lcom/robinhood/udf/UiEvent;", "getDismissEvent", "loadingDetails", "getLoadingDetails", "viewWrapper", "Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsLoadedViewWrapper;", "getViewWrapper", "()Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsLoadedViewWrapper;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CashCushionDetailsViewState {
    public static final int $stable = 8;
    private final CashCushionDetails details;
    private final UiEvent<CashCushionStatus> dismissEvent;
    private final UiEvent<Throwable> error;
    private final boolean primaryCtaLoading;
    private final boolean secondaryCtaEnabled;
    private final boolean showManageButtonWhenEnabled;
    private final CashCushionStatus status;

    public CashCushionDetailsViewState() {
        this(null, null, false, false, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getShowManageButtonWhenEnabled() {
        return this.showManageButtonWhenEnabled;
    }

    public static /* synthetic */ CashCushionDetailsViewState copy$default(CashCushionDetailsViewState cashCushionDetailsViewState, CashCushionDetails cashCushionDetails, CashCushionStatus cashCushionStatus, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            cashCushionDetails = cashCushionDetailsViewState.details;
        }
        if ((i & 2) != 0) {
            cashCushionStatus = cashCushionDetailsViewState.status;
        }
        if ((i & 4) != 0) {
            z = cashCushionDetailsViewState.primaryCtaLoading;
        }
        if ((i & 8) != 0) {
            z2 = cashCushionDetailsViewState.secondaryCtaEnabled;
        }
        if ((i & 16) != 0) {
            uiEvent = cashCushionDetailsViewState.error;
        }
        if ((i & 32) != 0) {
            uiEvent2 = cashCushionDetailsViewState.dismissEvent;
        }
        if ((i & 64) != 0) {
            z3 = cashCushionDetailsViewState.showManageButtonWhenEnabled;
        }
        UiEvent uiEvent3 = uiEvent2;
        boolean z4 = z3;
        UiEvent uiEvent4 = uiEvent;
        boolean z5 = z;
        return cashCushionDetailsViewState.copy(cashCushionDetails, cashCushionStatus, z5, z2, uiEvent4, uiEvent3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final CashCushionDetails getDetails() {
        return this.details;
    }

    /* renamed from: component2, reason: from getter */
    public final CashCushionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimaryCtaLoading() {
        return this.primaryCtaLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSecondaryCtaEnabled() {
        return this.secondaryCtaEnabled;
    }

    public final UiEvent<Throwable> component5() {
        return this.error;
    }

    public final UiEvent<CashCushionStatus> component6() {
        return this.dismissEvent;
    }

    public final CashCushionDetailsViewState copy(CashCushionDetails details, CashCushionStatus status, boolean primaryCtaLoading, boolean secondaryCtaEnabled, UiEvent<Throwable> error, UiEvent<CashCushionStatus> dismissEvent, boolean showManageButtonWhenEnabled) {
        return new CashCushionDetailsViewState(details, status, primaryCtaLoading, secondaryCtaEnabled, error, dismissEvent, showManageButtonWhenEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashCushionDetailsViewState)) {
            return false;
        }
        CashCushionDetailsViewState cashCushionDetailsViewState = (CashCushionDetailsViewState) other;
        return Intrinsics.areEqual(this.details, cashCushionDetailsViewState.details) && Intrinsics.areEqual(this.status, cashCushionDetailsViewState.status) && this.primaryCtaLoading == cashCushionDetailsViewState.primaryCtaLoading && this.secondaryCtaEnabled == cashCushionDetailsViewState.secondaryCtaEnabled && Intrinsics.areEqual(this.error, cashCushionDetailsViewState.error) && Intrinsics.areEqual(this.dismissEvent, cashCushionDetailsViewState.dismissEvent) && this.showManageButtonWhenEnabled == cashCushionDetailsViewState.showManageButtonWhenEnabled;
    }

    public int hashCode() {
        CashCushionDetails cashCushionDetails = this.details;
        int iHashCode = (cashCushionDetails == null ? 0 : cashCushionDetails.hashCode()) * 31;
        CashCushionStatus cashCushionStatus = this.status;
        int iHashCode2 = (((((iHashCode + (cashCushionStatus == null ? 0 : cashCushionStatus.hashCode())) * 31) + Boolean.hashCode(this.primaryCtaLoading)) * 31) + Boolean.hashCode(this.secondaryCtaEnabled)) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<CashCushionStatus> uiEvent2 = this.dismissEvent;
        return ((iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showManageButtonWhenEnabled);
    }

    public String toString() {
        return "CashCushionDetailsViewState(details=" + this.details + ", status=" + this.status + ", primaryCtaLoading=" + this.primaryCtaLoading + ", secondaryCtaEnabled=" + this.secondaryCtaEnabled + ", error=" + this.error + ", dismissEvent=" + this.dismissEvent + ", showManageButtonWhenEnabled=" + this.showManageButtonWhenEnabled + ")";
    }

    public CashCushionDetailsViewState(CashCushionDetails cashCushionDetails, CashCushionStatus cashCushionStatus, boolean z, boolean z2, UiEvent<Throwable> uiEvent, UiEvent<CashCushionStatus> uiEvent2, boolean z3) {
        this.details = cashCushionDetails;
        this.status = cashCushionStatus;
        this.primaryCtaLoading = z;
        this.secondaryCtaEnabled = z2;
        this.error = uiEvent;
        this.dismissEvent = uiEvent2;
        this.showManageButtonWhenEnabled = z3;
    }

    public /* synthetic */ CashCushionDetailsViewState(CashCushionDetails cashCushionDetails, CashCushionStatus cashCushionStatus, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cashCushionDetails, (i & 2) != 0 ? null : cashCushionStatus, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2, (i & 64) != 0 ? false : z3);
    }

    public final CashCushionDetails getDetails() {
        return this.details;
    }

    public final CashCushionStatus getStatus() {
        return this.status;
    }

    public final boolean getPrimaryCtaLoading() {
        return this.primaryCtaLoading;
    }

    public final boolean getSecondaryCtaEnabled() {
        return this.secondaryCtaEnabled;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final UiEvent<CashCushionStatus> getDismissEvent() {
        return this.dismissEvent;
    }

    public final boolean getLoadingDetails() {
        return this.details == null || this.status == null;
    }

    public final CashCushionDetailsLoadedViewWrapper getViewWrapper() {
        if (getLoadingDetails()) {
            return null;
        }
        CashCushionDetails cashCushionDetails = this.details;
        Intrinsics.checkNotNull(cashCushionDetails);
        CashCushionStatus cashCushionStatus = this.status;
        Intrinsics.checkNotNull(cashCushionStatus);
        return new CashCushionDetailsLoadedViewWrapper(cashCushionDetails, cashCushionStatus, this.primaryCtaLoading, this.secondaryCtaEnabled, this.showManageButtonWhenEnabled);
    }
}
