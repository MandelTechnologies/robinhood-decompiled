package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzrv extends zznl implements zzor {
    private static final zzrv zzb;
    private static volatile zzoy zzd;
    private int zze;
    private zzmt zzf;
    private zzpt zzg;
    private zzmt zzh;
    private zzpt zzi;

    static {
        zzrv zzrvVar = new zzrv();
        zzb = zzrvVar;
        zznl.zzH(zzrv.class, zzrvVar);
    }

    private zzrv() {
    }

    static /* synthetic */ void zzL(zzrv zzrvVar, zzmt zzmtVar) {
        zzmtVar.getClass();
        zzrvVar.zzf = zzmtVar;
        zzrvVar.zze |= 1;
    }

    public static zzru zzf() {
        return (zzru) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzrv zzrvVar, zzpt zzptVar) {
        zzptVar.getClass();
        zzrvVar.zzi = zzptVar;
        zzrvVar.zze |= 8;
    }

    static /* synthetic */ void zzj(zzrv zzrvVar, zzmt zzmtVar) {
        zzmtVar.getClass();
        zzrvVar.zzh = zzmtVar;
        zzrvVar.zze |= 4;
    }

    static /* synthetic */ void zzk(zzrv zzrvVar, zzpt zzptVar) {
        zzptVar.getClass();
        zzrvVar.zzg = zzptVar;
        zzrvVar.zze |= 2;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzrv();
        }
        zzrt zzrtVar = null;
        if (i2 == 4) {
            return new zzru(zzrtVar);
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
        synchronized (zzrv.class) {
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
