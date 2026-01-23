package com.robinhood.android.common.options.bottomsheet;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetAdapter2;
import com.robinhood.android.common.options.bottomsheet.databinding.IncludeTwoItemRowBinding;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossView;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBottomSheetAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB0\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "lifecycleHost", "Lcom/robinhood/disposer/LifecycleHost;", "fragmentView", "Landroid/view/ViewGroup;", "onRowClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/ui/OptionLegBundle;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lcom/robinhood/disposer/LifecycleHost;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "getOnRowClicked", "()Lkotlin/jvm/functions/Function1;", "onCreateViewHolder", "parent", "viewType", "", "onBindViewHolder", "holder", "position", "getItemViewType", "Companion", "DiffCallback", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionStrategyBottomSheetAdapter extends ListAdapter<OptionStrategyBottomSheetAdapter2, SimpleViewHolder> {
    public static final int TYPE_GREEKS = 2;
    public static final int TYPE_HEADER = 0;
    public static final int TYPE_ROW = 1;
    public static final int TYPE_TWO_ITEM_ROW = 3;
    private final ViewGroup fragmentView;
    private final LifecycleHost lifecycleHost;
    private final Function1<OptionLegBundle, Unit> onRowClicked;

    public final Function1<OptionLegBundle, Unit> getOnRowClicked() {
        return this.onRowClicked;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyBottomSheetAdapter(LifecycleHost lifecycleHost, ViewGroup fragmentView, Function1<? super OptionLegBundle, Unit> onRowClicked) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(lifecycleHost, "lifecycleHost");
        Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        this.lifecycleHost = lifecycleHost;
        this.fragmentView = fragmentView;
        this.onRowClicked = onRowClicked;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new SimpleViewHolder(RdsHeaderRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 1) {
            return new SimpleViewHolder(RdsRowView.INSTANCE.inflate(parent));
        }
        if (viewType != 2) {
            if (viewType == 3) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C11312R.layout.include_two_item_row, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return new SimpleViewHolder(viewInflate);
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View viewInflate2 = ContextSystemServices.getLayoutInflater(context2).inflate(C11312R.layout.include_greeks_with_pl, parent, false);
        OptionsProfitLossView optionsProfitLossView = viewInflate2 instanceof OptionsProfitLossView ? (OptionsProfitLossView) viewInflate2 : null;
        if (optionsProfitLossView != null) {
            optionsProfitLossView.initializeViews(this.fragmentView, this.lifecycleHost);
        }
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "apply(...)");
        return new SimpleViewHolder(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Resources resources = holder.itemView.getResources();
        final OptionStrategyBottomSheetAdapter2 item = getItem(position);
        if (item instanceof OptionStrategyBottomSheetAdapter2.TitleData) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsHeaderRowView");
            RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) view;
            StringResource title = ((OptionStrategyBottomSheetAdapter2.TitleData) item).getTitle();
            Intrinsics.checkNotNull(resources);
            RdsHeaderRowView.bind$default(rdsHeaderRowView, title.getText(resources), false, true, null, null, 26, null);
            return;
        }
        if (item instanceof OptionStrategyBottomSheetAdapter2.RowData) {
            View view2 = holder.itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
            RdsRowView rdsRowView = (RdsRowView) view2;
            rdsRowView.setShowBottomDivider(true);
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionStrategyBottomSheetAdapter.onBindViewHolder$lambda$2$lambda$1(this.f$0, item);
                }
            });
            OptionStrategyBottomSheetAdapter2.RowData rowData = (OptionStrategyBottomSheetAdapter2.RowData) item;
            Resources resources2 = holder.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            SpannedString primaryText = rowData.getPrimaryText(resources2);
            Resources resources3 = holder.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            RdsRowView.bind$default(rdsRowView, primaryText, rowData.getSecondaryText(resources3), rowData.getPriceText(), null, null, 24, null);
            return;
        }
        if (item instanceof OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) {
            View view3 = holder.itemView;
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.trade.options.profitloss.OptionsProfitLossView");
            OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData greeksAndProfitLossData = (OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) item;
            ((OptionsProfitLossView) view3).refreshUi(greeksAndProfitLossData.getAnalysisBtnEnabled(), greeksAndProfitLossData.getAnalysisBtnFragmentKey(), greeksAndProfitLossData.getProfitLossChartParams());
            return;
        }
        if (!(item instanceof OptionStrategyBottomSheetAdapter2.TwoItemRowData)) {
            throw new NoWhenBranchMatchedException();
        }
        IncludeTwoItemRowBinding includeTwoItemRowBindingBind = IncludeTwoItemRowBinding.bind(holder.itemView);
        RhTextView rhTextView = includeTwoItemRowBindingBind.headerRowPrimaryText;
        OptionStrategyBottomSheetAdapter2.TwoItemRowData twoItemRowData = (OptionStrategyBottomSheetAdapter2.TwoItemRowData) item;
        StringResource primaryText2 = twoItemRowData.getPrimaryText();
        Intrinsics.checkNotNull(resources);
        rhTextView.setText(primaryText2.getText(resources));
        RhTextView headerRowSecondaryText = includeTwoItemRowBindingBind.headerRowSecondaryText;
        Intrinsics.checkNotNullExpressionValue(headerRowSecondaryText, "headerRowSecondaryText");
        StringResource secondaryText = twoItemRowData.getSecondaryText();
        TextViewsKt.setVisibilityText(headerRowSecondaryText, secondaryText != null ? secondaryText.getText(resources) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(OptionStrategyBottomSheetAdapter optionStrategyBottomSheetAdapter, OptionStrategyBottomSheetAdapter2 optionStrategyBottomSheetAdapter2) {
        optionStrategyBottomSheetAdapter.onRowClicked.invoke(((OptionStrategyBottomSheetAdapter2.RowData) optionStrategyBottomSheetAdapter2).getLeg());
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    /* compiled from: OptionStrategyBottomSheetAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallback extends DiffUtil.ItemCallback<OptionStrategyBottomSheetAdapter2> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(OptionStrategyBottomSheetAdapter2 oldItem, OptionStrategyBottomSheetAdapter2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.TitleData) {
                return Intrinsics.areEqual(newItem, oldItem);
            }
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.RowData) {
                OptionStrategyBottomSheetAdapter2.RowData rowData = newItem instanceof OptionStrategyBottomSheetAdapter2.RowData ? (OptionStrategyBottomSheetAdapter2.RowData) newItem : null;
                return Intrinsics.areEqual(rowData != null ? rowData.getLeg() : null, ((OptionStrategyBottomSheetAdapter2.RowData) oldItem).getLeg());
            }
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) {
                return newItem instanceof OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData;
            }
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.TwoItemRowData) {
                return newItem instanceof OptionStrategyBottomSheetAdapter2.TwoItemRowData;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(OptionStrategyBottomSheetAdapter2 oldItem, OptionStrategyBottomSheetAdapter2 newItem) {
            ClientAggregateOptionStrategyQuote optionQuote;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.TitleData) {
                OptionStrategyBottomSheetAdapter2.TitleData titleData = newItem instanceof OptionStrategyBottomSheetAdapter2.TitleData ? (OptionStrategyBottomSheetAdapter2.TitleData) newItem : null;
                return Intrinsics.areEqual(titleData != null ? titleData.getTitle() : null, ((OptionStrategyBottomSheetAdapter2.TitleData) oldItem).getTitle());
            }
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.RowData) {
                OptionStrategyBottomSheetAdapter2.RowData rowData = newItem instanceof OptionStrategyBottomSheetAdapter2.RowData ? (OptionStrategyBottomSheetAdapter2.RowData) newItem : null;
                return Intrinsics.areEqual(rowData != null ? rowData.getQuote() : null, ((OptionStrategyBottomSheetAdapter2.RowData) oldItem).getQuote());
            }
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) {
                boolean z = newItem instanceof OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData;
                OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData greeksAndProfitLossData = z ? (OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) newItem : null;
                OptionQuoteAggregator.Greeks greeks = (greeksAndProfitLossData == null || (optionQuote = greeksAndProfitLossData.getOptionQuote()) == null) ? null : optionQuote.getGreeks();
                OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData greeksAndProfitLossData2 = (OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) oldItem;
                ClientAggregateOptionStrategyQuote optionQuote2 = greeksAndProfitLossData2.getOptionQuote();
                if (!Intrinsics.areEqual(greeks, optionQuote2 != null ? optionQuote2.getGreeks() : null)) {
                    return false;
                }
                OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData greeksAndProfitLossData3 = z ? (OptionStrategyBottomSheetAdapter2.GreeksAndProfitLossData) newItem : null;
                return Intrinsics.areEqual(greeksAndProfitLossData3 != null ? greeksAndProfitLossData3.getProfitLossChartParams() : null, greeksAndProfitLossData2.getProfitLossChartParams());
            }
            if (oldItem instanceof OptionStrategyBottomSheetAdapter2.TwoItemRowData) {
                return Intrinsics.areEqual(newItem, oldItem);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
