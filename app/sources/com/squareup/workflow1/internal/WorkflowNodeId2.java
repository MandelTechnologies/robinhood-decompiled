package com.squareup.workflow1.internal;

import com.squareup.workflow1.Workflow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowNodeId.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001\"\u001a\b\u0000\u0010\u0002*\u0014\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u0006*\u0002H\u00022\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"id", "Lcom/squareup/workflow1/internal/WorkflowNodeId;", "W", "Lcom/squareup/workflow1/Workflow;", "I", "O", "R", "key", "", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/String;)Lcom/squareup/workflow1/internal/WorkflowNodeId;", "wf1-workflow-runtime"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.internal.WorkflowNodeIdKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WorkflowNodeId2 {
    /* renamed from: id */
    public static final <W extends Workflow<? super I, ? extends O, ? extends R>, I, O, R> WorkflowNodeId m3157id(W w, String key) {
        Intrinsics.checkNotNullParameter(w, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return new WorkflowNodeId(w, key);
    }

    public static /* synthetic */ WorkflowNodeId id$default(Workflow workflow, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return m3157id(workflow, str);
    }
}
