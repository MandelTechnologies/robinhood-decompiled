package com.robinhood.android.common.search;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhSearchAdapter.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/search/RhSearchAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/search/SearchItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/common/search/RhSearchAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/common/search/RhSearchAdapter$Callbacks;)V", "getItemViewType", "", "position", "onCreateViewHolder", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "bindHeaderWithIcon", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/common/search/SearchItem$SearchHeaderWithIcon;", "bindDisclaimer", "Lcom/robinhood/android/common/search/SearchItem$Disclaimer;", "bindLearnMoreRowView", "Lcom/robinhood/android/common/search/SearchItem$SearchLearnMoreRow;", "Callbacks", "DiffCallback", "Companion", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RhSearchAdapter extends ListAdapter<SearchItem, RecyclerView.ViewHolder> {
    public static final int TYPE_CRYPTO = 3;
    public static final int TYPE_CRYPTO_HOLDING = 3;
    public static final int TYPE_DISCLAIMER = 6;
    public static final int TYPE_HEADER = 0;
    public static final int TYPE_HEADER_WITH_ICON = 5;
    public static final int TYPE_INSTRUMENT = 2;
    public static final int TYPE_INSTRUMENT_POSITION = 1;
    public static final int TYPE_LEARN_MORE_ROW = 4;
    public static final int TYPE_RUR_SAVINGS = 7;
    private final Callbacks callbacks;
    public static final int $stable = 8;

    /* compiled from: RhSearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/search/RhSearchAdapter$Callbacks;", "", "onItemClicked", "", "searchItem", "Lcom/robinhood/android/common/search/SearchItem;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onItemClicked(SearchItem searchItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhSearchAdapter(Callbacks callbacks) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 0:
                return new SimpleViewHolder(RdsHeaderRowView.INSTANCE.inflate(parent));
            case 1:
            case 2:
            case 3:
            case 7:
                return new SimpleViewHolder(RdsRowView.INSTANCE.inflate(parent));
            case 4:
            case 6:
                return new SimpleViewHolder(ViewGroups.inflate$default(parent, C11798R.layout.search_learn_more_row_view, false, 2, null));
            case 5:
                return new SimpleViewHolder(ViewGroups.inflate$default(parent, C11798R.layout.search_header_with_icon_view, false, 2, null));
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) throws Resources.NotFoundException {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SearchItem item = getItem(position);
        if (item instanceof SearchItem.SearchHeaderWithIcon) {
            bindHeaderWithIcon((SearchItem.SearchHeaderWithIcon) item, holder);
        } else if (item instanceof SearchItem.SearchHeader) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsHeaderRowView");
            RdsHeaderRowViewExtensions.bindHeader((RdsHeaderRowView) view, (SearchItem.SearchHeader) item);
        } else {
            if (item instanceof SearchItem.InstrumentResult) {
                SearchItem.InstrumentResult instrumentResult = (SearchItem.InstrumentResult) item;
                drawable = instrumentResult.isChecked() ? holder.itemView.getResources().getDrawable(C20690R.drawable.ic_rds_bubble_checked_12dp) : null;
                View view2 = holder.itemView;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
                RdsRowViewExtensions.bindInstrumentResult((RdsRowView) view2, instrumentResult, drawable);
            } else if (item instanceof SearchItem.InstrumentPositionResult) {
                SearchItem.InstrumentPositionResult instrumentPositionResult = (SearchItem.InstrumentPositionResult) item;
                drawable = instrumentPositionResult.isChecked() ? holder.itemView.getResources().getDrawable(C20690R.drawable.ic_rds_bubble_checked_12dp) : null;
                View view3 = holder.itemView;
                Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
                RdsRowViewExtensions.bindInstrumentPositionResult((RdsRowView) view3, instrumentPositionResult, drawable);
            } else if (item instanceof SearchItem.CryptoHoldingResult) {
                View view4 = holder.itemView;
                Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
                RdsRowViewExtensions.bindCryptoHoldingResult((RdsRowView) view4, (SearchItem.CryptoHoldingResult) item);
            } else if (item instanceof SearchItem.CryptoResult) {
                View view5 = holder.itemView;
                Intrinsics.checkNotNull(view5, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
                RdsRowViewExtensions.bindCryptoResult((RdsRowView) view5, (SearchItem.CryptoResult) item);
            } else if (item instanceof SearchItem.SearchLearnMoreRow) {
                bindLearnMoreRowView((SearchItem.SearchLearnMoreRow) item, holder);
            } else if (item instanceof SearchItem.Disclaimer) {
                bindDisclaimer((SearchItem.Disclaimer) item, holder);
            } else {
                if (!(item instanceof SearchItem.RurSavingsChoice)) {
                    throw new NoWhenBranchMatchedException();
                }
                View view6 = holder.itemView;
                Intrinsics.checkNotNull(view6, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
                RdsRowViewExtensions.bindRurSavingsRow((RdsRowView) view6, (SearchItem.RurSavingsChoice) item);
            }
        }
        if ((item instanceof SearchItem.SearchHeader) || (item instanceof SearchItem.SearchLearnMoreRow)) {
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.common.search.RhSearchAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhSearchAdapter.onBindViewHolder$lambda$0(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(RhSearchAdapter rhSearchAdapter, SearchItem searchItem) {
        rhSearchAdapter.callbacks.onItemClicked(searchItem);
        return Unit.INSTANCE;
    }

    private final void bindHeaderWithIcon(final SearchItem.SearchHeaderWithIcon item, RecyclerView.ViewHolder holder) {
        ((RhTextView) holder.itemView.findViewById(C11798R.id.header_text)).setText(holder.itemView.getResources().getText(item.getHeaderTextRes()));
        ImageView imageView = (ImageView) holder.itemView.findViewById(C11798R.id.header_icon);
        imageView.setImageDrawable(holder.itemView.getResources().getDrawable(item.getIconAsset().getResourceId()));
        Intrinsics.checkNotNull(imageView);
        OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.common.search.RhSearchAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhSearchAdapter.bindHeaderWithIcon$lambda$3$lambda$2(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindHeaderWithIcon$lambda$3$lambda$2(RhSearchAdapter rhSearchAdapter, SearchItem.SearchHeaderWithIcon searchHeaderWithIcon) {
        rhSearchAdapter.callbacks.onItemClicked(searchHeaderWithIcon);
        return Unit.INSTANCE;
    }

    private final void bindDisclaimer(final SearchItem.Disclaimer item, RecyclerView.ViewHolder holder) throws Resources.NotFoundException {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        CharSequence text = holder.itemView.getResources().getText(item.getMessageRes());
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        TextViewsKt.setTextWithLearnMore((TextView) view, text, false, false, holder.itemView.getResources().getString(item.getButtonTextRes()), (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.search.RhSearchAdapter$bindDisclaimer$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.callbacks.onItemClicked(item);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    private final void bindLearnMoreRowView(final SearchItem.SearchLearnMoreRow item, RecyclerView.ViewHolder holder) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        Resources resources = holder.itemView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ((RhTextView) view).setText(LearnMoresKt.buildTextWithLearnMore$default(resources, item.getLearnMoreStr(), false, null, false, item.getLearnMoreBtnStr(), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.search.RhSearchAdapter$bindLearnMoreRowView$$inlined$buildTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.callbacks.onItemClicked(item);
            }
        }, 1, (DefaultConstructorMarker) null), 4, null));
    }

    /* compiled from: RhSearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/search/RhSearchAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/common/search/SearchItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<SearchItem> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(SearchItem oldItem, SearchItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (newItem.getViewType() != oldItem.getViewType()) {
                return false;
            }
            return oldItem.areItemsTheSame(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(SearchItem oldItem, SearchItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.areContentsTheSame(newItem);
        }
    }
}
