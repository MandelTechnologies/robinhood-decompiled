package com.robinhood.android.gold.lib.sage;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GoldSageWebViewCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/sage/GoldSageJavaScriptInterface;", "", "callbacks", "Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;", "<init>", "(Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;)V", "onSageExit", "", "message", "", "lib-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.lib.sage.GoldSageJavaScriptInterface, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageWebViewCallbacks2 {
    public static final int $stable = 8;
    private final GoldSageWebViewCallbacks callbacks;

    public GoldSageWebViewCallbacks2(GoldSageWebViewCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @JavascriptInterface
    public final void onSageExit(String message) {
        String string2;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            string2 = new JSONObject(message).getString("redirect_url");
        } catch (JSONException unused) {
            string2 = null;
        }
        this.callbacks.onSageExit(string2);
    }
}
