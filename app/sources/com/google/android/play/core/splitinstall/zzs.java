package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzu;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes27.dex */
public final class zzs {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final zzu zzb = new zzu("SplitInstallInfoProvider");

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
