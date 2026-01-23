package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityPriceScaling.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"CENT_SCALE", "", "SUBCENT_SCALE", "maxEquityPriceScale", "Ljava/math/BigDecimal;", "scaleEquityPrice", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.utils.EquityPriceScalingKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityPriceScaling {
    public static final int CENT_SCALE = 2;
    public static final int SUBCENT_SCALE = 4;

    public static final int maxEquityPriceScale(BigDecimal bigDecimal) {
        return BigDecimals7.gte(BigDecimals7.orZero(bigDecimal).abs(), BigDecimal.ONE) ? 2 : 4;
    }

    public static final BigDecimal scaleEquityPrice(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(maxEquityPriceScale(bigDecimal), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
