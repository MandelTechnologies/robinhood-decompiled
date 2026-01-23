package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/device/RealDeviceInfoProvider;", "Lcom/withpersona/sdk2/inquiry/device/DeviceInfoProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isDebuggerAttached", "()Z", "Landroid/content/Context;", "", "getManufacturer", "()Ljava/lang/String;", "manufacturer", "getModel", "model", "getVersionRelease", "versionRelease", "device_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.device.RealDeviceInfoProvider, reason: use source file name */
/* loaded from: classes18.dex */
public final class DeviceInfoProvider2 implements DeviceInfoProvider {
    private final Context context;

    public DeviceInfoProvider2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceInfoProvider
    public String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceInfoProvider
    public String getModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceInfoProvider
    public String getVersionRelease() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // com.withpersona.sdk2.inquiry.device.DeviceInfoProvider
    public boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }
}
