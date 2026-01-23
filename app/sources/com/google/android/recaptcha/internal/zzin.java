package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzin extends ContinuationImpl7 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzjc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzin(zzjc zzjcVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzin(this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[PHI: r7
      0x0057: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0055, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zzjc zzjcVar = this.zzc;
            this.zzb = 1;
            obj = zzjcVar.zzw(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                ResultKt.throwOnFailure(obj);
                if (i == 3) {
                    ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                    zzjc zzjcVar2 = this.zzc;
                    this.zzb = 4;
                    obj = zzjcVar2.zzw(this);
                }
                ((WebView) obj).setWebViewClient(new zzim(this.zzc));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzjc zzjcVar3 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjcVar3.zzw(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(obj);
        ((WebView) obj).removeJavascriptInterface("RN");
        zzjc zzjcVar4 = this.zzc;
        this.zza = zzjcVar4;
        this.zzb = 2;
        obj = zzjcVar4.zzw(this);
        if (obj != coroutine_suspended) {
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzjc zzjcVar32 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjcVar32.zzw(this);
            if (obj != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
