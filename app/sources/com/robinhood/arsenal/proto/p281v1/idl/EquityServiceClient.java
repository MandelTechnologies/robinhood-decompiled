package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: EquityServiceClient.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;", "Lcom/squareup/wire/Service;", "ListEquityEventUpdates", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentEventUpdates;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface EquityServiceClient extends Service {
    GrpcCall<ListEquityEventUpdatesRequest, InstrumentEventUpdates> ListEquityEventUpdates();
}
