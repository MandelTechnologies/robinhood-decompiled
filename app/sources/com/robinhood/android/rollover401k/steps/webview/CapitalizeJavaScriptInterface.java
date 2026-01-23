package com.robinhood.android.rollover401k.steps.webview;

import android.webkit.JavascriptInterface;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.logging.TimberLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CapitalizeJavaScriptInterface.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\b\u0010\u000f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/CapitalizeJavaScriptInterface;", "", "callbacks", "Lcom/robinhood/android/rollover401k/steps/webview/CapitalizeWebViewCallbacks;", "<init>", "(Lcom/robinhood/android/rollover401k/steps/webview/CapitalizeWebViewCallbacks;)V", "onCapitalize401kStepComplete", "", "transactionId", "", "onCapitalizeRolloverSubmitted", "onCreateRothIra", "onCreateTradIra", "onError", "onCapitalizeExit", "onCapitalizeFinderSearchComplete", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CapitalizeJavaScriptInterface {
    public static final int $stable = 8;
    private final CapitalizeJavaScriptInterface2 callbacks;

    public CapitalizeJavaScriptInterface(CapitalizeJavaScriptInterface2 callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @JavascriptInterface
    public final void onCapitalize401kStepComplete(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onCapitalize401kStepComplete " + transactionId);
        this.callbacks.setTransactionId(transactionId);
    }

    @JavascriptInterface
    public final void onCapitalizeRolloverSubmitted() {
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onCapitalizeRolloverSubmitted");
    }

    @JavascriptInterface
    public final void onCreateRothIra(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onCreateRothIra " + transactionId);
        this.callbacks.setTransactionId(transactionId);
        this.callbacks.openIra(BrokerageAccountType.IRA_ROTH);
    }

    @JavascriptInterface
    public final void onCreateTradIra(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onCreateTradIra " + transactionId);
        this.callbacks.setTransactionId(transactionId);
        this.callbacks.openIra(BrokerageAccountType.IRA_TRADITIONAL);
    }

    @JavascriptInterface
    public final void onError() {
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onError");
    }

    @JavascriptInterface
    public final void onCapitalizeExit() {
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onCapitalizeExit");
        this.callbacks.onExit();
    }

    @JavascriptInterface
    public final void onCapitalizeFinderSearchComplete() {
        TimberLogger.INSTANCE.mo1679d("CapitalizeJavaScriptInterface", "onCapitalizeFinderSearchComplete");
        this.callbacks.onFinderComplete();
    }
}
