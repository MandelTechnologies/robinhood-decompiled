package com.robinhood.shared.api.iac;

import com.robinhood.models.api.ApiIacActionRequest;
import com.robinhood.models.api.ApiIacStatusBannerResponse;
import com.robinhood.models.api.IacDismissMethod;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: IacStatusBannerApi.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/api/iac/IacStatusBannerApi;", "", "getIacStatusBanner", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacStatusBannerResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacStatusBannerSeen", "", "receiptUuid", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacStatusBannerTapped", "action", "Lcom/robinhood/models/api/ApiIacActionRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiIacActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacStatusBannerDismissed", "method", "Lcom/robinhood/models/api/IacDismissMethod;", "(Ljava/util/UUID;Lcom/robinhood/models/api/IacDismissMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IacStatusBannerApi {
    @GET("app-comms/surface/status-banner/")
    Object getIacStatusBanner(Continuation<? super Response<ApiIacStatusBannerResponse>> continuation);

    @POST("app-comms/receipt/dismiss/{uuid}/")
    Object postIacStatusBannerDismissed(@Path("uuid") UUID uuid, @Query("method") IacDismissMethod iacDismissMethod, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/seen/{uuid}/")
    Object postIacStatusBannerSeen(@Path("uuid") UUID uuid, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/tapped/{uuid}/")
    Object postIacStatusBannerTapped(@Path("uuid") UUID uuid, @Body ApiIacActionRequest apiIacActionRequest, Continuation<? super Unit> continuation);
}
