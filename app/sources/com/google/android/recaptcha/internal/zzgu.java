package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgu implements zzgz {
    public static final zzgu zza = new zzgu();

    private zzgu() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws IllegalArgumentException, zzcg {
        int iIntValue;
        int length = zzvlVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzcg(4, 3, null);
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
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzcg(4, 5, null);
        }
        Object objZza3 = zzgfVar.zzc().zza(zzvlVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            throw new zzcg(4, 5, null);
        }
        String strZza = zzgfVar.zzh().zza(str2);
        Object objZza4 = zzgfVar.zzc().zza(zzvlVarArr[3]);
        if (length == 5) {
            Object objZza5 = zzgfVar.zzc().zza(zzvlVarArr[4]);
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                throw new zzcg(4, 5, null);
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        try {
            if (objZza2 instanceof String) {
                objZza2 = zzgfVar.zzh().zza((String) objZza2);
            }
            Class clsZza = zzge.zza(objZza2);
            zzgfVar.zzc().zze(i, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzga(new zzgt(zzgfVar, str, iIntValue), strZza, objZza4)));
        } catch (Exception e) {
            throw new zzcg(6, 20, e);
        }
    }
}
