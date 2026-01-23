package com.robinhood.android.search.newsfeed.view;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.p200ui.NewsFeedArticleView;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEmbeddedArticleView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedCarouselAdapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0002\u000e\u0011\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001e\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/newsfeed/model/Content;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$Callbacks;)V", "articleCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$articleCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$articleCallbacks$1;", "embeddedArticleCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$embeddedArticleCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$embeddedArticleCallbacks$1;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "getItem", "Callbacks", "PaddingItemDecoration", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedCarouselAdapter extends ListAdapter<Content, GenericViewHolder<? extends View>> {
    private static final int ARTICLE_VIEW_TYPE = 0;
    private static final int EMBEDDED_ARTICLE_VIEW_TYPE = 1;
    private static final int INSTRUMENT_VIEW_TYPE = 2;
    private final NewsFeedCarouselAdapter2 articleCallbacks;
    private Callbacks callbacks;
    private final NewsFeedCarouselAdapter3 embeddedArticleCallbacks;
    public static final int $stable = 8;

    /* compiled from: NewsFeedCarouselAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$Callbacks;", "", "onContentClick", "", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "onContentRelatedInstrumentClick", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "onContentRelatedAssetClick", "article", "asset", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContentClick(Content content);

        void onContentRelatedAssetClick(Content article, RelatedAsset asset);

        void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter$articleCallbacks$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter$embeddedArticleCallbacks$1] */
    public NewsFeedCarouselAdapter() {
        super(DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Content) obj).getId();
            }
        }));
        this.articleCallbacks = new NewsFeedArticleView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter$articleCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedArticleView.Callbacks
            public void onRelatedInstrumentClick(Content.Article article, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                NewsFeedCarouselAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(article, instrument);
                }
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedArticleView.Callbacks
            public void onRelatedAssetClick(Content.Article article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                NewsFeedCarouselAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedAssetClick(article, asset);
                }
            }
        };
        this.embeddedArticleCallbacks = new NewsFeedEmbeddedArticleView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter$embeddedArticleCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView.Callbacks
            public void onRelatedInstrumentClick(Content.EmbeddedArticle article, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                NewsFeedCarouselAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(article, instrument);
                }
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView.Callbacks
            public void onRelatedAssetClick(Content.Article article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                NewsFeedCarouselAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedAssetClick(article, asset);
                }
            }
        };
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        FrameLayout frameLayoutInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            NewsFeedArticleView newsFeedArticleViewInflate = NewsFeedArticleView.Card.INSTANCE.inflate(parent);
            View viewFindViewById = newsFeedArticleViewInflate.findViewById(C20334R.id.news_feed_article_bottom_divider);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(8);
            newsFeedArticleViewInflate.setCallbacks(this.articleCallbacks);
            newsFeedArticleViewInflate.setInCarousel(true);
            frameLayoutInflate = newsFeedArticleViewInflate;
        } else if (viewType == 1) {
            NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleViewInflate = NewsFeedEmbeddedArticleView.Card.INSTANCE.inflate(parent);
            View viewFindViewById2 = newsFeedEmbeddedArticleViewInflate.findViewById(C20334R.id.news_feed_embedded_article_bottom_divider);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            viewFindViewById2.setVisibility(8);
            newsFeedEmbeddedArticleViewInflate.setCallbacks(this.embeddedArticleCallbacks);
            newsFeedEmbeddedArticleViewInflate.setInCarousel(true);
            frameLayoutInflate = newsFeedEmbeddedArticleViewInflate;
        } else if (viewType == 2) {
            frameLayoutInflate = NewsFeedInstrumentView.INSTANCE.inflate(parent);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }
        frameLayoutInflate.getLayoutParams().height = ViewsKt.getDimensionPixelSize(frameLayoutInflate, C27909R.dimen.news_feed_carousel_item_height);
        return new GenericViewHolder<>(frameLayoutInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Content item = getItem(position);
        KeyEvent.Callback view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.newsfeed.model.Content>");
        ((Bindable) view).bind(item);
        OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedCarouselAdapter.onBindViewHolder$lambda$2(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(NewsFeedCarouselAdapter newsFeedCarouselAdapter, Content content) {
        Callbacks callbacks = newsFeedCarouselAdapter.callbacks;
        if (callbacks != null) {
            callbacks.onContentClick(content);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Content item = getItem(position);
        if (item instanceof Content.Article) {
            return 0;
        }
        if (item instanceof Content.EmbeddedArticle) {
            return 1;
        }
        if (item instanceof Content.Instrument) {
            return 2;
        }
        if (item instanceof Content.Video) {
            throw new IllegalStateException("Video in carousel currently not supported");
        }
        if (item instanceof Content.EducationSeries) {
            throw new IllegalStateException("Education in carousel currently not supported");
        }
        if (item instanceof Content.ListPreview) {
            throw new IllegalStateException("Lists chip in carousel currently not supported");
        }
        if (item instanceof Content.MarketUpdates) {
            throw new IllegalStateException("Market updates in carousel currently not supported");
        }
        if (item instanceof Content.MarketIndicator) {
            throw new IllegalStateException("Market indicators in carousel currently not supported");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public Content getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (Content) item;
    }

    /* compiled from: NewsFeedCarouselAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0014J\u001c\u0010\r\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter$PaddingItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediumSpacing", "", "sidePadding", "getLeftPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "getRightPadding", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaddingItemDecoration extends com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration {
        public static final int $stable = com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration.$stable;
        private final int mediumSpacing;
        private final int sidePadding;

        public PaddingItemDecoration(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.mediumSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
            this.sidePadding = context.getResources().getDimensionPixelSize(C27909R.dimen.news_feed_carousel_side_padding);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getLeftPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            if (position == 0) {
                return this.mediumSpacing;
            }
            return 0;
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            if (position == adapter.getSize() - 1) {
                return this.mediumSpacing;
            }
            return this.sidePadding;
        }
    }
}
