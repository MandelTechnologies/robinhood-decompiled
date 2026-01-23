package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_MoshiFactory implements Factory<Moshi> {
    private final Provider<Set<JsonAdapterBinding<?>>> jsonAdapterBindingsProvider;
    private final Provider<Set<JsonAdapter.Factory>> jsonAdapterFactoryProvider;
    private final Provider<Set<Object>> jsonAdaptersProvider;
    private final NetworkCoreModule module;

    public NetworkCoreModule_MoshiFactory(NetworkCoreModule networkCoreModule, Provider<Set<Object>> provider, Provider<Set<JsonAdapterBinding<?>>> provider2, Provider<Set<JsonAdapter.Factory>> provider3) {
        this.module = networkCoreModule;
        this.jsonAdaptersProvider = provider;
        this.jsonAdapterBindingsProvider = provider2;
        this.jsonAdapterFactoryProvider = provider3;
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider<Set<Object>> provider, javax.inject.Provider<Set<JsonAdapterBinding<?>>> provider2, javax.inject.Provider<Set<JsonAdapter.Factory>> provider3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static Moshi moshi(NetworkCoreModule networkCoreModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<JsonAdapter.Factory> set3) {
        return (Moshi) Preconditions.checkNotNullFromProvides(networkCoreModule.moshi(set, set2, set3));
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, Provider<Set<Object>> provider, Provider<Set<JsonAdapterBinding<?>>> provider2, Provider<Set<JsonAdapter.Factory>> provider3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, provider, provider2, provider3);
    }

    @Override // javax.inject.Provider
    public Moshi get() {
        return moshi(this.module, this.jsonAdaptersProvider.get(), this.jsonAdapterBindingsProvider.get(), this.jsonAdapterFactoryProvider.get());
    }
}
