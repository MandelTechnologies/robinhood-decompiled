package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel2;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel4;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFundingMethodsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "", "AssetTransferTimeline", "ShowAgreements", "Deposit", "RetirementContribution", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$AssetTransferTimeline;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$Deposit;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$RetirementContribution;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$ShowAgreements;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryFundingMethodsEvent {

    /* compiled from: AdvisoryFundingMethodsEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$AssetTransferTimeline;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "timeline", "Lcom/robinhood/models/advisory/api/contribution/FundingMethodTimeline;", "loggingIdentifier", "", "<init>", "(Lcom/robinhood/models/advisory/api/contribution/FundingMethodTimeline;Ljava/lang/String;)V", "getTimeline", "()Lcom/robinhood/models/advisory/api/contribution/FundingMethodTimeline;", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AssetTransferTimeline implements AdvisoryFundingMethodsEvent {
        public static final int $stable = 8;
        private final String loggingIdentifier;
        private final ApiAdvisoryFirstTimeContributionViewModel4 timeline;

        public static /* synthetic */ AssetTransferTimeline copy$default(AssetTransferTimeline assetTransferTimeline, ApiAdvisoryFirstTimeContributionViewModel4 apiAdvisoryFirstTimeContributionViewModel4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiAdvisoryFirstTimeContributionViewModel4 = assetTransferTimeline.timeline;
            }
            if ((i & 2) != 0) {
                str = assetTransferTimeline.loggingIdentifier;
            }
            return assetTransferTimeline.copy(apiAdvisoryFirstTimeContributionViewModel4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiAdvisoryFirstTimeContributionViewModel4 getTimeline() {
            return this.timeline;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final AssetTransferTimeline copy(ApiAdvisoryFirstTimeContributionViewModel4 timeline, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(timeline, "timeline");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            return new AssetTransferTimeline(timeline, loggingIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetTransferTimeline)) {
                return false;
            }
            AssetTransferTimeline assetTransferTimeline = (AssetTransferTimeline) other;
            return Intrinsics.areEqual(this.timeline, assetTransferTimeline.timeline) && Intrinsics.areEqual(this.loggingIdentifier, assetTransferTimeline.loggingIdentifier);
        }

        public int hashCode() {
            return (this.timeline.hashCode() * 31) + this.loggingIdentifier.hashCode();
        }

        public String toString() {
            return "AssetTransferTimeline(timeline=" + this.timeline + ", loggingIdentifier=" + this.loggingIdentifier + ")";
        }

        public AssetTransferTimeline(ApiAdvisoryFirstTimeContributionViewModel4 timeline, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(timeline, "timeline");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            this.timeline = timeline;
            this.loggingIdentifier = loggingIdentifier;
        }

        public final ApiAdvisoryFirstTimeContributionViewModel4 getTimeline() {
            return this.timeline;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }
    }

    /* compiled from: AdvisoryFundingMethodsEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$ShowAgreements;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAgreements implements AdvisoryFundingMethodsEvent {
        public static final int $stable = 0;
        public static final ShowAgreements INSTANCE = new ShowAgreements();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowAgreements);
        }

        public int hashCode() {
            return 1196862915;
        }

        public String toString() {
            return "ShowAgreements";
        }

        private ShowAgreements() {
        }
    }

    /* compiled from: AdvisoryFundingMethodsEvent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$Deposit;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;)V", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "getViewModel", "()Lcom/robinhood/models/advisory/api/contribution/ContributionViewModel$MoneyTransferViewModel;", "getSourceTransferAccountInfo", "()Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Deposit implements AdvisoryFundingMethodsEvent {
        public static final int $stable = 8;
        private final Money minimumDeposit;
        private final TransferAccountInfo sourceTransferAccountInfo;
        private final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel;

        public static /* synthetic */ Deposit copy$default(Deposit deposit, Money money, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel moneyTransferViewModel, TransferAccountInfo transferAccountInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                money = deposit.minimumDeposit;
            }
            if ((i & 2) != 0) {
                moneyTransferViewModel = deposit.viewModel;
            }
            if ((i & 4) != 0) {
                transferAccountInfo = deposit.sourceTransferAccountInfo;
            }
            return deposit.copy(money, moneyTransferViewModel, transferAccountInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel getViewModel() {
            return this.viewModel;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccountInfo getSourceTransferAccountInfo() {
            return this.sourceTransferAccountInfo;
        }

        public final Deposit copy(Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, TransferAccountInfo sourceTransferAccountInfo) {
            Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new Deposit(minimumDeposit, viewModel, sourceTransferAccountInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deposit)) {
                return false;
            }
            Deposit deposit = (Deposit) other;
            return Intrinsics.areEqual(this.minimumDeposit, deposit.minimumDeposit) && Intrinsics.areEqual(this.viewModel, deposit.viewModel) && Intrinsics.areEqual(this.sourceTransferAccountInfo, deposit.sourceTransferAccountInfo);
        }

        public int hashCode() {
            int iHashCode = ((this.minimumDeposit.hashCode() * 31) + this.viewModel.hashCode()) * 31;
            TransferAccountInfo transferAccountInfo = this.sourceTransferAccountInfo;
            return iHashCode + (transferAccountInfo == null ? 0 : transferAccountInfo.hashCode());
        }

        public String toString() {
            return "Deposit(minimumDeposit=" + this.minimumDeposit + ", viewModel=" + this.viewModel + ", sourceTransferAccountInfo=" + this.sourceTransferAccountInfo + ")";
        }

        public Deposit(Money minimumDeposit, ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel viewModel, TransferAccountInfo transferAccountInfo) {
            Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.minimumDeposit = minimumDeposit;
            this.viewModel = viewModel;
            this.sourceTransferAccountInfo = transferAccountInfo;
        }

        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        public final ApiAdvisoryFirstTimeContributionViewModel2.MoneyTransferViewModel getViewModel() {
            return this.viewModel;
        }

        public final TransferAccountInfo getSourceTransferAccountInfo() {
            return this.sourceTransferAccountInfo;
        }
    }

    /* compiled from: AdvisoryFundingMethodsEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent$RetirementContribution;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsEvent;", "contributionYears", "", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "minimumContribution", "Lcom/robinhood/models/util/Money;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/util/Money;)V", "getContributionYears", "()Ljava/util/List;", "getMinimumContribution", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RetirementContribution implements AdvisoryFundingMethodsEvent {
        public static final int $stable = 8;
        private final List<ContributionYear> contributionYears;
        private final Money minimumContribution;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RetirementContribution copy$default(RetirementContribution retirementContribution, List list, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                list = retirementContribution.contributionYears;
            }
            if ((i & 2) != 0) {
                money = retirementContribution.minimumContribution;
            }
            return retirementContribution.copy(list, money);
        }

        public final List<ContributionYear> component1() {
            return this.contributionYears;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getMinimumContribution() {
            return this.minimumContribution;
        }

        public final RetirementContribution copy(List<ContributionYear> contributionYears, Money minimumContribution) {
            Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
            Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
            return new RetirementContribution(contributionYears, minimumContribution);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RetirementContribution)) {
                return false;
            }
            RetirementContribution retirementContribution = (RetirementContribution) other;
            return Intrinsics.areEqual(this.contributionYears, retirementContribution.contributionYears) && Intrinsics.areEqual(this.minimumContribution, retirementContribution.minimumContribution);
        }

        public int hashCode() {
            return (this.contributionYears.hashCode() * 31) + this.minimumContribution.hashCode();
        }

        public String toString() {
            return "RetirementContribution(contributionYears=" + this.contributionYears + ", minimumContribution=" + this.minimumContribution + ")";
        }

        public RetirementContribution(List<ContributionYear> contributionYears, Money minimumContribution) {
            Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
            Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
            this.contributionYears = contributionYears;
            this.minimumContribution = minimumContribution;
        }

        public final List<ContributionYear> getContributionYears() {
            return this.contributionYears;
        }

        public final Money getMinimumContribution() {
            return this.minimumContribution;
        }
    }
}
