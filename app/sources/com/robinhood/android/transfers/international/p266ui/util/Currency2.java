package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Currency.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0002*\u00020\fH\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m3636d2 = {"name", "", "Ljava/util/Currency;", "getName", "(Ljava/util/Currency;)Ljava/lang/Integer;", "symbolPrefix", "", "getSymbolPrefix", "(Ljava/util/Currency;)Ljava/lang/String;", "countryCode", "getCountryCode", "toCurrencyDto", "Lcom/robinhood/rosetta/common/CurrencyDto;", "toRosettaCurrency", "Lcom/robinhood/rosetta/common/Currency;", "toTransferApiCurrency", "Lcom/robinhood/transfers/api/Currency;", "toCurrency", "formatWithSymbolPrefix", "bigDecimal", "Ljava/math/BigDecimal;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.CurrencyKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Currency2 {

    /* compiled from: Currency.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.util.CurrencyKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyDto.values().length];
            try {
                iArr[CurrencyDto.USD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyDto.SGD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Integer getName(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            return Integer.valueOf(C30310R.string.currency_name_usd);
        }
        if (Intrinsics.areEqual(currency, Currencies.SGD)) {
            return Integer.valueOf(C30310R.string.currency_name_sgd);
        }
        return null;
    }

    public static final String getSymbolPrefix(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            return "$";
        }
        if (Intrinsics.areEqual(currency, Currencies.SGD)) {
            return "S$";
        }
        String symbol = currency.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }

    public static final String getCountryCode(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        return Intrinsics.areEqual(currency, Currencies.USD) ? CountryCode.COUNTRY_CODE_US : Intrinsics.areEqual(currency, Currencies.SGD) ? CountryCode.COUNTRY_CODE_SG : "";
    }

    public static final CurrencyDto toCurrencyDto(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        return Intrinsics.areEqual(currency, Currencies.USD) ? CurrencyDto.USD : Intrinsics.areEqual(currency, Currencies.SGD) ? CurrencyDto.SGD : CurrencyDto.CURRENCY_UNSPECIFIED;
    }

    public static final com.robinhood.rosetta.common.Currency toRosettaCurrency(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        return Intrinsics.areEqual(currency, Currencies.USD) ? com.robinhood.rosetta.common.Currency.USD : Intrinsics.areEqual(currency, Currencies.SGD) ? com.robinhood.rosetta.common.Currency.SGD : com.robinhood.rosetta.common.Currency.CURRENCY_UNSPECIFIED;
    }

    public static final com.robinhood.transfers.api.Currency toTransferApiCurrency(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        return Intrinsics.areEqual(currency, Currencies.USD) ? com.robinhood.transfers.api.Currency.USD : Intrinsics.areEqual(currency, Currencies.SGD) ? com.robinhood.transfers.api.Currency.SGD : com.robinhood.transfers.api.Currency.UNKNOWN;
    }

    public static final Currency toCurrency(CurrencyDto currencyDto) {
        Intrinsics.checkNotNullParameter(currencyDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[currencyDto.ordinal()];
        if (i == 1) {
            return Currencies.USD;
        }
        if (i == 2) {
            return Currencies.SGD;
        }
        Currency currency = Currency.getInstance(currencyDto.getJson_value());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return currency;
    }

    public static final String formatWithSymbolPrefix(Currency currency, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal, "bigDecimal");
        return getSymbolPrefix(currency) + Formats.getNoSymbolCurrencyFormat().format(bigDecimal);
    }
}
