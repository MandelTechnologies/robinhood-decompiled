package com.withpersona.sdk2.inquiry.device;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class DeviceModule_DeviceIdProviderFactory implements Factory<DeviceId> {
    private final Provider<DeviceId2> deviceIdProvider;
    private final DeviceModule module;

    public DeviceModule_DeviceIdProviderFactory(DeviceModule deviceModule, Provider<DeviceId2> provider) {
        this.module = deviceModule;
        this.deviceIdProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceId get() {
        return deviceIdProvider(this.module, this.deviceIdProvider.get());
    }

    public static DeviceModule_DeviceIdProviderFactory create(DeviceModule deviceModule, Provider<DeviceId2> provider) {
        return new DeviceModule_DeviceIdProviderFactory(deviceModule, provider);
    }

    public static DeviceId deviceIdProvider(DeviceModule deviceModule, DeviceId2 deviceId2) {
        return (DeviceId) Preconditions.checkNotNullFromProvides(deviceModule.deviceIdProvider(deviceId2));
    }
}
