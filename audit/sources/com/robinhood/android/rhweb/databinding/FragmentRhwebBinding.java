package com.robinhood.android.rhweb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.android.lib.webview.view.WebLoadingView;
import com.robinhood.android.rhweb.C27330R;

/* loaded from: classes5.dex */
public final class FragmentRhwebBinding implements ViewBinding {
    public final WebView newWindowWebview;
    private final ConstraintLayout rootView;
    public final WebErrorView webErrorView;
    public final WebLoadingView webLoadingView;
    public final WebView webview;

    private FragmentRhwebBinding(ConstraintLayout constraintLayout, WebView webView, WebErrorView webErrorView, WebLoadingView webLoadingView, WebView webView2) {
        this.rootView = constraintLayout;
        this.newWindowWebview = webView;
        this.webErrorView = webErrorView;
        this.webLoadingView = webLoadingView;
        this.webview = webView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhwebBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhwebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27330R.layout.fragment_rhweb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhwebBinding bind(View view) {
        int i = C27330R.id.new_window_webview;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            i = C27330R.id.web_error_view;
            WebErrorView webErrorView = (WebErrorView) ViewBindings.findChildViewById(view, i);
            if (webErrorView != null) {
                i = C27330R.id.web_loading_view;
                WebLoadingView webLoadingView = (WebLoadingView) ViewBindings.findChildViewById(view, i);
                if (webLoadingView != null) {
                    i = C27330R.id.webview;
                    WebView webView2 = (WebView) ViewBindings.findChildViewById(view, i);
                    if (webView2 != null) {
                        return new FragmentRhwebBinding((ConstraintLayout) view, webView, webErrorView, webLoadingView, webView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
