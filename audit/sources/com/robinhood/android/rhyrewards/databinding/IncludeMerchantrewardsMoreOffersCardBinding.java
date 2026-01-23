package com.robinhood.android.rhyrewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsMoreOffersCardView;

/* loaded from: classes5.dex */
public final class IncludeMerchantrewardsMoreOffersCardBinding implements ViewBinding {
    private final MerchantRewardsMoreOffersCardView rootView;

    private IncludeMerchantrewardsMoreOffersCardBinding(MerchantRewardsMoreOffersCardView merchantRewardsMoreOffersCardView) {
        this.rootView = merchantRewardsMoreOffersCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MerchantRewardsMoreOffersCardView getRoot() {
        return this.rootView;
    }

    public static IncludeMerchantrewardsMoreOffersCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMerchantrewardsMoreOffersCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27650R.layout.include_merchantrewards_more_offers_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMerchantrewardsMoreOffersCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMerchantrewardsMoreOffersCardBinding((MerchantRewardsMoreOffersCardView) view);
    }
}
