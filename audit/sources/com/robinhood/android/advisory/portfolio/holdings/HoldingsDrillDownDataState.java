package com.robinhood.android.advisory.portfolio.holdings;

import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.models.advisory.p304db.portfolio.AssetClass3;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HoldingsDrillDownDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/holdings/HoldingsDrillDownDataState;", "", "region", "Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "accountNumber", "", "managedPortfolioSummary", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "interestEarningDisclosure", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "sweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "<init>", "(Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;Ljava/lang/String;Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;)V", "getRegion", "()Lcom/robinhood/models/advisory/db/portfolio/AssetClassRegion;", "getAccountNumber", "()Ljava/lang/String;", "getManagedPortfolioSummary", "()Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;", "getInterestEarningDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getSweepEnrollmentData", "()Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HoldingsDrillDownDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Disclosure interestEarningDisclosure;
    private final ManagedPortfolioSummary managedPortfolioSummary;
    private final AssetClass3 region;
    private final SweepEnrollmentData sweepEnrollmentData;

    public static /* synthetic */ HoldingsDrillDownDataState copy$default(HoldingsDrillDownDataState holdingsDrillDownDataState, AssetClass3 assetClass3, String str, ManagedPortfolioSummary managedPortfolioSummary, Disclosure disclosure, SweepEnrollmentData sweepEnrollmentData, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClass3 = holdingsDrillDownDataState.region;
        }
        if ((i & 2) != 0) {
            str = holdingsDrillDownDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            managedPortfolioSummary = holdingsDrillDownDataState.managedPortfolioSummary;
        }
        if ((i & 8) != 0) {
            disclosure = holdingsDrillDownDataState.interestEarningDisclosure;
        }
        if ((i & 16) != 0) {
            sweepEnrollmentData = holdingsDrillDownDataState.sweepEnrollmentData;
        }
        SweepEnrollmentData sweepEnrollmentData2 = sweepEnrollmentData;
        ManagedPortfolioSummary managedPortfolioSummary2 = managedPortfolioSummary;
        return holdingsDrillDownDataState.copy(assetClass3, str, managedPortfolioSummary2, disclosure, sweepEnrollmentData2);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetClass3 getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final ManagedPortfolioSummary getManagedPortfolioSummary() {
        return this.managedPortfolioSummary;
    }

    /* renamed from: component4, reason: from getter */
    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    /* renamed from: component5, reason: from getter */
    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }

    public final HoldingsDrillDownDataState copy(AssetClass3 region, String accountNumber, ManagedPortfolioSummary managedPortfolioSummary, Disclosure interestEarningDisclosure, SweepEnrollmentData sweepEnrollmentData) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new HoldingsDrillDownDataState(region, accountNumber, managedPortfolioSummary, interestEarningDisclosure, sweepEnrollmentData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingsDrillDownDataState)) {
            return false;
        }
        HoldingsDrillDownDataState holdingsDrillDownDataState = (HoldingsDrillDownDataState) other;
        return this.region == holdingsDrillDownDataState.region && Intrinsics.areEqual(this.accountNumber, holdingsDrillDownDataState.accountNumber) && Intrinsics.areEqual(this.managedPortfolioSummary, holdingsDrillDownDataState.managedPortfolioSummary) && Intrinsics.areEqual(this.interestEarningDisclosure, holdingsDrillDownDataState.interestEarningDisclosure) && Intrinsics.areEqual(this.sweepEnrollmentData, holdingsDrillDownDataState.sweepEnrollmentData);
    }

    public int hashCode() {
        int iHashCode = ((this.region.hashCode() * 31) + this.accountNumber.hashCode()) * 31;
        ManagedPortfolioSummary managedPortfolioSummary = this.managedPortfolioSummary;
        int iHashCode2 = (iHashCode + (managedPortfolioSummary == null ? 0 : managedPortfolioSummary.hashCode())) * 31;
        Disclosure disclosure = this.interestEarningDisclosure;
        int iHashCode3 = (iHashCode2 + (disclosure == null ? 0 : disclosure.hashCode())) * 31;
        SweepEnrollmentData sweepEnrollmentData = this.sweepEnrollmentData;
        return iHashCode3 + (sweepEnrollmentData != null ? sweepEnrollmentData.hashCode() : 0);
    }

    public String toString() {
        return "HoldingsDrillDownDataState(region=" + this.region + ", accountNumber=" + this.accountNumber + ", managedPortfolioSummary=" + this.managedPortfolioSummary + ", interestEarningDisclosure=" + this.interestEarningDisclosure + ", sweepEnrollmentData=" + this.sweepEnrollmentData + ")";
    }

    public HoldingsDrillDownDataState(AssetClass3 region, String accountNumber, ManagedPortfolioSummary managedPortfolioSummary, Disclosure disclosure, SweepEnrollmentData sweepEnrollmentData) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.region = region;
        this.accountNumber = accountNumber;
        this.managedPortfolioSummary = managedPortfolioSummary;
        this.interestEarningDisclosure = disclosure;
        this.sweepEnrollmentData = sweepEnrollmentData;
    }

    public /* synthetic */ HoldingsDrillDownDataState(AssetClass3 assetClass3, String str, ManagedPortfolioSummary managedPortfolioSummary, Disclosure disclosure, SweepEnrollmentData sweepEnrollmentData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetClass3, str, (i & 4) != 0 ? null : managedPortfolioSummary, (i & 8) != 0 ? null : disclosure, (i & 16) != 0 ? null : sweepEnrollmentData);
    }

    public final AssetClass3 getRegion() {
        return this.region;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ManagedPortfolioSummary getManagedPortfolioSummary() {
        return this.managedPortfolioSummary;
    }

    public final Disclosure getInterestEarningDisclosure() {
        return this.interestEarningDisclosure;
    }

    public final SweepEnrollmentData getSweepEnrollmentData() {
        return this.sweepEnrollmentData;
    }
}
