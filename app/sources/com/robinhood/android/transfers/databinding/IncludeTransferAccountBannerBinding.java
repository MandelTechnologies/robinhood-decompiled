package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class IncludeTransferAccountBannerBinding implements ViewBinding {
    public final RdsInfoBannerView banner;
    private final FrameLayout rootView;

    private IncludeTransferAccountBannerBinding(FrameLayout frameLayout, RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = frameLayout;
        this.banner = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeTransferAccountBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTransferAccountBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.include_transfer_account_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTransferAccountBannerBinding bind(View view) {
        int i = C30065R.id.banner;
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
        if (rdsInfoBannerView != null) {
            return new IncludeTransferAccountBannerBinding((FrameLayout) view, rdsInfoBannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
