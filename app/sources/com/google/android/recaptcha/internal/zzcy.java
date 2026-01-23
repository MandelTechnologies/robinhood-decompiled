package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzcy extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzde zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzde zzdeVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzdeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo9243execute0E7RQCE = this.zzb.mo9243execute0E7RQCE(null, 0L, this);
        return objMo9243execute0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo9243execute0E7RQCE : Result.m28549boximpl(objMo9243execute0E7RQCE);
    }
}
