package com.salesforce.android.smi.network.data.model;

import android.os.Build;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;

/* compiled from: DeviceBuild.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/DeviceBuild;", "Lcom/salesforce/android/smi/network/data/model/DeviceBuildInfo;", "<init>", "()V", "osName", "", "getOsName", "()Ljava/lang/String;", "osVersion", "getOsVersion", "deviceType", "getDeviceType", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DeviceBuild implements DeviceBuildInfo {
    public static final DeviceBuild INSTANCE = new DeviceBuild();
    private static final String osName = "Android";
    private static final String osVersion = String.valueOf(Build.VERSION.SDK_INT);
    private static final String deviceType = Build.MANUFACTURER + PlaceholderUtils.XXShortPlaceholderText + Build.MODEL;

    private DeviceBuild() {
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceBuildInfo
    public String getOsName() {
        return osName;
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceBuildInfo
    public String getOsVersion() {
        return osVersion;
    }

    @Override // com.salesforce.android.smi.network.data.model.DeviceBuildInfo
    public String getDeviceType() {
        return deviceType;
    }
}
