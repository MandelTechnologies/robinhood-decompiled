package com.google.android.libraries.places.internal;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
final class zzrw {
    private static final zzpd zza;

    static {
        zzph zzphVarZza = zzpi.zza();
        zzphVarZza.zzb('\"', "&quot;");
        zzphVarZza.zzb('\'', "&#39;");
        zzphVarZza.zzb('&', "&amp;");
        zzphVarZza.zzb('<', "&lt;");
        zzphVarZza.zzb('>', "&gt;");
        zza = zzphVarZza.zza();
    }

    static String zza(String str) {
        return zza.zza(str);
    }
}
