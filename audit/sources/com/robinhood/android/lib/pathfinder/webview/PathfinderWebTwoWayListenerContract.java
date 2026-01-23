package com.robinhood.android.lib.pathfinder.webview;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;

/* compiled from: PathfinderWebTwoWayListenerContract.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\b\u001a\u00020\u0003H'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebTwoWayListenerContract;", "", "getUserView", "", "updateInquiry", "message", "", "updateInquiryWithError", "goBack", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface PathfinderWebTwoWayListenerContract {
    @JavascriptInterface
    void getUserView();

    @JavascriptInterface
    void goBack();

    @JavascriptInterface
    void updateInquiry(String message);

    @JavascriptInterface
    void updateInquiryWithError(String message);
}
