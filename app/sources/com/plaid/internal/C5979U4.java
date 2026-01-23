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

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$sendTestCrash$1", m3645f = "PlaidCrashReporter.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.U4 */
/* loaded from: classes16.dex */
public final class C5979U4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1748a;

    /* renamed from: b */
    public final /* synthetic */ C5988V4 f1749b;

    /* renamed from: c */
    public final /* synthetic */ RuntimeException f1750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5979U4(C5988V4 c5988v4, RuntimeException runtimeException, Continuation<? super C5979U4> continuation) {
        super(2, continuation);
        this.f1749b = c5988v4;
        this.f1750c = runtimeException;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5979U4(this.f1749b, this.f1750c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5979U4(this.f1749b, this.f1750c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1748a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C5988V4 c5988v4 = this.f1749b;
            C7112j0 c7112j0 = c5988v4.f1769c;
            Crash crashM1364a = c5988v4.f1768b.m1364a(this.f1750c);
            this.f1748a = 1;
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
