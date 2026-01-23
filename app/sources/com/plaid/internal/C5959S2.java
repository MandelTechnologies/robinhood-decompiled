package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1", m3645f = "LinkStateReducer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.S2 */
/* loaded from: classes16.dex */
public final class C5959S2 extends ContinuationImpl7 implements Function1<Continuation<? super AbstractC6043b4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

    /* renamed from: a */
    public int f1679a;

    /* renamed from: b */
    public final /* synthetic */ C5995W2 f1680b;

    /* renamed from: c */
    public final /* synthetic */ Workflow$LinkWorkflowNextRequest f1681c;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1$1", m3645f = "LinkStateReducer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.S2$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AbstractC6043b4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

        /* renamed from: a */
        public int f1682a;

        /* renamed from: b */
        public final /* synthetic */ C5995W2 f1683b;

        /* renamed from: c */
        public final /* synthetic */ Workflow$LinkWorkflowNextRequest f1684c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5995W2 c5995w2, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1683b = c5995w2;
            this.f1684c = workflow$LinkWorkflowNextRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f1683b, this.f1684c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC6043b4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation) {
            return new a(this.f1683b, this.f1684c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1682a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC5929O7 interfaceC5929O7 = this.f1683b.f1794a;
            Workflow$LinkWorkflowNextRequest nextRequest = this.f1684c;
            Intrinsics.checkNotNullExpressionValue(nextRequest, "$nextRequest");
            this.f1682a = 1;
            Object objM1284a = interfaceC5929O7.m1284a(nextRequest, this);
            return objM1284a == coroutine_suspended ? coroutine_suspended : objM1284a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5959S2(C5995W2 c5995w2, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, Continuation<? super C5959S2> continuation) {
        super(1, continuation);
        this.f1680b = c5995w2;
        this.f1681c = workflow$LinkWorkflowNextRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C5959S2(this.f1680b, this.f1681c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super AbstractC6043b4<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> continuation) {
        return new C5959S2(this.f1680b, this.f1681c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1679a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineDispatcher io2 = Dispatchers.getIO();
        a aVar = new a(this.f1680b, this.f1681c, null);
        this.f1679a = 1;
        Object objWithContext = BuildersKt.withContext(io2, aVar, this);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }
}
