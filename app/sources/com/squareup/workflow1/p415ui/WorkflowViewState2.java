package com.squareup.workflow1.p415ui;

import android.view.View;
import com.squareup.workflow1.p415ui.WorkflowViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"6\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00018@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\b\u0010\u0003\"\u0004\b\t\u0010\n\"\"\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Landroid/view/View;", "Lcom/squareup/workflow1/ui/WorkflowViewState;", "getWorkflowViewStateOrNull", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/WorkflowViewState;", "getWorkflowViewStateOrNull$annotations", "(Landroid/view/View;)V", "workflowViewStateOrNull", "value", "getWorkflowViewState", "setWorkflowViewState", "(Landroid/view/View;Lcom/squareup/workflow1/ui/WorkflowViewState;)V", "getWorkflowViewState$annotations", "workflowViewState", "Lcom/squareup/workflow1/ui/WorkflowViewState$New;", "getWorkflowViewStateAsNew", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/WorkflowViewState$New;", "getWorkflowViewStateAsNew$annotations", "workflowViewStateAsNew", "Lcom/squareup/workflow1/ui/WorkflowViewState$Started;", "getWorkflowViewStateAsStarted", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/WorkflowViewState$Started;", "getWorkflowViewStateAsStarted$annotations", "workflowViewStateAsStarted", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.WorkflowViewStateKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WorkflowViewState2 {
    public static final WorkflowViewState<?> getWorkflowViewStateOrNull(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R$id.workflow_ui_view_state);
        if (tag instanceof WorkflowViewState) {
            return (WorkflowViewState) tag;
        }
        return null;
    }

    public static final WorkflowViewState<?> getWorkflowViewState(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WorkflowViewState<?> workflowViewStateOrNull = getWorkflowViewStateOrNull(view);
        if (workflowViewStateOrNull != null) {
            return workflowViewStateOrNull;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    public static final void setWorkflowViewState(View view, WorkflowViewState<?> value) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        view.setTag(R$id.workflow_ui_view_state, value);
    }

    public static final WorkflowViewState.New<?> getWorkflowViewStateAsNew(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WorkflowViewState<?> workflowViewState = getWorkflowViewState(view);
        WorkflowViewState.New<?> r0 = workflowViewState instanceof WorkflowViewState.New ? (WorkflowViewState.New) workflowViewState : null;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    public static final WorkflowViewState.Started<?> getWorkflowViewStateAsStarted(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WorkflowViewState<?> workflowViewState = getWorkflowViewState(view);
        WorkflowViewState.Started<?> started = workflowViewState instanceof WorkflowViewState.Started ? (WorkflowViewState.Started) workflowViewState : null;
        if (started != null) {
            return started;
        }
        throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
    }
}
