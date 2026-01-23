package com.robinhood.networking.interceptor;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: ApolloNetworkingModule_ProvideApolloInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/networking/interceptor/ApolloNetworkingModule_ProvideApolloInterceptorFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Interceptor;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideApolloInterceptor", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class ApolloNetworkingModule_ProvideApolloInterceptorFactory implements Factory<Interceptor> {
    public static final ApolloNetworkingModule_ProvideApolloInterceptorFactory INSTANCE = new ApolloNetworkingModule_ProvideApolloInterceptorFactory();

    private ApolloNetworkingModule_ProvideApolloInterceptorFactory() {
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideApolloInterceptor();
    }

    @JvmStatic
    public static final ApolloNetworkingModule_ProvideApolloInterceptorFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Interceptor provideApolloInterceptor() {
        Object objCheckNotNull = Preconditions.checkNotNull(ApolloNetworkingModule.INSTANCE.provideApolloInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Interceptor) objCheckNotNull;
    }
}
