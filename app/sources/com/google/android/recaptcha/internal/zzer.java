package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzer extends TimerTask {
    final /* synthetic */ zzeu zza;

    public zzer(zzeu zzeuVar) {
        this.zza = zzeuVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.zza;
        BuildersKt__Builders_commonKt.launch$default(zzeuVar.zzd, null, null, new zzes(zzeuVar, null), 3, null);
    }
}
