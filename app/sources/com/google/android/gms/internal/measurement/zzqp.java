package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes.dex */
public final class zzqp implements Supplier {
    private static final zzqp zza = new zzqp();
    private final Supplier zzb = Suppliers.ofInstance(new zzqr());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    public static boolean zzc() {
        return zza.get().zzc();
    }

    public static boolean zzd() {
        return zza.get().zzd();
    }

    public static boolean zze() {
        return zza.get().zze();
    }

    public static boolean zzf() {
        return zza.get().zzf();
    }

    public static boolean zzg() {
        return zza.get().zzg();
    }

    public static boolean zzh() {
        return zza.get().zzh();
    }

    public static boolean zzi() {
        return zza.get().zzi();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzqq get() {
        return (zzqq) this.zzb.get();
    }
}
