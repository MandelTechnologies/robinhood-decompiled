package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$storeCrashes$2", m3645f = "CrashStorage.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.f0 */
/* loaded from: classes16.dex */
public final class C7072f0 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f2761a;

    /* renamed from: b */
    public final /* synthetic */ C7082g0 f2762b;

    /* renamed from: c */
    public final /* synthetic */ Crash[] f2763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7072f0(C7082g0 c7082g0, Crash[] crashArr, Continuation<? super C7072f0> continuation) {
        super(2, continuation);
        this.f2762b = c7082g0;
        this.f2763c = crashArr;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7072f0(this.f2762b, this.f2763c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7072f0(this.f2762b, this.f2763c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2761a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C6044b5 c6044b5 = this.f2762b.f2786a;
            String strM1510a = C7082g0.m1510a();
            String json = this.f2762b.f2788c.toJson(ArraysKt.asList(this.f2763c));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            this.f2761a = 1;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C6034a5(c6044b5, strM1510a, json, null), this);
            if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objWithContext = Unit.INSTANCE;
            }
            if (objWithContext == coroutine_suspended) {
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
