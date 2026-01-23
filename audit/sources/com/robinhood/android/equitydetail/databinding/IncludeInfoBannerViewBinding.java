package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeInfoBannerViewBinding implements ViewBinding {
    private final RdsInfoBannerView rootView;

    private IncludeInfoBannerViewBinding(RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInfoBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeInfoBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInfoBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_info_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInfoBannerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInfoBannerViewBinding((RdsInfoBannerView) view);
    }
}
