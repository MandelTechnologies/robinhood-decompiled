package com.robinhood.shared.tradeladder.p398ui.ladder.extensions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: QuantityBarWidth.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¨\u0006\b"}, m3636d2 = {"calculateFractionalWidth", "", "defaultSize", "minSize", "value", "Ljava/math/BigDecimal;", "min", AnalyticsStrings.MAX_WELCOME_TAG, "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.extensions.QuantityBarWidthKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class QuantityBarWidth {
    public static /* synthetic */ float calculateFractionalWidth$default(float f, float f2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        if ((i & 2) != 0) {
            f2 = 0.05f;
        }
        return calculateFractionalWidth(f, f2, bigDecimal, bigDecimal2, bigDecimal3);
    }

    public static final float calculateFractionalWidth(float f, float f2, BigDecimal value, BigDecimal min, BigDecimal max) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        if (Intrinsics.areEqual(min, max)) {
            return f;
        }
        BigDecimal bigDecimalSubtract = value.subtract(min);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        float fFloatValue = bigDecimalSubtract.floatValue();
        BigDecimal bigDecimalSubtract2 = max.subtract(min);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        return RangesKt.coerceIn(fFloatValue / bigDecimalSubtract2.floatValue(), f2, 1.0f);
    }
}
