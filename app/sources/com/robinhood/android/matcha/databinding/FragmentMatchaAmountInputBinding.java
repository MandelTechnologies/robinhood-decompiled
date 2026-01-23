package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.tickerinputview.TickerInputView;

/* loaded from: classes8.dex */
public final class FragmentMatchaAmountInputBinding implements ViewBinding {
    public final ComposeView avatarComposeView;
    public final RdsButton continueButton;
    public final RhTextView inputErrorText;
    public final RhTextView inputSubtitleText;
    public final RhTextView inputTotalAmount;
    public final TickerInputView inputView;
    public final RdsNumpadView numpad;
    private final ConstraintLayout rootView;

    private FragmentMatchaAmountInputBinding(ConstraintLayout constraintLayout, ComposeView composeView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, TickerInputView tickerInputView, RdsNumpadView rdsNumpadView) {
        this.rootView = constraintLayout;
        this.avatarComposeView = composeView;
        this.continueButton = rdsButton;
        this.inputErrorText = rhTextView;
        this.inputSubtitleText = rhTextView2;
        this.inputTotalAmount = rhTextView3;
        this.inputView = tickerInputView;
        this.numpad = rdsNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchaAmountInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchaAmountInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.fragment_matcha_amount_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMatchaAmountInputBinding bind(View view) {
        int i = C21284R.id.avatar_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C21284R.id.continue_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C21284R.id.input_error_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C21284R.id.input_subtitle_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C21284R.id.input_total_amount;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C21284R.id.input_view;
                            TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
                            if (tickerInputView != null) {
                                i = C21284R.id.numpad;
                                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                if (rdsNumpadView != null) {
                                    return new FragmentMatchaAmountInputBinding((ConstraintLayout) view, composeView, rdsButton, rhTextView, rhTextView2, rhTextView3, tickerInputView, rdsNumpadView);
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
