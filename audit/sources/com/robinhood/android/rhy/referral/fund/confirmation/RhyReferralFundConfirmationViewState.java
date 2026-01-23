package com.robinhood.android.rhy.referral.fund.confirmation;

import kotlin.Metadata;

/* compiled from: RhyReferralFundConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationViewState;", "", "hasAddedToGooglePay", "", "showDebugAddCardToGooglePayDialog", "<init>", "(ZZ)V", "getHasAddedToGooglePay", "()Z", "getShowDebugAddCardToGooglePayDialog", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralFundConfirmationViewState {
    public static final int $stable = 0;
    private final boolean hasAddedToGooglePay;
    private final boolean showDebugAddCardToGooglePayDialog;

    public static /* synthetic */ RhyReferralFundConfirmationViewState copy$default(RhyReferralFundConfirmationViewState rhyReferralFundConfirmationViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rhyReferralFundConfirmationViewState.hasAddedToGooglePay;
        }
        if ((i & 2) != 0) {
            z2 = rhyReferralFundConfirmationViewState.showDebugAddCardToGooglePayDialog;
        }
        return rhyReferralFundConfirmationViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasAddedToGooglePay() {
        return this.hasAddedToGooglePay;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }

    public final RhyReferralFundConfirmationViewState copy(boolean hasAddedToGooglePay, boolean showDebugAddCardToGooglePayDialog) {
        return new RhyReferralFundConfirmationViewState(hasAddedToGooglePay, showDebugAddCardToGooglePayDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralFundConfirmationViewState)) {
            return false;
        }
        RhyReferralFundConfirmationViewState rhyReferralFundConfirmationViewState = (RhyReferralFundConfirmationViewState) other;
        return this.hasAddedToGooglePay == rhyReferralFundConfirmationViewState.hasAddedToGooglePay && this.showDebugAddCardToGooglePayDialog == rhyReferralFundConfirmationViewState.showDebugAddCardToGooglePayDialog;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.hasAddedToGooglePay) * 31) + Boolean.hashCode(this.showDebugAddCardToGooglePayDialog);
    }

    public String toString() {
        return "RhyReferralFundConfirmationViewState(hasAddedToGooglePay=" + this.hasAddedToGooglePay + ", showDebugAddCardToGooglePayDialog=" + this.showDebugAddCardToGooglePayDialog + ")";
    }

    public RhyReferralFundConfirmationViewState(boolean z, boolean z2) {
        this.hasAddedToGooglePay = z;
        this.showDebugAddCardToGooglePayDialog = z2;
    }

    public final boolean getHasAddedToGooglePay() {
        return this.hasAddedToGooglePay;
    }

    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }
}
