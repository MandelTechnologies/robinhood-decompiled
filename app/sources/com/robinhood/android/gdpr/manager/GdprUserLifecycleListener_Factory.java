package com.robinhood.android.gdpr.manager;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.gdpr.GdprStore;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GdprUserLifecycleListener_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "userLocalityPref", "Lcom/robinhood/prefs/StringPreference;", "gdprStore", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "consentCache", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprUserLifecycleListener_Factory implements Factory<GdprUserLifecycleListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<GdprConsentCache> consentCache;
    private final Provider<GdprStore> gdprStore;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<StringPreference> userLocalityPref;

    @JvmStatic
    public static final GdprUserLifecycleListener_Factory create(Provider<CoroutineScope> provider, Provider<StringPreference> provider2, Provider<GdprStore> provider3, Provider<GdprConsentCache> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final GdprUserLifecycleListener newInstance(CoroutineScope coroutineScope, StringPreference stringPreference, GdprStore gdprStore, GdprConsentCache gdprConsentCache) {
        return INSTANCE.newInstance(coroutineScope, stringPreference, gdprStore, gdprConsentCache);
    }

    public GdprUserLifecycleListener_Factory(Provider<CoroutineScope> rootCoroutineScope, Provider<StringPreference> userLocalityPref, Provider<GdprStore> gdprStore, Provider<GdprConsentCache> consentCache) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
        Intrinsics.checkNotNullParameter(consentCache, "consentCache");
        this.rootCoroutineScope = rootCoroutineScope;
        this.userLocalityPref = userLocalityPref;
        this.gdprStore = gdprStore;
        this.consentCache = consentCache;
    }

    @Override // javax.inject.Provider
    public GdprUserLifecycleListener get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        StringPreference stringPreference = this.userLocalityPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        GdprStore gdprStore = this.gdprStore.get();
        Intrinsics.checkNotNullExpressionValue(gdprStore, "get(...)");
        GdprConsentCache gdprConsentCache = this.consentCache.get();
        Intrinsics.checkNotNullExpressionValue(gdprConsentCache, "get(...)");
        return companion.newInstance(coroutineScope, stringPreference, gdprStore, gdprConsentCache);
    }

    /* compiled from: GdprUserLifecycleListener_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener_Factory;", "rootCoroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "userLocalityPref", "Lcom/robinhood/prefs/StringPreference;", "gdprStore", "Lcom/robinhood/android/data/store/gdpr/GdprStore;", "consentCache", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "newInstance", "Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener;", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GdprUserLifecycleListener_Factory create(Provider<CoroutineScope> rootCoroutineScope, Provider<StringPreference> userLocalityPref, Provider<GdprStore> gdprStore, Provider<GdprConsentCache> consentCache) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
            Intrinsics.checkNotNullParameter(consentCache, "consentCache");
            return new GdprUserLifecycleListener_Factory(rootCoroutineScope, userLocalityPref, gdprStore, consentCache);
        }

        @JvmStatic
        public final GdprUserLifecycleListener newInstance(CoroutineScope rootCoroutineScope, StringPreference userLocalityPref, GdprStore gdprStore, GdprConsentCache consentCache) {
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            Intrinsics.checkNotNullParameter(gdprStore, "gdprStore");
            Intrinsics.checkNotNullParameter(consentCache, "consentCache");
            return new GdprUserLifecycleListener(rootCoroutineScope, userLocalityPref, gdprStore, consentCache);
        }
    }
}
