package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: locks.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, reason: use source file name */
/* loaded from: classes21.dex */
public class locks2 implements locks4 {
    private final Lock lock;

    /* JADX WARN: Multi-variable type inference failed */
    public locks2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public locks2(Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
    }

    public /* synthetic */ locks2(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }

    protected final Lock getLock() {
        return this.lock;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.locks4
    public void lock() {
        this.lock.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.locks4
    public void unlock() {
        this.lock.unlock();
    }
}
