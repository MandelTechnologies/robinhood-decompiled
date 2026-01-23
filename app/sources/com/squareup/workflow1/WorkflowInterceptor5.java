package com.squareup.workflow1;

import com.squareup.workflow1.WorkflowInterceptor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ad\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005*\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00012\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, m3636d2 = {"intercept", "Lcom/squareup/workflow1/StatefulWorkflow;", "P", "S", "O", "R", "Lcom/squareup/workflow1/WorkflowInterceptor;", "workflow", "workflowSession", "Lcom/squareup/workflow1/WorkflowInterceptor$WorkflowSession;", "wf1-workflow-runtime"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.WorkflowInterceptorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WorkflowInterceptor5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <P, S, O, R> StatefulWorkflow<P, S, O, R> intercept(final WorkflowInterceptor workflowInterceptor, final StatefulWorkflow<? super P, S, ? extends O, ? extends R> workflow, final WorkflowInterceptor.WorkflowSession workflowSession) {
        Intrinsics.checkNotNullParameter(workflowInterceptor, "<this>");
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(workflowSession, "workflowSession");
        return workflowInterceptor == WorkflowInterceptor4.INSTANCE ? workflow : new StatefulWorkflow<P, S, O, R>() { // from class: com.squareup.workflow1.WorkflowInterceptorKt.intercept.1
            @Override // com.squareup.workflow1.StatefulWorkflow
            public S initialState(P props, Snapshot snapshot) {
                return (S) workflowInterceptor.onInitialState(props, snapshot, new WorkflowInterceptor6(workflow), workflowSession);
            }

            @Override // com.squareup.workflow1.StatefulWorkflow
            public S onPropsChanged(P old, P p, S state) {
                return (S) workflowInterceptor.onPropsChanged(old, p, state, new WorkflowInterceptor7(workflow), workflowSession);
            }

            @Override // com.squareup.workflow1.StatefulWorkflow
            public R render(P renderProps, S renderState, final StatefulWorkflow<? super P, S, ? extends O, ? extends R>.RenderContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                WorkflowInterceptor workflowInterceptor2 = workflowInterceptor;
                final StatefulWorkflow<P, S, O, R> statefulWorkflow = workflow;
                return (R) workflowInterceptor2.onRender(renderProps, renderState, context, new Function3<P, S, WorkflowInterceptor.RenderContextInterceptor<P, S, O>, R>() { // from class: com.squareup.workflow1.WorkflowInterceptorKt$intercept$1$render$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((WorkflowInterceptor8<O, P, R, S>) obj, obj2, (WorkflowInterceptor.RenderContextInterceptor<WorkflowInterceptor8<O, P, R, S>, Object, O>) obj3);
                    }

                    public final R invoke(P p, S s, WorkflowInterceptor.RenderContextInterceptor<P, S, O> renderContextInterceptor) {
                        BaseRenderContext workflowInterceptor22 = renderContextInterceptor == null ? null : new WorkflowInterceptor2(context, renderContextInterceptor);
                        if (workflowInterceptor22 == null) {
                            workflowInterceptor22 = context;
                        }
                        return statefulWorkflow.render(p, s, Workflows.RenderContext(workflowInterceptor22, this));
                    }
                }, workflowSession);
            }

            @Override // com.squareup.workflow1.StatefulWorkflow
            public Snapshot snapshotState(S state) {
                return workflowInterceptor.onSnapshotState(state, new WorkflowInterceptor9(workflow), workflowSession);
            }

            public String toString() {
                return "InterceptedWorkflow(" + workflow + ", " + this + "@intercept)";
            }
        };
    }
}
