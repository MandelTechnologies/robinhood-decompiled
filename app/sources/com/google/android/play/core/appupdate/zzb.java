package com.google.android.play.core.appupdate;

import android.content.Context;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes27.dex */
public final class zzb {
    private static zza zza;

    static synchronized zza zza(Context context) {
        try {
            if (zza == null) {
                zzab zzabVar = new zzab(null);
                zzabVar.zzb(new zzi(com.google.android.play.core.appupdate.internal.zzz.zza(context)));
                zza = zzabVar.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
