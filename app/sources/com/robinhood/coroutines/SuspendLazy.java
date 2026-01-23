package com.robinhood.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SuspendLazy.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0005\u001a\u00028\u0000H¦B¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/coroutines/SuspendLazy;", "T", "", "isInitialized", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface SuspendLazy<T> {
    Object invoke(Continuation<? super T> continuation);

    boolean isInitialized();
}
