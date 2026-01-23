package com.robinhood.concurrent;

import kotlin.Metadata;

/* compiled from: KeyedLock.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/concurrent/KeyedLock;", "K", "", "lockInterruptibly", "", "key", "(Ljava/lang/Object;)V", "unlock", "lib-concurrent"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface KeyedLock<K> {
    void lockInterruptibly(K key) throws InterruptedException;

    void unlock(K key);
}
