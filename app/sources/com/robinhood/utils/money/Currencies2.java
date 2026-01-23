package com.robinhood.utils.money;

import java.util.Currency;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Currencies.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\"\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"currencyIds", "", "Ljava/util/Currency;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "uuid", "getUuid", "(Ljava/util/Currency;)Ljava/util/UUID;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.money.CurrenciesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Currencies2 {
    private static final Map<Currency, UUID> currencyIds = MapsKt.mapOf(Tuples4.m3642to(Currencies.USD, UUID.fromString("1072fc76-1862-41ab-82c2-485837590762")), Tuples4.m3642to(Currencies.GBP, UUID.fromString("e97dbe37-69df-46d9-8366-75eda22d2b78")), Tuples4.m3642to(Currencies.EUR, UUID.fromString("fff99075-5061-4754-b7a1-34b7d145d3de")), Tuples4.m3642to(Currencies.JPY, UUID.fromString("fddf568b-7f58-453e-83cf-626a646eca2b")), Tuples4.m3642to(Currencies.SGD, UUID.fromString("6c02c392-a893-4c24-95e1-76a3c6cef26a")));

    public static final UUID getUuid(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        UUID uuid = currencyIds.get(currency);
        if (uuid != null) {
            return uuid;
        }
        throw new NoSuchElementException("Robinhood internal UUID for currency is not known: " + currency);
    }
}
