package com.robinhood.android.retirement.p239ui.contributions;

import androidx.paging.Pager;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCard;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionsViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003JS\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;", "", "ringPlacement", "Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;", "historyPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "activeMatchBreakdown", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", ResourceTypes.STYLE, "Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;", "<init>", "(Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;Landroidx/paging/Pager;Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;)V", "getRingPlacement", "()Lcom/robinhood/android/retirement/dashboard/contribution/ContributionSummaryRingPlacement;", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;", "getHistoryPager", "()Landroidx/paging/Pager;", "getActiveMatchBreakdown", "()Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "getStyle", "()Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionsViewState {
    public static final int $stable = 8;
    private final MatchRateBreakdown activeMatchBreakdown;
    private final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager;
    private final ContributionsSummaryCard ringPlacement;
    private final CombinedContributionHeader3 style;
    private final RetirementCombinedContributionViewModel viewModel;

    public static /* synthetic */ ContributionsViewState copy$default(ContributionsViewState contributionsViewState, ContributionsSummaryCard contributionsSummaryCard, RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Pager pager, MatchRateBreakdown matchRateBreakdown, CombinedContributionHeader3 combinedContributionHeader3, int i, Object obj) {
        if ((i & 1) != 0) {
            contributionsSummaryCard = contributionsViewState.ringPlacement;
        }
        if ((i & 2) != 0) {
            retirementCombinedContributionViewModel = contributionsViewState.viewModel;
        }
        if ((i & 4) != 0) {
            pager = contributionsViewState.historyPager;
        }
        if ((i & 8) != 0) {
            matchRateBreakdown = contributionsViewState.activeMatchBreakdown;
        }
        if ((i & 16) != 0) {
            combinedContributionHeader3 = contributionsViewState.style;
        }
        CombinedContributionHeader3 combinedContributionHeader32 = combinedContributionHeader3;
        Pager pager2 = pager;
        return contributionsViewState.copy(contributionsSummaryCard, retirementCombinedContributionViewModel, pager2, matchRateBreakdown, combinedContributionHeader32);
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
    public final MatchRateBreakdown getActiveMatchBreakdown() {
        return this.activeMatchBreakdown;
    }

    /* renamed from: component5, reason: from getter */
    public final CombinedContributionHeader3 getStyle() {
        return this.style;
    }

    public final ContributionsViewState copy(ContributionsSummaryCard ringPlacement, RetirementCombinedContributionViewModel viewModel, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, MatchRateBreakdown activeMatchBreakdown, CombinedContributionHeader3 style) {
        Intrinsics.checkNotNullParameter(ringPlacement, "ringPlacement");
        Intrinsics.checkNotNullParameter(style, "style");
        return new ContributionsViewState(ringPlacement, viewModel, historyPager, activeMatchBreakdown, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionsViewState)) {
            return false;
        }
        ContributionsViewState contributionsViewState = (ContributionsViewState) other;
        return this.ringPlacement == contributionsViewState.ringPlacement && Intrinsics.areEqual(this.viewModel, contributionsViewState.viewModel) && Intrinsics.areEqual(this.historyPager, contributionsViewState.historyPager) && Intrinsics.areEqual(this.activeMatchBreakdown, contributionsViewState.activeMatchBreakdown) && this.style == contributionsViewState.style;
    }

    public int hashCode() {
        int iHashCode = this.ringPlacement.hashCode() * 31;
        RetirementCombinedContributionViewModel retirementCombinedContributionViewModel = this.viewModel;
        int iHashCode2 = (iHashCode + (retirementCombinedContributionViewModel == null ? 0 : retirementCombinedContributionViewModel.hashCode())) * 31;
        Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager = this.historyPager;
        int iHashCode3 = (iHashCode2 + (pager == null ? 0 : pager.hashCode())) * 31;
        MatchRateBreakdown matchRateBreakdown = this.activeMatchBreakdown;
        return ((iHashCode3 + (matchRateBreakdown != null ? matchRateBreakdown.hashCode() : 0)) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "ContributionsViewState(ringPlacement=" + this.ringPlacement + ", viewModel=" + this.viewModel + ", historyPager=" + this.historyPager + ", activeMatchBreakdown=" + this.activeMatchBreakdown + ", style=" + this.style + ")";
    }

    public ContributionsViewState(ContributionsSummaryCard ringPlacement, RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, MatchRateBreakdown matchRateBreakdown, CombinedContributionHeader3 style) {
        Intrinsics.checkNotNullParameter(ringPlacement, "ringPlacement");
        Intrinsics.checkNotNullParameter(style, "style");
        this.ringPlacement = ringPlacement;
        this.viewModel = retirementCombinedContributionViewModel;
        this.historyPager = pager;
        this.activeMatchBreakdown = matchRateBreakdown;
        this.style = style;
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

    public final MatchRateBreakdown getActiveMatchBreakdown() {
        return this.activeMatchBreakdown;
    }

    public final CombinedContributionHeader3 getStyle() {
        return this.style;
    }
}
