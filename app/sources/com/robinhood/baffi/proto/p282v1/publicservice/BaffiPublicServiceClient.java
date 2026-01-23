package com.robinhood.baffi.proto.p282v1.publicservice;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: BaffiPublicServiceClient.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceClient;", "Lcom/squareup/wire/Service;", "GenerateDeviceNonce", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceResponse;", "DeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponse;", "AttestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponse;", "DeviceAttestationCheck", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckResponse;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface BaffiPublicServiceClient extends Service {
    GrpcCall<AttestDeviceRequest, AttestDeviceResponse> AttestDevice();

    GrpcCall<DeviceAttestStatusRequest, DeviceAttestStatusResponse> DeviceAttestStatus();

    GrpcCall<DeviceAttestationCheckRequest, DeviceAttestationCheckResponse> DeviceAttestationCheck();

    GrpcCall<GenerateDeviceNonceRequest, GenerateDeviceNonceResponse> GenerateDeviceNonce();
}
