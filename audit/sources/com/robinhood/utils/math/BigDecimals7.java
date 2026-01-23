package com.robinhood.utils.math;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\b\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\n\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\r\u001a\u00020\b*\u0004\u0018\u00010\u0003\u001a\f\u0010\u000e\u001a\u00020\b*\u0004\u0018\u00010\u0003\u001a\f\u0010\u000f\u001a\u00020\b*\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0010\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u001a \u0010\u0010\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a(\u0010\u0010\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\u0016\u0010\u0015\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0016\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0017\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0018\u001a\u00020\u0003*\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0019\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0001\u001a\f\u0010\u001b\u001a\u00020\u0003*\u0004\u0018\u00010\u0003\u001a \u0010\u001b\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\b\u001a\u001a\u0010\u001d\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0016\u0010\u001f\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010 \u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010!\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\"\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010#\u001a\u00020$*\u00020\u0003\u001a\n\u0010%\u001a\u00020$*\u00020\u0003\u001a\n\u0010&\u001a\u00020$*\u00020\u0003\u001a\f\u0010'\u001a\u0004\u0018\u00010\u0003*\u00020(\u001a\n\u0010)\u001a\u00020\u0003*\u00020(\u001a\u0012\u0010*\u001a\u00020\u0003*\u00020(2\u0006\u0010+\u001a\u00020\u0003\u001a\u0015\u0010,\u001a\u00020\u0003*\u00020\u00032\u0006\u0010-\u001a\u00020\u0001H\u0086\u0002\u001a\u0012\u0010.\u001a\u00020/*\u00020\u00032\u0006\u00100\u001a\u00020\u0003\u001a\n\u00101\u001a\u00020\b*\u00020\u0003\u001a\u001a\u00102\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010>\u001a\u00020?*\u00020\u0003\u001a\u001c\u0010>\u001a\u00020?*\u00020\u00032\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u000208H\u0002\u001a&\u0010B\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a\n\u0010D\u001a\u00020\u0003*\u00020E\u001a\u0012\u0010F\u001a\u00020\b*\u00020\u00032\u0006\u0010G\u001a\u00020\u0003\u001a\u0012\u0010H\u001a\u00020\u0003*\u00020\u00032\u0006\u0010G\u001a\u00020\u0003\u001a\u0012\u0010I\u001a\u00020\u0003*\u00020\u00032\u0006\u0010G\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010J\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006M"}, m3636d2 = {"DEFAULT_DIVISION_SCALE", "", "orZero", "Ljava/math/BigDecimal;", "min", "other", AnalyticsStrings.MAX_WELCOME_TAG, "eq", "", "gt", "gte", "lt", "lte", "isZero", "isNegative", "isPositive", "safeDivide", "denominator", "roundingMode", "Ljava/math/RoundingMode;", "scale", "safeMultiply", "safeAdd", "safeSubtract", "ceilToZero", "coerceScaleAtLeast", "newScale", "setCurrencyScale", "ignoreSign", "roundToInterval", "interval", "isRoundedToInterval", "toIntRounded", "toIntRoundUp", "toIntRoundDown", "toLongRounded", "", "toLongRoundUp", "toLongRoundDown", "toBigDecimalOrNull", "", "toBigDecimalOrZero", "toBigDecimalOrDefault", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "times", "value", "requireEquals", "", "actual", "isInteger", "assertBigDecimalEquals", "expected", "BILLIONS_DIGIT", "MILLIONS_DIGIT", "THOUSANDS_DIGIT", "BILLIONS_ABBREVIATION", "", "MILLIONS_ABBREVIATION", "THOUSANDS_ABBREVIATION", "BILLION_THRESHOLD_FOR_3_DIGITS", "MILLION_THRESHOLD_FOR_3_DIGITS", "THOUSAND_THRESHOLD_FOR_3_DIGITS", "truncateToThreeOrFewerDigits", "", "threshold", "charToAppend", "scaleWithNonzeroMinimum", "nonzeroMinimum", "toBigDecimal", "", "isMultipleOf", "divisor", "nextMultipleOf", "previousMultipleOf", "numberOfDecimalPlaces", "getNumberOfDecimalPlaces", "(Ljava/math/BigDecimal;)I", "lib-utils-math"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.math.BigDecimalsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BigDecimals7 {
    private static final char BILLIONS_ABBREVIATION = 'B';
    private static final int BILLIONS_DIGIT = 9;
    private static final int DEFAULT_DIVISION_SCALE = 4;
    private static final char MILLIONS_ABBREVIATION = 'M';
    private static final int MILLIONS_DIGIT = 6;
    private static final char THOUSANDS_ABBREVIATION = 'K';
    private static final int THOUSANDS_DIGIT = 3;
    private static final BigDecimal BILLION_THRESHOLD_FOR_3_DIGITS = new BigDecimal("999499999");
    private static final BigDecimal MILLION_THRESHOLD_FOR_3_DIGITS = new BigDecimal("999499");
    private static final BigDecimal THOUSAND_THRESHOLD_FOR_3_DIGITS = new BigDecimal("999");

    public static final BigDecimal orZero(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public static final BigDecimal min(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalOrZero = orZero(bigDecimal);
        BigDecimal bigDecimalOrZero2 = orZero(bigDecimal2);
        return bigDecimalOrZero.subtract(bigDecimalOrZero2).signum() == -1 ? bigDecimalOrZero : bigDecimalOrZero2;
    }

    public static final BigDecimal max(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalOrZero = orZero(bigDecimal);
        BigDecimal bigDecimalOrZero2 = orZero(bigDecimal2);
        return bigDecimalOrZero.subtract(bigDecimalOrZero2).signum() == 1 ? bigDecimalOrZero : bigDecimalOrZero2;
    }

    /* renamed from: eq */
    public static final boolean m2977eq(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return orZero(bigDecimal).compareTo(orZero(bigDecimal2)) == 0;
    }

    /* renamed from: gt */
    public static final boolean m2978gt(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return orZero(bigDecimal).compareTo(orZero(bigDecimal2)) > 0;
    }

    public static final boolean gte(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return orZero(bigDecimal).compareTo(orZero(bigDecimal2)) >= 0;
    }

    /* renamed from: lt */
    public static final boolean m2979lt(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return orZero(bigDecimal).compareTo(orZero(bigDecimal2)) < 0;
    }

    public static final boolean lte(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return orZero(bigDecimal).compareTo(orZero(bigDecimal2)) <= 0;
    }

    public static final boolean isZero(BigDecimal bigDecimal) {
        return orZero(bigDecimal).signum() == 0;
    }

    public static final boolean isNegative(BigDecimal bigDecimal) {
        return orZero(bigDecimal).signum() == -1;
    }

    public static final boolean isPositive(BigDecimal bigDecimal) {
        return orZero(bigDecimal).signum() == 1;
    }

    public static final BigDecimal safeDivide(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return safeDivide(bigDecimal, bigDecimal2, RoundingMode.HALF_UP);
    }

    public static /* synthetic */ BigDecimal safeDivide$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return safeDivide(bigDecimal, bigDecimal2, roundingMode);
    }

    public static final BigDecimal safeDivide(BigDecimal bigDecimal, BigDecimal bigDecimal2, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (bigDecimal == null || bigDecimal2 == null || isZero(bigDecimal2)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        return safeDivide(bigDecimal, bigDecimal2, Math.max(4, Math.max(bigDecimal.scale(), bigDecimal2.scale())), roundingMode);
    }

    public static /* synthetic */ BigDecimal safeDivide$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, RoundingMode roundingMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return safeDivide(bigDecimal, bigDecimal2, i, roundingMode);
    }

    public static final BigDecimal safeDivide(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (bigDecimal == null || bigDecimal2 == null || isZero(bigDecimal2)) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, i, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public static final BigDecimal safeMultiply(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalMultiply;
        String str;
        if (bigDecimal == null || bigDecimal2 == null) {
            bigDecimalMultiply = BigDecimal.ZERO;
            str = "ZERO";
        } else {
            bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
            str = "multiply(...)";
        }
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, str);
        return bigDecimalMultiply;
    }

    public static final BigDecimal safeAdd(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalAdd = orZero(bigDecimal).add(orZero(bigDecimal2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    public static final BigDecimal safeSubtract(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalSubtract = orZero(bigDecimal).subtract(orZero(bigDecimal2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static final BigDecimal ceilToZero(BigDecimal bigDecimal) {
        return max(bigDecimal, BigDecimal.ZERO);
    }

    public static final BigDecimal coerceScaleAtLeast(BigDecimal bigDecimal, int i) {
        BigDecimal bigDecimalOrZero = orZero(bigDecimal);
        if (bigDecimalOrZero.scale() >= i) {
            return bigDecimalOrZero;
        }
        BigDecimal scale = bigDecimalOrZero.setScale(i);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    public static final BigDecimal setCurrencyScale(BigDecimal bigDecimal) {
        return setCurrencyScale$default(bigDecimal, RoundingMode.HALF_UP, false, 2, null);
    }

    public static /* synthetic */ BigDecimal setCurrencyScale$default(BigDecimal bigDecimal, RoundingMode roundingMode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return setCurrencyScale(bigDecimal, roundingMode, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BigDecimal setCurrencyScale(BigDecimal bigDecimal, RoundingMode roundingMode, boolean z) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        int i = 2;
        if (z) {
            if (m2979lt(bigDecimal != null ? bigDecimal.abs() : null, BigDecimal.ONE)) {
                i = 4;
            }
        } else if (m2979lt(bigDecimal, BigDecimal.ONE)) {
        }
        BigDecimal scale = orZero(bigDecimal).setScale(i, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    public static final BigDecimal roundToInterval(BigDecimal bigDecimal, BigDecimal interval, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (isZero(bigDecimal) || isZero(interval)) {
            return bigDecimal;
        }
        BigDecimal bigDecimalMultiply = bigDecimal.divide(interval, 0, roundingMode).multiply(interval);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return isZero(bigDecimalMultiply) ? interval : bigDecimalMultiply;
    }

    public static final boolean isRoundedToInterval(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (isZero(bigDecimal2)) {
            return true;
        }
        return isZero(bigDecimal != null ? bigDecimal.remainder(bigDecimal2) : null);
    }

    public static final int toIntRounded(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(0, RoundingMode.HALF_UP).intValueExact();
    }

    public static final int toIntRoundUp(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(0, RoundingMode.CEILING).intValueExact();
    }

    public static final int toIntRoundDown(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(0, RoundingMode.FLOOR).intValueExact();
    }

    public static final long toLongRounded(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(0, RoundingMode.HALF_UP).longValueExact();
    }

    public static final long toLongRoundUp(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(0, RoundingMode.CEILING).longValueExact();
    }

    public static final long toLongRoundDown(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.setScale(0, RoundingMode.FLOOR).longValueExact();
    }

    public static final BigDecimal toBigDecimalOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt.toBigDecimalOrNull(charSequence.toString());
    }

    public static final BigDecimal toBigDecimalOrZero(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return toBigDecimalOrDefault(charSequence, ZERO);
    }

    public static final BigDecimal toBigDecimalOrDefault(CharSequence charSequence, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal, "default");
        BigDecimal bigDecimalOrNull = toBigDecimalOrNull(charSequence);
        return bigDecimalOrNull == null ? bigDecimal : bigDecimalOrNull;
    }

    public static final BigDecimal times(BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(i));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final void requireEquals(BigDecimal bigDecimal, BigDecimal actual) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(actual, "actual");
        if (m2977eq(bigDecimal, actual)) {
            return;
        }
        throw new IllegalStateException(("Expected " + bigDecimal + " but was " + actual).toString());
    }

    public static final boolean isInteger(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).scale() <= 0;
    }

    public static final void assertBigDecimalEquals(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == null && bigDecimal2 == null) {
            return;
        }
        if (bigDecimal == null || bigDecimal2 == null || bigDecimal.compareTo(bigDecimal2) != 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("expected: %s, actual: %s", Arrays.copyOf(new Object[]{bigDecimal, bigDecimal2}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            throw new AssertionError(str);
        }
    }

    public static final String truncateToThreeOrFewerDigits(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal.compareTo(BILLION_THRESHOLD_FOR_3_DIGITS) > 0) {
            return truncateToThreeOrFewerDigits(bigDecimal, 9, BILLIONS_ABBREVIATION);
        }
        if (bigDecimal.compareTo(MILLION_THRESHOLD_FOR_3_DIGITS) > 0) {
            return truncateToThreeOrFewerDigits(bigDecimal, 6, MILLIONS_ABBREVIATION);
        }
        if (bigDecimal.compareTo(THOUSAND_THRESHOLD_FOR_3_DIGITS) > 0) {
            return truncateToThreeOrFewerDigits(bigDecimal, 3, THOUSANDS_ABBREVIATION);
        }
        String string2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    private static final String truncateToThreeOrFewerDigits(BigDecimal bigDecimal, int i, char c) {
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal.movePointLeft(i).setScale(bigDecimal.precision() - i < 3 ? 1 : 0, RoundingMode.HALF_UP));
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimalM822m);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ BigDecimal scaleWithNonzeroMinimum$default(BigDecimal bigDecimal, int i, BigDecimal bigDecimal2, RoundingMode roundingMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bigDecimal2 = new BigDecimal(".01");
        }
        if ((i2 & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return scaleWithNonzeroMinimum(bigDecimal, i, bigDecimal2, roundingMode);
    }

    public static final BigDecimal scaleWithNonzeroMinimum(BigDecimal bigDecimal, int i, BigDecimal nonzeroMinimum, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(nonzeroMinimum, "nonzeroMinimum");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (!isPositive(nonzeroMinimum)) {
            throw new IllegalArgumentException("nonzeroMinimum should be positive.");
        }
        BigDecimal scale = bigDecimal.setScale(i, roundingMode);
        if (!isZero(bigDecimal) && isZero(scale)) {
            if (isPositive(bigDecimal)) {
                return nonzeroMinimum;
            }
            BigDecimal bigDecimalNegate = nonzeroMinimum.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            return bigDecimalNegate;
        }
        Intrinsics.checkNotNull(scale);
        return scale;
    }

    public static final BigDecimal toBigDecimal(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        if (number instanceof AtomicInteger) {
            return new BigDecimal(((AtomicInteger) number).get());
        }
        if (number instanceof AtomicLong) {
            return new BigDecimal(((AtomicLong) number).get());
        }
        if (number instanceof BigDecimal) {
            return (BigDecimal) number;
        }
        if (number instanceof BigInteger) {
            return new BigDecimal((BigInteger) number);
        }
        if ((number instanceof Byte) || (number instanceof Integer) || (number instanceof Long) || (number instanceof Short)) {
            return new BigDecimal(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return new BigDecimal(String.valueOf(number.doubleValue()));
        }
        return new BigDecimal(String.valueOf(number.doubleValue()));
    }

    public static final boolean isMultipleOf(BigDecimal bigDecimal, BigDecimal divisor) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        if (divisor.signum() == 0) {
            throw new IllegalArgumentException("Division by zero (nothing is a multiple of zero)");
        }
        try {
            bigDecimal.divide(divisor, 0, RoundingMode.UNNECESSARY);
            return true;
        } catch (ArithmeticException unused) {
            return false;
        }
    }

    public static final BigDecimal nextMultipleOf(BigDecimal bigDecimal, BigDecimal divisor) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        if (divisor.signum() == 0) {
            throw new IllegalArgumentException("Division by zero (nothing is a multiple of zero)");
        }
        BigDecimal bigDecimalMultiply = bigDecimal.divide(divisor, 0, RoundingMode.CEILING).multiply(divisor);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final BigDecimal previousMultipleOf(BigDecimal bigDecimal, BigDecimal divisor) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        if (divisor.signum() == 0) {
            throw new IllegalArgumentException("Division by zero (nothing is a multiple of zero)");
        }
        BigDecimal bigDecimalMultiply = bigDecimal.divide(divisor, 0, RoundingMode.FLOOR).multiply(divisor);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final int getNumberOfDecimalPlaces(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return RangesKt.coerceAtLeast(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).scale(), 0);
    }
}
