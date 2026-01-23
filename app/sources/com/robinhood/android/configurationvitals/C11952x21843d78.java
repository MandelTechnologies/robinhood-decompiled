package com.robinhood.android.configurationvitals;

import bff_vitals.service.p021v1.BffVitalsService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.ReleaseVersion;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "vitalsService", "Ljavax/inject/Provider;", "Lbff_vitals/service/v1/BffVitalsService;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory */
/* loaded from: classes17.dex */
public final class C11952x21843d78 implements Factory<ConfigurationVitalsProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<BffVitalsService> vitalsService;

    @JvmStatic
    public static final C11952x21843d78 create(Provider<BffVitalsService> provider, Provider<AppType> provider2, Provider<ReleaseVersion> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ConfigurationVitalsProvider provideConfigurationVitalsProvider(BffVitalsService bffVitalsService, AppType appType, ReleaseVersion releaseVersion) {
        return INSTANCE.provideConfigurationVitalsProvider(bffVitalsService, appType, releaseVersion);
    }

    public C11952x21843d78(Provider<BffVitalsService> vitalsService, Provider<AppType> appType, Provider<ReleaseVersion> releaseVersion) {
        Intrinsics.checkNotNullParameter(vitalsService, "vitalsService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.vitalsService = vitalsService;
        this.appType = appType;
        this.releaseVersion = releaseVersion;
    }

    @Override // javax.inject.Provider
    public ConfigurationVitalsProvider get() {
        Companion companion = INSTANCE;
        BffVitalsService bffVitalsService = this.vitalsService.get();
        Intrinsics.checkNotNullExpressionValue(bffVitalsService, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        return companion.provideConfigurationVitalsProvider(bffVitalsService, appType, releaseVersion);
    }

    /* compiled from: ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory;", "vitalsService", "Ljavax/inject/Provider;", "Lbff_vitals/service/v1/BffVitalsService;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "provideConfigurationVitalsProvider", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.configurationvitals.ConfigurationVitalsProviderModule_ProvideConfigurationVitalsProviderFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C11952x21843d78 create(Provider<BffVitalsService> vitalsService, Provider<AppType> appType, Provider<ReleaseVersion> releaseVersion) {
            Intrinsics.checkNotNullParameter(vitalsService, "vitalsService");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new C11952x21843d78(vitalsService, appType, releaseVersion);
        }

        @JvmStatic
        public final ConfigurationVitalsProvider provideConfigurationVitalsProvider(BffVitalsService vitalsService, AppType appType, ReleaseVersion releaseVersion) {
            Intrinsics.checkNotNullParameter(vitalsService, "vitalsService");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Object objCheckNotNull = Preconditions.checkNotNull(ConfigurationVitalsProviderModule.INSTANCE.provideConfigurationVitalsProvider(vitalsService, appType, releaseVersion), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ConfigurationVitalsProvider) objCheckNotNull;
        }
    }
}
