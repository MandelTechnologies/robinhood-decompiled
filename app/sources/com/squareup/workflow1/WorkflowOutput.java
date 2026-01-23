package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowAction.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowOutput;", "OutputT", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "toString", "", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowOutput<OutputT> {
    private final OutputT value;

    public WorkflowOutput(OutputT outputt) {
        this.value = outputt;
    }

    public final OutputT getValue() {
        return this.value;
    }

    public String toString() {
        return "WorkflowOutput(" + this.value + ')';
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof WorkflowOutput) {
            return Intrinsics.areEqual(this.value, ((WorkflowOutput) other).value);
        }
        return false;
    }

    public int hashCode() {
        OutputT outputt = this.value;
        if (outputt == null) {
            return 0;
        }
        return outputt.hashCode();
    }
}
