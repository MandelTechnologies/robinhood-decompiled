package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes2.dex */
public final class IncludeMarginDefinitionRdsRowViewBinding implements ViewBinding {
    private final RdsRowView rootView;

    private IncludeMarginDefinitionRdsRowViewBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeMarginDefinitionRdsRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMarginDefinitionRdsRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.include_margin_definition_rds_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMarginDefinitionRdsRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMarginDefinitionRdsRowViewBinding((RdsRowView) view);
    }
}
