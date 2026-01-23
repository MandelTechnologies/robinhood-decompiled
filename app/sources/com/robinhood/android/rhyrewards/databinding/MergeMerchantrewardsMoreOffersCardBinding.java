package com.robinhood.android.rhyrewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhyrewards.C27650R;

/* loaded from: classes5.dex */
public final class MergeMerchantrewardsMoreOffersCardBinding implements ViewBinding {
    public final RhTextView merchantMoreOffersCardTitle;
    public final ImageView merchantOfferLogo1;
    public final ImageView merchantOfferLogo2;
    public final ImageView merchantOfferLogo3;
    public final ImageView merchantOfferLogo4;
    public final RdsCardView merchantOfferLogoWrapper1;
    public final RdsCardView merchantOfferLogoWrapper2;
    public final RdsCardView merchantOfferLogoWrapper3;
    public final RdsCardView merchantOfferLogoWrapper4;
    private final View rootView;

    private MergeMerchantrewardsMoreOffersCardBinding(View view, RhTextView rhTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RdsCardView rdsCardView, RdsCardView rdsCardView2, RdsCardView rdsCardView3, RdsCardView rdsCardView4) {
        this.rootView = view;
        this.merchantMoreOffersCardTitle = rhTextView;
        this.merchantOfferLogo1 = imageView;
        this.merchantOfferLogo2 = imageView2;
        this.merchantOfferLogo3 = imageView3;
        this.merchantOfferLogo4 = imageView4;
        this.merchantOfferLogoWrapper1 = rdsCardView;
        this.merchantOfferLogoWrapper2 = rdsCardView2;
        this.merchantOfferLogoWrapper3 = rdsCardView3;
        this.merchantOfferLogoWrapper4 = rdsCardView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMerchantrewardsMoreOffersCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27650R.layout.merge_merchantrewards_more_offers_card, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMerchantrewardsMoreOffersCardBinding bind(View view) {
        int i = C27650R.id.merchant_more_offers_card_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27650R.id.merchant_offer_logo_1;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27650R.id.merchant_offer_logo_2;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C27650R.id.merchant_offer_logo_3;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C27650R.id.merchant_offer_logo_4;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView4 != null) {
                            i = C27650R.id.merchant_offer_logo_wrapper_1;
                            RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
                            if (rdsCardView != null) {
                                i = C27650R.id.merchant_offer_logo_wrapper_2;
                                RdsCardView rdsCardView2 = (RdsCardView) ViewBindings.findChildViewById(view, i);
                                if (rdsCardView2 != null) {
                                    i = C27650R.id.merchant_offer_logo_wrapper_3;
                                    RdsCardView rdsCardView3 = (RdsCardView) ViewBindings.findChildViewById(view, i);
                                    if (rdsCardView3 != null) {
                                        i = C27650R.id.merchant_offer_logo_wrapper_4;
                                        RdsCardView rdsCardView4 = (RdsCardView) ViewBindings.findChildViewById(view, i);
                                        if (rdsCardView4 != null) {
                                            return new MergeMerchantrewardsMoreOffersCardBinding(view, rhTextView, imageView, imageView2, imageView3, imageView4, rdsCardView, rdsCardView2, rdsCardView3, rdsCardView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
