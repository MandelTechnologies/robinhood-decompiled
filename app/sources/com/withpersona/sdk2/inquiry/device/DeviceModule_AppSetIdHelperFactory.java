package com.withpersona.sdk2.inquiry.device;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class DeviceModule_AppSetIdHelperFactory implements Factory<DeviceVendorIDProvider> {
    private final Provider<DeviceVendorIDProvider2> appSetIDHelperProvider;
    private final DeviceModule module;

    public DeviceModule_AppSetIdHelperFactory(DeviceModule deviceModule, Provider<DeviceVendorIDProvider2> provider) {
        this.module = deviceModule;
        this.appSetIDHelperProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceVendorIDProvider get() {
        return appSetIdHelper(this.module, this.appSetIDHelperProvider.get());
    }

    public static DeviceModule_AppSetIdHelperFactory create(DeviceModule deviceModule, Provider<DeviceVendorIDProvider2> provider) {
        return new DeviceModule_AppSetIdHelperFactory(deviceModule, provider);
    }

    public static DeviceVendorIDProvider appSetIdHelper(DeviceModule deviceModule, DeviceVendorIDProvider2 deviceVendorIDProvider2) {
        return (DeviceVendorIDProvider) Preconditions.checkNotNullFromProvides(deviceModule.appSetIdHelper(deviceVendorIDProvider2));
    }
}
