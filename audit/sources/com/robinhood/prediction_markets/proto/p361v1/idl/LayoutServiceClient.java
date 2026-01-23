package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: LayoutServiceClient.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0003H&J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0003H&J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0003H&J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0003H&¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutServiceClient;", "Lcom/squareup/wire/Service;", "ListChildNavigationNodes", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListChildNavigationNodesResponse;", "GetLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponse;", "GetEventState", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponse;", "GetHighlights", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetHighlightsResponse;", "ListStrikes", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponse;", "GetSearchLayout", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponse;", "GetMarqueeEventsByNavId", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetMarqueeEventsByNavIdResponse;", "ListMarqueeEvents", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListMarqueeEventsResponse;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface LayoutServiceClient extends Service {
    GrpcCall<GetEventStateRequest, GetEventStateResponse> GetEventState();

    GrpcCall<GetHighlightsRequest, GetHighlightsResponse> GetHighlights();

    GrpcCall<GetLayoutRequest, GetLayoutResponse> GetLayout();

    GrpcCall<GetMarqueeEventsByNavIdRequest, GetMarqueeEventsByNavIdResponse> GetMarqueeEventsByNavId();

    GrpcCall<GetSearchLayoutRequest, GetSearchLayoutResponse> GetSearchLayout();

    GrpcCall<ListChildNavigationNodesRequest, ListChildNavigationNodesResponse> ListChildNavigationNodes();

    GrpcCall<ListMarqueeEventsRequest, ListMarqueeEventsResponse> ListMarqueeEvents();

    GrpcCall<ListStrikesRequest, ListStrikesResponse> ListStrikes();
}
