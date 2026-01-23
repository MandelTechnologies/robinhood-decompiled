package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: WorkflowIdentifier.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"!\u0010\b\u001a\u00020\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lkotlin/reflect/KType;", "type", "Lcom/squareup/workflow1/WorkflowIdentifier;", "unsnapshottableIdentifier", "(Lkotlin/reflect/KType;)Lcom/squareup/workflow1/WorkflowIdentifier;", "Lcom/squareup/workflow1/Workflow;", "getIdentifier", "(Lcom/squareup/workflow1/Workflow;)Lcom/squareup/workflow1/WorkflowIdentifier;", "identifier", "wf1-workflow-core"}, m3637k = 5, m3638mv = {1, 6, 0}, m3640xi = 48, m3641xs = "com/squareup/workflow1/Workflows")
/* renamed from: com.squareup.workflow1.Workflows__WorkflowIdentifierKt, reason: use source file name */
/* loaded from: classes12.dex */
final /* synthetic */ class WorkflowIdentifier4 {
    public static final WorkflowIdentifier getIdentifier(Workflow<?, ?, ?> workflow) {
        Intrinsics.checkNotNullParameter(workflow, "<this>");
        ImpostorWorkflow impostorWorkflow = workflow instanceof ImpostorWorkflow ? (ImpostorWorkflow) workflow : null;
        return new WorkflowIdentifier(Reflection.getOrCreateKotlinClass(workflow.getClass()), impostorWorkflow == null ? null : impostorWorkflow.getRealIdentifier(), impostorWorkflow != null ? new WorkflowIdentifier5(impostorWorkflow) : null);
    }

    public static final WorkflowIdentifier unsnapshottableIdentifier(KType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new WorkflowIdentifier(type2, null, null, 6, null);
    }
}
