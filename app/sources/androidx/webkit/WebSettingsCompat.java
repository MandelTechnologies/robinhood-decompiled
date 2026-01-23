package androidx.webkit;

import android.webkit.WebSettings;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

/* loaded from: classes23.dex */
public class WebSettingsCompat {
    public static void setSafeBrowsingEnabled(WebSettings webSettings, boolean z) {
        ApiFeature.C3020O c3020o = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (c3020o.isSupportedByFramework()) {
            ApiHelperForO.setSafeBrowsingEnabled(webSettings, z);
        } else {
            if (c3020o.isSupportedByWebView()) {
                getAdapter(webSettings).setSafeBrowsingEnabled(z);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    private static WebSettingsAdapter getAdapter(WebSettings webSettings) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings);
    }
}
