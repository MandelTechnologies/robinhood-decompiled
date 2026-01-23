package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentSurveyCompleteBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton surveyCompleteBtn;
    public final RdsPogView surveyCompletePog;
    public final RhTextView surveyCompleteTitleTxt;

    private FragmentSurveyCompleteBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsPogView rdsPogView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.surveyCompleteBtn = rdsButton;
        this.surveyCompletePog = rdsPogView;
        this.surveyCompleteTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSurveyCompleteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSurveyCompleteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_survey_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSurveyCompleteBinding bind(View view) {
        int i = C39996R.id.survey_complete_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39996R.id.survey_complete_pog;
            RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
            if (rdsPogView != null) {
                i = C39996R.id.survey_complete_title_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentSurveyCompleteBinding((ConstraintLayout) view, rdsButton, rdsPogView, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
