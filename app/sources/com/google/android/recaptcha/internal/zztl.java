package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zztl extends zznl implements zzor {
    private static final zztl zzb;
    private static volatile zzoy zzd;
    private int zze;
    private long zzg;
    private int zzh;
    private String zzf = "";
    private zzns zzi = zznl.zzA();
    private zzlg zzj = zzlg.zzb;
    private String zzk = "";
    private String zzl = "";

    static {
        zztl zztlVar = new zztl();
        zzb = zztlVar;
        zznl.zzH(zztl.class, zztlVar);
    }

    private zztl() {
    }

    public static zztl zzi() {
        return zzb;
    }

    public final zzlg zzf() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzto.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zztl();
        }
        zztj zztjVar = null;
        if (i2 == 4) {
            return new zztk(zztjVar);
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
        synchronized (zztl.class) {
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
