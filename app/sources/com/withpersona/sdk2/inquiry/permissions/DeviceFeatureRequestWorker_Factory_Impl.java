package com.withpersona.sdk2.inquiry.permissions;

import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class DeviceFeatureRequestWorker_Factory_Impl implements DeviceFeatureRequestWorker.Factory {
    private final C50861DeviceFeatureRequestWorker_Factory delegateFactory;

    DeviceFeatureRequestWorker_Factory_Impl(C50861DeviceFeatureRequestWorker_Factory c50861DeviceFeatureRequestWorker_Factory) {
        this.delegateFactory = c50861DeviceFeatureRequestWorker_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker.Factory
    public DeviceFeatureRequestWorker create() {
        return this.delegateFactory.get();
    }

    public static Provider<DeviceFeatureRequestWorker.Factory> createFactoryProvider(C50861DeviceFeatureRequestWorker_Factory c50861DeviceFeatureRequestWorker_Factory) {
        return InstanceFactory.create(new DeviceFeatureRequestWorker_Factory_Impl(c50861DeviceFeatureRequestWorker_Factory));
    }
}
