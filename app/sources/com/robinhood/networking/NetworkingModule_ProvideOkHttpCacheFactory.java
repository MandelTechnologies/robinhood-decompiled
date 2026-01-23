package com.robinhood.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* compiled from: NetworkingModule_ProvideOkHttpCacheFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule_ProvideOkHttpCacheFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Cache;", "cacheDirectory", "Ljavax/inject/Provider;", "Ljava/io/File;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NetworkingModule_ProvideOkHttpCacheFactory implements Factory<Cache> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<File> cacheDirectory;

    @JvmStatic
    public static final NetworkingModule_ProvideOkHttpCacheFactory create(Provider<File> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Cache provideOkHttpCache(File file) {
        return INSTANCE.provideOkHttpCache(file);
    }

    public NetworkingModule_ProvideOkHttpCacheFactory(Provider<File> cacheDirectory) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        this.cacheDirectory = cacheDirectory;
    }

    @Override // javax.inject.Provider
    public Cache get() {
        Companion companion = INSTANCE;
        File file = this.cacheDirectory.get();
        Intrinsics.checkNotNullExpressionValue(file, "get(...)");
        return companion.provideOkHttpCache(file);
    }

    /* compiled from: NetworkingModule_ProvideOkHttpCacheFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule_ProvideOkHttpCacheFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/networking/NetworkingModule_ProvideOkHttpCacheFactory;", "cacheDirectory", "Ljavax/inject/Provider;", "Ljava/io/File;", "provideOkHttpCache", "Lokhttp3/Cache;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NetworkingModule_ProvideOkHttpCacheFactory create(Provider<File> cacheDirectory) {
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            return new NetworkingModule_ProvideOkHttpCacheFactory(cacheDirectory);
        }

        @JvmStatic
        public final Cache provideOkHttpCache(File cacheDirectory) {
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            Object objCheckNotNull = Preconditions.checkNotNull(NetworkingModule.INSTANCE.provideOkHttpCache(cacheDirectory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Cache) objCheckNotNull;
        }
    }
}
