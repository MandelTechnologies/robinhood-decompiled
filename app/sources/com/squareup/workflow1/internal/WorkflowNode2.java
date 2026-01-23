package com.squareup.workflow1.internal;

import com.squareup.workflow1.WorkflowAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
/* compiled from: WorkflowNode.kt */
@Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.internal.WorkflowNode$subtreeManager$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class WorkflowNode2<OutputT, PropsT, StateT> extends FunctionReferenceImpl implements Function1<WorkflowAction<? super PropsT, StateT, ? extends OutputT>, Object> {
    WorkflowNode2(Object obj) {
        super(1, obj, WorkflowNode.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(WorkflowAction<? super PropsT, StateT, ? extends OutputT> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((WorkflowNode) this.receiver).applyAction(p0);
    }
}
