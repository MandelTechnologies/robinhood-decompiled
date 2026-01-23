package com.robinhood.android.search.search;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.SearchItem;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchAdapter.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J \u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/search/search/SearchItem;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "callbacks", "Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;)V", "curatedListChips", "", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "getCuratedListChips", "()Ljava/util/List;", "listChipsCount", "", "getListChipsCount", "()I", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "bindSearchRowView", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/search/search/SearchItem$SecurityRow;", "bindCuratedListCarousel", "Lcom/robinhood/android/search/search/SearchItem$CuratedListCarousel;", "bindDeeplinkRow", "Lcom/robinhood/android/search/search/SearchItem$DeeplinkRow;", "bindEducationRow", "Lcom/robinhood/android/search/search/SearchItem$EducationRow;", "bindHeader", "Lcom/robinhood/android/search/search/SearchItem$Header;", "bindHeaderWithAction", "Lcom/robinhood/android/search/search/SearchItem$HeaderWithAction;", "getHeaderTopPadding", "resources", "Landroid/content/res/Resources;", "getItem", "DiffCallbacks", "Callbacks", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchAdapter extends ListAdapter<SearchItem, SimpleViewHolder> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: SearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "", "onListChipsRecyclerViewCreated", "", "recyclerView", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "onSecurityClicked", "security", "Lcom/robinhood/models/db/Security;", "isAlreadyInUserList", "", "onAddToWatchlistClicked", "onRemoveFromWatchlistClicked", "onCuratedListChipItemClicked", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "position", "", "onDeeplinkClicked", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/search/search/SearchItem$DeeplinkRow;", "onEducationClicked", "Lcom/robinhood/android/search/search/SearchItem$EducationRow;", "onHeaderWithActionClicked", "uri", "Landroid/net/Uri;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddToWatchlistClicked(Security security, boolean isAlreadyInUserList);

        void onCuratedListChipItemClicked(CuratedListChipItem data, int position);

        void onDeeplinkClicked(SearchItem.DeeplinkRow item);

        void onEducationClicked(SearchItem.EducationRow item);

        void onHeaderWithActionClicked(Uri uri);

        void onListChipsRecyclerViewCreated(CuratedListChipRecyclerView recyclerView);

        void onRemoveFromWatchlistClicked(Security security);

        void onSecurityClicked(Security security, boolean isAlreadyInUserList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAdapter(Callbacks callbacks) {
        super(DiffCallbacks.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    /* compiled from: SearchAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchAdapter$DiffCallbacks;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/search/search/SearchItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallbacks extends DiffUtil.ItemCallback<SearchItem> {
        public static final DiffCallbacks INSTANCE = new DiffCallbacks();
        public static final int $stable = 8;

        private DiffCallbacks() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(SearchItem oldItem, SearchItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isTheSameAs(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(SearchItem oldItem, SearchItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    private final List<CuratedListChipItem> getCuratedListChips() {
        List<SearchItem> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentList) {
            if (obj instanceof SearchItem.CuratedListCarousel) {
                arrayList.add(obj);
            }
        }
        SearchItem.CuratedListCarousel curatedListCarousel = (SearchItem.CuratedListCarousel) CollectionsKt.firstOrNull((List) arrayList);
        List<CuratedListChipItem> curatedLists = curatedListCarousel != null ? curatedListCarousel.getCuratedLists() : null;
        return curatedLists == null ? CollectionsKt.emptyList() : curatedLists;
    }

    public final int getListChipsCount() {
        return getCuratedListChips().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SearchItem item = getItem(position);
        if (item instanceof SearchItem.CuratedListCarousel) {
            return 2;
        }
        if (item instanceof SearchItem.SecurityRow) {
            return 0;
        }
        if (item instanceof SearchItem.DeeplinkRow) {
            return 4;
        }
        if (item instanceof SearchItem.EducationRow) {
            return 5;
        }
        if (item instanceof SearchItem.Header) {
            return 3;
        }
        if (item instanceof SearchItem.HeaderWithAction) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            SearchRowView searchRowViewInflate = SearchRowView.INSTANCE.inflate(parent);
            searchRowViewInflate.setCallbacks(this.callbacks);
            return new SimpleViewHolder(searchRowViewInflate);
        }
        if (viewType == 2) {
            CuratedListChipRecyclerView curatedListChipRecyclerViewInflate = CuratedListChipRecyclerView.INSTANCE.inflate(parent);
            this.callbacks.onListChipsRecyclerViewCreated(curatedListChipRecyclerViewInflate);
            return new SimpleViewHolder(curatedListChipRecyclerViewInflate);
        }
        if (viewType == 3) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C27909R.layout.include_search_header_view, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SimpleViewHolder(viewInflate);
        }
        if (viewType == 4) {
            RdsRowView rdsRowViewInflate = RdsRowView.INSTANCE.inflate(parent);
            rdsRowViewInflate.setLeadingIconDrawable(AppCompatResources.getDrawable(rdsRowViewInflate.getContext(), C20690R.drawable.ic_rds_link_24dp));
            rdsRowViewInflate.setShowBottomDivider(false);
            return new SimpleViewHolder(rdsRowViewInflate);
        }
        if (viewType == 5) {
            RdsRowView rdsRowViewInflate2 = RdsRowView.INSTANCE.inflate(parent);
            rdsRowViewInflate2.setSecondaryTextMaxLines(1);
            rdsRowViewInflate2.setShowBottomDivider(false);
            return new SimpleViewHolder(rdsRowViewInflate2);
        }
        if (viewType == 6) {
            SearchHeaderWithActionView searchHeaderWithActionViewInflate = SearchHeaderWithActionView.INSTANCE.inflate(parent);
            searchHeaderWithActionViewInflate.setCallbacks(this.callbacks);
            return new SimpleViewHolder(searchHeaderWithActionViewInflate);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SearchItem item = getItem(position);
        if (item instanceof SearchItem.SecurityRow) {
            bindSearchRowView(holder, (SearchItem.SecurityRow) item);
            return;
        }
        if (item instanceof SearchItem.CuratedListCarousel) {
            bindCuratedListCarousel(holder, (SearchItem.CuratedListCarousel) item);
            return;
        }
        if (item instanceof SearchItem.DeeplinkRow) {
            bindDeeplinkRow(holder, (SearchItem.DeeplinkRow) item);
            return;
        }
        if (item instanceof SearchItem.EducationRow) {
            bindEducationRow(holder, (SearchItem.EducationRow) item);
        } else if (item instanceof SearchItem.Header) {
            bindHeader(holder, (SearchItem.Header) item, position);
        } else {
            if (!(item instanceof SearchItem.HeaderWithAction)) {
                throw new NoWhenBranchMatchedException();
            }
            bindHeaderWithAction(holder, (SearchItem.HeaderWithAction) item, position);
        }
    }

    private final void bindSearchRowView(SimpleViewHolder holder, final SearchItem.SecurityRow item) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.search.search.SearchRowView");
        SearchRowView searchRowView = (SearchRowView) view;
        searchRowView.bind(item);
        ViewsKt.eventData$default(searchRowView, false, new Function0() { // from class: com.robinhood.android.search.search.SearchAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchAdapter.bindSearchRowView$lambda$3$lambda$2(item);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindSearchRowView$lambda$3$lambda$2(SearchItem.SecurityRow securityRow) {
        Security security = securityRow.getSecurity();
        SearchResultEventData eventData = securityRow.getEventData();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SEARCH_RESULT;
        Component component = new Component(Component.ComponentType.SEARCH_RESULT_ROW, null, null, 6, null);
        String string2 = security.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SearchResultItem searchResultItem = new SearchResultItem(string2, eventData.getContentType(), security.getDisplayName(), null, 8, null);
        return new UserInteractionEventDescriptor(null, null, action, new Context(eventData.getItemPosition(), eventData.getItemCount(), 0, null, null, eventData.getQuery(), null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, searchResultItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -36, -2097153, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    private final void bindCuratedListCarousel(SimpleViewHolder holder, final SearchItem.CuratedListCarousel item) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.common.ui.CuratedListChipRecyclerView");
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) view;
        curatedListChipRecyclerView.setCallbacks(new CuratedListChipRecyclerView.Callbacks() { // from class: com.robinhood.android.search.search.SearchAdapter.bindCuratedListCarousel.1
            @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
            public void onChipClick(CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.callbacks.onCuratedListChipItemClicked(data, item.getCuratedLists().indexOf(data));
            }
        });
        curatedListChipRecyclerView.bind(item.getCuratedLists());
    }

    private final void bindDeeplinkRow(SimpleViewHolder holder, final SearchItem.DeeplinkRow item) {
        Drawable drawable;
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
        RdsRowView rdsRowView = (RdsRowView) view;
        rdsRowView.setPrimaryText(item.getTitle());
        rdsRowView.setSecondaryText(item.getSubtitle());
        ServerToBentoAssetMapper2 icon = item.getIcon();
        if (icon != null) {
            drawable = ContextCompat.getDrawable(rdsRowView.getContext(), icon.getResourceId());
        } else {
            drawable = null;
        }
        rdsRowView.setLeadingIconDrawable(drawable);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.search.search.SearchAdapter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchAdapter.bindDeeplinkRow$lambda$7$lambda$5(this.f$0, item);
            }
        });
        ViewsKt.setLoggingConfig(rdsRowView, new AutoLoggingConfig(false, false));
        ViewsKt.eventData$default(rdsRowView, false, new Function0() { // from class: com.robinhood.android.search.search.SearchAdapter$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchAdapter.bindDeeplinkRow$lambda$7$lambda$6(item);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDeeplinkRow$lambda$7$lambda$5(SearchAdapter searchAdapter, SearchItem.DeeplinkRow deeplinkRow) {
        searchAdapter.callbacks.onDeeplinkClicked(deeplinkRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindDeeplinkRow$lambda$7$lambda$6(SearchItem.DeeplinkRow deeplinkRow) {
        SearchResultEventData eventData = deeplinkRow.getEventData();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SEARCH_RESULT;
        Component component = new Component(Component.ComponentType.SEARCH_RESULT_ROW, null, null, 6, null);
        String string2 = deeplinkRow.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SearchResultItem searchResultItem = new SearchResultItem(string2, eventData.getContentType(), deeplinkRow.getTitle(), null, 8, null);
        return new UserInteractionEventDescriptor(null, null, action, new Context(eventData.getItemPosition(), eventData.getItemCount(), 0, null, null, eventData.getQuery(), null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, searchResultItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -36, -2097153, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    private final void bindEducationRow(SimpleViewHolder holder, final SearchItem.EducationRow item) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
        RdsRowView rdsRowView = (RdsRowView) view;
        rdsRowView.setPrimaryText(item.getTitle());
        rdsRowView.setSecondaryText(item.getBlurb());
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.search.search.SearchAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchAdapter.bindEducationRow$lambda$10$lambda$8(this.f$0, item);
            }
        });
        ViewsKt.setLoggingConfig(rdsRowView, new AutoLoggingConfig(false, false));
        ViewsKt.eventData$default(rdsRowView, false, new Function0() { // from class: com.robinhood.android.search.search.SearchAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchAdapter.bindEducationRow$lambda$10$lambda$9(item);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindEducationRow$lambda$10$lambda$8(SearchAdapter searchAdapter, SearchItem.EducationRow educationRow) {
        searchAdapter.callbacks.onEducationClicked(educationRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindEducationRow$lambda$10$lambda$9(SearchItem.EducationRow educationRow) {
        SearchResultEventData eventData = educationRow.getEventData();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SEARCH_RESULT;
        Component component = new Component(Component.ComponentType.SEARCH_RESULT_ROW, null, null, 6, null);
        SearchResultItem searchResultItem = new SearchResultItem(educationRow.getAnalyticsId(), eventData.getContentType(), educationRow.getTitle(), null, 8, null);
        return new UserInteractionEventDescriptor(null, null, action, new Context(eventData.getItemPosition(), eventData.getItemCount(), 0, null, null, eventData.getQuery(), null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, searchResultItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -36, -2097153, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    private final void bindHeader(SimpleViewHolder holder, SearchItem.Header item, int position) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        RhTextView rhTextView = (RhTextView) view;
        String displayTitle = item.getDisplayTitle();
        if (displayTitle == null) {
            displayTitle = com.robinhood.utils.extensions.ViewsKt.getString(rhTextView, item.getDefaultDisplayTitleRes());
        }
        rhTextView.setText(displayTitle);
        Resources resources = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        com.robinhood.utils.extensions.ViewsKt.setTopPadding(rhTextView, getHeaderTopPadding(resources, position));
    }

    private final void bindHeaderWithAction(SimpleViewHolder holder, SearchItem.HeaderWithAction item, int position) {
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.search.search.SearchHeaderWithActionView");
        SearchHeaderWithActionView searchHeaderWithActionView = (SearchHeaderWithActionView) view;
        searchHeaderWithActionView.bind(item);
        Resources resources = searchHeaderWithActionView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        com.robinhood.utils.extensions.ViewsKt.setTopPadding(searchHeaderWithActionView, getHeaderTopPadding(resources, position));
    }

    private final int getHeaderTopPadding(Resources resources, int position) {
        if (position == 0 || (getItem(position - 1) instanceof SearchItem.CuratedListCarousel)) {
            return 0;
        }
        return resources.getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public SearchItem getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (SearchItem) item;
    }
}
