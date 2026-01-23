package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.odyssey.C20335R;

/* loaded from: classes8.dex */
public final class RowBottomsheetListBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowBottomsheetListBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowBottomsheetListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowBottomsheetListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_bottomsheet_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowBottomsheetListBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowBottomsheetListBinding((RdsRowView) view);
    }
}
