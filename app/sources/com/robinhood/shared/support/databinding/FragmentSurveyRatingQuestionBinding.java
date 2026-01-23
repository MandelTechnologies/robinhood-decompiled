package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentSurveyRatingQuestionBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RhTextView surveyRatingHighDescriptionTxt;
    public final RhTextView surveyRatingLowDescriptionTxt;
    public final RdsPogView surveyRatingPog;
    public final RdsProgressBar surveyRatingProgressBar;
    public final RecyclerView surveyRatingRecyclerView;
    public final RhTextView surveyRatingTitleTxt;

    private FragmentSurveyRatingQuestionBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsPogView rdsPogView, RdsProgressBar rdsProgressBar, RecyclerView recyclerView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.surveyRatingHighDescriptionTxt = rhTextView;
        this.surveyRatingLowDescriptionTxt = rhTextView2;
        this.surveyRatingPog = rdsPogView;
        this.surveyRatingProgressBar = rdsProgressBar;
        this.surveyRatingRecyclerView = recyclerView;
        this.surveyRatingTitleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSurveyRatingQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSurveyRatingQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_survey_rating_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSurveyRatingQuestionBinding bind(View view) {
        int i = C39996R.id.survey_rating_high_description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C39996R.id.survey_rating_low_description_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C39996R.id.survey_rating_pog;
                RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
                if (rdsPogView != null) {
                    i = C39996R.id.survey_rating_progress_bar;
                    RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                    if (rdsProgressBar != null) {
                        i = C39996R.id.survey_rating_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = C39996R.id.survey_rating_title_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentSurveyRatingQuestionBinding((ConstraintLayout) view, rhTextView, rhTextView2, rdsPogView, rdsProgressBar, recyclerView, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
