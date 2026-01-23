package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$trackWebviewFallbackOpen$1", m3645f = "WebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.C7 */
/* loaded from: classes16.dex */
public final class C5818C7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1309a;

    /* renamed from: b */
    public final /* synthetic */ C5800A7 f1310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5818C7(C5800A7 c5800a7, Continuation<? super C5818C7> continuation) {
        super(2, continuation);
        this.f1310b = c5800a7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5818C7(this.f1310b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5818C7(this.f1310b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1309a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C7172o7 c7172o7 = this.f1310b.f1242g;
            if (c7172o7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webviewFallbackAnalytics");
                c7172o7 = null;
            }
            this.f1309a = 1;
            if (c7172o7.m1571c(this) == coroutine_suspended) {
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
