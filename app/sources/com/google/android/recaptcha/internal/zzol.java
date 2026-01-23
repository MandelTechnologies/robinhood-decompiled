package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzol {
    zzol() {
    }

    public static final boolean zza(Object obj) {
        return !((zzok) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzok zzokVarZzb = (zzok) obj;
        zzok zzokVar = (zzok) obj2;
        if (!zzokVar.isEmpty()) {
            if (!zzokVarZzb.zze()) {
                zzokVarZzb = zzokVarZzb.zzb();
            }
            zzokVarZzb.zzd(zzokVar);
        }
        return zzokVarZzb;
    }
}
