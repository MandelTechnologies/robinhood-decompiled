package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class RealDeviceVendorIDProvider_Factory implements Factory<DeviceVendorIDProvider2> {
    private final Provider<Context> contextProvider;

    public RealDeviceVendorIDProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceVendorIDProvider2 get() {
        return newInstance(this.contextProvider.get());
    }

    public static RealDeviceVendorIDProvider_Factory create(Provider<Context> provider) {
        return new RealDeviceVendorIDProvider_Factory(provider);
    }

    public static DeviceVendorIDProvider2 newInstance(Context context) {
        return new DeviceVendorIDProvider2(context);
    }
}
