package kotlin.time;

import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.Instrument;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges3;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: Duration.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b)\b\u0087@\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b \u0010$J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020#H\u0086\u0002¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u000fJ\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b+\u0010\u000fJ\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b-\u0010\u000fJ\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\u000fJ\u0018\u00103\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b1\u00102J\u0015\u00108\u001a\u00020#2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u0010;\u001a\u00020\u00022\u0006\u00105\u001a\u000204¢\u0006\u0004\b9\u0010:J\u000f\u0010?\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J?\u0010I\u001a\u00020F*\u00060@j\u0002`A2\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u0006\u00105\u001a\u00020<2\u0006\u0010E\u001a\u00020\u000bH\u0002¢\u0006\u0004\bG\u0010HJ\r\u0010K\u001a\u00020<¢\u0006\u0004\bJ\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010N\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0005R\u0014\u0010Q\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010S\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\bR\u0010\u0005R\u001a\u0010X\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bZ\u0010W\u001a\u0004\bY\u0010UR\u001a\u0010^\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b]\u0010W\u001a\u0004\b\\\u0010UR\u001a\u0010a\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b`\u0010W\u001a\u0004\b_\u0010UR\u0011\u0010c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bb\u0010\u0005R\u0011\u0010e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bd\u0010\u0005R\u0011\u0010g\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bf\u0010\u0005R\u0011\u0010i\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bh\u0010\u0005R\u0011\u0010k\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bj\u0010\u0005R\u0011\u0010m\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bl\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006o"}, m3636d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "constructor-impl", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "isInNanos-impl", "(J)Z", "isInNanos", "isInMillis-impl", "isInMillis", "unaryMinus-UwyO8pc", "unaryMinus", "plus-LRDsOJo", "(JJ)J", "plus", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "addValuesMixedRanges", "minus-LRDsOJo", "minus", "scale", "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "isNegative-impl", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", "Lkotlin/time/DurationUnit;", Instrument.TYPE_UNIT, "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLong", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "appendFractional", "toIsoString-impl", "toIsoString", "J", "getValue-impl", "value", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "Companion", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmInline
@WasExperimental
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m28728constructorimpl(0);
    private static final long INFINITE = Duration3.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = Duration3.durationOfMillis(-4611686018427387903L);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m28726boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28732equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28733equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m28746getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28747hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m28749isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m28750isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m28752isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m28753isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(Object other) {
        return m28732equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m28747hashCodeimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m28763compareToLRDsOJo(duration.getRawValue());
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnitJvm m28745getStorageUnitimpl(long j) {
        return m28750isInNanosimpl(j) ? DurationUnitJvm.NANOSECONDS : DurationUnitJvm.MILLISECONDS;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m28728constructorimpl(long j) {
        if (!DurationJvm.getDurationAssertionsEnabled()) {
            return j;
        }
        if (m28750isInNanosimpl(j)) {
            long jM28746getValueimpl = m28746getValueimpl(j);
            if (-4611686018426999999L <= jM28746getValueimpl && jM28746getValueimpl < 4611686018427000000L) {
                return j;
            }
            throw new AssertionError(m28746getValueimpl(j) + " ns is out of nanoseconds range");
        }
        long jM28746getValueimpl2 = m28746getValueimpl(j);
        if (-4611686018427387903L > jM28746getValueimpl2 || jM28746getValueimpl2 >= 4611686018427387904L) {
            throw new AssertionError(m28746getValueimpl(j) + " ms is out of milliseconds range");
        }
        long jM28746getValueimpl3 = m28746getValueimpl(j);
        if (-4611686018426L > jM28746getValueimpl3 || jM28746getValueimpl3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(m28746getValueimpl(j) + " ms is denormalized");
    }

    /* compiled from: Duration.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "convert", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "Lkotlin/time/Duration;", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "ZERO", "J", "getZERO-UwyO8pc", "()J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m28767getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m28765getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m28766getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnitJvm sourceUnit, DurationUnitJvm targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitJvm2.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m28768parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration3.parseDuration(value, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m28769parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration3.parseDuration(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m28762unaryMinusUwyO8pc(long j) {
        return Duration3.durationOf(-m28746getValueimpl(j), ((int) j) & 1);
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m28755plusLRDsOJo(long j, long j2) {
        if (m28751isInfiniteimpl(j)) {
            if (m28748isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m28751isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long jM28746getValueimpl = m28746getValueimpl(j) + m28746getValueimpl(j2);
            return m28750isInNanosimpl(j) ? Duration3.durationOfNanosNormalized(jM28746getValueimpl) : Duration3.durationOfMillisNormalized(jM28746getValueimpl);
        }
        if (m28749isInMillisimpl(j)) {
            return m28724addValuesMixedRangesUwyO8pc(j, m28746getValueimpl(j), m28746getValueimpl(j2));
        }
        return m28724addValuesMixedRangesUwyO8pc(j, m28746getValueimpl(j2), m28746getValueimpl(j));
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m28724addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long jNanosToMillis = Duration3.nanosToMillis(j3);
        long j4 = j2 + jNanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return Duration3.durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return Duration3.durationOfNanos(Duration3.millisToNanos(j4) + (j3 - Duration3.millisToNanos(jNanosToMillis)));
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m28754minusLRDsOJo(long j, long j2) {
        return m28755plusLRDsOJo(j, m28762unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m28757timesUwyO8pc(long j, int i) {
        if (m28751isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m28762unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long jM28746getValueimpl = m28746getValueimpl(j);
        long j2 = i;
        long j3 = jM28746getValueimpl * j2;
        if (!m28750isInNanosimpl(j)) {
            if (j3 / j2 == jM28746getValueimpl) {
                return Duration3.durationOfMillis(RangesKt.coerceIn(j3, new PrimitiveRanges3(-4611686018427387903L, 4611686018427387903L)));
            }
            return MathKt.getSign(jM28746getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM28746getValueimpl && jM28746getValueimpl < 2147483648L) {
            return Duration3.durationOfNanos(j3);
        }
        if (j3 / j2 == jM28746getValueimpl) {
            return Duration3.durationOfNanosNormalized(j3);
        }
        long jNanosToMillis = Duration3.nanosToMillis(jM28746getValueimpl);
        long j4 = jNanosToMillis * j2;
        long jNanosToMillis2 = Duration3.nanosToMillis((jM28746getValueimpl - Duration3.millisToNanos(jNanosToMillis)) * j2) + j4;
        if (j4 / j2 != jNanosToMillis || (jNanosToMillis2 ^ j4) < 0) {
            return MathKt.getSign(jM28746getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        return Duration3.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new PrimitiveRanges3(-4611686018427387903L, 4611686018427387903L)));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m28756timesUwyO8pc(long j, double d) {
        int iRoundToInt = MathKt.roundToInt(d);
        if (iRoundToInt == d) {
            return m28757timesUwyO8pc(j, iRoundToInt);
        }
        DurationUnitJvm durationUnitJvmM28745getStorageUnitimpl = m28745getStorageUnitimpl(j);
        return Duration3.toDuration(m28758toDoubleimpl(j, durationUnitJvmM28745getStorageUnitimpl) * d, durationUnitJvmM28745getStorageUnitimpl);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m28731divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m28753isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m28752isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m28750isInNanosimpl(j)) {
            return Duration3.durationOfNanos(m28746getValueimpl(j) / i);
        }
        if (m28751isInfiniteimpl(j)) {
            return m28757timesUwyO8pc(j, MathKt.getSign(i));
        }
        long j2 = i;
        long jM28746getValueimpl = m28746getValueimpl(j) / j2;
        if (-4611686018426L > jM28746getValueimpl || jM28746getValueimpl >= 4611686018427L) {
            return Duration3.durationOfMillis(jM28746getValueimpl);
        }
        return Duration3.durationOfNanos(Duration3.millisToNanos(jM28746getValueimpl) + (Duration3.millisToNanos(m28746getValueimpl(j) - (jM28746getValueimpl * j2)) / j2));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m28730divUwyO8pc(long j, double d) {
        int iRoundToInt = MathKt.roundToInt(d);
        if (iRoundToInt == d && iRoundToInt != 0) {
            return m28731divUwyO8pc(j, iRoundToInt);
        }
        DurationUnitJvm durationUnitJvmM28745getStorageUnitimpl = m28745getStorageUnitimpl(j);
        return Duration3.toDuration(m28758toDoubleimpl(j, durationUnitJvmM28745getStorageUnitimpl) / d, durationUnitJvmM28745getStorageUnitimpl);
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m28729divLRDsOJo(long j, long j2) {
        DurationUnitJvm durationUnitJvm = (DurationUnitJvm) ComparisonsKt.maxOf(m28745getStorageUnitimpl(j), m28745getStorageUnitimpl(j2));
        return m28758toDoubleimpl(j, durationUnitJvm) / m28758toDoubleimpl(j2, durationUnitJvm);
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m28751isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m28748isFiniteimpl(long j) {
        return !m28751isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m28734getAbsoluteValueUwyO8pc(long j) {
        return m28752isNegativeimpl(j) ? m28762unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m28763compareToLRDsOJo(long j) {
        return m28727compareToLRDsOJo(this.rawValue, j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m28727compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m28752isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m28735getHoursComponentimpl(long j) {
        if (m28751isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28737getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m28742getMinutesComponentimpl(long j) {
        if (m28751isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28739getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m28744getSecondsComponentimpl(long j) {
        if (m28751isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m28741getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m28743getNanosecondsComponentimpl(long j) {
        long jM28746getValueimpl;
        if (m28751isInfiniteimpl(j)) {
            return 0;
        }
        if (m28749isInMillisimpl(j)) {
            jM28746getValueimpl = Duration3.millisToNanos(m28746getValueimpl(j) % 1000);
        } else {
            jM28746getValueimpl = m28746getValueimpl(j) % 1000000000;
        }
        return (int) jM28746getValueimpl;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m28758toDoubleimpl(long j, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitJvm2.convertDurationUnit(m28746getValueimpl(j), m28745getStorageUnitimpl(j), unit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m28760toLongimpl(long j, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitJvm2.convertDurationUnit(m28746getValueimpl(j), m28745getStorageUnitimpl(j), unit);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m28736getInWholeDaysimpl(long j) {
        return m28760toLongimpl(j, DurationUnitJvm.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m28737getInWholeHoursimpl(long j) {
        return m28760toLongimpl(j, DurationUnitJvm.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m28739getInWholeMinutesimpl(long j) {
        return m28760toLongimpl(j, DurationUnitJvm.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m28741getInWholeSecondsimpl(long j) {
        return m28760toLongimpl(j, DurationUnitJvm.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m28738getInWholeMillisecondsimpl(long j) {
        return (m28749isInMillisimpl(j) && m28748isFiniteimpl(j)) ? m28746getValueimpl(j) : m28760toLongimpl(j, DurationUnitJvm.MILLISECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m28740getInWholeNanosecondsimpl(long j) {
        long jM28746getValueimpl = m28746getValueimpl(j);
        if (m28750isInNanosimpl(j)) {
            return jM28746getValueimpl;
        }
        if (jM28746getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM28746getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return Duration3.millisToNanos(jM28746getValueimpl);
    }

    public String toString() {
        return m28761toStringimpl(this.rawValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28761toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM28752isNegativeimpl = m28752isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM28752isNegativeimpl) {
            sb.append('-');
        }
        long jM28734getAbsoluteValueUwyO8pc = m28734getAbsoluteValueUwyO8pc(j);
        long jM28736getInWholeDaysimpl = m28736getInWholeDaysimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28735getHoursComponentimpl = m28735getHoursComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28742getMinutesComponentimpl = m28742getMinutesComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28744getSecondsComponentimpl = m28744getSecondsComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28743getNanosecondsComponentimpl = m28743getNanosecondsComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM28736getInWholeDaysimpl != 0;
        boolean z2 = iM28735getHoursComponentimpl != 0;
        boolean z3 = iM28742getMinutesComponentimpl != 0;
        boolean z4 = (iM28744getSecondsComponentimpl == 0 && iM28743getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM28736getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM28735getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM28742getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM28744getSecondsComponentimpl != 0 || z || z2 || z3) {
                m28725appendFractionalimpl(j, sb, iM28744getSecondsComponentimpl, iM28743getNanosecondsComponentimpl, 9, Constants.RequestParamsKeys.SESSION_ID_KEY, false);
            } else if (iM28743getNanosecondsComponentimpl >= 1000000) {
                m28725appendFractionalimpl(j, sb, iM28743getNanosecondsComponentimpl / InvestFlowConstants.MAX_ONE_TIME_AMOUNT, iM28743getNanosecondsComponentimpl % InvestFlowConstants.MAX_ONE_TIME_AMOUNT, 6, "ms", false);
            } else if (iM28743getNanosecondsComponentimpl >= 1000) {
                m28725appendFractionalimpl(j, sb, iM28743getNanosecondsComponentimpl / 1000, iM28743getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM28743getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM28752isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m28725appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) strPadStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m28759toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m28752isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append(CountryCode.COUNTRY_CODE_PT);
        long jM28734getAbsoluteValueUwyO8pc = m28734getAbsoluteValueUwyO8pc(j);
        long jM28737getInWholeHoursimpl = m28737getInWholeHoursimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28742getMinutesComponentimpl = m28742getMinutesComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28744getSecondsComponentimpl = m28744getSecondsComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        int iM28743getNanosecondsComponentimpl = m28743getNanosecondsComponentimpl(jM28734getAbsoluteValueUwyO8pc);
        long j2 = m28751isInfiniteimpl(j) ? 9999999999999L : jM28737getInWholeHoursimpl;
        boolean z = false;
        boolean z2 = j2 != 0;
        boolean z3 = (iM28744getSecondsComponentimpl == 0 && iM28743getNanosecondsComponentimpl == 0) ? false : true;
        if (iM28742getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(iM28742getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m28725appendFractionalimpl(j, sb, iM28744getSecondsComponentimpl, iM28743getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb.toString();
    }
}
