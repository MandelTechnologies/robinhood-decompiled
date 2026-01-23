package com.twilio.conversations.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public final class HandlerUtil {
    public static Handler setupListenerHandler() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return new Handler(looperMyLooper);
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new Handler(mainLooper);
        }
        throw new IllegalArgumentException("Listener must have a Looper.");
    }
}
