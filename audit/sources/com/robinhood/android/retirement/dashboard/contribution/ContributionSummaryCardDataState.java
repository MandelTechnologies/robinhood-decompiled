package com.robinhood.android.retirement.dashboard.contribution;

import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionSummary;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedSummaryCardViewModel;
import com.robinhood.android.retirement.dashboard.C26985R;
import com.robinhood.android.retirement.dashboard.contribution.ContributionSummaryCardViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ContributionSummaryCardDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;", "", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;", "isManagedAccount", "", "advisoryGoldValuePropsTitle", "", "accountNumber", "strategiesUpsellBanner", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;", "<init>", "(Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;", "()Z", "getAdvisoryGoldValuePropsTitle", "()Ljava/lang/String;", "getAccountNumber", "getStrategiesUpsellBanner", "()Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel$Banner;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionSummaryCardDataState {
    private final String accountNumber;
    private final String advisoryGoldValuePropsTitle;
    private final boolean isManagedAccount;
    private final RecsForRetirementStrategiesUpsellViewModel.Banner strategiesUpsellBanner;
    private final RetirementCombinedSummaryCardViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ContributionSummaryCardDataState() {
        this(null, false, null, null, null, 31, null);
    }

    public static /* synthetic */ ContributionSummaryCardDataState copy$default(ContributionSummaryCardDataState contributionSummaryCardDataState, RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, boolean z, String str, String str2, RecsForRetirementStrategiesUpsellViewModel.Banner banner, int i, Object obj) {
        if ((i & 1) != 0) {
            retirementCombinedSummaryCardViewModel = contributionSummaryCardDataState.viewModel;
        }
        if ((i & 2) != 0) {
            z = contributionSummaryCardDataState.isManagedAccount;
        }
        if ((i & 4) != 0) {
            str = contributionSummaryCardDataState.advisoryGoldValuePropsTitle;
        }
        if ((i & 8) != 0) {
            str2 = contributionSummaryCardDataState.accountNumber;
        }
        if ((i & 16) != 0) {
            banner = contributionSummaryCardDataState.strategiesUpsellBanner;
        }
        RecsForRetirementStrategiesUpsellViewModel.Banner banner2 = banner;
        String str3 = str;
        return contributionSummaryCardDataState.copy(retirementCombinedSummaryCardViewModel, z, str3, str2, banner2);
    }

    /* renamed from: component1, reason: from getter */
    public final RetirementCombinedSummaryCardViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsManagedAccount() {
        return this.isManagedAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAdvisoryGoldValuePropsTitle() {
        return this.advisoryGoldValuePropsTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final RecsForRetirementStrategiesUpsellViewModel.Banner getStrategiesUpsellBanner() {
        return this.strategiesUpsellBanner;
    }

    public final ContributionSummaryCardDataState copy(RetirementCombinedSummaryCardViewModel viewModel, boolean isManagedAccount, String advisoryGoldValuePropsTitle, String accountNumber, RecsForRetirementStrategiesUpsellViewModel.Banner strategiesUpsellBanner) {
        return new ContributionSummaryCardDataState(viewModel, isManagedAccount, advisoryGoldValuePropsTitle, accountNumber, strategiesUpsellBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionSummaryCardDataState)) {
            return false;
        }
        ContributionSummaryCardDataState contributionSummaryCardDataState = (ContributionSummaryCardDataState) other;
        return Intrinsics.areEqual(this.viewModel, contributionSummaryCardDataState.viewModel) && this.isManagedAccount == contributionSummaryCardDataState.isManagedAccount && Intrinsics.areEqual(this.advisoryGoldValuePropsTitle, contributionSummaryCardDataState.advisoryGoldValuePropsTitle) && Intrinsics.areEqual(this.accountNumber, contributionSummaryCardDataState.accountNumber) && Intrinsics.areEqual(this.strategiesUpsellBanner, contributionSummaryCardDataState.strategiesUpsellBanner);
    }

    public int hashCode() {
        RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel = this.viewModel;
        int iHashCode = (((retirementCombinedSummaryCardViewModel == null ? 0 : retirementCombinedSummaryCardViewModel.hashCode()) * 31) + Boolean.hashCode(this.isManagedAccount)) * 31;
        String str = this.advisoryGoldValuePropsTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RecsForRetirementStrategiesUpsellViewModel.Banner banner = this.strategiesUpsellBanner;
        return iHashCode3 + (banner != null ? banner.hashCode() : 0);
    }

    public String toString() {
        return "ContributionSummaryCardDataState(viewModel=" + this.viewModel + ", isManagedAccount=" + this.isManagedAccount + ", advisoryGoldValuePropsTitle=" + this.advisoryGoldValuePropsTitle + ", accountNumber=" + this.accountNumber + ", strategiesUpsellBanner=" + this.strategiesUpsellBanner + ")";
    }

    public ContributionSummaryCardDataState(RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, boolean z, String str, String str2, RecsForRetirementStrategiesUpsellViewModel.Banner banner) {
        this.viewModel = retirementCombinedSummaryCardViewModel;
        this.isManagedAccount = z;
        this.advisoryGoldValuePropsTitle = str;
        this.accountNumber = str2;
        this.strategiesUpsellBanner = banner;
    }

    public /* synthetic */ ContributionSummaryCardDataState(RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, boolean z, String str, String str2, RecsForRetirementStrategiesUpsellViewModel.Banner banner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : retirementCombinedSummaryCardViewModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : banner);
    }

    public final RetirementCombinedSummaryCardViewModel getViewModel() {
        return this.viewModel;
    }

    public final boolean isManagedAccount() {
        return this.isManagedAccount;
    }

    public final String getAdvisoryGoldValuePropsTitle() {
        return this.advisoryGoldValuePropsTitle;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final RecsForRetirementStrategiesUpsellViewModel.Banner getStrategiesUpsellBanner() {
        return this.strategiesUpsellBanner;
    }

    /* compiled from: ContributionSummaryCardDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardDataState;", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryCardViewState;", "<init>", "()V", "reduce", "dataState", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<ContributionSummaryCardDataState, ContributionSummaryCardViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ContributionSummaryCardViewState reduce(ContributionSummaryCardDataState dataState) {
            ContributionSummaryCardViewState.Row row;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getViewModel() != null && dataState.getAccountNumber() != null) {
                RetirementCombinedContributionSummary summary = dataState.getViewModel().getSummary();
                RetirementCombinedSummaryCardViewModel viewModel = dataState.getViewModel();
                boolean zIsManagedAccount = dataState.isManagedAccount();
                String accountNumber = dataState.getAccountNumber();
                String advisoryGoldValuePropsTitle = dataState.getAdvisoryGoldValuePropsTitle();
                ContributionSummaryCardViewState.Row row2 = new ContributionSummaryCardViewState.Row(dataState.getViewModel().getFirstDataItem());
                RetirementCombinedSummaryCardViewModel.Item secondDataItem = dataState.getViewModel().getSecondDataItem();
                ContributionSummaryCardViewState.Row row3 = null;
                if (secondDataItem == null) {
                    row = null;
                } else {
                    if (dataState.isManagedAccount()) {
                        secondDataItem = null;
                    }
                    if (secondDataItem != null) {
                        row = new ContributionSummaryCardViewState.Row(secondDataItem);
                    }
                }
                if (dataState.isManagedAccount() && summary != null) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    row3 = new ContributionSummaryCardViewState.Row(companion.invoke(C26985R.string.retirement_contribution_limit_label, new Object[0]), companion.invoke(Format2.format(summary.getLimit())));
                }
                return new ContributionSummaryCardViewState.Loaded(accountNumber, viewModel, zIsManagedAccount, advisoryGoldValuePropsTitle, extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new ContributionSummaryCardViewState.Row[]{row2, row, row3})), dataState.getStrategiesUpsellBanner());
            }
            return ContributionSummaryCardViewState.Loading.INSTANCE;
        }
    }
}
