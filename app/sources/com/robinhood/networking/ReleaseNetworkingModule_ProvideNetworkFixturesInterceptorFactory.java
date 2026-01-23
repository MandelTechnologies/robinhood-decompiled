package com.robinhood.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/networking/ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Interceptor;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideNetworkFixturesInterceptor", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory implements Factory<Interceptor> {
    public static final ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory INSTANCE = new ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory();

    private ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory() {
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideNetworkFixturesInterceptor();
    }

    @JvmStatic
    public static final ReleaseNetworkingModule_ProvideNetworkFixturesInterceptorFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Interceptor provideNetworkFixturesInterceptor() {
        Object objCheckNotNull = Preconditions.checkNotNull(ReleaseNetworkingModule.INSTANCE.provideNetworkFixturesInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Interceptor) objCheckNotNull;
    }
}
