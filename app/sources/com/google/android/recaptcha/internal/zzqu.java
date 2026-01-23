package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzqu extends zznl implements zzor {
    private static final zzqu zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zznq zzk = zznl.zzx();

    static {
        zzqu zzquVar = new zzqu();
        zzb = zzquVar;
        zznl.zzH(zzqu.class, zzquVar);
    }

    private zzqu() {
    }

    static /* synthetic */ void zzL(zzqu zzquVar, String str) {
        str.getClass();
        zzquVar.zzh = str;
    }

    static /* synthetic */ void zzM(zzqu zzquVar, String str) {
        str.getClass();
        zzquVar.zzf = str;
    }

    static /* synthetic */ void zzN(zzqu zzquVar, String str) {
        str.getClass();
        zzquVar.zzi = str;
    }

    public static zzqs zzf() {
        return (zzqs) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqu zzquVar, Iterable iterable) {
        zznq zznqVar = zzquVar.zzk;
        if (!zznqVar.zzc()) {
            zzquVar.zzk = zznl.zzy(zznqVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzquVar.zzk.zzh(((zzqt) it.next()).zza());
        }
    }

    static /* synthetic */ void zzk(zzqu zzquVar, String str) {
        str.getClass();
        zzquVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzqu();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzqs(zzqrVar);
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
        synchronized (zzqu.class) {
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
