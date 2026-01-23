package com.robinhood.android.advanced.chart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.common.p088ui.WatchlistSwipeHelper;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartIndicatorListItemTouchHelperCallbacks.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0090\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u00126\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0016J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\rH\u0016J@\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0013H\u0016J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u000200H\u0002R\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartIndicatorListItemTouchHelperCallbacks;", "T", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "adapter", "Landroidx/recyclerview/widget/ListAdapter;", "onItemDropped", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "id", "", "newPosition", "", "onItemSwiped", "Lkotlin/Function1;", "enableLongPress", "", "disableLastItemSwipe", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/ListAdapter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ZZ)V", "watchlistSwipeHelper", "Lcom/robinhood/android/common/ui/WatchlistSwipeHelper;", "isLongPressDragEnabled", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "from", "target", "onSwiped", "direction", "onChildDraw", "c", "Landroid/graphics/Canvas;", "dX", "", "dY", "actionState", "isCurrentlyActive", "clearView", "drawBackground", "clearBackground", "view", "Landroid/view/View;", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedChartIndicatorListItemTouchHelperCallbacks<T> extends ItemTouchHelper.Callback {
    private final ListAdapter<T, ?> adapter;
    private final boolean disableLastItemSwipe;
    private final boolean enableLongPress;
    private final Function2<String, Integer, Unit> onItemDropped;
    private final Function1<String, Unit> onItemSwiped;
    private final WatchlistSwipeHelper watchlistSwipeHelper;

    public /* synthetic */ AdvancedChartIndicatorListItemTouchHelperCallbacks(Context context, ListAdapter listAdapter, Function2 function2, Function1 function1, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, listAdapter, function2, function1, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedChartIndicatorListItemTouchHelperCallbacks(Context context, ListAdapter<T, ?> adapter, Function2<? super String, ? super Integer, Unit> onItemDropped, Function1<? super String, Unit> onItemSwiped, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(onItemDropped, "onItemDropped");
        Intrinsics.checkNotNullParameter(onItemSwiped, "onItemSwiped");
        this.adapter = adapter;
        this.onItemDropped = onItemDropped;
        this.onItemSwiped = onItemSwiped;
        this.enableLongPress = z;
        this.disableLastItemSwipe = z2;
        this.watchlistSwipeHelper = new WatchlistSwipeHelper(context);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: isLongPressDragEnabled, reason: from getter */
    public boolean getEnableLongPress() {
        return this.enableLongPress;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.disableLastItemSwipe && viewHolder.getBindingAdapterPosition() == this.adapter.getSize()) {
            return 0;
        }
        return ItemTouchHelper.Callback.makeMovementFlags(3, 16);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder from, RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(target, "target");
        int bindingAdapterPosition = from.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
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
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        String id;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        KeyEvent.Callback callback = viewHolder.itemView;
        IndicatorListItemView indicatorListItemView = callback instanceof IndicatorListItemView ? (IndicatorListItemView) callback : null;
        if (indicatorListItemView == null || (id = indicatorListItemView.getId()) == null) {
            return;
        }
        this.onItemSwiped.invoke(id);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        if (actionState == 1 && dX < 0.0f) {
            WatchlistSwipeHelper.drawBackgroundWithEndLabel$default(this.watchlistSwipeHelper, viewHolder, c, dX, 0, 0, 0, null, 120, null);
        } else if (actionState == 2 && isCurrentlyActive) {
            drawBackground(viewHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        View itemView = viewHolder.itemView;
        IndicatorListItemView indicatorListItemView = itemView instanceof IndicatorListItemView ? (IndicatorListItemView) itemView : null;
        if (indicatorListItemView == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        clearBackground(itemView);
        this.onItemDropped.invoke(indicatorListItemView.getId(), Integer.valueOf(viewHolder.getBindingAdapterPosition()));
    }

    private final void drawBackground(RecyclerView.ViewHolder viewHolder) {
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (itemView.getTag(C11222R.id.item_touch_helper_previous_background) == null) {
            itemView.setTag(C11222R.id.item_touch_helper_previous_background, Optional3.asOptional(itemView.getBackground()));
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            itemView.setBackgroundColor(ThemeColors.getThemeColor(context, C20690R.attr.colorBackground1));
        }
    }

    private final void clearBackground(View view) {
        Object tag = view.getTag(C11222R.id.item_touch_helper_previous_background);
        if (tag instanceof Optional) {
            view.setBackground((Drawable) ((Optional) tag).getOrNull());
        }
        view.setTag(C11222R.id.item_touch_helper_previous_background, null);
    }
}
