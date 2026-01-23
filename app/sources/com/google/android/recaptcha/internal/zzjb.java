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
final class zzjb extends ContinuationImpl7 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzjc zzc;
    final /* synthetic */ zzep zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjb(zzjc zzjcVar, zzep zzepVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjcVar;
        this.zzd = zzepVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzjb(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (kotlinx.coroutines.Timeout6.withTimeout(com.robinhood.websocket.gateway.WebsocketGatewayConstants.CLIENT_IDLE_TIMEOUT_MS, r6, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        zzbf zzbfVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        try {
        } catch (Exception e) {
            e.getMessage();
            zzbf zzbfVarZza = zzf.zza(e, new zzbf(zzbd.zzb, zzbc.zzV, e.getMessage()));
            zzcd zzcdVarZzm = this.zzc.zzm();
            zzjg zzjgVar = zzjg.zza;
            this.zza = zzbfVarZza;
            this.zzb = 3;
            if (zzcdVarZzm.zzc(zzjgVar, this) != coroutine_suspended) {
                zzbfVar = zzbfVarZza;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzjc zzjcVar = this.zzc;
            this.zzb = 1;
            if (zzjcVar.zzx(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            zzbfVar = (zzbf) this.zza;
            ResultKt.throwOnFailure(obj);
            this.zzd.zzb(zzbfVar);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        zzja zzjaVar = new zzja(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
