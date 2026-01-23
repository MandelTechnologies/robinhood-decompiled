package com.robinhood.test.idler;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackedWebChromeClient.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/test/idler/TrackedWebChromeClient;", "Landroid/webkit/WebChromeClient;", "<init>", "()V", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class TrackedWebChromeClient extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        Intrinsics.checkNotNullParameter(view, "view");
        IdlingResourceCounters2.setBusy(IdlingResourceType.WEB_CHROME_CLIENT_PROGRESS, newProgress != 100);
    }
}
