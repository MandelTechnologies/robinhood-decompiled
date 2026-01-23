package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzpk implements Iterator {
    final /* synthetic */ zzpo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzpk(zzpo zzpoVar, zzpj zzpjVar) {
        this.zza = zzpoVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzpo zzpoVar = this.zza;
        if (i >= zzpoVar.zzb) {
            return !zzpoVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzpo zzpoVar = this.zza;
        return i < zzpoVar.zzb ? (zzpi) zzpoVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i = this.zzb;
        zzpo zzpoVar = this.zza;
        if (i >= zzpoVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzpoVar.zzm(i);
        }
    }
}
