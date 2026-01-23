package com.squareup.workflow1;

import com.squareup.workflow1.internal.WorkflowNodeId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: TreeSnapshot.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00060\u0005¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00038@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/squareup/workflow1/TreeSnapshot;", "", "workflowSnapshot", "Lcom/squareup/workflow1/Snapshot;", "childTreeSnapshots", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/internal/WorkflowNodeId;", "(Lcom/squareup/workflow1/Snapshot;Lkotlin/jvm/functions/Function0;)V", "getChildTreeSnapshots$wf1_workflow_runtime", "()Ljava/util/Map;", "childTreeSnapshots$delegate", "Lkotlin/Lazy;", "getWorkflowSnapshot$wf1_workflow_runtime", "()Lcom/squareup/workflow1/Snapshot;", "workflowSnapshot$delegate", "equals", "", "other", "hashCode", "", "toByteString", "Lokio/ByteString;", "Companion", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TreeSnapshot {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: childTreeSnapshots$delegate, reason: from kotlin metadata */
    private final Lazy childTreeSnapshots;

    /* renamed from: workflowSnapshot$delegate, reason: from kotlin metadata */
    private final Lazy workflowSnapshot;

    public TreeSnapshot(final Snapshot snapshot, Function0<? extends Map<WorkflowNodeId, TreeSnapshot>> childTreeSnapshots) {
        Intrinsics.checkNotNullParameter(childTreeSnapshots, "childTreeSnapshots");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.workflowSnapshot = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Snapshot>() { // from class: com.squareup.workflow1.TreeSnapshot$workflowSnapshot$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Snapshot invoke() {
                Snapshot snapshot2 = snapshot;
                if (snapshot2 == null || snapshot2.bytes().size() == 0) {
                    return null;
                }
                return snapshot2;
            }
        });
        this.childTreeSnapshots = LazyKt.lazy(lazyThreadSafetyMode, childTreeSnapshots);
    }

    public final Snapshot getWorkflowSnapshot$wf1_workflow_runtime() {
        return (Snapshot) this.workflowSnapshot.getValue();
    }

    public final Map<WorkflowNodeId, TreeSnapshot> getChildTreeSnapshots$wf1_workflow_runtime() {
        return (Map) this.childTreeSnapshots.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ByteString toByteString() throws IOException {
        Tuples2 tuples2;
        Buffer buffer = new Buffer();
        Snapshot workflowSnapshot$wf1_workflow_runtime = getWorkflowSnapshot$wf1_workflow_runtime();
        ByteString byteStringBytes = workflowSnapshot$wf1_workflow_runtime == null ? null : workflowSnapshot$wf1_workflow_runtime.bytes();
        if (byteStringBytes == null) {
            byteStringBytes = ByteString.EMPTY;
        }
        Snapshots.writeByteStringWithLength(buffer, byteStringBytes);
        Map<WorkflowNodeId, TreeSnapshot> childTreeSnapshots$wf1_workflow_runtime = getChildTreeSnapshots$wf1_workflow_runtime();
        ArrayList<Tuples2> arrayList = new ArrayList();
        for (Map.Entry<WorkflowNodeId, TreeSnapshot> entry : childTreeSnapshots$wf1_workflow_runtime.entrySet()) {
            WorkflowNodeId key = entry.getKey();
            TreeSnapshot value = entry.getValue();
            ByteString byteStringOrNull$wf1_workflow_runtime = key.toByteStringOrNull$wf1_workflow_runtime();
            if (byteStringOrNull$wf1_workflow_runtime == null) {
                tuples2 = null;
            } else {
                ByteString byteString = value.toByteString();
                if (byteString.size() == 0) {
                    byteString = null;
                }
                if (byteString != null) {
                    tuples2 = new Tuples2(byteStringOrNull$wf1_workflow_runtime, byteString);
                }
            }
            if (tuples2 != null) {
                arrayList.add(tuples2);
            }
        }
        buffer.writeInt(arrayList.size());
        for (Tuples2 tuples22 : arrayList) {
            ByteString byteString2 = (ByteString) tuples22.component1();
            ByteString byteString3 = (ByteString) tuples22.component2();
            Snapshots.writeByteStringWithLength(buffer, byteString2);
            Snapshots.writeByteStringWithLength(buffer, byteString3);
        }
        return buffer.readByteString();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TreeSnapshot)) {
            return false;
        }
        TreeSnapshot treeSnapshot = (TreeSnapshot) other;
        return Intrinsics.areEqual(treeSnapshot.getWorkflowSnapshot$wf1_workflow_runtime(), getWorkflowSnapshot$wf1_workflow_runtime()) && Intrinsics.areEqual(treeSnapshot.getChildTreeSnapshots$wf1_workflow_runtime(), getChildTreeSnapshots$wf1_workflow_runtime());
    }

    public int hashCode() {
        Snapshot workflowSnapshot$wf1_workflow_runtime = getWorkflowSnapshot$wf1_workflow_runtime();
        return ((workflowSnapshot$wf1_workflow_runtime == null ? 0 : workflowSnapshot$wf1_workflow_runtime.hashCode()) * 31) + getChildTreeSnapshots$wf1_workflow_runtime().hashCode();
    }

    /* compiled from: TreeSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/squareup/workflow1/TreeSnapshot$Companion;", "", "<init>", "()V", "Lokio/ByteString;", "bytes", "Lcom/squareup/workflow1/TreeSnapshot;", "parse", "(Lokio/ByteString;)Lcom/squareup/workflow1/TreeSnapshot;", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TreeSnapshot parse(ByteString bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            final Buffer bufferWrite = new Buffer().write(bytes);
            return new TreeSnapshot(Snapshot.INSTANCE.m3156of(Snapshots.readByteStringWithLength(bufferWrite)), new Function0<Map<WorkflowNodeId, ? extends TreeSnapshot>>() { // from class: com.squareup.workflow1.TreeSnapshot$Companion$parse$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Map<WorkflowNodeId, ? extends TreeSnapshot> invoke() throws IOException {
                    int i = bufferWrite.readInt();
                    BufferedSource bufferedSource = bufferWrite;
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder(i);
                    int i2 = 0;
                    while (i2 < i) {
                        i2++;
                        mapCreateMapBuilder.put(WorkflowNodeId.INSTANCE.parse(Snapshots.readByteStringWithLength(bufferedSource)), TreeSnapshot.INSTANCE.parse(Snapshots.readByteStringWithLength(bufferedSource)));
                    }
                    return MapsKt.build(mapCreateMapBuilder);
                }
            });
        }
    }
}
