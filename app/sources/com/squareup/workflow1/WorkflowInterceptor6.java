package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [P, S] */
/* compiled from: WorkflowInterceptor.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.WorkflowInterceptorKt$intercept$1$initialState$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class WorkflowInterceptor6<P, S> extends FunctionReferenceImpl implements Function2<P, Snapshot, S> {
    WorkflowInterceptor6(Object obj) {
        super(2, obj, StatefulWorkflow.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final S invoke2(P p, Snapshot snapshot) {
        return (S) ((StatefulWorkflow) this.receiver).initialState(p, snapshot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Snapshot snapshot) {
        return invoke2((WorkflowInterceptor6<P, S>) obj, snapshot);
    }
}
