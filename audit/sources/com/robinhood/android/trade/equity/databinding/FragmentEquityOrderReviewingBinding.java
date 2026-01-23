package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.p261ui.dialog.MarketSessionChangeAlertView;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipView;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes9.dex */
public final class FragmentEquityOrderReviewingBinding implements ViewBinding {
    public final TradeAccountSwitcherView accountSwitcherBtn;
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final BlockableNestedScrollView contentScrollview;
    public final LinearLayout designSystemReviewContainer;
    public final ShimmerLoadingView equityOrderLoadingView;
    public final MarketSessionChangeAlertView marketSessionChangeAlert;
    public final RdsNumpadView numpad;
    public final Space numpadTopSpaceReplacement;
    public final EquityOrderTypeTooltipView orderTypeOnboardingTooltip;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final RdsTextButton sellAllBtn;
    public final CoordinatorLayout snackbarShim;
    public final RhTextView swipeHint;
    public final Barrier topOfNumpad;
    public final ComposeView twentyFourHourMarketReviewButtonContainer;

    private FragmentEquityOrderReviewingBinding(ConstraintLayout constraintLayout, TradeAccountSwitcherView tradeAccountSwitcherView, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, BlockableNestedScrollView blockableNestedScrollView, LinearLayout linearLayout, ShimmerLoadingView shimmerLoadingView, MarketSessionChangeAlertView marketSessionChangeAlertView, RdsNumpadView rdsNumpadView, Space space, EquityOrderTypeTooltipView equityOrderTypeTooltipView, RdsButton rdsButton, RdsTextButton rdsTextButton, CoordinatorLayout coordinatorLayout, RhTextView rhTextView, Barrier barrier, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.accountSwitcherBtn = tradeAccountSwitcherView;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.contentScrollview = blockableNestedScrollView;
        this.designSystemReviewContainer = linearLayout;
        this.equityOrderLoadingView = shimmerLoadingView;
        this.marketSessionChangeAlert = marketSessionChangeAlertView;
        this.numpad = rdsNumpadView;
        this.numpadTopSpaceReplacement = space;
        this.orderTypeOnboardingTooltip = equityOrderTypeTooltipView;
        this.reviewBtn = rdsButton;
        this.sellAllBtn = rdsTextButton;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = rhTextView;
        this.topOfNumpad = barrier;
        this.twentyFourHourMarketReviewButtonContainer = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEquityOrderReviewingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEquityOrderReviewingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_equity_order_reviewing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEquityOrderReviewingBinding bind(View view) {
        int i = C29365R.id.account_switcher_btn;
        TradeAccountSwitcherView tradeAccountSwitcherView = (TradeAccountSwitcherView) ViewBindings.findChildViewById(view, i);
        if (tradeAccountSwitcherView != null) {
            i = C29365R.id.cardview;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C29365R.id.content;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C29365R.id.content_scrollview;
                    BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (blockableNestedScrollView != null) {
                        i = C29365R.id.design_system_review_container;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C29365R.id.equity_order_loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C29365R.id.market_session_change_alert;
                                MarketSessionChangeAlertView marketSessionChangeAlertView = (MarketSessionChangeAlertView) ViewBindings.findChildViewById(view, i);
                                if (marketSessionChangeAlertView != null) {
                                    i = C29365R.id.numpad;
                                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                    if (rdsNumpadView != null) {
                                        i = C29365R.id.numpad_top_space_replacement;
                                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                                        if (space != null) {
                                            i = C29365R.id.order_type_onboarding_tooltip;
                                            EquityOrderTypeTooltipView equityOrderTypeTooltipView = (EquityOrderTypeTooltipView) ViewBindings.findChildViewById(view, i);
                                            if (equityOrderTypeTooltipView != null) {
                                                i = C29365R.id.review_btn;
                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton != null) {
                                                    i = C29365R.id.sell_all_btn;
                                                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                                    if (rdsTextButton != null) {
                                                        i = C29365R.id.snackbar_shim;
                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                        if (coordinatorLayout != null) {
                                                            i = C29365R.id.swipe_hint;
                                                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView != null) {
                                                                i = C29365R.id.top_of_numpad;
                                                                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                if (barrier != null) {
                                                                    i = C29365R.id.twenty_four_hour_market_review_button_container;
                                                                    ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                    if (composeView != null) {
                                                                        return new FragmentEquityOrderReviewingBinding(constraintLayout, tradeAccountSwitcherView, cardView, constraintLayout, constraintLayout2, blockableNestedScrollView, linearLayout, shimmerLoadingView, marketSessionChangeAlertView, rdsNumpadView, space, equityOrderTypeTooltipView, rdsButton, rdsTextButton, coordinatorLayout, rhTextView, barrier, composeView);
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
