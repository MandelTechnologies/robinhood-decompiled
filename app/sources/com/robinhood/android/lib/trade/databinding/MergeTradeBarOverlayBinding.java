package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.UniformWidthVerticalLayout;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes8.dex */
public final class MergeTradeBarOverlayBinding implements ViewBinding {
    public final TradeAccountSwitcherView accountSwitcherBtn;
    public final Guideline accountSwitcherGuideline;
    public final ConstraintLayout accountSwitcherRow;
    public final ClientComponentButtonView actionBtn;
    public final UniformWidthVerticalLayout buttonLayout;
    public final RdsButton closeBtn;
    public final RhTextView errorTxt;
    public final Guideline guideline;
    public final FrameLayout hintContainer;
    public final RhTextView labelTxt;
    public final LinearLayout linkRow;
    public final RhTextView linkTxt;
    private final View rootView;
    public final Barrier statBottomBarrier;
    public final RhTextView statDescriptionTxt;
    public final LinearLayout statLinkRow;
    public final RhTextView statLinkTxt;
    public final LinearLayout statRow;
    public final Barrier statTopBarrier;
    public final Barrier tradeAndErrorBarrier;
    public final RdsButton tradeBtn;
    public final View tradeBtnsBackground;
    public final View tradesTxtShadow;
    public final RhTextView valueTxt;

    private MergeTradeBarOverlayBinding(View view, TradeAccountSwitcherView tradeAccountSwitcherView, Guideline guideline, ConstraintLayout constraintLayout, ClientComponentButtonView clientComponentButtonView, UniformWidthVerticalLayout uniformWidthVerticalLayout, RdsButton rdsButton, RhTextView rhTextView, Guideline guideline2, FrameLayout frameLayout, RhTextView rhTextView2, LinearLayout linearLayout, RhTextView rhTextView3, Barrier barrier, RhTextView rhTextView4, LinearLayout linearLayout2, RhTextView rhTextView5, LinearLayout linearLayout3, Barrier barrier2, Barrier barrier3, RdsButton rdsButton2, View view2, View view3, RhTextView rhTextView6) {
        this.rootView = view;
        this.accountSwitcherBtn = tradeAccountSwitcherView;
        this.accountSwitcherGuideline = guideline;
        this.accountSwitcherRow = constraintLayout;
        this.actionBtn = clientComponentButtonView;
        this.buttonLayout = uniformWidthVerticalLayout;
        this.closeBtn = rdsButton;
        this.errorTxt = rhTextView;
        this.guideline = guideline2;
        this.hintContainer = frameLayout;
        this.labelTxt = rhTextView2;
        this.linkRow = linearLayout;
        this.linkTxt = rhTextView3;
        this.statBottomBarrier = barrier;
        this.statDescriptionTxt = rhTextView4;
        this.statLinkRow = linearLayout2;
        this.statLinkTxt = rhTextView5;
        this.statRow = linearLayout3;
        this.statTopBarrier = barrier2;
        this.tradeAndErrorBarrier = barrier3;
        this.tradeBtn = rdsButton2;
        this.tradeBtnsBackground = view2;
        this.tradesTxtShadow = view3;
        this.valueTxt = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTradeBarOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20649R.layout.merge_trade_bar_overlay, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTradeBarOverlayBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C20649R.id.account_switcher_btn;
        TradeAccountSwitcherView tradeAccountSwitcherView = (TradeAccountSwitcherView) ViewBindings.findChildViewById(view, i);
        if (tradeAccountSwitcherView != null) {
            i = C20649R.id.account_switcher_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = C20649R.id.account_switcher_row;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C20649R.id.action_btn;
                    ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
                    if (clientComponentButtonView != null) {
                        i = C20649R.id.button_layout;
                        UniformWidthVerticalLayout uniformWidthVerticalLayout = (UniformWidthVerticalLayout) ViewBindings.findChildViewById(view, i);
                        if (uniformWidthVerticalLayout != null) {
                            i = C20649R.id.close_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C20649R.id.error_txt;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C20649R.id.guideline;
                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline2 != null) {
                                        i = C20649R.id.hint_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = C20649R.id.label_txt;
                                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView2 != null) {
                                                i = C20649R.id.link_row;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = C20649R.id.link_txt;
                                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView3 != null) {
                                                        i = C20649R.id.stat_bottom_barrier;
                                                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                                        if (barrier != null) {
                                                            i = C20649R.id.stat_description_txt;
                                                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView4 != null) {
                                                                i = C20649R.id.stat_link_row;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout2 != null) {
                                                                    i = C20649R.id.stat_link_txt;
                                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (rhTextView5 != null) {
                                                                        i = C20649R.id.stat_row;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout3 != null) {
                                                                            i = C20649R.id.stat_top_barrier;
                                                                            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                            if (barrier2 != null) {
                                                                                i = C20649R.id.trade_and_error_barrier;
                                                                                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                                if (barrier3 != null) {
                                                                                    i = C20649R.id.trade_btn;
                                                                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                    if (rdsButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C20649R.id.trade_btns_background))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C20649R.id.trades_txt_shadow))) != null) {
                                                                                        i = C20649R.id.value_txt;
                                                                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (rhTextView6 != null) {
                                                                                            return new MergeTradeBarOverlayBinding(view, tradeAccountSwitcherView, guideline, constraintLayout, clientComponentButtonView, uniformWidthVerticalLayout, rdsButton, rhTextView, guideline2, frameLayout, rhTextView2, linearLayout, rhTextView3, barrier, rhTextView4, linearLayout2, rhTextView5, linearLayout3, barrier2, barrier3, rdsButton2, viewFindChildViewById, viewFindChildViewById2, rhTextView6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
