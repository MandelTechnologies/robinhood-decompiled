package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.earlypay.C14433R;

/* loaded from: classes7.dex */
public final class IncludeEarlyPayEnrollmentBannerBinding implements ViewBinding {
    private final RdsInfoBannerView rootView;

    private IncludeEarlyPayEnrollmentBannerBinding(RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInfoBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeEarlyPayEnrollmentBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEarlyPayEnrollmentBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14433R.layout.include_early_pay_enrollment_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEarlyPayEnrollmentBannerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEarlyPayEnrollmentBannerBinding((RdsInfoBannerView) view);
    }
}
