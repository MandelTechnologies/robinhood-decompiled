package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzja extends ContinuationImpl7 implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzjc zzf;
    final /* synthetic */ zzep zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzja(zzjc zzjcVar, zzep zzepVar, Continuation continuation) {
        super(2, continuation);
        this.zzf = zzjcVar;
        this.zzg = zzepVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzja(this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzja) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzjc zzjcVar;
        zzsq zzsqVar;
        zzci zzciVar;
        zzjc zzjcVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zze;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzjcVar = this.zzf;
            zzsq zzsqVar2 = zzjcVar.zzf;
            if (zzsqVar2 == null) {
                zzsqVar2 = null;
            }
            zzsq zzsqVar3 = this.zzf.zzf;
            if (zzsqVar3 == null) {
                zzsqVar3 = null;
            }
            zzci zzciVar2 = new zzci(zzsqVar3.zzf());
            zzjc zzjcVar3 = this.zzf;
            this.zza = zzjcVar;
            this.zzb = zzjcVar;
            this.zzc = zzsqVar2;
            this.zzd = zzciVar2;
            this.zze = 1;
            Object objZzw = zzjcVar3.zzw(this);
            if (objZzw != coroutine_suspended) {
                zzsqVar = zzsqVar2;
                obj = objZzw;
                zzciVar = zzciVar2;
                zzjcVar2 = zzjcVar;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            ResultKt.throwOnFailure(obj);
            if (i != 2) {
                if (i == 3) {
                }
                this.zzg.zza();
                return Unit.INSTANCE;
            }
            boxing.boxInt(this.zzf.zzA().hashCode());
            CompletableDeferred completableDeferredZzA = this.zzf.zzA();
            this.zze = 3;
            if (completableDeferredZzA.await(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            zzcd zzcdVarZzm = this.zzf.zzm();
            zzjg zzjgVar = zzjg.zzc;
            this.zze = 4;
        } else {
            zzciVar = (zzci) this.zzd;
            zzsqVar = (zzsq) this.zzc;
            zzjcVar = (zzjc) this.zzb;
            zzjcVar2 = (zzjc) this.zza;
            ResultKt.throwOnFailure(obj);
        }
        zzjcVar2.zzb = zzjcVar.zzC(zzsqVar, zzciVar, (WebView) obj);
        boxing.boxInt(this.zzf.zzA().hashCode());
        this.zzf.zzh.zzd();
        this.zzf.zzh.zze();
        zzjc zzjcVar4 = this.zzf;
        zzsq zzsqVar4 = zzjcVar4.zzf;
        if (zzsqVar4 == null) {
            zzsqVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        if (zzjcVar4.zzE(zzsqVar4, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
