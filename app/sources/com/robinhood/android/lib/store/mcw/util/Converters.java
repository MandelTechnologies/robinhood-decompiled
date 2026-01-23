package com.robinhood.android.lib.store.mcw.util;

import com.robinhood.rosetta.common.CurrencyDto;
import java.util.Currency;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Converters.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toCurrencyDto", "Lcom/robinhood/rosetta/common/CurrencyDto;", "Ljava/util/Currency;", "lib-store-mcw_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.mcw.util.ConvertersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Converters {
    public static final CurrencyDto toCurrencyDto(Currency currency) {
        CurrencyDto next;
        Intrinsics.checkNotNullParameter(currency, "<this>");
        Iterator<CurrencyDto> it = CurrencyDto.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getJson_value(), currency.getCurrencyCode())) {
                break;
            }
        }
        CurrencyDto currencyDto = next;
        return currencyDto == null ? CurrencyDto.CURRENCY_UNSPECIFIED : currencyDto;
    }
}
