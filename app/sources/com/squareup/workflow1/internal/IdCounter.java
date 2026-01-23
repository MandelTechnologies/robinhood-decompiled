package com.squareup.workflow1.internal;

import kotlin.Metadata;

/* compiled from: IdCounter.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/squareup/workflow1/internal/IdCounter;", "", "()V", "nextId", "", "createId", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class IdCounter {
    private long nextId;

    public final long createId() {
        long j = this.nextId;
        this.nextId = 1 + j;
        return j;
    }
}
