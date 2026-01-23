package com.robinhood.android.cash.merchantrewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentMerchantrewardsOfferTermsBinding implements ViewBinding {
    public final RhTextView merchantrewardsOfferTermsContent;
    public final RhTextView merchantrewardsOfferTermsTitle;
    private final ScrollView rootView;

    private FragmentMerchantrewardsOfferTermsBinding(ScrollView scrollView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = scrollView;
        this.merchantrewardsOfferTermsContent = rhTextView;
        this.merchantrewardsOfferTermsTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMerchantrewardsOfferTermsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMerchantrewardsOfferTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10127R.layout.fragment_merchantrewards_offer_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMerchantrewardsOfferTermsBinding bind(View view) {
        int i = C10127R.id.merchantrewards_offer_terms_content;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C10127R.id.merchantrewards_offer_terms_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new FragmentMerchantrewardsOfferTermsBinding((ScrollView) view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
