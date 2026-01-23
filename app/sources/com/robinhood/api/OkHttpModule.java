package com.robinhood.api;

import com.robinhood.android.regiongate.RegionGateInterceptor;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.api.annotation.GalileoOkHttpClient;
import com.robinhood.api.interceptor.RobinhoodRequestInterceptor;
import com.robinhood.contentful.json.ContentfulOkHttpClient;
import com.robinhood.networking.OkHttpClientFactory;
import com.robinhood.networking.annotation.ContentfulStaging;
import com.robinhood.networking.annotation.RobinhoodInterceptor;
import com.robinhood.shared.security.auth.interceptor.OAuth401Interceptor;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationInterceptor;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.Preconditions4;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpModule.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J$\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule;", "", "<init>", "()V", "provideBrokebackOkHttpClient", "Lokhttp3/OkHttpClient;", "rhInterceptor", "Lokhttp3/Interceptor;", "oAuth401Interceptor", "Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor;", "regionGateInterceptor", "Lcom/robinhood/android/regiongate/RegionGateInterceptor;", "deviceAttestationInterceptor", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor;", "cache", "Lokhttp3/Cache;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "provideContentfulOkHttpClient", "cacheDirectory", "Ljava/io/File;", "contentfulStagingInterceptor", "provideGalileoOkHttpClient", "provideRobinhoodRequestInterceptor", "interceptor", "Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OkHttpModule {
    public static final OkHttpModule INSTANCE = new OkHttpModule();

    @RobinhoodInterceptor
    public final Interceptor provideRobinhoodRequestInterceptor(RobinhoodRequestInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        return interceptor;
    }

    private OkHttpModule() {
    }

    @BrokebackOkHttpClient
    public final OkHttpClient provideBrokebackOkHttpClient(@RobinhoodInterceptor Interceptor rhInterceptor, OAuth401Interceptor oAuth401Interceptor, RegionGateInterceptor regionGateInterceptor, DeviceAttestationInterceptor deviceAttestationInterceptor, Cache cache2, OkHttpClientFactory factory) {
        Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
        Intrinsics.checkNotNullParameter(oAuth401Interceptor, "oAuth401Interceptor");
        Intrinsics.checkNotNullParameter(regionGateInterceptor, "regionGateInterceptor");
        Intrinsics.checkNotNullParameter(deviceAttestationInterceptor, "deviceAttestationInterceptor");
        Intrinsics.checkNotNullParameter(cache2, "cache");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Preconditions4.checkNotOnMainThread(Preconditions.INSTANCE);
        return OkHttpClientFactory.newClient$default(factory, cache2, false, CollectionsKt.listOf((Object[]) new Interceptor[]{rhInterceptor, oAuth401Interceptor, regionGateInterceptor, deviceAttestationInterceptor}), 2, null);
    }

    @ContentfulOkHttpClient
    public final OkHttpClient provideContentfulOkHttpClient(@CacheDirectory File cacheDirectory, OkHttpClientFactory factory, @ContentfulStaging Interceptor contentfulStagingInterceptor) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(contentfulStagingInterceptor, "contentfulStagingInterceptor");
        Preconditions4.checkNotOnMainThread(Preconditions.INSTANCE);
        return OkHttpClientFactory.newClient$default(factory, new Cache(new File(cacheDirectory, "http-contentful"), 5242880L), false, CollectionsKt.listOf(contentfulStagingInterceptor), 2, null);
    }

    @GalileoOkHttpClient
    public final OkHttpClient provideGalileoOkHttpClient(OkHttpClientFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Preconditions4.checkNotOnMainThread(Preconditions.INSTANCE);
        return OkHttpClientFactory.newClient$default(factory, null, false, null, 5, null);
    }
}
