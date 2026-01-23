package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzoh implements zzoo {
    private final zzoo[] zza;

    zzoh(zzoo... zzooVarArr) {
        this.zza = zzooVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzoo
    public final zzon zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzoo zzooVar = this.zza[i];
            if (zzooVar.zzc(cls)) {
                return zzooVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzoo
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
