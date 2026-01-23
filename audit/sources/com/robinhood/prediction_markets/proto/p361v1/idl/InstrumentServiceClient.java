package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: InstrumentServiceClient.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0003H&J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0003H&¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentServiceClient;", "Lcom/squareup/wire/Service;", "GetEventContract", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponse;", "ListEventContracts", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventContractsResponse;", "GetEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventResponse;", "ListEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListEventsResponse;", "GetContractDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponse;", "GetOrderFormDisplayDetails", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponse;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface InstrumentServiceClient extends Service {
    GrpcCall<GetContractDisplayDetailsRequest, GetContractDisplayDetailsResponse> GetContractDisplayDetails();

    GrpcCall<GetEventRequest, GetEventResponse> GetEvent();

    GrpcCall<GetEventContractRequest, GetEventContractResponse> GetEventContract();

    GrpcCall<GetOrderFormDisplayDetailsRequest, GetOrderFormDisplayDetailsResponse> GetOrderFormDisplayDetails();

    GrpcCall<ListEventContractsRequest, ListEventContractsResponse> ListEventContracts();

    GrpcCall<ListEventsRequest, ListEventsResponse> ListEvents();
}
