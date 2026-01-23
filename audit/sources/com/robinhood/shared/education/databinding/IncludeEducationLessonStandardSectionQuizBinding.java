package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardQuizView;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonStandardSectionQuizBinding implements ViewBinding {
    private final EducationLessonStandardQuizView rootView;

    private IncludeEducationLessonStandardSectionQuizBinding(EducationLessonStandardQuizView educationLessonStandardQuizView) {
        this.rootView = educationLessonStandardQuizView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationLessonStandardQuizView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonStandardSectionQuizBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonStandardSectionQuizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_standard_section_quiz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonStandardSectionQuizBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonStandardSectionQuizBinding((EducationLessonStandardQuizView) view);
    }
}
