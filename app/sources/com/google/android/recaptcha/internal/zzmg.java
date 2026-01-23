package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzmg extends zzni implements zzor {
    private static final zzmg zzd;
    private static volatile zzoy zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;

    static {
        zzmg zzmgVar = new zzmg();
        zzd = zzmgVar;
        zznl.zzH(zzmg.class, zzmgVar);
    }

    private zzmg() {
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new zzpc(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", zzmb.zza, "zzh", zzma.zza, "zzi", zzme.zza, "zzj", zzmf.zza, "zzk", zzmd.zza, "zzl", zzmc.zza});
        }
        if (i2 == 3) {
            return new zzmg();
        }
        zzly zzlyVar = null;
        if (i2 == 4) {
            return new zzlz(zzlyVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoy zzoyVar = zze;
        if (zzoyVar != null) {
            return zzoyVar;
        }
        synchronized (zzmg.class) {
            try {
                zzngVar = zze;
                if (zzngVar == null) {
                    zzngVar = new zzng(zzd);
                    zze = zzngVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzngVar;
    }
}
