package com.robinhood.android.lib.store.mcw.data;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.ConvertibleCurrencyDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.GetConvertibleCurrenciesResponseDto;

/* compiled from: ConvertibleCurrency.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"toConvertibleCurrencies", "", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesResponseDto;", "lib-store-mcw_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.mcw.data.ConvertibleCurrencyKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConvertibleCurrency2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<ConvertibleCurrency> toConvertibleCurrencies(GetConvertibleCurrenciesResponseDto getConvertibleCurrenciesResponseDto) {
        Intrinsics.checkNotNullParameter(getConvertibleCurrenciesResponseDto, "<this>");
        List<ConvertibleCurrencyDto> currencies = getConvertibleCurrenciesResponseDto.getCurrencies();
        ArrayList arrayList = new ArrayList(currencies.size());
        int size = currencies.size();
        for (int i = 0; i < size; i++) {
            ConvertibleCurrencyDto convertibleCurrencyDto = currencies.get(i);
            Currency currency = Currency.getInstance(((com.robinhood.rosetta.common.Currency) convertibleCurrencyDto.getCurrency().toProto()).name());
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
            arrayList.add(new ConvertibleCurrency(currency, convertibleCurrencyDto.getBalance().toBigDecimalOrThrow(), convertibleCurrencyDto.getTransaction_min().toBigDecimalOrThrow(), convertibleCurrencyDto.getTransaction_max().toBigDecimalOrThrow()));
        }
        return arrayList;
    }
}
