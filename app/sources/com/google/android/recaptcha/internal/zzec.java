package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzec extends ContinuationImpl7 implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzee zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ CompletableDeferred zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzec(zzee zzeeVar, long j, CompletableDeferred completableDeferred, Continuation continuation) {
        super(1, continuation);
        this.zzc = zzeeVar;
        this.zzd = j;
        this.zze = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Continuation continuation) {
        return new zzec(this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzec) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException, zzbf {
        zzep zzepVar;
        zzbf e;
        zzep zzepVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzep zzepVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdv zzdvVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzepVarZzf;
                this.zzb = 1;
                Object objZzo = zzdvVar.zzo(j, this);
                if (objZzo != coroutine_suspended) {
                    zzepVar2 = zzepVarZzf;
                    obj = objZzo;
                }
                return coroutine_suspended;
            } catch (zzbf e2) {
                zzepVar = zzepVarZzf;
                e = e2;
                this.zzc.zzd = e;
                zzepVar.zzb(e);
                throw e;
            }
        }
        if (i != 1) {
            zzepVar = (zzep) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
                zzepVar.zza();
                this.zzc.zzf = zzco.zzb;
                return boxing.boxBoolean(this.zze.complete(Unit.INSTANCE));
            } catch (zzbf e3) {
                e = e3;
                this.zzc.zzd = e;
                zzepVar.zzb(e);
                throw e;
            }
        }
        zzepVar2 = (zzep) this.zza;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (zzbf e4) {
            e = e4;
            zzepVar = zzepVar2;
            this.zzc.zzd = e;
            zzepVar.zzb(e);
            throw e;
        }
        zzsq zzsqVar = (zzsq) obj;
        this.zzc.zze = zzsqVar;
        zzdv zzdvVar2 = this.zzc.zza;
        long j2 = this.zzd;
        this.zza = zzepVar2;
        this.zzb = 2;
        if (zzdvVar2.zzn(zzsqVar, j2, this) != coroutine_suspended) {
            zzepVar = zzepVar2;
            zzepVar.zza();
            this.zzc.zzf = zzco.zzb;
            return boxing.boxBoolean(this.zze.complete(Unit.INSTANCE));
        }
        return coroutine_suspended;
    }
}
