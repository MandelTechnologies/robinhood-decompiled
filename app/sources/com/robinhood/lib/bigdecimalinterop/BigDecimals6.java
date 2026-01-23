package com.robinhood.lib.bigdecimalinterop;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toBignumBigDecimal", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Ljava/math/BigDecimal;", "lib-bigdecimal-interop"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.lib.bigdecimalinterop.BigDecimalsKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class BigDecimals6 {
    public static final BigDecimal toBignumBigDecimal(java.math.BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal.Companion companion = BigDecimal.INSTANCE;
        String string2 = bigDecimal.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return companion.parseString(string2);
    }
}
