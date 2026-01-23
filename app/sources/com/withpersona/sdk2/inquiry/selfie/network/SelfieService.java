package com.withpersona.sdk2.inquiry.selfie.network;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/* compiled from: SelfieService.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfieService;", "", "transitionSelfieVerification", "Lretrofit2/Response;", "sessionToken", "", "inquiryId", CarResultComposable2.BODY, "", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface SelfieService {
    @Headers({"Accept: multipart/form-data"})
    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @Multipart
    Object transitionSelfieVerification(@Header("Authorization") String str, @Path("inquiryId") String str2, @Part List<MultipartBody.Part> list, Continuation<? super Response<?>> continuation);
}
