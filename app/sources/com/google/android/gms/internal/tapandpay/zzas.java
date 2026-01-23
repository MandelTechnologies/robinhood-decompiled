package com.google.android.gms.internal.tapandpay;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
final class zzas extends zzat {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzat zzc;

    zzas(zzat zzatVar, int i, int i2) {
        this.zzc = zzatVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzam.zza(i, this.zzb, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat
    /* renamed from: zzf */
    public final zzat subList(int i, int i2) {
        zzam.zzc(i, i2, this.zzb);
        zzat zzatVar = this.zzc;
        int i3 = this.zza;
        return zzatVar.subList(i + i3, i2 + i3);
    }
}
