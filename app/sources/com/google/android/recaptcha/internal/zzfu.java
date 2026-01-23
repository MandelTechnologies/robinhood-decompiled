package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzfu extends ContinuationImpl7 implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgf zzd;
    final /* synthetic */ zzfv zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfu(zzgf zzgfVar, zzfv zzfvVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzgfVar;
        this.zze = zzfvVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfu(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfu) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzvg zzvgVar;
        zzjj zzjjVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
        } catch (Exception e) {
            zzfv zzfvVar = this.zze;
            zzgf zzgfVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.zzd.zza = new zzbp();
            zzvg zzvgVarZzi = zzvg.zzi(zzkj.zzh().zzj(this.zzf));
            zzvgVarZzi.zzf();
            zzvd zzvdVarZza = this.zze.zzc.zza(zzvgVarZzi);
            zzjj zzjjVarZzb = zzjj.zzb();
            zzfv zzfvVar2 = this.zze;
            List listZzi = zzvdVarZza.zzi();
            zzgf zzgfVar2 = this.zzd;
            this.zza = zzvgVarZzi;
            this.zzb = zzjjVarZzb;
            this.zzc = 1;
            if (zzfvVar2.zzg(listZzi, zzgfVar2, this) != coroutine_suspended) {
                zzvgVar = zzvgVarZzi;
                zzjjVar = zzjjVarZzb;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        zzjjVar = (zzjj) this.zzb;
        zzvgVar = (zzvg) this.zza;
        ResultKt.throwOnFailure(obj);
        zzjjVar.zzf();
        boxing.boxLong(zzjjVar.zza(TimeUnit.MICROSECONDS));
        zzvgVar.zzf();
        return Unit.INSTANCE;
    }
}
