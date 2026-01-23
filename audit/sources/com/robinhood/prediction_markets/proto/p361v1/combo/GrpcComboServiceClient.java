package com.robinhood.prediction_markets.proto.p361v1.combo;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcComboServiceClient.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GrpcComboServiceClient;", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "CreateComboRFQ", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponse;", "GetComboProposals", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponse;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcComboServiceClient implements ComboServiceClient {
    private final GrpcClient client;

    public GrpcComboServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboServiceClient
    public GrpcCall<CreateComboRFQRequest, CreateComboRFQResponse> CreateComboRFQ() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.ComboService/CreateComboRFQ", CreateComboRFQRequest.ADAPTER, CreateComboRFQResponse.ADAPTER));
    }

    @Override // com.robinhood.prediction_markets.proto.p361v1.combo.ComboServiceClient
    public GrpcCall<GetComboProposalsRequest, GetComboProposalsResponse> GetComboProposals() {
        return this.client.newCall(new GrpcMethod("/prediction_markets.v1.ComboService/GetComboProposals", GetComboProposalsRequest.ADAPTER, GetComboProposalsResponse.ADAPTER));
    }
}
