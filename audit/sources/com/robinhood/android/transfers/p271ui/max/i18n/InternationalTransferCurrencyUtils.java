package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.transfers.util.GetRate;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferCurrencyUtils.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a0\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0006\u001a2\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0013*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\"\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"cleanAmount", "Ljava/math/BigDecimal;", "bigDecimal", "convertAmount", "Lcom/robinhood/models/util/Money;", "localCurrency", "Ljava/util/Currency;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "amount", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "toTargetCurrency", "newTargetCurrency", "symbolString", "", "getSymbolString", "(Ljava/util/Currency;)Ljava/lang/String;", "getToggledCurrencyAmountAndString", "Lkotlin/Pair;", "direction", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferCurrencyUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransferCurrencyUtils {
    public static final BigDecimal cleanAmount(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal scale = new BigDecimal(bigDecimal.toPlainString()).setScale(2, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    public static final Money convertAmount(Currency localCurrency, TransferDirection transferDirection, Money amount, ApiFxQuote fxQuote) {
        Intrinsics.checkNotNullParameter(localCurrency, "localCurrency");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fxQuote, "fxQuote");
        if (Intrinsics.areEqual(amount.getCurrency(), localCurrency)) {
            return Money.copy$default(amount.times(GetRate.getRate(fxQuote, transferDirection)), Currencies.USD, null, 2, null);
        }
        return Money.copy$default(amount.div(GetRate.getRate(fxQuote, transferDirection)), localCurrency, null, 2, null);
    }

    public static final Money toTargetCurrency(Currency localCurrency, TransferDirection transferDirection, Money amount, ApiFxQuote apiFxQuote, Currency newTargetCurrency) {
        Intrinsics.checkNotNullParameter(localCurrency, "localCurrency");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(newTargetCurrency, "newTargetCurrency");
        if (apiFxQuote == null) {
            throw new IllegalStateException("No fx quote handed in yet currency conversion asked for.");
        }
        if (Intrinsics.areEqual(amount.getCurrency(), newTargetCurrency)) {
            return amount;
        }
        Currency currency = amount.getCurrency();
        Currency currency2 = Currencies.USD;
        if (Intrinsics.areEqual(currency, currency2) && Intrinsics.areEqual(newTargetCurrency, localCurrency)) {
            BigDecimal scale = amount.div(GetRate.getRate(apiFxQuote, transferDirection)).getDecimalValue().setScale(2, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNull(scale);
            return new Money(localCurrency, scale);
        }
        if (Intrinsics.areEqual(amount.getCurrency(), localCurrency) && Intrinsics.areEqual(newTargetCurrency, currency2)) {
            BigDecimal scale2 = amount.times(GetRate.getRate(apiFxQuote, transferDirection)).getDecimalValue().setScale(2, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNull(scale2);
            return new Money(currency2, scale2);
        }
        throw new IllegalStateException("Unexpected currency handed in.");
    }

    public static final String getSymbolString(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        if (Intrinsics.areEqual(currency, Currencies.GBP)) {
            return "£";
        }
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            return "$";
        }
        if (Intrinsics.areEqual(currency, Currencies.SGD)) {
            return "S$";
        }
        throw new IllegalStateException(("Unsupported currency: " + currency).toString());
    }

    public static final Tuples2<Money, String> getToggledCurrencyAmountAndString(Money money, Currency localCurrency, TransferDirection direction, ApiFxQuote apiFxQuote) {
        DecimalFormat decimalFormat;
        Intrinsics.checkNotNullParameter(money, "<this>");
        Intrinsics.checkNotNullParameter(localCurrency, "localCurrency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Currency currency = Intrinsics.areEqual(money.getCurrency(), localCurrency) ? Currencies.USD : localCurrency;
        String symbolString = getSymbolString(currency);
        Money targetCurrency = toTargetCurrency(localCurrency, direction, money, apiFxQuote, currency);
        if (targetCurrency.getDecimalValue().scale() <= 0) {
            decimalFormat = new DecimalFormat("#,###");
        } else {
            decimalFormat = new DecimalFormat("#,###0.00");
        }
        return Tuples4.m3642to(targetCurrency, symbolString + decimalFormat.format(targetCurrency.getDecimalValue()));
    }
}
