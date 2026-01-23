package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcInstrumentServiceClient.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0007H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GrpcInstrumentServiceClient;", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "GetEventContract", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponse;", "ListEventContracts", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsResponse;", "GetEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventResponse;", "ListEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsResponse;", "GetContractDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponse;", "GetOrderFormDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponse;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcInstrumentServiceClient implements InstrumentServiceClient {
    private final GrpcClient client;

    public GrpcInstrumentServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentServiceClient
    public GrpcCall<GetEventContractRequest, GetEventContractResponse> GetEventContract() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.InstrumentService/GetEventContract", GetEventContractRequest.ADAPTER, GetEventContractResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentServiceClient
    public GrpcCall<ListEventContractsRequest, ListEventContractsResponse> ListEventContracts() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.InstrumentService/ListEventContracts", ListEventContractsRequest.ADAPTER, ListEventContractsResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentServiceClient
    public GrpcCall<GetEventRequest, GetEventResponse> GetEvent() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.InstrumentService/GetEvent", GetEventRequest.ADAPTER, GetEventResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentServiceClient
    public GrpcCall<ListEventsRequest, ListEventsResponse> ListEvents() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.InstrumentService/ListEvents", ListEventsRequest.ADAPTER, ListEventsResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentServiceClient
    public GrpcCall<GetContractDisplayDetailsRequest, GetContractDisplayDetailsResponse> GetContractDisplayDetails() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.InstrumentService/GetContractDisplayDetails", GetContractDisplayDetailsRequest.ADAPTER, GetContractDisplayDetailsResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentServiceClient
    public GrpcCall<GetOrderFormDisplayDetailsRequest, GetOrderFormDisplayDetailsResponse> GetOrderFormDisplayDetails() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.InstrumentService/GetOrderFormDisplayDetails", GetOrderFormDisplayDetailsRequest.ADAPTER, GetOrderFormDisplayDetailsResponse.ADAPTER));
    }
}
