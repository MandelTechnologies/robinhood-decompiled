package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public final class zzbcs {
    private List zza = Collections.EMPTY_LIST;
    private zzaye zzb = zzaye.zza;
    private zzbcp zzc;

    zzbcs() {
    }

    public final zzbcs zza(List list) {
        this.zza = list;
        return this;
    }

    public final zzbcs zzb(zzaye zzayeVar) {
        this.zzb = zzayeVar;
        return this;
    }

    public final zzbcs zzc(zzbcp zzbcpVar) {
        this.zzc = zzbcpVar;
        return this;
    }

    public final zzbct zzd() {
        return new zzbct(this.zza, this.zzb, this.zzc);
    }
}
