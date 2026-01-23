package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzib implements zzhz {
    private final zzia zza;

    public zzib(zzia zziaVar, zzhy zzhyVar) {
        this.zza = zziaVar;
    }

    private final zzvd zzb(String str, List list) throws zzcg {
        if (str.length() == 0) {
            throw new zzcg(3, 17, null);
        }
        try {
            zzhx zzhxVar = new zzhx(this.zza.zza(CollectionsKt.toLongArray(list)), 255L, zzhx.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) UInt.m28582constructorimpl(UInt.m28582constructorimpl(str.charAt(i)) ^ UInt.m28582constructorimpl((int) zzhxVar.zza())));
            }
            return zzvd.zzg(zzkj.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            throw new zzcg(3, 18, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final zzvd zza(zzvg zzvgVar) throws zzcg {
        zzjj zzjjVarZzb = zzjj.zzb();
        zzvd zzvdVarZzb = zzb(zzvgVar.zzj(), zzvgVar.zzk());
        zzjjVarZzb.zzf();
        long jZza = zzjjVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbm.zza;
        zzbm.zza(zzbn.zzh.zza(), jZza);
        return zzvdVarZzb;
    }
}
