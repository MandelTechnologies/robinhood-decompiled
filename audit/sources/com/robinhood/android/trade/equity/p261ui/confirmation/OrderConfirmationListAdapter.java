package com.robinhood.android.trade.equity.p261ui.confirmation;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem2;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowView;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfirmationListAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRow;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "<init>", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderConfirmationListAdapter extends ListAdapter<OrderConfirmationRowItem2, GenericViewHolder<? extends View>> {
    private static final int simpleOrderRowType = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final DiffUtil.ItemCallback<OrderConfirmationRowItem2> diff = new DiffUtil.ItemCallback<OrderConfirmationRowItem2>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationListAdapter$Companion$diff$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(OrderConfirmationRowItem2 oldItem, OrderConfirmationRowItem2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(OrderConfirmationRowItem2 oldItem, OrderConfirmationRowItem2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return areItemsTheSame(oldItem, newItem);
        }
    };

    public OrderConfirmationListAdapter() {
        super(diff);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != 1) {
            throw new IllegalArgumentException("Unknown row type");
        }
        return new GenericViewHolder<>(OrderConfirmationRowView.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OrderConfirmationRowItem2 item = getItem(position);
        View view = holder.getView();
        if (view instanceof OrderConfirmationRowView) {
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.lib.trade.view.OrderConfirmationRowItem");
            ((OrderConfirmationRowView) view).bind((OrderConfirmationRowItem) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (getItem(position) instanceof OrderConfirmationRowItem) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: OrderConfirmationListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationListAdapter$Companion;", "", "<init>", "()V", "diff", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRow;", "getDiff", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "simpleOrderRowType", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiffUtil.ItemCallback<OrderConfirmationRowItem2> getDiff() {
            return OrderConfirmationListAdapter.diff;
        }
    }
}
