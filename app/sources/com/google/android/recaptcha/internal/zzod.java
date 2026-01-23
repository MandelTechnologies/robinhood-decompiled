package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzod {
    zzod() {
    }

    public static final List zza(Object obj, long j) {
        zzns zznsVar = (zzns) zzqc.zzf(obj, j);
        if (zznsVar.zzc()) {
            return zznsVar;
        }
        int size = zznsVar.size();
        zzns zznsVarZzd = zznsVar.zzd(size == 0 ? 10 : size + size);
        zzqc.zzs(obj, j, zznsVarZzd);
        return zznsVarZzd;
    }
}
