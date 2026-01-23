package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackInfoCard;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonCardStackInfoBinding implements ViewBinding {
    private final EducationLessonCardStackInfoCard rootView;

    private IncludeEducationLessonCardStackInfoBinding(EducationLessonCardStackInfoCard educationLessonCardStackInfoCard) {
        this.rootView = educationLessonCardStackInfoCard;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationLessonCardStackInfoCard getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonCardStackInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonCardStackInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_card_stack_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonCardStackInfoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonCardStackInfoBinding((EducationLessonCardStackInfoCard) view);
    }
}
