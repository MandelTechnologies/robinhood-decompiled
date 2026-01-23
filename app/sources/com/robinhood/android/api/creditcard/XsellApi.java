package com.robinhood.android.api.creditcard;

import android.annotation.SuppressLint;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: XsellApi.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/XsellApi;", "", "validCreditApplicationInvites", "Lcom/robinhood/android/models/creditcard/api/graphql/GraphqlQueryResponse;", "Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteResponse;", "request", "Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteQueryRequest;", "(Lcom/robinhood/android/models/creditcard/api/graphql/ValidCreditApplicationInviteQueryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface XsellApi {
    @POST("graphql")
    @SuppressLint({"NoNewRetrofitEndpoints"})
    Object validCreditApplicationInvites(@Body ValidCreditApplicationInviteQueryRequest validCreditApplicationInviteQueryRequest, Continuation<? super GraphqlQueryResponse<ValidCreditApplicationInviteResponse>> continuation);
}
