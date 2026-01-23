package com.robinhood.android.engagement.lib.infolandingpage.api;

import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: InfoLandingPageApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/engagement/lib/infolandingpage/api/InfoLandingPageApi;", "", "getInfoLandingPage", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "pageId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-info-landing-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface InfoLandingPageApi {
    @GET("notifications/info-landing-page/{info_page_uuid}/")
    Object getInfoLandingPage(@Path("info_page_uuid") UUID uuid, Continuation<? super ApiRewardOfferDetails> continuation);
}
