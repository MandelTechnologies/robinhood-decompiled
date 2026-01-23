package com.robinhood.utils.p408rx.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxCheckpointException.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/rx/error/RxCheckpointException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "stack", "", "Ljava/lang/StackTraceElement;", "cause", "", "<init>", "([Ljava/lang/StackTraceElement;Ljava/lang/Throwable;)V", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RxCheckpointException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxCheckpointException(StackTraceElement[] stack, Throwable cause) {
        super("Originally subscribed here", cause);
        Intrinsics.checkNotNullParameter(stack, "stack");
        Intrinsics.checkNotNullParameter(cause, "cause");
        setStackTrace(stack);
    }
}
