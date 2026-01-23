package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.PlaidCrashHandler$handleCrash$1", m3645f = "PlaidCrashHandler.kt", m3646l = {41}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.R4 */
/* loaded from: classes16.dex */
public final class C5952R4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1668a;

    /* renamed from: b */
    public final /* synthetic */ C5961S4 f1669b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f1670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5952R4(C5961S4 c5961s4, Throwable th, Continuation<? super C5952R4> continuation) {
        super(2, continuation);
        this.f1669b = c5961s4;
        this.f1670c = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5952R4(this.f1669b, this.f1670c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5952R4(this.f1669b, this.f1670c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1668a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C5961S4 c5961s4 = this.f1669b;
            C7112j0 c7112j0 = c5961s4.f1686b;
            Crash crashM1364a = c5961s4.f1685a.m1364a(this.f1670c);
            this.f1668a = 1;
            if (c7112j0.m1534a(crashM1364a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
