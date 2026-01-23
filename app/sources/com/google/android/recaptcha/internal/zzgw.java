package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgw implements zzgz {
    public static final zzgw zza = new zzgw();

    private zzgw() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        if (zzvlVarArr.length != 2) {
            throw new zzcg(4, 3, null);
        }
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzcg(4, 5, null);
        }
        Object objZza2 = zzgfVar.zzc().zza(zzvlVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzcg(4, 5, null);
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objZza = zzgfVar.zzh().zza((String) objZza);
            }
            zzgfVar.zzc().zze(i, Array.newInstance((Class<?>) zzge.zza(objZza), iIntValue));
        } catch (Exception e) {
            throw new zzcg(6, 21, e);
        }
    }
}
