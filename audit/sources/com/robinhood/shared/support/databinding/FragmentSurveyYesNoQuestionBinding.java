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
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentSurveyYesNoQuestionBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton surveyYesNoDismissBtn;
    public final RdsButton surveyYesNoNoBtn;
    public final RdsPogView surveyYesNoPog;
    public final RdsProgressBar surveyYesNoProgressBar;
    public final RhTextView surveyYesNoTitleTxt;
    public final RdsButton surveyYesNoYesBtn;

    private FragmentSurveyYesNoQuestionBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsButton rdsButton2, RdsPogView rdsPogView, RdsProgressBar rdsProgressBar, RhTextView rhTextView, RdsButton rdsButton3) {
        this.rootView = constraintLayout;
        this.surveyYesNoDismissBtn = rdsButton;
        this.surveyYesNoNoBtn = rdsButton2;
        this.surveyYesNoPog = rdsPogView;
        this.surveyYesNoProgressBar = rdsProgressBar;
        this.surveyYesNoTitleTxt = rhTextView;
        this.surveyYesNoYesBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSurveyYesNoQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSurveyYesNoQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_survey_yes_no_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSurveyYesNoQuestionBinding bind(View view) {
        int i = C39996R.id.survey_yes_no_dismiss_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39996R.id.survey_yes_no_no_btn;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C39996R.id.survey_yes_no_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C39996R.id.survey_yes_no_progress_bar;
                    RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                    if (rdsProgressBar != null) {
                        i = C39996R.id.survey_yes_no_title_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C39996R.id.survey_yes_no_yes_btn;
                            RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton3 != null) {
                                return new FragmentSurveyYesNoQuestionBinding((ConstraintLayout) view, rdsButton, rdsButton2, rdsPogView, rdsProgressBar, rhTextView, rdsButton3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
