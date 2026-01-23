package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzht implements zzgz {
    public static final zzht zza = new zzht();

    private zzht() {
    }

    @Override // com.google.android.recaptcha.internal.zzgz
    public final void zza(int i, zzgf zzgfVar, zzvl... zzvlVarArr) throws zzcg {
        if (zzvlVarArr.length != 2) {
            throw new zzcg(4, 3, null);
        }
        Object objZza = zzgfVar.zzc().zza(zzvlVarArr[0]);
        if (true != (objZza instanceof int[])) {
            objZza = null;
        }
        int[] iArr = (int[]) objZza;
        if (iArr == null) {
            throw new zzcg(4, 5, null);
        }
        Object objZza2 = zzgfVar.zzc().zza(zzvlVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str = (String) objZza2;
        if (str == null) {
            throw new zzcg(4, 5, null);
        }
        zzgg zzggVarZzc = zzgfVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i2 : iArr) {
                sb.append(str.charAt(i2));
            }
            zzggVarZzc.zze(i, sb.toString());
        } catch (Exception e) {
            throw new zzcg(4, 22, e);
        }
    }
}
