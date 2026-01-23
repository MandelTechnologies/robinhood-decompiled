package com.robinhood.android.newsfeeddisclosure.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.newsfeeddisclosure.C22587R;

/* loaded from: classes8.dex */
public final class FragmentNewsfeedDisclosureBinding implements ViewBinding {
    public final AppBarLayout newsfeedDisclosureAppBarLayout;
    public final CoordinatorLayout newsfeedDisclosureContentLayout;
    public final LinearLayout newsfeedDisclosureContentViewGroup;
    public final ErrorView newsfeedDisclosureErrorView;
    public final ImageView newsfeedDisclosureImageView;
    public final ShimmerLoadingView newsfeedDisclosureLoadingView;
    public final RecyclerView newsfeedDisclosureRecyclerView;
    public final RhTextView newsfeedDisclosureSubtitle;
    public final RhTextView newsfeedDisclosureTitle;
    private final FrameLayout rootView;

    private FragmentNewsfeedDisclosureBinding(FrameLayout frameLayout, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ErrorView errorView, ImageView imageView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = frameLayout;
        this.newsfeedDisclosureAppBarLayout = appBarLayout;
        this.newsfeedDisclosureContentLayout = coordinatorLayout;
        this.newsfeedDisclosureContentViewGroup = linearLayout;
        this.newsfeedDisclosureErrorView = errorView;
        this.newsfeedDisclosureImageView = imageView;
        this.newsfeedDisclosureLoadingView = shimmerLoadingView;
        this.newsfeedDisclosureRecyclerView = recyclerView;
        this.newsfeedDisclosureSubtitle = rhTextView;
        this.newsfeedDisclosureTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewsfeedDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsfeedDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22587R.layout.fragment_newsfeed_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsfeedDisclosureBinding bind(View view) {
        int i = C22587R.id.newsfeed_disclosure_app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C22587R.id.newsfeed_disclosure_content_layout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
            if (coordinatorLayout != null) {
                i = C22587R.id.newsfeed_disclosure_content_view_group;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C22587R.id.newsfeed_disclosure_error_view;
                    ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
                    if (errorView != null) {
                        i = C22587R.id.newsfeed_disclosure_image_view;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C22587R.id.newsfeed_disclosure_loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C22587R.id.newsfeed_disclosure_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C22587R.id.newsfeed_disclosure_subtitle;
                                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView != null) {
                                        i = C22587R.id.newsfeed_disclosure_title;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            return new FragmentNewsfeedDisclosureBinding((FrameLayout) view, appBarLayout, coordinatorLayout, linearLayout, errorView, imageView, shimmerLoadingView, recyclerView, rhTextView, rhTextView2);
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
