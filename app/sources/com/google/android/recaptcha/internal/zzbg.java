package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbg {
    public zzbg() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqt.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqt.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqt.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqt.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqt.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return SetsKt.emptySet();
        }
    }

    private static final Map zzb() {
        Map mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(0, zzqt.NET_CAPABILITY_MMS), Tuples4.m3642to(1, zzqt.NET_CAPABILITY_SUPL), Tuples4.m3642to(2, zzqt.NET_CAPABILITY_DUN), Tuples4.m3642to(3, zzqt.NET_CAPABILITY_FOTA), Tuples4.m3642to(4, zzqt.NET_CAPABILITY_IMS), Tuples4.m3642to(5, zzqt.NET_CAPABILITY_CBS), Tuples4.m3642to(6, zzqt.NET_CAPABILITY_WIFI_P2P), Tuples4.m3642to(7, zzqt.NET_CAPABILITY_IA), Tuples4.m3642to(8, zzqt.NET_CAPABILITY_RCS), Tuples4.m3642to(9, zzqt.NET_CAPABILITY_XCAP), Tuples4.m3642to(10, zzqt.NET_CAPABILITY_EIMS), Tuples4.m3642to(11, zzqt.NET_CAPABILITY_NOT_METERED), Tuples4.m3642to(12, zzqt.NET_CAPABILITY_INTERNET), Tuples4.m3642to(13, zzqt.NET_CAPABILITY_NOT_RESTRICTED), Tuples4.m3642to(14, zzqt.NET_CAPABILITY_TRUSTED), Tuples4.m3642to(15, zzqt.NET_CAPABILITY_NOT_VPN));
        int i = Build.VERSION.SDK_INT;
        mapMutableMapOf.put(17, zzqt.NET_CAPABILITY_CAPTIVE_PORTAL);
        mapMutableMapOf.put(16, zzqt.NET_CAPABILITY_VALIDATED);
        if (i >= 28) {
            mapMutableMapOf.put(18, zzqt.NET_CAPABILITY_NOT_ROAMING);
            mapMutableMapOf.put(19, zzqt.NET_CAPABILITY_FOREGROUND);
            mapMutableMapOf.put(20, zzqt.NET_CAPABILITY_NOT_CONGESTED);
            mapMutableMapOf.put(21, zzqt.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            mapMutableMapOf.put(23, zzqt.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            mapMutableMapOf.put(25, zzqt.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            mapMutableMapOf.put(32, zzqt.NET_CAPABILITY_HEAD_UNIT);
            mapMutableMapOf.put(29, zzqt.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            mapMutableMapOf.put(35, zzqt.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            mapMutableMapOf.put(34, zzqt.NET_CAPABILITY_PRIORITIZE_LATENCY);
            mapMutableMapOf.put(33, zzqt.NET_CAPABILITY_MMTEL);
        }
        return mapMutableMapOf;
    }
}
