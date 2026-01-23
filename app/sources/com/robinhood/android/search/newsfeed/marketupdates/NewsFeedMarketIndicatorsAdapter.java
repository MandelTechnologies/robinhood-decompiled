package com.robinhood.android.search.newsfeed.marketupdates;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.search.C27909R;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedMarketIndicatorsAdapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketIndicatorsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemData;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "<init>", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedMarketIndicatorsAdapter extends ListAdapter<MarketIndicatorItemData, SimpleViewHolder> {
    public static final int $stable = 8;

    public NewsFeedMarketIndicatorsAdapter() {
        super(DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicatorsAdapter.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((MarketIndicatorItemData) obj).getKey();
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MarketIndicatorItemView marketIndicatorItemViewInflate = MarketIndicatorItemView.INSTANCE.inflate(parent);
        int i = marketIndicatorItemViewInflate.getResources().getDisplayMetrics().widthPixels;
        marketIndicatorItemViewInflate.getLayoutParams().width = i / getSize();
        return new SimpleViewHolder(marketIndicatorItemViewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View viewFindViewById = holder.itemView.findViewById(C27909R.id.market_indicator_vertical_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(position != 0 ? 0 : 8);
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemView");
        MarketIndicatorItemData item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        ((MarketIndicatorItemView) view).bind(item);
    }
}
