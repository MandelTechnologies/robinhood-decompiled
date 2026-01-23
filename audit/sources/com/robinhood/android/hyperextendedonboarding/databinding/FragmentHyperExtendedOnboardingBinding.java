package com.robinhood.android.hyperextendedonboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.hyperextendedonboarding.C18468R;

/* loaded from: classes10.dex */
public final class FragmentHyperExtendedOnboardingBinding implements ViewBinding {
    public final RecyclerView buttonRecyclerView;
    public final RhTextView disclosureTxt;
    public final LinearLayout footer;
    public final ImageView headerImg;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RecyclerView rowsRecyclerView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentHyperExtendedOnboardingBinding(FrameLayout frameLayout, RecyclerView recyclerView, RhTextView rhTextView, LinearLayout linearLayout, ImageView imageView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = frameLayout;
        this.buttonRecyclerView = recyclerView;
        this.disclosureTxt = rhTextView;
        this.footer = linearLayout;
        this.headerImg = imageView;
        this.loadingView = shimmerLoadingView;
        this.rowsRecyclerView = recyclerView2;
        this.subtitle = rhTextView2;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHyperExtendedOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHyperExtendedOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18468R.layout.fragment_hyper_extended_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentHyperExtendedOnboardingBinding bind(View view) {
        int i = C18468R.id.button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C18468R.id.disclosure_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C18468R.id.footer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C18468R.id.header_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C18468R.id.loading_view;
                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                        if (shimmerLoadingView != null) {
                            i = C18468R.id.rows_recycler_view;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                i = C18468R.id.subtitle;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C18468R.id.title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentHyperExtendedOnboardingBinding((FrameLayout) view, recyclerView, rhTextView, linearLayout, imageView, shimmerLoadingView, recyclerView2, rhTextView2, rhTextView3);
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
