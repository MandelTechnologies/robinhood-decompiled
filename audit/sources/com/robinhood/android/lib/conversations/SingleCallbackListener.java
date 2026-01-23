package com.robinhood.android.lib.conversations;

import com.twilio.conversations.CallbackListener;
import com.twilio.util.ErrorInfo;
import io.reactivex.SingleEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleCallbackListener.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/SingleCallbackListener;", "T", "", "Lcom/twilio/conversations/CallbackListener;", "emitter", "Lio/reactivex/SingleEmitter;", "<init>", "(Lio/reactivex/SingleEmitter;)V", "onSuccess", "", "result", "(Ljava/lang/Object;)V", "onError", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
final class SingleCallbackListener<T> implements CallbackListener<T> {
    private final SingleEmitter<? super T> emitter;

    public SingleCallbackListener(SingleEmitter<? super T> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.emitter = emitter;
    }

    @Override // com.twilio.conversations.CallbackListener
    public void onSuccess(T result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.emitter.isDisposed()) {
            return;
        }
        this.emitter.onSuccess(result);
    }

    @Override // com.twilio.conversations.CallbackListener
    public void onError(ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        if (this.emitter.isDisposed()) {
            return;
        }
        this.emitter.onError(new ChatException(errorInfo, null, 2, null));
    }
}
