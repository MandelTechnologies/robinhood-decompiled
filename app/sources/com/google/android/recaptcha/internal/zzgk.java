package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgk implements zzgz {
    public static final zzgk zza = new zzgk();

    private zzgk() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, zzcg {
        if (zzvlVarArr.length != 3) {
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
        Object objZza3 = zzgfVar.zzc().zza(zzvlVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzcg(4, 5, null);
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e) {
            if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzcg(4, 25, e);
            }
            throw new zzcg(4, 22, e);
        }
    }
}
