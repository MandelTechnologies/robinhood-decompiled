package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzug extends zznl implements zzor {
    private static final zzug zzb;
    private static volatile zzoy zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzug zzugVar = new zzug();
        zzb = zzugVar;
        zznl.zzH(zzug.class, zzugVar);
    }

    private zzug() {
    }

    static /* synthetic */ void zzL(zzug zzugVar, double d) {
        zzugVar.zze = 10;
        zzugVar.zzf = Double.valueOf(d);
    }

    static /* synthetic */ void zzM(zzug zzugVar, float f) {
        zzugVar.zze = 9;
        zzugVar.zzf = Float.valueOf(f);
    }

    static /* synthetic */ void zzN(zzug zzugVar, int i) {
        zzugVar.zze = 4;
        zzugVar.zzf = Integer.valueOf(i);
    }

    static /* synthetic */ void zzO(zzug zzugVar, int i) {
        zzugVar.zze = 5;
        zzugVar.zzf = Integer.valueOf(i);
    }

    static /* synthetic */ void zzP(zzug zzugVar, long j) {
        zzugVar.zze = 7;
        zzugVar.zzf = Long.valueOf(j);
    }

    static /* synthetic */ void zzQ(zzug zzugVar, String str) {
        str.getClass();
        zzugVar.zze = 11;
        zzugVar.zzf = str;
    }

    public static zzuf zzf() {
        return (zzuf) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzug zzugVar, boolean z) {
        zzugVar.zze = 1;
        zzugVar.zzf = Boolean.valueOf(z);
    }

    static /* synthetic */ void zzj(zzug zzugVar, zzlg zzlgVar) {
        zzugVar.zze = 2;
        zzugVar.zzf = zzlgVar;
    }

    static /* synthetic */ void zzk(zzug zzugVar, String str) {
        str.getClass();
        zzugVar.zze = 3;
        zzugVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzug();
        }
        zzue zzueVar = null;
        if (i2 == 4) {
            return new zzuf(zzueVar);
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
        synchronized (zzug.class) {
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
