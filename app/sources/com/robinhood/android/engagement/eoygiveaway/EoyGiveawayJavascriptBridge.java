package com.robinhood.android.engagement.eoygiveaway;

import android.webkit.JavascriptInterface;
import eoy_giveaway.p456v1.HandleCanvasMessageRequestDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import timber.log.Timber;

/* compiled from: EoyGiveawayJavascriptBridge.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/engagement/eoygiveaway/EoyGiveawayJavascriptBridge;", "", "<init>", "()V", "_messageFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Leoy_giveaway/v1/HandleCanvasMessageRequestDto;", "viewId", "", "getViewId", "()Ljava/lang/String;", "setViewId", "(Ljava/lang/String;)V", "messageFlow", "Lkotlinx/coroutines/flow/Flow;", "handleMessage", "", "message", "lib-eoy-giveaway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EoyGiveawayJavascriptBridge {
    public static final int $stable = 8;
    private final SharedFlow2<HandleCanvasMessageRequestDto> _messageFlow = SharedFlow4.MutableSharedFlow$default(0, 16, null, 4, null);
    private String viewId;

    public final String getViewId() {
        return this.viewId;
    }

    public final void setViewId(String str) {
        this.viewId = str;
    }

    public final Flow<HandleCanvasMessageRequestDto> messageFlow() {
        return FlowKt.asSharedFlow(this._messageFlow);
    }

    @JavascriptInterface
    public final void handleMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.mo3350d("handleMessage: " + message, new Object[0]);
        SharedFlow2<HandleCanvasMessageRequestDto> sharedFlow2 = this._messageFlow;
        String str = this.viewId;
        if (str == null) {
            str = "";
        }
        sharedFlow2.tryEmit(new HandleCanvasMessageRequestDto(str, message));
    }
}
