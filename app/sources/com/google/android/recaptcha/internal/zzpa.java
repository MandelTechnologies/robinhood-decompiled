package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzpa {
    public static final /* synthetic */ int zza = 0;
    private static final zzpa zzb = new zzpa();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzpf zzc = new zzoi();

    private zzpa() {
    }

    public static zzpa zza() {
        return zzb;
    }

    public final zzpe zzb(Class cls) {
        zznt.zzc(cls, "messageType");
        zzpe zzpeVar = (zzpe) this.zzd.get(cls);
        if (zzpeVar != null) {
            return zzpeVar;
        }
        zzpe zzpeVarZza = this.zzc.zza(cls);
        zznt.zzc(cls, "messageType");
        zzpe zzpeVar2 = (zzpe) this.zzd.putIfAbsent(cls, zzpeVarZza);
        return zzpeVar2 == null ? zzpeVarZza : zzpeVar2;
    }
}
