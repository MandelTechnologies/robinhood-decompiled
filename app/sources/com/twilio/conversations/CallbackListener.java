package com.twilio.conversations;

import com.twilio.util.ErrorInfo;

/* loaded from: classes12.dex */
public interface CallbackListener<T> {
    default void onError(ErrorInfo errorInfo) {
    }

    void onSuccess(T t);
}
