package com.robinhood.android.common.view.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoScroller.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0002\u0010\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/view/recyclerview/AutoScroller;", "", "<init>", "()V", "value", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "isScrollingAutomatically", "", "adapterDataObserver", "com/robinhood/android/common/view/recyclerview/AutoScroller$adapterDataObserver$1", "Lcom/robinhood/android/common/view/recyclerview/AutoScroller$adapterDataObserver$1;", "scrollListener", "com/robinhood/android/common/view/recyclerview/AutoScroller$scrollListener$1", "Lcom/robinhood/android/common/view/recyclerview/AutoScroller$scrollListener$1;", "scrollIfNecessary", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AutoScroller {
    public static final int $stable = 8;
    private RecyclerView.Adapter<?> adapter;
    private RecyclerView recyclerView;
    private boolean isScrollingAutomatically = true;
    private final AutoScroller2 adapterDataObserver = new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.common.view.recyclerview.AutoScroller$adapterDataObserver$1
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.this$0.scrollIfNecessary();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            this.this$0.scrollIfNecessary();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount) {
            this.this$0.scrollIfNecessary();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            this.this$0.scrollIfNecessary();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            this.this$0.scrollIfNecessary();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            this.this$0.scrollIfNecessary();
        }
    };
    private final AutoScroller3 scrollListener = new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.common.view.recyclerview.AutoScroller$scrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState == 0) {
                AutoScroller autoScroller = this.this$0;
                autoScroller.isScrollingAutomatically = autoScroller.isScrollingAutomatically || !recyclerView.canScrollVertically(1);
            } else {
                if (newState != 1) {
                    return;
                }
                this.this$0.isScrollingAutomatically = false;
            }
        }
    };

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.scrollListener);
        }
        RecyclerView.Adapter<?> adapter = this.adapter;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.adapterDataObserver);
        }
        this.recyclerView = null;
        this.adapter = null;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.scrollListener);
            RecyclerView.Adapter<?> adapter2 = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter2);
            adapter2.registerAdapterDataObserver(this.adapterDataObserver);
            this.recyclerView = recyclerView;
            this.adapter = adapter2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollIfNecessary() {
        RecyclerView.Adapter<?> adapter;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && (adapter = this.adapter) != null && this.isScrollingAutomatically && adapter.getSize() > 0) {
            recyclerView.smoothScrollToPosition(adapter.getSize() - 1);
        }
    }
}
