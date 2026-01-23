package com.robinhood.android.serverclientcomponents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.serverclientcomponents.C28308R;

/* loaded from: classes5.dex */
public final class MergeClientComponentTimelineRowViewBinding implements ViewBinding {
    private final View rootView;
    public final RdsTimelineRowView row;

    private MergeClientComponentTimelineRowViewBinding(View view, RdsTimelineRowView rdsTimelineRowView) {
        this.rootView = view;
        this.row = rdsTimelineRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeClientComponentTimelineRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28308R.layout.merge_client_component_timeline_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeClientComponentTimelineRowViewBinding bind(View view) {
        int i = C28308R.id.row;
        RdsTimelineRowView rdsTimelineRowView = (RdsTimelineRowView) ViewBindings.findChildViewById(view, i);
        if (rdsTimelineRowView != null) {
            return new MergeClientComponentTimelineRowViewBinding(view, rdsTimelineRowView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
