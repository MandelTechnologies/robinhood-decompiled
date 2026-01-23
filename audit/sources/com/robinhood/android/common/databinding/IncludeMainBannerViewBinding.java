package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.banner.MainBannerView;

/* loaded from: classes2.dex */
public final class IncludeMainBannerViewBinding implements ViewBinding {
    private final MainBannerView rootView;

    private IncludeMainBannerViewBinding(MainBannerView mainBannerView) {
        this.rootView = mainBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MainBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeMainBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMainBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.include_main_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMainBannerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMainBannerViewBinding((MainBannerView) view);
    }
}
