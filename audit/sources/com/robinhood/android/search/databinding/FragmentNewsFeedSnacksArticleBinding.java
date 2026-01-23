package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class FragmentNewsFeedSnacksArticleBinding implements ViewBinding {
    private final WebView rootView;
    public final WebView snacksArticleWebView;

    private FragmentNewsFeedSnacksArticleBinding(WebView webView, WebView webView2) {
        this.rootView = webView;
        this.snacksArticleWebView = webView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public WebView getRoot() {
        return this.rootView;
    }

    public static FragmentNewsFeedSnacksArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsFeedSnacksArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_news_feed_snacks_article, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsFeedSnacksArticleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        WebView webView = (WebView) view;
        return new FragmentNewsFeedSnacksArticleBinding(webView, webView);
    }
}
