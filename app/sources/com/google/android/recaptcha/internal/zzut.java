package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzut extends zznl implements zzor {
    private static final zzut zzb;
    private static volatile zzoy zzd;
    private int zze;

    static {
        zzut zzutVar = new zzut();
        zzb = zzutVar;
        zznl.zzH(zzut.class, zzutVar);
    }

    private zzut() {
    }

    public static zzut zzg(byte[] bArr) throws zznv {
        return (zzut) zznl.zzw(zzb, bArr);
    }

    public final zzux zzi() {
        zzux zzuxVarZzb = zzux.zzb(this.zze);
        return zzuxVarZzb == null ? zzux.UNRECOGNIZED : zzuxVarZzb;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzut();
        }
        zzur zzurVar = null;
        if (i2 == 4) {
            return new zzus(zzurVar);
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
        synchronized (zzut.class) {
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
