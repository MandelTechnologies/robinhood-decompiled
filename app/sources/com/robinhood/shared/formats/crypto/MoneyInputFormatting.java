package com.robinhood.shared.formats.crypto;

import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatParser;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: MoneyInputFormatting.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\t\u001a\u00020\b*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e\u001a;\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0012\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"defaultLocale", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "defaultCurrency", "Ljava/util/Currency;", "defaultSymbols", "Ljava/text/DecimalFormatSymbols;", "defaultDecimalSeparator", "", "toReadableMoneyString", "maximumFractionDigits", "", "enableSymbol", "", "(Ljava/lang/String;Ljava/lang/Integer;Z)Ljava/lang/String;", "locale", "currency", "decimalSeparator", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Currency;Ljava/lang/Integer;Ljava/lang/String;Z)Ljava/lang/String;", "lib-formats-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.formats.crypto.MoneyInputFormattingKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MoneyInputFormatting {
    private static final Currency defaultCurrency;
    private static final String defaultDecimalSeparator;
    private static final Locale defaultLocale;
    private static final DecimalFormatSymbols defaultSymbols;

    static {
        Locale locale = Locale.US;
        defaultLocale = locale;
        defaultCurrency = Currencies.USD;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        defaultSymbols = decimalFormatSymbols;
        defaultDecimalSeparator = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
    }

    public static /* synthetic */ String toReadableMoneyString$default(String str, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return toReadableMoneyString(str, num, z);
    }

    public static final String toReadableMoneyString(String str, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale defaultLocale2 = defaultLocale;
        Intrinsics.checkNotNullExpressionValue(defaultLocale2, "defaultLocale");
        return toReadableMoneyString(str, defaultLocale2, defaultCurrency, num, defaultDecimalSeparator, z);
    }

    public static /* synthetic */ String toReadableMoneyString$default(String str, Locale locale, Currency currency, Integer num, String str2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return toReadableMoneyString(str, locale, currency, num, str2, z);
    }

    public static final String toReadableMoneyString(String str, Locale locale, Currency currency, Integer num, String decimalSeparator, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(decimalSeparator, "decimalSeparator");
        if (!Intrinsics.areEqual(str, decimalSeparator)) {
            BigDecimal amount = CurrencyFormatParser.parseCurrencyText$default(str, new InputAmount(null, InputAmount.Type.ZERO, 1, null), null, 4, null).getAmount();
            return Money.format$default(Money3.toMoney(amount, currency), locale, false, null, z, RangesKt.coerceIn(amount.scale(), (Range2<Integer>) new PrimitiveRanges2(0, num != null ? num.intValue() : currency.getDefaultFractionDigits())), null, amount.scale() > 0 || StringsKt.contains$default((CharSequence) str, (CharSequence) decimalSeparator, false, 2, (Object) null), null, false, false, 932, null);
        }
        return "0" + decimalSeparator;
    }
}
