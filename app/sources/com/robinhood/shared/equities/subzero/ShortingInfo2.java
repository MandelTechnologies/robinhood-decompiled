package com.robinhood.shared.equities.subzero;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShortingInfo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"calculateTradeFlowDailyFee", "Ljava/math/BigDecimal;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "lib-equity-subzero_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.equities.subzero.ShortingInfoKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ShortingInfo2 {
    public static final BigDecimal calculateTradeFlowDailyFee(ShortingInfo shortingInfo, BigDecimal quantity, BigDecimal price) {
        BigDecimal bigDecimalM822m;
        Intrinsics.checkNotNullParameter(shortingInfo, "<this>");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price, "price");
        if (shortingInfo.getDailyFee() != null) {
            BigDecimal bigDecimalMultiply = quantity.multiply(price);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalDivide = shortingInfo.getDailyFee().divide(new BigDecimal(100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(bigDecimalDivide);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            if (bigDecimalMultiply2 != null && (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalMultiply2)) != null) {
                return bigDecimalM822m;
            }
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }
}
