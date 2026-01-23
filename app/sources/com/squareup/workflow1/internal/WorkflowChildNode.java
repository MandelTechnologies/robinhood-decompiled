package com.squareup.workflow1.internal;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.internal.InlineLinkedList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: WorkflowChildNode.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\u0006B]\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\b\u0012$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000b0\n\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\r¢\u0006\u0002\u0010\u000eJ\"\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\"\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\"\u001a\u00020#J3\u0010$\u001a\u0002H%\"\u0004\b\u0005\u0010%2\u0016\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030&2\b\u0010'\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010(JD\u0010)\u001a\u00020*\"\u0004\b\u0005\u0010+\"\u0004\b\u0006\u0010,\"\u0004\b\u0007\u0010-\"\u0004\b\b\u0010.2$\u0010/\u001a \u0012\u0004\u0012\u0002H+\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H.0\u000b0\nR,\u0010\t\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u0018\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0000X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0007\u001a\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/squareup/workflow1/internal/WorkflowChildNode;", "ChildPropsT", "ChildOutputT", "ParentPropsT", "ParentStateT", "ParentOutputT", "Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "workflow", "Lcom/squareup/workflow1/Workflow;", "handler", "Lkotlin/Function1;", "Lcom/squareup/workflow1/WorkflowAction;", "workflowNode", "Lcom/squareup/workflow1/internal/WorkflowNode;", "(Lcom/squareup/workflow1/Workflow;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/internal/WorkflowNode;)V", "id", "Lcom/squareup/workflow1/internal/WorkflowNodeId;", "getId", "()Lcom/squareup/workflow1/internal/WorkflowNodeId;", "nextListNode", "getNextListNode", "()Lcom/squareup/workflow1/internal/WorkflowChildNode;", "setNextListNode", "(Lcom/squareup/workflow1/internal/WorkflowChildNode;)V", "getWorkflow", "()Lcom/squareup/workflow1/Workflow;", "getWorkflowNode", "()Lcom/squareup/workflow1/internal/WorkflowNode;", "acceptChildOutput", "output", "", "matches", "", "otherWorkflow", "key", "", "render", "R", "Lcom/squareup/workflow1/StatefulWorkflow;", "props", "(Lcom/squareup/workflow1/StatefulWorkflow;Ljava/lang/Object;)Ljava/lang/Object;", "setHandler", "", "CO", "CP", "S", "O", "newHandler", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowChildNode<ChildPropsT, ChildOutputT, ParentPropsT, ParentStateT, ParentOutputT> implements InlineLinkedList.InlineListNode<WorkflowChildNode<?, ?, ?, ?, ?>> {
    private Function1<? super ChildOutputT, ? extends WorkflowAction<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler;
    private WorkflowChildNode<?, ?, ?, ?, ?> nextListNode;
    private final Workflow<?, ChildOutputT, ?> workflow;
    private final WorkflowNode<ChildPropsT, ?, ChildOutputT, ?> workflowNode;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowChildNode(Workflow<?, ? extends ChildOutputT, ?> workflow, Function1<? super ChildOutputT, ? extends WorkflowAction<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler, WorkflowNode<ChildPropsT, ?, ChildOutputT, ?> workflowNode) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(workflowNode, "workflowNode");
        this.workflow = workflow;
        this.handler = handler;
        this.workflowNode = workflowNode;
    }

    public final Workflow<?, ChildOutputT, ?> getWorkflow() {
        return this.workflow;
    }

    public final WorkflowNode<ChildPropsT, ?, ChildOutputT, ?> getWorkflowNode() {
        return this.workflowNode;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList.InlineListNode
    public WorkflowChildNode<?, ?, ?, ?, ?> getNextListNode() {
        return this.nextListNode;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList.InlineListNode
    public void setNextListNode(WorkflowChildNode<?, ?, ?, ?, ?> workflowChildNode) {
        this.nextListNode = workflowChildNode;
    }

    public final WorkflowNodeId getId() {
        return this.workflowNode.getId();
    }

    public final boolean matches(Workflow<?, ?, ?> otherWorkflow, String key) {
        Intrinsics.checkNotNullParameter(otherWorkflow, "otherWorkflow");
        Intrinsics.checkNotNullParameter(key, "key");
        return getId().matches(otherWorkflow, key);
    }

    public final <CO, CP, S, O> void setHandler(Function1<? super CO, ? extends WorkflowAction<? super CP, S, ? extends O>> newHandler) {
        Intrinsics.checkNotNullParameter(newHandler, "newHandler");
        this.handler = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newHandler, 1);
    }

    public final <R> R render(StatefulWorkflow<?, ?, ?, ?> workflow, Object props) {
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        return (R) this.workflowNode.render(workflow, props);
    }

    public final WorkflowAction<ParentPropsT, ParentStateT, ParentOutputT> acceptChildOutput(Object output) {
        return this.handler.invoke(output);
    }
}
