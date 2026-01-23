package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.tickerinputview.TickerInputView;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowAmountBinding implements ViewBinding {
    public final RhTextView amountInputErrorTxt;
    public final TickerInputView amountInputView;
    public final RhTextView buyingPowerText;
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final RdsButton continueBtn;
    public final RdsNumpadView numpad;
    private final ConstraintLayout rootView;

    private FragmentInvestFlowAmountBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, TickerInputView tickerInputView, RhTextView rhTextView2, CardView cardView, ConstraintLayout constraintLayout2, RdsButton rdsButton, RdsNumpadView rdsNumpadView) {
        this.rootView = constraintLayout;
        this.amountInputErrorTxt = rhTextView;
        this.amountInputView = tickerInputView;
        this.buyingPowerText = rhTextView2;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.continueBtn = rdsButton;
        this.numpad = rdsNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowAmountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowAmountBinding bind(View view) {
        int i = C19349R.id.amount_input_error_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C19349R.id.amount_input_view;
            TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
            if (tickerInputView != null) {
                i = C19349R.id.buying_power_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C19349R.id.cardview;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C19349R.id.continue_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C19349R.id.numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                return new FragmentInvestFlowAmountBinding(constraintLayout, rhTextView, tickerInputView, rhTextView2, cardView, constraintLayout, rdsButton, rdsNumpadView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
