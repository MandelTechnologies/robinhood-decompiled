package com.mux.stats.sdk.core.util;

import com.mux.stats.sdk.core.events.DebugEvent;
import com.mux.stats.sdk.core.events.IEventListener;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.muxstats.IDevice;
import com.mux.stats.sdk.muxstats.LogPriority;
import com.mux.stats.sdk.muxstats.MuxStats;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import java.util.Locale;

/* loaded from: classes27.dex */
public class MuxLogger {

    /* renamed from: a */
    private static String f1144a;

    /* renamed from: b */
    private static IEventListener f1145b;

    /* renamed from: c */
    private static Boolean f1146c = Boolean.FALSE;

    /* renamed from: a */
    private static boolean m1114a() {
        return (f1144a == null || f1145b == null) ? false : true;
    }

    /* renamed from: a */
    private static boolean m1115a(String str) {
        return m1114a() && f1144a.indexOf(str) >= 0;
    }

    /* renamed from: b */
    private static boolean m1116b() {
        return m1114a() && f1144a.indexOf(ApiRenderablePlatforms.VERSIONS_ALL) >= 0;
    }

    /* renamed from: d */
    public static void m1117d(String str, String str2) {
        IDevice hostDevice = MuxStats.getHostDevice();
        if (!f1146c.booleanValue() || hostDevice == null) {
            return;
        }
        hostDevice.outputLog(LogPriority.DEBUG, str, str2);
    }

    public static void exception(Throwable th, String str, String str2) {
        exception(th, str, str2, (CustomerPlayerData) null);
    }

    public static void exception(Throwable th, String str, String str2, CustomerData customerData) {
        exception(th, str, str2, customerData != null ? customerData.getCustomerPlayerData() : null);
    }

    public static void exception(Throwable th, String str, String str2, CustomerPlayerData customerPlayerData) {
        if (m1116b() || m1115a("exception")) {
            String str3 = String.format(Locale.US, "type=exception For env %s\n%s\n%s", customerPlayerData != null ? customerPlayerData.getEnvironmentKey() : null, str2, th);
            IEventListener iEventListener = f1145b;
            if (iEventListener != null) {
                iEventListener.handle(new DebugEvent(str3));
            }
            IDevice hostDevice = MuxStats.getHostDevice();
            if (!f1146c.booleanValue() || hostDevice == null) {
                return;
            }
            hostDevice.outputLog(LogPriority.ERROR, str, str2, th);
        }
    }

    public static void setAllowLogcat(boolean z) {
        f1146c = Boolean.valueOf(z);
    }

    /* renamed from: w */
    public static void m1118w(String str, String str2) {
        IDevice hostDevice = MuxStats.getHostDevice();
        if (!f1146c.booleanValue() || hostDevice == null) {
            return;
        }
        hostDevice.outputLog(LogPriority.WARN, str, str2);
    }
}
