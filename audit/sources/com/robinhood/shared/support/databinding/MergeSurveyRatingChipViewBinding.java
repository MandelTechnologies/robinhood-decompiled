package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class MergeSurveyRatingChipViewBinding implements ViewBinding {
    private final View rootView;
    public final RdsProgressBar surveyRatingChipViewProgressBar;
    public final RhTextView surveyRatingChipViewValueTxt;

    private MergeSurveyRatingChipViewBinding(View view, RdsProgressBar rdsProgressBar, RhTextView rhTextView) {
        this.rootView = view;
        this.surveyRatingChipViewProgressBar = rdsProgressBar;
        this.surveyRatingChipViewValueTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSurveyRatingChipViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C39996R.layout.merge_survey_rating_chip_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSurveyRatingChipViewBinding bind(View view) {
        int i = C39996R.id.survey_rating_chip_view_progress_bar;
        RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
        if (rdsProgressBar != null) {
            i = C39996R.id.survey_rating_chip_view_value_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeSurveyRatingChipViewBinding(view, rdsProgressBar, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
