package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzcv extends ContinuationImpl7 implements Function2 {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcx zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcp zzg;
    final /* synthetic */ zzcj zzh;
    final /* synthetic */ zzbk zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(zzcx zzcxVar, String str, long j, zzcp zzcpVar, zzbk zzbkVar, zzcj zzcjVar, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzcxVar;
        this.zze = str;
        this.zzf = j;
        this.zzg = zzcpVar;
        this.zzi = zzbkVar;
        this.zzh = zzcjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        zzcv zzcvVar = new zzcv(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, continuation);
        zzcvVar.zzc = obj;
        return zzcvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((zzem) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws zzbf {
        zzem zzemVar;
        zzcp zzcpVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            zzcpVar = (zzcp) this.zza;
            zzemVar = (zzem) this.zzc;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            zzemVar = (zzem) this.zzc;
            zzde zzdeVarZza = zzcx.zza(this.zzd, this.zze);
            if (zzdeVarZza != null) {
                return zzdeVarZza;
            }
            zzcx.zzc(this.zzd, this.zzf);
            zzcp zzcpVarZze = this.zzg;
            if (zzcpVarZze == null) {
                zzcpVarZze = zzcx.zze(this.zzd, this.zze, this.zzi, this.zzh, zzemVar);
            }
            long j = this.zzf;
            this.zzc = zzemVar;
            this.zza = zzcpVarZze;
            this.zzb = 1;
            if (zzcpVarZze.zzb(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcpVar = zzcpVarZze;
        }
        zzde zzdeVar = new zzde(zzcpVar, this.zze, this.zzi, zzemVar);
        this.zzd.zzc = zzdeVar;
        return zzdeVar;
    }
}
