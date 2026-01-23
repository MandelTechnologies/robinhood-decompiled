package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.p260ui.splash.DirectIpoOrderSplashSectionRowView;

/* loaded from: classes9.dex */
public final class IncludeDirectIpoOrderSplashSectionRowBinding implements ViewBinding {
    private final DirectIpoOrderSplashSectionRowView rootView;

    private IncludeDirectIpoOrderSplashSectionRowBinding(DirectIpoOrderSplashSectionRowView directIpoOrderSplashSectionRowView) {
        this.rootView = directIpoOrderSplashSectionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoOrderSplashSectionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoOrderSplashSectionRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoOrderSplashSectionRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.include_direct_ipo_order_splash_section_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoOrderSplashSectionRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoOrderSplashSectionRowBinding((DirectIpoOrderSplashSectionRowView) view);
    }
}
