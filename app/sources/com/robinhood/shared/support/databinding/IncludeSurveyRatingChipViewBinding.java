package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.support.call.survey.SurveyRatingChipView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class IncludeSurveyRatingChipViewBinding implements ViewBinding {
    private final SurveyRatingChipView rootView;

    private IncludeSurveyRatingChipViewBinding(SurveyRatingChipView surveyRatingChipView) {
        this.rootView = surveyRatingChipView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SurveyRatingChipView getRoot() {
        return this.rootView;
    }

    public static IncludeSurveyRatingChipViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSurveyRatingChipViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.include_survey_rating_chip_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSurveyRatingChipViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSurveyRatingChipViewBinding((SurveyRatingChipView) view);
    }
}
