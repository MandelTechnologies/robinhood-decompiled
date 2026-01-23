package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Semaphore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1, reason: use source file name */
/* loaded from: classes23.dex */
/* synthetic */ class Semaphore3 extends FunctionReferenceImpl implements Function2<Long, Semaphore7, Semaphore7> {
    public static final Semaphore3 INSTANCE = new Semaphore3();

    Semaphore3() {
        super(2, Semaphore6.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Semaphore7 invoke(Long l, Semaphore7 semaphore7) {
        return invoke(l.longValue(), semaphore7);
    }

    public final Semaphore7 invoke(long j, Semaphore7 semaphore7) {
        return Semaphore6.createSegment(j, semaphore7);
    }
}
