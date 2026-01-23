package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.sna.TwilioAuthController$asyncAuthentication$result$1", m3645f = "TwilioAuthController.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.Y6 */
/* loaded from: classes16.dex */
public final class C6017Y6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super InterfaceC7078f6>, Object> {

    /* renamed from: a */
    public int f1854a;

    /* renamed from: b */
    public final /* synthetic */ C6026Z6 f1855b;

    /* renamed from: c */
    public final /* synthetic */ C6036a7 f1856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6017Y6(C6026Z6 c6026z6, C6036a7 c6036a7, Continuation<? super C6017Y6> continuation) {
        super(2, continuation);
        this.f1855b = c6026z6;
        this.f1856c = c6036a7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6017Y6(this.f1855b, this.f1856c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC7078f6> continuation) {
        return new C6017Y6(this.f1855b, this.f1856c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1854a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC6046b7 interfaceC6046b7 = this.f1855b.f1877a;
        String str = this.f1856c.f1908b;
        this.f1854a = 1;
        Object objMo1250a = interfaceC6046b7.mo1250a(str, this);
        return objMo1250a == coroutine_suspended ? coroutine_suspended : objMo1250a;
    }
}
