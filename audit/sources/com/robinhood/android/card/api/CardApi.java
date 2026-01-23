package com.robinhood.android.card.api;

import com.robinhood.models.card.api.ApiCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: CardApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/card/api/CardApi;", "", "getCardStack", "Lcom/robinhood/models/card/api/ApiCard$Stack;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissCard", "", "cardId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logCardImpression", "logCardClick", "lib-api-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CardApi {
    @POST("notifications/stack/{cardId}/dismiss/")
    Object dismissCard(@Path("cardId") String str, Continuation<? super Unit> continuation);

    @GET("notifications/stack/")
    Object getCardStack(Continuation<? super ApiCard.Stack> continuation);

    @POST("notifications/stack/{cardId}/click/")
    Object logCardClick(@Path("cardId") String str, Continuation<? super Unit> continuation);

    @POST("notifications/stack/{cardId}/impression/")
    Object logCardImpression(@Path("cardId") String str, Continuation<? super Unit> continuation);
}
