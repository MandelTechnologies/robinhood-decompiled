package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardInfoView;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonStandardSectionInfoBinding implements ViewBinding {
    private final EducationLessonStandardInfoView rootView;

    private IncludeEducationLessonStandardSectionInfoBinding(EducationLessonStandardInfoView educationLessonStandardInfoView) {
        this.rootView = educationLessonStandardInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationLessonStandardInfoView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonStandardSectionInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonStandardSectionInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_standard_section_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonStandardSectionInfoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonStandardSectionInfoBinding((EducationLessonStandardInfoView) view);
    }
}
