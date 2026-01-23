package com.robinhood.contentful.repository;

import android.net.ConnectivityManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.contentful.api.S3ContentfulApi;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiContentRepository_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/repository/ApiContentRepository_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/repository/ApiContentRepository;", "supportedLocaleRepository", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "api", "Lcom/robinhood/contentful/api/S3ContentfulApi;", "connectivityManager", "Landroid/net/ConnectivityManager;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ApiContentRepository_Factory implements Factory<ApiContentRepository> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<S3ContentfulApi> api;
    private final Provider<ContentConfiguration> configuration;
    private final Provider<ConnectivityManager> connectivityManager;
    private final Provider<SupportedLocaleRepository> supportedLocaleRepository;

    @JvmStatic
    public static final ApiContentRepository_Factory create(Provider<SupportedLocaleRepository> provider, Provider<S3ContentfulApi> provider2, Provider<ConnectivityManager> provider3, Provider<ContentConfiguration> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ApiContentRepository newInstance(SupportedLocaleRepository supportedLocaleRepository, S3ContentfulApi s3ContentfulApi, ConnectivityManager connectivityManager, ContentConfiguration contentConfiguration) {
        return INSTANCE.newInstance(supportedLocaleRepository, s3ContentfulApi, connectivityManager, contentConfiguration);
    }

    public ApiContentRepository_Factory(Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<S3ContentfulApi> api, Provider<ConnectivityManager> connectivityManager, Provider<ContentConfiguration> configuration) {
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.api = api;
        this.connectivityManager = connectivityManager;
        this.configuration = configuration;
    }

    @Override // javax.inject.Provider
    public ApiContentRepository get() {
        Companion companion = INSTANCE;
        SupportedLocaleRepository supportedLocaleRepository = this.supportedLocaleRepository.get();
        Intrinsics.checkNotNullExpressionValue(supportedLocaleRepository, "get(...)");
        S3ContentfulApi s3ContentfulApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(s3ContentfulApi, "get(...)");
        ConnectivityManager connectivityManager = this.connectivityManager.get();
        Intrinsics.checkNotNullExpressionValue(connectivityManager, "get(...)");
        ContentConfiguration contentConfiguration = this.configuration.get();
        Intrinsics.checkNotNullExpressionValue(contentConfiguration, "get(...)");
        return companion.newInstance(supportedLocaleRepository, s3ContentfulApi, connectivityManager, contentConfiguration);
    }

    /* compiled from: ApiContentRepository_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/contentful/repository/ApiContentRepository_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/contentful/repository/ApiContentRepository_Factory;", "supportedLocaleRepository", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "api", "Lcom/robinhood/contentful/api/S3ContentfulApi;", "connectivityManager", "Landroid/net/ConnectivityManager;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "newInstance", "Lcom/robinhood/contentful/repository/ApiContentRepository;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApiContentRepository_Factory create(Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<S3ContentfulApi> api, Provider<ConnectivityManager> connectivityManager, Provider<ContentConfiguration> configuration) {
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ApiContentRepository_Factory(supportedLocaleRepository, api, connectivityManager, configuration);
        }

        @JvmStatic
        public final ApiContentRepository newInstance(SupportedLocaleRepository supportedLocaleRepository, S3ContentfulApi api, ConnectivityManager connectivityManager, ContentConfiguration configuration) {
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ApiContentRepository(supportedLocaleRepository, api, connectivityManager, configuration);
        }
    }
}
