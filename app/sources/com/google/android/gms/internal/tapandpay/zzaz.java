package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
final class zzaz extends zzau {
    final transient Object zza;

    zzaz(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new zzav(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau
    /* renamed from: zzd */
    public final zzba iterator() {
        return new zzav(this.zza);
    }
}
