package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.android.lib.store.mcw.util.Converters;
import com.robinhood.idl.IdlDecimal2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.ConvertCurrencyRequestDto;

/* compiled from: ConvertCurrencyRequest.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toConvertCurrencyRequestDto", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertCurrencyRequest;", "lib-store-mcw_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.mcw.data.ConvertCurrencyRequestKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConvertCurrencyRequest2 {
    public static final ConvertCurrencyRequestDto toConvertCurrencyRequestDto(ConvertCurrencyRequest convertCurrencyRequest) {
        Intrinsics.checkNotNullParameter(convertCurrencyRequest, "<this>");
        String string2 = convertCurrencyRequest.getRefId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new ConvertCurrencyRequestDto(string2, convertCurrencyRequest.getAccountNumber(), convertCurrencyRequest.getSymbolId(), IdlDecimal2.toIdlDecimal(convertCurrencyRequest.getAmountToConvert()), Converters.toCurrencyDto(convertCurrencyRequest.getFromCurrency()), Converters.toCurrencyDto(convertCurrencyRequest.getToCurrency()));
    }
}
