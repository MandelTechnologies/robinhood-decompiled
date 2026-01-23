package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcInstrumentServiceClient.kt */
@Metadata(m3635d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0007H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0007H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0007H\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0007H\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0007H\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0007H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0007H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0007H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u0007H\u0016J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000\u0007H\u0016J\u0014\u00101\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030\u0007H\u0016J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002060\u0007H\u0016J\u0014\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002090\u0007H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0\u0007H\u0016J\u0014\u0010=\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0\u0007H\u0016J\u0014\u0010@\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0\u0007H\u0016J\u0014\u0010C\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GrpcInstrumentServiceClient;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "GetFuturesContract", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "GetFuturesContractBySymbol", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolResponse;", "ListFuturesContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsResponse;", "GetFuturesContractWithTradability", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponse;", "GetFuturesProduct", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/Product;", "GetFuturesCombinedCommodity", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/CombinedCommodity;", "GetTradingHoursInfo", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfo;", "GetTradingSessions", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessions;", "GetMarginRequirement", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirement;", "ListFuturesProducts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsResponse;", "ListActiveFuturesContractSchedules", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesResponse;", "CountEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsResponse;", "CountEvents", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponse;", "GetEventContract", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "ListEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsResponse;", "ListEvents", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsResponse;", "GetEvent", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/Event;", "GetEventBracket", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "GetEventTopic", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "ListEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsResponse;", "ListRelevantEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsResponse;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GrpcInstrumentServiceClient implements InstrumentServiceClient {
    private final GrpcClient client;

    public GrpcInstrumentServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetFuturesContractRequest, FuturesContract> GetFuturesContract() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetFuturesContract", GetFuturesContractRequest.ADAPTER, FuturesContract.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetFuturesContractBySymbolRequest, GetFuturesContractBySymbolResponse> GetFuturesContractBySymbol() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetFuturesContractBySymbol", GetFuturesContractBySymbolRequest.ADAPTER, GetFuturesContractBySymbolResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListFuturesContractsRequest, ListFuturesContractsResponse> ListFuturesContracts() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListFuturesContracts", ListFuturesContractsRequest.ADAPTER, ListFuturesContractsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetFuturesContractWithTradabilityRequest, GetFuturesContractWithTradabilityResponse> GetFuturesContractWithTradability() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetFuturesContractWithTradability", GetFuturesContractWithTradabilityRequest.ADAPTER, GetFuturesContractWithTradabilityResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetFuturesProductRequest, Product> GetFuturesProduct() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetFuturesProduct", GetFuturesProductRequest.ADAPTER, Product.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetFuturesCombinedCommodityRequest, CombinedCommodity> GetFuturesCombinedCommodity() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetFuturesCombinedCommodity", GetFuturesCombinedCommodityRequest.ADAPTER, CombinedCommodity.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetTradingHoursInfoRequest, TradingHoursInfo> GetTradingHoursInfo() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetTradingHoursInfo", GetTradingHoursInfoRequest.ADAPTER, TradingHoursInfo.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetTradingSessionsRequest, TradingSessions> GetTradingSessions() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetTradingSessions", GetTradingSessionsRequest.ADAPTER, TradingSessions.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetMarginRequirementRequest, MarginRequirement> GetMarginRequirement() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetMarginRequirement", GetMarginRequirementRequest.ADAPTER, MarginRequirement.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListFuturesProductsRequest, ListFuturesProductsResponse> ListFuturesProducts() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListFuturesProducts", ListFuturesProductsRequest.ADAPTER, ListFuturesProductsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListActiveFuturesContractSchedulesRequest, ListActiveFuturesContractSchedulesResponse> ListActiveFuturesContractSchedules() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListActiveFuturesContractSchedules", ListActiveFuturesContractSchedulesRequest.ADAPTER, ListActiveFuturesContractSchedulesResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<CountEventContractsRequest, CountEventContractsResponse> CountEventContracts() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/CountEventContracts", CountEventContractsRequest.ADAPTER, CountEventContractsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<CountEventsRequest, CountEventsResponse> CountEvents() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/CountEvents", CountEventsRequest.ADAPTER, CountEventsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetEventContractRequest, EventContract> GetEventContract() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetEventContract", GetEventContractRequest.ADAPTER, EventContract.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListEventContractsRequest, ListEventContractsResponse> ListEventContracts() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListEventContracts", ListEventContractsRequest.ADAPTER, ListEventContractsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListEventsRequest, ListEventsResponse> ListEvents() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListEvents", ListEventsRequest.ADAPTER, ListEventsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetEventRequest, Event> GetEvent() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetEvent", GetEventRequest.ADAPTER, Event.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetEventBracketRequest, EventBracket> GetEventBracket() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetEventBracket", GetEventBracketRequest.ADAPTER, EventBracket.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<GetEventTopicRequest, EventTopic> GetEventTopic() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/GetEventTopic", GetEventTopicRequest.ADAPTER, EventTopic.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListEventTopicsRequest, ListEventTopicsResponse> ListEventTopics() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListEventTopics", ListEventTopicsRequest.ADAPTER, ListEventTopicsResponse.ADAPTER));
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentServiceClient
    public GrpcCall<ListRelevantEventTopicsRequest, ListRelevantEventTopicsResponse> ListRelevantEventTopics() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.InstrumentService/ListRelevantEventTopics", ListRelevantEventTopicsRequest.ADAPTER, ListRelevantEventTopicsResponse.ADAPTER));
    }
}
