package com.robinhood.utils.math;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigIntegers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\u0002\u001a\f\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u000b"}, m3636d2 = {"eq", "", "Ljava/math/BigInteger;", "other", "gt", "gte", "lt", "lte", "isZero", "orZero", "isNegative", "lib-utils-math"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.math.BigIntegersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BigIntegers2 {
    /* renamed from: eq */
    public static final boolean m2980eq(BigInteger bigInteger, BigInteger bigInteger2) {
        return orZero(bigInteger).compareTo(orZero(bigInteger2)) == 0;
    }

    /* renamed from: gt */
    public static final boolean m2981gt(BigInteger bigInteger, BigInteger bigInteger2) {
        return orZero(bigInteger).compareTo(orZero(bigInteger2)) > 0;
    }

    public static final boolean gte(BigInteger bigInteger, BigInteger bigInteger2) {
        return orZero(bigInteger).compareTo(orZero(bigInteger2)) >= 0;
    }

    /* renamed from: lt */
    public static final boolean m2982lt(BigInteger bigInteger, BigInteger bigInteger2) {
        return orZero(bigInteger).compareTo(orZero(bigInteger2)) < 0;
    }

    public static final boolean lte(BigInteger bigInteger, BigInteger bigInteger2) {
        return orZero(bigInteger).compareTo(orZero(bigInteger2)) <= 0;
    }

    public static final boolean isZero(BigInteger bigInteger) {
        return orZero(bigInteger).signum() == 0;
    }

    public static final BigInteger orZero(BigInteger bigInteger) {
        if (bigInteger != null) {
            return bigInteger;
        }
        BigInteger ZERO = BigInteger.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public static final boolean isNegative(BigInteger bigInteger) {
        return orZero(bigInteger).signum() == -1;
    }
}
