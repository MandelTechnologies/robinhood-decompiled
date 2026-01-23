package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\n\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\fH\u0086\u0004¢\u0006\u0004\b\n\u0010\u000e\u001a)\u0010\u0012\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0014\u001a\u0019\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u0019\u0010\u0012\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0016¢\u0006\u0004\b\u0012\u0010\u0017\u001a\u0019\u0010\u0012\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b\u0012\u0010\u0019\u001a)\u0010\u001b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a\u0019\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0014\u001a\u0019\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0015\u001a\u0019\u0010\u001b\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0017\u001a\u0019\u0010\u001b\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u0019\u001a5\u0010\u001c\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001e\u001a!\u0010\u001c\u001a\u00020\f*\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001f\u001a!\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010 \u001a!\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010!\u001a1\u0010\u001c\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b\u001c\u0010$\u001a\u001f\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000%¢\u0006\u0004\b\u001c\u0010&\u001a\u001f\u0010\u001c\u001a\u00020\f*\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b\u001c\u0010'¨\u0006("}, m3636d2 = {"", "to", "Lkotlin/ranges/IntProgression;", "downTo", "(II)Lkotlin/ranges/IntProgression;", "reversed", "(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;", "step", "(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/IntRange;", "until", "(II)Lkotlin/ranges/IntRange;", "", "Lkotlin/ranges/LongRange;", "(IJ)Lkotlin/ranges/LongRange;", "", "T", "minimumValue", "coerceAtLeast", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(II)I", "(JJ)J", "", "(FF)F", "", "(DD)D", "maximumValue", "coerceAtMost", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(III)I", "(JJJ)J", "(FFF)F", "(DDD)D", "Lkotlin/ranges/ClosedFloatingPointRange;", "range", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(ILkotlin/ranges/ClosedRange;)I", "(JLkotlin/ranges/ClosedRange;)J", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension
/* renamed from: kotlin.ranges.RangesKt___RangesKt, reason: use source file name */
/* loaded from: classes21.dex */
public class _Ranges extends Ranges6 {
    public static double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static Progressions2 downTo(int i, int i2) {
        return Progressions2.INSTANCE.fromClosedRange(i, i2, -1);
    }

    public static Progressions2 reversed(Progressions2 progressions2) {
        Intrinsics.checkNotNullParameter(progressions2, "<this>");
        return Progressions2.INSTANCE.fromClosedRange(progressions2.getLast(), progressions2.getFirst(), -progressions2.getStep());
    }

    public static Progressions2 step(Progressions2 progressions2, int i) {
        Intrinsics.checkNotNullParameter(progressions2, "<this>");
        Ranges6.checkStepIsPositive(i > 0, Integer.valueOf(i));
        Progressions2.Companion companion = Progressions2.INSTANCE;
        int first = progressions2.getFirst();
        int last = progressions2.getLast();
        if (progressions2.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static PrimitiveRanges2 until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return PrimitiveRanges2.INSTANCE.getEMPTY();
        }
        return new PrimitiveRanges2(i, i2 - 1);
    }

    public static PrimitiveRanges3 until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return PrimitiveRanges3.INSTANCE.getEMPTY();
        }
        return new PrimitiveRanges3(i, j - 1);
    }

    public static <T extends Comparable<? super T>> T coerceAtLeast(T t, T minimumValue) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t.compareTo(minimumValue) < 0 ? minimumValue : t;
    }

    public static <T extends Comparable<? super T>> T coerceAtMost(T t, T maximumValue) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t.compareTo(maximumValue) > 0 ? maximumValue : t;
    }

    public static <T extends Comparable<? super T>> T coerceIn(T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            }
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        } else {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    public static int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T coerceIn(T t, Ranges3<T> range) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t, range.getStart()) || range.lessThanOrEquals(range.getStart(), t)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t) || range.lessThanOrEquals(t, range.getEndInclusive())) ? t : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static int coerceIn(int i, Range2<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof Ranges3) {
            return ((Number) coerceIn(Integer.valueOf(i), (Ranges3<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long coerceIn(long j, Range2<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof Ranges3) {
            return ((Number) coerceIn(Long.valueOf(j), (Ranges3<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j < ((Number) range.getStart()).longValue() ? ((Number) range.getStart()).longValue() : j > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
