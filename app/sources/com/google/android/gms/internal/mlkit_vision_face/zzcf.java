package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes27.dex */
final class zzcf extends zzbq {
    private final transient zzbp zza;
    private final transient zzbn zzb;

    zzcf(zzbp zzbpVar, zzbn zzbnVar) {
        this.zza = zzbpVar;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }
}
