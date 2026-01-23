package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.DataRowItemView;

/* loaded from: classes5.dex */
public final class IncludeDataRowItemViewCondensedBinding implements ViewBinding {
    private final DataRowItemView rootView;

    private IncludeDataRowItemViewCondensedBinding(DataRowItemView dataRowItemView) {
        this.rootView = dataRowItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DataRowItemView getRoot() {
        return this.rootView;
    }

    public static IncludeDataRowItemViewCondensedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDataRowItemViewCondensedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_data_row_item_view_condensed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDataRowItemViewCondensedBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDataRowItemViewCondensedBinding((DataRowItemView) view);
    }
}
