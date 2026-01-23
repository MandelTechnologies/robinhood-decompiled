package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzsh extends zznl implements zzor {
    private static final zzsh zzb;
    private static volatile zzoy zzd;
    private int zze;
    private zzse zzf;
    private zzse zzg;

    static {
        zzsh zzshVar = new zzsh();
        zzb = zzshVar;
        zznl.zzH(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    public static zzsh zzj(byte[] bArr) throws zznv {
        return (zzsh) zznl.zzw(zzb, bArr);
    }

    public final zzse zzf() {
        zzse zzseVar = this.zzf;
        return zzseVar == null ? zzse.zzg() : zzseVar;
    }

    public final zzse zzg() {
        zzse zzseVar = this.zzg;
        return zzseVar == null ? zzse.zzg() : zzseVar;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzsh();
        }
        zzsf zzsfVar = null;
        if (i2 == 4) {
            return new zzsg(zzsfVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoy zzoyVar = zzd;
        if (zzoyVar != null) {
            return zzoyVar;
        }
        synchronized (zzsh.class) {
            try {
                zzngVar = zzd;
                if (zzngVar == null) {
                    zzngVar = new zzng(zzb);
                    zzd = zzngVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzngVar;
    }
}
