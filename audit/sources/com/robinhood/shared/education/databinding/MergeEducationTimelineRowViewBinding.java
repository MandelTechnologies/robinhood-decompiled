package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class MergeEducationTimelineRowViewBinding implements ViewBinding {
    public final RdsTimelineRowView educationTimelineRow;
    private final View rootView;

    private MergeEducationTimelineRowViewBinding(View view, RdsTimelineRowView rdsTimelineRowView) {
        this.rootView = view;
        this.educationTimelineRow = rdsTimelineRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationTimelineRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_timeline_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationTimelineRowViewBinding bind(View view) {
        int i = C38790R.id.education_timeline_row;
        RdsTimelineRowView rdsTimelineRowView = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
        if (rdsTimelineRowView != null) {
            return new MergeEducationTimelineRowViewBinding(view, rdsTimelineRowView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
