package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements;

import com.robinhood.android.models.retirement.api.contributions.ApiAgreementsViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionAndAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;", "", "agreementsViewModel", "Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;", "isSweepAgreementChecked", "", "isAgreeButtonLoading", "<init>", "(Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;ZZ)V", "getAgreementsViewModel", "()Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContributionAndAgreementViewState {
    public static final int $stable = 8;
    private final ApiAgreementsViewModel agreementsViewModel;
    private final boolean isAgreeButtonLoading;
    private final boolean isSweepAgreementChecked;

    public ContributionAndAgreementViewState() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ ContributionAndAgreementViewState copy$default(ContributionAndAgreementViewState contributionAndAgreementViewState, ApiAgreementsViewModel apiAgreementsViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAgreementsViewModel = contributionAndAgreementViewState.agreementsViewModel;
        }
        if ((i & 2) != 0) {
            z = contributionAndAgreementViewState.isSweepAgreementChecked;
        }
        if ((i & 4) != 0) {
            z2 = contributionAndAgreementViewState.isAgreeButtonLoading;
        }
        return contributionAndAgreementViewState.copy(apiAgreementsViewModel, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAgreementsViewModel getAgreementsViewModel() {
        return this.agreementsViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSweepAgreementChecked() {
        return this.isSweepAgreementChecked;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAgreeButtonLoading() {
        return this.isAgreeButtonLoading;
    }

    public final ContributionAndAgreementViewState copy(ApiAgreementsViewModel agreementsViewModel, boolean isSweepAgreementChecked, boolean isAgreeButtonLoading) {
        return new ContributionAndAgreementViewState(agreementsViewModel, isSweepAgreementChecked, isAgreeButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionAndAgreementViewState)) {
            return false;
        }
        ContributionAndAgreementViewState contributionAndAgreementViewState = (ContributionAndAgreementViewState) other;
        return Intrinsics.areEqual(this.agreementsViewModel, contributionAndAgreementViewState.agreementsViewModel) && this.isSweepAgreementChecked == contributionAndAgreementViewState.isSweepAgreementChecked && this.isAgreeButtonLoading == contributionAndAgreementViewState.isAgreeButtonLoading;
    }

    public int hashCode() {
        ApiAgreementsViewModel apiAgreementsViewModel = this.agreementsViewModel;
        return ((((apiAgreementsViewModel == null ? 0 : apiAgreementsViewModel.hashCode()) * 31) + Boolean.hashCode(this.isSweepAgreementChecked)) * 31) + Boolean.hashCode(this.isAgreeButtonLoading);
    }

    public String toString() {
        return "ContributionAndAgreementViewState(agreementsViewModel=" + this.agreementsViewModel + ", isSweepAgreementChecked=" + this.isSweepAgreementChecked + ", isAgreeButtonLoading=" + this.isAgreeButtonLoading + ")";
    }

    public ContributionAndAgreementViewState(ApiAgreementsViewModel apiAgreementsViewModel, boolean z, boolean z2) {
        this.agreementsViewModel = apiAgreementsViewModel;
        this.isSweepAgreementChecked = z;
        this.isAgreeButtonLoading = z2;
    }

    public /* synthetic */ ContributionAndAgreementViewState(ApiAgreementsViewModel apiAgreementsViewModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiAgreementsViewModel, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }

    public final ApiAgreementsViewModel getAgreementsViewModel() {
        return this.agreementsViewModel;
    }

    public final boolean isSweepAgreementChecked() {
        return this.isSweepAgreementChecked;
    }

    public final boolean isAgreeButtonLoading() {
        return this.isAgreeButtonLoading;
    }
}
