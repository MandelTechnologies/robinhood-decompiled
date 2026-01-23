package com.robinhood.contentful.repository;

import android.content.res.AssetManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.squareup.moshi.Moshi;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreloadedContentRepository_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/repository/PreloadedContentRepository_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/repository/PreloadedContentRepository;", "assetManager", "Ljavax/inject/Provider;", "Landroid/content/res/AssetManager;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PreloadedContentRepository_Factory implements Factory<PreloadedContentRepository> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AssetManager> assetManager;
    private final Provider<ContentConfiguration> configuration;
    private final Provider<Moshi> moshi;
    private final Provider<SupportedLocaleRepository> supportedLocaleRepository;

    @JvmStatic
    public static final PreloadedContentRepository_Factory create(Provider<AssetManager> provider, Provider<SupportedLocaleRepository> provider2, Provider<ContentConfiguration> provider3, Provider<Moshi> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final PreloadedContentRepository newInstance(AssetManager assetManager, SupportedLocaleRepository supportedLocaleRepository, ContentConfiguration contentConfiguration, Moshi moshi) {
        return INSTANCE.newInstance(assetManager, supportedLocaleRepository, contentConfiguration, moshi);
    }

    public PreloadedContentRepository_Factory(Provider<AssetManager> assetManager, Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<ContentConfiguration> configuration, Provider<Moshi> moshi) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.assetManager = assetManager;
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.configuration = configuration;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public PreloadedContentRepository get() {
        Companion companion = INSTANCE;
        AssetManager assetManager = this.assetManager.get();
        Intrinsics.checkNotNullExpressionValue(assetManager, "get(...)");
        SupportedLocaleRepository supportedLocaleRepository = this.supportedLocaleRepository.get();
        Intrinsics.checkNotNullExpressionValue(supportedLocaleRepository, "get(...)");
        ContentConfiguration contentConfiguration = this.configuration.get();
        Intrinsics.checkNotNullExpressionValue(contentConfiguration, "get(...)");
        Moshi moshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(moshi, "get(...)");
        return companion.newInstance(assetManager, supportedLocaleRepository, contentConfiguration, moshi);
    }

    /* compiled from: PreloadedContentRepository_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/contentful/repository/PreloadedContentRepository_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/contentful/repository/PreloadedContentRepository_Factory;", "assetManager", "Ljavax/inject/Provider;", "Landroid/content/res/AssetManager;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "moshi", "Lcom/squareup/moshi/Moshi;", "newInstance", "Lcom/robinhood/contentful/repository/PreloadedContentRepository;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PreloadedContentRepository_Factory create(Provider<AssetManager> assetManager, Provider<SupportedLocaleRepository> supportedLocaleRepository, Provider<ContentConfiguration> configuration, Provider<Moshi> moshi) {
            Intrinsics.checkNotNullParameter(assetManager, "assetManager");
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new PreloadedContentRepository_Factory(assetManager, supportedLocaleRepository, configuration, moshi);
        }

        @JvmStatic
        public final PreloadedContentRepository newInstance(AssetManager assetManager, SupportedLocaleRepository supportedLocaleRepository, ContentConfiguration configuration, Moshi moshi) {
            Intrinsics.checkNotNullParameter(assetManager, "assetManager");
            Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new PreloadedContentRepository(assetManager, supportedLocaleRepository, configuration, moshi);
        }
    }
}
