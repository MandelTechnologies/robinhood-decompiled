package com.mayakapps.rwmutex;

import com.mayakapps.rwmutex.ReadWriteMutex;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicFU2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.Semaphore6;

/* compiled from: ReadWriteMutex.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m3636d2 = {"Lcom/mayakapps/rwmutex/ReadWriteMutexImpl;", "Lcom/mayakapps/rwmutex/ReadWriteMutex;", "<init>", "()V", "writeOnlyMutex", "Lkotlinx/coroutines/sync/Mutex;", "writePermission", "readPermissions", "Lkotlinx/coroutines/sync/Semaphore;", "activeAccessors", "Lkotlinx/atomicfu/AtomicInt;", "departingReaders", "readMutex", "getReadMutex", "()Lkotlinx/coroutines/sync/Mutex;", "writeMutex", "getWriteMutex", "state", "Lcom/mayakapps/rwmutex/ReadWriteMutex$State;", "getState-4GAVRlY", "()I", "toString", "", "ReadMutex", "WriteMutex", "Companion", "rwmutex"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.mayakapps.rwmutex.ReadWriteMutexImpl, reason: use source file name */
/* loaded from: classes27.dex */
final class ReadWriteMutex3 implements ReadWriteMutex {
    private final Mutex writeOnlyMutex = Mutex3.Mutex$default(false, 1, null);
    private final Mutex writePermission = Mutex3.Mutex(true);
    private final Semaphore readPermissions = Semaphore6.Semaphore(1073741824, 1073741824);
    private final AtomicFU2 activeAccessors = AtomicFU.atomic(0);
    private final AtomicFU2 departingReaders = AtomicFU.atomic(0);
    private final Mutex readMutex = new ReadMutex();
    private final Mutex writeMutex = new WriteMutex();

    @Override // com.mayakapps.rwmutex.ReadWriteMutex
    public Mutex getReadMutex() {
        return this.readMutex;
    }

    @Override // com.mayakapps.rwmutex.ReadWriteMutex
    public Mutex getWriteMutex() {
        return this.writeMutex;
    }

    /* renamed from: getState-4GAVRlY, reason: not valid java name */
    public int m9462getState4GAVRlY() {
        return ReadWriteMutex.State.m9460constructorimpl(this.activeAccessors.getValue());
    }

    public String toString() {
        return "ReadWriteMutex[state=" + ((Object) ReadWriteMutex.State.m9461toStringimpl(m9462getState4GAVRlY())) + ']';
    }

    /* compiled from: ReadWriteMutex.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/mayakapps/rwmutex/ReadWriteMutexImpl$ReadMutex;", "Lcom/mayakapps/rwmutex/AbstractMutex;", "<init>", "(Lcom/mayakapps/rwmutex/ReadWriteMutexImpl;)V", "", "owner", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlock", "(Ljava/lang/Object;)V", "", "tryLock", "(Ljava/lang/Object;)Z", "isLocked", "()Z", "rwmutex"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.mayakapps.rwmutex.ReadWriteMutexImpl$ReadMutex */
    private final class ReadMutex extends ReadWriteMutex2 {
        public ReadMutex() {
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public boolean isLocked() {
            return ReadWriteMutex3.this.activeAccessors.getValue() > 0;
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public Object lock(Object obj, Continuation<? super Unit> continuation) {
            if (obj == null) {
                if (ReadWriteMutex3.this.activeAccessors.incrementAndGet() < 0) {
                    Object objAcquire = ReadWriteMutex3.this.readPermissions.acquire(continuation);
                    return objAcquire == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquire : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new UnsupportedOperationException();
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public void unlock(Object owner) {
            if (owner == null) {
                int iDecrementAndGet = ReadWriteMutex3.this.activeAccessors.decrementAndGet();
                int i = iDecrementAndGet + 1;
                if (i != 0 && i != -1073741824) {
                    if (iDecrementAndGet >= 0 || ReadWriteMutex3.this.departingReaders.decrementAndGet() != 0) {
                        return;
                    }
                    Mutex.DefaultImpls.unlock$default(ReadWriteMutex3.this.writePermission, null, 1, null);
                    return;
                }
                throw new IllegalStateException("This mutex is not locked");
            }
            throw new UnsupportedOperationException();
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public boolean tryLock(Object owner) {
            int value;
            if (owner == null) {
                do {
                    value = ReadWriteMutex3.this.activeAccessors.getValue();
                    if (value < 0) {
                        return false;
                    }
                } while (!ReadWriteMutex3.this.activeAccessors.compareAndSet(value, value + 1));
                return true;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReadWriteMutex.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/mayakapps/rwmutex/ReadWriteMutexImpl$WriteMutex;", "Lcom/mayakapps/rwmutex/AbstractMutex;", "<init>", "(Lcom/mayakapps/rwmutex/ReadWriteMutexImpl;)V", "", "owner", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlock", "(Ljava/lang/Object;)V", "", "tryLock", "(Ljava/lang/Object;)Z", "isLocked", "()Z", "rwmutex"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.mayakapps.rwmutex.ReadWriteMutexImpl$WriteMutex */
    final class WriteMutex extends ReadWriteMutex2 {
        public WriteMutex() {
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public boolean isLocked() {
            return ReadWriteMutex3.this.activeAccessors.getValue() < 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r6, null, r0, 1, null) == r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.sync.Mutex
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object lock(Object obj, Continuation<? super Unit> continuation) {
            ReadWriteMutex4 readWriteMutex4;
            WriteMutex writeMutex;
            if (continuation instanceof ReadWriteMutex4) {
                readWriteMutex4 = (ReadWriteMutex4) continuation;
                int i = readWriteMutex4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    readWriteMutex4.label = i - Integer.MIN_VALUE;
                } else {
                    readWriteMutex4 = new ReadWriteMutex4(this, continuation);
                }
            }
            Object obj2 = readWriteMutex4.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = readWriteMutex4.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                Mutex mutex = ReadWriteMutex3.this.writeOnlyMutex;
                readWriteMutex4.L$0 = this;
                readWriteMutex4.label = 1;
                if (mutex.lock(obj, readWriteMutex4) != coroutine_suspended) {
                    writeMutex = this;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            }
            writeMutex = (WriteMutex) readWriteMutex4.L$0;
            ResultKt.throwOnFailure(obj2);
            int andAdd = ReadWriteMutex3.this.activeAccessors.getAndAdd(-1073741824);
            if (andAdd == 0 || ReadWriteMutex3.this.departingReaders.addAndGet(andAdd) == 0) {
                return Unit.INSTANCE;
            }
            Mutex mutex2 = ReadWriteMutex3.this.writePermission;
            readWriteMutex4.L$0 = null;
            readWriteMutex4.label = 2;
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public void unlock(Object owner) {
            int iAddAndGet = ReadWriteMutex3.this.activeAccessors.addAndGet(1073741824);
            if (iAddAndGet >= 1073741824) {
                throw new IllegalStateException("This mutex is not locked");
            }
            ReadWriteMutex3 readWriteMutex3 = ReadWriteMutex3.this;
            for (int i = 0; i < iAddAndGet; i++) {
                readWriteMutex3.readPermissions.release();
            }
            ReadWriteMutex3.this.writeOnlyMutex.unlock(owner);
        }

        @Override // kotlinx.coroutines.sync.Mutex
        public boolean tryLock(Object owner) {
            if (!ReadWriteMutex3.this.writeOnlyMutex.tryLock(owner)) {
                return false;
            }
            if (ReadWriteMutex3.this.activeAccessors.compareAndSet(0, -1073741824)) {
                return true;
            }
            ReadWriteMutex3.this.writeOnlyMutex.unlock(owner);
            return false;
        }
    }
}
