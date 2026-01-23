package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.shared.common.agreementview.RdsAgreementView;

/* loaded from: classes2.dex */
public final class FragmentCryptoUpgradeDisclosureBinding implements ViewBinding {
    public final RdsAgreementView agreementView;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;

    private FragmentCryptoUpgradeDisclosureBinding(FrameLayout frameLayout, RdsAgreementView rdsAgreementView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.agreementView = rdsAgreementView;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoUpgradeDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoUpgradeDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12757R.layout.fragment_crypto_upgrade_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoUpgradeDisclosureBinding bind(View view) {
        int i = C12757R.id.agreement_view;
        RdsAgreementView rdsAgreementView = (RdsAgreementView) ViewBindings.findChildViewById(view, i);
        if (rdsAgreementView != null) {
            i = C12757R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentCryptoUpgradeDisclosureBinding((FrameLayout) view, rdsAgreementView, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
