package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.11.0 */
/* loaded from: classes27.dex */
public abstract class zzaj extends zzab implements Set {
    private transient zzaf zza;

    zzaj() {
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
        return zzar.zza(this);
    }

    public final zzaf zzf() {
        zzaf zzafVar = this.zza;
        if (zzafVar != null) {
            return zzafVar;
        }
        zzaf zzafVarZzg = zzg();
        this.zza = zzafVarZzg;
        return zzafVarZzg;
    }

    zzaf zzg() {
        Object[] array2 = toArray();
        int i = zzaf.$r8$clinit;
        return zzaf.zzg(array2, array2.length);
    }
}
