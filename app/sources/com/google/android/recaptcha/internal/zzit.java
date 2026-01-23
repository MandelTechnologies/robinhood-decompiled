package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzit extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzjc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzit(zzjc zzjcVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzjcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZzh : Result.m28549boximpl(objZzh);
    }
}
