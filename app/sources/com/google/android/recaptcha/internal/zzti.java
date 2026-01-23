package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzti extends zznl implements zzor {
    private static final zzti zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzsz zzm;

    static {
        zzti zztiVar = new zzti();
        zzb = zztiVar;
        zznl.zzH(zzti.class, zztiVar);
    }

    private zzti() {
    }

    static /* synthetic */ void zzL(zzti zztiVar, zzsz zzszVar) {
        zzszVar.getClass();
        zztiVar.zzm = zzszVar;
        zztiVar.zze |= 128;
    }

    static /* synthetic */ void zzM(zzti zztiVar, String str) {
        str.getClass();
        zztiVar.zze |= 4;
        zztiVar.zzh = str;
    }

    public static zzth zzf() {
        return (zzth) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzti zztiVar, String str) {
        str.getClass();
        zztiVar.zze |= 8;
        zztiVar.zzi = str;
    }

    static /* synthetic */ void zzj(zzti zztiVar, String str) {
        str.getClass();
        zztiVar.zze |= 2;
        zztiVar.zzg = str;
    }

    static /* synthetic */ void zzk(zzti zztiVar, String str) {
        str.getClass();
        zztiVar.zze |= 1;
        zztiVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzti();
        }
        zztg zztgVar = null;
        if (i2 == 4) {
            return new zzth(zztgVar);
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
        synchronized (zzti.class) {
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
