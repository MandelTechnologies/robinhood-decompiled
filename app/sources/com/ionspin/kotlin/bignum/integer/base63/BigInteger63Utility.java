package com.ionspin.kotlin.bignum.integer.base63;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.ULongArray;
import kotlin.collections._UCollections;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigInteger63Utility.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0004\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, m3636d2 = {"Lkotlin/ULongArray;", "Ljava/math/BigInteger;", "toJavaBigInteger-QwZRm1k", "([J)Ljava/math/BigInteger;", "toJavaBigInteger", "Lcom/ionspin/kotlin/bignum/integer/BigInteger;", "(Lcom/ionspin/kotlin/bignum/integer/BigInteger;)Ljava/math/BigInteger;", "bignum"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.ionspin.kotlin.bignum.integer.base63.BigInteger63UtilityKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class BigInteger63Utility {
    /* renamed from: toJavaBigInteger-QwZRm1k, reason: not valid java name */
    public static final BigInteger m9417toJavaBigIntegerQwZRm1k(long[] toJavaBigInteger) {
        Intrinsics.checkNotNullParameter(toJavaBigInteger, "$this$toJavaBigInteger");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(toJavaBigInteger);
        int i = 0;
        int i2 = 0;
        while (i < iM28619getSizeimpl) {
            bigIntegerValueOf = bigIntegerValueOf.or(new BigInteger(BigInteger63UtilityKt$$ExternalSyntheticBackport1.m1067m(ULongArray.m28618getsVKNKU(toJavaBigInteger, i), 10), 10).shiftLeft(i2 * 63));
            i++;
            i2++;
        }
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "foldIndexed-mwnnOCs(...)");
        return bigIntegerValueOf;
    }

    public static final BigInteger toJavaBigInteger(com.ionspin.kotlin.bignum.integer.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerM9417toJavaBigIntegerQwZRm1k = m9417toJavaBigIntegerQwZRm1k(_UCollections.toULongArray(ULongArray.m28611boximpl(bigInteger.getMagnitude())));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(bigInteger.getSign().toInt());
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        BigInteger bigIntegerMultiply = bigIntegerM9417toJavaBigIntegerQwZRm1k.multiply(bigIntegerValueOf);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }
}
