package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzhx {
    private static final zzhw zza;
    private final zzhw zzb;
    private long zzc;

    static {
        long jPow = (long) Math.pow(2.0d, 32.0d);
        zza = new zzhw(11L, 20919936621L ^ jPow, (long) Math.pow(2.0d, 48.0d));
    }

    public zzhx(long j, long j2, zzhw zzhwVar) {
        this.zzb = zzhwVar;
        this.zzc = Math.abs(j);
    }

    public final long zza() {
        zzhw zzhwVar = this.zzb;
        long jLongValue = (BigInteger.valueOf(zzhwVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzhwVar.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = jLongValue;
        return jLongValue % 255;
    }
}
