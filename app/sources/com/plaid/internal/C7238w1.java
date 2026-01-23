package com.plaid.internal;

import com.plaid.internal.C5953R5;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$storeLinkState$2", m3645f = "HybridLinkStateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.w1 */
/* loaded from: classes16.dex */
public final class C7238w1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC5894L2 f3274a;

    /* renamed from: b */
    public final /* synthetic */ C7248x1 f3275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7238w1(AbstractC5894L2 abstractC5894L2, C7248x1 c7248x1, Continuation<? super C7238w1> continuation) {
        super(2, continuation);
        this.f3274a = abstractC5894L2;
        this.f3275b = c7248x1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7238w1(this.f3274a, this.f3275b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7238w1(this.f3274a, this.f3275b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C5953R5.a.m1299a(C5953R5.f1671a, "Store LinkState: " + this.f3274a);
        this.f3275b.f3296d = this.f3274a;
        C7248x1.m1651b(this.f3275b, this.f3274a);
        return Unit.INSTANCE;
    }
}
