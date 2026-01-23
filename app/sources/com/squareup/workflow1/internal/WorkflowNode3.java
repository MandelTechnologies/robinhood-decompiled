package com.squareup.workflow1.internal;

import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowOutput;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [StateT, T, OutputT, PropsT] */
/* compiled from: WorkflowNode.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\bH\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/squareup/workflow1/WorkflowOutput;", "T", "PropsT", "StateT", "OutputT", "RenderingT", "action", "Lcom/squareup/workflow1/WorkflowAction;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.workflow1.internal.WorkflowNode$tick$1$1", m3645f = "WorkflowNode.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.workflow1.internal.WorkflowNode$tick$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class WorkflowNode3<OutputT, PropsT, StateT, T> extends ContinuationImpl7 implements Function2<WorkflowAction<? super PropsT, StateT, ? extends OutputT>, Continuation<? super WorkflowOutput<? extends T>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WorkflowNode<PropsT, StateT, OutputT, RenderingT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkflowNode3(WorkflowNode<PropsT, StateT, OutputT, RenderingT> workflowNode, Continuation<? super WorkflowNode3> continuation) {
        super(2, continuation);
        this.this$0 = workflowNode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WorkflowNode3 workflowNode3 = new WorkflowNode3(this.this$0, continuation);
        workflowNode3.L$0 = obj;
        return workflowNode3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WorkflowAction<? super PropsT, StateT, ? extends OutputT> workflowAction, Continuation<? super WorkflowOutput<? extends T>> continuation) {
        return ((WorkflowNode3) create(workflowAction, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.applyAction((WorkflowAction) this.L$0);
    }
}
