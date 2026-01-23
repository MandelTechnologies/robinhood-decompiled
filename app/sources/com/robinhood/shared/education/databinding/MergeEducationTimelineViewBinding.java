package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class MergeEducationTimelineViewBinding implements ViewBinding {
    public final RdsInlineDefinitionTextView contentTxt;
    public final RhTextView headerTxt;
    private final View rootView;
    public final RecyclerView timelineRecyclerView;
    public final RhTextView titleTxt;

    private MergeEducationTimelineViewBinding(View view, RdsInlineDefinitionTextView rdsInlineDefinitionTextView, RhTextView rhTextView, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = view;
        this.contentTxt = rdsInlineDefinitionTextView;
        this.headerTxt = rhTextView;
        this.timelineRecyclerView = recyclerView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEducationTimelineViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C38790R.layout.merge_education_timeline_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEducationTimelineViewBinding bind(View view) {
        int i = C38790R.id.content_txt;
        RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) ViewBindings.findChildViewById(view, i);
        if (rdsInlineDefinitionTextView != null) {
            i = C38790R.id.header_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C38790R.id.timeline_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C38790R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new MergeEducationTimelineViewBinding(view, rdsInlineDefinitionTextView, rhTextView, recyclerView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
