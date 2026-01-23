package com.robinhood.android.optionsstrategybuilder;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.optionchain.OptionChainDisclosureView;
import com.robinhood.android.optionchain.views.UnderlyingQuoteRowViewHolder;
import com.robinhood.android.optionsstrategybuilder.StrategyChainListAdapter2;
import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowModel;
import com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategyChainListAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/StrategyChainListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView$Callbacks;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/rows/OptionStrategyRowView$Callbacks;)V", "quotePosition", "", "getQuotePosition", "()I", "setQuotePosition", "(I)V", "scrollPosition", "getScrollPosition", "setScrollPosition", "getItemId", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "getItemViewType", "DiffCallback", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class StrategyChainListAdapter extends ListAdapter<StrategyChainListAdapter2, RecyclerView.ViewHolder> {
    public static final int TYPE_DISCLOSURE = 2;
    public static final int TYPE_STRATEGY_ROW = 0;
    public static final int TYPE_UNDERLYING_QUOTE_ROW = 1;
    private final OptionStrategyRowView.Callbacks callbacks;
    private int quotePosition;
    private int scrollPosition;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyChainListAdapter(OptionStrategyRowView.Callbacks callbacks) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.quotePosition = -1;
        this.scrollPosition = -1;
    }

    public final int getQuotePosition() {
        return this.quotePosition;
    }

    public final void setQuotePosition(int i) {
        this.quotePosition = i;
    }

    public final int getScrollPosition() {
        return this.scrollPosition;
    }

    public final void setScrollPosition(int i) {
        this.scrollPosition = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        StrategyChainListAdapter2 item = getItem(position);
        if (item instanceof StrategyChainListAdapter2.StrategyData) {
            return ((StrategyChainListAdapter2.StrategyData) item).getOptionStrategyRowModel().getIdentifier().hashCode();
        }
        if (item instanceof StrategyChainListAdapter2.UnderlyingQuoteData) {
            return Long.MAX_VALUE;
        }
        if (item instanceof StrategyChainListAdapter2.Disclosure) {
            return 9223372036854775806L;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new SimpleViewHolder(OptionStrategyRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 1) {
            return new UnderlyingQuoteRowViewHolder(ViewGroups.inflate$default(parent, C11303R.layout.include_equity_quote_divider, false, 2, null));
        }
        if (viewType == 2) {
            return new SimpleViewHolder(OptionChainDisclosureView.INSTANCE.inflate(parent));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        StrategyChainListAdapter2 item = getItem(position);
        if (item instanceof StrategyChainListAdapter2.StrategyData) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView");
            OptionStrategyRowView optionStrategyRowView = (OptionStrategyRowView) view;
            int i = position + 1;
            optionStrategyRowView.setBottomDividerVisible(!(i < getSize() && getItemViewType(i) == 1));
            optionStrategyRowView.bind(((StrategyChainListAdapter2.StrategyData) item).getOptionStrategyRowModel(), this.callbacks);
            return;
        }
        if (item instanceof StrategyChainListAdapter2.UnderlyingQuoteData) {
            ((UnderlyingQuoteRowViewHolder) holder).setUnderlyingQuote(((StrategyChainListAdapter2.UnderlyingQuoteData) item).getUnderlyingQuote());
        } else if (!(item instanceof StrategyChainListAdapter2.Disclosure)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    /* compiled from: StrategyChainListAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/StrategyChainListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChain;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallback extends DiffUtil.ItemCallback<StrategyChainListAdapter2> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(StrategyChainListAdapter2 oldItem, StrategyChainListAdapter2 newItem) {
            OptionStrategyRowModel optionStrategyRowModel;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof StrategyChainListAdapter2.StrategyData) {
                String identifier = null;
                StrategyChainListAdapter2.StrategyData strategyData = newItem instanceof StrategyChainListAdapter2.StrategyData ? (StrategyChainListAdapter2.StrategyData) newItem : null;
                if (strategyData != null && (optionStrategyRowModel = strategyData.getOptionStrategyRowModel()) != null) {
                    identifier = optionStrategyRowModel.getIdentifier();
                }
                return Intrinsics.areEqual(((StrategyChainListAdapter2.StrategyData) oldItem).getOptionStrategyRowModel().getIdentifier(), identifier);
            }
            if ((oldItem instanceof StrategyChainListAdapter2.UnderlyingQuoteData) || (oldItem instanceof StrategyChainListAdapter2.Disclosure)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(StrategyChainListAdapter2 oldItem, StrategyChainListAdapter2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof StrategyChainListAdapter2.StrategyData) {
                if (newItem instanceof StrategyChainListAdapter2.StrategyData) {
                    return ((StrategyChainListAdapter2.StrategyData) oldItem).getOptionStrategyRowModel().contentsSame(((StrategyChainListAdapter2.StrategyData) newItem).getOptionStrategyRowModel());
                }
                return false;
            }
            if (oldItem instanceof StrategyChainListAdapter2.UnderlyingQuoteData) {
                return (newItem instanceof StrategyChainListAdapter2.UnderlyingQuoteData) && !Intrinsics.areEqual(((StrategyChainListAdapter2.UnderlyingQuoteData) oldItem).getUnderlyingQuote().getCurrentValue(), ((StrategyChainListAdapter2.UnderlyingQuoteData) newItem).getUnderlyingQuote().getCurrentValue());
            }
            if (oldItem instanceof StrategyChainListAdapter2.Disclosure) {
                return newItem instanceof StrategyChainListAdapter2.Disclosure;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
