package com.robinhood.contentful;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.repository.ApiContentRepository;
import com.robinhood.contentful.repository.LocalContentRepository;
import com.robinhood.contentful.repository.PreloadedContentRepository;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticContentStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/StaticContentStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/StaticContentStore;", "supportedLocaleRepository", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "apiContentRepository", "Lcom/robinhood/contentful/repository/ApiContentRepository;", "localContentRepository", "Lcom/robinhood/contentful/repository/LocalContentRepository;", "preloadedContentRepository", "Lcom/robinhood/contentful/repository/PreloadedContentRepository;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class StaticContentStore_Factory implements Factory<StaticContentStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ApiContentRepository> apiContentRepository;
    private final Provider<LocalContentRepository> localContentRepository;
    private final Provider<PreloadedContentRepository> preloadedContentRepository;
    private final Provider<SupportedLocaleRepository> supportedLocaleRepository;

    @JvmStatic
    public static final StaticContentStore_Factory create(Provider<SupportedLocaleRepository> provider, Provider<ApiContentRepository> provider2, Provider<LocalContentRepository> provider3, Provider<PreloadedContentRepository> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final StaticContentStore newInstance(SupportedLocaleRepository supportedLocaleRepository, ApiContentRepository apiContentRepository, LocalContentRepository localContentRepository, PreloadedContentRepository preloadedContentRepository) {
        return INSTANCE.newInstance(supportedLocaleRepository, apiContentRepository, localContentRepository, preloadedContentRepository);
    }

    public StaticContentStore_Factory(Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<ApiContentRepository> apiContentRepository, Provider<LocalContentRepository> localContentRepository, Provider<PreloadedContentRepository> preloadedContentRepository) {
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(apiContentRepository, "apiContentRepository");
        Intrinsics.checkNotNullParameter(localContentRepository, "localContentRepository");
        Intrinsics.checkNotNullParameter(preloadedContentRepository, "preloadedContentRepository");
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.apiContentRepository = apiContentRepository;
        this.localContentRepository = localContentRepository;
        this.preloadedContentRepository = preloadedContentRepository;
    }

    @Override // javax.inject.Provider
    public StaticContentStore get() {
        Companion companion = INSTANCE;
        SupportedLocaleRepository supportedLocaleRepository = this.supportedLocaleRepository.get();
        Intrinsics.checkNotNullExpressionValue(supportedLocaleRepository, "get(...)");
        ApiContentRepository apiContentRepository = this.apiContentRepository.get();
        Intrinsics.checkNotNullExpressionValue(apiContentRepository, "get(...)");
        LocalContentRepository localContentRepository = this.localContentRepository.get();
        Intrinsics.checkNotNullExpressionValue(localContentRepository, "get(...)");
        PreloadedContentRepository preloadedContentRepository = this.preloadedContentRepository.get();
        Intrinsics.checkNotNullExpressionValue(preloadedContentRepository, "get(...)");
        return companion.newInstance(supportedLocaleRepository, apiContentRepository, localContentRepository, preloadedContentRepository);
    }

    /* compiled from: StaticContentStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/contentful/StaticContentStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/contentful/StaticContentStore_Factory;", "supportedLocaleRepository", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "apiContentRepository", "Lcom/robinhood/contentful/repository/ApiContentRepository;", "localContentRepository", "Lcom/robinhood/contentful/repository/LocalContentRepository;", "preloadedContentRepository", "Lcom/robinhood/contentful/repository/PreloadedContentRepository;", "newInstance", "Lcom/robinhood/contentful/StaticContentStore;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StaticContentStore_Factory create(Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<ApiContentRepository> apiContentRepository, Provider<LocalContentRepository> localContentRepository, Provider<PreloadedContentRepository> preloadedContentRepository) {
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(apiContentRepository, "apiContentRepository");
            Intrinsics.checkNotNullParameter(localContentRepository, "localContentRepository");
            Intrinsics.checkNotNullParameter(preloadedContentRepository, "preloadedContentRepository");
            return new StaticContentStore_Factory(supportedLocaleRepository, apiContentRepository, localContentRepository, preloadedContentRepository);
        }

        @JvmStatic
        public final StaticContentStore newInstance(SupportedLocaleRepository supportedLocaleRepository, ApiContentRepository apiContentRepository, LocalContentRepository localContentRepository, PreloadedContentRepository preloadedContentRepository) {
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(apiContentRepository, "apiContentRepository");
            Intrinsics.checkNotNullParameter(localContentRepository, "localContentRepository");
            Intrinsics.checkNotNullParameter(preloadedContentRepository, "preloadedContentRepository");
            return new StaticContentStore(supportedLocaleRepository, apiContentRepository, localContentRepository, preloadedContentRepository);
        }
    }
}
