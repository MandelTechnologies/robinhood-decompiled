package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class MergeEquityDollarOrderBinding implements ViewBinding {
    public final TradeAccountSwitcherView accountSwitcherBtn;
    public final RhTextView backupWithholdingWarningTxt;
    public final RhTextView dollarInputErrorTxt;
    public final TickerInputView dollarInputView;
    public final RhTextView orderAccountLabelTxt;
    public final Barrier orderAvailableBottomBarrier;
    public final Barrier orderAvailableTopBarrier;
    public final RhTextView orderAvailableTxt;
    public final RhTextView orderCreditTxt;
    public final LinearLayout orderDetailsTxt;
    public final RhTextView orderReviewLabelTxt;
    public final RhTextView orderReviewTxt;
    private final View rootView;
    public final RhTextView sellAllTextBtn;

    private MergeEquityDollarOrderBinding(View view, TradeAccountSwitcherView tradeAccountSwitcherView, RhTextView rhTextView, RhTextView rhTextView2, TickerInputView tickerInputView, RhTextView rhTextView3, Barrier barrier, Barrier barrier2, RhTextView rhTextView4, RhTextView rhTextView5, LinearLayout linearLayout, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8) {
        this.rootView = view;
        this.accountSwitcherBtn = tradeAccountSwitcherView;
        this.backupWithholdingWarningTxt = rhTextView;
        this.dollarInputErrorTxt = rhTextView2;
        this.dollarInputView = tickerInputView;
        this.orderAccountLabelTxt = rhTextView3;
        this.orderAvailableBottomBarrier = barrier;
        this.orderAvailableTopBarrier = barrier2;
        this.orderAvailableTxt = rhTextView4;
        this.orderCreditTxt = rhTextView5;
        this.orderDetailsTxt = linearLayout;
        this.orderReviewLabelTxt = rhTextView6;
        this.orderReviewTxt = rhTextView7;
        this.sellAllTextBtn = rhTextView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEquityDollarOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29365R.layout.merge_equity_dollar_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEquityDollarOrderBinding bind(View view) {
        int i = C29365R.id.account_switcher_btn;
        TradeAccountSwitcherView tradeAccountSwitcherView = (TradeAccountSwitcherView) ViewBindings.findChildViewById(view, i);
        if (tradeAccountSwitcherView != null) {
            i = C29365R.id.backup_withholding_warning_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29365R.id.dollar_input_error_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C29365R.id.dollar_input_view;
                    TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
                    if (tickerInputView != null) {
                        i = C29365R.id.order_account_label_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C29365R.id.order_available_bottom_barrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                            if (barrier != null) {
                                i = C29365R.id.order_available_top_barrier;
                                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                if (barrier2 != null) {
                                    i = C29365R.id.order_available_txt;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C29365R.id.order_credit_txt;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            i = C29365R.id.order_details_txt;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C29365R.id.order_review_label_txt;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    i = C29365R.id.order_review_txt;
                                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView7 != null) {
                                                        i = C29365R.id.sell_all_text_btn;
                                                        RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView8 != null) {
                                                            return new MergeEquityDollarOrderBinding(view, tradeAccountSwitcherView, rhTextView, rhTextView2, tickerInputView, rhTextView3, barrier, barrier2, rhTextView4, rhTextView5, linearLayout, rhTextView6, rhTextView7, rhTextView8);
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
