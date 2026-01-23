package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzdd extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzde zzb;
    int zzc;
    zzep zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdd(zzde zzdeVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzdeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzg(null, null, this);
    }
}
