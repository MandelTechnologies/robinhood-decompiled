package com.twilio.conversations.internal;

import android.os.Handler;
import com.twilio.conversations.CallbackListener;
import com.twilio.conversations.ListenerException;
import com.twilio.util.ErrorInfo;

/* loaded from: classes12.dex */
public class CallbackListenerForwarder<T> implements CallbackListener<T> {
    final Handler handler = HandlerUtil.setupListenerHandler();
    final CallbackListener<T> listener;

    public CallbackListenerForwarder(CallbackListener<T> callbackListener) {
        this.listener = (CallbackListener) RethrowingForwarder.create(callbackListener, ListenerException.class);
    }

    @Override // com.twilio.conversations.CallbackListener
    public void onSuccess(final T t) {
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.CallbackListenerForwarder.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                CallbackListener<T> callbackListener = CallbackListenerForwarder.this.listener;
                if (callbackListener != 0) {
                    callbackListener.onSuccess(t);
                }
            }
        });
    }

    @Override // com.twilio.conversations.CallbackListener
    public void onError(final ErrorInfo errorInfo) {
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.CallbackListenerForwarder.2
            @Override // java.lang.Runnable
            public void run() {
                CallbackListener<T> callbackListener = CallbackListenerForwarder.this.listener;
                if (callbackListener != null) {
                    callbackListener.onError(errorInfo);
                }
            }
        });
    }
}
