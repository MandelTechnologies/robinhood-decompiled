package com.squareup.workflow1.internal;

import com.squareup.workflow1.RenderingAndSnapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowInterceptor;
import com.squareup.workflow1.WorkflowOutput;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.selects.SelectOld;

/* compiled from: WorkflowRunner.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)R0\u0010+\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m3636d2 = {"Lcom/squareup/workflow1/internal/WorkflowRunner;", "PropsT", "OutputT", "RenderingT", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/squareup/workflow1/Workflow;", "protoWorkflow", "Lkotlinx/coroutines/flow/StateFlow;", "props", "Lcom/squareup/workflow1/TreeSnapshot;", "snapshot", "Lcom/squareup/workflow1/WorkflowInterceptor;", "interceptor", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/squareup/workflow1/Workflow;Lkotlinx/coroutines/flow/StateFlow;Lcom/squareup/workflow1/TreeSnapshot;Lcom/squareup/workflow1/WorkflowInterceptor;)V", "Lcom/squareup/workflow1/RenderingAndSnapshot;", "nextRendering", "()Lcom/squareup/workflow1/RenderingAndSnapshot;", "Lcom/squareup/workflow1/WorkflowOutput;", "nextOutput", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "cancelRuntime", "(Ljava/util/concurrent/CancellationException;)V", "Lcom/squareup/workflow1/StatefulWorkflow;", "workflow", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/squareup/workflow1/internal/IdCounter;", "idCounter", "Lcom/squareup/workflow1/internal/IdCounter;", "currentProps", "Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "propsChannel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getPropsChannel$annotations", "()V", "Lcom/squareup/workflow1/internal/WorkflowNode;", "rootNode", "Lcom/squareup/workflow1/internal/WorkflowNode;", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowRunner<PropsT, OutputT, RenderingT> {
    private PropsT currentProps;
    private final IdCounter idCounter;
    private final Channel8<PropsT> propsChannel;
    private final WorkflowNode<PropsT, ? extends Object, OutputT, RenderingT> rootNode;
    private final StatefulWorkflow<PropsT, ?, OutputT, RenderingT> workflow;

    public WorkflowRunner(CoroutineScope scope, Workflow<? super PropsT, ? extends OutputT, ? extends RenderingT> protoWorkflow, StateFlow<? extends PropsT> props, TreeSnapshot treeSnapshot, WorkflowInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(protoWorkflow, "protoWorkflow");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        StatefulWorkflow<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> statefulWorkflowAsStatefulWorkflow = protoWorkflow.asStatefulWorkflow();
        this.workflow = statefulWorkflowAsStatefulWorkflow;
        IdCounter idCounter = new IdCounter();
        this.idCounter = idCounter;
        this.currentProps = props.getValue();
        this.propsChannel = FlowKt.produceIn(FlowKt.dropWhile(props, new WorkflowRunner3(this, null)), scope);
        this.rootNode = new WorkflowNode<>(WorkflowNodeId2.id$default(statefulWorkflowAsStatefulWorkflow, null, 1, null), statefulWorkflowAsStatefulWorkflow, this.currentProps, treeSnapshot, scope.getCoroutineContext(), null, null, interceptor, idCounter, 96, null);
    }

    public final RenderingAndSnapshot<RenderingT> nextRendering() {
        return new RenderingAndSnapshot<>(this.rootNode.render(this.workflow, this.currentProps), this.rootNode.snapshot(this.workflow));
    }

    public final void cancelRuntime(CancellationException cause) {
        this.rootNode.cancel(cause);
    }

    public final Object nextOutput(Continuation<? super WorkflowOutput<? extends OutputT>> continuation) {
        SelectOld selectOld = new SelectOld(continuation);
        try {
            if (!this.propsChannel.isClosedForReceive()) {
                selectOld.invoke(this.propsChannel.getOnReceiveCatching(), new WorkflowRunner2(this, null));
            }
            this.rootNode.tick(selectOld);
        } catch (Throwable th) {
            selectOld.handleBuilderException(th);
        }
        Object result = selectOld.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
