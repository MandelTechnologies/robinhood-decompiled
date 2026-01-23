package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhk implements zzgz {
    public static final zzhk zza = new zzhk();

    private zzhk() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        Object array2;
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
        if (objZza instanceof Integer) {
            array2 = Integer.valueOf(((Number) objZza).intValue() * iIntValue);
        } else {
            if (!(objZza instanceof int[])) {
                throw new zzcg(4, 5, null);
            }
            int[] iArr = (int[]) objZza;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2 * iIntValue));
            }
            array2 = arrayList.toArray(new Integer[0]);
        }
        zzgfVar.zzc().zze(i, array2);
    }
}
