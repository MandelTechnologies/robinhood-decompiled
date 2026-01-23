package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.DateSelectionView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentDateQuestionBinding implements ViewBinding {
    public final RdsButton dateQuestionContinueButton;
    public final DateSelectionView dateQuestionDateSelection;
    public final RdsTextInputEditText dateQuestionInput;
    public final RdsTextInputContainerView dateQuestionInputContainer;
    public final RhTextView dateQuestionSubtitle;
    public final RhTextView dateQuestionTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentDateQuestionBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton, DateSelectionView dateSelectionView, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.dateQuestionContinueButton = rdsButton;
        this.dateQuestionDateSelection = dateSelectionView;
        this.dateQuestionInput = rdsTextInputEditText;
        this.dateQuestionInputContainer = rdsTextInputContainerView;
        this.dateQuestionSubtitle = rhTextView;
        this.dateQuestionTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentDateQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDateQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_date_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDateQuestionBinding bind(View view) {
        int i = C10007R.id.date_question_continue_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.date_question_date_selection;
            DateSelectionView dateSelectionView = (DateSelectionView) ViewBindings.findChildViewById(view, i);
            if (dateSelectionView != null) {
                i = C10007R.id.date_question_input;
                RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputEditText != null) {
                    i = C10007R.id.date_question_input_container;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C10007R.id.date_question_subtitle;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C10007R.id.date_question_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentDateQuestionBinding((FocusSafeNestedScrollView) view, rdsButton, dateSelectionView, rdsTextInputEditText, rdsTextInputContainerView, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
