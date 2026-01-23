package com.robinhood.shared.security.workflow;

import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: WorkflowExperiments.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowDeeplinkKillswitch;", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.workflow.WorkflowDeeplinkKillswitch, reason: use source file name */
/* loaded from: classes6.dex */
public final class WorkflowExperiments extends DeviceIdExperiment<SimpleVariant> {
    public static final WorkflowExperiments INSTANCE = new WorkflowExperiments();
    public static final int $stable = 8;

    private WorkflowExperiments() {
        super("acc-sec-polaris-deeplink-killswitch", null, 2, null);
    }
}
