package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.quiz.EducationQuizView;

/* loaded from: classes6.dex */
public final class MergeEducationLessonStandardSectionQuizViewBinding implements ViewBinding {
    public final EducationQuizView quizView;
    private final View rootView;

    private MergeEducationLessonStandardSectionQuizViewBinding(View view, EducationQuizView educationQuizView) {
        this.rootView = view;
        this.quizView = educationQuizView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonStandardSectionQuizViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_standard_section_quiz_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonStandardSectionQuizViewBinding bind(View view) {
        int i = C38790R.id.quiz_view;
        EducationQuizView educationQuizView = (EducationQuizView) ViewBindings.findChildViewById(view, i);
        if (educationQuizView != null) {
            return new MergeEducationLessonStandardSectionQuizViewBinding(view, educationQuizView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
