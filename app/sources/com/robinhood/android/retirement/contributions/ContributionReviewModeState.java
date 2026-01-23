package com.robinhood.android.retirement.contributions;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jn\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b\f\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b\r\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010#¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "", "", "contributionAmount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "", "showFrequencyRow", "Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", "accountSelectionData", "j$/time/Year", "taxYear", "isLoading", "isTaxYearLocked", "Lcom/robinhood/android/retirement/contributions/ContributionTypeRowState;", "contributionTypeRowState", "Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;", "goldMatchSelectionRowState", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/TransferFrequency;ZLcom/robinhood/android/retirement/contributions/AccountSelectionData;Lj$/time/Year;ZZLcom/robinhood/android/retirement/contributions/ContributionTypeRowState;Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component3", "()Z", "component4", "()Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", "component5", "()Lj$/time/Year;", "component6", "component7", "component8", "()Lcom/robinhood/android/retirement/contributions/ContributionTypeRowState;", "component9", "()Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;", "copy", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/TransferFrequency;ZLcom/robinhood/android/retirement/contributions/AccountSelectionData;Lj$/time/Year;ZZLcom/robinhood/android/retirement/contributions/ContributionTypeRowState;Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;)Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContributionAmount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "Z", "getShowFrequencyRow", "Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", "getAccountSelectionData", "Lj$/time/Year;", "getTaxYear", "Lcom/robinhood/android/retirement/contributions/ContributionTypeRowState;", "getContributionTypeRowState", "Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;", "getGoldMatchSelectionRowState", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionReviewModeState {
    public static final int $stable = 8;
    private final AccountSelectionData accountSelectionData;
    private final String contributionAmount;
    private final ContributionTypeRowState contributionTypeRowState;
    private final ApiCreateTransferRequest2 frequency;
    private final GoldMatchSelectionRowState goldMatchSelectionRowState;
    private final boolean isLoading;
    private final boolean isTaxYearLocked;
    private final boolean showFrequencyRow;
    private final Year taxYear;

    public static /* synthetic */ ContributionReviewModeState copy$default(ContributionReviewModeState contributionReviewModeState, String str, ApiCreateTransferRequest2 apiCreateTransferRequest2, boolean z, AccountSelectionData accountSelectionData, Year year, boolean z2, boolean z3, ContributionTypeRowState contributionTypeRowState, GoldMatchSelectionRowState goldMatchSelectionRowState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contributionReviewModeState.contributionAmount;
        }
        if ((i & 2) != 0) {
            apiCreateTransferRequest2 = contributionReviewModeState.frequency;
        }
        if ((i & 4) != 0) {
            z = contributionReviewModeState.showFrequencyRow;
        }
        if ((i & 8) != 0) {
            accountSelectionData = contributionReviewModeState.accountSelectionData;
        }
        if ((i & 16) != 0) {
            year = contributionReviewModeState.taxYear;
        }
        if ((i & 32) != 0) {
            z2 = contributionReviewModeState.isLoading;
        }
        if ((i & 64) != 0) {
            z3 = contributionReviewModeState.isTaxYearLocked;
        }
        if ((i & 128) != 0) {
            contributionTypeRowState = contributionReviewModeState.contributionTypeRowState;
        }
        if ((i & 256) != 0) {
            goldMatchSelectionRowState = contributionReviewModeState.goldMatchSelectionRowState;
        }
        ContributionTypeRowState contributionTypeRowState2 = contributionTypeRowState;
        GoldMatchSelectionRowState goldMatchSelectionRowState2 = goldMatchSelectionRowState;
        boolean z4 = z2;
        boolean z5 = z3;
        Year year2 = year;
        boolean z6 = z;
        return contributionReviewModeState.copy(str, apiCreateTransferRequest2, z6, accountSelectionData, year2, z4, z5, contributionTypeRowState2, goldMatchSelectionRowState2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContributionAmount() {
        return this.contributionAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowFrequencyRow() {
        return this.showFrequencyRow;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountSelectionData getAccountSelectionData() {
        return this.accountSelectionData;
    }

    /* renamed from: component5, reason: from getter */
    public final Year getTaxYear() {
        return this.taxYear;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsTaxYearLocked() {
        return this.isTaxYearLocked;
    }

    /* renamed from: component8, reason: from getter */
    public final ContributionTypeRowState getContributionTypeRowState() {
        return this.contributionTypeRowState;
    }

    /* renamed from: component9, reason: from getter */
    public final GoldMatchSelectionRowState getGoldMatchSelectionRowState() {
        return this.goldMatchSelectionRowState;
    }

    public final ContributionReviewModeState copy(String contributionAmount, ApiCreateTransferRequest2 frequency, boolean showFrequencyRow, AccountSelectionData accountSelectionData, Year taxYear, boolean isLoading, boolean isTaxYearLocked, ContributionTypeRowState contributionTypeRowState, GoldMatchSelectionRowState goldMatchSelectionRowState) {
        Intrinsics.checkNotNullParameter(contributionAmount, "contributionAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(accountSelectionData, "accountSelectionData");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        return new ContributionReviewModeState(contributionAmount, frequency, showFrequencyRow, accountSelectionData, taxYear, isLoading, isTaxYearLocked, contributionTypeRowState, goldMatchSelectionRowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionReviewModeState)) {
            return false;
        }
        ContributionReviewModeState contributionReviewModeState = (ContributionReviewModeState) other;
        return Intrinsics.areEqual(this.contributionAmount, contributionReviewModeState.contributionAmount) && this.frequency == contributionReviewModeState.frequency && this.showFrequencyRow == contributionReviewModeState.showFrequencyRow && Intrinsics.areEqual(this.accountSelectionData, contributionReviewModeState.accountSelectionData) && Intrinsics.areEqual(this.taxYear, contributionReviewModeState.taxYear) && this.isLoading == contributionReviewModeState.isLoading && this.isTaxYearLocked == contributionReviewModeState.isTaxYearLocked && Intrinsics.areEqual(this.contributionTypeRowState, contributionReviewModeState.contributionTypeRowState) && Intrinsics.areEqual(this.goldMatchSelectionRowState, contributionReviewModeState.goldMatchSelectionRowState);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.contributionAmount.hashCode() * 31) + this.frequency.hashCode()) * 31) + Boolean.hashCode(this.showFrequencyRow)) * 31) + this.accountSelectionData.hashCode()) * 31) + this.taxYear.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isTaxYearLocked)) * 31;
        ContributionTypeRowState contributionTypeRowState = this.contributionTypeRowState;
        int iHashCode2 = (iHashCode + (contributionTypeRowState == null ? 0 : contributionTypeRowState.hashCode())) * 31;
        GoldMatchSelectionRowState goldMatchSelectionRowState = this.goldMatchSelectionRowState;
        return iHashCode2 + (goldMatchSelectionRowState != null ? goldMatchSelectionRowState.hashCode() : 0);
    }

    public String toString() {
        return "ContributionReviewModeState(contributionAmount=" + this.contributionAmount + ", frequency=" + this.frequency + ", showFrequencyRow=" + this.showFrequencyRow + ", accountSelectionData=" + this.accountSelectionData + ", taxYear=" + this.taxYear + ", isLoading=" + this.isLoading + ", isTaxYearLocked=" + this.isTaxYearLocked + ", contributionTypeRowState=" + this.contributionTypeRowState + ", goldMatchSelectionRowState=" + this.goldMatchSelectionRowState + ")";
    }

    public ContributionReviewModeState(String contributionAmount, ApiCreateTransferRequest2 frequency, boolean z, AccountSelectionData accountSelectionData, Year taxYear, boolean z2, boolean z3, ContributionTypeRowState contributionTypeRowState, GoldMatchSelectionRowState goldMatchSelectionRowState) {
        Intrinsics.checkNotNullParameter(contributionAmount, "contributionAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(accountSelectionData, "accountSelectionData");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        this.contributionAmount = contributionAmount;
        this.frequency = frequency;
        this.showFrequencyRow = z;
        this.accountSelectionData = accountSelectionData;
        this.taxYear = taxYear;
        this.isLoading = z2;
        this.isTaxYearLocked = z3;
        this.contributionTypeRowState = contributionTypeRowState;
        this.goldMatchSelectionRowState = goldMatchSelectionRowState;
    }

    public final String getContributionAmount() {
        return this.contributionAmount;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final boolean getShowFrequencyRow() {
        return this.showFrequencyRow;
    }

    public final AccountSelectionData getAccountSelectionData() {
        return this.accountSelectionData;
    }

    public final Year getTaxYear() {
        return this.taxYear;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isTaxYearLocked() {
        return this.isTaxYearLocked;
    }

    public final ContributionTypeRowState getContributionTypeRowState() {
        return this.contributionTypeRowState;
    }

    public final GoldMatchSelectionRowState getGoldMatchSelectionRowState() {
        return this.goldMatchSelectionRowState;
    }
}
