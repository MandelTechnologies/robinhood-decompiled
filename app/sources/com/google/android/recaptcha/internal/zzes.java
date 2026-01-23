package com.google.android.recaptcha.internal;

import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzes extends ContinuationImpl7 implements Function2 {
    final /* synthetic */ zzeu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzes(zzeu zzeuVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzeuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzes(this.zza, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzeu zzeuVar = this.zza;
        synchronized (zzeq.class) {
            try {
                zzek zzekVar = zzeuVar.zze;
                if (zzekVar != null && zzekVar.zzb() == 0) {
                    Timer timer = zzeu.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzeu.zza = null;
                }
                zzeuVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }
}
