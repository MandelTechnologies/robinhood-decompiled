package com.google.android.recaptcha.internal;

import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhb implements zzgz {
    public static final zzhb zza = new zzhb();

    private zzhb() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
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
            if (objZza instanceof String) {
                objZza = zzgfVar.zzh().zza((String) objZza);
            }
            zzgfVar.zzc().zze(i, zzge.zza(objZza));
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(6, 8, e2);
        }
    }
}
