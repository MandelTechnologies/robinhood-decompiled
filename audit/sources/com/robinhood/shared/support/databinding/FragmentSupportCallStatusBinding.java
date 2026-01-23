package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.support.call.banner.SupportCallBannerView;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class FragmentSupportCallStatusBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final SupportCallBannerView supportCallStatusBanner;
    public final View supportCallStatusBannerBackground;
    public final ConstraintLayout supportCallStatusContentView;
    public final ImageView supportCallStatusIllustrationImg;
    public final ShimmerLoadingView supportCallStatusLoadingView;
    public final LottieAnimationView supportCallStatusLottieView;
    public final RdsButton supportCallStatusPrimaryBtn;
    public final RdsButton supportCallStatusSecondaryBtn;
    public final RdsInfoBannerView supportCallStatusStaleBannerView;
    public final RhTextView supportCallStatusSubtitleTxt;
    public final RhTextView supportCallStatusTitleTxt;

    private FragmentSupportCallStatusBinding(ConstraintLayout constraintLayout, SupportCallBannerView supportCallBannerView, View view, ConstraintLayout constraintLayout2, ImageView imageView, ShimmerLoadingView shimmerLoadingView, LottieAnimationView lottieAnimationView, RdsButton rdsButton, RdsButton rdsButton2, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.supportCallStatusBanner = supportCallBannerView;
        this.supportCallStatusBannerBackground = view;
        this.supportCallStatusContentView = constraintLayout2;
        this.supportCallStatusIllustrationImg = imageView;
        this.supportCallStatusLoadingView = shimmerLoadingView;
        this.supportCallStatusLottieView = lottieAnimationView;
        this.supportCallStatusPrimaryBtn = rdsButton;
        this.supportCallStatusSecondaryBtn = rdsButton2;
        this.supportCallStatusStaleBannerView = rdsInfoBannerView;
        this.supportCallStatusSubtitleTxt = rhTextView;
        this.supportCallStatusTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSupportCallStatusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSupportCallStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.fragment_support_call_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSupportCallStatusBinding bind(View view) {
        View viewFindChildViewById;
        int i = C39996R.id.support_call_status_banner;
        SupportCallBannerView supportCallBannerView = (SupportCallBannerView) ViewBindings.findChildViewById(view, i);
        if (supportCallBannerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C39996R.id.support_call_status_banner_background))) != null) {
            i = C39996R.id.support_call_status_content_view;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C39996R.id.support_call_status_illustration_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C39996R.id.support_call_status_loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        i = C39996R.id.support_call_status_lottie_view;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C39996R.id.support_call_status_primary_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C39996R.id.support_call_status_secondary_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    i = C39996R.id.support_call_status_stale_banner_view;
                                    RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                                    if (rdsInfoBannerView != null) {
                                        i = C39996R.id.support_call_status_subtitle_txt;
                                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView != null) {
                                            i = C39996R.id.support_call_status_title_txt;
                                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView2 != null) {
                                                return new FragmentSupportCallStatusBinding((ConstraintLayout) view, supportCallBannerView, viewFindChildViewById, constraintLayout, imageView, shimmerLoadingView, lottieAnimationView, rdsButton, rdsButton2, rdsInfoBannerView, rhTextView, rhTextView2);
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
