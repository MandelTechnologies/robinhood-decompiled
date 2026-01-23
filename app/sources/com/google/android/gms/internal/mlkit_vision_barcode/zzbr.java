package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* loaded from: classes27.dex */
abstract class zzbr extends zzbv implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzbr(Map map) {
        zzaz.zzd(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzr(zzbr zzbrVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzbrVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbrVar.zzb -= size;
        }
    }

    abstract Collection zza();

    abstract Collection zzd(Object obj, Collection collection);

    public final Collection zzj(Object obj) {
        Collection collectionZza = (Collection) this.zza.get(obj);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzd(obj, collectionZza);
    }

    final List zzm(Object obj, List list, zzbo zzboVar) {
        return list instanceof RandomAccess ? new zzbm(this, obj, list, zzboVar) : new zzbq(this, obj, list, zzboVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    final Map zzo() {
        return new zzbi(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv
    final Set zzp() {
        return new zzbl(this, this.zza);
    }

    public final void zzs() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final boolean zzt(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
