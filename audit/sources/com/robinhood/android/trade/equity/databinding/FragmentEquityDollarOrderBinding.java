package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.p261ui.dialog.MarketSessionChangeAlertView;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipView;

/* loaded from: classes9.dex */
public final class FragmentEquityDollarOrderBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final FrameLayout ctaContainer;
    public final ShimmerLoadingView equityDollarOrderLoadingView;
    public final MarketSessionChangeAlertView marketSessionChangeAlert;
    public final RdsNumpadView numpad;
    public final EquityOrderTypeTooltipView orderTypeOnboardingTooltip;
    public final RdsButton quickTradeAmountOneBtn;
    public final RdsButton quickTradeAmountThreeBtn;
    public final RdsButton quickTradeAmountTwoBtn;
    public final LinearLayout quickTradeAmountsContainer;
    public final RdsButton quickTradeSellAllBtn;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final CoordinatorLayout snackbarShim;
    public final RhTextView swipeHint;

    private FragmentEquityDollarOrderBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, MarketSessionChangeAlertView marketSessionChangeAlertView, RdsNumpadView rdsNumpadView, EquityOrderTypeTooltipView equityOrderTypeTooltipView, RdsButton rdsButton, RdsButton rdsButton2, RdsButton rdsButton3, LinearLayout linearLayout, RdsButton rdsButton4, RdsButton rdsButton5, CoordinatorLayout coordinatorLayout, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.ctaContainer = frameLayout;
        this.equityDollarOrderLoadingView = shimmerLoadingView;
        this.marketSessionChangeAlert = marketSessionChangeAlertView;
        this.numpad = rdsNumpadView;
        this.orderTypeOnboardingTooltip = equityOrderTypeTooltipView;
        this.quickTradeAmountOneBtn = rdsButton;
        this.quickTradeAmountThreeBtn = rdsButton2;
        this.quickTradeAmountTwoBtn = rdsButton3;
        this.quickTradeAmountsContainer = linearLayout;
        this.quickTradeSellAllBtn = rdsButton4;
        this.reviewBtn = rdsButton5;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEquityDollarOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEquityDollarOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_equity_dollar_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEquityDollarOrderBinding bind(View view) {
        int i = C29365R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C29365R.id.content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C29365R.id.cta_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C29365R.id.equity_dollar_order_loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        i = C29365R.id.market_session_change_alert;
                        MarketSessionChangeAlertView marketSessionChangeAlertView = (MarketSessionChangeAlertView) ViewBindings.findChildViewById(view, i);
                        if (marketSessionChangeAlertView != null) {
                            i = C29365R.id.numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                i = C29365R.id.order_type_onboarding_tooltip;
                                EquityOrderTypeTooltipView equityOrderTypeTooltipView = (EquityOrderTypeTooltipView) ViewBindings.findChildViewById(view, i);
                                if (equityOrderTypeTooltipView != null) {
                                    i = C29365R.id.quick_trade_amount_one_btn;
                                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton != null) {
                                        i = C29365R.id.quick_trade_amount_three_btn;
                                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsButton2 != null) {
                                            i = C29365R.id.quick_trade_amount_two_btn;
                                            RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton3 != null) {
                                                i = C29365R.id.quick_trade_amounts_container;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C29365R.id.quick_trade_sell_all_btn;
                                                    RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                    if (rdsButton4 != null) {
                                                        i = C29365R.id.review_btn;
                                                        RdsButton rdsButton5 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsButton5 != null) {
                                                            i = C29365R.id.snackbar_shim;
                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                            if (coordinatorLayout != null) {
                                                                i = C29365R.id.swipe_hint;
                                                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView != null) {
                                                                    return new FragmentEquityDollarOrderBinding(constraintLayout, cardView, constraintLayout, constraintLayout2, frameLayout, shimmerLoadingView, marketSessionChangeAlertView, rdsNumpadView, equityOrderTypeTooltipView, rdsButton, rdsButton2, rdsButton3, linearLayout, rdsButton4, rdsButton5, coordinatorLayout, rhTextView);
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
