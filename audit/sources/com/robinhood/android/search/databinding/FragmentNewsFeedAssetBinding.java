package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class FragmentNewsFeedAssetBinding implements ViewBinding {
    public final RecyclerView newsFeedAssetRecyclerView;
    public final FrameLayout newsFeedAssetRoot;
    private final FrameLayout rootView;

    private FragmentNewsFeedAssetBinding(FrameLayout frameLayout, RecyclerView recyclerView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.newsFeedAssetRecyclerView = recyclerView;
        this.newsFeedAssetRoot = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewsFeedAssetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsFeedAssetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_news_feed_asset, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsFeedAssetBinding bind(View view) {
        int i = C27909R.id.news_feed_asset_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new FragmentNewsFeedAssetBinding(frameLayout, recyclerView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
