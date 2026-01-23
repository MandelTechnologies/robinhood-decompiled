package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zztv extends zznl implements zzor {
    private static final zztv zzb;
    private static volatile zzoy zzd;
    private int zze;
    private String zzf = "";
    private zzns zzg = zznl.zzA();

    static {
        zztv zztvVar = new zztv();
        zzb = zztvVar;
        zznl.zzH(zztv.class, zztvVar);
    }

    private zztv() {
    }

    public static zztu zzf() {
        return (zztu) zzb.zzp();
    }

    static /* synthetic */ void zzi(zztv zztvVar, zzts zztsVar) {
        zztsVar.getClass();
        zzns zznsVar = zztvVar.zzg;
        if (!zznsVar.zzc()) {
            zztvVar.zzg = zznl.zzB(zznsVar);
        }
        zztvVar.zzg.add(zztsVar);
    }

    static /* synthetic */ void zzj(zztv zztvVar, String str) {
        str.getClass();
        zztvVar.zze |= 1;
        zztvVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzts.class, "zzf"});
        }
        if (i2 == 3) {
            return new zztv();
        }
        zztt zzttVar = null;
        if (i2 == 4) {
            return new zztu(zzttVar);
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
        synchronized (zztv.class) {
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
