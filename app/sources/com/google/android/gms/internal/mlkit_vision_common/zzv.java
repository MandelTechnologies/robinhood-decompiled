package com.google.android.gms.internal.mlkit_vision_common;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.AbstractMap;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes27.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzf.zza(i, this.zza.zzc, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        zzw zzwVar = this.zza;
        int i2 = i + i;
        Object obj = zzwVar.zzb[i2];
        obj.getClass();
        Object obj2 = zzwVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
