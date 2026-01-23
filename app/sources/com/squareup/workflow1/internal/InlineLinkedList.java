package com.squareup.workflow1.internal;

import com.squareup.workflow1.internal.InlineLinkedList.InlineListNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InlineLinkedList.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0005R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/squareup/workflow1/internal/InlineLinkedList;", "Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "T", "", "<init>", "()V", "node", "", "plusAssign", "(Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;)V", "clear", "head", "Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "getHead", "()Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "setHead", "tail", "getTail", "setTail", "InlineListNode", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class InlineLinkedList<T extends InlineListNode<T>> {
    private T head;
    private T tail;

    /* compiled from: InlineLinkedList.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "T", "", "nextListNode", "getNextListNode", "()Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;", "setNextListNode", "(Lcom/squareup/workflow1/internal/InlineLinkedList$InlineListNode;)V", "wf1-workflow-runtime"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public interface InlineListNode<T extends InlineListNode<T>> {
        T getNextListNode();

        void setNextListNode(T t);
    }

    public final T getHead() {
        return this.head;
    }

    public final void setHead(T t) {
        this.head = t;
    }

    public final T getTail() {
        return this.tail;
    }

    public final void setTail(T t) {
        this.tail = t;
    }

    public final void plusAssign(T node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.getNextListNode() != null) {
            throw new IllegalArgumentException("Expected node to not be linked.");
        }
        T t = this.tail;
        if (t != null) {
            setTail(node);
            t.setNextListNode(node);
        } else {
            if (this.head != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.head = node;
            this.tail = node;
        }
    }

    public final void clear() {
        this.head = null;
        this.tail = null;
    }
}
