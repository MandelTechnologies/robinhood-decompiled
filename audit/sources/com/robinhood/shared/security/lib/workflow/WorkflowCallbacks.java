package com.robinhood.shared.security.lib.workflow;

import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import kotlin.Metadata;

/* compiled from: WorkflowCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", "", "finishWithRequest", "", "action", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "screen", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface WorkflowCallbacks {
    void finishWithRequest(UiWorkflowScreenAction action, UiWorkflowScreen screen);
}
