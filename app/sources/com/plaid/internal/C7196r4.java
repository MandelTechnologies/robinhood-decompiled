package com.plaid.internal;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.plaid.internal.r4 */
/* loaded from: classes16.dex */
public final class C7196r4 extends AbstractC5846G {

    /* renamed from: a */
    public String f3159a;

    /* renamed from: b */
    public final /* synthetic */ C7205s4 f3160b;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onNoResultFromChannel$1", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {93, 95}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.r4$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public C7205s4 f3161a;

        /* renamed from: b */
        public LinkResult f3162b;

        /* renamed from: c */
        public int f3163c;

        /* renamed from: d */
        public final /* synthetic */ C7205s4 f3164d;

        /* renamed from: e */
        public final /* synthetic */ C7196r4 f3165e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7205s4 c7205s4, C7196r4 c7196r4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3164d = c7205s4;
            this.f3165e = c7196r4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f3164d, this.f3165e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new a(this.f3164d, this.f3165e, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C7205s4 c7205s4;
            LinkResult linkResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3163c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7205s4 c7205s42 = this.f3164d;
                this.f3163c = 1;
                obj = C7205s4.m1606b(c7205s42, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkResult = this.f3162b;
                c7205s4 = this.f3161a;
                ResultKt.throwOnFailure(obj);
                C7205s4.m1605a(c7205s4, linkResult);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LinkResult linkResult2 = (LinkResult) obj;
            if (linkResult2 == null) {
                C5953R5.a.m1299a(C5953R5.f1671a, "Link Exit -- no LinkResult from polling and no preCompletionResult.");
                C7205s4.m1605a(this.f3164d, new LinkExit(null, new LinkExitMetadata(null, null, this.f3165e.m1599b(), null, null, 27, null)));
                return Unit.INSTANCE;
            }
            c7205s4 = this.f3164d;
            C5953R5.a.m1299a(C5953R5.f1671a, "The preCompletionResult is: " + linkResult2);
            C7172o7 c7172o7M1610b = c7205s4.m1610b();
            this.f3161a = c7205s4;
            this.f3162b = linkResult2;
            this.f3163c = 2;
            if (c7172o7M1610b.m1570b(this) != coroutine_suspended) {
                linkResult = linkResult2;
                C7205s4.m1605a(c7205s4, linkResult);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$linkResultCallback$1$onPreCompletionResult$1", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.r4$b */
    public static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3166a;

        /* renamed from: b */
        public final /* synthetic */ C7205s4 f3167b;

        /* renamed from: c */
        public final /* synthetic */ Channel$Message.SDKResult f3168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7205s4 c7205s4, Channel$Message.SDKResult sDKResult, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f3167b = c7205s4;
            this.f3168c = sDKResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f3167b, this.f3168c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new b(this.f3167b, this.f3168c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3166a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7205s4 c7205s4 = this.f3167b;
                Channel$Message.SDKResult sDKResult = this.f3168c;
                this.f3166a = 1;
                InterfaceC7080f8 interfaceC7080f8 = c7205s4.f3191f;
                if (interfaceC7080f8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("writePreCompletionResult");
                    interfaceC7080f8 = null;
                }
                Object objMo1317a = interfaceC7080f8.mo1317a(sDKResult, this);
                if (objMo1317a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objMo1317a = Unit.INSTANCE;
                }
                if (objMo1317a == coroutine_suspended) {
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

    public C7196r4(C7205s4 c7205s4) {
        this.f3160b = c7205s4;
    }

    @Override // com.plaid.internal.AbstractC5846G
    /* renamed from: a */
    public final void mo1197a(Channel$Message.SDKResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C5953R5.a.m1299a(C5953R5.f1671a, "Pre Completion Result: " + result);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this.f3160b), null, null, new b(this.f3160b, result, null), 3, null);
    }

    /* renamed from: b */
    public final String m1599b() {
        return this.f3159a;
    }

    @Override // com.plaid.internal.AbstractC5846G
    /* renamed from: a */
    public final void mo1199a(LinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C5953R5.a.m1299a(C5953R5.f1671a, "Link Result from polling: " + result);
        C7205s4.m1605a(this.f3160b, result);
    }

    @Override // com.plaid.internal.AbstractC5846G
    /* renamed from: a */
    public final void mo1198a(LinkEvent event, AbstractC5849G2.d options) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(options, "options");
        C5953R5.a.m1299a(C5953R5.f1671a, "Link Event from polling: " + event);
        if (this.f3159a == null) {
            this.f3159a = event.getMetadata().getLinkSessionId();
        }
        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(event, options);
        }
    }

    @Override // com.plaid.internal.AbstractC5846G
    /* renamed from: a */
    public final void mo1195a() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this.f3160b), null, null, new a(this.f3160b, this, null), 3, null);
    }
}
