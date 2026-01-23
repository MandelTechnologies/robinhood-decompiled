package com.google.android.recaptcha.internal;

import com.robinhood.android.investFlow.InvestFlowConstants;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzql {
    private static final ThreadLocal zza;

    static {
        zzps zzpsVarZzi = zzpt.zzi();
        zzpsVarZzi.zze(-62135596800L);
        zzpsVarZzi.zzd(0);
        zzps zzpsVarZzi2 = zzpt.zzi();
        zzpsVarZzi2.zze(253402300799L);
        zzpsVarZzi2.zzd(999999999);
        zzps zzpsVarZzi3 = zzpt.zzi();
        zzpsVarZzi3.zze(0L);
        zzpsVarZzi3.zzd(0);
        zza = new zzqk();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpt zza(zzpt zzptVar) {
        long jZzg = zzptVar.zzg();
        boolean zZze = zze(jZzg);
        int iZzf = zzptVar.zzf();
        if (!zZze || iZzf < 0 || iZzf >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        }
        return zzptVar;
    }

    public static zzpt zzb(long j) {
        long jZza = j / 1000;
        if (!zze(jZza)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(jZza)));
        }
        int i = (int) ((j % 1000) * 1000000);
        if (i <= -1000000000 || i >= 1000000000) {
            jZza = zzkm.zza(jZza, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            jZza = zzkm.zzb(jZza, 1L);
        }
        zzps zzpsVarZzi = zzpt.zzi();
        zzpsVarZzi.zze(jZza);
        zzpsVarZzi.zzd(i);
        zzpt zzptVar = (zzpt) zzpsVarZzi.zzj();
        zza(zzptVar);
        return zzptVar;
    }

    public static String zzc(zzpt zzptVar) {
        zza(zzptVar);
        long jZzg = zzptVar.zzg();
        int iZzf = zzptVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb.append(".");
            sb.append(iZzf % InvestFlowConstants.MAX_ONE_TIME_AMOUNT == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / InvestFlowConstants.MAX_ONE_TIME_AMOUNT)) : iZzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf)));
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
