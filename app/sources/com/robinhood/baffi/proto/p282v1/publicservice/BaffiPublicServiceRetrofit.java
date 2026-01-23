package com.robinhood.baffi.proto.p282v1.publicservice;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* compiled from: BaffiPublicServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceRetrofit;", "", "GenerateDeviceNonce", "Lretrofit2/Response;", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceResponseDto;", "headers", "", "", CarResultComposable2.BODY, "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;", "(Ljava/util/Map;Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;", "(Ljava/util/Map;Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AttestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "(Ljava/util/Map;Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeviceAttestationCheck", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckResponseDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;", "(Ljava/util/Map;Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes3.dex */
public interface BaffiPublicServiceRetrofit {
    @POST("baffi/v1/device/attest")
    Object AttestDevice(@HeaderMap Map<String, String> map, @Body AttestDeviceRequestDto attestDeviceRequestDto, Continuation<Response<AttestDeviceResponseDto>> continuation);

    @POST("baffi/v1/device/attestStatus")
    Object DeviceAttestStatus(@HeaderMap Map<String, String> map, @Body DeviceAttestStatusRequestDto deviceAttestStatusRequestDto, Continuation<Response<DeviceAttestStatusResponseDto>> continuation);

    @POST("baffi/v1/device/attestCheck")
    Object DeviceAttestationCheck(@HeaderMap Map<String, String> map, @Body DeviceAttestationCheckRequestDto deviceAttestationCheckRequestDto, Continuation<Response<DeviceAttestationCheckResponseDto>> continuation);

    @POST("baffi/v1/device/generateNonce")
    Object GenerateDeviceNonce(@HeaderMap Map<String, String> map, @Body GenerateDeviceNonceRequestDto generateDeviceNonceRequestDto, Continuation<Response<GenerateDeviceNonceResponseDto>> continuation);
}
