package com.robinhood.android.beneficiaries.p067ui.list;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryListDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDataState;", "", "beneficiaryList", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "splashViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "isContingentBeneficiaryExperiment", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;Z)V", "getBeneficiaryList", "()Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "getSplashViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryListDataState {
    public static final int $stable = 8;
    private final BeneficiaryList beneficiaryList;
    private final boolean isContingentBeneficiaryExperiment;
    private final ApiBeneficiarySplashViewModel splashViewModel;

    public BeneficiaryListDataState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ BeneficiaryListDataState copy$default(BeneficiaryListDataState beneficiaryListDataState, BeneficiaryList beneficiaryList, ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryList = beneficiaryListDataState.beneficiaryList;
        }
        if ((i & 2) != 0) {
            apiBeneficiarySplashViewModel = beneficiaryListDataState.splashViewModel;
        }
        if ((i & 4) != 0) {
            z = beneficiaryListDataState.isContingentBeneficiaryExperiment;
        }
        return beneficiaryListDataState.copy(beneficiaryList, apiBeneficiarySplashViewModel, z);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryList getBeneficiaryList() {
        return this.beneficiaryList;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiBeneficiarySplashViewModel getSplashViewModel() {
        return this.splashViewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsContingentBeneficiaryExperiment() {
        return this.isContingentBeneficiaryExperiment;
    }

    public final BeneficiaryListDataState copy(BeneficiaryList beneficiaryList, ApiBeneficiarySplashViewModel splashViewModel, boolean isContingentBeneficiaryExperiment) {
        return new BeneficiaryListDataState(beneficiaryList, splashViewModel, isContingentBeneficiaryExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryListDataState)) {
            return false;
        }
        BeneficiaryListDataState beneficiaryListDataState = (BeneficiaryListDataState) other;
        return Intrinsics.areEqual(this.beneficiaryList, beneficiaryListDataState.beneficiaryList) && Intrinsics.areEqual(this.splashViewModel, beneficiaryListDataState.splashViewModel) && this.isContingentBeneficiaryExperiment == beneficiaryListDataState.isContingentBeneficiaryExperiment;
    }

    public int hashCode() {
        BeneficiaryList beneficiaryList = this.beneficiaryList;
        int iHashCode = (beneficiaryList == null ? 0 : beneficiaryList.hashCode()) * 31;
        ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel = this.splashViewModel;
        return ((iHashCode + (apiBeneficiarySplashViewModel != null ? apiBeneficiarySplashViewModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.isContingentBeneficiaryExperiment);
    }

    public String toString() {
        return "BeneficiaryListDataState(beneficiaryList=" + this.beneficiaryList + ", splashViewModel=" + this.splashViewModel + ", isContingentBeneficiaryExperiment=" + this.isContingentBeneficiaryExperiment + ")";
    }

    public BeneficiaryListDataState(BeneficiaryList beneficiaryList, ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, boolean z) {
        this.beneficiaryList = beneficiaryList;
        this.splashViewModel = apiBeneficiarySplashViewModel;
        this.isContingentBeneficiaryExperiment = z;
    }

    public /* synthetic */ BeneficiaryListDataState(BeneficiaryList beneficiaryList, ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : beneficiaryList, (i & 2) != 0 ? null : apiBeneficiarySplashViewModel, (i & 4) != 0 ? false : z);
    }

    public final BeneficiaryList getBeneficiaryList() {
        return this.beneficiaryList;
    }

    public final ApiBeneficiarySplashViewModel getSplashViewModel() {
        return this.splashViewModel;
    }

    public final boolean isContingentBeneficiaryExperiment() {
        return this.isContingentBeneficiaryExperiment;
    }
}
