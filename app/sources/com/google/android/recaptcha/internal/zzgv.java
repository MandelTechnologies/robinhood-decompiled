package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgv implements zzgz {
    public static final zzgv zza = new zzgv();

    private zzgv() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        int length = zzvlVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzcg(4, 3, null);
        }
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            throw new zzcg(4, 5, null);
        }
        int iIntValue = num.intValue();
        Object objZza2 = zzgfVar.zzc().zza(zzvlVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num2 = (Integer) objZza2;
        if (num2 == null) {
            throw new zzcg(4, 5, null);
        }
        int iIntValue2 = num2.intValue();
        Object objZza3 = zzgfVar.zzc().zza(zzvlVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str = (String) objZza3;
        if (str == null) {
            throw new zzcg(4, 5, null);
        }
        String strZza = zzgfVar.zzh().zza(str);
        Object objZza4 = zzgfVar.zzc().zza(zzvlVarArr[3]);
        if (true != (objZza4 instanceof String)) {
            objZza4 = null;
        }
        String str2 = (String) objZza4;
        if (str2 == null) {
            throw new zzcg(4, 5, null);
        }
        String strZza2 = zzgfVar.zzh().zza(str2);
        Object objZza5 = length == 5 ? zzgfVar.zzc().zza(zzvlVarArr[4]) : null;
        zzgb zzgbVar = new zzgb(iIntValue2);
        try {
            Class clsZza = zzge.zza(strZza);
            zzgfVar.zzc().zze(iIntValue, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzgc(zzgbVar, strZza2, objZza5)));
            zzgfVar.zzc().zze(i, zzgbVar);
        } catch (Exception e) {
            throw new zzcg(6, 20, e);
        }
    }
}
