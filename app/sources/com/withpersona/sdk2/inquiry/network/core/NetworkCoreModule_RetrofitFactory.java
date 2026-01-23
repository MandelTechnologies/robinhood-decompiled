package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_RetrofitFactory implements Factory<Retrofit> {
    private final NetworkCoreModule module;
    private final Provider<Moshi> moshiProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<String> serverEndpointProvider;

    public NetworkCoreModule_RetrofitFactory(NetworkCoreModule networkCoreModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<Moshi> provider3) {
        this.module = networkCoreModule;
        this.serverEndpointProvider = provider;
        this.okHttpClientProvider = provider2;
        this.moshiProvider = provider3;
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider<String> provider, javax.inject.Provider<OkHttpClient> provider2, javax.inject.Provider<Moshi> provider3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static Retrofit retrofit(NetworkCoreModule networkCoreModule, String str, OkHttpClient okHttpClient, Moshi moshi) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(networkCoreModule.retrofit(str, okHttpClient, moshi));
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<Moshi> provider3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, provider, provider2, provider3);
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return retrofit(this.module, this.serverEndpointProvider.get(), this.okHttpClientProvider.get(), this.moshiProvider.get());
    }
}
