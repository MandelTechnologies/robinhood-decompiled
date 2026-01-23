package com.robinhood.android.gold.lib.sage;

import android.webkit.WebView;
import kotlin.Metadata;

/* compiled from: GoldSageWebViewCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;", "", "onSageExit", "", "redirectUrl", "", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", "lib-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GoldSageWebViewCallbacks {
    void onPageFinished(WebView view, String url);

    void onSageExit(String redirectUrl);
}
