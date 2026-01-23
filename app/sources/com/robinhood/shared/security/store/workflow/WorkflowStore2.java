package com.robinhood.shared.security.store.workflow;

import identi.service.p471v1.RestIdentiIDLV1Service;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionRequestDto;
import identi.service.p471v1.models_workflow.p472v1.WorkflowActionResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WorkflowStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.store.workflow.WorkflowStore$workflowActionEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class WorkflowStore2 extends FunctionReferenceImpl implements Function2<WorkflowActionRequestDto, Continuation<? super WorkflowActionResponseDto>, Object>, ContinuationImpl6 {
    WorkflowStore2(Object obj) {
        super(2, obj, RestIdentiIDLV1Service.class, "WorkflowAction", "WorkflowAction(Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WorkflowActionRequestDto workflowActionRequestDto, Continuation<? super WorkflowActionResponseDto> continuation) {
        return ((RestIdentiIDLV1Service) this.receiver).WorkflowAction(workflowActionRequestDto, continuation);
    }
}
