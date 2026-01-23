package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: PrivateCompanyServiceClient.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyServiceClient;", "Lcom/squareup/wire/Service;", "ListPrivateCompanies", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/arsenal/proto/v1/idl/ListPrivateCompaniesRequest;", "Lcom/robinhood/arsenal/proto/v1/idl/ListPrivateCompaniesResponse;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface PrivateCompanyServiceClient extends Service {
    GrpcCall<ListPrivateCompaniesRequest, ListPrivateCompaniesResponse> ListPrivateCompanies();
}
