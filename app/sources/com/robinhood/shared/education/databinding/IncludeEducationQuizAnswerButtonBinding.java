package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.quiz.EducationQuizAnswerButton;

/* loaded from: classes6.dex */
public final class IncludeEducationQuizAnswerButtonBinding implements ViewBinding {
    private final EducationQuizAnswerButton rootView;

    private IncludeEducationQuizAnswerButtonBinding(EducationQuizAnswerButton educationQuizAnswerButton) {
        this.rootView = educationQuizAnswerButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationQuizAnswerButton getRoot() {
        return this.rootView;
    }

    public static IncludeEducationQuizAnswerButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationQuizAnswerButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_quiz_answer_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationQuizAnswerButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationQuizAnswerButtonBinding((EducationQuizAnswerButton) view);
    }
}
