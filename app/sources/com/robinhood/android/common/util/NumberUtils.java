package com.robinhood.android.common.util;

import android.icu.text.MessageFormat;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: NumberUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Ljava/math/BigDecimal;", "previous", "calculateDeltaValueFrom", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "calculateDeltaPercentFrom", "j$/time/LocalDate", "", "getDayOfMonthOrdinalString", "(Lj$/time/LocalDate;)Ljava/lang/String;", "dayOfMonthOrdinalString", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.NumberUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class NumberUtils {
    public static final BigDecimal calculateDeltaValueFrom(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal2 == null) {
            return bigDecimal;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static final BigDecimal calculateDeltaPercentFrom(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal2 == null || BigDecimals7.isZero(bigDecimal2)) {
            return null;
        }
        return BigDecimals7.safeDivide(calculateDeltaValueFrom(bigDecimal, bigDecimal2), bigDecimal2);
    }

    public static final String getDayOfMonthOrdinalString(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        String str = MessageFormat.format("{0,ordinal}", Double.valueOf(localDate.getDayOfMonth()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
