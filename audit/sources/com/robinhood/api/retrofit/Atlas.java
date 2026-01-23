package com.robinhood.api.retrofit;

import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.ApiLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: Atlas.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Atlas;", "", "postLocation", "", "request", "", "Lcom/robinhood/models/api/ApiLocation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface Atlas {
    @POST("v1/location/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object postLocation(@Body List<ApiLocation> list, Continuation<? super Unit> continuation);
}
