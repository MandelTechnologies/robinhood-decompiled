package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes9.dex */
public final class FragmentOptionOrderBinding implements ViewBinding {
    public final TradeAccountSwitcherView accountSwitcherBtn;
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final BlockableNestedScrollView contentScrollview;
    public final ConstraintLayout designSystemReviewContainer;
    public final View includeRdsDivider;
    public final RdsNumpadView numpad;
    public final RdsTooltipView optionOrderMarketTooltip;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final ComposeView sduiAlertView;
    public final CoordinatorLayout snackbarShim;
    public final RhTextView swipeHint;

    private FragmentOptionOrderBinding(ConstraintLayout constraintLayout, TradeAccountSwitcherView tradeAccountSwitcherView, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, BlockableNestedScrollView blockableNestedScrollView, ConstraintLayout constraintLayout4, View view, RdsNumpadView rdsNumpadView, RdsTooltipView rdsTooltipView, RdsButton rdsButton, ComposeView composeView, CoordinatorLayout coordinatorLayout, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.accountSwitcherBtn = tradeAccountSwitcherView;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.contentScrollview = blockableNestedScrollView;
        this.designSystemReviewContainer = constraintLayout4;
        this.includeRdsDivider = view;
        this.numpad = rdsNumpadView;
        this.optionOrderMarketTooltip = rdsTooltipView;
        this.reviewBtn = rdsButton;
        this.sduiAlertView = composeView;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29757R.layout.fragment_option_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionOrderBinding bind(View view) {
        View viewFindChildViewById;
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
                        i = C29757R.id.design_system_review_container;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29757R.id.include_rds_divider))) != null) {
                            i = C29757R.id.numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                i = C29757R.id.option_order_market_tooltip;
                                RdsTooltipView rdsTooltipView = (RdsTooltipView) ViewBindings.findChildViewById(view, i);
                                if (rdsTooltipView != null) {
                                    i = C29757R.id.review_btn;
                                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton != null) {
                                        i = C29757R.id.sdui_alert_view;
                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView != null) {
                                            i = C29757R.id.snackbar_shim;
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                            if (coordinatorLayout != null) {
                                                i = C29757R.id.swipe_hint;
                                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView != null) {
                                                    return new FragmentOptionOrderBinding(constraintLayout, tradeAccountSwitcherView, cardView, constraintLayout, constraintLayout2, blockableNestedScrollView, constraintLayout3, viewFindChildViewById, rdsNumpadView, rdsTooltipView, rdsButton, composeView, coordinatorLayout, rhTextView);
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
