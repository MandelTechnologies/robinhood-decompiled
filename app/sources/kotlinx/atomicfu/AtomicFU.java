package kotlinx.atomicfu;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.TraceBase;

/* compiled from: AtomicFU.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0007\u001a\u001f\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\n\u001a\u0015\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u001f\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u0015\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"T", "initial", "Lkotlinx/atomicfu/TraceBase;", "trace", "Lkotlinx/atomicfu/AtomicRef;", "atomic", "(Ljava/lang/Object;Lkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicRef;", "(Ljava/lang/Object;)Lkotlinx/atomicfu/AtomicRef;", "", "Lkotlinx/atomicfu/AtomicInt;", "(ILkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicInt;", "(I)Lkotlinx/atomicfu/AtomicInt;", "", "Lkotlinx/atomicfu/AtomicLong;", "(JLkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicLong;", "(J)Lkotlinx/atomicfu/AtomicLong;", "atomicfu"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes14.dex */
public final class AtomicFU {
    public static final <T> AtomicFU4<T> atomic(T t, TraceBase trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new AtomicFU4<>(t, trace);
    }

    public static final <T> AtomicFU4<T> atomic(T t) {
        return atomic(t, TraceBase.None.INSTANCE);
    }

    public static final AtomicFU2 atomic(int i, TraceBase trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new AtomicFU2(i, trace);
    }

    public static final AtomicFU2 atomic(int i) {
        return atomic(i, (TraceBase) TraceBase.None.INSTANCE);
    }

    public static final AtomicFU3 atomic(long j, TraceBase trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return new AtomicFU3(j, trace);
    }

    public static final AtomicFU3 atomic(long j) {
        return atomic(j, TraceBase.None.INSTANCE);
    }
}
