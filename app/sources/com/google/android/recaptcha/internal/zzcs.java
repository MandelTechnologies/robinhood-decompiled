package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Timeout4;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzcs {
    private static zzcx zza;

    public static final zzcx zza(Application application) {
        zzcx zzcxVar = zza;
        if (zzcxVar == null) {
            zzcxVar = new zzcx(application);
        }
        if (zza == null) {
            zza = zzcxVar;
        }
        return zzcxVar;
    }

    public static final Object zzb(Application application, String str, long j, Continuation continuation) throws RecaptchaException, Timeout4, ApiException {
        return zzcx.zzh(zza(application), str, j, null, null, null, continuation, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) throws RecaptchaException, Timeout4, ApiException {
        return zzau.zza(BuildersKt__Builders_commonKt.async$default(zza(application).zzd().zza(), null, null, new zzcq(application, str, j, null), 3, null));
    }

    public static final Object zzd(Application application, String str, Continuation continuation) throws RecaptchaException, ApiException {
        zzcx zzcxVarZza = zza(application);
        return zzcx.zzh(zzcxVarZza, str, 0L, null, zzcxVarZza.zzf, zzcj.zzb, continuation, 2, null);
    }

    public static final Task zze(Application application, String str) throws RecaptchaException, ApiException {
        return zzau.zza(BuildersKt__Builders_commonKt.async$default(zza(application).zzd().zza(), null, null, new zzcr(application, str, null), 3, null));
    }
}
