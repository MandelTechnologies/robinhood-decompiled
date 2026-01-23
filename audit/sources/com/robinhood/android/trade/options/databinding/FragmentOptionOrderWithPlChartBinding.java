package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes9.dex */
public final class FragmentOptionOrderWithPlChartBinding implements ViewBinding {
    public final TradeAccountSwitcherView accountSwitcherBtn;
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final BlockableNestedScrollView contentScrollview;
    public final RdsButton designSystemReviewBottomPosition;
    public final View designSystemReviewContainer;
    public final RdsButton designSystemReviewTopPosition;
    public final RdsNumpadView numpad;
    public final OptionsProfitLossChartView optionsProfitLossChart;
    public final RdsButton optionsProfitLossChartBtn;
    public final Group optionsProfitLossChartContainer;
    public final View optionsProfitLossChartCurtain;
    public final RdsButton optionsProfitLossChartLearnMore;
    public final OptionsProfitLossInfoBar optionsProfitLossInfoBar;
    public final RdsButton reviewBtn;
    public final ConstraintLayout reviewBtnHolder;
    private final ConstraintLayout rootView;
    public final ComposeView sduiAlertView;
    public final CoordinatorLayout snackbarShim;
    public final RhTextView swipeHint;

    private FragmentOptionOrderWithPlChartBinding(ConstraintLayout constraintLayout, TradeAccountSwitcherView tradeAccountSwitcherView, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, BlockableNestedScrollView blockableNestedScrollView, RdsButton rdsButton, View view, RdsButton rdsButton2, RdsNumpadView rdsNumpadView, OptionsProfitLossChartView optionsProfitLossChartView, RdsButton rdsButton3, Group group, View view2, RdsButton rdsButton4, OptionsProfitLossInfoBar optionsProfitLossInfoBar, RdsButton rdsButton5, ConstraintLayout constraintLayout4, ComposeView composeView, CoordinatorLayout coordinatorLayout, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.accountSwitcherBtn = tradeAccountSwitcherView;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.contentScrollview = blockableNestedScrollView;
        this.designSystemReviewBottomPosition = rdsButton;
        this.designSystemReviewContainer = view;
        this.designSystemReviewTopPosition = rdsButton2;
        this.numpad = rdsNumpadView;
        this.optionsProfitLossChart = optionsProfitLossChartView;
        this.optionsProfitLossChartBtn = rdsButton3;
        this.optionsProfitLossChartContainer = group;
        this.optionsProfitLossChartCurtain = view2;
        this.optionsProfitLossChartLearnMore = rdsButton4;
        this.optionsProfitLossInfoBar = optionsProfitLossInfoBar;
        this.reviewBtn = rdsButton5;
        this.reviewBtnHolder = constraintLayout4;
        this.sduiAlertView = composeView;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionOrderWithPlChartBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionOrderWithPlChartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29757R.layout.fragment_option_order_with_pl_chart, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionOrderWithPlChartBinding bind(View view) {
        int i = C29757R.id.account_switcher_btn;
        TradeAccountSwitcherView tradeAccountSwitcherView = (TradeAccountSwitcherView) ViewBindings.findChildViewById(view, i);
        if (tradeAccountSwitcherView != null) {
            i = C29757R.id.cardview;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C29757R.id.content;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C29757R.id.content_scrollview;
                    BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (blockableNestedScrollView != null) {
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, C29757R.id.design_system_review_bottom_position);
                        i = C29757R.id.design_system_review_container;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
                        if (viewFindChildViewById != null) {
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, C29757R.id.design_system_review_top_position);
                            i = C29757R.id.numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                OptionsProfitLossChartView optionsProfitLossChartView = (OptionsProfitLossChartView) ViewBindings.findChildViewById(view, C29757R.id.options_profit_loss_chart);
                                RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, C29757R.id.options_profit_loss_chart_btn);
                                Group group = (Group) ViewBindings.findChildViewById(view, C29757R.id.options_profit_loss_chart_container);
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, C29757R.id.options_profit_loss_chart_curtain);
                                RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, C29757R.id.options_profit_loss_chart_learn_more);
                                OptionsProfitLossInfoBar optionsProfitLossInfoBar = (OptionsProfitLossInfoBar) ViewBindings.findChildViewById(view, C29757R.id.options_profit_loss_info_bar);
                                i = C29757R.id.review_btn;
                                RdsButton rdsButton5 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton5 != null) {
                                    i = C29757R.id.review_btn_holder;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = C29757R.id.sdui_alert_view;
                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView != null) {
                                            i = C29757R.id.snackbar_shim;
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                            if (coordinatorLayout != null) {
                                                i = C29757R.id.swipe_hint;
                                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView != null) {
                                                    return new FragmentOptionOrderWithPlChartBinding(constraintLayout, tradeAccountSwitcherView, cardView, constraintLayout, constraintLayout2, blockableNestedScrollView, rdsButton, viewFindChildViewById, rdsButton2, rdsNumpadView, optionsProfitLossChartView, rdsButton3, group, viewFindChildViewById2, rdsButton4, optionsProfitLossInfoBar, rdsButton5, constraintLayout3, composeView, coordinatorLayout, rhTextView);
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
