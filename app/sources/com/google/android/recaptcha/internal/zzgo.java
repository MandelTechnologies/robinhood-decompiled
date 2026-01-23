package com.google.android.recaptcha.internal;

import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgo implements zzgz {
    public static final zzgo zza = new zzgo();

    private zzgo() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        boolean z = true;
        if (zzvlVarArr.length != 1) {
            throw new zzcg(4, 3, null);
        }
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzcg(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzgfVar.zzh().zza((String) objZza);
                }
                zzgg zzggVarZzc = zzgfVar.zzc();
                try {
                    zzge.zza(objZza);
                } catch (zzcg e) {
                    if (e.zzb() == 8 || e.zzb() == 6) {
                        z = false;
                    } else if (e.zzb() != 47) {
                        throw e;
                    }
                }
                zzggVarZzc.zze(i, Boolean.valueOf(z));
            } catch (Exception e2) {
                throw new zzcg(6, 8, e2);
            }
        } catch (zzcg e3) {
            throw e3;
        }
    }
}
