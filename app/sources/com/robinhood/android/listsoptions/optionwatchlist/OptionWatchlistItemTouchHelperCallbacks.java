package com.robinhood.android.listsoptions.optionwatchlist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.common.views.OptionStrategyRowView;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistItemTouchHelperCallbacks.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Br\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00126\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0015H\u0016R>\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistItemTouchHelperCallbacks;", "Lcom/robinhood/android/common/ui/BaseCuratedListItemTouchHelperCallbacks;", "Lcom/robinhood/models/ui/OptionStrategyCuratedListEligible;", "context", "Landroid/content/Context;", "activeItemsAdapter", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter;", "onItemDropped", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "strategyCode", "", "position", "", "onItemRemoved", "Lkotlin/Function1;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "_", "", "enableLongPress", "getEnableLongPress", "()Z", "setEnableLongPress", "(Z)V", "isEmptyList", "setEmptyList", "getMovementFlags", "view", "Landroid/view/View;", "onSwiped", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "direction", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showDivider", "show", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionWatchlistItemTouchHelperCallbacks extends BaseCuratedListItemTouchHelperCallbacks<OptionStrategyCuratedListEligible> {
    private final Function2<String, Integer, Unit> onItemDropped;
    private final Function1<String, Unit> onItemRemoved;

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public boolean getEnableLongPress() {
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public boolean isEmptyList() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public void setEmptyList(boolean z) {
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public void setEnableLongPress(boolean z) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionWatchlistItemTouchHelperCallbacks(Context context, OptionWatchlistHubContentAdapter activeItemsAdapter, Function2<? super String, ? super Integer, Unit> onItemDropped, Function1<? super String, Unit> onItemRemoved) {
        super(context, activeItemsAdapter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activeItemsAdapter, "activeItemsAdapter");
        Intrinsics.checkNotNullParameter(onItemDropped, "onItemDropped");
        Intrinsics.checkNotNullParameter(onItemRemoved, "onItemRemoved");
        this.onItemDropped = onItemDropped;
        this.onItemRemoved = onItemRemoved;
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public int getMovementFlags(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof OptionStrategyRowView) {
            if (!((OptionStrategyRowView) view).getIsExpired()) {
                return ItemTouchHelper.Callback.makeMovementFlags(3, 16);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(0, 16);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        String strategyCode;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        OptionStrategyRowView optionStrategyRowView = view instanceof OptionStrategyRowView ? (OptionStrategyRowView) view : null;
        if (optionStrategyRowView == null || (strategyCode = optionStrategyRowView.getStrategyCode()) == null) {
            return;
        }
        this.onItemRemoved.invoke(strategyCode);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        View view = viewHolder.itemView;
        OptionStrategyRowView optionStrategyRowView = view instanceof OptionStrategyRowView ? (OptionStrategyRowView) view : null;
        if (optionStrategyRowView == null) {
            return;
        }
        Object tag = optionStrategyRowView.getTag(C11222R.id.item_touch_helper_previous_background);
        if (tag instanceof Optional) {
            optionStrategyRowView.setBackground((Drawable) ((Optional) tag).getOrNull());
        }
        optionStrategyRowView.setTag(C11222R.id.item_touch_helper_previous_background, null);
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        showDivider(itemView, true);
        this.onItemDropped.invoke(optionStrategyRowView.getStrategyCode(), Integer.valueOf(viewHolder.getBindingAdapterPosition()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseCuratedListItemTouchHelperCallbacks
    public void showDivider(View view, boolean show) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof BaseInstrumentRowView) {
            ((BaseInstrumentRowView) view).showDivider(show);
        }
    }
}
