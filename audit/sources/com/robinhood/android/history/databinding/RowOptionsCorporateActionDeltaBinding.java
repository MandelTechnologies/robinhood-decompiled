package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class RowOptionsCorporateActionDeltaBinding implements ViewBinding {
    public final RdsDataRowView newValues;
    public final RdsDataRowView oldValues;
    private final LinearLayout rootView;

    private RowOptionsCorporateActionDeltaBinding(LinearLayout linearLayout, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2) {
        this.rootView = linearLayout;
        this.newValues = rdsDataRowView;
        this.oldValues = rdsDataRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowOptionsCorporateActionDeltaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowOptionsCorporateActionDeltaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.row_options_corporate_action_delta, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowOptionsCorporateActionDeltaBinding bind(View view) {
        int i = C18359R.id.new_values;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.old_values;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                return new RowOptionsCorporateActionDeltaBinding((LinearLayout) view, rdsDataRowView, rdsDataRowView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
