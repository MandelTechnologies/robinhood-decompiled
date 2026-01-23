package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzed extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzee zzb;
    final /* synthetic */ CompletableDeferred zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzed(zzee zzeeVar, CompletableDeferred completableDeferred, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzeeVar;
        this.zzc = completableDeferred;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzed(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzed) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbf zzbfVar;
        zzed zzedVar;
        zzbf e;
        zzbs zzbsVar;
        zzeb zzebVar;
        zzec zzecVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            try {
                ResultKt.throwOnFailure(obj);
                zzedVar = this;
            } catch (zzbf e2) {
                zzbfVar = e2;
                zzedVar = this;
                zzedVar.zzb.zzf = zzco.zzd;
                zzedVar.zzc.completeExceptionally(zzbfVar);
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                zzbsVar = zzbs.zza;
                zzebVar = new zzeb(this.zzb);
                zzecVar = new zzec(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzedVar = this;
            } catch (zzbf e3) {
                e = e3;
                zzedVar = this;
                zzbfVar = e;
                zzedVar.zzb.zzf = zzco.zzd;
                zzedVar.zzc.completeExceptionally(zzbfVar);
                return Unit.INSTANCE;
            }
            try {
                obj = zzbsVar.zza(zzebVar, 100L, 1000L, 2.0d, zzecVar, zzedVar);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (zzbf e4) {
                e = e4;
                zzbfVar = e;
                zzedVar.zzb.zzf = zzco.zzd;
                zzedVar.zzc.completeExceptionally(zzbfVar);
                return Unit.INSTANCE;
            }
        }
        ((Boolean) obj).getClass();
        return Unit.INSTANCE;
    }
}
