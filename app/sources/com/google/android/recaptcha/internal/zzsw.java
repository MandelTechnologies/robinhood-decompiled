package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzsw extends zznl implements zzor {
    private static final zzsw zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsw zzswVar = new zzsw();
        zzb = zzswVar;
        zznl.zzH(zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    public static zzsv zzf() {
        return (zzsv) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzsw zzswVar, String str) {
        zzswVar.zze |= 1;
        zzswVar.zzf = str;
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
            return new zzsw();
        }
        zzsu zzsuVar = null;
        if (i2 == 4) {
            return new zzsv(zzsuVar);
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
        synchronized (zzsw.class) {
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
