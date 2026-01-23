package com.robinhood.referral.api;

import com.robinhood.models.api.ContactData;
import com.robinhood.models.api.ContactRecommendations;
import com.robinhood.models.api.ExcludePatternsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: ContactsApi.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0004¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/referral/api/ContactsApi;", "", "getContactRecommendations", "Lcom/robinhood/models/api/ContactRecommendations;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadContactsData", "", "request", "Lcom/robinhood/models/api/ContactData$Request;", "(Lcom/robinhood/models/api/ContactData$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadContactInvitesData", "getExcludePatters", "Lcom/robinhood/models/api/ExcludePatternsResponse;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ContactsApi {
    @GET("contacts/recommendations/")
    Object getContactRecommendations(Continuation<? super ContactRecommendations> continuation);

    @GET("contacts/exclude_patterns/")
    Object getExcludePatters(Continuation<? super ExcludePatternsResponse> continuation);

    @POST("contacts/invites/")
    Object uploadContactInvitesData(@Body ContactData.Request request, Continuation<? super Unit> continuation);

    @POST("contacts/")
    Object uploadContactsData(@Body ContactData.Request request, Continuation<? super Unit> continuation);
}
