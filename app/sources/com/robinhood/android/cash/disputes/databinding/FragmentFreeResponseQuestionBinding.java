package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentFreeResponseQuestionBinding implements ViewBinding {
    public final RdsButton freeResponseQuestionContinueButton;
    public final RdsTextInputEditText freeResponseQuestionInput;
    public final RdsTextInputContainerView freeResponseQuestionInputContainer;
    public final RhTextView freeResponseQuestionSubtitle;
    public final RhTextView freeResponseQuestionTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentFreeResponseQuestionBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.freeResponseQuestionContinueButton = rdsButton;
        this.freeResponseQuestionInput = rdsTextInputEditText;
        this.freeResponseQuestionInputContainer = rdsTextInputContainerView;
        this.freeResponseQuestionSubtitle = rhTextView;
        this.freeResponseQuestionTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentFreeResponseQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFreeResponseQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_free_response_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentFreeResponseQuestionBinding bind(View view) {
        int i = C10007R.id.free_response_question_continue_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.free_response_question_input;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                i = C10007R.id.free_response_question_input_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C10007R.id.free_response_question_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C10007R.id.free_response_question_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentFreeResponseQuestionBinding((FocusSafeNestedScrollView) view, rdsButton, rdsTextInputEditText, rdsTextInputContainerView, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
