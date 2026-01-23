package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Executors6;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzbk {
    private final CoroutineScope zza = CoroutineScope2.MainScope();
    private final CoroutineScope zzb;
    private final CoroutineScope zzc;
    private final CoroutineScope zzd;

    public zzbk() {
        CoroutineScope CoroutineScope = CoroutineScope2.CoroutineScope(Executors6.from(Executors.newSingleThreadExecutor()));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new zzbj(null), 3, null);
        this.zzb = CoroutineScope;
        this.zzc = CoroutineScope2.CoroutineScope(Dispatchers.getIO());
        CoroutineScope CoroutineScope2 = CoroutineScope2.CoroutineScope(Executors6.from(Executors.newSingleThreadExecutor()));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2, null, null, new zzbi(null), 3, null);
        this.zzd = CoroutineScope2;
    }

    public final CoroutineScope zza() {
        return this.zzc;
    }

    public final CoroutineScope zzb() {
        return this.zza;
    }

    public final CoroutineScope zzc() {
        return this.zzd;
    }

    public final CoroutineScope zzd() {
        return this.zzb;
    }
}
