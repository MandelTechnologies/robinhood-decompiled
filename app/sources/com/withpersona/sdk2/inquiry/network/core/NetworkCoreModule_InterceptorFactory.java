package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import okhttp3.Interceptor;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_InterceptorFactory implements Factory<Interceptor> {
    private final NetworkCoreModule module;
    private final Provider<Moshi> moshiProvider;

    public NetworkCoreModule_InterceptorFactory(NetworkCoreModule networkCoreModule, Provider<Moshi> provider) {
        this.module = networkCoreModule;
        this.moshiProvider = provider;
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider<Moshi> provider) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, Providers.asDaggerProvider(provider));
    }

    public static Interceptor interceptor(NetworkCoreModule networkCoreModule, Moshi moshi) {
        return (Interceptor) Preconditions.checkNotNullFromProvides(networkCoreModule.interceptor(moshi));
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, Provider<Moshi> provider) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, provider);
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return interceptor(this.module, this.moshiProvider.get());
    }
}
