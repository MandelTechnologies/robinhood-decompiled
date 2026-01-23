package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class IncludeOptionOnboardingSplashDotIndicatorBinding implements ViewBinding {
    private final DotIndicators rootView;
    public final DotIndicators splashIndicators;

    private IncludeOptionOnboardingSplashDotIndicatorBinding(DotIndicators dotIndicators, DotIndicators dotIndicators2) {
        this.rootView = dotIndicators;
        this.splashIndicators = dotIndicators2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DotIndicators getRoot() {
        return this.rootView;
    }

    public static IncludeOptionOnboardingSplashDotIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionOnboardingSplashDotIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.include_option_onboarding_splash_dot_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionOnboardingSplashDotIndicatorBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DotIndicators dotIndicators = (DotIndicators) view;
        return new IncludeOptionOnboardingSplashDotIndicatorBinding(dotIndicators, dotIndicators);
    }
}
