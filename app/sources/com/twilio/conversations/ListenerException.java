package com.twilio.conversations;

import kotlin.Metadata;

/* compiled from: ListenerException.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/conversations/ListenerException;", "Ljava/lang/RuntimeException;", "t", "", "<init>", "(Ljava/lang/Throwable;)V", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ListenerException extends RuntimeException {
    public ListenerException(Throwable th) {
        super("Exception thrown by a listener. Your application might have a problem in listener implementation. Listeners must never throw uncaught exceptions. See 'Caused by:' below for more details.", th);
    }
}
