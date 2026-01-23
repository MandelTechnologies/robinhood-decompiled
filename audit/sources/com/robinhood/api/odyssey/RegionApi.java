package com.robinhood.api.odyssey;

import com.robinhood.models.api.UserRegion;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: RegionApi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/api/odyssey/RegionApi;", "", "getUserRegion", "Lcom/robinhood/models/api/UserRegion;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-region_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RegionApi {
    @GET("region/")
    Object getUserRegion(Continuation<? super UserRegion> continuation);
}
