package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class OfflineModeApiController_Factory_Impl implements OfflineModeApiController.Factory {
    private final C50858OfflineModeApiController_Factory delegateFactory;

    OfflineModeApiController_Factory_Impl(C50858OfflineModeApiController_Factory c50858OfflineModeApiController_Factory) {
        this.delegateFactory = c50858OfflineModeApiController_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController.Factory
    public OfflineModeApiController create(int i) {
        return this.delegateFactory.get(i);
    }

    public static Provider<OfflineModeApiController.Factory> createFactoryProvider(C50858OfflineModeApiController_Factory c50858OfflineModeApiController_Factory) {
        return InstanceFactory.create(new OfflineModeApiController_Factory_Impl(c50858OfflineModeApiController_Factory));
    }
}
