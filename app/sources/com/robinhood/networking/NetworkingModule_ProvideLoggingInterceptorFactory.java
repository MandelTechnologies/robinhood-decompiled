package com.robinhood.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: NetworkingModule_ProvideLoggingInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule_ProvideLoggingInterceptorFactory;", "Ldagger/internal/Factory;", "Lokhttp3/logging/HttpLoggingInterceptor;", "logLevel", "Ljavax/inject/Provider;", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NetworkingModule_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<HttpLoggingInterceptor.Level> logLevel;

    @JvmStatic
    public static final NetworkingModule_ProvideLoggingInterceptorFactory create(Provider<HttpLoggingInterceptor.Level> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final HttpLoggingInterceptor provideLoggingInterceptor(HttpLoggingInterceptor.Level level) {
        return INSTANCE.provideLoggingInterceptor(level);
    }

    public NetworkingModule_ProvideLoggingInterceptorFactory(Provider<HttpLoggingInterceptor.Level> logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.logLevel = logLevel;
    }

    @Override // javax.inject.Provider
    public HttpLoggingInterceptor get() {
        Companion companion = INSTANCE;
        HttpLoggingInterceptor.Level level = this.logLevel.get();
        Intrinsics.checkNotNullExpressionValue(level, "get(...)");
        return companion.provideLoggingInterceptor(level);
    }

    /* compiled from: NetworkingModule_ProvideLoggingInterceptorFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/networking/NetworkingModule_ProvideLoggingInterceptorFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/networking/NetworkingModule_ProvideLoggingInterceptorFactory;", "logLevel", "Ljavax/inject/Provider;", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NetworkingModule_ProvideLoggingInterceptorFactory create(Provider<HttpLoggingInterceptor.Level> logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            return new NetworkingModule_ProvideLoggingInterceptorFactory(logLevel);
        }

        @JvmStatic
        public final HttpLoggingInterceptor provideLoggingInterceptor(HttpLoggingInterceptor.Level logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Object objCheckNotNull = Preconditions.checkNotNull(NetworkingModule.INSTANCE.provideLoggingInterceptor(logLevel), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (HttpLoggingInterceptor) objCheckNotNull;
        }
    }
}
