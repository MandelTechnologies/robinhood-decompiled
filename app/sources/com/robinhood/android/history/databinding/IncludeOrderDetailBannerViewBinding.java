package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeOrderDetailBannerViewBinding implements ViewBinding {
    private final RdsInfoBannerView rootView;

    private IncludeOrderDetailBannerViewBinding(RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInfoBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeOrderDetailBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOrderDetailBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_order_detail_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOrderDetailBannerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOrderDetailBannerViewBinding((RdsInfoBannerView) view);
    }
}
