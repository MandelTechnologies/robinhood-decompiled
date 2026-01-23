package microgram.contracts.mcw_currency_conversion.proto.p498v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: McwCurrencyConversionService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesRequestDto;", "request", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesResponseDto;", "GetConvertibleCurrencies", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "GetConversionFxRate", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyResponseDto;", "ConvertCurrency", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionResponseDto;", "PerformQuickConversion", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.mcw_currency_conversion.proto.v1.McwCurrencyConversionService")
/* loaded from: classes14.dex */
public interface McwCurrencyConversionService {
    Object ConvertCurrency(ConvertCurrencyRequestDto convertCurrencyRequestDto, Continuation<? super ConvertCurrencyResponseDto> continuation);

    Object GetConversionFxRate(GetConversionFxRateRequestDto getConversionFxRateRequestDto, Continuation<? super GetConversionFxRateResponseDto> continuation);

    Object GetConvertibleCurrencies(GetConvertibleCurrenciesRequestDto getConvertibleCurrenciesRequestDto, Continuation<? super GetConvertibleCurrenciesResponseDto> continuation);

    Object PerformQuickConversion(PerformQuickConversionRequestDto performQuickConversionRequestDto, Continuation<? super PerformQuickConversionResponseDto> continuation);
}
