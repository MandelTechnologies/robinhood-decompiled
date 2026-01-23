package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardTimelineView;

/* loaded from: classes6.dex */
public final class IncludeEducationLessonStandardSectionTimelineBinding implements ViewBinding {
    private final EducationLessonStandardTimelineView rootView;

    private IncludeEducationLessonStandardSectionTimelineBinding(EducationLessonStandardTimelineView educationLessonStandardTimelineView) {
        this.rootView = educationLessonStandardTimelineView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationLessonStandardTimelineView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationLessonStandardSectionTimelineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationLessonStandardSectionTimelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_lesson_standard_section_timeline, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationLessonStandardSectionTimelineBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationLessonStandardSectionTimelineBinding((EducationLessonStandardTimelineView) view);
    }
}
