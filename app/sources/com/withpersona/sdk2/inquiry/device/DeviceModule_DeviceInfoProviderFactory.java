package com.withpersona.sdk2.inquiry.device;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class DeviceModule_DeviceInfoProviderFactory implements Factory<DeviceInfoProvider> {
    private final Provider<DeviceInfoProvider2> deviceInfoProvider;
    private final DeviceModule module;

    public DeviceModule_DeviceInfoProviderFactory(DeviceModule deviceModule, Provider<DeviceInfoProvider2> provider) {
        this.module = deviceModule;
        this.deviceInfoProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceInfoProvider get() {
        return deviceInfoProvider(this.module, this.deviceInfoProvider.get());
    }

    public static DeviceModule_DeviceInfoProviderFactory create(DeviceModule deviceModule, Provider<DeviceInfoProvider2> provider) {
        return new DeviceModule_DeviceInfoProviderFactory(deviceModule, provider);
    }

    public static DeviceInfoProvider deviceInfoProvider(DeviceModule deviceModule, DeviceInfoProvider2 deviceInfoProvider2) {
        return (DeviceInfoProvider) Preconditions.checkNotNullFromProvides(deviceModule.deviceInfoProvider(deviceInfoProvider2));
    }
}
