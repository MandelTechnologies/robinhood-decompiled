package com.robinhood.android.common.format;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.crypto.p314db.Currency;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Currencys.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"deltaCache", "", "", "Ljava/text/NumberFormat;", "formatDelta", "", "Lcom/robinhood/models/crypto/db/Currency;", "value", "Ljava/math/BigDecimal;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.format.CurrencysKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Currencys {
    private static final Map<Integer, NumberFormat> deltaCache = new LinkedHashMap();

    public static final String formatDelta(Currency currency, BigDecimal value) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (currency.isUsd()) {
            return Formats.getCurrencyDeltaFormat().format(value);
        }
        int decimalScale = currency.getDecimalScale();
        Map<Integer, NumberFormat> map = deltaCache;
        Integer numValueOf = Integer.valueOf(decimalScale);
        NumberFormat numberInstance = map.get(numValueOf);
        if (numberInstance == null) {
            numberInstance = NumberFormat.getNumberInstance(Locale.US);
            numberInstance.setMaximumFractionDigits(decimalScale);
            numberInstance.setMinimumFractionDigits(Math.min(2, decimalScale));
            numberInstance.setMinimumIntegerDigits(1);
            if (numberInstance instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
                decimalFormat.setPositivePrefix("+");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativePrefix("-");
                decimalFormat.setNegativeSuffix("");
            }
            Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
            map.put(numValueOf, numberInstance);
        }
        String str = numberInstance.format(value);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
