package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zztc extends zznl implements zzor {
    private static final zztc zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zznl.zzH(zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zztb zzf() {
        return (zztb) zzb.zzp();
    }

    static /* synthetic */ void zzi(zztc zztcVar, String str) {
        str.getClass();
        zztcVar.zze |= 2;
        zztcVar.zzg = str;
    }

    static /* synthetic */ void zzj(zztc zztcVar, String str) {
        str.getClass();
        zztcVar.zze |= 1;
        zztcVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zztc();
        }
        zzta zztaVar = null;
        if (i2 == 4) {
            return new zztb(zztaVar);
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
        synchronized (zztc.class) {
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
