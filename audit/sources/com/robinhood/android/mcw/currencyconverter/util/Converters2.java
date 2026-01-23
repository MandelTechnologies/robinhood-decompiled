package com.robinhood.android.mcw.currencyconverter.util;

import com.robinhood.compose.bento.util.BentoCurrency;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.money.Currencies;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Converters.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\"\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"toBentoCurrency", "Lcom/robinhood/compose/bento/util/BentoCurrency;", "Ljava/util/Currency;", "currency", "Lcom/robinhood/iso/countrycode/CountryCode;", "getCurrency", "(Lcom/robinhood/iso/countrycode/CountryCode;)Ljava/util/Currency;", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.util.ConvertersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Converters2 {
    public static final BentoCurrency toBentoCurrency(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            return BentoCurrency.USD;
        }
        if (Intrinsics.areEqual(currency, Currencies.SGD)) {
            return BentoCurrency.SGD;
        }
        if (Intrinsics.areEqual(currency, Currencies.GBP)) {
            return BentoCurrency.GBP;
        }
        if (Intrinsics.areEqual(currency, Currencies.EUR)) {
            return BentoCurrency.EUR;
        }
        if (Intrinsics.areEqual(currency, Currencies.JPY)) {
            return BentoCurrency.JPY;
        }
        return null;
    }

    public static final Currency getCurrency(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "<this>");
        if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedStates.INSTANCE)) {
            return Currencies.USD;
        }
        if (Affiliate.RHSG.INSTANCE.contains(countryCode)) {
            return Currencies.SGD;
        }
        if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return Currencies.GBP;
        }
        if (CollectionsKt.contains(CountryCode.Supported.INSTANCE.getEU_COUNTRIES(), countryCode)) {
            return Currencies.EUR;
        }
        return null;
    }
}
