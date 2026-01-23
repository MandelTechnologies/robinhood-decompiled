package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzva extends zznl implements zzor {
    private static final zzva zzb;
    private static volatile zzoy zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzva zzvaVar = new zzva();
        zzb = zzvaVar;
        zznl.zzH(zzva.class, zzvaVar);
    }

    private zzva() {
    }

    static /* synthetic */ void zzL(zzva zzvaVar, zzrm zzrmVar) {
        zzrmVar.getClass();
        zzvaVar.zzf = zzrmVar;
        zzvaVar.zze = 1;
    }

    static /* synthetic */ void zzM(zzva zzvaVar, zzsb zzsbVar) {
        zzsbVar.getClass();
        zzvaVar.zzf = zzsbVar;
        zzvaVar.zze = 2;
    }

    public static zzuz zzi() {
        return (zzuz) zzb.zzp();
    }

    public static zzva zzk(byte[] bArr) throws zznv {
        return (zzva) zznl.zzw(zzb, bArr);
    }

    public final int zzN() {
        int i = this.zze;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final zzrm zzf() {
        return this.zze == 1 ? (zzrm) this.zzf : zzrm.zzk();
    }

    public final zzsb zzg() {
        return this.zze == 2 ? (zzsb) this.zzf : zzsb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzrm.class, zzsb.class});
        }
        if (i2 == 3) {
            return new zzva();
        }
        zzuy zzuyVar = null;
        if (i2 == 4) {
            return new zzuz(zzuyVar);
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
        synchronized (zzva.class) {
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
