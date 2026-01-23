package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzi extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(zzl zzlVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzc = this.zzb.zzc(0L, null, null, this);
        return objZzc == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZzc : Result.m28549boximpl(objZzc);
    }
}
