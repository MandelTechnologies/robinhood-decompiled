package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class RowTransferUkAddAccountBinding implements ViewBinding {
    private final RdsRowView rootView;

    private RowTransferUkAddAccountBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static RowTransferUkAddAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowTransferUkAddAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.row_transfer_uk_add_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowTransferUkAddAccountBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowTransferUkAddAccountBinding((RdsRowView) view);
    }
}
