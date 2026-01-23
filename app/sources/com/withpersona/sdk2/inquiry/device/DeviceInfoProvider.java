package com.withpersona.sdk2.inquiry.device;

import kotlin.Metadata;

/* compiled from: DeviceInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/device/DeviceInfoProvider;", "", "", "isDebuggerAttached", "()Z", "", "getManufacturer", "()Ljava/lang/String;", "manufacturer", "getModel", "model", "getVersionRelease", "versionRelease", "device_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface DeviceInfoProvider {
    String getManufacturer();

    String getModel();

    String getVersionRelease();

    boolean isDebuggerAttached();
}
