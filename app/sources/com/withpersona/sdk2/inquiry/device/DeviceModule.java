package com.withpersona.sdk2.inquiry.device;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\rH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/device/DeviceModule;", "", "<init>", "()V", "appSetIdHelper", "Lcom/withpersona/sdk2/inquiry/device/DeviceVendorIDProvider;", "appSetIDHelper", "Lcom/withpersona/sdk2/inquiry/device/RealDeviceVendorIDProvider;", "deviceInfoProvider", "Lcom/withpersona/sdk2/inquiry/device/DeviceInfoProvider;", "Lcom/withpersona/sdk2/inquiry/device/RealDeviceInfoProvider;", "deviceIdProvider", "Lcom/withpersona/sdk2/inquiry/device/DeviceIdProvider;", "Lcom/withpersona/sdk2/inquiry/device/RealDeviceIdProvider;", "device_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DeviceModule {
    public final DeviceVendorIDProvider appSetIdHelper(DeviceVendorIDProvider2 appSetIDHelper) {
        Intrinsics.checkNotNullParameter(appSetIDHelper, "appSetIDHelper");
        return appSetIDHelper;
    }

    public final DeviceId deviceIdProvider(DeviceId2 deviceIdProvider) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        return deviceIdProvider;
    }

    public final DeviceInfoProvider deviceInfoProvider(DeviceInfoProvider2 deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        return deviceInfoProvider;
    }
}
