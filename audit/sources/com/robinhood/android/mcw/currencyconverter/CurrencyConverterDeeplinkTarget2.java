package com.robinhood.android.mcw.currencyconverter;

import com.robinhood.utils.logging.CrashReporter;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\u0001¨\u0006\u0004"}, m3636d2 = {"parseDirection", "Lkotlin/Pair;", "Ljava/util/Currency;", "", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDeeplinkTargetKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CurrencyConverterDeeplinkTarget2 {
    public static final Tuples2<Currency, Currency> parseDirection(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() != 6) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("direction must be in the form XXXYYY where XXX, YYY are currency codes"), false, null, 6, null);
            return null;
        }
        String strSubstring = str.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(3, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        try {
            Tuples2 tuples2M3642to = Tuples4.m3642to(Currency.getInstance(strSubstring), Currency.getInstance(strSubstring2));
            Currency currency = (Currency) tuples2M3642to.component1();
            Currency currency2 = (Currency) tuples2M3642to.component2();
            if (currency == null || currency2 == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Unable to parse currencies from=" + strSubstring + " and to=" + strSubstring2), false, null, 6, null);
                return null;
            }
            return Tuples4.m3642to(currency, currency2);
        } catch (IllegalArgumentException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return null;
        }
    }
}
