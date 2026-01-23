package com.robinhood.concurrent;

import java.util.Set;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyedLock.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/concurrent/RealKeyedLock;", "K", "", "Lcom/robinhood/concurrent/KeyedLock;", "createLock", "Lkotlin/Function0;", "Ljava/util/concurrent/locks/Lock;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "referenceManager", "Lcom/robinhood/concurrent/DefaultKeyedInstanceManager;", "lockInterruptibly", "", "key", "(Ljava/lang/Object;)V", "unlock", "keys", "", "getKeys$lib_concurrent$annotations", "()V", "getKeys$lib_concurrent", "()Ljava/util/Set;", "lib-concurrent"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.concurrent.RealKeyedLock, reason: use source file name */
/* loaded from: classes15.dex */
public final class KeyedLock3<K> implements KeyedLock<K> {
    private final KeyedInstanceManager2<K, Lock> referenceManager;

    public static /* synthetic */ void getKeys$lib_concurrent$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyedLock3(final Function0<? extends Lock> createLock) {
        Intrinsics.checkNotNullParameter(createLock, "createLock");
        this.referenceManager = new KeyedInstanceManager2<>(new Function1() { // from class: com.robinhood.concurrent.RealKeyedLock$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KeyedLock3.referenceManager$lambda$0(createLock, obj);
            }
        }, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lock referenceManager$lambda$0(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Lock) function0.invoke();
    }

    /* compiled from: KeyedLock.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.concurrent.RealKeyedLock$lockInterruptibly$1 */
    /* synthetic */ class C327231 extends FunctionReferenceImpl implements Function1<Lock, Unit> {
        public static final C327231 INSTANCE = new C327231();

        C327231() {
            super(1, Lock.class, "lockInterruptibly", "lockInterruptibly()V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Lock lock) throws InterruptedException {
            invoke2(lock);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Lock p0) throws InterruptedException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.lockInterruptibly();
        }
    }

    @Override // com.robinhood.concurrent.KeyedLock
    public void lockInterruptibly(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.referenceManager.acquire(key, C327231.INSTANCE);
    }

    /* compiled from: KeyedLock.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.concurrent.RealKeyedLock$unlock$1 */
    /* synthetic */ class C327241 extends FunctionReferenceImpl implements Function1<Lock, Unit> {
        public static final C327241 INSTANCE = new C327241();

        C327241() {
            super(1, Lock.class, "unlock", "unlock()V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Lock lock) {
            invoke2(lock);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Lock p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            p0.unlock();
        }
    }

    @Override // com.robinhood.concurrent.KeyedLock
    public void unlock(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.referenceManager.release(key, C327241.INSTANCE);
    }

    public final Set<K> getKeys$lib_concurrent() {
        return this.referenceManager.getKeys();
    }
}
