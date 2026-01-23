package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.equitydetail.performance.PerformanceView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class MergeLearnMoreRowViewBinding implements ViewBinding {
    public final LinearLayout expandedContentContainer;
    public final RhTextView expandedContentDescription;
    public final RhTextView expandedContentText;
    public final PerformanceView performanceTable;
    private final LinearLayout rootView;
    public final RdsRowView row;

    private MergeLearnMoreRowViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RhTextView rhTextView, RhTextView rhTextView2, PerformanceView performanceView, RdsRowView rdsRowView) {
        this.rootView = linearLayout;
        this.expandedContentContainer = linearLayout2;
        this.expandedContentDescription = rhTextView;
        this.expandedContentText = rhTextView2;
        this.performanceTable = performanceView;
        this.row = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MergeLearnMoreRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeLearnMoreRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.merge_learn_more_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeLearnMoreRowViewBinding bind(View view) {
        int i = C25978R.id.expanded_content_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C25978R.id.expanded_content_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25978R.id.expanded_content_text;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C25978R.id.performance_table;
                    PerformanceView performanceView = (PerformanceView) ViewBindings.findChildViewById(view, i);
                    if (performanceView != null) {
                        i = C25978R.id.row;
                        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsRowView != null) {
                            return new MergeLearnMoreRowViewBinding((LinearLayout) view, linearLayout, rhTextView, rhTextView2, performanceView, rdsRowView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
