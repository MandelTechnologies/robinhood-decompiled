package com.robinhood.android.lists.util;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScrollPositionManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lists/util/ScrollPositionManager;", "", "<init>", "()V", "scrollStates", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "onViewRecycled", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onBindViewHolder", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ScrollPositionManager {
    public static final int $stable = 8;
    private final SparseArray<Parcelable> scrollStates = new SparseArray<>();

    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        KeyEvent.Callback itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (itemView instanceof ScrollPositionSavable) {
            RecyclerView.LayoutManager layoutManager = ((ScrollPositionSavable) itemView).getRecyclerView().getLayoutManager();
            Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            if (parcelableOnSaveInstanceState != null) {
                this.scrollStates.put(holder.getLayoutPosition(), parcelableOnSaveInstanceState);
            }
        }
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        KeyEvent.Callback itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (itemView instanceof ScrollPositionSavable) {
            final Parcelable parcelable = this.scrollStates.get(holder.getLayoutPosition());
            final RecyclerView recyclerView = ((ScrollPositionSavable) itemView).getRecyclerView();
            OneShotPreDrawListener.add(recyclerView, new Runnable() { // from class: com.robinhood.android.lists.util.ScrollPositionManager$onBindViewHolder$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (parcelable == null) {
                        recyclerView.scrollToPosition(0);
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.onRestoreInstanceState(parcelable);
                    }
                }
            });
        }
    }
}
