package com.robinhood.android.investmentstracker.viewmodels;

import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerAgreementViewModel.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;", "", "response", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "signingAgreement", "", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;Z)V", "getResponse", "()Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "getSigningAgreement", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerAgreementViewModel {
    public static final int $stable = 8;
    private final InvestmentsTrackerGetAgreementResponseDto response;
    private final boolean signingAgreement;

    public static /* synthetic */ InvestmentsTrackerAgreementViewModel copy$default(InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerGetAgreementResponseDto = investmentsTrackerAgreementViewModel.response;
        }
        if ((i & 2) != 0) {
            z = investmentsTrackerAgreementViewModel.signingAgreement;
        }
        return investmentsTrackerAgreementViewModel.copy(investmentsTrackerGetAgreementResponseDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentsTrackerGetAgreementResponseDto getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSigningAgreement() {
        return this.signingAgreement;
    }

    public final InvestmentsTrackerAgreementViewModel copy(InvestmentsTrackerGetAgreementResponseDto response, boolean signingAgreement) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new InvestmentsTrackerAgreementViewModel(response, signingAgreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerAgreementViewModel)) {
            return false;
        }
        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel = (InvestmentsTrackerAgreementViewModel) other;
        return Intrinsics.areEqual(this.response, investmentsTrackerAgreementViewModel.response) && this.signingAgreement == investmentsTrackerAgreementViewModel.signingAgreement;
    }

    public int hashCode() {
        return (this.response.hashCode() * 31) + Boolean.hashCode(this.signingAgreement);
    }

    public String toString() {
        return "InvestmentsTrackerAgreementViewModel(response=" + this.response + ", signingAgreement=" + this.signingAgreement + ")";
    }

    public InvestmentsTrackerAgreementViewModel(InvestmentsTrackerGetAgreementResponseDto response, boolean z) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
        this.signingAgreement = z;
    }

    public final InvestmentsTrackerGetAgreementResponseDto getResponse() {
        return this.response;
    }

    public final boolean getSigningAgreement() {
        return this.signingAgreement;
    }
}
