package com.squareup.workflow1.internal;

import com.squareup.workflow1.internal.InlineLinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: SideEffectNode.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/internal/SideEffectNode;", "Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "key", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "getJob", "()Lkotlinx/coroutines/Job;", "getKey", "()Ljava/lang/String;", "nextListNode", "getNextListNode", "()Lcom/squareup/workflow1/internal/SideEffectNode;", "setNextListNode", "(Lcom/squareup/workflow1/internal/SideEffectNode;)V", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SideEffectNode implements InlineLinkedList.InlineListNode<SideEffectNode> {
    private final Job job;
    private final String key;
    private SideEffectNode nextListNode;

    public SideEffectNode(String key, Job job) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(job, "job");
        this.key = key;
        this.job = job;
    }

    public final String getKey() {
        return this.key;
    }

    public final Job getJob() {
        return this.job;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList.InlineListNode
    public SideEffectNode getNextListNode() {
        return this.nextListNode;
    }

    @Override // com.squareup.workflow1.internal.InlineLinkedList.InlineListNode
    public void setNextListNode(SideEffectNode sideEffectNode) {
        this.nextListNode = sideEffectNode;
    }
}
