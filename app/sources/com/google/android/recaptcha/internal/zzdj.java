package com.google.android.recaptcha.internal;

import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzdj extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzdv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(zzdv zzdvVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzdvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdj(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws RecaptchaException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i != 0) {
            return obj;
        }
        int iZza = new zzbu(GoogleApiAvailabilityLight.getInstance()).zza(this.zzb.zzr());
        zzdv zzdvVar = this.zzb;
        String str = zzdvVar.zza;
        String packageName = zzdvVar.zzr().getPackageName();
        String strZzd = this.zzb.zzb.zzd();
        zzbh zzbhVarZzt = this.zzb.zzt();
        int i2 = Build.VERSION.SDK_INT;
        String strZza = zzbhVarZzt.zza();
        zzum zzumVarZzf = zzun.zzf();
        zzumVarZzf.zzs(str);
        zzumVarZzf.zzp(packageName);
        zzumVarZzf.zzt(iZza);
        zzumVarZzf.zzq("18.6.0");
        zzumVarZzf.zzr(strZzd);
        zzumVarZzf.zze(String.valueOf(i2));
        zzumVarZzf.zzd(strZza);
        zzun zzunVar = (zzun) zzumVarZzf.zzj();
        zzdv zzdvVar2 = this.zzb;
        zzfh zzfhVarZzg = zzdv.zzg(zzdvVar2);
        String strZzb = zzdv.zzd(zzdvVar2).zzb();
        this.zza = 1;
        Object objZzc = zzfhVarZzg.zzc(strZzb, zzunVar, this);
        return objZzc == coroutine_suspended ? coroutine_suspended : objZzc;
    }
}
