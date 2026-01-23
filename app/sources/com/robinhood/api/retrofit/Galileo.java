package com.robinhood.api.retrofit;

import android.graphics.Bitmap;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* compiled from: Galileo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007JF\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Galileo;", "", "getCardImage", "Lcom/robinhood/utils/Optional;", "Landroid/graphics/Bitmap;", "url", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePin", "Lretrofit2/Response;", "", "submitterId", "", "pin", "pinRentry", "pinChangeKey", "(Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface Galileo {
    @FormUrlEncoded
    @POST
    Object changePin(@Url HttpUrl httpUrl, @Field("submitter_id") String str, @Field("pin") String str2, @Field("pin_reentry") String str3, @Field("pin_change_key") String str4, Continuation<? super Response<Unit>> continuation);

    @GET
    Object getCardImage(@Url HttpUrl httpUrl, Continuation<? super Optional<Bitmap>> continuation);
}
