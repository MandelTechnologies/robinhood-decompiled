package com.robinhood.shared.documents.statements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.shared.documents.statements.C38788R;

/* loaded from: classes6.dex */
public final class RowTaxCertificationBannerBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final RdsInfoBannerView taxCertificationBanner;

    private RowTaxCertificationBannerBinding(FrameLayout frameLayout, RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = frameLayout;
        this.taxCertificationBanner = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static RowTaxCertificationBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowTaxCertificationBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38788R.layout.row_tax_certification_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowTaxCertificationBannerBinding bind(View view) {
        int i = C38788R.id.tax_certification_banner;
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
        if (rdsInfoBannerView != null) {
            return new RowTaxCertificationBannerBinding((FrameLayout) view, rdsInfoBannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
