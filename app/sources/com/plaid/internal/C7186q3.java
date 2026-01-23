package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
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

@DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1", m3645f = "LinkWorkflowAnalytics.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.q3 */
/* loaded from: classes16.dex */
public final class C7186q3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3131a;

    /* renamed from: b */
    public final /* synthetic */ C7195r3 f3132b;

    /* renamed from: c */
    public final /* synthetic */ ClientEventOuterClass$ClientEvent.C6176a f3133c;

    /* renamed from: d */
    public final /* synthetic */ String f3134d;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1$1", m3645f = "LinkWorkflowAnalytics.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.q3$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3135a;

        /* renamed from: b */
        public final /* synthetic */ C7195r3 f3136b;

        /* renamed from: c */
        public final /* synthetic */ ClientEventOuterClass$ClientEvent.C6176a f3137c;

        /* renamed from: d */
        public final /* synthetic */ String f3138d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7195r3 c7195r3, ClientEventOuterClass$ClientEvent.C6176a c6176a, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3136b = c7195r3;
            this.f3137c = c6176a;
            this.f3138d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f3136b, this.f3137c, this.f3138d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (com.plaid.internal.C7195r3.m1591a(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3135a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC7222u3 interfaceC7222u3 = this.f3136b.f3156b;
                ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = this.f3137c.m1407a(this.f3138d).build();
                Intrinsics.checkNotNullExpressionValue(clientEventOuterClass$ClientEventBuild, "build(...)");
                this.f3135a = 1;
                if (interfaceC7222u3.mo1616a(clientEventOuterClass$ClientEventBuild, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C5953R5.f1671a.getClass();
                C5953R5.a.m1303a("events send", true);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C7195r3 c7195r3 = this.f3136b;
            this.f3135a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7186q3(C7195r3 c7195r3, ClientEventOuterClass$ClientEvent.C6176a c6176a, String str, Continuation<? super C7186q3> continuation) {
        super(2, continuation);
        this.f3132b = c7195r3;
        this.f3133c = c6176a;
        this.f3134d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7186q3(this.f3132b, this.f3133c, this.f3134d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C7186q3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3131a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C7195r3 c7195r3 = this.f3132b;
            CoroutineDispatcher coroutineDispatcher = c7195r3.f3157c;
            a aVar = new a(c7195r3, this.f3133c, this.f3134d, null);
            this.f3131a = 1;
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
