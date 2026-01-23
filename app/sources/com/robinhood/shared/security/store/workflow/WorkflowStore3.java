package com.robinhood.shared.security.store.workflow;

import identi.service.p471v1.models_workflow.p472v1.WorkflowActionResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: WorkflowStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.store.workflow.WorkflowStore$workflowActionEndpoint$2", m3645f = "WorkflowStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.store.workflow.WorkflowStore$workflowActionEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
final class WorkflowStore3 extends ContinuationImpl7 implements Function2<WorkflowActionResponseDto, Continuation<? super Unit>, Object> {
    int label;

    WorkflowStore3(Continuation<? super WorkflowStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkflowStore3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WorkflowActionResponseDto workflowActionResponseDto, Continuation<? super Unit> continuation) {
        return ((WorkflowStore3) create(workflowActionResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
