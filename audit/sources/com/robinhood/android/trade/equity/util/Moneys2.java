package com.robinhood.android.trade.equity.util;

import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Moneys.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0004"}, m3636d2 = {"toShareQuantity", "Ljava/math/BigDecimal;", "Lcom/robinhood/models/util/Money;", "money", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.MoneysKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Moneys2 {
    public static final BigDecimal toShareQuantity(Money money, Money money2) {
        Intrinsics.checkNotNullParameter(money, "<this>");
        if (money2 == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        return money.div(money2, 6, RoundingMode.DOWN);
    }
}
