package com.stripe.android.uicore.format;

import com.robinhood.android.futures.charts.DisplaySpans;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CurrencyFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/uicore/format/CurrencyFormatter;", "", "<init>", "()V", "Ljava/util/Currency;", "currency", "", "getDefaultDecimalDigits", "(Ljava/util/Currency;)I", "", "", "", "SERVER_DECIMAL_DIGITS", "Ljava/util/Map;", "stripe-ui-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CurrencyFormatter {
    public static final CurrencyFormatter INSTANCE = new CurrencyFormatter();
    private static final Map<Set<String>, Integer> SERVER_DECIMAL_DIGITS = MapsKt.mapOf(Tuples4.m3642to(SetsKt.setOf((Object[]) new String[]{"UGX", "AFN", DisplaySpans.ALL, "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"}), 2));
    public static final int $stable = 8;

    private CurrencyFormatter() {
    }

    public final int getDefaultDecimalDigits(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Map<Set<String>, Integer> map = SERVER_DECIMAL_DIGITS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Set<String>, Integer> entry : map.entrySet()) {
            Set<String> key = entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (key.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) CollectionsKt.firstOrNull((List) arrayList);
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }
}
