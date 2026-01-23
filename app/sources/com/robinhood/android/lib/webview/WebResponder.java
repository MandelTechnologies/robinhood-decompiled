package com.robinhood.android.lib.webview;

import android.webkit.ValueCallback;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.lib.webview.WebContracts2;
import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WebResponder.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B5\u0012$\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005H\u0016J6\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005H\u0016J.\u0010\u0011\u001a\u00020\u00062\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005H\u0002R,\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebResponder;", "Lcom/robinhood/android/lib/webview/WebResponderContract;", "javascriptExecutor", "Lkotlin/Function2;", "", "Landroid/webkit/ValueCallback;", "", "Lcom/robinhood/android/lib/webview/JavascriptExecutor;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "sendWebMessage", WebResponder.ARG_NAME, "body", "resultCallback", "bodyMap", "", "argMap", "Companion", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class WebResponder implements WebContracts2 {
    private static final String ARG_BODY = "body";
    private static final String ARG_NAME = "name";
    private final Function2<String, ValueCallback<String>, Unit> javascriptExecutor;
    private final LazyMoshi moshi;

    /* JADX WARN: Multi-variable type inference failed */
    public WebResponder(Function2<? super String, ? super ValueCallback<String>, Unit> javascriptExecutor, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(javascriptExecutor, "javascriptExecutor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.javascriptExecutor = javascriptExecutor;
        this.moshi = moshi;
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void setAccessibleColors(ColorScheme colorScheme) {
        WebContracts2.DefaultImpls.setAccessibleColors(this, colorScheme);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void setInitialConfig(WebConfig webConfig) {
        WebContracts2.DefaultImpls.setInitialConfig(this, webConfig);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void setInitialConfig(String str, String str2, String str3, String str4, Theme theme, NightModeManager2 nightModeManager2, ColorScheme colorScheme) {
        WebContracts2.DefaultImpls.setInitialConfig(this, str, str2, str3, str4, theme, nightModeManager2, colorScheme);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void setTheme(Theme theme, NightModeManager2 nightModeManager2) {
        WebContracts2.DefaultImpls.setTheme(this, theme, nightModeManager2);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void setToken(OAuthToken oAuthToken) {
        WebContracts2.DefaultImpls.setToken(this, oAuthToken);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void updatePageData() {
        WebContracts2.DefaultImpls.updatePageData(this);
    }

    private final JsonAdapter<Map<?, ?>> getAdapter() {
        return this.moshi.adapter(Map.class);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void sendWebMessage(String name, String body, ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(ARG_NAME, name), Tuples4.m3642to("body", body));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        sendWebMessage(linkedHashMap, resultCallback);
    }

    @Override // com.robinhood.android.lib.webview.WebContracts2
    public void sendWebMessage(String name, Map<String, ? extends Object> bodyMap, ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bodyMap, "bodyMap");
        sendWebMessage(MapsKt.mapOf(Tuples4.m3642to(ARG_NAME, name), Tuples4.m3642to("body", bodyMap)), resultCallback);
    }

    private final void sendWebMessage(Map<String, ? extends Object> argMap, ValueCallback<String> resultCallback) {
        this.javascriptExecutor.invoke("window.webViewCallback( " + getAdapter().toJson(argMap) + " )", resultCallback);
    }
}
