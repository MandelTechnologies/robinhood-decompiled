package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcEquityServiceClient.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityServiceClient;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "ListEquityEventUpdates", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentEventUpdates;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GrpcEquityServiceClient implements EquityServiceClient {
    private final GrpcClient client;

    public GrpcEquityServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.EquityServiceClient
    public GrpcCall<ListEquityEventUpdatesRequest, InstrumentEventUpdates> ListEquityEventUpdates() {
        return this.client.newCall(new GrpcMethod("/arsenal.public.EquityService/ListEquityEventUpdates", ListEquityEventUpdatesRequest.ADAPTER, InstrumentEventUpdates.ADAPTER));
    }
}
