package com.salesforce.android.smi.remote.internal.api;

import com.salesforce.android.smi.remote.internal.adapters.InAppMoshi;
import com.salesforce.android.smi.remote.internal.api.config.RemoteConfigService;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.CustomHttpLoggingInterceptor;
import com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService;
import com.salesforce.android.smi.remote.internal.dto.response.ErrorBody;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/* compiled from: AbstractHttpService.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\n\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/AbstractHttpService;", "", "<init>", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "httpLogLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "errorBodyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/remote/internal/dto/response/ErrorBody;", "kotlin.jvm.PlatformType", "Lcom/squareup/moshi/JsonAdapter;", "convertErrorBody", "", "errorBody", "Lokhttp3/ResponseBody;", "loggingInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/CustomHttpLoggingInterceptor;", "getLoggingInterceptor", "()Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/CustomHttpLoggingInterceptor;", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "getOkHttpClientBuilder", "()Lokhttp3/OkHttpClient$Builder;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "getRetrofitBuilder", "()Lretrofit2/Retrofit$Builder;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class AbstractHttpService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final JsonAdapter<ErrorBody> errorBodyAdapter;
    private final HttpLoggingInterceptor.Level httpLogLevel;
    private final CustomHttpLoggingInterceptor loggingInterceptor;
    private final OkHttpClient.Builder okHttpClientBuilder;
    private final Retrofit.Builder retrofitBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractHttpService() {
        HttpLoggingInterceptor.Level level;
        Level level2 = Logger.getLogger("com.salesforce.android.smi").getLevel();
        if (Intrinsics.areEqual(level2, Level.OFF)) {
            level = HttpLoggingInterceptor.Level.NONE;
        } else if (Intrinsics.areEqual(level2, Level.INFO)) {
            level = HttpLoggingInterceptor.Level.BASIC;
        } else {
            level = Intrinsics.areEqual(level2, Level.ALL) ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.HEADERS;
        }
        this.httpLogLevel = level;
        this.errorBodyAdapter = getMoshi().adapter(ErrorBody.class);
        this.loggingInterceptor = new CustomHttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0).setLevel(level);
        Companion companion = INSTANCE;
        OkHttpClient.Builder builderOkHttpClientBuilder = companion.okHttpClientBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.okHttpClientBuilder = builderOkHttpClientBuilder.connectTimeout(20L, timeUnit).readTimeout(20L, timeUnit).writeTimeout(20L, timeUnit);
        this.retrofitBuilder = companion.retrofitBuilder();
    }

    public final Moshi getMoshi() {
        if ((this instanceof RemoteConfigService) || (this instanceof RestService) || (this instanceof ServerSentEventsService)) {
            return InAppMoshi.INSTANCE.getInstance();
        }
        Moshi moshiBuild = new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapter2()).build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    public final String convertErrorBody(ResponseBody errorBody) {
        String strString;
        if (errorBody != null && (strString = errorBody.string()) != null) {
            try {
                ErrorBody errorBodyFromJson = this.errorBodyAdapter.fromJson(strString);
                if (errorBodyFromJson != null) {
                    return errorBodyFromJson.getMessage();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final CustomHttpLoggingInterceptor getLoggingInterceptor() {
        return this.loggingInterceptor;
    }

    public final OkHttpClient.Builder getOkHttpClientBuilder() {
        return this.okHttpClientBuilder;
    }

    public final Retrofit.Builder getRetrofitBuilder() {
        return this.retrofitBuilder;
    }

    /* compiled from: AbstractHttpService.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/AbstractHttpService$Companion;", "", "<init>", "()V", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Retrofit.Builder retrofitBuilder() {
            return new Retrofit.Builder();
        }

        public final OkHttpClient.Builder okHttpClientBuilder() {
            return new OkHttpClient.Builder();
        }
    }
}
