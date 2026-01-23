package com.google.android.recaptcha.internal;

import com.squareup.wire.internal.MathMethods;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzqj {
    static {
        zzms zzmsVarZzi = zzmt.zzi();
        zzmsVarZzi.zze(-315576000000L);
        zzmsVarZzi.zzd(-999999999);
        zzms zzmsVarZzi2 = zzmt.zzi();
        zzmsVarZzi2.zze(315576000000L);
        zzmsVarZzi2.zzd(999999999);
        zzms zzmsVarZzi3 = zzmt.zzi();
        zzmsVarZzi3.zze(0L);
        zzmsVarZzi3.zzd(0);
    }

    public static zzmt zza(long j) {
        int i = (int) (j % MathMethods.NANOS_PER_SECOND);
        long jZza = j / MathMethods.NANOS_PER_SECOND;
        if (i <= -1000000000 || i >= 1000000000) {
            jZza = zzkm.zza(jZza, i / 1000000000);
            i %= 1000000000;
        }
        if (jZza > 0 && i < 0) {
            i += 1000000000;
            jZza--;
        }
        if (jZza < 0 && i > 0) {
            i -= 1000000000;
            jZza++;
        }
        zzms zzmsVarZzi = zzmt.zzi();
        zzmsVarZzi.zze(jZza);
        zzmsVarZzi.zzd(i);
        zzmt zzmtVar = (zzmt) zzmsVarZzi.zzj();
        long jZzg = zzmtVar.zzg();
        int iZzf = zzmtVar.zzf();
        if (jZzg < -315576000000L || jZzg > 315576000000L || iZzf < -999999999 || iZzf >= 1000000000 || ((jZzg < 0 || iZzf < 0) && (jZzg > 0 || iZzf > 0))) {
            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        }
        return zzmtVar;
    }
}
