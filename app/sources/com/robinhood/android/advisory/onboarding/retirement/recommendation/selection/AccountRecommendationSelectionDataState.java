package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountRecommendationSelectionDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState;", "", "viewModel", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel;", "accountSelectionIntro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "error", "", "<init>", "(Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel;Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;Ljava/lang/Throwable;)V", "getViewModel", "()Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel;", "getAccountSelectionIntro", "()Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Provider", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountRecommendationSelectionDataState {
    private final RetirementOnboardingIntro.AccountSelection accountSelectionIntro;
    private final Throwable error;
    private final ApiAccountTypeRecommendationIntroViewModel viewModel;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountRecommendationSelectionDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AccountRecommendationSelectionDataState copy$default(AccountRecommendationSelectionDataState accountRecommendationSelectionDataState, ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel, RetirementOnboardingIntro.AccountSelection accountSelection, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAccountTypeRecommendationIntroViewModel = accountRecommendationSelectionDataState.viewModel;
        }
        if ((i & 2) != 0) {
            accountSelection = accountRecommendationSelectionDataState.accountSelectionIntro;
        }
        if ((i & 4) != 0) {
            th = accountRecommendationSelectionDataState.error;
        }
        return accountRecommendationSelectionDataState.copy(apiAccountTypeRecommendationIntroViewModel, accountSelection, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAccountTypeRecommendationIntroViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final RetirementOnboardingIntro.AccountSelection getAccountSelectionIntro() {
        return this.accountSelectionIntro;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final AccountRecommendationSelectionDataState copy(ApiAccountTypeRecommendationIntroViewModel viewModel, RetirementOnboardingIntro.AccountSelection accountSelectionIntro, Throwable error) {
        return new AccountRecommendationSelectionDataState(viewModel, accountSelectionIntro, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRecommendationSelectionDataState)) {
            return false;
        }
        AccountRecommendationSelectionDataState accountRecommendationSelectionDataState = (AccountRecommendationSelectionDataState) other;
        return Intrinsics.areEqual(this.viewModel, accountRecommendationSelectionDataState.viewModel) && Intrinsics.areEqual(this.accountSelectionIntro, accountRecommendationSelectionDataState.accountSelectionIntro) && Intrinsics.areEqual(this.error, accountRecommendationSelectionDataState.error);
    }

    public int hashCode() {
        ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel = this.viewModel;
        int iHashCode = (apiAccountTypeRecommendationIntroViewModel == null ? 0 : apiAccountTypeRecommendationIntroViewModel.hashCode()) * 31;
        RetirementOnboardingIntro.AccountSelection accountSelection = this.accountSelectionIntro;
        int iHashCode2 = (iHashCode + (accountSelection == null ? 0 : accountSelection.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "AccountRecommendationSelectionDataState(viewModel=" + this.viewModel + ", accountSelectionIntro=" + this.accountSelectionIntro + ", error=" + this.error + ")";
    }

    public AccountRecommendationSelectionDataState(ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel, RetirementOnboardingIntro.AccountSelection accountSelection, Throwable th) {
        this.viewModel = apiAccountTypeRecommendationIntroViewModel;
        this.accountSelectionIntro = accountSelection;
        this.error = th;
    }

    public /* synthetic */ AccountRecommendationSelectionDataState(ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel, RetirementOnboardingIntro.AccountSelection accountSelection, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiAccountTypeRecommendationIntroViewModel, (i & 2) != 0 ? null : accountSelection, (i & 4) != 0 ? null : th);
    }

    public final ApiAccountTypeRecommendationIntroViewModel getViewModel() {
        return this.viewModel;
    }

    public final RetirementOnboardingIntro.AccountSelection getAccountSelectionIntro() {
        return this.accountSelectionIntro;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: AccountRecommendationSelectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<AccountRecommendationSelectionDataState, AsyncResult<? extends AccountRecommendationSelectionViewState>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AsyncResult<AccountRecommendationSelectionViewState> reduce(AccountRecommendationSelectionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ApiAccountTypeRecommendationIntroViewModel viewModel = dataState.getViewModel();
            RetirementOnboardingIntro.AccountSelection accountSelectionIntro = dataState.getAccountSelectionIntro();
            Throwable error = dataState.getError();
            if (viewModel == null || accountSelectionIntro == null) {
                if (error != null) {
                    return new AsyncResult.Failure(error);
                }
                return AsyncResult.Loading.INSTANCE;
            }
            return new AsyncResult.Success(new AccountRecommendationSelectionViewState(extensions2.toImmutableList(viewModel.getSelection_screen_view_model().getHeader()), extensions2.toImmutableList(viewModel.getSelection_screen_view_model().getFooter()), viewModel.getSelection_screen_view_model().getRecommended_component(), viewModel.getSelection_screen_view_model().getSelf_directed_component(), viewModel.getIntro_view_model(), accountSelectionIntro));
        }
    }
}
