package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcLayoutServiceClient.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0007H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0007H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0007H\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GrpcLayoutServiceClient;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "ListChildNavigationNodes", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesResponse;", "GetLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponse;", "GetEventState", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponse;", "GetHighlights", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsResponse;", "ListStrikes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponse;", "GetSearchLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponse;", "GetMarqueeEventsByNavId", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdResponse;", "ListMarqueeEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponse;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcLayoutServiceClient implements LayoutServiceClient {
    private final GrpcClient client;

    public GrpcLayoutServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<ListChildNavigationNodesRequest, ListChildNavigationNodesResponse> ListChildNavigationNodes() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/ListChildNavigationNodes", ListChildNavigationNodesRequest.ADAPTER, ListChildNavigationNodesResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<GetLayoutRequest, GetLayoutResponse> GetLayout() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/GetLayout", GetLayoutRequest.ADAPTER, GetLayoutResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<GetEventStateRequest, GetEventStateResponse> GetEventState() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/GetEventState", GetEventStateRequest.ADAPTER, GetEventStateResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<GetHighlightsRequest, GetHighlightsResponse> GetHighlights() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/GetHighlights", GetHighlightsRequest.ADAPTER, GetHighlightsResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<ListStrikesRequest, ListStrikesResponse> ListStrikes() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/ListStrikes", ListStrikesRequest.ADAPTER, ListStrikesResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<GetSearchLayoutRequest, GetSearchLayoutResponse> GetSearchLayout() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/GetSearchLayout", GetSearchLayoutRequest.ADAPTER, GetSearchLayoutResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<GetMarqueeEventsByNavIdRequest, GetMarqueeEventsByNavIdResponse> GetMarqueeEventsByNavId() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/GetMarqueeEventsByNavId", GetMarqueeEventsByNavIdRequest.ADAPTER, GetMarqueeEventsByNavIdResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.idl.LayoutServiceClient
    public GrpcCall<ListMarqueeEventsRequest, ListMarqueeEventsResponse> ListMarqueeEvents() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.LayoutService/ListMarqueeEvents", ListMarqueeEventsRequest.ADAPTER, ListMarqueeEventsResponse.ADAPTER));
    }
}
