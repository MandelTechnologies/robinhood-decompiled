package com.twilio.conversations;

import com.twilio.util.ErrorInfo;

/* loaded from: classes12.dex */
public interface StatusListener {
    default void onError(ErrorInfo errorInfo) {
    }

    void onSuccess();
}
