package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzse extends zznl implements zzor {
    private static final zzse zzb;
    private static volatile zzoy zzd;
    private zzns zze = zznl.zzA();

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zznl.zzH(zzse.class, zzseVar);
    }

    private zzse() {
    }

    public static zzse zzg() {
        return zzb;
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
            return zznl.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzse();
        }
        zzsc zzscVar = null;
        if (i2 == 4) {
            return new zzsd(zzscVar);
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
        synchronized (zzse.class) {
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
