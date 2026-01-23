package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.time.TimeSource;

/* compiled from: MonoTimeSource.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "", "read", "()J", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "markNow", "timeMark", "Lkotlin/time/Duration;", "elapsedFrom-6eNON_k", "(J)J", "elapsedFrom", "one", "another", "differenceBetween-fRLX17w", "(JJ)J", "differenceBetween", "zero", "J", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.time.MonotonicTimeSource, reason: use source file name */
/* loaded from: classes14.dex */
public final class MonoTimeSource2 implements TimeSource.WithComparableMarks {
    public static final MonoTimeSource2 INSTANCE = new MonoTimeSource2();
    private static final long zero = System.nanoTime();

    private MonoTimeSource2() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m28772markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m28774constructorimpl(read());
    }

    /* renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m28771elapsedFrom6eNON_k(long timeMark) {
        return longSaturatedMath.saturatingDiff(read(), timeMark, DurationUnitJvm.NANOSECONDS);
    }

    /* renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m28770differenceBetweenfRLX17w(long one, long another) {
        return longSaturatedMath.saturatingOriginsDiff(one, another, DurationUnitJvm.NANOSECONDS);
    }
}
