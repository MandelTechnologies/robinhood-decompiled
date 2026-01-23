package com.twilio.util;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Executors4;

/* compiled from: CoroutineContext.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"shutdown", "", "Lkotlin/coroutines/CoroutineContext;", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.CoroutineContextKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CoroutineContext2 {
    public static final void shutdown(CoroutineContext coroutineContext) throws IOException {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        if (coroutineContext instanceof Closeable) {
            ((Closeable) coroutineContext).close();
            return;
        }
        if (coroutineContext instanceof Executors4) {
            ((Executors4) coroutineContext).close();
            return;
        }
        TwilioLogger.d$default(TwilioLogger3.getLogger(coroutineContext), "coroutine context [" + coroutineContext + "] is not closeable", (Throwable) null, 2, (Object) null);
    }
}
