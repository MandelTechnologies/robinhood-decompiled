package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeAcatsTransferDetailCancelBinding implements ViewBinding {
    public final RdsButton acatsTransferDetailCancelBtn;
    private final FrameLayout rootView;

    private IncludeAcatsTransferDetailCancelBinding(FrameLayout frameLayout, RdsButton rdsButton) {
        this.rootView = frameLayout;
        this.acatsTransferDetailCancelBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsTransferDetailCancelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsTransferDetailCancelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_acats_transfer_detail_cancel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsTransferDetailCancelBinding bind(View view) {
        int i = C18359R.id.acats_transfer_detail_cancel_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new IncludeAcatsTransferDetailCancelBinding((FrameLayout) view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
