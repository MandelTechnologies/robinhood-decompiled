package com.robinhood.android.retirement.p239ui.contributions;

import androidx.paging.Pager;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCard;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionsDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState;", "", "ringPlacement", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;", "historyPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "matchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "activeAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;Landroidx/paging/Pager;Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;Lcom/robinhood/models/db/Account;)V", "getRingPlacement", "()Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;", "getHistoryPager", "()Landroidx/paging/Pager;", "getMatchRate", "()Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Provider", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionsDataState {
    private final Account activeAccount;
    private final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager;
    private final RetirementMatchRate matchRate;
    private final ContributionsSummaryCard ringPlacement;
    private final RetirementCombinedContributionViewModel viewModel;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ContributionsDataState copy$default(ContributionsDataState contributionsDataState, ContributionsSummaryCard contributionsSummaryCard, RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Pager pager, RetirementMatchRate retirementMatchRate, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            contributionsSummaryCard = contributionsDataState.ringPlacement;
        }
        if ((i & 2) != 0) {
            retirementCombinedContributionViewModel = contributionsDataState.viewModel;
        }
        if ((i & 4) != 0) {
            pager = contributionsDataState.historyPager;
        }
        if ((i & 8) != 0) {
            retirementMatchRate = contributionsDataState.matchRate;
        }
        if ((i & 16) != 0) {
            account = contributionsDataState.activeAccount;
        }
        Account account2 = account;
        Pager pager2 = pager;
        return contributionsDataState.copy(contributionsSummaryCard, retirementCombinedContributionViewModel, pager2, retirementMatchRate, account2);
    }

    /* renamed from: component1, reason: from getter */
    public final ContributionsSummaryCard getRingPlacement() {
        return this.ringPlacement;
    }

    /* renamed from: component2, reason: from getter */
    public final RetirementCombinedContributionViewModel getViewModel() {
        return this.viewModel;
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> component3() {
        return this.historyPager;
    }

    /* renamed from: component4, reason: from getter */
    public final RetirementMatchRate getMatchRate() {
        return this.matchRate;
    }

    /* renamed from: component5, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public final ContributionsDataState copy(ContributionsSummaryCard ringPlacement, RetirementCombinedContributionViewModel viewModel, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, RetirementMatchRate matchRate, Account activeAccount) {
        Intrinsics.checkNotNullParameter(ringPlacement, "ringPlacement");
        return new ContributionsDataState(ringPlacement, viewModel, historyPager, matchRate, activeAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionsDataState)) {
            return false;
        }
        ContributionsDataState contributionsDataState = (ContributionsDataState) other;
        return this.ringPlacement == contributionsDataState.ringPlacement && Intrinsics.areEqual(this.viewModel, contributionsDataState.viewModel) && Intrinsics.areEqual(this.historyPager, contributionsDataState.historyPager) && Intrinsics.areEqual(this.matchRate, contributionsDataState.matchRate) && Intrinsics.areEqual(this.activeAccount, contributionsDataState.activeAccount);
    }

    public int hashCode() {
        int iHashCode = this.ringPlacement.hashCode() * 31;
        RetirementCombinedContributionViewModel retirementCombinedContributionViewModel = this.viewModel;
        int iHashCode2 = (iHashCode + (retirementCombinedContributionViewModel == null ? 0 : retirementCombinedContributionViewModel.hashCode())) * 31;
        Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager = this.historyPager;
        int iHashCode3 = (iHashCode2 + (pager == null ? 0 : pager.hashCode())) * 31;
        RetirementMatchRate retirementMatchRate = this.matchRate;
        int iHashCode4 = (iHashCode3 + (retirementMatchRate == null ? 0 : retirementMatchRate.hashCode())) * 31;
        Account account = this.activeAccount;
        return iHashCode4 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "ContributionsDataState(ringPlacement=" + this.ringPlacement + ", viewModel=" + this.viewModel + ", historyPager=" + this.historyPager + ", matchRate=" + this.matchRate + ", activeAccount=" + this.activeAccount + ")";
    }

    public ContributionsDataState(ContributionsSummaryCard ringPlacement, RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, RetirementMatchRate retirementMatchRate, Account account) {
        Intrinsics.checkNotNullParameter(ringPlacement, "ringPlacement");
        this.ringPlacement = ringPlacement;
        this.viewModel = retirementCombinedContributionViewModel;
        this.historyPager = pager;
        this.matchRate = retirementMatchRate;
        this.activeAccount = account;
    }

    public /* synthetic */ ContributionsDataState(ContributionsSummaryCard contributionsSummaryCard, RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Pager pager, RetirementMatchRate retirementMatchRate, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contributionsSummaryCard, (i & 2) != 0 ? null : retirementCombinedContributionViewModel, (i & 4) != 0 ? null : pager, (i & 8) != 0 ? null : retirementMatchRate, (i & 16) != 0 ? null : account);
    }

    public final ContributionsSummaryCard getRingPlacement() {
        return this.ringPlacement;
    }

    public final RetirementCombinedContributionViewModel getViewModel() {
        return this.viewModel;
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> getHistoryPager() {
        return this.historyPager;
    }

    public final RetirementMatchRate getMatchRate() {
        return this.matchRate;
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    /* compiled from: ContributionsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsDataState;", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<ContributionsDataState, ContributionsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public ContributionsViewState reduce(ContributionsDataState dataState) {
            CombinedContributionHeader3 combinedContributionHeader3;
            RetirementMatchRate matchRate;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            Account activeAccount = dataState.getActiveAccount();
            boolean zIsManaged = activeAccount != null ? activeAccount.isManaged() : false;
            ContributionsSummaryCard ringPlacement = dataState.getRingPlacement();
            RetirementCombinedContributionViewModel viewModel = dataState.getViewModel();
            Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager = dataState.getHistoryPager();
            MatchRateBreakdown activeBreakdownForAch = null;
            if (!zIsManaged && (matchRate = dataState.getMatchRate()) != null) {
                activeBreakdownForAch = matchRate.getActiveBreakdownForAch();
            }
            if (zIsManaged) {
                combinedContributionHeader3 = CombinedContributionHeader3.FEDERAL_LIMIT;
            } else {
                combinedContributionHeader3 = CombinedContributionHeader3.MATCH;
            }
            return new ContributionsViewState(ringPlacement, viewModel, historyPager, activeBreakdownForAch, combinedContributionHeader3);
        }
    }
}
