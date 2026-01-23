package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class RowOptionsCorporateActionItemBinding implements ViewBinding {
    private final RdsDataRowView rootView;

    private RowOptionsCorporateActionItemBinding(RdsDataRowView rdsDataRowView) {
        this.rootView = rdsDataRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsDataRowView getRoot() {
        return this.rootView;
    }

    public static RowOptionsCorporateActionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowOptionsCorporateActionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.row_options_corporate_action_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowOptionsCorporateActionItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowOptionsCorporateActionItemBinding((RdsDataRowView) view);
    }
}
