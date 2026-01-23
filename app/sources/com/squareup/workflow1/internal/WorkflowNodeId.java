package com.squareup.workflow1.internal;

import com.squareup.workflow1.Snapshots;
import com.squareup.workflow1.Workflow;
import com.squareup.workflow1.WorkflowIdentifier;
import com.squareup.workflow1.Workflows;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* compiled from: WorkflowNodeId.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/squareup/workflow1/internal/WorkflowNodeId;", "", "Lcom/squareup/workflow1/WorkflowIdentifier;", "identifier", "", "name", "<init>", "(Lcom/squareup/workflow1/WorkflowIdentifier;Ljava/lang/String;)V", "Lcom/squareup/workflow1/Workflow;", "workflow", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/String;)V", "otherWorkflow", "otherName", "", "matches", "(Lcom/squareup/workflow1/Workflow;Ljava/lang/String;)Z", "Lokio/ByteString;", "toByteStringOrNull$wf1_workflow_runtime", "()Lokio/ByteString;", "toByteStringOrNull", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/squareup/workflow1/WorkflowIdentifier;", "getIdentifier$wf1_workflow_runtime", "()Lcom/squareup/workflow1/WorkflowIdentifier;", "Ljava/lang/String;", "getName$wf1_workflow_runtime", "Companion", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WorkflowNodeId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final WorkflowIdentifier identifier;
    private final String name;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowNodeId)) {
            return false;
        }
        WorkflowNodeId workflowNodeId = (WorkflowNodeId) other;
        return Intrinsics.areEqual(this.identifier, workflowNodeId.identifier) && Intrinsics.areEqual(this.name, workflowNodeId.name);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "WorkflowNodeId(identifier=" + this.identifier + ", name=" + this.name + ')';
    }

    public WorkflowNodeId(WorkflowIdentifier identifier, String name) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        this.identifier = identifier;
        this.name = name;
    }

    /* renamed from: getIdentifier$wf1_workflow_runtime, reason: from getter */
    public final WorkflowIdentifier getIdentifier() {
        return this.identifier;
    }

    /* renamed from: getName$wf1_workflow_runtime, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowNodeId(Workflow<?, ?, ?> workflow, String name) {
        this(Workflows.getIdentifier(workflow), name);
        Intrinsics.checkNotNullParameter(workflow, "workflow");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final boolean matches(Workflow<?, ?, ?> otherWorkflow, String otherName) {
        Intrinsics.checkNotNullParameter(otherWorkflow, "otherWorkflow");
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.areEqual(this.identifier, Workflows.getIdentifier(otherWorkflow)) && Intrinsics.areEqual(this.name, otherName);
    }

    public final ByteString toByteStringOrNull$wf1_workflow_runtime() throws IOException {
        ByteString byteStringOrNull = this.identifier.toByteStringOrNull();
        if (byteStringOrNull == null) {
            return null;
        }
        Buffer buffer = new Buffer();
        Snapshots.writeByteStringWithLength(buffer, byteStringOrNull);
        Snapshots.writeUtf8WithLength(buffer, getName());
        return buffer.readByteString();
    }

    /* compiled from: WorkflowNodeId.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/internal/WorkflowNodeId$Companion;", "", "()V", "parse", "Lcom/squareup/workflow1/internal/WorkflowNodeId;", "bytes", "Lokio/ByteString;", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WorkflowNodeId parse(ByteString bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Buffer buffer = new Buffer();
            buffer.write(bytes);
            return new WorkflowNodeId(WorkflowIdentifier.INSTANCE.parse(Snapshots.readByteStringWithLength(buffer)), Snapshots.readUtf8WithLength(buffer));
        }
    }
}
