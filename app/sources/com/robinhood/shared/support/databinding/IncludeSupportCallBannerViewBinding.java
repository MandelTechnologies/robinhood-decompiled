package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.support.call.banner.SupportCallBannerView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class IncludeSupportCallBannerViewBinding implements ViewBinding {
    private final SupportCallBannerView rootView;
    public final SupportCallBannerView supportCallBannerView;

    private IncludeSupportCallBannerViewBinding(SupportCallBannerView supportCallBannerView, SupportCallBannerView supportCallBannerView2) {
        this.rootView = supportCallBannerView;
        this.supportCallBannerView = supportCallBannerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SupportCallBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeSupportCallBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSupportCallBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.include_support_call_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSupportCallBannerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SupportCallBannerView supportCallBannerView = (SupportCallBannerView) view;
        return new IncludeSupportCallBannerViewBinding(supportCallBannerView, supportCallBannerView);
    }
}
