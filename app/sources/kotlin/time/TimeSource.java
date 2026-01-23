package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource2;

/* compiled from: TimeSource.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlin/time/TimeSource;", "", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@WasExperimental
/* loaded from: classes14.dex */
public interface TimeSource {

    /* compiled from: TimeSource.kt */
    @SinceKotlin
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @WasExperimental
    public interface WithComparableMarks extends TimeSource {
    }

    /* compiled from: TimeSource.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        private Monotonic() {
        }

        /* renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m28773markNowz9LOYto() {
            return MonoTimeSource2.INSTANCE.m28772markNowz9LOYto();
        }

        public String toString() {
            return MonoTimeSource2.INSTANCE.toString();
        }

        /* compiled from: TimeSource.kt */
        @SinceKotlin
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u001b"}, m3636d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "constructor-impl", "(J)J", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "elapsedNow", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus", "minus-6eNON_k", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "J", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @JvmInline
        @WasExperimental
        public static final class ValueTimeMark implements TimeSource2 {
            private final long reading;

            /* renamed from: constructor-impl, reason: not valid java name */
            public static long m28774constructorimpl(long j) {
                return j;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m28776equalsimpl(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).getReading();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m28777hashCodeimpl(long j) {
                return Long.hashCode(j);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m28780toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            public boolean equals(Object other) {
                return m28776equalsimpl(this.reading, other);
            }

            public int hashCode() {
                return m28777hashCodeimpl(this.reading);
            }

            public String toString() {
                return m28780toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            @Override // java.lang.Comparable
            public int compareTo(TimeSource2 timeSource2) {
                return TimeSource2.DefaultImpls.compareTo(this, timeSource2);
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m28775elapsedNowUwyO8pc(long j) {
                return MonoTimeSource2.INSTANCE.m28771elapsedFrom6eNON_k(j);
            }

            @Override // kotlin.time.TimeSource2
            /* renamed from: minus-UwyO8pc */
            public long mo28723minusUwyO8pc(TimeSource2 other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m28779minusUwyO8pc(this.reading, other);
            }

            /* renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m28779minusUwyO8pc(long j, TimeSource2 other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (!(other instanceof ValueTimeMark)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m28780toStringimpl(j)) + " and " + other);
                }
                return m28778minus6eNON_k(j, ((ValueTimeMark) other).getReading());
            }

            /* renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m28778minus6eNON_k(long j, long j2) {
                return MonoTimeSource2.INSTANCE.m28770differenceBetweenfRLX17w(j, j2);
            }
        }
    }

    /* compiled from: TimeSource.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lkotlin/time/TimeSource$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
