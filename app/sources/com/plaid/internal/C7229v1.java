package com.plaid.internal;

import com.plaid.internal.C5953R5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$getCurrentLinkState$2", m3645f = "HybridLinkStateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.v1 */
/* loaded from: classes16.dex */
public final class C7229v1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AbstractC5894L2>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C7248x1 f3239a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7229v1(C7248x1 c7248x1, Continuation<? super C7229v1> continuation) {
        super(2, continuation);
        this.f3239a = c7248x1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7229v1(this.f3239a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5894L2> continuation) {
        return new C7229v1(this.f3239a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f3239a.f3296d == null) {
            C5953R5.a.m1299a(C5953R5.f1671a, "Initializing statestore");
            C7248x1 c7248x1 = this.f3239a;
            c7248x1.f3296d = C7248x1.m1650b(c7248x1);
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Get current LinkState: " + this.f3239a.f3296d);
        AbstractC5894L2 abstractC5894L2 = this.f3239a.f3296d;
        Intrinsics.checkNotNull(abstractC5894L2);
        return abstractC5894L2;
    }
}
