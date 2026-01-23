package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishResponse;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u0006\u0010\u000bJ)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/plaid/internal/M6;", "", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;", "request", "Lcom/plaid/internal/b4;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishResponse;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;", "Lretrofit2/Call;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartResponse;", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;)Lretrofit2/Call;", "", "id", "vfp", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveFinishResponse;", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.plaid.internal.M6 */
/* loaded from: classes16.dex */
public interface InterfaceC5910M6 {
    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("/link/sna/twilio/finish")
    /* renamed from: a */
    Object m1257a(@Body SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest, Continuation<? super AbstractC6043b4<SilentNetworkAuth$LinkSNATwilioFinishResponse, ? extends Object>> continuation);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("link/sna/prove/start")
    /* renamed from: a */
    Call<SilentNetworkAuth$LinkSNAProveStartResponse> m1258a(@Body SilentNetworkAuth$LinkSNAProveStartRequest request);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @GET("link/sna/prove/finish")
    /* renamed from: a */
    Call<SilentNetworkAuth$LinkSNAProveFinishResponse> m1259a(@Query("id") String id, @Query("vfp") String vfp);
}
