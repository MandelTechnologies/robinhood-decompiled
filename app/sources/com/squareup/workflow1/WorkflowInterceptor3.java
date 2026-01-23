package com.squareup.workflow1;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "P", "S", "O"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1", m3645f = "WorkflowInterceptor.kt", m3646l = {EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.workflow1.InterceptedRenderContext$runningSideEffect$withScopeReceiver$1, reason: use source file name */
/* loaded from: classes12.dex */
final class WorkflowInterceptor3 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $sideEffect;
    int label;
    final /* synthetic */ WorkflowInterceptor2<P, S, O> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WorkflowInterceptor3(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, WorkflowInterceptor2<P, S, O> workflowInterceptor2, Continuation<? super WorkflowInterceptor3> continuation) {
        super(1, continuation);
        this.$sideEffect = function2;
        this.this$0 = workflowInterceptor2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WorkflowInterceptor3(this.$sideEffect, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WorkflowInterceptor3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$sideEffect;
            CoroutineScope CoroutineScope = CoroutineScope2.CoroutineScope(getContext());
            this.label = 1;
            if (function2.invoke(CoroutineScope, this) == coroutine_suspended) {
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
