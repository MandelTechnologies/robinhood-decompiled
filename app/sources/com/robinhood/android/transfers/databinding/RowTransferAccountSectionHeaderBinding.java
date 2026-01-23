package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class RowTransferAccountSectionHeaderBinding implements ViewBinding {
    private final RhTextView rootView;

    private RowTransferAccountSectionHeaderBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static RowTransferAccountSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowTransferAccountSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.row_transfer_account_section_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowTransferAccountSectionHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowTransferAccountSectionHeaderBinding((RhTextView) view);
    }
}
