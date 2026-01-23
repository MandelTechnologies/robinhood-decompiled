package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import com.withpersona.sdk2.inquiry.device.DeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.logger.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Map;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes18.dex */
public final class NetworkCoreModule_OkhttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<Context> contextProvider;
    private final Provider<DeviceInfoProvider> deviceInfoProvider;
    private final Provider<DeviceVendorIDProvider> deviceVendorIDProvider;
    private final Provider<Map<String, String>> headersProvider;
    private final Provider<Set<Interceptor>> interceptorsProvider;
    private final Provider<Logger> loggerProvider;
    private final NetworkCoreModule module;

    public NetworkCoreModule_OkhttpClientFactory(NetworkCoreModule networkCoreModule, Provider<Set<Interceptor>> provider, Provider<Map<String, String>> provider2, Provider<Context> provider3, Provider<DeviceVendorIDProvider> provider4, Provider<DeviceInfoProvider> provider5, Provider<Logger> provider6) {
        this.module = networkCoreModule;
        this.interceptorsProvider = provider;
        this.headersProvider = provider2;
        this.contextProvider = provider3;
        this.deviceVendorIDProvider = provider4;
        this.deviceInfoProvider = provider5;
        this.loggerProvider = provider6;
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider<Set<Interceptor>> provider, javax.inject.Provider<Map<String, String>> provider2, javax.inject.Provider<Context> provider3, javax.inject.Provider<DeviceVendorIDProvider> provider4, javax.inject.Provider<DeviceInfoProvider> provider5, javax.inject.Provider<Logger> provider6) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static OkHttpClient okhttpClient(NetworkCoreModule networkCoreModule, Set<Interceptor> set, Map<String, String> map, Context context, DeviceVendorIDProvider deviceVendorIDProvider, DeviceInfoProvider deviceInfoProvider, Logger logger) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(networkCoreModule.okhttpClient(set, map, context, deviceVendorIDProvider, deviceInfoProvider, logger));
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, Provider<Set<Interceptor>> provider, Provider<Map<String, String>> provider2, Provider<Context> provider3, Provider<DeviceVendorIDProvider> provider4, Provider<DeviceInfoProvider> provider5, Provider<Logger> provider6) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return okhttpClient(this.module, this.interceptorsProvider.get(), this.headersProvider.get(), this.contextProvider.get(), this.deviceVendorIDProvider.get(), this.deviceInfoProvider.get(), this.loggerProvider.get());
    }
}
