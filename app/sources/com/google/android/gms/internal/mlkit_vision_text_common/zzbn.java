package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-text-recognition-common@@19.1.0 */
/* loaded from: classes27.dex */
public abstract class zzbn extends zzbf implements Set {
    private transient zzbk zza;

    zzbn() {
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
        return zzcl.zza(this);
    }

    public final zzbk zzf() {
        zzbk zzbkVar = this.zza;
        if (zzbkVar != null) {
            return zzbkVar;
        }
        zzbk zzbkVarZzg = zzg();
        this.zza = zzbkVarZzg;
        return zzbkVarZzg;
    }

    zzbk zzg() {
        Object[] array2 = toArray();
        int i = zzbk.$r8$clinit;
        return zzbk.zzg(array2, array2.length);
    }
}
