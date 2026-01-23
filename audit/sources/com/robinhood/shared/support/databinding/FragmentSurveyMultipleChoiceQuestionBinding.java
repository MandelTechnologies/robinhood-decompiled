package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentSurveyMultipleChoiceQuestionBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton surveyMultiChoiceContinueBtn;
    public final Flow surveyMultiChoiceFlow;
    public final RdsPogView surveyMultiChoicePog;
    public final RdsProgressBar surveyMultiChoiceProgressBar;
    public final RhTextView surveyMultiChoiceSubtitleTxt;
    public final RhTextView surveyMultiChoiceTitleTxt;

    private FragmentSurveyMultipleChoiceQuestionBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, Flow flow, RdsPogView rdsPogView, RdsProgressBar rdsProgressBar, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.surveyMultiChoiceContinueBtn = rdsButton;
        this.surveyMultiChoiceFlow = flow;
        this.surveyMultiChoicePog = rdsPogView;
        this.surveyMultiChoiceProgressBar = rdsProgressBar;
        this.surveyMultiChoiceSubtitleTxt = rhTextView;
        this.surveyMultiChoiceTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSurveyMultipleChoiceQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSurveyMultipleChoiceQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_survey_multiple_choice_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSurveyMultipleChoiceQuestionBinding bind(View view) {
        int i = C39996R.id.survey_multi_choice_continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39996R.id.survey_multi_choice_flow;
            Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
            if (flow != null) {
                i = C39996R.id.survey_multi_choice_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C39996R.id.survey_multi_choice_progress_bar;
                    RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                    if (rdsProgressBar != null) {
                        i = C39996R.id.survey_multi_choice_subtitle_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C39996R.id.survey_multi_choice_title_txt;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentSurveyMultipleChoiceQuestionBinding((ConstraintLayout) view, rdsButton, flow, rdsPogView, rdsProgressBar, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
