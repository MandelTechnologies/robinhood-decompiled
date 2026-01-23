package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateInterceptor;
import com.robinhood.networking.OkHttpClientFactory;
import com.robinhood.shared.security.auth.interceptor.OAuth401Interceptor;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpModule_ProvideBrokebackOkHttpClientFactory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule_ProvideBrokebackOkHttpClientFactory;", "Ldagger/internal/Factory;", "Lokhttp3/OkHttpClient;", "rhInterceptor", "Ljavax/inject/Provider;", "Lokhttp3/Interceptor;", "oAuth401Interceptor", "Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor;", "regionGateInterceptor", "Lcom/robinhood/android/regiongate/RegionGateInterceptor;", "deviceAttestationInterceptor", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor;", "cache", "Lokhttp3/Cache;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OkHttpModule_ProvideBrokebackOkHttpClientFactory implements Factory<OkHttpClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Cache> cache;
    private final Provider<DeviceAttestationInterceptor> deviceAttestationInterceptor;
    private final Provider<OkHttpClientFactory> factory;
    private final Provider<OAuth401Interceptor> oAuth401Interceptor;
    private final Provider<RegionGateInterceptor> regionGateInterceptor;
    private final Provider<Interceptor> rhInterceptor;

    @JvmStatic
    public static final OkHttpModule_ProvideBrokebackOkHttpClientFactory create(Provider<Interceptor> provider, Provider<OAuth401Interceptor> provider2, Provider<RegionGateInterceptor> provider3, Provider<DeviceAttestationInterceptor> provider4, Provider<Cache> provider5, Provider<OkHttpClientFactory> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OkHttpClient provideBrokebackOkHttpClient(Interceptor interceptor, OAuth401Interceptor oAuth401Interceptor, RegionGateInterceptor regionGateInterceptor, DeviceAttestationInterceptor deviceAttestationInterceptor, Cache cache2, OkHttpClientFactory okHttpClientFactory) {
        return INSTANCE.provideBrokebackOkHttpClient(interceptor, oAuth401Interceptor, regionGateInterceptor, deviceAttestationInterceptor, cache2, okHttpClientFactory);
    }

    public OkHttpModule_ProvideBrokebackOkHttpClientFactory(Provider<Interceptor> rhInterceptor, Provider<OAuth401Interceptor> oAuth401Interceptor, Provider<RegionGateInterceptor> regionGateInterceptor, Provider<DeviceAttestationInterceptor> deviceAttestationInterceptor, Provider<Cache> cache2, Provider<OkHttpClientFactory> factory) {
        Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
        Intrinsics.checkNotNullParameter(oAuth401Interceptor, "oAuth401Interceptor");
        Intrinsics.checkNotNullParameter(regionGateInterceptor, "regionGateInterceptor");
        Intrinsics.checkNotNullParameter(deviceAttestationInterceptor, "deviceAttestationInterceptor");
        Intrinsics.checkNotNullParameter(cache2, "cache");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.rhInterceptor = rhInterceptor;
        this.oAuth401Interceptor = oAuth401Interceptor;
        this.regionGateInterceptor = regionGateInterceptor;
        this.deviceAttestationInterceptor = deviceAttestationInterceptor;
        this.cache = cache2;
        this.factory = factory;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        Companion companion = INSTANCE;
        Interceptor interceptor = this.rhInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor, "get(...)");
        OAuth401Interceptor oAuth401Interceptor = this.oAuth401Interceptor.get();
        Intrinsics.checkNotNullExpressionValue(oAuth401Interceptor, "get(...)");
        RegionGateInterceptor regionGateInterceptor = this.regionGateInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(regionGateInterceptor, "get(...)");
        DeviceAttestationInterceptor deviceAttestationInterceptor = this.deviceAttestationInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(deviceAttestationInterceptor, "get(...)");
        Cache cache2 = this.cache.get();
        Intrinsics.checkNotNullExpressionValue(cache2, "get(...)");
        OkHttpClientFactory okHttpClientFactory = this.factory.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClientFactory, "get(...)");
        return companion.provideBrokebackOkHttpClient(interceptor, oAuth401Interceptor, regionGateInterceptor, deviceAttestationInterceptor, cache2, okHttpClientFactory);
    }

    /* compiled from: OkHttpModule_ProvideBrokebackOkHttpClientFactory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule_ProvideBrokebackOkHttpClientFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/OkHttpModule_ProvideBrokebackOkHttpClientFactory;", "rhInterceptor", "Ljavax/inject/Provider;", "Lokhttp3/Interceptor;", "oAuth401Interceptor", "Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor;", "regionGateInterceptor", "Lcom/robinhood/android/regiongate/RegionGateInterceptor;", "deviceAttestationInterceptor", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor;", "cache", "Lokhttp3/Cache;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "provideBrokebackOkHttpClient", "Lokhttp3/OkHttpClient;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OkHttpModule_ProvideBrokebackOkHttpClientFactory create(Provider<Interceptor> rhInterceptor, Provider<OAuth401Interceptor> oAuth401Interceptor, Provider<RegionGateInterceptor> regionGateInterceptor, Provider<DeviceAttestationInterceptor> deviceAttestationInterceptor, Provider<Cache> cache2, Provider<OkHttpClientFactory> factory) {
            Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
            Intrinsics.checkNotNullParameter(oAuth401Interceptor, "oAuth401Interceptor");
            Intrinsics.checkNotNullParameter(regionGateInterceptor, "regionGateInterceptor");
            Intrinsics.checkNotNullParameter(deviceAttestationInterceptor, "deviceAttestationInterceptor");
            Intrinsics.checkNotNullParameter(cache2, "cache");
            Intrinsics.checkNotNullParameter(factory, "factory");
            return new OkHttpModule_ProvideBrokebackOkHttpClientFactory(rhInterceptor, oAuth401Interceptor, regionGateInterceptor, deviceAttestationInterceptor, cache2, factory);
        }

        @JvmStatic
        public final OkHttpClient provideBrokebackOkHttpClient(Interceptor rhInterceptor, OAuth401Interceptor oAuth401Interceptor, RegionGateInterceptor regionGateInterceptor, DeviceAttestationInterceptor deviceAttestationInterceptor, Cache cache2, OkHttpClientFactory factory) {
            Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
            Intrinsics.checkNotNullParameter(oAuth401Interceptor, "oAuth401Interceptor");
            Intrinsics.checkNotNullParameter(regionGateInterceptor, "regionGateInterceptor");
            Intrinsics.checkNotNullParameter(deviceAttestationInterceptor, "deviceAttestationInterceptor");
            Intrinsics.checkNotNullParameter(cache2, "cache");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object objCheckNotNull = Preconditions.checkNotNull(OkHttpModule.INSTANCE.provideBrokebackOkHttpClient(rhInterceptor, oAuth401Interceptor, regionGateInterceptor, deviceAttestationInterceptor, cache2, factory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (OkHttpClient) objCheckNotNull;
        }
    }
}
