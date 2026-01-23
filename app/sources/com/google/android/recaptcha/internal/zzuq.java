package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzuq extends zznl implements zzor {
    private static final zzuq zzb;
    private static volatile zzoy zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzuq zzuqVar = new zzuq();
        zzb = zzuqVar;
        zznl.zzH(zzuq.class, zzuqVar);
    }

    private zzuq() {
    }

    public static zzup zzf() {
        return (zzup) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzuq zzuqVar, String str) {
        str.getClass();
        zzuqVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzuq();
        }
        zzuo zzuoVar = null;
        if (i2 == 4) {
            return new zzup(zzuoVar);
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
        synchronized (zzuq.class) {
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
