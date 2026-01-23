package com.google.android.recaptcha.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzr extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzaa zzaaVar, String str, zzx zzxVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzaaVar;
        this.zzc = str;
        this.zzd = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzr(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzaa zzaaVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzaaVar.zzc(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        zzac zzacVar = (zzac) obj;
        zztq zztqVarZzf = zzts.zzf();
        zztqVarZzf.zzp(3);
        if (zzacVar instanceof zzz) {
            zztqVarZzf.zze(zzx.zzp(this.zzd, ((zzz) zzacVar).zza()));
            return zztqVarZzf;
        }
        if (!(zzacVar instanceof zzy)) {
            throw new NoWhenBranchMatchedException();
        }
        zztqVarZzf.zzd(zzx.zzo(this.zzd, ((zzy) zzacVar).zza()));
        return zztqVarZzf;
    }
}
