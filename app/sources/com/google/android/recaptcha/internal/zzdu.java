package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzdu extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzdv zzb;
    final /* synthetic */ zzep zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdu(zzdv zzdvVar, zzep zzepVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzdvVar;
        this.zzc = zzepVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdu(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdu) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzdv zzdvVar = this.zzb;
            this.zza = 1;
            obj = BuildersKt.withContext(zzdvVar.zzi.zza().getCoroutineContext(), new zzdj(zzdvVar, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        zzsq zzsqVar = (zzsq) obj;
        this.zzc.zza();
        return zzsqVar;
    }
}
