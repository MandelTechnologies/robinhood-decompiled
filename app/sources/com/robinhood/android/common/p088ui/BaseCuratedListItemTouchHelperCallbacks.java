package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCuratedListItemTouchHelperCallbacks.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nH&J\u0006\u0010\u001a\u001a\u00020\nJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eJ>\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\nJ\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0004J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u0014H\u0002J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseCuratedListItemTouchHelperCallbacks;", "T", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "adapter", "Landroidx/recyclerview/widget/ListAdapter;", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/ListAdapter;)V", "enableLongPress", "", "getEnableLongPress", "()Z", "setEnableLongPress", "(Z)V", "isEmptyList", "setEmptyList", "watchlistSwipeHelper", "Lcom/robinhood/android/common/ui/WatchlistSwipeHelper;", "getMovementFlags", "", "view", "Landroid/view/View;", "showDivider", "", "show", "isLongPressDragEnabled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "from", "target", "onChildDraw", "c", "Landroid/graphics/Canvas;", "dX", "", "dY", "actionState", "isCurrentlyActive", "clearBackground", "onMoveChildDraw", "onRightSwipeStarted", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseCuratedListItemTouchHelperCallbacks<T> extends ItemTouchHelper.Callback {
    private final ListAdapter<T, ?> adapter;
    private final WatchlistSwipeHelper watchlistSwipeHelper;

    public abstract boolean getEnableLongPress();

    public abstract int getMovementFlags(View view);

    public abstract boolean isEmptyList();

    protected void onRightSwipeStarted(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public abstract void setEmptyList(boolean z);

    public abstract void setEnableLongPress(boolean z);

    public abstract void showDivider(View view, boolean show);

    public BaseCuratedListItemTouchHelperCallbacks(Context context, ListAdapter<T, ?> adapter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
        this.watchlistSwipeHelper = new WatchlistSwipeHelper(context);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isLongPressDragEnabled() {
        return getEnableLongPress();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return getMovementFlags(itemView);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder from, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(target, "target");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        CompositeAdapter compositeAdapter = adapter instanceof CompositeAdapter ? (CompositeAdapter) adapter : null;
        int firstItemPositionOf = compositeAdapter != null ? compositeAdapter.getFirstItemPositionOf(this.adapter) : 0;
        int bindingAdapterPosition = from.getBindingAdapterPosition() - firstItemPositionOf;
        int bindingAdapterPosition2 = target.getBindingAdapterPosition() - firstItemPositionOf;
        List<T> currentList = this.adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        List<T> mutableList = CollectionsKt.toMutableList((Collection) currentList);
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= mutableList.size() || bindingAdapterPosition2 < 0 || bindingAdapterPosition2 >= mutableList.size()) {
            return false;
        }
        mutableList.add(bindingAdapterPosition2, mutableList.remove(bindingAdapterPosition));
        this.adapter.submitList(mutableList);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        if (actionState != 1) {
            if (actionState == 2 && isCurrentlyActive) {
                onMoveChildDraw(viewHolder, actionState);
                return;
            }
            return;
        }
        if (!isEmptyList() && dX < 0.0f) {
            WatchlistSwipeHelper.drawBackgroundWithEndLabel$default(this.watchlistSwipeHelper, viewHolder, c, dX, 0, 0, 0, null, 120, null);
        }
        if (isEmptyList() || dX <= 0.0f) {
            return;
        }
        onRightSwipeStarted(viewHolder);
        WatchlistSwipeHelper.drawBackgroundWithStartLabel$default(this.watchlistSwipeHelper, viewHolder, c, dX, 0, 0, 0, 56, null);
    }

    protected final void clearBackground(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(C11222R.id.item_touch_helper_previous_background);
        if (tag instanceof Optional) {
            view.setBackground((Drawable) ((Optional) tag).getOrNull());
        }
        view.setTag(C11222R.id.item_touch_helper_previous_background, null);
        showDivider(view, true);
    }

    private final void onMoveChildDraw(RecyclerView.ViewHolder viewHolder, int actionState) {
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (itemView.getTag(C11222R.id.item_touch_helper_previous_background) == null) {
            itemView.setTag(C11222R.id.item_touch_helper_previous_background, Optional3.asOptional(itemView.getBackground()));
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            itemView.setBackgroundColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
            if (actionState == 2) {
                View itemView2 = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                showDivider(itemView2, false);
            }
        }
    }
}
