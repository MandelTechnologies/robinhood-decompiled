package com.robinhood.shared.analytics.provisions;

import com.robinhood.analytics.interceptor.HttpCallEventInterceptor;
import com.robinhood.analytics.interceptor.NetworkErrorEventLogInterceptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.networking.interceptor.LogBodyInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory;", "Ldagger/internal/Factory;", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "loggingInterceptor", "Ljavax/inject/Provider;", "Lokhttp3/logging/HttpLoggingInterceptor;", "logBodyInterceptor", "Lcom/robinhood/networking/interceptor/LogBodyInterceptor;", "httpCallEventInterceptor", "Lcom/robinhood/analytics/interceptor/HttpCallEventInterceptor;", "networkErrorEventLogInterceptor", "Lcom/robinhood/analytics/interceptor/NetworkErrorEventLogInterceptor;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory implements Factory<List<Interceptor>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<HttpCallEventInterceptor> httpCallEventInterceptor;
    private final Provider<LogBodyInterceptor> logBodyInterceptor;
    private final Provider<HttpLoggingInterceptor> loggingInterceptor;
    private final Provider<NetworkErrorEventLogInterceptor> networkErrorEventLogInterceptor;

    @JvmStatic
    public static final AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory create(Provider<HttpLoggingInterceptor> provider, Provider<LogBodyInterceptor> provider2, Provider<HttpCallEventInterceptor> provider3, Provider<NetworkErrorEventLogInterceptor> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final List<Interceptor> provideMonitoringApplicationInterceptors(HttpLoggingInterceptor httpLoggingInterceptor, LogBodyInterceptor logBodyInterceptor, HttpCallEventInterceptor httpCallEventInterceptor, NetworkErrorEventLogInterceptor networkErrorEventLogInterceptor) {
        return INSTANCE.provideMonitoringApplicationInterceptors(httpLoggingInterceptor, logBodyInterceptor, httpCallEventInterceptor, networkErrorEventLogInterceptor);
    }

    public AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory(Provider<HttpLoggingInterceptor> loggingInterceptor, Provider<LogBodyInterceptor> logBodyInterceptor, Provider<HttpCallEventInterceptor> httpCallEventInterceptor, Provider<NetworkErrorEventLogInterceptor> networkErrorEventLogInterceptor) {
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(logBodyInterceptor, "logBodyInterceptor");
        Intrinsics.checkNotNullParameter(httpCallEventInterceptor, "httpCallEventInterceptor");
        Intrinsics.checkNotNullParameter(networkErrorEventLogInterceptor, "networkErrorEventLogInterceptor");
        this.loggingInterceptor = loggingInterceptor;
        this.logBodyInterceptor = logBodyInterceptor;
        this.httpCallEventInterceptor = httpCallEventInterceptor;
        this.networkErrorEventLogInterceptor = networkErrorEventLogInterceptor;
    }

    @Override // javax.inject.Provider
    public List<Interceptor> get() {
        Companion companion = INSTANCE;
        HttpLoggingInterceptor httpLoggingInterceptor = this.loggingInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(httpLoggingInterceptor, "get(...)");
        LogBodyInterceptor logBodyInterceptor = this.logBodyInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(logBodyInterceptor, "get(...)");
        HttpCallEventInterceptor httpCallEventInterceptor = this.httpCallEventInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(httpCallEventInterceptor, "get(...)");
        NetworkErrorEventLogInterceptor networkErrorEventLogInterceptor = this.networkErrorEventLogInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(networkErrorEventLogInterceptor, "get(...)");
        return companion.provideMonitoringApplicationInterceptors(httpLoggingInterceptor, logBodyInterceptor, httpCallEventInterceptor, networkErrorEventLogInterceptor);
    }

    /* compiled from: AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J3\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory;", "loggingInterceptor", "Ljavax/inject/Provider;", "Lokhttp3/logging/HttpLoggingInterceptor;", "logBodyInterceptor", "Lcom/robinhood/networking/interceptor/LogBodyInterceptor;", "httpCallEventInterceptor", "Lcom/robinhood/analytics/interceptor/HttpCallEventInterceptor;", "networkErrorEventLogInterceptor", "Lcom/robinhood/analytics/interceptor/NetworkErrorEventLogInterceptor;", "provideMonitoringApplicationInterceptors", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory create(Provider<HttpLoggingInterceptor> loggingInterceptor, Provider<LogBodyInterceptor> logBodyInterceptor, Provider<HttpCallEventInterceptor> httpCallEventInterceptor, Provider<NetworkErrorEventLogInterceptor> networkErrorEventLogInterceptor) {
            Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
            Intrinsics.checkNotNullParameter(logBodyInterceptor, "logBodyInterceptor");
            Intrinsics.checkNotNullParameter(httpCallEventInterceptor, "httpCallEventInterceptor");
            Intrinsics.checkNotNullParameter(networkErrorEventLogInterceptor, "networkErrorEventLogInterceptor");
            return new AnalyticsModule_ProvideMonitoringApplicationInterceptorsFactory(loggingInterceptor, logBodyInterceptor, httpCallEventInterceptor, networkErrorEventLogInterceptor);
        }

        @JvmStatic
        public final List<Interceptor> provideMonitoringApplicationInterceptors(HttpLoggingInterceptor loggingInterceptor, LogBodyInterceptor logBodyInterceptor, HttpCallEventInterceptor httpCallEventInterceptor, NetworkErrorEventLogInterceptor networkErrorEventLogInterceptor) {
            Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
            Intrinsics.checkNotNullParameter(logBodyInterceptor, "logBodyInterceptor");
            Intrinsics.checkNotNullParameter(httpCallEventInterceptor, "httpCallEventInterceptor");
            Intrinsics.checkNotNullParameter(networkErrorEventLogInterceptor, "networkErrorEventLogInterceptor");
            Object objCheckNotNull = Preconditions.checkNotNull(AnalyticsModule.INSTANCE.provideMonitoringApplicationInterceptors(loggingInterceptor, logBodyInterceptor, httpCallEventInterceptor, networkErrorEventLogInterceptor), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (List) objCheckNotNull;
        }
    }
}
