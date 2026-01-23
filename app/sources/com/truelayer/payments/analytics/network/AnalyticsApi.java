package com.truelayer.payments.analytics.network;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Factory2;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import com.truelayer.payments.analytics.events.NetworkEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;

/* compiled from: AnalyticsApi.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/analytics/network/AnalyticsApi;", "", "uri", "Lokhttp3/HttpUrl;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/HttpUrl;Lokhttp3/OkHttpClient;)V", "apiService", "Lcom/truelayer/payments/analytics/network/AnalyticsApiService;", "bearerToken", "", "token", "track", "", "event", "Lcom/truelayer/payments/analytics/events/AnalyticsEvent;", "(Lcom/truelayer/payments/analytics/events/AnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AnalyticsApi {
    private final AnalyticsApiService apiService;

    /* compiled from: AnalyticsApi.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.analytics.network.AnalyticsApi", m3645f = "AnalyticsApi.kt", m3646l = {37}, m3647m = "track")
    /* renamed from: com.truelayer.payments.analytics.network.AnalyticsApi$track$1 */
    static final class C427131 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C427131(Continuation<? super C427131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsApi.this.track(null, this);
        }
    }

    public AnalyticsApi(HttpUrl uri, OkHttpClient client) throws SecurityException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(client, "client");
        Object objCreate = new Retrofit.Builder().client(client).addConverterFactory(Factory2.create(Json.INSTANCE, MediaType.INSTANCE.get("application/json"))).baseUrl(uri).build().create(AnalyticsApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.apiService = (AnalyticsApiService) objCreate;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object track(AnalyticsEvent analyticsEvent, Continuation<? super Boolean> continuation) {
        C427131 c427131;
        if (continuation instanceof C427131) {
            c427131 = (C427131) continuation;
            int i = c427131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427131.label = i - Integer.MIN_VALUE;
            } else {
                c427131 = new C427131(continuation);
            }
        }
        Object objEvent = c427131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objEvent);
            Json.Companion companion = Json.INSTANCE;
            String data = analyticsEvent.getData();
            companion.getSerializersModule();
            NetworkEvent networkEvent = (NetworkEvent) companion.decodeFromString(NetworkEvent.INSTANCE.serializer(), data);
            NetworkEvent networkEventCopy$default = NetworkEvent.copy$default(networkEvent, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554427, null);
            AnalyticsApiService analyticsApiService = this.apiService;
            String strBearerToken = bearerToken(networkEvent.getResourceToken());
            c427131.label = 1;
            objEvent = analyticsApiService.event(strBearerToken, networkEventCopy$default, c427131);
            if (objEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objEvent);
        }
        Response response = (Response) objEvent;
        int iCode = response.code();
        if (400 <= iCode && iCode < 500) {
            throw new HttpException(response);
        }
        return boxing.boxBoolean(response.isSuccessful());
    }

    private final String bearerToken(String token) {
        if (StringsKt.startsWith$default(token, "Bearer ", false, 2, (Object) null)) {
            return token;
        }
        return "Bearer " + token;
    }
}
