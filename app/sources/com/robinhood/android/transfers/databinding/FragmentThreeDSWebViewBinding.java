package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class FragmentThreeDSWebViewBinding implements ViewBinding {
    private final WebView rootView;
    public final WebView webView;

    private FragmentThreeDSWebViewBinding(WebView webView, WebView webView2) {
        this.rootView = webView;
        this.webView = webView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public WebView getRoot() {
        return this.rootView;
    }

    public static FragmentThreeDSWebViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentThreeDSWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_three_d_s_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentThreeDSWebViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        WebView webView = (WebView) view;
        return new FragmentThreeDSWebViewBinding(webView, webView);
    }
}
