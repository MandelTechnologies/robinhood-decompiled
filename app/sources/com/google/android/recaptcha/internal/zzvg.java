package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzvg extends zznl implements zzor {
    private static final zzvg zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private zznq zzg = zznl.zzx();
    private zznr zzh = zznl.zzz();
    private zzuk zzi;

    static {
        zzvg zzvgVar = new zzvg();
        zzb = zzvgVar;
        zznl.zzH(zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    public static zzvg zzi(byte[] bArr) throws zznv {
        return (zzvg) zznl.zzw(zzb, bArr);
    }

    public final zzuk zzf() {
        zzuk zzukVar = this.zzi;
        return zzukVar == null ? zzuk.zzg() : zzukVar;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzvg();
        }
        zzve zzveVar = null;
        if (i2 == 4) {
            return new zzvf(zzveVar);
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
        synchronized (zzvg.class) {
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
