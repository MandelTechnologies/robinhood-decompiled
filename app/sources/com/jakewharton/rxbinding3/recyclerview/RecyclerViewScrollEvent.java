package com.jakewharton.rxbinding3.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecyclerViewScrollEventObservable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/recyclerview/RecyclerViewScrollEvent;", "", "Landroidx/recyclerview/widget/RecyclerView;", "view", "", "dx", "dy", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", "I", "getDx", "getDy", "rxbinding-recyclerview_release"}, m3637k = 1, m3638mv = {1, 4, 0})
/* loaded from: classes27.dex */
public final /* data */ class RecyclerViewScrollEvent {
    private final int dx;
    private final int dy;
    private final RecyclerView view;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecyclerViewScrollEvent)) {
            return false;
        }
        RecyclerViewScrollEvent recyclerViewScrollEvent = (RecyclerViewScrollEvent) other;
        return Intrinsics.areEqual(this.view, recyclerViewScrollEvent.view) && this.dx == recyclerViewScrollEvent.dx && this.dy == recyclerViewScrollEvent.dy;
    }

    public int hashCode() {
        RecyclerView recyclerView = this.view;
        return ((((recyclerView != null ? recyclerView.hashCode() : 0) * 31) + this.dx) * 31) + this.dy;
    }

    public String toString() {
        return "RecyclerViewScrollEvent(view=" + this.view + ", dx=" + this.dx + ", dy=" + this.dy + ")";
    }

    public RecyclerViewScrollEvent(RecyclerView view, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.view = view;
        this.dx = i;
        this.dy = i2;
    }

    public final int getDy() {
        return this.dy;
    }

    public final RecyclerView getView() {
        return this.view;
    }
}
