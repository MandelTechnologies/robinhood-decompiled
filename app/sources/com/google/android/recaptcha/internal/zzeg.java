package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzeg extends ContinuationImpl {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzeh zzc;
    int zzd;
    zzeh zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeg(zzeh zzehVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzehVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(0L, this);
    }
}
