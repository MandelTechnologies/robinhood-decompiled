package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzsq extends zznl implements zzor {
    private static final zzsq zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zznr zzl = zznl.zzz();
    private zzlg zzm = zzlg.zzb;
    private String zzn = "";
    private zzst zzo;
    private zzsn zzp;

    static {
        zzsq zzsqVar = new zzsq();
        zzb = zzsqVar;
        zznl.zzH(zzsq.class, zzsqVar);
    }

    private zzsq() {
    }

    public static zzsq zzi() {
        return zzb;
    }

    public final String zzL() {
        return this.zzi;
    }

    public final String zzM() {
        return this.zzh;
    }

    public final String zzN() {
        return this.zzj;
    }

    public final String zzO() {
        return this.zzk;
    }

    public final List zzP() {
        return this.zzl;
    }

    public final boolean zzQ() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzR() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzS() {
        return (this.zze & 256) != 0;
    }

    public final boolean zzT() {
        return (this.zze & 64) != 0;
    }

    public final zzlg zzf() {
        return this.zzm;
    }

    public final zzst zzj() {
        zzst zzstVar = this.zzo;
        return zzstVar == null ? zzst.zzk() : zzstVar;
    }

    public final String zzk() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\tለ\u0007\u000bဉ\b\fဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzsq();
        }
        zzso zzsoVar = null;
        if (i2 == 4) {
            return new zzsp(zzsoVar);
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
        synchronized (zzsq.class) {
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
