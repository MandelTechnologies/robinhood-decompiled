package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState;
import com.robinhood.android.advisory.dashboard.overview.portfolio.CategorySlice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ManagedDashboardOverviewChartState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/PortfolioBreakdownState;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewChartState;", "accountNumber", "", "categorySlices", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/overview/portfolio/CategorySlice;", "canShowIndividualAssets", "", "defaultDescription", "portfolioBreakdownDescription", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getCategorySlices", "()Lkotlinx/collections/immutable/ImmutableList;", "getCanShowIndividualAssets", "()Z", "getDefaultDescription", "getPortfolioBreakdownDescription", "type", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "getType", "()Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PortfolioBreakdownState implements ManagedDashboardOverviewChartState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final boolean canShowIndividualAssets;
    private final ImmutableList<CategorySlice> categorySlices;
    private final String defaultDescription;
    private final String portfolioBreakdownDescription;

    public static /* synthetic */ PortfolioBreakdownState copy$default(PortfolioBreakdownState portfolioBreakdownState, String str, ImmutableList immutableList, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioBreakdownState.accountNumber;
        }
        if ((i & 2) != 0) {
            immutableList = portfolioBreakdownState.categorySlices;
        }
        if ((i & 4) != 0) {
            z = portfolioBreakdownState.canShowIndividualAssets;
        }
        if ((i & 8) != 0) {
            str2 = portfolioBreakdownState.defaultDescription;
        }
        if ((i & 16) != 0) {
            str3 = portfolioBreakdownState.portfolioBreakdownDescription;
        }
        String str4 = str3;
        boolean z2 = z;
        return portfolioBreakdownState.copy(str, immutableList, z2, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<CategorySlice> component2() {
        return this.categorySlices;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanShowIndividualAssets() {
        return this.canShowIndividualAssets;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDefaultDescription() {
        return this.defaultDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPortfolioBreakdownDescription() {
        return this.portfolioBreakdownDescription;
    }

    public final PortfolioBreakdownState copy(String accountNumber, ImmutableList<CategorySlice> categorySlices, boolean canShowIndividualAssets, String defaultDescription, String portfolioBreakdownDescription) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(categorySlices, "categorySlices");
        Intrinsics.checkNotNullParameter(defaultDescription, "defaultDescription");
        Intrinsics.checkNotNullParameter(portfolioBreakdownDescription, "portfolioBreakdownDescription");
        return new PortfolioBreakdownState(accountNumber, categorySlices, canShowIndividualAssets, defaultDescription, portfolioBreakdownDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioBreakdownState)) {
            return false;
        }
        PortfolioBreakdownState portfolioBreakdownState = (PortfolioBreakdownState) other;
        return Intrinsics.areEqual(this.accountNumber, portfolioBreakdownState.accountNumber) && Intrinsics.areEqual(this.categorySlices, portfolioBreakdownState.categorySlices) && this.canShowIndividualAssets == portfolioBreakdownState.canShowIndividualAssets && Intrinsics.areEqual(this.defaultDescription, portfolioBreakdownState.defaultDescription) && Intrinsics.areEqual(this.portfolioBreakdownDescription, portfolioBreakdownState.portfolioBreakdownDescription);
    }

    public int hashCode() {
        return (((((((this.accountNumber.hashCode() * 31) + this.categorySlices.hashCode()) * 31) + Boolean.hashCode(this.canShowIndividualAssets)) * 31) + this.defaultDescription.hashCode()) * 31) + this.portfolioBreakdownDescription.hashCode();
    }

    public String toString() {
        return "PortfolioBreakdownState(accountNumber=" + this.accountNumber + ", categorySlices=" + this.categorySlices + ", canShowIndividualAssets=" + this.canShowIndividualAssets + ", defaultDescription=" + this.defaultDescription + ", portfolioBreakdownDescription=" + this.portfolioBreakdownDescription + ")";
    }

    public PortfolioBreakdownState(String accountNumber, ImmutableList<CategorySlice> categorySlices, boolean z, String defaultDescription, String portfolioBreakdownDescription) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(categorySlices, "categorySlices");
        Intrinsics.checkNotNullParameter(defaultDescription, "defaultDescription");
        Intrinsics.checkNotNullParameter(portfolioBreakdownDescription, "portfolioBreakdownDescription");
        this.accountNumber = accountNumber;
        this.categorySlices = categorySlices;
        this.canShowIndividualAssets = z;
        this.defaultDescription = defaultDescription;
        this.portfolioBreakdownDescription = portfolioBreakdownDescription;
    }

    @Override // com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState
    public boolean getShowUnreadIndicator() {
        return ManagedDashboardOverviewChartState.DefaultImpls.getShowUnreadIndicator(this);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<CategorySlice> getCategorySlices() {
        return this.categorySlices;
    }

    public final boolean getCanShowIndividualAssets() {
        return this.canShowIndividualAssets;
    }

    public final String getDefaultDescription() {
        return this.defaultDescription;
    }

    public final String getPortfolioBreakdownDescription() {
        return this.portfolioBreakdownDescription;
    }

    @Override // com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState
    public AdvisoryChartSwitcher getType() {
        return AdvisoryChartSwitcher.PORTFOLIO;
    }
}
