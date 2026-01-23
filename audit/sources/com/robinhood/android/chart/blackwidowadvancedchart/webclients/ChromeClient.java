package com.robinhood.android.chart.blackwidowadvancedchart.webclients;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.robinhood.utils.logging.TimberLogger;
import kotlin.Metadata;

/* compiled from: ChromeClient.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/webclients/ChromeClient;", "Landroid/webkit/WebChromeClient;", "<init>", "()V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChromeClient extends WebChromeClient {
    public static final int $stable = 8;

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        TimberLogger.INSTANCE.mo1679d("BlackWidowWebView: " + (consoleMessage != null ? consoleMessage.message() : null), new Object[0]);
        return super.onConsoleMessage(consoleMessage);
    }
}
