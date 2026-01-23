package kotlin.time;

import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;

/* compiled from: Duration.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0014\u001a\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0014¨\u0006!"}, m3636d2 = {"", "Lkotlin/time/DurationUnit;", Instrument.TYPE_UNIT, "Lkotlin/time/Duration;", "toDuration", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "", "value", "", "strictIso", "parseDuration", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "(Ljava/lang/String;)J", "nanos", "nanosToMillis", "(J)J", "millis", "millisToNanos", "normalNanos", "durationOfNanos", "normalMillis", "durationOfMillis", "normalValue", "unitDiscriminator", "durationOf", "(JI)J", "durationOfNanosNormalized", "durationOfMillisNormalized", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlin.time.DurationKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class Duration3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
    }

    @SinceKotlin
    @WasExperimental
    public static final long toDuration(int i, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnitJvm.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitJvm2.convertDurationUnitOverflow(i, unit, DurationUnitJvm.NANOSECONDS));
        }
        return toDuration(i, unit);
    }

    @SinceKotlin
    @WasExperimental
    public static final long toDuration(long j, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.NANOSECONDS;
        long jConvertDurationUnitOverflow = DurationUnitJvm2.convertDurationUnitOverflow(4611686018426999999L, durationUnitJvm, unit);
        if ((-jConvertDurationUnitOverflow) <= j && j <= jConvertDurationUnitOverflow) {
            return durationOfNanos(DurationUnitJvm2.convertDurationUnitOverflow(j, unit, durationUnitJvm));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitJvm2.convertDurationUnit(j, unit, DurationUnitJvm.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    @SinceKotlin
    @WasExperimental
    public static final long toDuration(double d, DurationUnitJvm unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitJvm2.convertDurationUnit(d, unit, DurationUnitJvm.NANOSECONDS);
        if (Double.isNaN(dConvertDurationUnit)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jRoundToLong = MathKt.roundToLong(dConvertDurationUnit);
        if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
            return durationOfNanos(jRoundToLong);
        }
        return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitJvm2.convertDurationUnit(d, unit, DurationUnitJvm.MILLISECONDS)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        boolean z2;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.INSTANCE;
        long jM28767getZEROUwyO8pc = companion.m28767getZEROUwyO8pc();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z3 = length2 > 0;
        boolean z4 = z3 && StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c2 = '0';
        if (str.charAt(length2) == 'P') {
            int i3 = length2 + 1;
            if (i3 == length) {
                throw new IllegalArgumentException();
            }
            boolean z5 = false;
            DurationUnitJvm durationUnitJvm = null;
            while (i3 < length) {
                if (str.charAt(i3) != 'T') {
                    int i4 = i3;
                    while (true) {
                        if (i4 >= str.length()) {
                            i2 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i4);
                        if (c2 > cCharAt4 || cCharAt4 >= c) {
                            i2 = length;
                            if (!StringsKt.contains$default((CharSequence) "+-.", cCharAt4, false, 2, (Object) null)) {
                                break;
                            }
                        } else {
                            i2 = length;
                        }
                        i4++;
                        length = i2;
                        c2 = '0';
                        c = ':';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i3, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i3 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i3 = length3 + 1;
                    DurationUnitJvm durationUnitJvmDurationUnitByIsoChar = DurationUnit2.durationUnitByIsoChar(cCharAt5, z5);
                    if (durationUnitJvm != null && durationUnitJvm.compareTo(durationUnitJvmDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
                    if (durationUnitJvmDurationUnitByIsoChar != DurationUnitJvm.SECONDS || iIndexOf$default <= 0) {
                        z2 = z5;
                        jM28767getZEROUwyO8pc = Duration.m28755plusLRDsOJo(jM28767getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitJvmDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        z2 = z5;
                        long jM28755plusLRDsOJo = Duration.m28755plusLRDsOJo(jM28767getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitJvmDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM28767getZEROUwyO8pc = Duration.m28755plusLRDsOJo(jM28755plusLRDsOJo, toDuration(Double.parseDouble(strSubstring3), durationUnitJvmDurationUnitByIsoChar));
                    }
                    z5 = z2;
                    durationUnitJvm = durationUnitJvmDurationUnitByIsoChar;
                    length = i2;
                    c2 = '0';
                    c = ':';
                } else {
                    if (z5 || (i3 = i3 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z5 = true;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            char c3 = '0';
            if (StringsKt.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM28767getZEROUwyO8pc = companion.m28765getINFINITEUwyO8pc();
            } else {
                boolean z6 = !z3;
                if (z3 && str.charAt(length2) == '(' && StringsKt.last(str) == ')') {
                    length2++;
                    int i5 = length - 1;
                    if (length2 == i5) {
                        throw new IllegalArgumentException("No components");
                    }
                    i = i5;
                    z6 = true;
                } else {
                    i = length;
                }
                boolean z7 = false;
                DurationUnitJvm durationUnitJvm2 = null;
                while (length2 < i) {
                    if (z7 && z6) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i6 = length2;
                    while (i6 < str.length() && ((c3 <= (cCharAt2 = str.charAt(i6)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i6++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i6);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i7 = length4;
                    while (i7 < str.length() && 'a' <= (cCharAt = str.charAt(i7)) && cCharAt < '{') {
                        i7++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnitJvm durationUnitJvmDurationUnitByShortName = DurationUnit2.durationUnitByShortName(strSubstring5);
                    if (durationUnitJvm2 != null && durationUnitJvm2.compareTo(durationUnitJvmDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strSubstring4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM28755plusLRDsOJo2 = Duration.m28755plusLRDsOJo(jM28767getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring6), durationUnitJvmDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM28767getZEROUwyO8pc = Duration.m28755plusLRDsOJo(jM28755plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring7), durationUnitJvmDurationUnitByShortName));
                        if (length2 < i) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM28767getZEROUwyO8pc = Duration.m28755plusLRDsOJo(jM28767getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring4), durationUnitJvmDurationUnitByShortName));
                    }
                    durationUnitJvm2 = durationUnitJvmDurationUnitByShortName;
                    z7 = true;
                    c3 = '0';
                }
            }
        }
        return z4 ? Duration.m28762unaryMinusUwyO8pc(jM28767getZEROUwyO8pc) : jM28767getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(StringsKt.drop(str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.m28728constructorimpl(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.m28728constructorimpl((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.m28728constructorimpl((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return durationOfNanos(j);
        }
        return durationOfMillis(nanosToMillis(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return durationOfNanos(millisToNanos(j));
        }
        return durationOfMillis(RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L));
    }
}
