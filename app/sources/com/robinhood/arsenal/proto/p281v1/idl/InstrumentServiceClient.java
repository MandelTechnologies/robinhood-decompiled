package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: InstrumentServiceClient.kt */
@Metadata(m3635d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0003H&J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0003H&J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0003H&J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0003H&J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0003H&J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u0003H&J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u0003H&J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u0003H&J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0\u0003H&J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u0003H&J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\u0003H&J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020\u0003H&J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050\u0003H&J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002080\u0003H&J\u0014\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0\u0003H&J\u0014\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0\u0003H&J\u0014\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u0003H&¨\u0006B"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceClient;", "Lcom/squareup/wire/Service;", "GetFuturesContract", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "GetFuturesContractBySymbol", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolResponse;", "ListFuturesContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsResponse;", "GetFuturesContractWithTradability", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponse;", "GetFuturesProduct", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/Product;", "GetFuturesCombinedCommodity", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/CombinedCommodity;", "GetTradingHoursInfo", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfo;", "GetTradingSessions", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessions;", "GetMarginRequirement", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirement;", "ListFuturesProducts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsResponse;", "ListActiveFuturesContractSchedules", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesResponse;", "CountEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsResponse;", "CountEvents", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponse;", "GetEventContract", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "ListEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsResponse;", "ListEvents", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsResponse;", "GetEvent", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/Event;", "GetEventBracket", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracket;", "GetEventTopic", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "ListEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsResponse;", "ListRelevantEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsResponse;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface InstrumentServiceClient extends Service {
    GrpcCall<CountEventContractsRequest, CountEventContractsResponse> CountEventContracts();

    GrpcCall<CountEventsRequest, CountEventsResponse> CountEvents();

    GrpcCall<GetEventRequest, Event> GetEvent();

    GrpcCall<GetEventBracketRequest, EventBracket> GetEventBracket();

    GrpcCall<GetEventContractRequest, EventContract> GetEventContract();

    GrpcCall<GetEventTopicRequest, EventTopic> GetEventTopic();

    GrpcCall<GetFuturesCombinedCommodityRequest, CombinedCommodity> GetFuturesCombinedCommodity();

    GrpcCall<GetFuturesContractRequest, FuturesContract> GetFuturesContract();

    GrpcCall<GetFuturesContractBySymbolRequest, GetFuturesContractBySymbolResponse> GetFuturesContractBySymbol();

    GrpcCall<GetFuturesContractWithTradabilityRequest, GetFuturesContractWithTradabilityResponse> GetFuturesContractWithTradability();

    GrpcCall<GetFuturesProductRequest, Product> GetFuturesProduct();

    GrpcCall<GetMarginRequirementRequest, MarginRequirement> GetMarginRequirement();

    GrpcCall<GetTradingHoursInfoRequest, TradingHoursInfo> GetTradingHoursInfo();

    GrpcCall<GetTradingSessionsRequest, TradingSessions> GetTradingSessions();

    GrpcCall<ListActiveFuturesContractSchedulesRequest, ListActiveFuturesContractSchedulesResponse> ListActiveFuturesContractSchedules();

    GrpcCall<ListEventContractsRequest, ListEventContractsResponse> ListEventContracts();

    GrpcCall<ListEventTopicsRequest, ListEventTopicsResponse> ListEventTopics();

    GrpcCall<ListEventsRequest, ListEventsResponse> ListEvents();

    GrpcCall<ListFuturesContractsRequest, ListFuturesContractsResponse> ListFuturesContracts();

    GrpcCall<ListFuturesProductsRequest, ListFuturesProductsResponse> ListFuturesProducts();

    GrpcCall<ListRelevantEventTopicsRequest, ListRelevantEventTopicsResponse> ListRelevantEventTopics();
}
