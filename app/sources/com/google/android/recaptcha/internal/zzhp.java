package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhp implements zzgz {
    public static final zzhp zza = new zzhp();

    private zzhp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws IllegalAccessException, IllegalArgumentException, zzcg {
        if (zzvlVarArr.length != 3) {
            throw new zzcg(4, 3, null);
        }
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzcg(4, 5, null);
        }
        try {
            field.set(zzgfVar.zzc().zza(zzvlVarArr[1]), zzgfVar.zzc().zza(zzvlVarArr[2]));
        } catch (Exception e) {
            throw new zzcg(6, 11, e);
        }
    }
}
