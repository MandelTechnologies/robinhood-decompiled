package com.google.android.gms.internal.tapandpay;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
final class zzax extends zzat {
    static final zzat zza = new zzax(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzax(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzam.zza(i, this.zzc, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, com.google.android.gms.internal.tapandpay.zzaq
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final Object[] zze() {
        return this.zzb;
    }
}
