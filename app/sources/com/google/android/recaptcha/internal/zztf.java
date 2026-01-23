package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zztf extends zznl implements zzor {
    private static final zztf zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";

    static {
        zztf zztfVar = new zztf();
        zzb = zztfVar;
        zznl.zzH(zztf.class, zztfVar);
    }

    private zztf() {
    }

    public static zzte zzf() {
        return (zzte) zzb.zzp();
    }

    static /* synthetic */ void zzi(zztf zztfVar, String str) {
        str.getClass();
        zztfVar.zze |= 1;
        zztfVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zztf();
        }
        zztd zztdVar = null;
        if (i2 == 4) {
            return new zzte(zztdVar);
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
        synchronized (zztf.class) {
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
