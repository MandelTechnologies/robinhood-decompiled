package com.google.android.libraries.places.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Objects;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
final class zzom extends zznx {
    static final zznx zza = new zzom(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzom(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzmt.zza(i, this.zzc, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zznx, com.google.android.libraries.places.internal.zznt
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    final Object[] zzg() {
        return this.zzb;
    }
}
