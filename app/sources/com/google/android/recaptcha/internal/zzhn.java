package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhn implements zzgz {
    public static final zzhn zza = new zzhn();

    private zzhn() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        if (zzvlVarArr.length != 1) {
            throw new zzcg(4, 3, null);
        }
        zzgfVar.zzc().zze(i, zzgfVar.zzc().zza(zzvlVarArr[0]));
    }
}
