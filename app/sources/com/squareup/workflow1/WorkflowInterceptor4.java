package com.squareup.workflow1;

import com.squareup.workflow1.WorkflowInterceptor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/squareup/workflow1/NoopWorkflowInterceptor;", "Lcom/squareup/workflow1/WorkflowInterceptor;", "()V", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.NoopWorkflowInterceptor, reason: use source file name */
/* loaded from: classes12.dex */
public final class WorkflowInterceptor4 implements WorkflowInterceptor {
    public static final WorkflowInterceptor4 INSTANCE = new WorkflowInterceptor4();

    private WorkflowInterceptor4() {
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <P, S> S onInitialState(P p, Snapshot snapshot, Function2<? super P, ? super Snapshot, ? extends S> function2, WorkflowInterceptor.WorkflowSession workflowSession) {
        return (S) WorkflowInterceptor.DefaultImpls.onInitialState(this, p, snapshot, function2, workflowSession);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <P, S> S onPropsChanged(P p, P p2, S s, Function3<? super P, ? super P, ? super S, ? extends S> function3, WorkflowInterceptor.WorkflowSession workflowSession) {
        return (S) WorkflowInterceptor.DefaultImpls.onPropsChanged(this, p, p2, s, function3, workflowSession);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <P, S, O, R> R onRender(P p, S s, BaseRenderContext<? extends P, S, ? super O> baseRenderContext, Function3<? super P, ? super S, ? super WorkflowInterceptor.RenderContextInterceptor<P, S, O>, ? extends R> function3, WorkflowInterceptor.WorkflowSession workflowSession) {
        return (R) WorkflowInterceptor.DefaultImpls.onRender(this, p, s, baseRenderContext, function3, workflowSession);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public void onSessionStarted(CoroutineScope coroutineScope, WorkflowInterceptor.WorkflowSession workflowSession) {
        WorkflowInterceptor.DefaultImpls.onSessionStarted(this, coroutineScope, workflowSession);
    }

    @Override // com.squareup.workflow1.WorkflowInterceptor
    public <S> Snapshot onSnapshotState(S s, Function1<? super S, Snapshot> function1, WorkflowInterceptor.WorkflowSession workflowSession) {
        return WorkflowInterceptor.DefaultImpls.onSnapshotState(this, s, function1, workflowSession);
    }
}
