package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.p260ui.splash.DirectIpoOrderSplashSectionView;

/* loaded from: classes9.dex */
public final class IncludeDirectIpoOrderSplashSectionBinding implements ViewBinding {
    private final DirectIpoOrderSplashSectionView rootView;

    private IncludeDirectIpoOrderSplashSectionBinding(DirectIpoOrderSplashSectionView directIpoOrderSplashSectionView) {
        this.rootView = directIpoOrderSplashSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoOrderSplashSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoOrderSplashSectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoOrderSplashSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.include_direct_ipo_order_splash_section, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoOrderSplashSectionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoOrderSplashSectionBinding((DirectIpoOrderSplashSectionView) view);
    }
}
