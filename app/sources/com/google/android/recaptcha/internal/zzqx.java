package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzqx extends zznl implements zzor {
    private static final zzqx zzb;
    private static volatile zzoy zzd;
    private zzlg zze;
    private String zzf;
    private zzlg zzg;
    private String zzh;
    private String zzi;
    private zzlg zzj;
    private String zzk;

    static {
        zzqx zzqxVar = new zzqx();
        zzb = zzqxVar;
        zznl.zzH(zzqx.class, zzqxVar);
    }

    private zzqx() {
        zzlg zzlgVar = zzlg.zzb;
        this.zze = zzlgVar;
        this.zzf = "";
        this.zzg = zzlgVar;
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzlgVar;
        this.zzk = "";
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzqx();
        }
        zzqv zzqvVar = null;
        if (i2 == 4) {
            return new zzqw(zzqvVar);
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
        synchronized (zzqx.class) {
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
