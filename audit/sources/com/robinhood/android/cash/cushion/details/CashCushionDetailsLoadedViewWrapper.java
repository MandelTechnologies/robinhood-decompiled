package com.robinhood.android.cash.cushion.details;

import com.robinhood.android.cash.cushion.C9970R;
import com.robinhood.android.common.C11048R;
import com.robinhood.models.p320db.bonfire.CashCushionDetails;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CashCushionDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0015HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/details/CashCushionDetailsLoadedViewWrapper;", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/bonfire/CashCushionDetails;", "status", "Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "primaryCtaLoading", "", "secondaryCtaEnabled", "showManageButtonWhenEnabled", "<init>", "(Lcom/robinhood/models/db/bonfire/CashCushionDetails;Lcom/robinhood/models/db/bonfire/CashCushionStatus;ZZZ)V", "getDetails", "()Lcom/robinhood/models/db/bonfire/CashCushionDetails;", "getStatus", "()Lcom/robinhood/models/db/bonfire/CashCushionStatus;", "getPrimaryCtaLoading", "()Z", "getSecondaryCtaEnabled", "getShowManageButtonWhenEnabled", "primaryCtaText", "", "getPrimaryCtaText", "()I", "secondaryCtaText", "getSecondaryCtaText", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CashCushionDetailsLoadedViewWrapper {
    public static final int $stable = 8;
    private final CashCushionDetails details;
    private final boolean primaryCtaLoading;
    private final boolean secondaryCtaEnabled;
    private final boolean showManageButtonWhenEnabled;
    private final CashCushionStatus status;

    public static /* synthetic */ CashCushionDetailsLoadedViewWrapper copy$default(CashCushionDetailsLoadedViewWrapper cashCushionDetailsLoadedViewWrapper, CashCushionDetails cashCushionDetails, CashCushionStatus cashCushionStatus, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            cashCushionDetails = cashCushionDetailsLoadedViewWrapper.details;
        }
        if ((i & 2) != 0) {
            cashCushionStatus = cashCushionDetailsLoadedViewWrapper.status;
        }
        if ((i & 4) != 0) {
            z = cashCushionDetailsLoadedViewWrapper.primaryCtaLoading;
        }
        if ((i & 8) != 0) {
            z2 = cashCushionDetailsLoadedViewWrapper.secondaryCtaEnabled;
        }
        if ((i & 16) != 0) {
            z3 = cashCushionDetailsLoadedViewWrapper.showManageButtonWhenEnabled;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return cashCushionDetailsLoadedViewWrapper.copy(cashCushionDetails, cashCushionStatus, z5, z2, z4);
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

    /* renamed from: component5, reason: from getter */
    public final boolean getShowManageButtonWhenEnabled() {
        return this.showManageButtonWhenEnabled;
    }

    public final CashCushionDetailsLoadedViewWrapper copy(CashCushionDetails details, CashCushionStatus status, boolean primaryCtaLoading, boolean secondaryCtaEnabled, boolean showManageButtonWhenEnabled) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(status, "status");
        return new CashCushionDetailsLoadedViewWrapper(details, status, primaryCtaLoading, secondaryCtaEnabled, showManageButtonWhenEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashCushionDetailsLoadedViewWrapper)) {
            return false;
        }
        CashCushionDetailsLoadedViewWrapper cashCushionDetailsLoadedViewWrapper = (CashCushionDetailsLoadedViewWrapper) other;
        return Intrinsics.areEqual(this.details, cashCushionDetailsLoadedViewWrapper.details) && Intrinsics.areEqual(this.status, cashCushionDetailsLoadedViewWrapper.status) && this.primaryCtaLoading == cashCushionDetailsLoadedViewWrapper.primaryCtaLoading && this.secondaryCtaEnabled == cashCushionDetailsLoadedViewWrapper.secondaryCtaEnabled && this.showManageButtonWhenEnabled == cashCushionDetailsLoadedViewWrapper.showManageButtonWhenEnabled;
    }

    public int hashCode() {
        return (((((((this.details.hashCode() * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.primaryCtaLoading)) * 31) + Boolean.hashCode(this.secondaryCtaEnabled)) * 31) + Boolean.hashCode(this.showManageButtonWhenEnabled);
    }

    public String toString() {
        return "CashCushionDetailsLoadedViewWrapper(details=" + this.details + ", status=" + this.status + ", primaryCtaLoading=" + this.primaryCtaLoading + ", secondaryCtaEnabled=" + this.secondaryCtaEnabled + ", showManageButtonWhenEnabled=" + this.showManageButtonWhenEnabled + ")";
    }

    public CashCushionDetailsLoadedViewWrapper(CashCushionDetails details, CashCushionStatus status, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(status, "status");
        this.details = details;
        this.status = status;
        this.primaryCtaLoading = z;
        this.secondaryCtaEnabled = z2;
        this.showManageButtonWhenEnabled = z3;
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

    public final boolean getShowManageButtonWhenEnabled() {
        return this.showManageButtonWhenEnabled;
    }

    public final int getPrimaryCtaText() {
        if (this.status.getEnabled()) {
            if (this.showManageButtonWhenEnabled) {
                return C9970R.string.cash_cushion_details_primary_cta_enabled;
            }
            return C11048R.string.general_label_dismiss;
        }
        return C9970R.string.cash_cushion_details_primary_cta_disabled;
    }

    public final Integer getSecondaryCtaText() {
        if (this.status.getEnabled()) {
            if (this.showManageButtonWhenEnabled) {
                return Integer.valueOf(C11048R.string.general_label_dismiss);
            }
            return null;
        }
        return Integer.valueOf(C11048R.string.general_label_maybe_later);
    }
}
