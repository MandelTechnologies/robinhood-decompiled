package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.p377ui.timeline.EducationTimelineRowView;

/* loaded from: classes6.dex */
public final class IncludeEducationTimelineRowViewBinding implements ViewBinding {
    private final EducationTimelineRowView rootView;

    private IncludeEducationTimelineRowViewBinding(EducationTimelineRowView educationTimelineRowView) {
        this.rootView = educationTimelineRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EducationTimelineRowView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationTimelineRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationTimelineRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.include_education_timeline_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationTimelineRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationTimelineRowViewBinding((EducationTimelineRowView) view);
    }
}
