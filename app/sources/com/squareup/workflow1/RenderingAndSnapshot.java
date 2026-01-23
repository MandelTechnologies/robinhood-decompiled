package com.squareup.workflow1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RenderingAndSnapshot.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/squareup/workflow1/RenderingAndSnapshot;", "RenderingT", "", "rendering", "Lcom/squareup/workflow1/TreeSnapshot;", "snapshot", "<init>", "(Ljava/lang/Object;Lcom/squareup/workflow1/TreeSnapshot;)V", "Ljava/lang/Object;", "getRendering", "()Ljava/lang/Object;", "Lcom/squareup/workflow1/TreeSnapshot;", "getSnapshot", "()Lcom/squareup/workflow1/TreeSnapshot;", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RenderingAndSnapshot<RenderingT> {
    private final RenderingT rendering;
    private final TreeSnapshot snapshot;

    public RenderingAndSnapshot(RenderingT renderingt, TreeSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.rendering = renderingt;
        this.snapshot = snapshot;
    }

    public final RenderingT getRendering() {
        return this.rendering;
    }

    public final TreeSnapshot getSnapshot() {
        return this.snapshot;
    }
}
