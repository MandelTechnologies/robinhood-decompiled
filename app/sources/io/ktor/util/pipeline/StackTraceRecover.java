package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StackTraceRecover.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"recoverStackTraceBridge", "", "exception", "continuation", "Lkotlin/coroutines/Continuation;", "ktor-utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.util.pipeline.StackTraceRecoverKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class StackTraceRecover {
    public static final Throwable recoverStackTraceBridge(Throwable exception, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            return StackTraceRecoverJvm.withCause(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
