package com.google.android.recaptcha.internal;

import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhd implements zzgz {
    public static final zzhd zza = new zzhd();

    private zzhd() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        if (zzvlVarArr.length != 2) {
            throw new zzcg(4, 3, null);
        }
        Class<?> clsZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzcg(4, 5, null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzcg(4, 5, null);
        }
        try {
            zzgfVar.zzc().zze(i, cls.getField(zzgfVar.zzh().zza(str)));
        } catch (Exception e) {
            throw new zzcg(6, 10, e);
        }
    }
}
