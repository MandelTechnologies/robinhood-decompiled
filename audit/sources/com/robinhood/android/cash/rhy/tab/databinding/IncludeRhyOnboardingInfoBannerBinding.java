package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;

/* loaded from: classes7.dex */
public final class IncludeRhyOnboardingInfoBannerBinding implements ViewBinding {
    public final RdsInfoBannerView onboardingClosedCmBanner;
    private final RdsInfoBannerView rootView;

    private IncludeRhyOnboardingInfoBannerBinding(RdsInfoBannerView rdsInfoBannerView, RdsInfoBannerView rdsInfoBannerView2) {
        this.rootView = rdsInfoBannerView;
        this.onboardingClosedCmBanner = rdsInfoBannerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInfoBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeRhyOnboardingInfoBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyOnboardingInfoBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.include_rhy_onboarding_info_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyOnboardingInfoBannerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) view;
        return new IncludeRhyOnboardingInfoBannerBinding(rdsInfoBannerView, rdsInfoBannerView);
    }
}
