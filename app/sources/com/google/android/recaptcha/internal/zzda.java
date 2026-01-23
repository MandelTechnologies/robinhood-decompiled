package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzda extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzde zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzda(zzde zzdeVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzdeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, 0L, this);
        return objZzf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZzf : Result.m28549boximpl(objZzf);
    }
}
