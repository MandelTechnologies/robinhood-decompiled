package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.createtransfer.CreateTransferAccountRowView;

/* loaded from: classes9.dex */
public final class IncludeCreateTransferAccountRowViewBinding implements ViewBinding {
    private final CreateTransferAccountRowView rootView;

    private IncludeCreateTransferAccountRowViewBinding(CreateTransferAccountRowView createTransferAccountRowView) {
        this.rootView = createTransferAccountRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CreateTransferAccountRowView getRoot() {
        return this.rootView;
    }

    public static IncludeCreateTransferAccountRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCreateTransferAccountRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.include_create_transfer_account_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCreateTransferAccountRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCreateTransferAccountRowViewBinding((CreateTransferAccountRowView) view);
    }
}
