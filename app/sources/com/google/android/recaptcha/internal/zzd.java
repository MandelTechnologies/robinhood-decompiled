package com.google.android.recaptcha.internal;

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
final class zzd extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(zze zzeVar, zzsq zzsqVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzeVar;
        this.zzc = zzsqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzd(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws zzbf {
        Object objZzh;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i != 0) {
            objZzh = ((Result) obj).getValue();
        } else {
            zze zzeVar = this.zzb;
            zzsq zzsqVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzsqVar, this);
            if (objZzh == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Result.m28549boximpl(objZzh);
    }
}
