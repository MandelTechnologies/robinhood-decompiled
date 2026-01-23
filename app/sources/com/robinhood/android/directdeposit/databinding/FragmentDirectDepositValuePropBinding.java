package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentDirectDepositValuePropBinding implements ViewBinding {
    public final LinearLayout directDepositSplashBottomContainer;
    public final RhTextView directDepositSplashDisclosureTitle;
    public final ImageView directDepositSplashImage;
    public final ShimmerLoadingView directDepositSplashLoading;
    public final RdsButton directDepositSplashPrimaryButton;
    public final RecyclerView directDepositSplashRecyclerView;
    public final RdsButton directDepositSplashSecondaryButton;
    public final RhTextView directDepositSplashTitle;
    private final ConstraintLayout rootView;

    private FragmentDirectDepositValuePropBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RhTextView rhTextView, ImageView imageView, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton, RecyclerView recyclerView, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.directDepositSplashBottomContainer = linearLayout;
        this.directDepositSplashDisclosureTitle = rhTextView;
        this.directDepositSplashImage = imageView;
        this.directDepositSplashLoading = shimmerLoadingView;
        this.directDepositSplashPrimaryButton = rdsButton;
        this.directDepositSplashRecyclerView = recyclerView;
        this.directDepositSplashSecondaryButton = rdsButton2;
        this.directDepositSplashTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectDepositValuePropBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectDepositValuePropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_direct_deposit_value_prop, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectDepositValuePropBinding bind(View view) {
        int i = C14044R.id.direct_deposit_splash_bottom_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14044R.id.direct_deposit_splash_disclosure_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.direct_deposit_splash_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C14044R.id.direct_deposit_splash_loading;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        i = C14044R.id.direct_deposit_splash_primary_button;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C14044R.id.direct_deposit_splash_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C14044R.id.direct_deposit_splash_secondary_button;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    i = C14044R.id.direct_deposit_splash_title;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        return new FragmentDirectDepositValuePropBinding((ConstraintLayout) view, linearLayout, rhTextView, imageView, shimmerLoadingView, rdsButton, recyclerView, rdsButton2, rhTextView2);
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
