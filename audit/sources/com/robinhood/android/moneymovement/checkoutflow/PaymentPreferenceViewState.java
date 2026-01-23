package com.robinhood.android.moneymovement.checkoutflow;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: PaymentPreferenceViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceViewState;", "", "showLoadingOnButton", "", "accountSelectorMicrogramSource", "Lmicrogram/android/RemoteMicrogramApplication;", "pageLoading", "titleResId", "", "ctaTextResId", "<init>", "(ZLmicrogram/android/RemoteMicrogramApplication;ZII)V", "getShowLoadingOnButton", "()Z", "getAccountSelectorMicrogramSource", "()Lmicrogram/android/RemoteMicrogramApplication;", "getPageLoading", "getTitleResId", "()I", "getCtaTextResId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentPreferenceViewState {
    public static final int $stable = 8;
    private final RemoteMicrogramApplication accountSelectorMicrogramSource;
    private final int ctaTextResId;
    private final boolean pageLoading;
    private final boolean showLoadingOnButton;
    private final int titleResId;

    public static /* synthetic */ PaymentPreferenceViewState copy$default(PaymentPreferenceViewState paymentPreferenceViewState, boolean z, RemoteMicrogramApplication remoteMicrogramApplication, boolean z2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = paymentPreferenceViewState.showLoadingOnButton;
        }
        if ((i3 & 2) != 0) {
            remoteMicrogramApplication = paymentPreferenceViewState.accountSelectorMicrogramSource;
        }
        if ((i3 & 4) != 0) {
            z2 = paymentPreferenceViewState.pageLoading;
        }
        if ((i3 & 8) != 0) {
            i = paymentPreferenceViewState.titleResId;
        }
        if ((i3 & 16) != 0) {
            i2 = paymentPreferenceViewState.ctaTextResId;
        }
        int i4 = i2;
        boolean z3 = z2;
        return paymentPreferenceViewState.copy(z, remoteMicrogramApplication, z3, i, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLoadingOnButton() {
        return this.showLoadingOnButton;
    }

    /* renamed from: component2, reason: from getter */
    public final RemoteMicrogramApplication getAccountSelectorMicrogramSource() {
        return this.accountSelectorMicrogramSource;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPageLoading() {
        return this.pageLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCtaTextResId() {
        return this.ctaTextResId;
    }

    public final PaymentPreferenceViewState copy(boolean showLoadingOnButton, RemoteMicrogramApplication accountSelectorMicrogramSource, boolean pageLoading, int titleResId, int ctaTextResId) {
        return new PaymentPreferenceViewState(showLoadingOnButton, accountSelectorMicrogramSource, pageLoading, titleResId, ctaTextResId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPreferenceViewState)) {
            return false;
        }
        PaymentPreferenceViewState paymentPreferenceViewState = (PaymentPreferenceViewState) other;
        return this.showLoadingOnButton == paymentPreferenceViewState.showLoadingOnButton && Intrinsics.areEqual(this.accountSelectorMicrogramSource, paymentPreferenceViewState.accountSelectorMicrogramSource) && this.pageLoading == paymentPreferenceViewState.pageLoading && this.titleResId == paymentPreferenceViewState.titleResId && this.ctaTextResId == paymentPreferenceViewState.ctaTextResId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showLoadingOnButton) * 31;
        RemoteMicrogramApplication remoteMicrogramApplication = this.accountSelectorMicrogramSource;
        return ((((((iHashCode + (remoteMicrogramApplication == null ? 0 : remoteMicrogramApplication.hashCode())) * 31) + Boolean.hashCode(this.pageLoading)) * 31) + Integer.hashCode(this.titleResId)) * 31) + Integer.hashCode(this.ctaTextResId);
    }

    public String toString() {
        return "PaymentPreferenceViewState(showLoadingOnButton=" + this.showLoadingOnButton + ", accountSelectorMicrogramSource=" + this.accountSelectorMicrogramSource + ", pageLoading=" + this.pageLoading + ", titleResId=" + this.titleResId + ", ctaTextResId=" + this.ctaTextResId + ")";
    }

    public PaymentPreferenceViewState(boolean z, RemoteMicrogramApplication remoteMicrogramApplication, boolean z2, int i, int i2) {
        this.showLoadingOnButton = z;
        this.accountSelectorMicrogramSource = remoteMicrogramApplication;
        this.pageLoading = z2;
        this.titleResId = i;
        this.ctaTextResId = i2;
    }

    public final boolean getShowLoadingOnButton() {
        return this.showLoadingOnButton;
    }

    public final RemoteMicrogramApplication getAccountSelectorMicrogramSource() {
        return this.accountSelectorMicrogramSource;
    }

    public final boolean getPageLoading() {
        return this.pageLoading;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final int getCtaTextResId() {
        return this.ctaTextResId;
    }
}
