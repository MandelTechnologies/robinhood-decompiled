package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;

/* loaded from: classes7.dex */
public final class FragmentDecimalAmountQuestionBinding implements ViewBinding {
    public final RhMoneyInputView decimalQuestionAmountInput;
    public final RdsButton decimalQuestionContinueButton;
    public final RdsTextInputContainerView decimalQuestionInputContainer;
    public final RdsNumpadView decimalQuestionNumpad;
    public final RhTextView decimalQuestionSubtitle;
    public final RhTextView decimalQuestionTitle;
    private final ConstraintLayout rootView;

    private FragmentDecimalAmountQuestionBinding(ConstraintLayout constraintLayout, RhMoneyInputView rhMoneyInputView, RdsButton rdsButton, RdsTextInputContainerView rdsTextInputContainerView, RdsNumpadView rdsNumpadView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.decimalQuestionAmountInput = rhMoneyInputView;
        this.decimalQuestionContinueButton = rdsButton;
        this.decimalQuestionInputContainer = rdsTextInputContainerView;
        this.decimalQuestionNumpad = rdsNumpadView;
        this.decimalQuestionSubtitle = rhTextView;
        this.decimalQuestionTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDecimalAmountQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDecimalAmountQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_decimal_amount_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDecimalAmountQuestionBinding bind(View view) {
        int i = C10007R.id.decimal_question_amount_input;
        RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
        if (rhMoneyInputView != null) {
            i = C10007R.id.decimal_question_continue_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10007R.id.decimal_question_input_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C10007R.id.decimal_question_numpad;
                    RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadView != null) {
                        i = C10007R.id.decimal_question_subtitle;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C10007R.id.decimal_question_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentDecimalAmountQuestionBinding((ConstraintLayout) view, rhMoneyInputView, rdsButton, rdsTextInputContainerView, rdsNumpadView, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
