package com.robinhood.api.odyssey;

import com.robinhood.models.api.serverdrivenui.ApiSdComponentDataChangeResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* compiled from: OdysseyApi.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014JB\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\nJL\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\u000eJ,\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0011JB\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/api/odyssey/OdysseyApi;", "", "getSdFlow", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "version", "", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "flowPath", "queryParameters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitSdFlowPayload", "request", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;", "(Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateSdEntityValues", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "(Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitWorkflowEntities", "(Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-api-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface OdysseyApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String ODYSSEY_API_VERSION = "1.3";

    @Headers({"X-Robinhood-Client-Platform: android"})
    @GET("{path}/")
    Object getSdFlow(@Header("X-Robinhood-Server-Driven-API-Version") String str, @Header(com.robinhood.utils.http.Headers.DEVICE_ID) String str2, @Path(encoded = true, value = "path") String str3, @QueryMap Map<String, String> map, Continuation<? super ApiSdResponse> continuation);

    @Headers({"X-Robinhood-Client-Platform: android"})
    @POST("{path}/")
    Object submitSdFlowPayload(@Body ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest, @Header("X-Robinhood-Server-Driven-API-Version") String str, @Header(com.robinhood.utils.http.Headers.DEVICE_ID) String str2, @Path(encoded = true, value = "path") String str3, @QueryMap Map<String, String> map, Continuation<? super ApiSdResponse> continuation);

    @Headers({"X-Robinhood-Client-Platform: android"})
    @POST("workflow/")
    Object submitWorkflowEntities(@Body ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest, @Header("X-Robinhood-Server-Driven-API-Version") String str, @Header(com.robinhood.utils.http.Headers.DEVICE_ID) String str2, @QueryMap Map<String, String> map, Continuation<? super ApiSdResponse> continuation);

    @Headers({"X-Robinhood-Client-Platform: android"})
    @POST("onboarding/validation/")
    Object validateSdEntityValues(@Body ApiSdSubmitPayloadRequest apiSdSubmitPayloadRequest, @Header("X-Robinhood-Server-Driven-API-Version") String str, @Header(com.robinhood.utils.http.Headers.DEVICE_ID) String str2, Continuation<? super ApiSdComponentDataChangeResponse> continuation);

    /* compiled from: OdysseyApi.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/odyssey/OdysseyApi$Companion;", "", "<init>", "()V", "ODYSSEY_PLATFORM_HEADER", "", "ODYSSEY_API_VERSION_HEADER_KEY", "ODYSSEY_API_VERSION", "lib-api-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ODYSSEY_API_VERSION = "1.3";
        private static final String ODYSSEY_API_VERSION_HEADER_KEY = "X-Robinhood-Server-Driven-API-Version";
        private static final String ODYSSEY_PLATFORM_HEADER = "X-Robinhood-Client-Platform: android";

        private Companion() {
        }
    }
}
