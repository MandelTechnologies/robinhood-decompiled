package com.robinhood.android.lib.webview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.webview.C20684R;

/* loaded from: classes8.dex */
public final class FragmentEmbeddedWebviewBinding implements ViewBinding {
    private final WebView rootView;
    public final WebView webView;

    private FragmentEmbeddedWebviewBinding(WebView webView, WebView webView2) {
        this.rootView = webView;
        this.webView = webView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public WebView getRoot() {
        return this.rootView;
    }

    public static FragmentEmbeddedWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmbeddedWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20684R.layout.fragment_embedded_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmbeddedWebviewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        WebView webView = (WebView) view;
        return new FragmentEmbeddedWebviewBinding(webView, webView);
    }
}
