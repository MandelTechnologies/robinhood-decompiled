package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.settings.p254ui.BannerItemView;
import com.robinhood.android.settings.p254ui.C28356R;

/* loaded from: classes5.dex */
public final class IncludeBannerViewBinding implements ViewBinding {
    public final RdsInfoBannerView banner;
    private final BannerItemView rootView;

    private IncludeBannerViewBinding(BannerItemView bannerItemView, RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = bannerItemView;
        this.banner = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public BannerItemView getRoot() {
        return this.rootView;
    }

    public static IncludeBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeBannerViewBinding bind(View view) {
        int i = C28356R.id.banner;
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
        if (rdsInfoBannerView != null) {
            return new IncludeBannerViewBinding((BannerItemView) view, rdsInfoBannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
