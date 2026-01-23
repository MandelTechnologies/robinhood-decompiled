package com.robinhood.android.beneficiaries.p067ui.list;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryListViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\r\u000eR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "", "splashViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "getSplashViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "beneficiaryList", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "getBeneficiaryList", "()Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "isContingentBeneficiaryExperiment", "", "()Z", "Loading", "Content", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState$Content;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState$Loading;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BeneficiaryListViewState {
    BeneficiaryList getBeneficiaryList();

    ApiBeneficiarySplashViewModel getSplashViewModel();

    boolean isContingentBeneficiaryExperiment();

    /* compiled from: BeneficiaryListViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState$Loading;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "splashViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "isContingentBeneficiaryExperiment", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;Z)V", "getSplashViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "()Z", "beneficiaryList", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "getBeneficiaryList", "()Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements BeneficiaryListViewState {
        public static final int $stable = 8;
        private final boolean isContingentBeneficiaryExperiment;
        private final ApiBeneficiarySplashViewModel splashViewModel;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiBeneficiarySplashViewModel = loading.splashViewModel;
            }
            if ((i & 2) != 0) {
                z = loading.isContingentBeneficiaryExperiment;
            }
            return loading.copy(apiBeneficiarySplashViewModel, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiBeneficiarySplashViewModel getSplashViewModel() {
            return this.splashViewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsContingentBeneficiaryExperiment() {
            return this.isContingentBeneficiaryExperiment;
        }

        public final Loading copy(ApiBeneficiarySplashViewModel splashViewModel, boolean isContingentBeneficiaryExperiment) {
            return new Loading(splashViewModel, isContingentBeneficiaryExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.splashViewModel, loading.splashViewModel) && this.isContingentBeneficiaryExperiment == loading.isContingentBeneficiaryExperiment;
        }

        @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState
        public BeneficiaryList getBeneficiaryList() {
            return null;
        }

        public int hashCode() {
            ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel = this.splashViewModel;
            return ((apiBeneficiarySplashViewModel == null ? 0 : apiBeneficiarySplashViewModel.hashCode()) * 31) + Boolean.hashCode(this.isContingentBeneficiaryExperiment);
        }

        public String toString() {
            return "Loading(splashViewModel=" + this.splashViewModel + ", isContingentBeneficiaryExperiment=" + this.isContingentBeneficiaryExperiment + ")";
        }

        public Loading(ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, boolean z) {
            this.splashViewModel = apiBeneficiarySplashViewModel;
            this.isContingentBeneficiaryExperiment = z;
        }

        public /* synthetic */ Loading(ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : apiBeneficiarySplashViewModel, (i & 2) != 0 ? false : z);
        }

        @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState
        public ApiBeneficiarySplashViewModel getSplashViewModel() {
            return this.splashViewModel;
        }

        @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState
        public boolean isContingentBeneficiaryExperiment() {
            return this.isContingentBeneficiaryExperiment;
        }
    }

    /* compiled from: BeneficiaryListViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState$Content;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "splashViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "beneficiaryList", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "isContingentBeneficiaryExperiment", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;Z)V", "getSplashViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "getBeneficiaryList", "()Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryList;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content implements BeneficiaryListViewState {
        public static final int $stable = 8;
        private final BeneficiaryList beneficiaryList;
        private final boolean isContingentBeneficiaryExperiment;
        private final ApiBeneficiarySplashViewModel splashViewModel;

        public static /* synthetic */ Content copy$default(Content content, ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, BeneficiaryList beneficiaryList, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiBeneficiarySplashViewModel = content.splashViewModel;
            }
            if ((i & 2) != 0) {
                beneficiaryList = content.beneficiaryList;
            }
            if ((i & 4) != 0) {
                z = content.isContingentBeneficiaryExperiment;
            }
            return content.copy(apiBeneficiarySplashViewModel, beneficiaryList, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiBeneficiarySplashViewModel getSplashViewModel() {
            return this.splashViewModel;
        }

        /* renamed from: component2, reason: from getter */
        public final BeneficiaryList getBeneficiaryList() {
            return this.beneficiaryList;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsContingentBeneficiaryExperiment() {
            return this.isContingentBeneficiaryExperiment;
        }

        public final Content copy(ApiBeneficiarySplashViewModel splashViewModel, BeneficiaryList beneficiaryList, boolean isContingentBeneficiaryExperiment) {
            Intrinsics.checkNotNullParameter(beneficiaryList, "beneficiaryList");
            return new Content(splashViewModel, beneficiaryList, isContingentBeneficiaryExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.splashViewModel, content.splashViewModel) && Intrinsics.areEqual(this.beneficiaryList, content.beneficiaryList) && this.isContingentBeneficiaryExperiment == content.isContingentBeneficiaryExperiment;
        }

        public int hashCode() {
            ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel = this.splashViewModel;
            return ((((apiBeneficiarySplashViewModel == null ? 0 : apiBeneficiarySplashViewModel.hashCode()) * 31) + this.beneficiaryList.hashCode()) * 31) + Boolean.hashCode(this.isContingentBeneficiaryExperiment);
        }

        public String toString() {
            return "Content(splashViewModel=" + this.splashViewModel + ", beneficiaryList=" + this.beneficiaryList + ", isContingentBeneficiaryExperiment=" + this.isContingentBeneficiaryExperiment + ")";
        }

        public Content(ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, BeneficiaryList beneficiaryList, boolean z) {
            Intrinsics.checkNotNullParameter(beneficiaryList, "beneficiaryList");
            this.splashViewModel = apiBeneficiarySplashViewModel;
            this.beneficiaryList = beneficiaryList;
            this.isContingentBeneficiaryExperiment = z;
        }

        public /* synthetic */ Content(ApiBeneficiarySplashViewModel apiBeneficiarySplashViewModel, BeneficiaryList beneficiaryList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : apiBeneficiarySplashViewModel, beneficiaryList, (i & 4) != 0 ? false : z);
        }

        @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState
        public ApiBeneficiarySplashViewModel getSplashViewModel() {
            return this.splashViewModel;
        }

        @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState
        public BeneficiaryList getBeneficiaryList() {
            return this.beneficiaryList;
        }

        @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState
        public boolean isContingentBeneficiaryExperiment() {
            return this.isContingentBeneficiaryExperiment;
        }
    }
}
