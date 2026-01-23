package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class FallbackModeApiController_Factory implements Factory<FallbackModeApiController> {
    private final Provider<Moshi> moshiProvider;
    private final Provider<FallbackModeService> serviceProvider;
    private final Provider<StaticTemplateSession.Factory> staticTemplateSessionFactoryProvider;

    public FallbackModeApiController_Factory(Provider<FallbackModeService> provider, Provider<Moshi> provider2, Provider<StaticTemplateSession.Factory> provider3) {
        this.serviceProvider = provider;
        this.moshiProvider = provider2;
        this.staticTemplateSessionFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public FallbackModeApiController get() {
        return newInstance(this.serviceProvider.get(), this.moshiProvider.get(), this.staticTemplateSessionFactoryProvider.get());
    }

    public static FallbackModeApiController_Factory create(Provider<FallbackModeService> provider, Provider<Moshi> provider2, Provider<StaticTemplateSession.Factory> provider3) {
        return new FallbackModeApiController_Factory(provider, provider2, provider3);
    }

    public static FallbackModeApiController newInstance(FallbackModeService fallbackModeService, Moshi moshi, StaticTemplateSession.Factory factory) {
        return new FallbackModeApiController(fallbackModeService, moshi, factory);
    }
}
