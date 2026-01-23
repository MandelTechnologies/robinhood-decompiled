package com.robinhood.shared.education.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;

/* loaded from: classes6.dex */
public final class FragmentCryptoLearnAndEarnTermsBinding implements ViewBinding {
    public final ShimmerLoadingView cryptoLearnAndEarnTermsLoading;
    public final RhTextView cryptoLearnAndEarnTermsText;
    private final FrameLayout rootView;

    private FragmentCryptoLearnAndEarnTermsBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView) {
        this.rootView = frameLayout;
        this.cryptoLearnAndEarnTermsLoading = shimmerLoadingView;
        this.cryptoLearnAndEarnTermsText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoLearnAndEarnTermsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoLearnAndEarnTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38790R.layout.fragment_crypto_learn_and_earn_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoLearnAndEarnTermsBinding bind(View view) {
        int i = C38790R.id.crypto_learn_and_earn_terms_loading;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C38790R.id.crypto_learn_and_earn_terms_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new FragmentCryptoLearnAndEarnTermsBinding((FrameLayout) view, shimmerLoadingView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
