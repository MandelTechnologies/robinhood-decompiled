package com.robinhood.android.rollover401k.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.rollover401k.C27696R;

/* loaded from: classes5.dex */
public final class Fragment401kRolloverWebviewBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final WebView webview;

    private Fragment401kRolloverWebviewBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, WebView webView) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.webview = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Fragment401kRolloverWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Fragment401kRolloverWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27696R.layout.fragment_401k_rollover_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Fragment401kRolloverWebviewBinding bind(View view) {
        int i = C27696R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C27696R.id.webview;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
            if (webView != null) {
                return new Fragment401kRolloverWebviewBinding((FrameLayout) view, shimmerLoadingView, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
