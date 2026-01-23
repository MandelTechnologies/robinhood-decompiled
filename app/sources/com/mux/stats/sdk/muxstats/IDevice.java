package com.mux.stats.sdk.muxstats;

/* loaded from: classes27.dex */
public interface IDevice {
    String getAppName();

    String getAppVersion();

    String getDeviceCategory();

    String getDeviceId();

    String getDeviceName();

    long getElapsedRealtime();

    String getHardwareArchitecture();

    String getManufacturer();

    String getModelName();

    String getNetworkConnectionType();

    String getOSFamily();

    String getOSVersion();

    String getPlayerSoftware();

    String getPlayerVersion();

    String getPluginName();

    String getPluginVersion();

    void outputLog(LogPriority logPriority, String str, String str2);

    void outputLog(LogPriority logPriority, String str, String str2, Throwable th);
}
