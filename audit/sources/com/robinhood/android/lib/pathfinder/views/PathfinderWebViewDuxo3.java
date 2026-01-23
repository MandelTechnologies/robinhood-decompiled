package com.robinhood.android.lib.pathfinder.views;

import android.webkit.ValueCallback;
import com.robinhood.android.lib.pathfinder.webview.PathfinderWebResponderContract;
import com.robinhood.android.lib.webview.WebResponder;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PathfinderWebViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"com/robinhood/android/lib/pathfinder/views/PathfinderWebViewDuxo$webResponder$1", "Lcom/robinhood/android/lib/webview/WebResponder;", "Lcom/robinhood/android/lib/pathfinder/webview/PathfinderWebResponderContract;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.views.PathfinderWebViewDuxo$webResponder$1, reason: use source file name */
/* loaded from: classes8.dex */
public final class PathfinderWebViewDuxo3 extends WebResponder implements PathfinderWebResponderContract {
    PathfinderWebViewDuxo3(Function2<? super String, ? super ValueCallback<String>, Unit> function2, LazyMoshi lazyMoshi) {
        super(function2, lazyMoshi);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebResponderContract
    public void renderUserView(LazyMoshi lazyMoshi, UUID uuid, String str, ValueCallback<String> valueCallback) {
        PathfinderWebResponderContract.DefaultImpls.renderUserView(this, lazyMoshi, uuid, str, valueCallback);
    }

    @Override // com.robinhood.android.lib.pathfinder.webview.PathfinderWebResponderContract
    public void renderUserView(UUID uuid, Map<String, ? extends Object> map) {
        PathfinderWebResponderContract.DefaultImpls.renderUserView(this, uuid, map);
    }
}
