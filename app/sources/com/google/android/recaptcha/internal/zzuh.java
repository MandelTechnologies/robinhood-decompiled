package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzuh extends zznl implements zzor {
    private static final zzuh zzb;
    private static volatile zzoy zzd;
    private zzns zze = zznl.zzA();
    private int zzf;

    static {
        zzuh zzuhVar = new zzuh();
        zzb = zzuhVar;
        zznl.zzH(zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    private final void zzL() {
        zzns zznsVar = this.zze;
        if (zznsVar.zzc()) {
            return;
        }
        this.zze = zznl.zzB(zznsVar);
    }

    public static zzud zzf() {
        return (zzud) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzuh zzuhVar, Iterable iterable) {
        zzuhVar.zzL();
        zzkq.zzc(iterable, zzuhVar.zze);
    }

    static /* synthetic */ void zzj(zzuh zzuhVar, zzug zzugVar) {
        zzugVar.getClass();
        zzuhVar.zzL();
        zzuhVar.zze.add(zzugVar);
    }

    @Override // com.google.android.recaptcha.internal.zznl
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoy zzngVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zznl.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzug.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzuh();
        }
        zzuc zzucVar = null;
        if (i2 == 4) {
            return new zzud(zzucVar);
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
        synchronized (zzuh.class) {
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
