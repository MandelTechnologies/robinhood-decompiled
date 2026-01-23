package com.robinhood.android.rollover401k.steps.webview;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;

/* compiled from: CapitalizeJavaScriptInterface.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/CapitalizeWebViewCallbacks;", "", "setTransactionId", "", "transactionId", "", "openIra", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onExit", "onFinderComplete", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.webview.CapitalizeWebViewCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface CapitalizeJavaScriptInterface2 {
    void onExit();

    void onFinderComplete();

    void openIra(BrokerageAccountType brokerageAccountType);

    void setTransactionId(String transactionId);
}
