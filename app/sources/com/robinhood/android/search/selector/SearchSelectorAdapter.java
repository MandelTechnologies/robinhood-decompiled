package com.robinhood.android.search.selector;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.selector.SearchSelectorViewState3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchSelectorAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/search/selector/SearchItem;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "onSearchItemClick", "Lkotlin/Function2;", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getOnSearchItemClick", "()Lkotlin/jvm/functions/Function2;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "getHeaderTopPadding", "resources", "Landroid/content/res/Resources;", "DiffCallbacks", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchSelectorAdapter extends ListAdapter<SearchSelectorViewState3, SimpleViewHolder> {
    private final Function2<SearchSelectorViewState3.SecurityRow, Component.ComponentType, Unit> onSearchItemClick;

    public final Function2<SearchSelectorViewState3.SecurityRow, Component.ComponentType, Unit> getOnSearchItemClick() {
        return this.onSearchItemClick;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchSelectorAdapter(Function2<? super SearchSelectorViewState3.SecurityRow, ? super Component.ComponentType, Unit> onSearchItemClick) {
        super(DiffCallbacks.INSTANCE);
        Intrinsics.checkNotNullParameter(onSearchItemClick, "onSearchItemClick");
        this.onSearchItemClick = onSearchItemClick;
    }

    /* compiled from: SearchSelectorAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorAdapter$DiffCallbacks;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/search/selector/SearchItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallbacks extends DiffUtil.ItemCallback<SearchSelectorViewState3> {
        public static final DiffCallbacks INSTANCE = new DiffCallbacks();

        private DiffCallbacks() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(SearchSelectorViewState3 oldItem, SearchSelectorViewState3 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isTheSameAs(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(SearchSelectorViewState3 oldItem, SearchSelectorViewState3 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SearchSelectorViewState3 item = getItem(position);
        if (item instanceof SearchSelectorViewState3.Header) {
            return 0;
        }
        if (item instanceof SearchSelectorViewState3.SecurityRow) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C28142R.layout.include_search_header_view, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SimpleViewHolder(viewInflate);
        }
        if (viewType == 1) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(C28142R.layout.row_view_search_result, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new SimpleViewHolder(viewInflate2);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SearchSelectorViewState3 item = getItem(position);
        if (item instanceof SearchSelectorViewState3.Header) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            RhTextView rhTextView = (RhTextView) view;
            rhTextView.setText(((SearchSelectorViewState3.Header) item).getDisplayName());
            Resources resources = rhTextView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ViewsKt.setTopPadding(rhTextView, getHeaderTopPadding(resources, position));
            return;
        }
        if (!(item instanceof SearchSelectorViewState3.SecurityRow)) {
            throw new NoWhenBranchMatchedException();
        }
        View view2 = holder.itemView;
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
        RdsRowView rdsRowView = (RdsRowView) view2;
        SearchSelectorViewState3.SecurityRow securityRow = (SearchSelectorViewState3.SecurityRow) item;
        rdsRowView.setPrimaryText(securityRow.getDisplayName());
        rdsRowView.setSecondaryText(securityRow.getSymbol());
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.search.selector.SearchSelectorAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchSelectorAdapter.onBindViewHolder$lambda$2$lambda$1(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(SearchSelectorAdapter searchSelectorAdapter, SearchSelectorViewState3 searchSelectorViewState3) {
        searchSelectorAdapter.onSearchItemClick.invoke(searchSelectorViewState3, Component.ComponentType.SEARCH_RESULT_ROW);
        return Unit.INSTANCE;
    }

    private final int getHeaderTopPadding(Resources resources, int position) {
        if (position == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
    }
}
