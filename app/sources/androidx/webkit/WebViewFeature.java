package androidx.webkit;

import androidx.webkit.internal.WebViewFeatureInternal;

/* loaded from: classes23.dex */
public class WebViewFeature {
    public static boolean isFeatureSupported(String str) {
        return WebViewFeatureInternal.isSupported(str);
    }
}
