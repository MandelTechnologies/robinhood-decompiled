package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzun extends zznl implements zzor {
    private static final zzun zzb;
    private static volatile zzoy zzd;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzun zzunVar = new zzun();
        zzb = zzunVar;
        zznl.zzH(zzun.class, zzunVar);
    }

    private zzun() {
    }

    static /* synthetic */ void zzM(zzun zzunVar, String str) {
        str.getClass();
        zzunVar.zzi = str;
    }

    static /* synthetic */ void zzN(zzun zzunVar, String str) {
        str.getClass();
        zzunVar.zze = str;
    }

    public static zzum zzf() {
        return (zzum) zzb.zzp();
    }

    static /* synthetic */ void zzj(zzun zzunVar, String str) {
        str.getClass();
        zzunVar.zzj = str;
    }

    static /* synthetic */ void zzk(zzun zzunVar, String str) {
        str.getClass();
        zzunVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzun();
        }
        zzul zzulVar = null;
        if (i2 == 4) {
            return new zzum(zzulVar);
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
        synchronized (zzun.class) {
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
