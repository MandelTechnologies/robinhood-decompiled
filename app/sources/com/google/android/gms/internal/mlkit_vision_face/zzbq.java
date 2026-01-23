package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes27.dex */
public abstract class zzbq extends zzbi implements Set {
    private transient zzbn zza;

    zzbq() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcj.zza(this);
    }

    public final zzbn zzf() {
        zzbn zzbnVar = this.zza;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzbn zzbnVarZzg = zzg();
        this.zza = zzbnVarZzg;
        return zzbnVarZzg;
    }

    zzbn zzg() {
        return zzbn.zzg(toArray());
    }
}
