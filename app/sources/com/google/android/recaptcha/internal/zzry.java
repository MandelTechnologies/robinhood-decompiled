package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzry extends zznl implements zzor {
    private static final zzry zzb;
    private static volatile zzoy zzd;
    private int zze;
    private zzrd zzg;
    private zzqu zzh;
    private zzrg zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzry zzryVar = new zzry();
        zzb = zzryVar;
        zznl.zzH(zzry.class, zzryVar);
    }

    private zzry() {
    }

    static /* synthetic */ void zzL(zzry zzryVar, String str) {
        str.getClass();
        zzryVar.zzf = str;
    }

    public static zzrx zzf() {
        return (zzrx) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzry zzryVar, zzqu zzquVar) {
        zzquVar.getClass();
        zzryVar.zzh = zzquVar;
        zzryVar.zze |= 2;
    }

    static /* synthetic */ void zzj(zzry zzryVar, String str) {
        str.getClass();
        zzryVar.zzk = str;
    }

    static /* synthetic */ void zzk(zzry zzryVar, String str) {
        str.getClass();
        zzryVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzry();
        }
        zzrw zzrwVar = null;
        if (i2 == 4) {
            return new zzrx(zzrwVar);
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
        synchronized (zzry.class) {
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
