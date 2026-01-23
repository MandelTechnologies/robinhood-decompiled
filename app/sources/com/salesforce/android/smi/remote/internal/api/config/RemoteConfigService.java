package com.salesforce.android.smi.remote.internal.api.config;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.remote.internal.api.AbstractHttpService;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.RetryInterceptor;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: RemoteConfigService.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;", "Lcom/salesforce/android/smi/remote/internal/api/AbstractHttpService;", "Ljava/net/URL;", "baseUrl", "", "organizationId", "developerName", "", "remoteLocaleMap", "<init>", "(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Ljava/lang/String;", "Ljava/util/Map;", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "retryInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "Lokhttp3/OkHttpClient;", "httpClient", "Lokhttp3/OkHttpClient;", "Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigApi;", "api", "Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigApi;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RemoteConfigService extends AbstractHttpService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RemoteConfigApi api;
    private final String developerName;
    private final OkHttpClient httpClient;
    private final String organizationId;
    private final Map<String, String> remoteLocaleMap;
    private final RetryInterceptor retryInterceptor;

    public /* synthetic */ RemoteConfigService(URL url, String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, str, str2, map);
    }

    private RemoteConfigService(URL url, String str, String str2, Map<String, String> map) throws SecurityException {
        this.organizationId = str;
        this.developerName = str2;
        this.remoteLocaleMap = map;
        RetryInterceptor retryInterceptorCreate$default = RetryInterceptor.Companion.create$default(RetryInterceptor.INSTANCE, 0, 0, 3, null);
        this.retryInterceptor = retryInterceptorCreate$default;
        OkHttpClient okHttpClientBuild = getOkHttpClientBuilder().addInterceptor(getLoggingInterceptor()).addInterceptor(retryInterceptorCreate$default).build();
        this.httpClient = okHttpClientBuild;
        Object objCreate = getRetrofitBuilder().baseUrl(url).addConverterFactory(MoshiConverterFactory.create(getMoshi())).client(okHttpClientBuild).build().create(RemoteConfigApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.api = (RemoteConfigApi) objCreate;
    }

    /* compiled from: RemoteConfigService.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;", "baseUrl", "Ljava/net/URL;", "organizationId", "", "developerName", "remoteLocaleMap", "", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RemoteConfigService create(URL baseUrl, String organizationId, String developerName, Map<String, String> remoteLocaleMap) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(organizationId, "organizationId");
            Intrinsics.checkNotNullParameter(developerName, "developerName");
            Intrinsics.checkNotNullParameter(remoteLocaleMap, "remoteLocaleMap");
            return new RemoteConfigService(baseUrl, organizationId, developerName, remoteLocaleMap, null);
        }
    }
}
