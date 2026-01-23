package com.robinhood.prediction_markets.proto.p361v1.combo;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: ComboServiceClient.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/ComboServiceClient;", "Lcom/squareup/wire/Service;", "CreateComboRFQ", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponse;", "GetComboProposals", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsRequest;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponse;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ComboServiceClient extends Service {
    GrpcCall<CreateComboRFQRequest, CreateComboRFQResponse> CreateComboRFQ();

    GrpcCall<GetComboProposalsRequest, GetComboProposalsResponse> GetComboProposals();
}
