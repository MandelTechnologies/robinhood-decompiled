package com.robinhood.baffi.proto.p282v1.publicservice;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcBaffiPublicServiceClient.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/GrpcBaffiPublicServiceClient;", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "GenerateDeviceNonce", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/GenerateDeviceNonceResponse;", "DeviceAttestStatus", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestStatusResponse;", "AttestDevice", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceResponse;", "DeviceAttestationCheck", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckRequest;", "Lcom/robinhood/baffi/proto/v1/publicservice/DeviceAttestationCheckResponse;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GrpcBaffiPublicServiceClient implements BaffiPublicServiceClient {
    private final GrpcClient client;

    public GrpcBaffiPublicServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicServiceClient
    public GrpcCall<GenerateDeviceNonceRequest, GenerateDeviceNonceResponse> GenerateDeviceNonce() {
        return this.client.newCall(new GrpcMethod("/baffi.service.v1.public.BaffiPublicService/GenerateDeviceNonce", GenerateDeviceNonceRequest.ADAPTER, GenerateDeviceNonceResponse.ADAPTER));
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicServiceClient
    public GrpcCall<DeviceAttestStatusRequest, DeviceAttestStatusResponse> DeviceAttestStatus() {
        return this.client.newCall(new GrpcMethod("/baffi.service.v1.public.BaffiPublicService/DeviceAttestStatus", DeviceAttestStatusRequest.ADAPTER, DeviceAttestStatusResponse.ADAPTER));
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicServiceClient
    public GrpcCall<AttestDeviceRequest, AttestDeviceResponse> AttestDevice() {
        return this.client.newCall(new GrpcMethod("/baffi.service.v1.public.BaffiPublicService/AttestDevice", AttestDeviceRequest.ADAPTER, AttestDeviceResponse.ADAPTER));
    }

    @Override // com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicServiceClient
    public GrpcCall<DeviceAttestationCheckRequest, DeviceAttestationCheckResponse> DeviceAttestationCheck() {
        return this.client.newCall(new GrpcMethod("/baffi.service.v1.public.BaffiPublicService/DeviceAttestationCheck", DeviceAttestationCheckRequest.ADAPTER, DeviceAttestationCheckResponse.ADAPTER));
    }
}
