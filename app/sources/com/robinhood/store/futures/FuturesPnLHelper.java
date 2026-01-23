package com.robinhood.store.futures;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesPnLHelper.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, m3636d2 = {"computePnl", "Ljava/math/BigDecimal;", "multiplier", "costBasis", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "positionQuantity", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.FuturesPnLHelperKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FuturesPnLHelper {
    public static final BigDecimal computePnl(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        if (bigDecimal == null || bigDecimal2 == null || bigDecimal3 == null || bigDecimal4 == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalSubtract = bigDecimalMultiply2.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }
}
