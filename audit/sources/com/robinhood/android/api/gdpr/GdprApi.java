package com.robinhood.android.api.gdpr;

import com.robinhood.android.models.gdpr.api.ApiGdprConsent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: GdprApi.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/api/gdpr/GdprApi;", "", "getConsent", "Lcom/robinhood/android/models/gdpr/api/ApiGdprConsent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postConsent", "consent", "(Lcom/robinhood/android/models/gdpr/api/ApiGdprConsent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface GdprApi {
    @GET("user_info/privacy_consent/")
    Object getConsent(Continuation<? super ApiGdprConsent> continuation);

    @POST("user_info/privacy_consent/")
    Object postConsent(@Body ApiGdprConsent apiGdprConsent, Continuation<? super ApiGdprConsent> continuation);
}
