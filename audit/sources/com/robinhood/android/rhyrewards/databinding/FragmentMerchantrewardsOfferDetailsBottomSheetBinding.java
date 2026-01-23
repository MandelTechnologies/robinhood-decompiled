package com.robinhood.android.rhyrewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes5.dex */
public final class FragmentMerchantrewardsOfferDetailsBottomSheetBinding implements ViewBinding {
    public final ComposeView merchantOfferBanner;
    public final ComposeView merchantOfferProgressBar;
    public final View merchantOfferStatusSeparator;
    public final RhTextView merchantrewardsOfferDetailsAvailability;
    public final RdsButtonBarView merchantrewardsOfferDetailsButtonBar;
    public final ComposeView merchantrewardsOfferDetailsGaugeContainer;
    public final ComposeView merchantrewardsOfferDetailsList;
    public final ImageView merchantrewardsOfferDetailsLogo;
    public final FrameLayout merchantrewardsOfferDetailsLogoCard;
    public final RhTextView merchantrewardsOfferDetailsName;
    public final RhTextView merchantrewardsOfferDetailsTerms;
    public final RhTextView merchantrewardsOfferDetailsTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentMerchantrewardsOfferDetailsBottomSheetBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, ComposeView composeView, ComposeView composeView2, View view, RhTextView rhTextView, RdsButtonBarView rdsButtonBarView, ComposeView composeView3, ComposeView composeView4, ImageView imageView, FrameLayout frameLayout, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = focusSafeNestedScrollView;
        this.merchantOfferBanner = composeView;
        this.merchantOfferProgressBar = composeView2;
        this.merchantOfferStatusSeparator = view;
        this.merchantrewardsOfferDetailsAvailability = rhTextView;
        this.merchantrewardsOfferDetailsButtonBar = rdsButtonBarView;
        this.merchantrewardsOfferDetailsGaugeContainer = composeView3;
        this.merchantrewardsOfferDetailsList = composeView4;
        this.merchantrewardsOfferDetailsLogo = imageView;
        this.merchantrewardsOfferDetailsLogoCard = frameLayout;
        this.merchantrewardsOfferDetailsName = rhTextView2;
        this.merchantrewardsOfferDetailsTerms = rhTextView3;
        this.merchantrewardsOfferDetailsTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMerchantrewardsOfferDetailsBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMerchantrewardsOfferDetailsBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27650R.layout.fragment_merchantrewards_offer_details_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMerchantrewardsOfferDetailsBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        int i = C27650R.id.merchant_offer_banner;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C27650R.id.merchant_offer_progress_bar;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27650R.id.merchant_offer_status_separator))) != null) {
                i = C27650R.id.merchantrewards_offer_details_availability;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C27650R.id.merchantrewards_offer_details_button_bar;
                    RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
                    if (rdsButtonBarView != null) {
                        i = C27650R.id.merchantrewards_offer_details_gauge_container;
                        ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView3 != null) {
                            i = C27650R.id.merchantrewards_offer_details_list;
                            ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView4 != null) {
                                i = C27650R.id.merchantrewards_offer_details_logo;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C27650R.id.merchantrewards_offer_details_logo_card;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C27650R.id.merchantrewards_offer_details_name;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C27650R.id.merchantrewards_offer_details_terms;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C27650R.id.merchantrewards_offer_details_title;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    return new FragmentMerchantrewardsOfferDetailsBottomSheetBinding((FocusSafeNestedScrollView) view, composeView, composeView2, viewFindChildViewById, rhTextView, rdsButtonBarView, composeView3, composeView4, imageView, frameLayout, rhTextView2, rhTextView3, rhTextView4);
                                                }
                                            }
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
