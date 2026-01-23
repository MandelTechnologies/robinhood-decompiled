package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class IncludeSurveyMultipleChoiceChipBinding implements ViewBinding {
    private final RdsChip rootView;

    private IncludeSurveyMultipleChoiceChipBinding(RdsChip rdsChip) {
        this.rootView = rdsChip;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsChip getRoot() {
        return this.rootView;
    }

    public static IncludeSurveyMultipleChoiceChipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSurveyMultipleChoiceChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.include_survey_multiple_choice_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSurveyMultipleChoiceChipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSurveyMultipleChoiceChipBinding((RdsChip) view);
    }
}
