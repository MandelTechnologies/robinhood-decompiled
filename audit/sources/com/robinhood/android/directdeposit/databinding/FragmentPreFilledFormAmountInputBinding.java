package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.tickerinputview.TickerInputView;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormAmountInputBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RhTextView inputTxt;
    public final TickerInputView inputView;
    public final RdsNumpadView numpad;
    private final LinearLayout rootView;

    private FragmentPreFilledFormAmountInputBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, TickerInputView tickerInputView, RdsNumpadView rdsNumpadView) {
        this.rootView = linearLayout;
        this.continueBtn = rdsButton;
        this.inputTxt = rhTextView;
        this.inputView = tickerInputView;
        this.numpad = rdsNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormAmountInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormAmountInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_amount_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormAmountInputBinding bind(View view) {
        int i = C14044R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14044R.id.input_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.input_view;
                TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
                if (tickerInputView != null) {
                    i = C14044R.id.numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        return new FragmentPreFilledFormAmountInputBinding((LinearLayout) view, rdsButton, rhTextView, tickerInputView, rdsNumpadView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
