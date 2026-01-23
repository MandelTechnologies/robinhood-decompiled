package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: McwFxRateExtensions.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\"\u0018\u0010\f\u001a\u00020\u0007*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0007*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"getEffectiveExchangeRate", "Ljava/math/BigDecimal;", "Lcom/robinhood/models/fx/db/McwFxRate;", "sourceCurrency", "Ljava/util/Currency;", "sinkCurrency", "getExchangeRateText", "", "getExchangeRateSduiSheetId", "getPrice", "invalidCurrencyPairError", "", "baseCurrencyCode", "getBaseCurrencyCode", "(Lcom/robinhood/models/fx/db/McwFxRate;)Ljava/lang/String;", "quoteCurrencyCode", "getQuoteCurrencyCode", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.McwFxRateExtensionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class McwFxRateExtensions {
    public static final BigDecimal getEffectiveExchangeRate(McwFxRate mcwFxRate, Currency sourceCurrency, Currency sinkCurrency) {
        Intrinsics.checkNotNullParameter(mcwFxRate, "<this>");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(sinkCurrency, "sinkCurrency");
        if (Intrinsics.areEqual(sourceCurrency.getCurrencyCode(), getBaseCurrencyCode(mcwFxRate)) && Intrinsics.areEqual(sinkCurrency.getCurrencyCode(), getQuoteCurrencyCode(mcwFxRate))) {
            return getPrice(mcwFxRate, sourceCurrency, sinkCurrency);
        }
        if (Intrinsics.areEqual(sourceCurrency.getCurrencyCode(), getQuoteCurrencyCode(mcwFxRate)) && Intrinsics.areEqual(sinkCurrency.getCurrencyCode(), getBaseCurrencyCode(mcwFxRate))) {
            return BigDecimals7.safeDivide(BigDecimal.ONE, getPrice(mcwFxRate, sourceCurrency, sinkCurrency));
        }
        invalidCurrencyPairError(mcwFxRate, sourceCurrency, sinkCurrency);
        throw new ExceptionsH();
    }

    public static final String getExchangeRateText(McwFxRate mcwFxRate, Currency sourceCurrency, Currency sinkCurrency) {
        Intrinsics.checkNotNullParameter(mcwFxRate, "<this>");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(sinkCurrency, "sinkCurrency");
        return sourceCurrency + " 1 = " + sinkCurrency + PlaceholderUtils.XXShortPlaceholderText + getEffectiveExchangeRate(mcwFxRate, sourceCurrency, sinkCurrency);
    }

    public static final String getExchangeRateSduiSheetId(McwFxRate mcwFxRate, Currency sourceCurrency, Currency sinkCurrency) {
        Intrinsics.checkNotNullParameter(mcwFxRate, "<this>");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(sinkCurrency, "sinkCurrency");
        if (Intrinsics.areEqual(sourceCurrency.getCurrencyCode(), getBaseCurrencyCode(mcwFxRate)) && Intrinsics.areEqual(sinkCurrency.getCurrencyCode(), getQuoteCurrencyCode(mcwFxRate))) {
            return "exchange_rate_details_bid";
        }
        if (Intrinsics.areEqual(sourceCurrency.getCurrencyCode(), getQuoteCurrencyCode(mcwFxRate)) && Intrinsics.areEqual(sinkCurrency.getCurrencyCode(), getBaseCurrencyCode(mcwFxRate))) {
            return "exchange_rate_details_ask";
        }
        invalidCurrencyPairError(mcwFxRate, sourceCurrency, sinkCurrency);
        throw new ExceptionsH();
    }

    public static final BigDecimal getPrice(McwFxRate mcwFxRate, Currency sourceCurrency, Currency sinkCurrency) {
        Intrinsics.checkNotNullParameter(mcwFxRate, "<this>");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(sinkCurrency, "sinkCurrency");
        if (Intrinsics.areEqual(sourceCurrency.getCurrencyCode(), getBaseCurrencyCode(mcwFxRate)) && Intrinsics.areEqual(sinkCurrency.getCurrencyCode(), getQuoteCurrencyCode(mcwFxRate))) {
            return mcwFxRate.getBidPrice();
        }
        if (Intrinsics.areEqual(sourceCurrency.getCurrencyCode(), getQuoteCurrencyCode(mcwFxRate)) && Intrinsics.areEqual(sinkCurrency.getCurrencyCode(), getBaseCurrencyCode(mcwFxRate))) {
            return mcwFxRate.getAskPrice();
        }
        invalidCurrencyPairError(mcwFxRate, sourceCurrency, sinkCurrency);
        throw new ExceptionsH();
    }

    private static final Void invalidCurrencyPairError(McwFxRate mcwFxRate, Currency currency, Currency currency2) {
        throw new IllegalStateException(("Invalid source or sink currency for FX currency pair " + mcwFxRate.getSymbol() + ", source=" + currency.getCurrencyCode() + ", sink=" + currency2.getCurrencyCode()).toString());
    }

    private static final String getBaseCurrencyCode(McwFxRate mcwFxRate) {
        String strSubstring = mcwFxRate.getSymbol().substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final String getQuoteCurrencyCode(McwFxRate mcwFxRate) {
        String strSubstring = mcwFxRate.getSymbol().substring(3, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
