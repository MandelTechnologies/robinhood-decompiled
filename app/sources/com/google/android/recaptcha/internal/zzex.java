package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzex {
    public static final zzrv zza(zzbp zzbpVar, zzbp zzbpVar2) {
        zzru zzruVarZzf = zzrv.zzf();
        zzruVarZzf.zzp(zzql.zzb(zzbpVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzruVarZzf.zzq(zzqj.zza(zzbpVar.zza(timeUnit)));
        zzruVarZzf.zzd(zzql.zzb(zzbpVar2.zzb()));
        zzruVarZzf.zze(zzqj.zza(zzbpVar2.zza(timeUnit)));
        return (zzrv) zzruVarZzf.zzj();
    }
}
