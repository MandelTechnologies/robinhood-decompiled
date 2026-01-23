package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class IncludeReviewChangesValuePropRdsRowBinding implements ViewBinding {
    private final RdsRowView rootView;

    private IncludeReviewChangesValuePropRdsRowBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeReviewChangesValuePropRdsRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeReviewChangesValuePropRdsRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.include_review_changes_value_prop_rds_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeReviewChangesValuePropRdsRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeReviewChangesValuePropRdsRowBinding((RdsRowView) view);
    }
}
