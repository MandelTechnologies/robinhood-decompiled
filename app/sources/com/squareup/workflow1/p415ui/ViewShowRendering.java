package com.squareup.workflow1.p415ui;

import android.view.View;
import com.squareup.workflow1.p415ui.WorkflowViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewShowRendering.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u001aQ\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0013\u001a=\u0010\u0014\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\" \u0010\u0019\u001a\u0004\u0018\u00010\u0004*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017\"F\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001a*\u00020\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001a8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b \u0010\r\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*6\b\u0007\u0010\"\u001a\u0004\b\u0000\u0010\u0001\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006#"}, m3636d2 = {"", "RenderingT", "Landroid/view/View;", "initialRendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "initialViewEnvironment", "Lkotlin/Function2;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "showRendering", "bindShowRendering", "(Landroid/view/View;Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Lkotlin/jvm/functions/Function2;)V", "start", "(Landroid/view/View;)V", "rendering", "", "canShowRendering", "(Landroid/view/View;Ljava/lang/Object;)Z", "viewEnvironment", "(Landroid/view/View;Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "getShowRendering", "(Landroid/view/View;)Lkotlin/jvm/functions/Function2;", "getEnvironment", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/ViewEnvironment;", "getEnvironment$annotations", "environment", "Lkotlin/Function1;", "value", "getStarter", "(Landroid/view/View;)Lkotlin/jvm/functions/Function1;", "setStarter", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getStarter$annotations", "starter", "ViewShowRendering", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.ViewShowRenderingKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ViewShowRendering {
    public static final <RenderingT> void bindShowRendering(View view, RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Function2<? super RenderingT, ? super ViewEnvironment, Unit> showRendering) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(showRendering, "showRendering");
        WorkflowViewState2.setWorkflowViewState(view, WorkflowViewState2.getWorkflowViewStateOrNull(view) instanceof WorkflowViewState.New ? new WorkflowViewState.New(initialRendering, initialViewEnvironment, showRendering, getStarter(view)) : new WorkflowViewState.New(initialRendering, initialViewEnvironment, showRendering, null, 8, null));
    }

    public static final void start(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WorkflowViewState.New<?> workflowViewStateAsNew = WorkflowViewState2.getWorkflowViewStateAsNew(view);
        WorkflowViewState2.setWorkflowViewState(view, new WorkflowViewState.Started(workflowViewStateAsNew.getShowing(), workflowViewStateAsNew.getEnvironment(), workflowViewStateAsNew.getShowRendering()));
        workflowViewStateAsNew.getStarter().invoke(view);
    }

    public static final <RenderingT> void showRendering(View view, RenderingT rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        WorkflowViewState.Started<?> workflowViewStateAsStarted = WorkflowViewState2.getWorkflowViewStateAsStarted(view);
        if (!Compatible2.compatible(workflowViewStateAsStarted.getShowing(), rendering)) {
            throw new IllegalStateException(("Expected " + view + " to be able to show rendering " + rendering + ", but that did not match previous rendering " + workflowViewStateAsStarted.getShowing() + ". Consider using WorkflowViewStub to display arbitrary types.").toString());
        }
        WorkflowViewState2.setWorkflowViewState(view, new WorkflowViewState.Started(rendering, viewEnvironment, workflowViewStateAsStarted.getShowRendering()));
        workflowViewStateAsStarted.getShowRendering().invoke(rendering, viewEnvironment);
    }

    public static final boolean canShowRendering(View view, Object rendering) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(view);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        Object obj = showing != null ? showing : null;
        return obj != null && Compatible2.compatible(obj, rendering);
    }

    public static final ViewEnvironment getEnvironment(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(view);
        if (workflowViewStateOrNull == null) {
            return null;
        }
        return workflowViewStateOrNull.getEnvironment();
    }

    public static final <RenderingT> Function2<RenderingT, ViewEnvironment, Unit> getShowRendering(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(view);
        if (workflowViewStateOrNull == null) {
            return null;
        }
        return (Function2<RenderingT, ViewEnvironment, Unit>) workflowViewStateOrNull.getShowRendering();
    }

    public static final Function1<View, Unit> getStarter(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return WorkflowViewState2.getWorkflowViewStateAsNew(view).getStarter();
    }

    public static final void setStarter(View view, Function1<? super View, Unit> value) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        WorkflowViewState2.setWorkflowViewState(view, WorkflowViewState.New.copy$default(WorkflowViewState2.getWorkflowViewStateAsNew(view), null, null, null, value, 7, null));
    }
}
