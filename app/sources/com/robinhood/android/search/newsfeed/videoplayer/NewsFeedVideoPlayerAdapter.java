package com.robinhood.android.search.newsfeed.videoplayer;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: NewsFeedVideoPlayerAdapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B&\u0012\u001d\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R%\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView;", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "bind", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "onBindViewHolder", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "getItem", "position", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedVideoPlayerAdapter extends GenericListAdapter<NewsFeedVideoViewerItemView, Video> {
    public static final int $stable = GenericListAdapter.$stable;
    private final Function2<NewsFeedVideoViewerItemView, Video, Unit> bind;

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, Video video) {
        onBindViewHolder2((GenericViewHolder<NewsFeedVideoViewerItemView>) genericViewHolder, video);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedVideoPlayerAdapter(Function2<? super NewsFeedVideoViewerItemView, ? super Video, Unit> bind) {
        super(NewsFeedVideoViewerItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoPlayerAdapter.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Video) obj).getId();
            }
        }));
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.bind = bind;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<NewsFeedVideoViewerItemView> holder, Video item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        this.bind.invoke(holder.getView(), item);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.ListAdapter
    public Video getItem(int position) {
        return (Video) super.getItem(position);
    }
}
