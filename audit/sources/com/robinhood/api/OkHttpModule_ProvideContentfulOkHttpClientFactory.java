package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.networking.OkHttpClientFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpModule_ProvideContentfulOkHttpClientFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule_ProvideContentfulOkHttpClientFactory;", "Ldagger/internal/Factory;", "Lokhttp3/OkHttpClient;", "cacheDirectory", "Ljavax/inject/Provider;", "Ljava/io/File;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "contentfulStagingInterceptor", "Lokhttp3/Interceptor;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OkHttpModule_ProvideContentfulOkHttpClientFactory implements Factory<OkHttpClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<File> cacheDirectory;
    private final Provider<Interceptor> contentfulStagingInterceptor;
    private final Provider<OkHttpClientFactory> factory;

    @JvmStatic
    public static final OkHttpModule_ProvideContentfulOkHttpClientFactory create(Provider<File> provider, Provider<OkHttpClientFactory> provider2, Provider<Interceptor> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final OkHttpClient provideContentfulOkHttpClient(File file, OkHttpClientFactory okHttpClientFactory, Interceptor interceptor) {
        return INSTANCE.provideContentfulOkHttpClient(file, okHttpClientFactory, interceptor);
    }

    public OkHttpModule_ProvideContentfulOkHttpClientFactory(Provider<File> cacheDirectory, Provider<OkHttpClientFactory> factory, Provider<Interceptor> contentfulStagingInterceptor) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(contentfulStagingInterceptor, "contentfulStagingInterceptor");
        this.cacheDirectory = cacheDirectory;
        this.factory = factory;
        this.contentfulStagingInterceptor = contentfulStagingInterceptor;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        Companion companion = INSTANCE;
        File file = this.cacheDirectory.get();
        Intrinsics.checkNotNullExpressionValue(file, "get(...)");
        OkHttpClientFactory okHttpClientFactory = this.factory.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClientFactory, "get(...)");
        Interceptor interceptor = this.contentfulStagingInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(interceptor, "get(...)");
        return companion.provideContentfulOkHttpClient(file, okHttpClientFactory, interceptor);
    }

    /* compiled from: OkHttpModule_ProvideContentfulOkHttpClientFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule_ProvideContentfulOkHttpClientFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/OkHttpModule_ProvideContentfulOkHttpClientFactory;", "cacheDirectory", "Ljavax/inject/Provider;", "Ljava/io/File;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "contentfulStagingInterceptor", "Lokhttp3/Interceptor;", "provideContentfulOkHttpClient", "Lokhttp3/OkHttpClient;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OkHttpModule_ProvideContentfulOkHttpClientFactory create(Provider<File> cacheDirectory, Provider<OkHttpClientFactory> factory, Provider<Interceptor> contentfulStagingInterceptor) {
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(contentfulStagingInterceptor, "contentfulStagingInterceptor");
            return new OkHttpModule_ProvideContentfulOkHttpClientFactory(cacheDirectory, factory, contentfulStagingInterceptor);
        }

        @JvmStatic
        public final OkHttpClient provideContentfulOkHttpClient(File cacheDirectory, OkHttpClientFactory factory, Interceptor contentfulStagingInterceptor) {
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(contentfulStagingInterceptor, "contentfulStagingInterceptor");
            Object objCheckNotNull = Preconditions.checkNotNull(OkHttpModule.INSTANCE.provideContentfulOkHttpClient(cacheDirectory, factory, contentfulStagingInterceptor), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (OkHttpClient) objCheckNotNull;
        }
    }
}
