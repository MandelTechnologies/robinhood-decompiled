package com.robinhood.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Timeout.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/coroutines/TimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.TimeoutException, reason: use source file name */
/* loaded from: classes15.dex */
public final class Timeout2 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeout2(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
