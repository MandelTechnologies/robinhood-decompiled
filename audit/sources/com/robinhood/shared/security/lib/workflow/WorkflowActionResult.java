package com.robinhood.shared.security.lib.workflow;

import com.robinhood.models.workflow.p358ui.UiWorkflowActionResponse;
import com.robinhood.models.workflow.p358ui.UiWorkflowRoute;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenActionResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActionResult.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J(\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "", "action", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "responseResult", "Lkotlin/Result;", "Lcom/robinhood/models/workflow/ui/UiWorkflowActionResponse;", "<init>", "(Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;Ljava/lang/Object;)V", "getAction", "()Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "Ljava/lang/Object;", "consumed", "", "peek", "peek-d1pmJ48", "()Ljava/lang/Object;", "consumeRoute", "Lcom/robinhood/models/workflow/ui/UiWorkflowRoute;", "consumeScreenActionResponse", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenActionResponse;", "consumeError", "", "component1", "component2", "component2-d1pmJ48", "copy", "(Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;Ljava/lang/Object;)Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "equals", "other", "hashCode", "", "toString", "", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WorkflowActionResult {
    private final UiWorkflowScreenAction action;
    private boolean consumed;
    private final Object responseResult;

    /* renamed from: component2-d1pmJ48, reason: not valid java name and from getter */
    private final Object getResponseResult() {
        return this.responseResult;
    }

    public static /* synthetic */ WorkflowActionResult copy$default(WorkflowActionResult workflowActionResult, UiWorkflowScreenAction uiWorkflowScreenAction, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            uiWorkflowScreenAction = workflowActionResult.action;
        }
        if ((i & 2) != 0) {
            result = Result.m28549boximpl(workflowActionResult.responseResult);
        }
        return workflowActionResult.copy(uiWorkflowScreenAction, result.getValue());
    }

    /* renamed from: component1, reason: from getter */
    public final UiWorkflowScreenAction getAction() {
        return this.action;
    }

    public final WorkflowActionResult copy(UiWorkflowScreenAction action, Object responseResult) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new WorkflowActionResult(action, responseResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowActionResult)) {
            return false;
        }
        WorkflowActionResult workflowActionResult = (WorkflowActionResult) other;
        return Intrinsics.areEqual(this.action, workflowActionResult.action) && Result.m28552equalsimpl0(this.responseResult, workflowActionResult.responseResult);
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + Result.m28554hashCodeimpl(this.responseResult);
    }

    public String toString() {
        return "WorkflowActionResult(action=" + this.action + ", responseResult=" + Result.m28557toStringimpl(this.responseResult) + ")";
    }

    public WorkflowActionResult(UiWorkflowScreenAction action, Object obj) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.responseResult = obj;
    }

    public final UiWorkflowScreenAction getAction() {
        return this.action;
    }

    /* renamed from: peek-d1pmJ48, reason: not valid java name */
    public final Object m25661peekd1pmJ48() {
        return this.responseResult;
    }

    public final UiWorkflowRoute consumeRoute() {
        Object obj = this.responseResult;
        if (Result.m28555isFailureimpl(obj)) {
            obj = null;
        }
        UiWorkflowActionResponse uiWorkflowActionResponse = (UiWorkflowActionResponse) obj;
        UiWorkflowRoute route = uiWorkflowActionResponse != null ? uiWorkflowActionResponse.getRoute() : null;
        if (route == null || this.consumed) {
            return null;
        }
        this.consumed = true;
        return route;
    }

    public final UiWorkflowScreenActionResponse consumeScreenActionResponse() {
        Object obj = this.responseResult;
        if (Result.m28555isFailureimpl(obj)) {
            obj = null;
        }
        UiWorkflowActionResponse uiWorkflowActionResponse = (UiWorkflowActionResponse) obj;
        UiWorkflowScreenActionResponse screenActionResponse = uiWorkflowActionResponse != null ? uiWorkflowActionResponse.getScreenActionResponse() : null;
        if (screenActionResponse == null || this.consumed) {
            return null;
        }
        this.consumed = true;
        return screenActionResponse;
    }

    public final Throwable consumeError() {
        if (!Result.m28555isFailureimpl(this.responseResult) || this.consumed) {
            return null;
        }
        this.consumed = true;
        return Result.m28553exceptionOrNullimpl(this.responseResult);
    }
}
