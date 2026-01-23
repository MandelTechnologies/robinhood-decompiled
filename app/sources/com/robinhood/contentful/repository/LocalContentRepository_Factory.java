package com.robinhood.contentful.repository;

import android.net.ConnectivityManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.squareup.moshi.Moshi;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalContentRepository_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/contentful/repository/LocalContentRepository_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/repository/LocalContentRepository;", "connectivityManager", "Ljavax/inject/Provider;", "Landroid/net/ConnectivityManager;", "cacheDirectory", "Ljava/io/File;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LocalContentRepository_Factory implements Factory<LocalContentRepository> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<File> cacheDirectory;
    private final Provider<ContentConfiguration> configuration;
    private final Provider<ConnectivityManager> connectivityManager;
    private final Provider<Moshi> moshi;
    private final Provider<SupportedLocaleRepository> supportedLocaleRepository;

    @JvmStatic
    public static final LocalContentRepository_Factory create(Provider<ConnectivityManager> provider, Provider<File> provider2, Provider<ContentConfiguration> provider3, Provider<SupportedLocaleRepository> provider4, Provider<Moshi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final LocalContentRepository newInstance(ConnectivityManager connectivityManager, File file, ContentConfiguration contentConfiguration, SupportedLocaleRepository supportedLocaleRepository, Moshi moshi) {
        return INSTANCE.newInstance(connectivityManager, file, contentConfiguration, supportedLocaleRepository, moshi);
    }

    public LocalContentRepository_Factory(Provider<ConnectivityManager> connectivityManager, Provider<File> cacheDirectory, Provider<ContentConfiguration> configuration, Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<Moshi> moshi) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.connectivityManager = connectivityManager;
        this.cacheDirectory = cacheDirectory;
        this.configuration = configuration;
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public LocalContentRepository get() {
        Companion companion = INSTANCE;
        ConnectivityManager connectivityManager = this.connectivityManager.get();
        Intrinsics.checkNotNullExpressionValue(connectivityManager, "get(...)");
        File file = this.cacheDirectory.get();
        Intrinsics.checkNotNullExpressionValue(file, "get(...)");
        ContentConfiguration contentConfiguration = this.configuration.get();
        Intrinsics.checkNotNullExpressionValue(contentConfiguration, "get(...)");
        SupportedLocaleRepository supportedLocaleRepository = this.supportedLocaleRepository.get();
        Intrinsics.checkNotNullExpressionValue(supportedLocaleRepository, "get(...)");
        Moshi moshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(moshi, "get(...)");
        return companion.newInstance(connectivityManager, file, contentConfiguration, supportedLocaleRepository, moshi);
    }

    /* compiled from: LocalContentRepository_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/contentful/repository/LocalContentRepository_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/contentful/repository/LocalContentRepository_Factory;", "connectivityManager", "Ljavax/inject/Provider;", "Landroid/net/ConnectivityManager;", "cacheDirectory", "Ljava/io/File;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "moshi", "Lcom/squareup/moshi/Moshi;", "newInstance", "Lcom/robinhood/contentful/repository/LocalContentRepository;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LocalContentRepository_Factory create(Provider<ConnectivityManager> connectivityManager, Provider<File> cacheDirectory, Provider<ContentConfiguration> configuration, Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<Moshi> moshi) {
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new LocalContentRepository_Factory(connectivityManager, cacheDirectory, configuration, supportedLocaleRepository, moshi);
        }

        @JvmStatic
        public final LocalContentRepository newInstance(ConnectivityManager connectivityManager, File cacheDirectory, ContentConfiguration configuration, SupportedLocaleRepository supportedLocaleRepository, Moshi moshi) {
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new LocalContentRepository(connectivityManager, cacheDirectory, configuration, supportedLocaleRepository, moshi);
        }
    }
}
