package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzst extends zznl implements zzor {
    private static final zzst zzb;
    private static volatile zzoy zzd;
    private zzlg zze;
    private String zzf;
    private long zzg;
    private zzlg zzh;
    private String zzi;
    private String zzj;

    static {
        zzst zzstVar = new zzst();
        zzb = zzstVar;
        zznl.zzH(zzst.class, zzstVar);
    }

    private zzst() {
        zzlg zzlgVar = zzlg.zzb;
        this.zze = zzlgVar;
        this.zzf = "";
        this.zzh = zzlgVar;
        this.zzi = "";
        this.zzj = "";
    }

    public static zzst zzk() {
        return zzb;
    }

    public final String zzL() {
        return this.zzf;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzlg zzg() {
        return this.zzh;
    }

    public final zzlg zzi() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzst();
        }
        zzsr zzsrVar = null;
        if (i2 == 4) {
            return new zzss(zzsrVar);
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
        synchronized (zzst.class) {
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
