package com.robinhood.android.lib.transfers.robinhood3ds;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: ThreeDSHostCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "", "threeDSCancelationEvent", "Lcom/robinhood/udf/UiEvent;", "", "getThreeDSCancelationEvent", "()Lcom/robinhood/udf/UiEvent;", "setThreeDSCancelationEvent", "(Lcom/robinhood/udf/UiEvent;)V", "threeDSCompletionEvent", "getThreeDSCompletionEvent", "setThreeDSCompletionEvent", "onThreeDSRequested", "redirectUrl", "", "onThreeDsCanceled", "onThreeDSCompleted", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface ThreeDSHostCallbacks {
    UiEvent<Unit> getThreeDSCancelationEvent();

    UiEvent<Unit> getThreeDSCompletionEvent();

    void onThreeDSCompleted();

    void onThreeDSRequested(String redirectUrl);

    void onThreeDsCanceled();

    void setThreeDSCancelationEvent(UiEvent<Unit> uiEvent);

    void setThreeDSCompletionEvent(UiEvent<Unit> uiEvent);
}
