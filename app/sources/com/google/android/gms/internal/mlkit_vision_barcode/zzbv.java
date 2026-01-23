package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* loaded from: classes27.dex */
abstract class zzbv implements zzdg {
    private transient Set zzb;
    private transient Map zzc;

    zzbv() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdg) {
            return zzv().equals(((zzdg) obj).zzv());
        }
        return false;
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final String toString() {
        return zzv().toString();
    }

    abstract Map zzo();

    abstract Set zzp();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final Map zzv() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map mapZzo = zzo();
        this.zzc = mapZzo;
        return mapZzo;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdg
    public final Set zzw() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set setZzp = zzp();
        this.zzb = setZzp;
        return setZzp;
    }
}
