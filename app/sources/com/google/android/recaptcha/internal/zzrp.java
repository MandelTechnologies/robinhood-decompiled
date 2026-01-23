package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzrp extends zznl implements zzor {
    private static final zzrp zzb;
    private static volatile zzoy zzd;
    private int zze;
    private zzns zzf = zznl.zzA();
    private zzns zzg = zznl.zzA();
    private zzqx zzh;

    static {
        zzrp zzrpVar = new zzrp();
        zzb = zzrpVar;
        zznl.zzH(zzrp.class, zzrpVar);
    }

    private zzrp() {
    }

    static /* synthetic */ void zzM(zzrp zzrpVar, zzrm zzrmVar) {
        zzrmVar.getClass();
        zzns zznsVar = zzrpVar.zzf;
        if (!zznsVar.zzc()) {
            zzrpVar.zzf = zznl.zzB(zznsVar);
        }
        zzrpVar.zzf.add(zzrmVar);
    }

    static /* synthetic */ void zzN(zzrp zzrpVar, zzsb zzsbVar) {
        zzsbVar.getClass();
        zzns zznsVar = zzrpVar.zzg;
        if (!zznsVar.zzc()) {
            zzrpVar.zzg = zznl.zzB(zznsVar);
        }
        zzrpVar.zzg.add(zzsbVar);
    }

    public static zzro zzi() {
        return (zzro) zzb.zzp();
    }

    public static zzrp zzk(byte[] bArr) throws zznv {
        return (zzrp) zznl.zzw(zzb, bArr);
    }

    public final List zzL() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzf.size();
    }

    public final int zzg() {
        return this.zzg.size();
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", zzrm.class, "zzg", zzsb.class, "zzh"});
        }
        if (i2 == 3) {
            return new zzrp();
        }
        zzrn zzrnVar = null;
        if (i2 == 4) {
            return new zzro(zzrnVar);
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
        synchronized (zzrp.class) {
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
