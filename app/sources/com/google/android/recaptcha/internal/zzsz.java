package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzsz extends zznl implements zzor {
    private static final zzsz zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zztf zzk;
    private zzsw zzl;
    private zztc zzm;
    private zzsk zzn;

    static {
        zzsz zzszVar = new zzsz();
        zzb = zzszVar;
        zznl.zzH(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    static /* synthetic */ void zzN(zzsz zzszVar, String str) {
        str.getClass();
        zzszVar.zze |= 1;
        zzszVar.zzf = str;
    }

    static /* synthetic */ void zzO(zzsz zzszVar, zzsw zzswVar) {
        zzswVar.getClass();
        zzszVar.zzl = zzswVar;
        zzszVar.zze |= 64;
    }

    static /* synthetic */ void zzP(zzsz zzszVar, zztf zztfVar) {
        zztfVar.getClass();
        zzszVar.zzk = zztfVar;
        zzszVar.zze |= 32;
    }

    static /* synthetic */ void zzQ(zzsz zzszVar, zztc zztcVar) {
        zztcVar.getClass();
        zzszVar.zzm = zztcVar;
        zzszVar.zze |= 128;
    }

    public static zzsy zzf() {
        return (zzsy) zzb.zzp();
    }

    public static zzsz zzi(byte[] bArr) throws zznv {
        return (zzsz) zznl.zzw(zzb, bArr);
    }

    @Deprecated
    public final String zzL() {
        return this.zzg;
    }

    @Deprecated
    public final String zzM() {
        return this.zzh;
    }

    @Deprecated
    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzsz();
        }
        zzsx zzsxVar = null;
        if (i2 == 4) {
            return new zzsy(zzsxVar);
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
        synchronized (zzsz.class) {
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
