package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer$callWorkflowStart$networkResponse$1", m3645f = "LinkStateReducer.kt", m3646l = {114}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.O2 */
/* loaded from: classes16.dex */
public final class C5924O2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AbstractC6043b4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>>, Object> {

    /* renamed from: a */
    public int f1582a;

    /* renamed from: b */
    public final /* synthetic */ C5995W2 f1583b;

    /* renamed from: c */
    public final /* synthetic */ Workflow$LinkWorkflowStartRequest f1584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5924O2(C5995W2 c5995w2, Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, Continuation<? super C5924O2> continuation) {
        super(2, continuation);
        this.f1583b = c5995w2;
        this.f1584c = workflow$LinkWorkflowStartRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5924O2(this.f1583b, this.f1584c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC6043b4<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>> continuation) {
        return new C5924O2(this.f1583b, this.f1584c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1582a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC5929O7 interfaceC5929O7 = this.f1583b.f1794a;
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = this.f1584c;
        this.f1582a = 1;
        Object objM1286a = interfaceC5929O7.m1286a(workflow$LinkWorkflowStartRequest, this);
        return objM1286a == coroutine_suspended ? coroutine_suspended : objM1286a;
    }
}
