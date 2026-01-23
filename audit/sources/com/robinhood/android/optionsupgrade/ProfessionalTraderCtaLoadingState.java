package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;

/* compiled from: OptionProfessionalTraderComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/ProfessionalTraderCtaLoadingState;", "", "isNotProfessionalTraderButtonLoading", "", "isProfessionalTraderButtonLoading", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfessionalTraderCtaLoadingState {
    public static final int $stable = 0;
    private final boolean isNotProfessionalTraderButtonLoading;
    private final boolean isProfessionalTraderButtonLoading;

    public static /* synthetic */ ProfessionalTraderCtaLoadingState copy$default(ProfessionalTraderCtaLoadingState professionalTraderCtaLoadingState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = professionalTraderCtaLoadingState.isNotProfessionalTraderButtonLoading;
        }
        if ((i & 2) != 0) {
            z2 = professionalTraderCtaLoadingState.isProfessionalTraderButtonLoading;
        }
        return professionalTraderCtaLoadingState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNotProfessionalTraderButtonLoading() {
        return this.isNotProfessionalTraderButtonLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsProfessionalTraderButtonLoading() {
        return this.isProfessionalTraderButtonLoading;
    }

    public final ProfessionalTraderCtaLoadingState copy(boolean isNotProfessionalTraderButtonLoading, boolean isProfessionalTraderButtonLoading) {
        return new ProfessionalTraderCtaLoadingState(isNotProfessionalTraderButtonLoading, isProfessionalTraderButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfessionalTraderCtaLoadingState)) {
            return false;
        }
        ProfessionalTraderCtaLoadingState professionalTraderCtaLoadingState = (ProfessionalTraderCtaLoadingState) other;
        return this.isNotProfessionalTraderButtonLoading == professionalTraderCtaLoadingState.isNotProfessionalTraderButtonLoading && this.isProfessionalTraderButtonLoading == professionalTraderCtaLoadingState.isProfessionalTraderButtonLoading;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isNotProfessionalTraderButtonLoading) * 31) + Boolean.hashCode(this.isProfessionalTraderButtonLoading);
    }

    public String toString() {
        return "ProfessionalTraderCtaLoadingState(isNotProfessionalTraderButtonLoading=" + this.isNotProfessionalTraderButtonLoading + ", isProfessionalTraderButtonLoading=" + this.isProfessionalTraderButtonLoading + ")";
    }

    public ProfessionalTraderCtaLoadingState(boolean z, boolean z2) {
        this.isNotProfessionalTraderButtonLoading = z;
        this.isProfessionalTraderButtonLoading = z2;
    }

    public final boolean isNotProfessionalTraderButtonLoading() {
        return this.isNotProfessionalTraderButtonLoading;
    }

    public final boolean isProfessionalTraderButtonLoading() {
        return this.isProfessionalTraderButtonLoading;
    }
}
