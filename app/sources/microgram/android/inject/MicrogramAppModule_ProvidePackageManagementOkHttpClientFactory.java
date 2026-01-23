package microgram.android.inject;

import com.robinhood.networking.OkHttpClientFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* compiled from: MicrogramAppModule_ProvidePackageManagementOkHttpClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvidePackageManagementOkHttpClientFactory;", "Ldagger/internal/Factory;", "Lokhttp3/OkHttpClient;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class MicrogramAppModule_ProvidePackageManagementOkHttpClientFactory implements Factory<OkHttpClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final OkHttpClient providePackageManagementOkHttpClient(OkHttpClientFactory okHttpClientFactory, Cache cache2) {
        return INSTANCE.providePackageManagementOkHttpClient(okHttpClientFactory, cache2);
    }

    /* compiled from: MicrogramAppModule_ProvidePackageManagementOkHttpClientFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule_ProvidePackageManagementOkHttpClientFactory$Companion;", "", "<init>", "()V", "Lcom/robinhood/networking/OkHttpClientFactory;", "factory", "Lokhttp3/Cache;", "httpCache", "Lokhttp3/OkHttpClient;", "providePackageManagementOkHttpClient", "(Lcom/robinhood/networking/OkHttpClientFactory;Lokhttp3/Cache;)Lokhttp3/OkHttpClient;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OkHttpClient providePackageManagementOkHttpClient(OkHttpClientFactory factory, Cache httpCache) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(httpCache, "httpCache");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramAppModule.INSTANCE.providePackageManagementOkHttpClient(factory, httpCache), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (OkHttpClient) objCheckNotNull;
        }
    }
}
