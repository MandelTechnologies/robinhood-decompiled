package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class RealDeviceInfoProvider_Factory implements Factory<DeviceInfoProvider2> {
    private final Provider<Context> contextProvider;

    public RealDeviceInfoProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceInfoProvider2 get() {
        return newInstance(this.contextProvider.get());
    }

    public static RealDeviceInfoProvider_Factory create(Provider<Context> provider) {
        return new RealDeviceInfoProvider_Factory(provider);
    }

    public static DeviceInfoProvider2 newInstance(Context context) {
        return new DeviceInfoProvider2(context);
    }
}
