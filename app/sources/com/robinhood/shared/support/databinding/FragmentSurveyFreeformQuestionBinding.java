package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentSurveyFreeformQuestionBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton surveyFreeformContinueBtn;
    public final RdsTextInputEditText surveyFreeformEditTxt;
    public final RdsTextInputContainerView surveyFreeformEditTxtContainer;
    public final RdsPogView surveyFreeformPog;
    public final RdsProgressBar surveyFreeformProgressBar;
    public final RhTextView surveyFreeformTitleTxt;

    private FragmentSurveyFreeformQuestionBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsPogView rdsPogView, RdsProgressBar rdsProgressBar, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.surveyFreeformContinueBtn = rdsButton;
        this.surveyFreeformEditTxt = rdsTextInputEditText;
        this.surveyFreeformEditTxtContainer = rdsTextInputContainerView;
        this.surveyFreeformPog = rdsPogView;
        this.surveyFreeformProgressBar = rdsProgressBar;
        this.surveyFreeformTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSurveyFreeformQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSurveyFreeformQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_survey_freeform_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSurveyFreeformQuestionBinding bind(View view) {
        int i = C39996R.id.survey_freeform_continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39996R.id.survey_freeform_edit_txt;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                i = C39996R.id.survey_freeform_edit_txt_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C39996R.id.survey_freeform_pog;
                    RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                    if (rdsPogView != null) {
                        i = C39996R.id.survey_freeform_progress_bar;
                        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                        if (rdsProgressBar != null) {
                            i = C39996R.id.survey_freeform_title_txt;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                return new FragmentSurveyFreeformQuestionBinding((ConstraintLayout) view, rdsButton, rdsTextInputEditText, rdsTextInputContainerView, rdsPogView, rdsProgressBar, rhTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
