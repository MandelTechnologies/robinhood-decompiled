package com.google.android.recaptcha.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfl {
    private final Lazy zza;

    public zzfl() {
        int i = zzax.zza;
        this.zza = LazyKt.lazy(zzfk.zza);
    }

    public static final /* synthetic */ zzez zza(zzfl zzflVar) {
        return (zzez) zzflVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object zzc(zzfl zzflVar, zzbt zzbtVar, zzti zztiVar, Continuation continuation) {
        zzfi zzfiVar;
        if (continuation instanceof zzfi) {
            zzfiVar = (zzfi) continuation;
            int i = zzfiVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzfiVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzfiVar = new zzfi(zzflVar, continuation);
            }
        }
        Object obj = zzfiVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzfiVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        zzfj zzfjVar = new zzfj(zzflVar, zzbtVar, zztiVar, null);
        zzfiVar.zzc = 1;
        Object objCoroutineScope = CoroutineScope2.coroutineScope(zzfjVar, zzfiVar);
        return objCoroutineScope == coroutine_suspended ? coroutine_suspended : objCoroutineScope;
    }

    public final Object zzb(zzbt zzbtVar, zzti zztiVar, Continuation continuation) {
        return zzc(this, zzbtVar, zztiVar, continuation);
    }
}
