package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackQuizCard;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonCardStackQuizBinding implements ViewBinding {
    private final EducationLessonCardStackQuizCard rootView;

    private IncludeEducationLessonCardStackQuizBinding(EducationLessonCardStackQuizCard educationLessonCardStackQuizCard) {
        this.rootView = educationLessonCardStackQuizCard;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationLessonCardStackQuizCard getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonCardStackQuizBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonCardStackQuizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_card_stack_quiz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonCardStackQuizBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonCardStackQuizBinding((EducationLessonCardStackQuizCard) view);
    }
}
