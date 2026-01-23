package com.robinhood.shared.support.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.support.help.C40040R;

/* loaded from: classes6.dex */
public final class FragmentHelpCenterWebViewBinding implements ViewBinding {
    public final WebView helpCenterWebView;
    private final FrameLayout rootView;

    private FragmentHelpCenterWebViewBinding(FrameLayout frameLayout, WebView webView) {
        this.rootView = frameLayout;
        this.helpCenterWebView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHelpCenterWebViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHelpCenterWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40040R.layout.fragment_help_center_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentHelpCenterWebViewBinding bind(View view) {
        int i = C40040R.id.help_center_web_view;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new FragmentHelpCenterWebViewBinding((FrameLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
