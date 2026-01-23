package com.robinhood.concurrent;

import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyedLock.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001aA\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m3636d2 = {"KeyedLock", "Lcom/robinhood/concurrent/KeyedLock;", "K", "", "createLock", "Lkotlin/Function0;", "Ljava/util/concurrent/locks/Lock;", "withInterruptibleLock", "R", "key", "action", "(Lcom/robinhood/concurrent/KeyedLock;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lib-concurrent"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.concurrent.KeyedLockKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class KeyedLock2 {
    public static final <K> KeyedLock<K> KeyedLock(Function0<? extends Lock> createLock) {
        Intrinsics.checkNotNullParameter(createLock, "createLock");
        return new KeyedLock3(createLock);
    }

    public static final <K, R> R withInterruptibleLock(KeyedLock<K> keyedLock, K key, Function0<? extends R> action) throws InterruptedException {
        Intrinsics.checkNotNullParameter(keyedLock, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(action, "action");
        keyedLock.lockInterruptibly(key);
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            keyedLock.unlock(key);
            InlineMarker.finallyEnd(1);
        }
    }
}
