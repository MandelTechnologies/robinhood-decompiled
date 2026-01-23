package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzuw extends zznl implements zzor {
    private static final zzuw zzb;
    private static volatile zzoy zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzuw zzuwVar = new zzuw();
        zzb = zzuwVar;
        zznl.zzH(zzuw.class, zzuwVar);
    }

    private zzuw() {
    }

    public static zzuw zzg(InputStream inputStream) throws IOException {
        return (zzuw) zznl.zzv(zzb, inputStream);
    }

    public final zzux zzi() {
        zzux zzuxVarZzb = zzux.zzb(this.zzg);
        return zzuxVarZzb == null ? zzux.UNRECOGNIZED : zzuxVarZzb;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzuw();
        }
        zzuu zzuuVar = null;
        if (i2 == 4) {
            return new zzuv(zzuuVar);
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
        synchronized (zzuw.class) {
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
