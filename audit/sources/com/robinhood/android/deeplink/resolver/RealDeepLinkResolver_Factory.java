package com.robinhood.android.deeplink.resolver;

import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.ReleaseVersion;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealDeepLinkResolver_Factory.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B \u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00060\u0004\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver;", "authManagerLazy", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigatorLazy", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStoreLazy", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProviderLazy", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLoggerLazy", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "idlDeeplinkResolverLazy", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "targets", "", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealDeepLinkResolver_Factory implements Factory<RealDeepLinkResolver> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AuthManager> authManagerLazy;
    private final Provider<DeeplinkEventLogger> eventLoggerLazy;
    private final Provider<ExperimentsStore> experimentsStoreLazy;
    private final Provider<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy;
    private final Provider<Navigator> navigatorLazy;
    private final Provider<RegionGateProvider> regionGateProviderLazy;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<Set<DeeplinkTarget4>> targets;

    @JvmStatic
    public static final RealDeepLinkResolver_Factory create(Provider<AuthManager> provider, Provider<Navigator> provider2, Provider<ExperimentsStore> provider3, Provider<RegionGateProvider> provider4, Provider<DeeplinkEventLogger> provider5, Provider<IdlDeeplinkTargetResolver> provider6, Provider<Set<DeeplinkTarget4>> provider7, Provider<ReleaseVersion> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final RealDeepLinkResolver newInstance(Lazy<AuthManager> lazy, Lazy<Navigator> lazy2, Lazy<ExperimentsStore> lazy3, Lazy<RegionGateProvider> lazy4, Lazy<DeeplinkEventLogger> lazy5, Lazy<IdlDeeplinkTargetResolver> lazy6, Lazy<Set<DeeplinkTarget4>> lazy7, ReleaseVersion releaseVersion) {
        return INSTANCE.newInstance(lazy, lazy2, lazy3, lazy4, lazy5, lazy6, lazy7, releaseVersion);
    }

    public RealDeepLinkResolver_Factory(Provider<AuthManager> authManagerLazy, Provider<Navigator> navigatorLazy, Provider<ExperimentsStore> experimentsStoreLazy, Provider<RegionGateProvider> regionGateProviderLazy, Provider<DeeplinkEventLogger> eventLoggerLazy, Provider<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, Provider<Set<DeeplinkTarget4>> targets, Provider<ReleaseVersion> releaseVersion) {
        Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
        Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
        Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
        Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
        Intrinsics.checkNotNullParameter(eventLoggerLazy, "eventLoggerLazy");
        Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
        Intrinsics.checkNotNullParameter(targets, "targets");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.authManagerLazy = authManagerLazy;
        this.navigatorLazy = navigatorLazy;
        this.experimentsStoreLazy = experimentsStoreLazy;
        this.regionGateProviderLazy = regionGateProviderLazy;
        this.eventLoggerLazy = eventLoggerLazy;
        this.idlDeeplinkResolverLazy = idlDeeplinkResolverLazy;
        this.targets = targets;
        this.releaseVersion = releaseVersion;
    }

    @Override // javax.inject.Provider
    public RealDeepLinkResolver get() {
        Companion companion = INSTANCE;
        Lazy<AuthManager> lazy = DoubleCheck.lazy(this.authManagerLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<Navigator> lazy2 = DoubleCheck.lazy(this.navigatorLazy);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        Lazy<ExperimentsStore> lazy3 = DoubleCheck.lazy(this.experimentsStoreLazy);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        Lazy<RegionGateProvider> lazy4 = DoubleCheck.lazy(this.regionGateProviderLazy);
        Intrinsics.checkNotNullExpressionValue(lazy4, "lazy(...)");
        Lazy<DeeplinkEventLogger> lazy5 = DoubleCheck.lazy(this.eventLoggerLazy);
        Intrinsics.checkNotNullExpressionValue(lazy5, "lazy(...)");
        Lazy<IdlDeeplinkTargetResolver> lazy6 = DoubleCheck.lazy(this.idlDeeplinkResolverLazy);
        Intrinsics.checkNotNullExpressionValue(lazy6, "lazy(...)");
        Lazy<Set<DeeplinkTarget4>> lazy7 = DoubleCheck.lazy(this.targets);
        Intrinsics.checkNotNullExpressionValue(lazy7, "lazy(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        return companion.newInstance(lazy, lazy2, lazy3, lazy4, lazy5, lazy6, lazy7, releaseVersion);
    }

    /* compiled from: RealDeepLinkResolver_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¡\u0001\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u00072\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u00072\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\t0\u00072\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\t0\u00072\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\t0\u00072\u0017\u0010\u0014\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\t0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007J\u009b\u0001\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u001b2\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u001b2\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u001b2\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\t0\u001b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\t0\u001b2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\t0\u001b2\u0017\u0010\u0014\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\t0\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver_Factory;", "authManagerLazy", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigatorLazy", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStoreLazy", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProviderLazy", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLoggerLazy", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "idlDeeplinkResolverLazy", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "targets", "", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "newInstance", "Lcom/robinhood/android/deeplink/resolver/RealDeepLinkResolver;", "Ldagger/Lazy;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealDeepLinkResolver_Factory create(Provider<AuthManager> authManagerLazy, Provider<Navigator> navigatorLazy, Provider<ExperimentsStore> experimentsStoreLazy, Provider<RegionGateProvider> regionGateProviderLazy, Provider<DeeplinkEventLogger> eventLoggerLazy, Provider<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, Provider<Set<DeeplinkTarget4>> targets, Provider<ReleaseVersion> releaseVersion) {
            Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
            Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
            Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
            Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
            Intrinsics.checkNotNullParameter(eventLoggerLazy, "eventLoggerLazy");
            Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
            Intrinsics.checkNotNullParameter(targets, "targets");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new RealDeepLinkResolver_Factory(authManagerLazy, navigatorLazy, experimentsStoreLazy, regionGateProviderLazy, eventLoggerLazy, idlDeeplinkResolverLazy, targets, releaseVersion);
        }

        @JvmStatic
        public final RealDeepLinkResolver newInstance(Lazy<AuthManager> authManagerLazy, Lazy<Navigator> navigatorLazy, Lazy<ExperimentsStore> experimentsStoreLazy, Lazy<RegionGateProvider> regionGateProviderLazy, Lazy<DeeplinkEventLogger> eventLoggerLazy, Lazy<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, Lazy<Set<DeeplinkTarget4>> targets, ReleaseVersion releaseVersion) {
            Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
            Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
            Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
            Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
            Intrinsics.checkNotNullParameter(eventLoggerLazy, "eventLoggerLazy");
            Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
            Intrinsics.checkNotNullParameter(targets, "targets");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new RealDeepLinkResolver(authManagerLazy, navigatorLazy, experimentsStoreLazy, regionGateProviderLazy, eventLoggerLazy, idlDeeplinkResolverLazy, targets, releaseVersion);
        }
    }
}
