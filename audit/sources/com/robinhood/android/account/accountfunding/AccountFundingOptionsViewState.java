package com.robinhood.android.account.accountfunding;

import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountFundingOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsViewState;", "", "viewModel", "Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;", "<init>", "(Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;)V", "getViewModel", "()Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountFundingOptionsViewState {
    private final FundingOptionsViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FundingOptionsViewModel mockViewModel = new FundingOptionsViewModel("--- -- --- ---- --", CollectionsKt.emptyList());

    /* JADX WARN: Multi-variable type inference failed */
    public AccountFundingOptionsViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccountFundingOptionsViewState copy$default(AccountFundingOptionsViewState accountFundingOptionsViewState, FundingOptionsViewModel fundingOptionsViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingOptionsViewModel = accountFundingOptionsViewState.viewModel;
        }
        return accountFundingOptionsViewState.copy(fundingOptionsViewModel);
    }

    /* renamed from: component1, reason: from getter */
    public final FundingOptionsViewModel getViewModel() {
        return this.viewModel;
    }

    public final AccountFundingOptionsViewState copy(FundingOptionsViewModel viewModel) {
        return new AccountFundingOptionsViewState(viewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountFundingOptionsViewState) && Intrinsics.areEqual(this.viewModel, ((AccountFundingOptionsViewState) other).viewModel);
    }

    public int hashCode() {
        FundingOptionsViewModel fundingOptionsViewModel = this.viewModel;
        if (fundingOptionsViewModel == null) {
            return 0;
        }
        return fundingOptionsViewModel.hashCode();
    }

    public String toString() {
        return "AccountFundingOptionsViewState(viewModel=" + this.viewModel + ")";
    }

    public AccountFundingOptionsViewState(FundingOptionsViewModel fundingOptionsViewModel) {
        this.viewModel = fundingOptionsViewModel;
    }

    public /* synthetic */ AccountFundingOptionsViewState(FundingOptionsViewModel fundingOptionsViewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fundingOptionsViewModel);
    }

    public final FundingOptionsViewModel getViewModel() {
        return this.viewModel;
    }

    /* compiled from: AccountFundingOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsViewState$Companion;", "", "<init>", "()V", "mockViewModel", "Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;", "getMockViewModel$feature_account_funding_externalDebug", "()Lcom/robinhood/android/account/models/onboarding/FundingOptionsViewModel;", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FundingOptionsViewModel getMockViewModel$feature_account_funding_externalDebug() {
            return AccountFundingOptionsViewState.mockViewModel;
        }
    }
}
