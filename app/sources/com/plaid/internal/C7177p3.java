package com.plaid.internal;

import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1", m3645f = "LinkWorkflowAnalytics.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.p3 */
/* loaded from: classes16.dex */
public final class C7177p3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3101a;

    /* renamed from: b */
    public final /* synthetic */ C7195r3 f3102b;

    /* renamed from: c */
    public final /* synthetic */ String f3103c;

    /* renamed from: d */
    public final /* synthetic */ ClientEventOuterClass$ClientEvent f3104d;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvent$1$1", m3645f = "LinkWorkflowAnalytics.kt", m3646l = {150}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.p3$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Workflow$LinkWorkflowEventRequest f3105a;

        /* renamed from: b */
        public int f3106b;

        /* renamed from: c */
        public final /* synthetic */ C7195r3 f3107c;

        /* renamed from: d */
        public final /* synthetic */ String f3108d;

        /* renamed from: e */
        public final /* synthetic */ ClientEventOuterClass$ClientEvent f3109e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7195r3 c7195r3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3107c = c7195r3;
            this.f3108d = str;
            this.f3109e = clientEventOuterClass$ClientEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f3107c, this.f3108d, this.f3109e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3106b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Workflow$LinkWorkflowEventRequest.C6196a c6196aNewBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
                String str = this.f3108d;
                ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = this.f3109e;
                c6196aNewBuilder.m1413a(str);
                c6196aNewBuilder.m1411a(clientEventOuterClass$ClientEvent).build();
                Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequestBuild = c6196aNewBuilder.build();
                InterfaceC5929O7 interfaceC5929O7 = this.f3107c.f3155a;
                Intrinsics.checkNotNull(workflow$LinkWorkflowEventRequestBuild);
                this.f3105a = workflow$LinkWorkflowEventRequestBuild;
                this.f3106b = 1;
                Object objM1283a = interfaceC5929O7.m1283a(workflow$LinkWorkflowEventRequestBuild, this);
                if (objM1283a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                workflow$LinkWorkflowEventRequest = workflow$LinkWorkflowEventRequestBuild;
                obj = objM1283a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workflow$LinkWorkflowEventRequest = this.f3105a;
                ResultKt.throwOnFailure(obj);
            }
            if (((AbstractC6043b4) obj) instanceof AbstractC6043b4.c) {
                C5953R5.a.m1299a(C5953R5.f1671a, "Event sent: " + workflow$LinkWorkflowEventRequest);
            } else {
                C5953R5.a.m1304b(C5953R5.f1671a, "Error sending event " + workflow$LinkWorkflowEventRequest);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7177p3(C7195r3 c7195r3, String str, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, Continuation<? super C7177p3> continuation) {
        super(2, continuation);
        this.f3102b = c7195r3;
        this.f3103c = str;
        this.f3104d = clientEventOuterClass$ClientEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7177p3(this.f3102b, this.f3103c, this.f3104d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C7177p3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3101a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C7195r3 c7195r3 = this.f3102b;
            CoroutineDispatcher coroutineDispatcher = c7195r3.f3157c;
            a aVar = new a(c7195r3, this.f3103c, this.f3104d, null);
            this.f3101a = 1;
            if (BuildersKt.withContext(coroutineDispatcher, aVar, this) == coroutine_suspended) {
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
