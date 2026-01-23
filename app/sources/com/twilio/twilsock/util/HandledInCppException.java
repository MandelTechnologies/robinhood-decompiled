package com.twilio.twilsock.util;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: HandledInCppException.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/twilio/twilsock/util/HandledInCppException;", "Ljava/util/concurrent/CancellationException;", "Lio/ktor/utils/io/CancellationException;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class HandledInCppException extends CancellationException {
    public HandledInCppException() {
        super("Reply has been handled on CPP level");
    }
}
