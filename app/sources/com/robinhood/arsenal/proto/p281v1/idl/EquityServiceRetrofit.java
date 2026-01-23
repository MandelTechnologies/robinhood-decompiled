package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: EquityServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceRetrofit;", "", "ListEquityEventUpdates", "Lretrofit2/Response;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentEventUpdatesDto;", "headers", "", "", "instrument_id", "page_size", "", "page_token", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes5.dex */
public interface EquityServiceRetrofit {
    @GET("arsenal/v1/equities/event_updates/{instrument_id}")
    Object ListEquityEventUpdates(@HeaderMap Map<String, String> map, @Path("instrument_id") @IdlField(protoType = "string") String str, @IdlField(protoType = "int32") @Query("pageSize") Integer num, @IdlField(protoType = "string") @Query("pageToken") String str2, Continuation<Response<InstrumentEventUpdatesDto>> continuation);
}
