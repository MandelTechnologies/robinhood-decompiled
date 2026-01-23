package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzsb extends zznl implements zzor {
    private static final zzsb zzb;
    private static volatile zzoy zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzmt zzj;
    private zzpt zzk;
    private int zzl;
    private zzrj zzm;
    private String zzh = "";
    private String zzi = "";
    private zzns zzn = zznl.zzA();

    static {
        zzsb zzsbVar = new zzsb();
        zzb = zzsbVar;
        zznl.zzH(zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    public static zzsb zzg() {
        return zzb;
    }

    public static zzsb zzi(byte[] bArr) throws zznv {
        return (zzsb) zznl.zzw(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzrs.class, "zzg", "zzh", "zzi", "zzm"});
        }
        if (i2 == 3) {
            return new zzsb();
        }
        zzrz zzrzVar = null;
        if (i2 == 4) {
            return new zzsa(zzrzVar);
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
        synchronized (zzsb.class) {
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
