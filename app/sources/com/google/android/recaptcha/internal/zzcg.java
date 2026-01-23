package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzcg extends Exception {
    private final Throwable zza;
    private final zzua zzb;
    private final int zzc;
    private final int zzd;

    public zzcg(int i, int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zzua zzuaVarZzf = zzub.zzf();
        zzuaVarZzf.zzp(i2);
        zzuaVarZzf.zzq(i);
        this.zzb = zzuaVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzua zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
