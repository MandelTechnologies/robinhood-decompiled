package com.robinhood.android.analytics.provisions;

import android.app.Application;
import android.content.res.Resources;
import com.robinhood.analytics.AdIdProvider;
import com.robinhood.analytics.AnalyticsBundle;
import com.robinhood.analytics.AnalyticsPrefs;
import com.robinhood.analytics.api.TraderAnalyticsApi;
import com.robinhood.analytics.dao.SharedEventLogDatabase;
import com.robinhood.analytics.dao.SharedLegacyEventDao;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.Installation;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AnalyticsModule_ProvideAnalyticsBundleFactory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B¼\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0019\u0010\u001c\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a¢\u0006\u0002\b\u001b0\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R'\u0010\u001c\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a¢\u0006\u0002\b\u001b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsBundleFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/AnalyticsBundle;", "Ljavax/inject/Provider;", "Landroid/app/Application;", "app", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/analytics/AdIdProvider;", "adIdProvider", "Lcom/robinhood/analytics/AnalyticsPrefs;", "analyticsPrefs", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "analytics", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "dao", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "Lkotlin/jvm/JvmSuppressWildcards;", "eventLogDatabase", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/analytics/AnalyticsBundle;", "Ljavax/inject/Provider;", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsModule_ProvideAnalyticsBundleFactory implements Factory<AnalyticsBundle> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AdIdProvider> adIdProvider;
    private final Provider<TraderAnalyticsApi> analytics;
    private final Provider<AnalyticsPrefs> analyticsPrefs;
    private final Provider<Application> app;
    private final Provider<Clock> clock;
    private final Provider<SharedLegacyEventDao> dao;
    private final Provider<SharedEventLogDatabase<?, ?>> eventLogDatabase;
    private final Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider;
    private final Provider<Installation> installation;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<Resources> resources;

    @JvmStatic
    public static final AnalyticsModule_ProvideAnalyticsBundleFactory create(Provider<Application> provider, Provider<Resources> provider2, Provider<LazyMoshi> provider3, Provider<AdIdProvider> provider4, Provider<AnalyticsPrefs> provider5, Provider<TraderAnalyticsApi> provider6, Provider<FirebaseAppInstanceIdProvider> provider7, Provider<Installation> provider8, Provider<ReleaseVersion> provider9, Provider<Clock> provider10, Provider<SharedLegacyEventDao> provider11, Provider<SharedEventLogDatabase<?, ?>> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final AnalyticsBundle provideAnalyticsBundle(Application application, Resources resources, LazyMoshi lazyMoshi, AdIdProvider adIdProvider, AnalyticsPrefs analyticsPrefs, TraderAnalyticsApi traderAnalyticsApi, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, Installation installation, ReleaseVersion releaseVersion, Clock clock, SharedLegacyEventDao sharedLegacyEventDao, SharedEventLogDatabase<?, ?> sharedEventLogDatabase) {
        return INSTANCE.provideAnalyticsBundle(application, resources, lazyMoshi, adIdProvider, analyticsPrefs, traderAnalyticsApi, firebaseAppInstanceIdProvider, installation, releaseVersion, clock, sharedLegacyEventDao, sharedEventLogDatabase);
    }

    public AnalyticsModule_ProvideAnalyticsBundleFactory(Provider<Application> app, Provider<Resources> resources, Provider<LazyMoshi> moshi, Provider<AdIdProvider> adIdProvider, Provider<AnalyticsPrefs> analyticsPrefs, Provider<TraderAnalyticsApi> analytics, Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider, Provider<Installation> installation, Provider<ReleaseVersion> releaseVersion, Provider<Clock> clock, Provider<SharedLegacyEventDao> dao, Provider<SharedEventLogDatabase<?, ?>> eventLogDatabase) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(analyticsPrefs, "analyticsPrefs");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
        this.app = app;
        this.resources = resources;
        this.moshi = moshi;
        this.adIdProvider = adIdProvider;
        this.analyticsPrefs = analyticsPrefs;
        this.analytics = analytics;
        this.firebaseAppInstanceIdProvider = firebaseAppInstanceIdProvider;
        this.installation = installation;
        this.releaseVersion = releaseVersion;
        this.clock = clock;
        this.dao = dao;
        this.eventLogDatabase = eventLogDatabase;
    }

    @Override // javax.inject.Provider
    public AnalyticsBundle get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        AdIdProvider adIdProvider = this.adIdProvider.get();
        Intrinsics.checkNotNullExpressionValue(adIdProvider, "get(...)");
        AnalyticsPrefs analyticsPrefs = this.analyticsPrefs.get();
        Intrinsics.checkNotNullExpressionValue(analyticsPrefs, "get(...)");
        TraderAnalyticsApi traderAnalyticsApi = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(traderAnalyticsApi, "get(...)");
        FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider = this.firebaseAppInstanceIdProvider.get();
        Intrinsics.checkNotNullExpressionValue(firebaseAppInstanceIdProvider, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SharedLegacyEventDao sharedLegacyEventDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(sharedLegacyEventDao, "get(...)");
        SharedEventLogDatabase<?, ?> sharedEventLogDatabase = this.eventLogDatabase.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogDatabase, "get(...)");
        return companion.provideAnalyticsBundle(application, resources, lazyMoshi, adIdProvider, analyticsPrefs, traderAnalyticsApi, firebaseAppInstanceIdProvider, installation, releaseVersion, clock, sharedLegacyEventDao, sharedEventLogDatabase);
    }

    /* compiled from: AnalyticsModule_ProvideAnalyticsBundleFactory.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÄ\u0001\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0019\u0010\u001d\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b¢\u0006\u0002\b\u001c0\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J|\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0013\u0010\u001d\u001a\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsBundleFactory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroid/app/Application;", "app", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/analytics/AdIdProvider;", "adIdProvider", "Lcom/robinhood/analytics/AnalyticsPrefs;", "analyticsPrefs", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "analytics", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "dao", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "Lkotlin/jvm/JvmSuppressWildcards;", "eventLogDatabase", "Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsBundleFactory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsBundleFactory;", "Lcom/robinhood/analytics/AnalyticsBundle;", "provideAnalyticsBundle", "(Landroid/app/Application;Landroid/content/res/Resources;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/analytics/AdIdProvider;Lcom/robinhood/analytics/AnalyticsPrefs;Lcom/robinhood/analytics/api/TraderAnalyticsApi;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lcom/robinhood/prefs/Installation;Lcom/robinhood/utils/ReleaseVersion;Lj$/time/Clock;Lcom/robinhood/analytics/dao/SharedLegacyEventDao;Lcom/robinhood/analytics/dao/SharedEventLogDatabase;)Lcom/robinhood/analytics/AnalyticsBundle;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalyticsModule_ProvideAnalyticsBundleFactory create(Provider<Application> app, Provider<Resources> resources, Provider<LazyMoshi> moshi, Provider<AdIdProvider> adIdProvider, Provider<AnalyticsPrefs> analyticsPrefs, Provider<TraderAnalyticsApi> analytics, Provider<FirebaseAppInstanceIdProvider> firebaseAppInstanceIdProvider, Provider<Installation> installation, Provider<ReleaseVersion> releaseVersion, Provider<Clock> clock, Provider<SharedLegacyEventDao> dao, Provider<SharedEventLogDatabase<?, ?>> eventLogDatabase) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
            Intrinsics.checkNotNullParameter(analyticsPrefs, "analyticsPrefs");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
            return new AnalyticsModule_ProvideAnalyticsBundleFactory(app, resources, moshi, adIdProvider, analyticsPrefs, analytics, firebaseAppInstanceIdProvider, installation, releaseVersion, clock, dao, eventLogDatabase);
        }

        @JvmStatic
        public final AnalyticsBundle provideAnalyticsBundle(Application app, Resources resources, LazyMoshi moshi, AdIdProvider adIdProvider, AnalyticsPrefs analyticsPrefs, TraderAnalyticsApi analytics, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, Installation installation, ReleaseVersion releaseVersion, Clock clock, SharedLegacyEventDao dao, SharedEventLogDatabase<?, ?> eventLogDatabase) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
            Intrinsics.checkNotNullParameter(analyticsPrefs, "analyticsPrefs");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
            Object objCheckNotNull = Preconditions.checkNotNull(AnalyticsModule.INSTANCE.provideAnalyticsBundle(app, resources, moshi, adIdProvider, analyticsPrefs, analytics, firebaseAppInstanceIdProvider, installation, releaseVersion, clock, dao, eventLogDatabase), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AnalyticsBundle) objCheckNotNull;
        }
    }
}
