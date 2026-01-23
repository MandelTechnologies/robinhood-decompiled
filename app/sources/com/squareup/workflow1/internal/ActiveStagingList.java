package com.squareup.workflow1.internal;

import com.squareup.workflow1.internal.InlineLinkedList;
import com.squareup.workflow1.internal.InlineLinkedList.InlineListNode;
import kotlin.Metadata;

/* compiled from: ActiveStagingList.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/squareup/workflow1/internal/ActiveStagingList;", "Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "T", "", "<init>", "()V", "Lcom/squareup/workflow1/internal/InlineLinkedList;", "active", "Lcom/squareup/workflow1/internal/InlineLinkedList;", "staging", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ActiveStagingList<T extends InlineLinkedList.InlineListNode<T>> {
    private InlineLinkedList<T> active = new InlineLinkedList<>();
    private InlineLinkedList<T> staging = new InlineLinkedList<>();
}
