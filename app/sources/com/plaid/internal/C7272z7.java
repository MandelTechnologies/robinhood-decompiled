package com.plaid.internal;

import androidx.lifecycle.ViewModel2;
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
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.z7 */
/* loaded from: classes16.dex */
public final class C7272z7 extends AbstractC5846G {

    /* renamed from: a */
    public final /* synthetic */ C5800A7 f3343a;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$linkResultCallback$1$onRequestSilentNetworkAuth$1", m3645f = "WebviewViewModel.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.z7$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3344a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC5919N6 f3345b;

        /* renamed from: c */
        public final /* synthetic */ C5800A7 f3346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC5919N6 abstractC5919N6, C5800A7 c5800a7, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3345b = abstractC5919N6;
            this.f3346c = c5800a7;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f3345b, this.f3346c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new a(this.f3345b, this.f3346c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3344a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC5919N6 abstractC5919N6 = this.f3345b;
                C6026Z6 c6026z6 = null;
                C7088g6 c7088g6 = null;
                if (abstractC5919N6 instanceof C7108i6) {
                    C7088g6 c7088g62 = this.f3346c.f1250o;
                    if (c7088g62 != null) {
                        c7088g6 = c7088g62;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("proveAuthController");
                    }
                    c7088g6.m1512a((C7108i6) this.f3345b);
                } else if (abstractC5919N6 instanceof C6036a7) {
                    C6026Z6 c6026z62 = this.f3346c.f1246k;
                    if (c6026z62 != null) {
                        c6026z6 = c6026z62;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("twilioAuthController");
                    }
                    C6036a7 c6036a7 = (C6036a7) this.f3345b;
                    this.f3344a = 1;
                    if (c6026z6.m1360a(c6036a7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public C7272z7(C5800A7 c5800a7) {
        this.f3343a = c5800a7;
    }

    @Override // com.plaid.internal.AbstractC5846G
    /* renamed from: a */
    public final void mo1196a(AbstractC5919N6 requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this.f3343a), Dispatchers.getIO(), null, new a(requestInfo, this.f3343a, null), 2, null);
    }
}
