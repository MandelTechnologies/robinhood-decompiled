package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes2.dex */
public final class RowListItemContainerBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowListItemContainerBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowListItemContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowListItemContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.row_list_item_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowListItemContainerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowListItemContainerBinding((RdsRowView) view);
    }
}
