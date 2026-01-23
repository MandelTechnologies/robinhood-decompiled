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
final class zzfj extends ContinuationImpl7 implements Function2 {
    final /* synthetic */ zzfl zza;
    final /* synthetic */ zzbt zzb;
    final /* synthetic */ zzti zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfj(zzfl zzflVar, zzbt zzbtVar, zzti zztiVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzflVar;
        this.zzb = zzbtVar;
        this.zzc = zztiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfj(this.zza, this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzey zzeyVarZza = null;
        try {
            try {
                zzeyVarZza = zzfl.zza(this.zza).zza(this.zzb.zzd());
                zzeyVarZza.zzc();
                zzeyVarZza.zze(this.zzc.zzd());
                zztl zztlVar = (zztl) zzeyVarZza.zza(zztl.zzi());
                zzeyVarZza.zzd();
                return zztlVar;
            } catch (zzbf e) {
                throw e;
            } catch (Exception e2) {
                throw new zzbf(zzbd.zzc, zzbc.zzF, e2.getMessage());
            }
        } catch (Throwable th) {
            if (zzeyVarZza != null) {
                zzeyVarZza.zzd();
            }
            throw th;
        }
    }
}
