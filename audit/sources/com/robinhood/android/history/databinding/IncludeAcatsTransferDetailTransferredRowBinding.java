package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeAcatsTransferDetailTransferredRowBinding implements ViewBinding {
    private final RdsDataRowView rootView;

    private IncludeAcatsTransferDetailTransferredRowBinding(RdsDataRowView rdsDataRowView) {
        this.rootView = rdsDataRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsDataRowView getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsTransferDetailTransferredRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsTransferDetailTransferredRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_acats_transfer_detail_transferred_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsTransferDetailTransferredRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAcatsTransferDetailTransferredRowBinding((RdsDataRowView) view);
    }
}
