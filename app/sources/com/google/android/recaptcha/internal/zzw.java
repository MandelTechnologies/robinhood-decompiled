package com.google.android.recaptcha.internal;

import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzw extends ContinuationImpl7 implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsq zzd;
    final /* synthetic */ zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzsq zzsqVar, zzx zzxVar, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzsqVar;
        this.zze = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzw(this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        zzst zzstVarZzj;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzstVarZzj = (zzst) this.zza;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (!this.zzd.zzS()) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(new zzbf(zzbd.zzb, zzbc.zzab, null))));
            }
            zzsq zzsqVar = this.zzd;
            zzx zzxVar = this.zze;
            zzstVarZzj = zzsqVar.zzj();
            zzxVar.zzc = zzstVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) it.next();
            this.zza = zzstVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzaaVar.zzd(zzstVarZzj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m28549boximpl(Result.m28550constructorimpl(Unit.INSTANCE));
    }
}
