package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgm implements zzgz {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        if (zzvlVarArr.length == 0) {
            throw new zzcg(4, 3, null);
        }
        zzud zzudVarZzf = zzuh.zzf();
        for (zzvl zzvlVar : zzvlVarArr) {
            Object objZza = zzgfVar.zzc().zza(zzvlVar);
            if (objZza == null) {
                throw new zzcg(4, 4, null);
            }
            zzuf zzufVarZzf = zzug.zzf();
            if (objZza instanceof Integer) {
                zzufVarZzf.zzt(((Number) objZza).intValue());
            } else if (objZza instanceof Short) {
                zzufVarZzf.zzs(((Number) objZza).shortValue());
            } else if (objZza instanceof Byte) {
                zzufVarZzf.zze(zzlg.zzk(new byte[]{((Number) objZza).byteValue()}, 0, 1));
            } else if (objZza instanceof Long) {
                zzufVarZzf.zzu(((Number) objZza).longValue());
            } else if (objZza instanceof Double) {
                zzufVarZzf.zzq(((Number) objZza).doubleValue());
            } else if (objZza instanceof Float) {
                zzufVarZzf.zzr(((Number) objZza).floatValue());
            } else if (objZza instanceof Boolean) {
                zzufVarZzf.zzd(((Boolean) objZza).booleanValue());
            } else if (objZza instanceof Character) {
                zzufVarZzf.zzp(String.valueOf(((Character) objZza).charValue()));
            } else if (objZza instanceof String) {
                zzufVarZzf.zzv((String) objZza);
            } else {
                zzufVarZzf.zzv(objZza.toString());
            }
            zzudVarZzf.zze((zzug) zzufVarZzf.zzj());
        }
        zzgg zzggVarZzc = zzgfVar.zzc();
        byte[] bArrZzd = ((zzuh) zzudVarZzf.zzj()).zzd();
        zzggVarZzc.zze(i, zzkj.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}
