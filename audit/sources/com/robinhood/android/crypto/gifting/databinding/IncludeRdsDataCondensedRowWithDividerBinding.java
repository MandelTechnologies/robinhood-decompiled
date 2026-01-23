package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.designsystem.row.RdsDataRowView;

/* loaded from: classes2.dex */
public final class IncludeRdsDataCondensedRowWithDividerBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsDataRowView rowView;

    private IncludeRdsDataCondensedRowWithDividerBinding(LinearLayout linearLayout, RdsDataRowView rdsDataRowView) {
        this.rootView = linearLayout;
        this.rowView = rdsDataRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRdsDataCondensedRowWithDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRdsDataCondensedRowWithDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.include_rds_data_condensed_row_with_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRdsDataCondensedRowWithDividerBinding bind(View view) {
        int i = C12906R.id.row_view;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            return new IncludeRdsDataCondensedRowWithDividerBinding((LinearLayout) view, rdsDataRowView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
