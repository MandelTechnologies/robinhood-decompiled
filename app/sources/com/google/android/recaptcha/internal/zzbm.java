package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbm {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i);
        Object zzblVar = concurrentHashMap.get(numValueOf);
        if (zzblVar == null) {
            zzblVar = new zzbl();
        }
        zzbl zzblVar2 = (zzbl) zzblVar;
        zzblVar2.zzg(zzblVar2.zzb() + 1);
        zzblVar2.zzf(zzblVar2.zzd() + j);
        zzblVar2.zze(Math.max(j, zzblVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzblVar2);
    }
}
