package com.robinhood.android.common.detail.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.newsfeed.p200ui.AssetNewsFeedView;

/* loaded from: classes2.dex */
public final class IncludeAssetNewsFeedBinding implements ViewBinding {
    private final AssetNewsFeedView rootView;

    private IncludeAssetNewsFeedBinding(AssetNewsFeedView assetNewsFeedView) {
        this.rootView = assetNewsFeedView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AssetNewsFeedView getRoot() {
        return this.rootView;
    }

    public static IncludeAssetNewsFeedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAssetNewsFeedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11117R.layout.include_asset_news_feed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAssetNewsFeedBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAssetNewsFeedBinding((AssetNewsFeedView) view);
    }
}
