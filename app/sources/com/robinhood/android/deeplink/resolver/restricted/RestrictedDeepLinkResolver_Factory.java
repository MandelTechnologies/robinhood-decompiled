package com.robinhood.android.deeplink.resolver.restricted;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.utils.ReleaseVersion;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictedDeepLinkResolver_Factory.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012Ba\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004\u0012\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver;", "navigatorLazy", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "Lkotlin/jvm/JvmSuppressWildcards;", "experimentsStoreLazy", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProviderLazy", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "idlDeeplinkResolverLazy", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RestrictedDeepLinkResolver_Factory implements Factory<RestrictedDeepLinkResolver> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ExperimentsStore> experimentsStoreLazy;
    private final Provider<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy;
    private final Provider<Navigator> navigatorLazy;
    private final Provider<RegionGateProvider> regionGateProviderLazy;
    private final Provider<ReleaseVersion> releaseVersion;

    @JvmStatic
    public static final RestrictedDeepLinkResolver_Factory create(Provider<Navigator> provider, Provider<ExperimentsStore> provider2, Provider<RegionGateProvider> provider3, Provider<IdlDeeplinkTargetResolver> provider4, Provider<ReleaseVersion> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final RestrictedDeepLinkResolver newInstance(Lazy<Navigator> lazy, Lazy<ExperimentsStore> lazy2, Lazy<RegionGateProvider> lazy3, Lazy<IdlDeeplinkTargetResolver> lazy4, ReleaseVersion releaseVersion) {
        return INSTANCE.newInstance(lazy, lazy2, lazy3, lazy4, releaseVersion);
    }

    public RestrictedDeepLinkResolver_Factory(Provider<Navigator> navigatorLazy, Provider<ExperimentsStore> experimentsStoreLazy, Provider<RegionGateProvider> regionGateProviderLazy, Provider<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, Provider<ReleaseVersion> releaseVersion) {
        Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
        Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
        Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
        Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        this.navigatorLazy = navigatorLazy;
        this.experimentsStoreLazy = experimentsStoreLazy;
        this.regionGateProviderLazy = regionGateProviderLazy;
        this.idlDeeplinkResolverLazy = idlDeeplinkResolverLazy;
        this.releaseVersion = releaseVersion;
    }

    @Override // javax.inject.Provider
    public RestrictedDeepLinkResolver get() {
        Companion companion = INSTANCE;
        Lazy<Navigator> lazy = DoubleCheck.lazy(this.navigatorLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<ExperimentsStore> lazy2 = DoubleCheck.lazy(this.experimentsStoreLazy);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        Lazy<RegionGateProvider> lazy3 = DoubleCheck.lazy(this.regionGateProviderLazy);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        Lazy<IdlDeeplinkTargetResolver> lazy4 = DoubleCheck.lazy(this.idlDeeplinkResolverLazy);
        Intrinsics.checkNotNullExpressionValue(lazy4, "lazy(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        return companion.newInstance(lazy, lazy2, lazy3, lazy4, releaseVersion);
    }

    /* compiled from: RestrictedDeepLinkResolver_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u00072\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u00072\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\t0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0007J\\\u0010\u0012\u001a\u00020\u00132\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00142\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\t0\u00142\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u00142\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\t0\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver_Factory;", "navigatorLazy", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "Lkotlin/jvm/JvmSuppressWildcards;", "experimentsStoreLazy", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProviderLazy", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "idlDeeplinkResolverLazy", "Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "newInstance", "Lcom/robinhood/android/deeplink/resolver/restricted/RestrictedDeepLinkResolver;", "Ldagger/Lazy;", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RestrictedDeepLinkResolver_Factory create(Provider<Navigator> navigatorLazy, Provider<ExperimentsStore> experimentsStoreLazy, Provider<RegionGateProvider> regionGateProviderLazy, Provider<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, Provider<ReleaseVersion> releaseVersion) {
            Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
            Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
            Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
            Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new RestrictedDeepLinkResolver_Factory(navigatorLazy, experimentsStoreLazy, regionGateProviderLazy, idlDeeplinkResolverLazy, releaseVersion);
        }

        @JvmStatic
        public final RestrictedDeepLinkResolver newInstance(Lazy<Navigator> navigatorLazy, Lazy<ExperimentsStore> experimentsStoreLazy, Lazy<RegionGateProvider> regionGateProviderLazy, Lazy<IdlDeeplinkTargetResolver> idlDeeplinkResolverLazy, ReleaseVersion releaseVersion) {
            Intrinsics.checkNotNullParameter(navigatorLazy, "navigatorLazy");
            Intrinsics.checkNotNullParameter(experimentsStoreLazy, "experimentsStoreLazy");
            Intrinsics.checkNotNullParameter(regionGateProviderLazy, "regionGateProviderLazy");
            Intrinsics.checkNotNullParameter(idlDeeplinkResolverLazy, "idlDeeplinkResolverLazy");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            return new RestrictedDeepLinkResolver(navigatorLazy, experimentsStoreLazy, regionGateProviderLazy, idlDeeplinkResolverLazy, releaseVersion);
        }
    }
}
