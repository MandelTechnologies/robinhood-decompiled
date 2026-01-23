package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [S] */
/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.WorkflowInterceptorKt$intercept$1$snapshotState$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class WorkflowInterceptor9<S> extends FunctionReferenceImpl implements Function1<S, Snapshot> {
    WorkflowInterceptor9(Object obj) {
        super(1, obj, StatefulWorkflow.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Snapshot invoke(S s) {
        return ((StatefulWorkflow) this.receiver).snapshotState(s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Snapshot invoke(Object obj) {
        return invoke((WorkflowInterceptor9<S>) obj);
    }
}
