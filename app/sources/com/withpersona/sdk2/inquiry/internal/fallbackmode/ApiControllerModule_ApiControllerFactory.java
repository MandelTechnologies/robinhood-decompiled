package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class ApiControllerModule_ApiControllerFactory implements Factory<ApiController> {
    private final Provider<FallbackModeApiController> fallbackModeApiControllerProvider;
    private final ApiControllerModule module;
    private final Provider<OfflineModeApiController.Factory> offlineModeApiControllerProvider;

    public ApiControllerModule_ApiControllerFactory(ApiControllerModule apiControllerModule, Provider<FallbackModeApiController> provider, Provider<OfflineModeApiController.Factory> provider2) {
        this.module = apiControllerModule;
        this.fallbackModeApiControllerProvider = provider;
        this.offlineModeApiControllerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ApiController get() {
        return apiController(this.module, this.fallbackModeApiControllerProvider.get(), this.offlineModeApiControllerProvider.get());
    }

    public static ApiControllerModule_ApiControllerFactory create(ApiControllerModule apiControllerModule, Provider<FallbackModeApiController> provider, Provider<OfflineModeApiController.Factory> provider2) {
        return new ApiControllerModule_ApiControllerFactory(apiControllerModule, provider, provider2);
    }

    public static ApiController apiController(ApiControllerModule apiControllerModule, FallbackModeApiController fallbackModeApiController, OfflineModeApiController.Factory factory) {
        return (ApiController) Preconditions.checkNotNullFromProvides(apiControllerModule.apiController(fallbackModeApiController, factory));
    }
}
