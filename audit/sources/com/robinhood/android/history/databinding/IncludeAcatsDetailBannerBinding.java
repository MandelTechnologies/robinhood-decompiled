package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.p153ui.AcatsInDetailBannerView;

/* loaded from: classes10.dex */
public final class IncludeAcatsDetailBannerBinding implements ViewBinding {
    private final AcatsInDetailBannerView rootView;

    private IncludeAcatsDetailBannerBinding(AcatsInDetailBannerView acatsInDetailBannerView) {
        this.rootView = acatsInDetailBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AcatsInDetailBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsDetailBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsDetailBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_acats_detail_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsDetailBannerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAcatsDetailBannerBinding((AcatsInDetailBannerView) view);
    }
}
