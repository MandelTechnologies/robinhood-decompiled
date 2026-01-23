package com.robinhood.crypto.perpetuals.util;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualCurrency;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMoney;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualMoneyUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"formattedAmount", "", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMoney;", "getFormattedAmount", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMoney;)Ljava/lang/String;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMoney$Conversion;", "(Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMoney$Conversion;)Ljava/lang/String;", "formattedAmountWithSign", "getFormattedAmountWithSign", "formattedAmountWithoutSign", "getFormattedAmountWithoutSign", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.util.PerpetualMoneyUtilKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualMoneyUtil {
    public static final String getFormattedAmount(PerpetualMoney perpetualMoney) {
        Intrinsics.checkNotNullParameter(perpetualMoney, "<this>");
        return CurrencyDefinitions.formatCurrency$default(perpetualMoney.getCurrency(), perpetualMoney.getAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(perpetualMoney.getCurrency()), null, null, false, false, false, false, 2026, null);
    }

    public static final String getFormattedAmount(PerpetualMoney.Conversion conversion) {
        Intrinsics.checkNotNullParameter(conversion, "<this>");
        return CurrencyDefinitions.formatCurrency$default(conversion.getCurrency(), conversion.getAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(conversion.getCurrency()), null, null, false, false, false, false, 2026, null);
    }

    public static final String getFormattedAmountWithSign(PerpetualMoney perpetualMoney) {
        Intrinsics.checkNotNullParameter(perpetualMoney, "<this>");
        return CurrencyDefinitions.formatCurrency$default(perpetualMoney.getCurrency(), perpetualMoney.getAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(perpetualMoney.getCurrency()), null, Boolean.valueOf(!BigDecimals7.isZero(perpetualMoney.getAmount())), true, true, false, false, 1578, null);
    }

    public static final String getFormattedAmountWithSign(PerpetualMoney.Conversion conversion) {
        Intrinsics.checkNotNullParameter(conversion, "<this>");
        return CurrencyDefinitions.formatCurrency$default(conversion.getCurrency(), conversion.getAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(conversion.getCurrency()), null, Boolean.valueOf(!BigDecimals7.isZero(conversion.getAmount())), true, true, false, false, 1578, null);
    }

    public static final String getFormattedAmountWithoutSign(PerpetualMoney perpetualMoney) {
        Intrinsics.checkNotNullParameter(perpetualMoney, "<this>");
        PerpetualCurrency currency = perpetualMoney.getCurrency();
        BigDecimal bigDecimalAbs = perpetualMoney.getAmount().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return CurrencyDefinitions.formatCurrency$default(currency, bigDecimalAbs, false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(perpetualMoney.getCurrency()), null, null, false, false, false, false, 2026, null);
    }

    public static final String getFormattedAmountWithoutSign(PerpetualMoney.Conversion conversion) {
        Intrinsics.checkNotNullParameter(conversion, "<this>");
        PerpetualCurrency currency = conversion.getCurrency();
        BigDecimal bigDecimalAbs = conversion.getAmount().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return CurrencyDefinitions.formatCurrency$default(currency, bigDecimalAbs, false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(conversion.getCurrency()), null, null, false, false, false, false, 2026, null);
    }
}
