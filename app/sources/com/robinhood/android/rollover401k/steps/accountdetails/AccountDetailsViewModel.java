package com.robinhood.android.rollover401k.steps.accountdetails;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FoundAccountDetailsState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J±\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/accountdetails/AccountDetailsViewModel;", "", "title", "", "brokerName", "connectedDate", "accountBalance", "contributionType", "lastContributionDate", "accountFees", "accountDetailsHeading", "accountDetailsRows", "", "Lcom/robinhood/android/rollover401k/steps/accountdetails/DataRow;", "portfolioAllocationHeading", "portfolioAllocations", "Lcom/robinhood/android/rollover401k/steps/accountdetails/PortfolioAllocation;", "portfolioAllocationRows", "connectedMessage", "plaidDisclaimer", "footerDisclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBrokerName", "getConnectedDate", "getAccountBalance", "getContributionType", "getLastContributionDate", "getAccountFees", "getAccountDetailsHeading", "getAccountDetailsRows", "()Ljava/util/List;", "getPortfolioAllocationHeading", "getPortfolioAllocations", "getPortfolioAllocationRows", "getConnectedMessage", "getPlaidDisclaimer", "getFooterDisclaimer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountDetailsViewModel {
    public static final int $stable = 8;
    private final String accountBalance;
    private final String accountDetailsHeading;
    private final List<DataRow> accountDetailsRows;
    private final String accountFees;
    private final String brokerName;
    private final String connectedDate;
    private final String connectedMessage;
    private final String contributionType;
    private final String footerDisclaimer;
    private final String lastContributionDate;
    private final String plaidDisclaimer;
    private final String portfolioAllocationHeading;
    private final List<DataRow> portfolioAllocationRows;
    private final List<PortfolioAllocation> portfolioAllocations;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPortfolioAllocationHeading() {
        return this.portfolioAllocationHeading;
    }

    public final List<PortfolioAllocation> component11() {
        return this.portfolioAllocations;
    }

    public final List<DataRow> component12() {
        return this.portfolioAllocationRows;
    }

    /* renamed from: component13, reason: from getter */
    public final String getConnectedMessage() {
        return this.connectedMessage;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPlaidDisclaimer() {
        return this.plaidDisclaimer;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFooterDisclaimer() {
        return this.footerDisclaimer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBrokerName() {
        return this.brokerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConnectedDate() {
        return this.connectedDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccountBalance() {
        return this.accountBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContributionType() {
        return this.contributionType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLastContributionDate() {
        return this.lastContributionDate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAccountFees() {
        return this.accountFees;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAccountDetailsHeading() {
        return this.accountDetailsHeading;
    }

    public final List<DataRow> component9() {
        return this.accountDetailsRows;
    }

    public final AccountDetailsViewModel copy(String title, String brokerName, String connectedDate, String accountBalance, String contributionType, String lastContributionDate, String accountFees, String accountDetailsHeading, List<DataRow> accountDetailsRows, String portfolioAllocationHeading, List<PortfolioAllocation> portfolioAllocations, List<DataRow> portfolioAllocationRows, String connectedMessage, String plaidDisclaimer, String footerDisclaimer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(connectedDate, "connectedDate");
        Intrinsics.checkNotNullParameter(accountBalance, "accountBalance");
        Intrinsics.checkNotNullParameter(contributionType, "contributionType");
        Intrinsics.checkNotNullParameter(lastContributionDate, "lastContributionDate");
        Intrinsics.checkNotNullParameter(accountFees, "accountFees");
        Intrinsics.checkNotNullParameter(accountDetailsHeading, "accountDetailsHeading");
        Intrinsics.checkNotNullParameter(accountDetailsRows, "accountDetailsRows");
        Intrinsics.checkNotNullParameter(portfolioAllocationHeading, "portfolioAllocationHeading");
        Intrinsics.checkNotNullParameter(portfolioAllocations, "portfolioAllocations");
        Intrinsics.checkNotNullParameter(portfolioAllocationRows, "portfolioAllocationRows");
        Intrinsics.checkNotNullParameter(connectedMessage, "connectedMessage");
        Intrinsics.checkNotNullParameter(plaidDisclaimer, "plaidDisclaimer");
        Intrinsics.checkNotNullParameter(footerDisclaimer, "footerDisclaimer");
        return new AccountDetailsViewModel(title, brokerName, connectedDate, accountBalance, contributionType, lastContributionDate, accountFees, accountDetailsHeading, accountDetailsRows, portfolioAllocationHeading, portfolioAllocations, portfolioAllocationRows, connectedMessage, plaidDisclaimer, footerDisclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDetailsViewModel)) {
            return false;
        }
        AccountDetailsViewModel accountDetailsViewModel = (AccountDetailsViewModel) other;
        return Intrinsics.areEqual(this.title, accountDetailsViewModel.title) && Intrinsics.areEqual(this.brokerName, accountDetailsViewModel.brokerName) && Intrinsics.areEqual(this.connectedDate, accountDetailsViewModel.connectedDate) && Intrinsics.areEqual(this.accountBalance, accountDetailsViewModel.accountBalance) && Intrinsics.areEqual(this.contributionType, accountDetailsViewModel.contributionType) && Intrinsics.areEqual(this.lastContributionDate, accountDetailsViewModel.lastContributionDate) && Intrinsics.areEqual(this.accountFees, accountDetailsViewModel.accountFees) && Intrinsics.areEqual(this.accountDetailsHeading, accountDetailsViewModel.accountDetailsHeading) && Intrinsics.areEqual(this.accountDetailsRows, accountDetailsViewModel.accountDetailsRows) && Intrinsics.areEqual(this.portfolioAllocationHeading, accountDetailsViewModel.portfolioAllocationHeading) && Intrinsics.areEqual(this.portfolioAllocations, accountDetailsViewModel.portfolioAllocations) && Intrinsics.areEqual(this.portfolioAllocationRows, accountDetailsViewModel.portfolioAllocationRows) && Intrinsics.areEqual(this.connectedMessage, accountDetailsViewModel.connectedMessage) && Intrinsics.areEqual(this.plaidDisclaimer, accountDetailsViewModel.plaidDisclaimer) && Intrinsics.areEqual(this.footerDisclaimer, accountDetailsViewModel.footerDisclaimer);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.title.hashCode() * 31) + this.brokerName.hashCode()) * 31) + this.connectedDate.hashCode()) * 31) + this.accountBalance.hashCode()) * 31) + this.contributionType.hashCode()) * 31) + this.lastContributionDate.hashCode()) * 31) + this.accountFees.hashCode()) * 31) + this.accountDetailsHeading.hashCode()) * 31) + this.accountDetailsRows.hashCode()) * 31) + this.portfolioAllocationHeading.hashCode()) * 31) + this.portfolioAllocations.hashCode()) * 31) + this.portfolioAllocationRows.hashCode()) * 31) + this.connectedMessage.hashCode()) * 31) + this.plaidDisclaimer.hashCode()) * 31) + this.footerDisclaimer.hashCode();
    }

    public String toString() {
        return "AccountDetailsViewModel(title=" + this.title + ", brokerName=" + this.brokerName + ", connectedDate=" + this.connectedDate + ", accountBalance=" + this.accountBalance + ", contributionType=" + this.contributionType + ", lastContributionDate=" + this.lastContributionDate + ", accountFees=" + this.accountFees + ", accountDetailsHeading=" + this.accountDetailsHeading + ", accountDetailsRows=" + this.accountDetailsRows + ", portfolioAllocationHeading=" + this.portfolioAllocationHeading + ", portfolioAllocations=" + this.portfolioAllocations + ", portfolioAllocationRows=" + this.portfolioAllocationRows + ", connectedMessage=" + this.connectedMessage + ", plaidDisclaimer=" + this.plaidDisclaimer + ", footerDisclaimer=" + this.footerDisclaimer + ")";
    }

    public AccountDetailsViewModel(String title, String brokerName, String connectedDate, String accountBalance, String contributionType, String lastContributionDate, String accountFees, String accountDetailsHeading, List<DataRow> accountDetailsRows, String portfolioAllocationHeading, List<PortfolioAllocation> portfolioAllocations, List<DataRow> portfolioAllocationRows, String connectedMessage, String plaidDisclaimer, String footerDisclaimer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(connectedDate, "connectedDate");
        Intrinsics.checkNotNullParameter(accountBalance, "accountBalance");
        Intrinsics.checkNotNullParameter(contributionType, "contributionType");
        Intrinsics.checkNotNullParameter(lastContributionDate, "lastContributionDate");
        Intrinsics.checkNotNullParameter(accountFees, "accountFees");
        Intrinsics.checkNotNullParameter(accountDetailsHeading, "accountDetailsHeading");
        Intrinsics.checkNotNullParameter(accountDetailsRows, "accountDetailsRows");
        Intrinsics.checkNotNullParameter(portfolioAllocationHeading, "portfolioAllocationHeading");
        Intrinsics.checkNotNullParameter(portfolioAllocations, "portfolioAllocations");
        Intrinsics.checkNotNullParameter(portfolioAllocationRows, "portfolioAllocationRows");
        Intrinsics.checkNotNullParameter(connectedMessage, "connectedMessage");
        Intrinsics.checkNotNullParameter(plaidDisclaimer, "plaidDisclaimer");
        Intrinsics.checkNotNullParameter(footerDisclaimer, "footerDisclaimer");
        this.title = title;
        this.brokerName = brokerName;
        this.connectedDate = connectedDate;
        this.accountBalance = accountBalance;
        this.contributionType = contributionType;
        this.lastContributionDate = lastContributionDate;
        this.accountFees = accountFees;
        this.accountDetailsHeading = accountDetailsHeading;
        this.accountDetailsRows = accountDetailsRows;
        this.portfolioAllocationHeading = portfolioAllocationHeading;
        this.portfolioAllocations = portfolioAllocations;
        this.portfolioAllocationRows = portfolioAllocationRows;
        this.connectedMessage = connectedMessage;
        this.plaidDisclaimer = plaidDisclaimer;
        this.footerDisclaimer = footerDisclaimer;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBrokerName() {
        return this.brokerName;
    }

    public final String getConnectedDate() {
        return this.connectedDate;
    }

    public final String getAccountBalance() {
        return this.accountBalance;
    }

    public final String getContributionType() {
        return this.contributionType;
    }

    public final String getLastContributionDate() {
        return this.lastContributionDate;
    }

    public final String getAccountFees() {
        return this.accountFees;
    }

    public final String getAccountDetailsHeading() {
        return this.accountDetailsHeading;
    }

    public final List<DataRow> getAccountDetailsRows() {
        return this.accountDetailsRows;
    }

    public final String getPortfolioAllocationHeading() {
        return this.portfolioAllocationHeading;
    }

    public final List<PortfolioAllocation> getPortfolioAllocations() {
        return this.portfolioAllocations;
    }

    public final List<DataRow> getPortfolioAllocationRows() {
        return this.portfolioAllocationRows;
    }

    public final String getConnectedMessage() {
        return this.connectedMessage;
    }

    public final String getPlaidDisclaimer() {
        return this.plaidDisclaimer;
    }

    public final String getFooterDisclaimer() {
        return this.footerDisclaimer;
    }
}
