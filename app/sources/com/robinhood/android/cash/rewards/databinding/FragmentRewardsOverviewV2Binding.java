package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.overview.p075v2.RewardsTransactionsHistoryView;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOverviewV2Binding implements ViewBinding {
    public final LottieAnimationView rewardsOverviewCoinAsset;
    public final Barrier rewardsOverviewCoinBarrier;
    public final RhTextView rewardsOverviewCreatedDate;
    public final RdsTextButton rewardsOverviewDisclosureButton;
    public final RewardsTransactionsHistoryView rewardsOverviewEligibleTransactions;
    public final Barrier rewardsOverviewEligibleTransactionsBarrier;
    public final RhTextView rewardsOverviewEligibleTransactionsMessage;
    public final RhTextView rewardsOverviewEligibleTransactionsTitle;
    public final UnifiedHistoryView rewardsOverviewInvestedRoundups;
    public final RhTextView rewardsOverviewInvestedRoundupsTitle;
    public final RdsTextButton rewardsOverviewResumeRoundupButton;
    public final RhTextView rewardsOverviewRoundups;
    public final RhTextView rewardsOverviewRoundupsAmount;
    public final RdsDataRowView rewardsOverviewTotalBonus;
    public final RdsDataRowView rewardsOverviewTotalRoundups;
    public final RhTextView rewardsOverviewWeeklyHeld;
    public final RhTextView rewardsOverviewWeeklyHeldAmount;
    public final RdsRippleContainerView rewardsOverviewWeeklyHeldBanner;
    private final FocusSafeNestedScrollView rootView;

    private FragmentRewardsOverviewV2Binding(FocusSafeNestedScrollView focusSafeNestedScrollView, LottieAnimationView lottieAnimationView, Barrier barrier, RhTextView rhTextView, RdsTextButton rdsTextButton, RewardsTransactionsHistoryView rewardsTransactionsHistoryView, Barrier barrier2, RhTextView rhTextView2, RhTextView rhTextView3, UnifiedHistoryView unifiedHistoryView, RhTextView rhTextView4, RdsTextButton rdsTextButton2, RhTextView rhTextView5, RhTextView rhTextView6, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RhTextView rhTextView7, RhTextView rhTextView8, RdsRippleContainerView rdsRippleContainerView) {
        this.rootView = focusSafeNestedScrollView;
        this.rewardsOverviewCoinAsset = lottieAnimationView;
        this.rewardsOverviewCoinBarrier = barrier;
        this.rewardsOverviewCreatedDate = rhTextView;
        this.rewardsOverviewDisclosureButton = rdsTextButton;
        this.rewardsOverviewEligibleTransactions = rewardsTransactionsHistoryView;
        this.rewardsOverviewEligibleTransactionsBarrier = barrier2;
        this.rewardsOverviewEligibleTransactionsMessage = rhTextView2;
        this.rewardsOverviewEligibleTransactionsTitle = rhTextView3;
        this.rewardsOverviewInvestedRoundups = unifiedHistoryView;
        this.rewardsOverviewInvestedRoundupsTitle = rhTextView4;
        this.rewardsOverviewResumeRoundupButton = rdsTextButton2;
        this.rewardsOverviewRoundups = rhTextView5;
        this.rewardsOverviewRoundupsAmount = rhTextView6;
        this.rewardsOverviewTotalBonus = rdsDataRowView;
        this.rewardsOverviewTotalRoundups = rdsDataRowView2;
        this.rewardsOverviewWeeklyHeld = rhTextView7;
        this.rewardsOverviewWeeklyHeldAmount = rhTextView8;
        this.rewardsOverviewWeeklyHeldBanner = rdsRippleContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOverviewV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOverviewV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_overview_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOverviewV2Binding bind(View view) {
        int i = C10176R.id.rewards_overview_coin_asset;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C10176R.id.rewards_overview_coin_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C10176R.id.rewards_overview_created_date;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10176R.id.rewards_overview_disclosure_button;
                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                    if (rdsTextButton != null) {
                        i = C10176R.id.rewards_overview_eligible_transactions;
                        RewardsTransactionsHistoryView rewardsTransactionsHistoryView = (RewardsTransactionsHistoryView) ViewBindings.findChildViewById(view, i);
                        if (rewardsTransactionsHistoryView != null) {
                            i = C10176R.id.rewards_overview_eligible_transactions_barrier;
                            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                            if (barrier2 != null) {
                                i = C10176R.id.rewards_overview_eligible_transactions_message;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C10176R.id.rewards_overview_eligible_transactions_title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        i = C10176R.id.rewards_overview_invested_roundups;
                                        UnifiedHistoryView unifiedHistoryView = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
                                        if (unifiedHistoryView != null) {
                                            i = C10176R.id.rewards_overview_invested_roundups_title;
                                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView4 != null) {
                                                i = C10176R.id.rewards_overview_resume_roundup_button;
                                                RdsTextButton rdsTextButton2 = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsTextButton2 != null) {
                                                    i = C10176R.id.rewards_overview_roundups;
                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView5 != null) {
                                                        i = C10176R.id.rewards_overview_roundups_amount;
                                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView6 != null) {
                                                            i = C10176R.id.rewards_overview_total_bonus;
                                                            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                            if (rdsDataRowView != null) {
                                                                i = C10176R.id.rewards_overview_total_roundups;
                                                                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                                                if (rdsDataRowView2 != null) {
                                                                    i = C10176R.id.rewards_overview_weekly_held;
                                                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView7 != null) {
                                                                        i = C10176R.id.rewards_overview_weekly_held_amount;
                                                                        RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView8 != null) {
                                                                            i = C10176R.id.rewards_overview_weekly_held_banner;
                                                                            RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
                                                                            if (rdsRippleContainerView != null) {
                                                                                return new FragmentRewardsOverviewV2Binding((FocusSafeNestedScrollView) view, lottieAnimationView, barrier, rhTextView, rdsTextButton, rewardsTransactionsHistoryView, barrier2, rhTextView2, rhTextView3, unifiedHistoryView, rhTextView4, rdsTextButton2, rhTextView5, rhTextView6, rdsDataRowView, rdsDataRowView2, rhTextView7, rhTextView8, rdsRippleContainerView);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
