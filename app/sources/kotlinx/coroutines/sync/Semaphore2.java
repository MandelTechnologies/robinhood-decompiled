package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C2031xc40028dd;
import io.ktor.utils.p478io.pool.DefaultPool$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuation2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedList;
import kotlinx.coroutines.internal.ConcurrentLinkedList3;
import kotlinx.coroutines.internal.ConcurrentLinkedList4;
import kotlinx.coroutines.selects.SelectInstance;

/* compiled from: Semaphore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u0018\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u0018\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR,\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u0011\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004R\u000b\u0010(\u001a\u00020'8\u0002X\u0082\u0004R\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004R\u000b\u0010*\u001a\u00020'8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004¨\u0006-"}, m3636d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquireSlowPath", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decPermits", "()I", "coerceAvailablePermitsAtMaximum", "()V", "Lkotlinx/coroutines/Waiter;", "waiter", "", "addAcquireToQueue", "(Lkotlinx/coroutines/Waiter;)Z", "tryResumeNextFromQueue", "()Z", "tryResumeAcquire", "(Ljava/lang/Object;)Z", "tryAcquire", "acquire", "Lkotlinx/coroutines/CancellableContinuation;", "(Lkotlinx/coroutines/CancellableContinuation;)V", "release", "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "onCancellationRelease", "Lkotlin/jvm/functions/Function3;", "getAvailablePermits", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.sync.SemaphoreAndMutexImpl, reason: use source file name */
/* loaded from: classes23.dex */
public class Semaphore2 {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final Function3<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Semaphore2.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(Semaphore2.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(Semaphore2.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(Semaphore2.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Semaphore2.class, "_availablePermits$volatile");

    public Semaphore2(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        Semaphore7 semaphore7 = new Semaphore7(0L, null, 2);
        this.head$volatile = semaphore7;
        this.tail$volatile = semaphore7;
        this._availablePermits$volatile = i - i2;
        this.onCancellationRelease = new Function3() { // from class: kotlinx.coroutines.sync.SemaphoreAndMutexImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Semaphore2.onCancellationRelease$lambda$2(this.f$0, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    public final int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancellationRelease$lambda$2(Semaphore2 semaphore2, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        semaphore2.release();
        return Unit.INSTANCE;
    }

    public final boolean tryAcquire() {
        while (true) {
            int i = _availablePermits$volatile$FU.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final Object acquire(Continuation<? super Unit> continuation) {
        if (decPermits() > 0) {
            return Unit.INSTANCE;
        }
        Object objAcquireSlowPath = acquireSlowPath(continuation);
        return objAcquireSlowPath == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquireSlowPath : Unit.INSTANCE;
    }

    protected final void acquire(CancellableContinuation<? super Unit> waiter) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) waiter)) {
                return;
            }
        }
        waiter.resume((CancellableContinuation<? super Unit>) Unit.INSTANCE, this.onCancellationRelease);
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = _availablePermits$volatile$FU.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i, this.permits));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        Semaphore7 semaphore7 = (Semaphore7) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        Semaphore3 semaphore3 = Semaphore3.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        long j = andIncrement / Semaphore6.SEGMENT_SIZE;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedList.findSegmentInternal(semaphore7, j, semaphore3);
            if (!ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
                ConcurrentLinkedList3 concurrentLinkedList3M28837getSegmentimpl = ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    ConcurrentLinkedList3 concurrentLinkedList3 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater.get(this);
                    if (concurrentLinkedList3.id >= concurrentLinkedList3M28837getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!concurrentLinkedList3M28837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, concurrentLinkedList3, concurrentLinkedList3M28837getSegmentimpl)) {
                        if (concurrentLinkedList3.decPointers$kotlinx_coroutines_core()) {
                            concurrentLinkedList3.remove();
                        }
                    } else if (concurrentLinkedList3M28837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        concurrentLinkedList3M28837getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        Semaphore7 semaphore72 = (Semaphore7) ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % Semaphore6.SEGMENT_SIZE);
        if (!DefaultPool$$ExternalSyntheticBackportWithForwarding0.m3340m(semaphore72.getAcquirers(), i, null, waiter)) {
            if (!DefaultPool$$ExternalSyntheticBackportWithForwarding0.m3340m(semaphore72.getAcquirers(), i, Semaphore6.PERMIT, Semaphore6.TAKEN)) {
                return false;
            }
            if (waiter instanceof CancellableContinuation) {
                Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((CancellableContinuation) waiter).resume((CancellableContinuation) Unit.INSTANCE, (Function3<? super Throwable, ? super CancellableContinuation, ? super CoroutineContext, Unit>) this.onCancellationRelease);
            } else if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).selectInRegistrationPhase(Unit.INSTANCE);
            } else {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            return true;
        }
        waiter.invokeOnCancellation(semaphore72, i);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        Semaphore7 semaphore7 = (Semaphore7) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j = andIncrement / Semaphore6.SEGMENT_SIZE;
        Semaphore4 semaphore4 = Semaphore4.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedList.findSegmentInternal(semaphore7, j, semaphore4);
            if (ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            ConcurrentLinkedList3 concurrentLinkedList3M28837getSegmentimpl = ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
            while (true) {
                ConcurrentLinkedList3 concurrentLinkedList3 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater.get(this);
                if (concurrentLinkedList3.id >= concurrentLinkedList3M28837getSegmentimpl.id) {
                    break loop0;
                }
                if (!concurrentLinkedList3M28837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, concurrentLinkedList3, concurrentLinkedList3M28837getSegmentimpl)) {
                    if (concurrentLinkedList3.decPointers$kotlinx_coroutines_core()) {
                        concurrentLinkedList3.remove();
                    }
                } else if (concurrentLinkedList3M28837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    concurrentLinkedList3M28837getSegmentimpl.remove();
                }
            }
        }
        Semaphore7 semaphore72 = (Semaphore7) ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
        semaphore72.cleanPrev();
        if (semaphore72.id > j) {
            return false;
        }
        int i = (int) (andIncrement % Semaphore6.SEGMENT_SIZE);
        Object andSet = semaphore72.getAcquirers().getAndSet(i, Semaphore6.PERMIT);
        if (andSet == null) {
            int i2 = Semaphore6.MAX_SPIN_CYCLES;
            for (int i3 = 0; i3 < i2; i3++) {
                if (semaphore72.getAcquirers().get(i) == Semaphore6.TAKEN) {
                    return true;
                }
            }
            return !DefaultPool$$ExternalSyntheticBackportWithForwarding0.m3340m(semaphore72.getAcquirers(), i, Semaphore6.PERMIT, Semaphore6.BROKEN);
        }
        if (andSet == Semaphore6.CANCELLED) {
            return false;
        }
        return tryResumeAcquire(andSet);
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
            if (objTryResume == null) {
                return false;
            }
            cancellableContinuation.completeResume(objTryResume);
            return true;
        }
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, Unit.INSTANCE);
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    private final Object acquireSlowPath(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuation2.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super Unit>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
