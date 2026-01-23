package com.robinhood.shared.store.lists;

import com.robinhood.models.api.bonfire.ApiListsOrder;
import com.robinhood.models.api.bonfire.ApiSaveListOrderRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: ListsApi.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/store/lists/ListsApi;", "", "getOrderedLists", "Lcom/robinhood/models/api/bonfire/ApiListsOrder;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveListsOrder", "request", "Lcom/robinhood/models/api/bonfire/ApiSaveListOrderRequest;", "(Lcom/robinhood/models/api/bonfire/ApiSaveListOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface ListsApi {
    @GET("lists/order")
    Object getOrderedLists(Continuation<? super ApiListsOrder> continuation);

    @POST("lists/order")
    Object saveListsOrder(@Body ApiSaveListOrderRequest apiSaveListOrderRequest, Continuation<? super ApiListsOrder> continuation);
}
