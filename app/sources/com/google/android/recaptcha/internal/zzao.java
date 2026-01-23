package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzao extends ContinuationImpl7 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzap zzc;
    final /* synthetic */ zzep zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzap zzapVar, zzep zzepVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzapVar;
        this.zzd = zzepVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzao(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        Ref.ObjectRef objectRef;
        Exception e;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            objectRef = (Ref.ObjectRef) this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                CompletableDeferred completableDeferredZzf = this.zzc.zzf();
                th = (Throwable) objectRef.element;
                if (th == null) {
                    th = e;
                }
                completableDeferredZzf.completeExceptionally(th);
                this.zzc.zze = zzaq.zza;
                this.zzd.zzb(new zzbf(zzbd.zzb, zzbc.zza, e.getMessage()));
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                zzan zzanVar = new zzan(this.zzc, this.zzd, objectRef2, null);
                this.zza = objectRef2;
                this.zzb = 1;
                if (Timeout6.withTimeout(60000L, zzanVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e3) {
                objectRef = objectRef2;
                e = e3;
                CompletableDeferred completableDeferredZzf2 = this.zzc.zzf();
                th = (Throwable) objectRef.element;
                if (th == null) {
                }
                completableDeferredZzf2.completeExceptionally(th);
                this.zzc.zze = zzaq.zza;
                this.zzd.zzb(new zzbf(zzbd.zzb, zzbc.zza, e.getMessage()));
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
