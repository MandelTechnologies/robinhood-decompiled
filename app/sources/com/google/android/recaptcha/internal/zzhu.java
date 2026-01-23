package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhu implements zzgz {
    public static final zzhu zza = new zzhu();

    private zzhu() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        int length = zzvlVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzcg(4, 3, null);
            }
            zzgfVar.zzc().zze(i, new zzbp());
            return;
        }
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzcg(4, 5, null);
        }
        Object objZza2 = zzgfVar.zzc().zza(zzvlVarArr[1]);
        if (true != (objZza2 instanceof zzbp)) {
            objZza2 = null;
        }
        zzbp zzbpVar = (zzbp) objZza2;
        if (zzbpVar == null) {
            throw new zzcg(4, 5, null);
        }
        byte[] bArrZzd = zzex.zza(zzgfVar.zzb(), zzbpVar).zzd();
        zzgfVar.zzi().zzb(str, zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}
