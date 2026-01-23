package com.withpersona.sdk2.inquiry.network.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_ResponseInterceptorFactory implements Factory<Interceptor> {
    private final NetworkCoreModule module;

    public NetworkCoreModule_ResponseInterceptorFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_ResponseInterceptorFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_ResponseInterceptorFactory(networkCoreModule);
    }

    public static Interceptor responseInterceptor(NetworkCoreModule networkCoreModule) {
        return (Interceptor) Preconditions.checkNotNullFromProvides(networkCoreModule.responseInterceptor());
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return responseInterceptor(this.module);
    }
}
