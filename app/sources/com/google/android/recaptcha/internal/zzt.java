package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzt extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzaa zzd;
    final /* synthetic */ zztu zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzx zzxVar, String str, zzaa zzaaVar, zztu zztuVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzxVar;
        this.zzc = str;
        this.zzd = zzaaVar;
        this.zze = zztuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzt(this.zzb, this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzt) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzx zzxVar = this.zzb;
            String str = this.zzc;
            zzaa zzaaVar = this.zzd;
            this.zza = 1;
            obj = zzxVar.zzu(str, zzaaVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.zze.zzd((zztq) obj);
        return Unit.INSTANCE;
    }
}
