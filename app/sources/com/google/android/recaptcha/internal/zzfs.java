package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzfs extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzgf zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzfv zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfs(zzgf zzgfVar, List list, zzfv zzfvVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgfVar;
        this.zzc = list;
        this.zzd = zzfvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        zzfs zzfsVar = new zzfs(this.zzb, this.zzc, this.zzd, continuation);
        zzfsVar.zze = obj;
        return zzfsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            CoroutineScope coroutineScope = (CoroutineScope) this.zze;
            while (true) {
                zzgf zzgfVar = this.zzb;
                if (zzgfVar.zza() < 0) {
                    break;
                }
                if (zzgfVar.zza() >= this.zzc.size() || !CoroutineScope2.isActive(coroutineScope)) {
                    break;
                }
                zzvm zzvmVar = (zzvm) this.zzc.get(this.zzb.zza());
                try {
                    zzfv.zzf(this.zzd, zzvmVar, this.zzb);
                } catch (Exception e) {
                    zzvmVar.zzk();
                    boxing.boxInt(zzvmVar.zzg());
                    CollectionsKt.joinToString$default(zzvmVar.zzj(), null, null, null, 0, null, new zzfr(this.zzd), 31, null);
                    zzfv zzfvVar = this.zzd;
                    zzgf zzgfVar2 = this.zzb;
                    this.zza = 1;
                    if (zzfvVar.zzh(e, zzgfVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
