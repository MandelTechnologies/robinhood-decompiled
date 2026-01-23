package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzts extends zznl implements zzor {
    private static final zzts zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zznq zzh = zznl.zzx();
    private int zzi;
    private int zzj;

    static {
        zzts zztsVar = new zzts();
        zzb = zztsVar;
        zznl.zzH(zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zztq zzf() {
        return (zztq) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzts zztsVar, String str) {
        str.getClass();
        zztsVar.zze |= 2;
        zztsVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzts zztsVar, String str) {
        str.getClass();
        zztsVar.zze |= 1;
        zztsVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzts zztsVar, int i) {
        zztsVar.zzi = 2;
        zztsVar.zze |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zztr.zza, "zzj"});
        }
        if (i2 == 3) {
            return new zzts();
        }
        zztp zztpVar = null;
        if (i2 == 4) {
            return new zztq(zztpVar);
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
        synchronized (zzts.class) {
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
