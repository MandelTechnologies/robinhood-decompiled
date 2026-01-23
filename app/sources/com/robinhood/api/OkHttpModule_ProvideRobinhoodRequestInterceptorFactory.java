package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.interceptor.RobinhoodRequestInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: OkHttpModule_ProvideRobinhoodRequestInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule_ProvideRobinhoodRequestInterceptorFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Interceptor;", "interceptor", "Ljavax/inject/Provider;", "Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OkHttpModule_ProvideRobinhoodRequestInterceptorFactory implements Factory<Interceptor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RobinhoodRequestInterceptor> interceptor;

    @JvmStatic
    public static final OkHttpModule_ProvideRobinhoodRequestInterceptorFactory create(Provider<RobinhoodRequestInterceptor> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Interceptor provideRobinhoodRequestInterceptor(RobinhoodRequestInterceptor robinhoodRequestInterceptor) {
        return INSTANCE.provideRobinhoodRequestInterceptor(robinhoodRequestInterceptor);
    }

    public OkHttpModule_ProvideRobinhoodRequestInterceptorFactory(Provider<RobinhoodRequestInterceptor> interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptor = interceptor;
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        Companion companion = INSTANCE;
        RobinhoodRequestInterceptor robinhoodRequestInterceptor = this.interceptor.get();
        Intrinsics.checkNotNullExpressionValue(robinhoodRequestInterceptor, "get(...)");
        return companion.provideRobinhoodRequestInterceptor(robinhoodRequestInterceptor);
    }

    /* compiled from: OkHttpModule_ProvideRobinhoodRequestInterceptorFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/OkHttpModule_ProvideRobinhoodRequestInterceptorFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/OkHttpModule_ProvideRobinhoodRequestInterceptorFactory;", "interceptor", "Ljavax/inject/Provider;", "Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor;", "provideRobinhoodRequestInterceptor", "Lokhttp3/Interceptor;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OkHttpModule_ProvideRobinhoodRequestInterceptorFactory create(Provider<RobinhoodRequestInterceptor> interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            return new OkHttpModule_ProvideRobinhoodRequestInterceptorFactory(interceptor);
        }

        @JvmStatic
        public final Interceptor provideRobinhoodRequestInterceptor(RobinhoodRequestInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Object objCheckNotNull = Preconditions.checkNotNull(OkHttpModule.INSTANCE.provideRobinhoodRequestInterceptor(interceptor), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Interceptor) objCheckNotNull;
        }
    }
}
