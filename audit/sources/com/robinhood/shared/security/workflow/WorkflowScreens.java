package com.robinhood.shared.security.workflow;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.workflow.p358ui.screens.ChecklistScreen;
import com.robinhood.models.workflow.p358ui.screens.DeviceApprovalChallengeScreen;
import com.robinhood.models.workflow.p358ui.screens.EmailChallengeScreen;
import com.robinhood.models.workflow.p358ui.screens.GenericKbaScreen;
import com.robinhood.models.workflow.p358ui.screens.InfoScreen;
import com.robinhood.models.workflow.p358ui.screens.KycStatusCheckScreen;
import com.robinhood.models.workflow.p358ui.screens.RequestPhoneCallScreen;
import com.robinhood.models.workflow.p358ui.screens.SmsChallengeScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import com.robinhood.models.workflow.p358ui.screens.UpdateAppScreen;
import com.robinhood.shared.security.contracts.ChecklistFragmentKey;
import com.robinhood.shared.security.contracts.DeviceApprovalChallengeFragmentKey;
import com.robinhood.shared.security.contracts.EmailChallengeFragmentKey;
import com.robinhood.shared.security.contracts.GenericKbaFragmentKey;
import com.robinhood.shared.security.contracts.InfoFragmentKey;
import com.robinhood.shared.security.contracts.KycStatusCheckFragmentKey;
import com.robinhood.shared.security.contracts.RequestPhoneCallFragmentKey;
import com.robinhood.shared.security.contracts.SmsChallengeFragmentKey;
import com.robinhood.shared.security.contracts.UpdateAppFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowScreens.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "workflowId", "Ljava/util/UUID;", "feature-workflow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.workflow.WorkflowScreensKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WorkflowScreens {
    public static final FragmentKey toFragmentKey(UiWorkflowScreen uiWorkflowScreen, UUID workflowId) {
        Intrinsics.checkNotNullParameter(uiWorkflowScreen, "<this>");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        if (uiWorkflowScreen instanceof ChecklistScreen) {
            return new ChecklistFragmentKey(workflowId, (ChecklistScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof DeviceApprovalChallengeScreen) {
            return new DeviceApprovalChallengeFragmentKey(workflowId, (DeviceApprovalChallengeScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof EmailChallengeScreen) {
            return new EmailChallengeFragmentKey(workflowId, (EmailChallengeScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof GenericKbaScreen) {
            return new GenericKbaFragmentKey(workflowId, (GenericKbaScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof InfoScreen) {
            return new InfoFragmentKey(workflowId, (InfoScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof KycStatusCheckScreen) {
            return new KycStatusCheckFragmentKey(workflowId, (KycStatusCheckScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof RequestPhoneCallScreen) {
            return new RequestPhoneCallFragmentKey(workflowId, (RequestPhoneCallScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof SmsChallengeScreen) {
            return new SmsChallengeFragmentKey(workflowId, (SmsChallengeScreen) uiWorkflowScreen);
        }
        if (uiWorkflowScreen instanceof UpdateAppScreen) {
            return new UpdateAppFragmentKey(workflowId, (UpdateAppScreen) uiWorkflowScreen);
        }
        return null;
    }
}
