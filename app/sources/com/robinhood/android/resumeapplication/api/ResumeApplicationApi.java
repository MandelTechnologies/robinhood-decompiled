package com.robinhood.android.resumeapplication.api;

import com.robinhood.models.api.bonfire.ResumeApplicationFullScreenTakeoverUpsell;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.http.Headers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* compiled from: ResumeApplicationApi.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/api/ResumeApplicationApi;", "", "getResumeApplicationContent", "Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResumeApplicationFullScreenTakeoverUpsell", "Lcom/robinhood/models/api/bonfire/ResumeApplicationFullScreenTakeoverUpsell;", "location", "Lcom/robinhood/models/db/IacAlertSheetLocation;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "(Lcom/robinhood/models/db/IacAlertSheetLocation;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface ResumeApplicationApi {
    @GET("onboarding/resume_application_enabled/")
    Object getResumeApplicationContent(Continuation<? super ResumeApplicationResponse> continuation);

    @GET("app-comms/surface/full-screen-takeover-upsell/")
    Object getResumeApplicationFullScreenTakeoverUpsell(@Query("location") IacAlertSheetLocation iacAlertSheetLocation, @Header(Headers.DEVICE_ID) String str, Continuation<? super ResumeApplicationFullScreenTakeoverUpsell> continuation);
}
