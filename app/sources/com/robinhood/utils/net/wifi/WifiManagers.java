package com.robinhood.utils.net.wifi;

import android.net.wifi.WifiManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WifiManagers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"signalLevelFloat", "", "Landroid/net/wifi/WifiManager;", "getSignalLevelFloat", "(Landroid/net/wifi/WifiManager;)F", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.net.wifi.WifiManagersKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class WifiManagers {
    public static final float getSignalLevelFloat(WifiManager wifiManager) {
        Intrinsics.checkNotNullParameter(wifiManager, "<this>");
        if (wifiManager.getConnectionInfo() == null) {
            return 0.0f;
        }
        return WifiManager.calculateSignalLevel(r1.getRssi(), 100) / 100.0f;
    }
}
