package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzlx extends zzni implements zzor {
    private static final zzlx zzd;
    private static volatile zzoy zze;
    private int zzf;
    private boolean zzg;
    private zzmg zzh;
    private boolean zzi;
    private zzmj zzj;
    private byte zzl = 2;
    private zzns zzk = zzpb.zze();

    static {
        zzlx zzlxVar = new zzlx();
        zzd = zzlxVar;
        zznl.zzH(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    public static zzlx zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new zzpc(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzmp.class});
        }
        if (i2 == 3) {
            return new zzlx();
        }
        zzlv zzlvVar = null;
        if (i2 == 4) {
            return new zzlw(zzlvVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            this.zzl = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoy zzoyVar = zze;
        if (zzoyVar != null) {
            return zzoyVar;
        }
        synchronized (zzlx.class) {
            try {
                zzngVar = zze;
                if (zzngVar == null) {
                    zzngVar = new zzng(zzd);
                    zze = zzngVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzngVar;
    }
}
