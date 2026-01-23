package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowAction.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u00020\u0004:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u0007*\u00180\bR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000H&¨\u0006\u000b"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowAction;", "PropsT", "StateT", "OutputT", "", "()V", "apply", "", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Companion", "Updater", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class WorkflowAction<PropsT, StateT, OutputT> {
    private static final WorkflowAction2 NO_ACTION = new WorkflowAction<Object, Object, Object>() { // from class: com.squareup.workflow1.WorkflowAction$Companion$NO_ACTION$1
        @Override // com.squareup.workflow1.WorkflowAction
        public void apply(WorkflowAction<? super Object, Object, ? extends Object>.Updater updater) {
            Intrinsics.checkNotNullParameter(updater, "<this>");
        }

        public String toString() {
            return "WorkflowAction.noAction()";
        }
    };

    public abstract void apply(WorkflowAction<? super PropsT, StateT, ? extends OutputT>.Updater updater);

    /* compiled from: WorkflowAction.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00028\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0002¢\u0006\u0002\u0010\u000fR.\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u00028\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowAction$Updater;", "", "props", "state", "(Lcom/squareup/workflow1/WorkflowAction;Ljava/lang/Object;Ljava/lang/Object;)V", "<set-?>", "Lcom/squareup/workflow1/WorkflowOutput;", "maybeOutput", "getMaybeOutput$wf1_workflow_core", "()Lcom/squareup/workflow1/WorkflowOutput;", "getProps", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getState", "setState", "(Ljava/lang/Object;)V", "setOutput", "", "output", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public final class Updater {
        private WorkflowOutput<? extends OutputT> maybeOutput;
        private final PropsT props;
        private StateT state;
        final /* synthetic */ WorkflowAction<PropsT, StateT, OutputT> this$0;

        public Updater(WorkflowAction this$0, PropsT propst, StateT statet) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.props = propst;
            this.state = statet;
        }

        public final PropsT getProps() {
            return this.props;
        }

        public final StateT getState() {
            return this.state;
        }

        public final void setState(StateT statet) {
            this.state = statet;
        }

        public final WorkflowOutput<OutputT> getMaybeOutput$wf1_workflow_core() {
            return this.maybeOutput;
        }

        public final void setOutput(OutputT output) {
            this.maybeOutput = new WorkflowOutput<>(output);
        }
    }
}
