package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzvd extends zznl implements zzor {
    private static final zzvd zzb;
    private static volatile zzoy zzd;
    private zzns zze = zznl.zzA();

    static {
        zzvd zzvdVar = new zzvd();
        zzb = zzvdVar;
        zznl.zzH(zzvd.class, zzvdVar);
    }

    private zzvd() {
    }

    public static zzvd zzg(byte[] bArr) throws zznv {
        return (zzvd) zznl.zzw(zzb, bArr);
    }

    public final List zzi() {
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
            return zznl.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzvm.class});
        }
        if (i2 == 3) {
            return new zzvd();
        }
        zzvb zzvbVar = null;
        if (i2 == 4) {
            return new zzvc(zzvbVar);
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
        synchronized (zzvd.class) {
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
