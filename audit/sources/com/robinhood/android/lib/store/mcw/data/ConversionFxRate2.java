package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.idl.IdlDecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.ConversionFxRateDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.GetConversionFxRateResponseDto;

/* compiled from: ConversionFxRate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toConversionFxRate", "Lcom/robinhood/android/lib/store/mcw/data/ConversionFxRate;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "lib-store-mcw_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.mcw.data.ConversionFxRateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConversionFxRate2 {
    public static final ConversionFxRate toConversionFxRate(GetConversionFxRateResponseDto getConversionFxRateResponseDto) {
        IdlDecimal bid_price;
        BigDecimal bigDecimalOrThrow;
        RoundingMode roundingMode;
        BigDecimal scale;
        IdlDecimal ask_price;
        BigDecimal bigDecimalOrThrow2;
        BigDecimal scale2;
        IdlDecimal basis_point;
        BigDecimal bigDecimalOrThrow3;
        Intrinsics.checkNotNullParameter(getConversionFxRateResponseDto, "<this>");
        String symbol_id = getConversionFxRateResponseDto.getSymbol_id();
        String symbol = getConversionFxRateResponseDto.getSymbol();
        ConversionFxRateDto fx_rate = getConversionFxRateResponseDto.getFx_rate();
        if (fx_rate == null || (bid_price = fx_rate.getBid_price()) == null || (bigDecimalOrThrow = bid_price.toBigDecimalOrThrow()) == null || (scale = bigDecimalOrThrow.setScale(4, (roundingMode = RoundingMode.HALF_UP))) == null) {
            throw new IllegalStateException("null fx rate in response");
        }
        ConversionFxRateDto fx_rate2 = getConversionFxRateResponseDto.getFx_rate();
        if (fx_rate2 == null || (ask_price = fx_rate2.getAsk_price()) == null || (bigDecimalOrThrow2 = ask_price.toBigDecimalOrThrow()) == null || (scale2 = bigDecimalOrThrow2.setScale(4, roundingMode)) == null) {
            throw new IllegalStateException("null fx rate in response");
        }
        ConversionFxRateDto fx_rate3 = getConversionFxRateResponseDto.getFx_rate();
        if (fx_rate3 != null && (basis_point = fx_rate3.getBasis_point()) != null && (bigDecimalOrThrow3 = basis_point.toBigDecimalOrThrow()) != null) {
            return new ConversionFxRate(symbol_id, symbol, scale, scale2, bigDecimalOrThrow3);
        }
        throw new IllegalStateException("null fx rate basis point in response");
    }
}
