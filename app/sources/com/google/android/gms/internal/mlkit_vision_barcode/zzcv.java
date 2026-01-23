package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* loaded from: classes27.dex */
public abstract class zzcv extends zzcn implements Set {
    private transient zzcs zza;

    zzcv() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzds.zzb(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzds.zza(this);
    }

    public final zzcs zzf() {
        zzcs zzcsVar = this.zza;
        if (zzcsVar != null) {
            return zzcsVar;
        }
        zzcs zzcsVarZzg = zzg();
        this.zza = zzcsVarZzg;
        return zzcsVarZzg;
    }

    zzcs zzg() {
        Object[] array2 = toArray();
        int i = zzcs.$r8$clinit;
        return zzcs.zzg(array2, array2.length);
    }
}
