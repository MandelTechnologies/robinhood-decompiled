package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.timeline.EducationTimelineView;

/* loaded from: classes6.dex */
public final class MergeEducationLessonStandardSectionTimelineViewBinding implements ViewBinding {
    private final View rootView;
    public final EducationTimelineView timelineView;

    private MergeEducationLessonStandardSectionTimelineViewBinding(View view, EducationTimelineView educationTimelineView) {
        this.rootView = view;
        this.timelineView = educationTimelineView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationLessonStandardSectionTimelineViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_lesson_standard_section_timeline_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationLessonStandardSectionTimelineViewBinding bind(View view) {
        int i = C38790R.id.timeline_view;
        EducationTimelineView educationTimelineView = (EducationTimelineView) ViewBindings.findChildViewById(view, i);
        if (educationTimelineView != null) {
            return new MergeEducationLessonStandardSectionTimelineViewBinding(view, educationTimelineView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
