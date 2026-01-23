package com.robinhood.android.search.newsfeed.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.p200ui.NewsFeedArticleView;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEducationCarouselView;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEmbeddedArticleView;
import com.robinhood.android.search.newsfeed.NewsFeedRecommendationsCard;
import com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesView;
import com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketUpdatesView;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView;
import com.robinhood.android.search.newsfeed.view.NewsFeedCarousel;
import com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter;
import com.robinhood.android.search.newsfeed.view.NewsFeedListsPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsFeedElementAdapter.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0006\u0012\u0015\u0018\u001b\u001e!\b\u0007\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0004/012B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u001e\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010+\u001a\u00020'H\u0016J\u001e\u0010,\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010+\u001a\u00020'H\u0002J\u0010\u0010-\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/newsfeed/model/Element;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "accountNumber", "", "<init>", "(Landroidx/lifecycle/Lifecycle;Ljava/lang/String;)V", "callbacks", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;)V", "articleCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$articleCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$articleCallbacks$1;", "embeddedArticleCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$embeddedArticleCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$embeddedArticleCallbacks$1;", "videoCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$videoCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$videoCallbacks$1;", "carouselCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$carouselCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$carouselCallbacks$1;", "listsPreviewCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$listsPreviewCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$listsPreviewCallbacks$1;", "educationCarouselCallbacks", "com/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$educationCarouselCallbacks$1", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$educationCarouselCallbacks$1;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "bindMarketUpdatesDivider", "getItemViewType", "getItem", "Callbacks", "DiffCallback", "PaddingItemDecoration", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedElementAdapter extends ListAdapter<Element, GenericViewHolder<? extends View>> {
    private static final int CAROUSEL_VIEW_TYPE = 3;
    private static final int EDUCATION_CAROUSEL_TYPE = 6;
    private static final int LISTS_PREVIEW_TYPE = 4;
    private static final int MARKET_INDICATORS_VIEW_TYPE = 8;
    private static final int MARKET_UPDATES_VIEW_TYPE = 7;
    private static final int RECOMMENDATIONS_VIEW_TYPE = 5;
    private static final int REGULAR_ARTICLE_VIEW_TYPE = 0;
    private static final int REGULAR_EMBEDDED_ARTICLE_VIEW_TYPE = 1;
    private static final int REGULAR_VIDEO_VIEW_TYPE = 2;
    private final String accountNumber;
    private final NewsFeedElementAdapter2 articleCallbacks;
    private Callbacks callbacks;
    private final NewsFeedElementAdapter3 carouselCallbacks;
    private final NewsFeedElementAdapter4 educationCarouselCallbacks;
    private final NewsFeedElementAdapter5 embeddedArticleCallbacks;
    private final Lifecycle lifecycle;
    private final NewsFeedElementAdapter6 listsPreviewCallbacks;
    private final NewsFeedElementAdapter7 videoCallbacks;
    public static final int $stable = 8;

    /* compiled from: NewsFeedElementAdapter.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H\u0016J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0016¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;", "", "onContentRelatedInstrumentClick", "", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "inCarousel", "", "onContentRelatedAssetClick", "asset", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "onContentClick", "onCarouselContentAppear", "onCarouselContentClick", "onCarouselContentDisappear", "durationVisible", "", "onListsChipContentAppear", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "onListsChipContentClick", "onEducationLessonsAppear", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "onEducationHomeEntryPointClick", "onToggleVideoAudioAppear", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "enabled", "onToggleVideoAudioClick", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: NewsFeedElementAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onCarouselContentAppear(Callbacks callbacks, Content content) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onCarouselContentClick(Callbacks callbacks, Content content) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onCarouselContentDisappear(Callbacks callbacks, Content content, long j) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onContentClick(Callbacks callbacks, Content content, boolean z) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onContentRelatedAssetClick(Callbacks callbacks, Content content, RelatedAsset asset, boolean z) {
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(asset, "asset");
            }

            public static void onContentRelatedInstrumentClick(Callbacks callbacks, Content content, RelatedInstrument instrument, boolean z) {
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
            }

            public static void onEducationHomeEntryPointClick(Callbacks callbacks) {
            }

            public static void onEducationLessonsAppear(Callbacks callbacks, List<EducationLessonPreview> lessons) {
                Intrinsics.checkNotNullParameter(lessons, "lessons");
            }

            public static void onListsChipContentAppear(Callbacks callbacks, Content.ListPreview content) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onListsChipContentClick(Callbacks callbacks, Content.ListPreview content) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onToggleVideoAudioAppear(Callbacks callbacks, Content.Video content, boolean z) {
                Intrinsics.checkNotNullParameter(content, "content");
            }

            public static void onToggleVideoAudioClick(Callbacks callbacks, Content.Video content, boolean z) {
                Intrinsics.checkNotNullParameter(content, "content");
            }
        }

        void onCarouselContentAppear(Content content);

        void onCarouselContentClick(Content content);

        void onCarouselContentDisappear(Content content, long durationVisible);

        void onContentClick(Content content, boolean inCarousel);

        void onContentRelatedAssetClick(Content content, RelatedAsset asset, boolean inCarousel);

        void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument, boolean inCarousel);

        void onEducationHomeEntryPointClick();

        void onEducationLessonsAppear(List<EducationLessonPreview> lessons);

        void onListsChipContentAppear(Content.ListPreview content);

        void onListsChipContentClick(Content.ListPreview content);

        void onToggleVideoAudioAppear(Content.Video content, boolean enabled);

        void onToggleVideoAudioClick(Content.Video content, boolean enabled);
    }

    public /* synthetic */ NewsFeedElementAdapter(Lifecycle lifecycle, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycle, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$articleCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$embeddedArticleCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$videoCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$carouselCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$listsPreviewCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$educationCarouselCallbacks$1] */
    public NewsFeedElementAdapter(Lifecycle lifecycle, String str) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.lifecycle = lifecycle;
        this.accountNumber = str;
        this.articleCallbacks = new NewsFeedArticleView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$articleCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedArticleView.Callbacks
            public void onRelatedInstrumentClick(Content.Article article, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(article, instrument, false);
                }
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedArticleView.Callbacks
            public void onRelatedAssetClick(Content.Article article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedAssetClick(article, asset, false);
                }
            }
        };
        this.embeddedArticleCallbacks = new NewsFeedEmbeddedArticleView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$embeddedArticleCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView.Callbacks
            public void onRelatedInstrumentClick(Content.EmbeddedArticle article, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(article, instrument, false);
                }
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView.Callbacks
            public void onRelatedAssetClick(Content.Article article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedAssetClick(article, asset, false);
                }
            }
        };
        this.videoCallbacks = new NewsFeedVideoView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$videoCallbacks$1
            @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView.Callbacks
            public void onRelatedInstrumentClick(Content.Video video, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(video, instrument, false);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView.Callbacks
            public void onToggleVideoAudioAppear(Content.Video video, boolean enabled) {
                Intrinsics.checkNotNullParameter(video, "video");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onToggleVideoAudioAppear(video, enabled);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView.Callbacks
            public void onToggleVideoAudioClick(Content.Video video, boolean enabled) {
                Intrinsics.checkNotNullParameter(video, "video");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onToggleVideoAudioClick(video, enabled);
                }
            }
        };
        this.carouselCallbacks = new NewsFeedCarousel.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$carouselCallbacks$1
            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.Callbacks
            public void onContentAppear(Content content) {
                Intrinsics.checkNotNullParameter(content, "content");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onCarouselContentAppear(content);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.Callbacks
            public void onContentDisappear(Content content, long durationVisible) {
                Intrinsics.checkNotNullParameter(content, "content");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onCarouselContentDisappear(content, durationVisible);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.Callbacks
            public void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(content, instrument, true);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.Callbacks
            public void onContentRelatedAssetClick(Content content, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(asset, "asset");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedAssetClick(content, asset, true);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.Callbacks
            public void onContentClick(Content content) {
                Intrinsics.checkNotNullParameter(content, "content");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onCarouselContentClick(content);
                }
            }
        };
        this.listsPreviewCallbacks = new NewsFeedListsPreview.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$listsPreviewCallbacks$1
            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedListsPreview.Callbacks
            public void onContentAppear(Content.ListPreview content) {
                Intrinsics.checkNotNullParameter(content, "content");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onListsChipContentAppear(content);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedListsPreview.Callbacks
            public void onContentClick(Content.ListPreview content) {
                Intrinsics.checkNotNullParameter(content, "content");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onListsChipContentClick(content);
                }
            }
        };
        this.educationCarouselCallbacks = new NewsFeedEducationCarouselView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$educationCarouselCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEducationCarouselView.Callbacks
            public void onEducationLessonsAppear(List<EducationLessonPreview> lessons) {
                Intrinsics.checkNotNullParameter(lessons, "lessons");
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onEducationLessonsAppear(lessons);
                }
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEducationCarouselView.Callbacks
            public void onEducationHomeEntryPointClick() {
                NewsFeedElementAdapter.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    callbacks.onEducationHomeEntryPointClick();
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
        ViewGroup viewGroupInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 0:
                NewsFeedArticleView newsFeedArticleViewInflate = NewsFeedArticleView.INSTANCE.inflate(parent);
                newsFeedArticleViewInflate.setCallbacks(this.articleCallbacks);
                viewGroupInflate = newsFeedArticleViewInflate;
                break;
            case 1:
                NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleViewInflate = NewsFeedEmbeddedArticleView.INSTANCE.inflate(parent);
                newsFeedEmbeddedArticleViewInflate.setCallbacks(this.embeddedArticleCallbacks);
                viewGroupInflate = newsFeedEmbeddedArticleViewInflate;
                break;
            case 2:
                NewsFeedVideoView newsFeedVideoViewInflate = NewsFeedVideoView.INSTANCE.inflate(parent);
                newsFeedVideoViewInflate.setCallbacks(this.videoCallbacks);
                viewGroupInflate = newsFeedVideoViewInflate;
                break;
            case 3:
                NewsFeedCarousel newsFeedCarouselInflate = NewsFeedCarousel.INSTANCE.inflate(parent);
                newsFeedCarouselInflate.setCallbacks(this.carouselCallbacks);
                newsFeedCarouselInflate.setLifecycle(this.lifecycle);
                viewGroupInflate = newsFeedCarouselInflate;
                break;
            case 4:
                NewsFeedListsPreview newsFeedListsPreviewInflate = NewsFeedListsPreview.INSTANCE.inflate(parent);
                newsFeedListsPreviewInflate.setCallbacks(this.listsPreviewCallbacks);
                newsFeedListsPreviewInflate.setLifecycle(this.lifecycle);
                newsFeedListsPreviewInflate.setAccountNumber(this.accountNumber);
                viewGroupInflate = newsFeedListsPreviewInflate;
                break;
            case 5:
                viewGroupInflate = NewsFeedRecommendationsCard.INSTANCE.inflate(parent);
                break;
            case 6:
                NewsFeedEducationCarouselView newsFeedEducationCarouselViewInflate = NewsFeedEducationCarouselView.INSTANCE.inflate(parent);
                newsFeedEducationCarouselViewInflate.setCallbacks(this.educationCarouselCallbacks);
                viewGroupInflate = newsFeedEducationCarouselViewInflate;
                break;
            case 7:
                viewGroupInflate = NewsFeedMarketUpdatesView.INSTANCE.inflate(parent);
                break;
            case 8:
                viewGroupInflate = NewsFeedMarketIndicesView.INSTANCE.inflate(parent);
                break;
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
        return new GenericViewHolder<>(viewGroupInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Element item = getItem(position);
        boolean z = item instanceof Element.Regular;
        if (z) {
            KeyEvent.Callback view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.newsfeed.model.Content>");
            ((Bindable) view).bind(((Element.Regular) item).getContent());
        } else if (item instanceof Element.RecommendationsCard) {
            KeyEvent.Callback view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<kotlin.Unit>");
            ((Bindable) view2).bind(Unit.INSTANCE);
        } else {
            KeyEvent.Callback view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.newsfeed.model.Element>");
            ((Bindable) view3).bind(item);
        }
        if (item instanceof Element.Carousel) {
            if (position == 0) {
                ViewsKt.setTopPadding(holder.getView(), ViewsKt.getDimensionPixelSize(holder.getView(), C13997R.dimen.rds_spacing_medium));
            } else {
                ViewsKt.setTopPadding(holder.getView(), 0);
            }
        }
        if (item instanceof Element.ListPreview) {
            if (position != 0) {
                ViewsKt.setTopPadding(holder.getView(), ViewsKt.getDimensionPixelSize(holder.getView(), C13997R.dimen.rds_spacing_small));
            } else {
                ViewsKt.setTopPadding(holder.getView(), 0);
            }
        }
        bindMarketUpdatesDivider(holder, position);
        if (z) {
            OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewsFeedElementAdapter.onBindViewHolder$lambda$6(this.f$0, item);
                }
            });
        } else {
            if (item instanceof Element.RecommendationsCard) {
                return;
            }
            holder.getView().setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(NewsFeedElementAdapter newsFeedElementAdapter, Element element) {
        Callbacks callbacks = newsFeedElementAdapter.callbacks;
        if (callbacks != null) {
            callbacks.onContentClick(((Element.Regular) element).getContent(), false);
        }
        return Unit.INSTANCE;
    }

    private final void bindMarketUpdatesDivider(GenericViewHolder<? extends View> holder, int position) {
        Element item = getItem(position);
        if (item instanceof Element.MarketIndicators) {
            int i = position + 1;
            Integer numValueOf = i < getSize() ? Integer.valueOf(NewsFeedElementAdapter8.getActualItemViewType(this, i)) : null;
            int dimensionPixelSize = (numValueOf != null && numValueOf.intValue() == 7) ? ViewsKt.getDimensionPixelSize(holder.getView(), C13997R.dimen.rds_spacing_medium) : 0;
            View view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesView");
            ((NewsFeedMarketIndicesView) view).setBottomDividerMarginSize(dimensionPixelSize);
        }
        if (item instanceof Element.MarketUpdates) {
            int i2 = position - 1;
            Integer numValueOf2 = i2 >= 0 ? Integer.valueOf(NewsFeedElementAdapter8.getActualItemViewType(this, i2)) : null;
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketUpdatesView");
            ((NewsFeedMarketUpdatesView) view2).setShowTopDivider(numValueOf2 == null || numValueOf2.intValue() != 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Element item = getItem(position);
        if (item instanceof Element.Regular) {
            Content content = ((Element.Regular) item).getContent();
            if (content instanceof Content.Article) {
                return 0;
            }
            if (content instanceof Content.EmbeddedArticle) {
                return 1;
            }
            if (content instanceof Content.Instrument) {
                throw new IllegalStateException("Regular instrument is not supported");
            }
            if (content instanceof Content.Video) {
                return 2;
            }
            if (content instanceof Content.EducationSeries) {
                throw new IllegalStateException("Education Series are not supported");
            }
            if (content instanceof Content.ListPreview) {
                throw new IllegalStateException("Lists chips are not supported");
            }
            if (content instanceof Content.MarketUpdates) {
                throw new IllegalStateException("Market updates are not supported");
            }
            if (content instanceof Content.MarketIndicator) {
                throw new IllegalStateException("Market indicators are not supported");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (item instanceof Element.Carousel) {
            return 3;
        }
        if (item instanceof Element.ListPreview) {
            return 4;
        }
        if (item instanceof Element.EducationCarousel) {
            return 6;
        }
        if (item instanceof Element.RecommendationsCard) {
            return 5;
        }
        if (item instanceof Element.MarketUpdates) {
            return 7;
        }
        if (item instanceof Element.MarketIndicators) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public Element getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (Element) item;
    }

    /* compiled from: NewsFeedElementAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/newsfeed/model/Element;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<Element> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Element oldItem, Element newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isTheSameAs(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Element oldItem, Element newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isTheSameContentAs(newItem);
        }
    }

    /* compiled from: NewsFeedElementAdapter.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u001c\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0014J\u001c\u0010\u0011\u001a\u00020\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0014J\u001c\u0010\u0012\u001a\u00020\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$PaddingItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediumSpacing", "", "smallSpacing", "setDefaultPadding", "", "outRect", "Landroid/graphics/Rect;", "getLeftPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "getRightPadding", "getBottomPadding", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaddingItemDecoration extends com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration {
        public static final int $stable = com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration.$stable;
        private final int mediumSpacing;
        private final int smallSpacing;

        public PaddingItemDecoration(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.mediumSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
            this.smallSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected void setDefaultPadding(Rect outRect) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            outRect.set(0, 0, 0, this.smallSpacing);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getLeftPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            int actualItemViewType = NewsFeedElementAdapter8.getActualItemViewType(adapter, position);
            if (actualItemViewType == -1 || actualItemViewType == 3 || actualItemViewType == 4) {
                return 0;
            }
            return this.smallSpacing;
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            return getLeftPadding(adapter, position);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getBottomPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            int actualItemViewType = NewsFeedElementAdapter8.getActualItemViewType(adapter, position);
            if (actualItemViewType == -1) {
                return this.smallSpacing;
            }
            int i = position + 1;
            Integer numValueOf = i < adapter.getSize() ? Integer.valueOf(NewsFeedElementAdapter8.getActualItemViewType(adapter, i)) : null;
            if (actualItemViewType == 3 || ((numValueOf != null && numValueOf.intValue() == 3) || actualItemViewType == 4 || (numValueOf != null && numValueOf.intValue() == 4))) {
                return this.mediumSpacing;
            }
            return this.smallSpacing;
        }
    }
}
