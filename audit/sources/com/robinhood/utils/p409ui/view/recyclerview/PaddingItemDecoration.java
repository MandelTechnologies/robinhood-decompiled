package com.robinhood.utils.p409ui.view.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaddingItemDecoration.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\tH\u0014J\u001c\u0010\r\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\tH\u0014J\u001c\u0010\u000e\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\tH\u0014J\u001c\u0010\u000f\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\tH\u0014J&\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "<init>", "()V", "setDefaultPadding", "", "outRect", "Landroid/graphics/Rect;", "getLeftPadding", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "getTopPadding", "getRightPadding", "getBottomPadding", "getItemOffsets", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class PaddingItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    protected int getBottomPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getLeftPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getTopPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected void setDefaultPadding(Rect outRect) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        outRect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        setDefaultPadding(outRect);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            childAdapterPosition = parent.getChildViewHolder(view).getOldPosition();
        }
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        if (childAdapterPosition >= adapter.getSize()) {
            return;
        }
        int leftPadding = getLeftPadding(adapter, childAdapterPosition);
        int topPadding = getTopPadding(adapter, childAdapterPosition);
        int rightPadding = getRightPadding(adapter, childAdapterPosition);
        int bottomPadding = getBottomPadding(adapter, childAdapterPosition);
        outRect.left = leftPadding;
        outRect.top = topPadding;
        outRect.right = rightPadding;
        outRect.bottom = bottomPadding;
    }
}
