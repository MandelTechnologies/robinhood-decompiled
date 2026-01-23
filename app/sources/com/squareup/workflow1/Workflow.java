package com.squareup.workflow1;

import kotlin.Metadata;

/* compiled from: Workflow.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00020\u0004J%\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/squareup/workflow1/Workflow;", "PropsT", "OutputT", "RenderingT", "", "Lcom/squareup/workflow1/StatefulWorkflow;", "asStatefulWorkflow", "()Lcom/squareup/workflow1/StatefulWorkflow;", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface Workflow<PropsT, OutputT, RenderingT> {
    StatefulWorkflow<PropsT, ?, OutputT, RenderingT> asStatefulWorkflow();
}
