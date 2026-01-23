package com.ionspin.kotlin.bignum.decimal;

import com.ionspin.kotlin.bignum.integer.base63.BigInteger63Utility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DecimalUtility.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toJavaBigDecimal", "Ljava/math/BigDecimal;", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "bignum"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.decimal.DecimalUtilityKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DecimalUtility {
    public static final java.math.BigDecimal toJavaBigDecimal(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (bigDecimal.getPrecision() > 2147483647L) {
            throw new RuntimeException("Numbers with more digits than Int.MAX_VALUE cannot be converted to java BigDecimal");
        }
        if (Intrinsics.areEqual(bigDecimal, BigDecimal.INSTANCE.getZERO())) {
            java.math.BigDecimal ZERO = java.math.BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (bigDecimal.getExponent() > 0) {
            return new java.math.BigDecimal(BigInteger63Utility.toJavaBigInteger(bigDecimal.getSignificand()), (int) ((bigDecimal.getPrecision() - bigDecimal.getExponent()) - 1));
        }
        return new java.math.BigDecimal(BigInteger63Utility.toJavaBigInteger(bigDecimal.getSignificand()), (int) ((bigDecimal.getPrecision() + Math.abs(bigDecimal.getExponent())) - 1));
    }
}
