package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class RowTransferAddAccountBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowTransferAddAccountBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowTransferAddAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowTransferAddAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.row_transfer_add_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowTransferAddAccountBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowTransferAddAccountBinding((RdsRowView) view);
    }
}
