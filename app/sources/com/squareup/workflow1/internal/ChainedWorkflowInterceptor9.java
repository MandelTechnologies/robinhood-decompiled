package com.squareup.workflow1.internal;

import com.squareup.workflow1.WorkflowInterceptor;
import com.squareup.workflow1.WorkflowInterceptor4;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChainedWorkflowInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"chained", "Lcom/squareup/workflow1/WorkflowInterceptor;", "", "wf1-workflow-runtime"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.internal.ChainedWorkflowInterceptorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ChainedWorkflowInterceptor9 {
    public static final WorkflowInterceptor chained(List<? extends WorkflowInterceptor> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.isEmpty() ? WorkflowInterceptor4.INSTANCE : list.size() == 1 ? (WorkflowInterceptor) CollectionsKt.single((List) list) : new ChainedWorkflowInterceptor(list);
    }
}
