package com.robinhood.android.search.newsfeed.view;

import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import kotlin.Metadata;

/* compiled from: NewsFeedElementAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, m3636d2 = {"getActualItemViewType", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "feature-search_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapterKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NewsFeedElementAdapter8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getActualItemViewType(RecyclerView.Adapter<?> adapter, int i) {
        if (adapter instanceof CompositeAdapter) {
            CompositeAdapter.Target targetAdapterPositionToTarget = ((CompositeAdapter) adapter).adapterPositionToTarget(i);
            RecyclerView.Adapter<?> value = targetAdapterPositionToTarget.getChild().getValue();
            if (value instanceof NewsFeedElementAdapter) {
                return ((NewsFeedElementAdapter) value).getItemViewType(targetAdapterPositionToTarget.getChildPosition());
            }
            return -1;
        }
        return adapter.getItemViewType(i);
    }
}
