package com.twilio.conversations.internal;

import android.os.Handler;
import com.twilio.conversations.ListenerException;
import com.twilio.conversations.StatusListener;
import com.twilio.util.ErrorInfo;

/* loaded from: classes12.dex */
public class StatusListenerForwarder implements StatusListener {
    final Handler handler = HandlerUtil.setupListenerHandler();
    final StatusListener listener;

    public StatusListenerForwarder(StatusListener statusListener) {
        this.listener = (StatusListener) RethrowingForwarder.create(statusListener, ListenerException.class);
    }

    @Override // com.twilio.conversations.StatusListener
    public void onSuccess() {
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.StatusListenerForwarder.1
            @Override // java.lang.Runnable
            public void run() {
                StatusListener statusListener = StatusListenerForwarder.this.listener;
                if (statusListener != null) {
                    statusListener.onSuccess();
                }
            }
        });
    }

    @Override // com.twilio.conversations.StatusListener
    public void onError(final ErrorInfo errorInfo) {
        this.handler.post(new Runnable() { // from class: com.twilio.conversations.internal.StatusListenerForwarder.2
            @Override // java.lang.Runnable
            public void run() {
                StatusListener statusListener = StatusListenerForwarder.this.listener;
                if (statusListener != null) {
                    statusListener.onError(errorInfo);
                }
            }
        });
    }
}
