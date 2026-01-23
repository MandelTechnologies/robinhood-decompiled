package com.robinhood.android.gdpr.manager;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.gdpr.GdprStore;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.api.odyssey.RegionApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: GdprManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#Bº\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c0\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R%\u0010\u001d\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/api/odyssey/RegionApi;", "regionApi", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "gdprStore", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "consentCache", "Lcom/robinhood/prefs/StringPreference;", "userLocalityPref", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/app/type/AppType;", "appType", "", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "Lkotlin/jvm/JvmSuppressWildcards;", "managedSdks", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/gdpr/manager/GdprManager;", "Ljavax/inject/Provider;", "Companion", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprManager_Factory implements Factory<GdprManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<Clock> clock;
    private final Provider<GdprConsentCache> consentCache;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GdprStore> gdprStore;
    private final Provider<Set<GdprManagedSdk>> managedSdks;
    private final Provider<Navigator> navigator;
    private final Provider<RegionApi> regionApi;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<StringPreference> userLocalityPref;

    @JvmStatic
    public static final GdprManager_Factory create(Provider<CoroutineScope> provider, Provider<AuthManager> provider2, Provider<Navigator> provider3, Provider<RegionApi> provider4, Provider<GdprStore> provider5, Provider<GdprConsentCache> provider6, Provider<StringPreference> provider7, Provider<EventLogger> provider8, Provider<Clock> provider9, Provider<ExperimentsStore> provider10, Provider<AppType> provider11, Provider<Set<GdprManagedSdk>> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final GdprManager newInstance(CoroutineScope coroutineScope, AuthManager authManager, Navigator navigator, RegionApi regionApi, GdprStore gdprStore, GdprConsentCache gdprConsentCache, StringPreference stringPreference, EventLogger eventLogger, Clock clock, ExperimentsStore experimentsStore, AppType appType, Set<GdprManagedSdk> set) {
        return INSTANCE.newInstance(coroutineScope, authManager, navigator, regionApi, gdprStore, gdprConsentCache, stringPreference, eventLogger, clock, experimentsStore, appType, set);
    }

    public GdprManager_Factory(Provider<CoroutineScope> rootCoroutineScope, Provider<AuthManager> authManager, Provider<Navigator> navigator, Provider<RegionApi> regionApi, Provider<GdprStore> gdprStore, Provider<GdprConsentCache> consentCache, Provider<StringPreference> userLocalityPref, Provider<EventLogger> eventLogger, Provider<Clock> clock, Provider<ExperimentsStore> experimentsStore, Provider<AppType> appType, Provider<Set<GdprManagedSdk>> managedSdks) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(regionApi, "regionApi");
        Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
        Intrinsics.checkNotNullParameter(consentCache, "consentCache");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(managedSdks, "managedSdks");
        this.rootCoroutineScope = rootCoroutineScope;
        this.authManager = authManager;
        this.navigator = navigator;
        this.regionApi = regionApi;
        this.gdprStore = gdprStore;
        this.consentCache = consentCache;
        this.userLocalityPref = userLocalityPref;
        this.eventLogger = eventLogger;
        this.clock = clock;
        this.experimentsStore = experimentsStore;
        this.appType = appType;
        this.managedSdks = managedSdks;
    }

    @Override // javax.inject.Provider
    public GdprManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        RegionApi regionApi = this.regionApi.get();
        Intrinsics.checkNotNullExpressionValue(regionApi, "get(...)");
        GdprStore gdprStore = this.gdprStore.get();
        Intrinsics.checkNotNullExpressionValue(gdprStore, "get(...)");
        GdprConsentCache gdprConsentCache = this.consentCache.get();
        Intrinsics.checkNotNullExpressionValue(gdprConsentCache, "get(...)");
        StringPreference stringPreference = this.userLocalityPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        Set<GdprManagedSdk> set = this.managedSdks.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        return companion.newInstance(coroutineScope, authManager, navigator, regionApi, gdprStore, gdprConsentCache, stringPreference, eventLogger, clock, experimentsStore, appType, set);
    }

    /* compiled from: GdprManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÂ\u0001\u0010 \u001a\u00020\u001f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0017\u0010\u001e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001d0\u0004H\u0007¢\u0006\u0004\b \u0010!Jz\u0010#\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/api/odyssey/RegionApi;", "regionApi", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "gdprStore", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "consentCache", "Lcom/robinhood/prefs/StringPreference;", "userLocalityPref", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/app/type/AppType;", "appType", "", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "Lkotlin/jvm/JvmSuppressWildcards;", "managedSdks", "Lcom/robinhood/android/gdpr/manager/GdprManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/gdpr/manager/GdprManager_Factory;", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "newInstance", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/api/odyssey/RegionApi;Lcom/robinhood/android/data/store/gdpr/GdprStore;Lcom/robinhood/android/gdpr/manager/GdprConsentCache;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/analytics/EventLogger;Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/app/type/AppType;Ljava/util/Set;)Lcom/robinhood/android/gdpr/manager/GdprManager;", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GdprManager_Factory create(Provider<CoroutineScope> rootCoroutineScope, Provider<AuthManager> authManager, Provider<Navigator> navigator, Provider<RegionApi> regionApi, Provider<GdprStore> gdprStore, Provider<GdprConsentCache> consentCache, Provider<StringPreference> userLocalityPref, Provider<EventLogger> eventLogger, Provider<Clock> clock, Provider<ExperimentsStore> experimentsStore, Provider<AppType> appType, Provider<Set<GdprManagedSdk>> managedSdks) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(regionApi, "regionApi");
            Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
            Intrinsics.checkNotNullParameter(consentCache, "consentCache");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(managedSdks, "managedSdks");
            return new GdprManager_Factory(rootCoroutineScope, authManager, navigator, regionApi, gdprStore, consentCache, userLocalityPref, eventLogger, clock, experimentsStore, appType, managedSdks);
        }

        @JvmStatic
        public final GdprManager newInstance(CoroutineScope rootCoroutineScope, AuthManager authManager, Navigator navigator, RegionApi regionApi, GdprStore gdprStore, GdprConsentCache consentCache, StringPreference userLocalityPref, EventLogger eventLogger, Clock clock, ExperimentsStore experimentsStore, AppType appType, Set<GdprManagedSdk> managedSdks) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(regionApi, "regionApi");
            Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
            Intrinsics.checkNotNullParameter(consentCache, "consentCache");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(managedSdks, "managedSdks");
            return new GdprManager(rootCoroutineScope, authManager, navigator, regionApi, gdprStore, consentCache, userLocalityPref, eventLogger, clock, experimentsStore, appType, managedSdks);
        }
    }
}
