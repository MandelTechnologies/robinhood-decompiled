package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: WorkerWorkflow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004B!\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\bH\u0016J\"\u0010\r\u001a\u00020\u000e*\u00180\u000fR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004H\u0016R\u0010\u0010\t\u001a\u00028\u0002X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/EmitWorkerOutputAction;", "P", "S", "O", "Lcom/squareup/workflow1/WorkflowAction;", "worker", "Lcom/squareup/workflow1/Worker;", "renderKey", "", "output", "(Lcom/squareup/workflow1/Worker;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "toString", "apply", "", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.EmitWorkerOutputAction, reason: use source file name */
/* loaded from: classes12.dex */
final class WorkerWorkflow2<P, S, O> extends WorkflowAction<P, S, O> {
    private final O output;

    /* renamed from: renderKey, reason: from kotlin metadata and from toString */
    private final String key;
    private final Worker<?> worker;

    public WorkerWorkflow2(Worker<?> worker, String renderKey, O o) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(renderKey, "renderKey");
        this.worker = worker;
        this.key = renderKey;
        this.output = o;
    }

    public String toString() {
        return ((Object) Reflection.getOrCreateKotlinClass(WorkerWorkflow2.class).getQualifiedName()) + "(worker=" + this.worker + ", key=\"" + this.key + "\")";
    }

    @Override // com.squareup.workflow1.WorkflowAction
    public void apply(WorkflowAction<? super P, S, ? extends O>.Updater updater) {
        Intrinsics.checkNotNullParameter(updater, "<this>");
        updater.setOutput(this.output);
    }
}
