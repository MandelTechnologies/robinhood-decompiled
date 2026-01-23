package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class RealDeviceIdProvider_Factory implements Factory<DeviceId2> {
    private final Provider<Context> contextProvider;

    public RealDeviceIdProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeviceId2 get() {
        return newInstance(this.contextProvider.get());
    }

    public static RealDeviceIdProvider_Factory create(Provider<Context> provider) {
        return new RealDeviceIdProvider_Factory(provider);
    }

    public static DeviceId2 newInstance(Context context) {
        return new DeviceId2(context);
    }
}
