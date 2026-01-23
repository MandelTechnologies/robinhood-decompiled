package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzdh extends ContinuationImpl7 implements Function2 {
    int zza;
    final /* synthetic */ zzdv zzb;
    final /* synthetic */ zzti zzc;
    final /* synthetic */ zzep zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(zzdv zzdvVar, zzti zztiVar, zzep zzepVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzdvVar;
        this.zzc = zztiVar;
        this.zzd = zzepVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdh(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzdv zzdvVar = this.zzb;
            zzti zztiVar = this.zzc;
            zzfl zzflVarZzh = zzdv.zzh(zzdvVar);
            zzbt zzbtVarZzd = zzdv.zzd(zzdvVar);
            this.zza = 1;
            obj = zzflVarZzh.zzb(zzbtVarZzd, zztiVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        zztl zztlVar = (zztl) obj;
        this.zzd.zza();
        return zztlVar;
    }
}
