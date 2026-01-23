package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes27.dex */
public final class zzqa implements Supplier {
    private static final zzqa zza = new zzqa();
    private final Supplier zzb = Suppliers.ofInstance(new zzqc());

    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // com.google.common.base.Supplier
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqb get() {
        return (zzqb) this.zzb.get();
    }
}
