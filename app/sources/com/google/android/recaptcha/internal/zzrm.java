package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzrm extends zznl implements zzor {
    private static final zzrm zzb;
    private static volatile zzoy zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzmt zzo;
    private int zzp;
    private zzra zzq;
    private zzry zzr;
    private zzpt zzt;
    private zzmt zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzs = "";
    private zznq zzv = zznl.zzx();

    static {
        zzrm zzrmVar = new zzrm();
        zzb = zzrmVar;
        zznl.zzH(zzrm.class, zzrmVar);
    }

    private zzrm() {
    }

    public static zzrm zzL(byte[] bArr) throws zznv {
        return (zzrm) zznl.zzw(zzb, bArr);
    }

    static /* synthetic */ void zzO(zzrm zzrmVar, int i) {
        zznq zznqVar = zzrmVar.zzv;
        if (!zznqVar.zzc()) {
            zzrmVar.zzv = zznl.zzy(zznqVar);
        }
        zzrmVar.zzv.zzh(0);
    }

    static /* synthetic */ void zzP(zzrm zzrmVar, String str) {
        str.getClass();
        zzrmVar.zzj = str;
    }

    static /* synthetic */ void zzR(zzrm zzrmVar, zzra zzraVar) {
        zzrmVar.zzq = zzraVar;
        zzrmVar.zze |= 2;
    }

    static /* synthetic */ void zzS(zzrm zzrmVar, String str) {
        str.getClass();
        zzrmVar.zzk = str;
    }

    static /* synthetic */ void zzT(zzrm zzrmVar, zzry zzryVar) {
        zzryVar.getClass();
        zzrmVar.zzr = zzryVar;
        zzrmVar.zze |= 4;
    }

    static /* synthetic */ void zzU(zzrm zzrmVar, int i) {
        zzrmVar.zze |= 32;
        zzrmVar.zzw = i;
    }

    static /* synthetic */ void zzab(zzrm zzrmVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzrmVar.zzi = i - 2;
    }

    public static zzrl zzi() {
        return (zzrl) zzb.zzp();
    }

    public static zzrm zzk() {
        return zzb;
    }

    public final String zzM() {
        return this.zzk;
    }

    public final String zzN() {
        return this.zzl;
    }

    public final boolean zzX() {
        return (this.zze & 2) != 0;
    }

    public final int zzY() {
        int i;
        switch (this.zzh) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case 37:
                i = 39;
                break;
            case 38:
                i = 40;
                break;
            case 39:
                i = 41;
                break;
            case 40:
                i = 42;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzZ() {
        int i = this.zzp;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Deprecated
    public final long zzf() {
        return this.zzn;
    }

    public final zzra zzg() {
        zzra zzraVar = this.zzq;
        return zzraVar == null ? zzra.zzj() : zzraVar;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqq.class, "zzv", "zzw", "zzi"});
        }
        if (i2 == 3) {
            return new zzrm();
        }
        zzrk zzrkVar = null;
        if (i2 == 4) {
            return new zzrl(zzrkVar);
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
        synchronized (zzrm.class) {
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
