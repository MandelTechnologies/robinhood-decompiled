package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdBanner;

/* loaded from: classes8.dex */
public final class IncludeSdBannerBinding implements ViewBinding {
    private final SdBanner rootView;
    public final SdBanner sdBanner;

    private IncludeSdBannerBinding(SdBanner sdBanner, SdBanner sdBanner2) {
        this.rootView = sdBanner;
        this.sdBanner = sdBanner2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdBanner getRoot() {
        return this.rootView;
    }

    public static IncludeSdBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdBannerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdBanner sdBanner = (SdBanner) view;
        return new IncludeSdBannerBinding(sdBanner, sdBanner);
    }
}
