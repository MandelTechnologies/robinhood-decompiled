package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeAcatsTransferDetailReclaimFooterBinding implements ViewBinding {
    private final RhTextView rootView;

    private IncludeAcatsTransferDetailReclaimFooterBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsTransferDetailReclaimFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsTransferDetailReclaimFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_acats_transfer_detail_reclaim_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsTransferDetailReclaimFooterBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAcatsTransferDetailReclaimFooterBinding((RhTextView) view);
    }
}
