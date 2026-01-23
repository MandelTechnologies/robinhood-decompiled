package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes2.dex */
public final class FragmentVerifyDebitCardBinding implements ViewBinding {
    public final RdsButton continueButton;
    public final RdsTextInputEditText debitCardVerificationCodeInput;
    public final RdsNumpadView numpad;
    private final LinearLayout rootView;
    public final RhTextView verifyDebitCardSubtitle;
    public final RhTextView verifyDebitCardTitle;

    private FragmentVerifyDebitCardBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsTextInputEditText rdsTextInputEditText, RdsNumpadView rdsNumpadView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.continueButton = rdsButton;
        this.debitCardVerificationCodeInput = rdsTextInputEditText;
        this.numpad = rdsNumpadView;
        this.verifyDebitCardSubtitle = rhTextView;
        this.verifyDebitCardTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentVerifyDebitCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVerifyDebitCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_verify_debit_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVerifyDebitCardBinding bind(View view) {
        int i = C13894R.id.continue_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C13894R.id.debit_card_verification_code_input;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                i = C13894R.id.numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C13894R.id.verify_debit_card_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C13894R.id.verify_debit_card_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentVerifyDebitCardBinding((LinearLayout) view, rdsButton, rdsTextInputEditText, rdsNumpadView, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
