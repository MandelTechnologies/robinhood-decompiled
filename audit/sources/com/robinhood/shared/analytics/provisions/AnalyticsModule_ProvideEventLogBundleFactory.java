package com.robinhood.shared.analytics.provisions;

import android.app.Application;
import android.content.res.Resources;
import com.robinhood.analytics.AdIdProvider;
import com.robinhood.analytics.EventLogBundle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.Installation;
import com.robinhood.utils.ReleaseVersion;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsModule_ProvideEventLogBundleFactory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideEventLogBundleFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/EventLogBundle;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "resources", "Landroid/content/res/Resources;", "adIdProvider", "Lcom/robinhood/analytics/AdIdProvider;", "installation", "Lcom/robinhood/prefs/Installation;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AnalyticsModule_ProvideEventLogBundleFactory implements Factory<EventLogBundle> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdIdProvider> adIdProvider;
    private final Provider<Application> app;
    private final Provider<Installation> installation;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<Resources> resources;

    @JvmStatic
    public static final AnalyticsModule_ProvideEventLogBundleFactory create(Provider<Application> provider, Provider<Resources> provider2, Provider<AdIdProvider> provider3, Provider<Installation> provider4, Provider<ReleaseVersion> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final EventLogBundle provideEventLogBundle(Application application, Resources resources, AdIdProvider adIdProvider, Installation installation, ReleaseVersion releaseVersion) {
        return INSTANCE.provideEventLogBundle(application, resources, adIdProvider, installation, releaseVersion);
    }

    public AnalyticsModule_ProvideEventLogBundleFactory(Provider<Application> app, Provider<Resources> resources, Provider<AdIdProvider> adIdProvider, Provider<Installation> installation, Provider<ReleaseVersion> releaseVersion) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.app = app;
        this.resources = resources;
        this.adIdProvider = adIdProvider;
        this.installation = installation;
        this.releaseVersion = releaseVersion;
    }

    @Override // javax.inject.Provider
    public EventLogBundle get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        AdIdProvider adIdProvider = this.adIdProvider.get();
        Intrinsics.checkNotNullExpressionValue(adIdProvider, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        return companion.provideEventLogBundle(application, resources, adIdProvider, installation, releaseVersion);
    }

    /* compiled from: AnalyticsModule_ProvideEventLogBundleFactory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideEventLogBundleFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/analytics/provisions/AnalyticsModule_ProvideEventLogBundleFactory;", "app", "Ljavax/inject/Provider;", "Landroid/app/Application;", "resources", "Landroid/content/res/Resources;", "adIdProvider", "Lcom/robinhood/analytics/AdIdProvider;", "installation", "Lcom/robinhood/prefs/Installation;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "provideEventLogBundle", "Lcom/robinhood/analytics/EventLogBundle;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalyticsModule_ProvideEventLogBundleFactory create(Provider<Application> app, Provider<Resources> resources, Provider<AdIdProvider> adIdProvider, Provider<Installation> installation, Provider<ReleaseVersion> releaseVersion) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new AnalyticsModule_ProvideEventLogBundleFactory(app, resources, adIdProvider, installation, releaseVersion);
        }

        @JvmStatic
        public final EventLogBundle provideEventLogBundle(Application app, Resources resources, AdIdProvider adIdProvider, Installation installation, ReleaseVersion releaseVersion) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Object objCheckNotNull = Preconditions.checkNotNull(AnalyticsModule.INSTANCE.provideEventLogBundle(app, resources, adIdProvider, installation, releaseVersion), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EventLogBundle) objCheckNotNull;
        }
    }
}
