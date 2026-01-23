package com.robinhood.iac.statusbanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.iac.statusbanner.C33353R;
import com.robinhood.iac.statusbanner.IacStatusBannerView;

/* loaded from: classes15.dex */
public final class IncludeIacBannerViewBinding implements ViewBinding {
    public final IacStatusBannerView iacStatusBannerView;
    private final IacStatusBannerView rootView;

    private IncludeIacBannerViewBinding(IacStatusBannerView iacStatusBannerView, IacStatusBannerView iacStatusBannerView2) {
        this.rootView = iacStatusBannerView;
        this.iacStatusBannerView = iacStatusBannerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IacStatusBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeIacBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIacBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C33353R.layout.include_iac_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIacBannerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        IacStatusBannerView iacStatusBannerView = (IacStatusBannerView) view;
        return new IncludeIacBannerViewBinding(iacStatusBannerView, iacStatusBannerView);
    }
}
