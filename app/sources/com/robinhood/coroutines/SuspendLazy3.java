package com.robinhood.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuspendLazy.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"suspendLazy", "Lcom/robinhood/coroutines/SuspendLazy;", "T", "initializer", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/coroutines/SuspendLazy;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.SuspendLazyKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SuspendLazy3 {
    public static final <T> SuspendLazy<T> suspendLazy(Function1<? super Continuation<? super T>, ? extends Object> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new SuspendLazy2(initializer);
    }
}
