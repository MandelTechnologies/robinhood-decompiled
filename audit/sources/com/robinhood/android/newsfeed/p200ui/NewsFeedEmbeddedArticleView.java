package com.robinhood.android.newsfeed.p200ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: NewsFeedEmbeddedArticleView.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 92\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u000389:B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0003H\u0016J\u0010\u00105\u001a\u0002032\u0006\u00104\u001a\u00020\u0003H\u0002J\u0010\u00106\u001a\u0002032\u0006\u00104\u001a\u00020\u0003H\u0002J\u0010\u00107\u001a\u0002032\u0006\u00104\u001a\u00020\u0003H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView$Callbacks;)V", "inCarousel", "", "getInCarousel", "()Z", "setInCarousel", "(Z)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "rootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "titleTxt", "Landroid/widget/TextView;", "relatedInstrumentsView", "Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView;", "sourceTxt", "timeTxt", "previewImg", "Landroid/widget/ImageView;", "heroPreviewImg", "regularConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "heroConstraintSet", "carouselConstraintSet", "content", "bind", "", "state", "bindRelatedInstruments", "bindSourceAndTimeText", "bindPreviewImage", "Callbacks", "Companion", "Card", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NewsFeedEmbeddedArticleView extends Hammer_NewsFeedEmbeddedArticleView implements Bindable<Content.EmbeddedArticle> {
    private Callbacks callbacks;
    private final ConstraintSet carouselConstraintSet;
    private Content.EmbeddedArticle content;
    private final ConstraintSet heroConstraintSet;
    private final ImageView heroPreviewImg;
    public ImageLoader imageLoader;
    private boolean inCarousel;
    public Navigator navigator;
    private final ImageView previewImg;
    private final ConstraintSet regularConstraintSet;
    private final NewsFeedRelatedInstrumentsView relatedInstrumentsView;
    private final ConstraintLayout rootView;
    private final TextView sourceTxt;
    private final TextView timeTxt;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewsFeedEmbeddedArticleView.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView$Callbacks;", "", "onRelatedInstrumentClick", "", "article", "Lcom/robinhood/android/newsfeed/model/Content$EmbeddedArticle;", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "onRelatedAssetClick", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "asset", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRelatedAssetClick(Content.Article article, RelatedAsset asset);

        void onRelatedInstrumentClick(Content.EmbeddedArticle article, RelatedInstrument instrument);
    }

    public /* synthetic */ NewsFeedEmbeddedArticleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedEmbeddedArticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] NewsFeedEmbeddedArticleView = C20334R.styleable.NewsFeedEmbeddedArticleView;
        Intrinsics.checkNotNullExpressionValue(NewsFeedEmbeddedArticleView, "NewsFeedEmbeddedArticleView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NewsFeedEmbeddedArticleView, 0, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C20334R.styleable.NewsFeedEmbeddedArticleView_displayAsCard, true)) {
            ViewGroups.inflate(this, C20334R.layout.merge_news_feed_embedded_article_card, true);
        } else {
            ViewGroups.inflate(this, C20334R.layout.merge_news_feed_embedded_article, true);
        }
        typedArrayObtainStyledAttributes.recycle();
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEmbeddedArticleView._init_$lambda$1(this.f$0);
            }
        }, 1, null);
        View viewFindViewById = findViewById(C20334R.id.news_feed_embedded_article_root_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.rootView = constraintLayout;
        View viewFindViewById2 = findViewById(C20334R.id.news_feed_embedded_article_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C20334R.id.news_feed_embedded_article_related_instruments);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.relatedInstrumentsView = (NewsFeedRelatedInstrumentsView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C20334R.id.news_feed_embedded_article_source_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.sourceTxt = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C20334R.id.news_feed_embedded_article_time_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.timeTxt = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C20334R.id.news_feed_embedded_article_preview_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById6;
        this.previewImg = imageView;
        View viewFindViewById7 = findViewById(C20334R.id.news_feed_embedded_article_hero_preview_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById7;
        this.heroPreviewImg = imageView2;
        ConstraintSet constraintSet = new ConstraintSet();
        this.regularConstraintSet = constraintSet;
        ConstraintSet constraintSet2 = new ConstraintSet();
        this.heroConstraintSet = constraintSet2;
        ConstraintSet constraintSet3 = new ConstraintSet();
        this.carouselConstraintSet = constraintSet3;
        imageView.setClipToOutline(true);
        imageView2.setClipToOutline(true);
        constraintSet.clone(constraintLayout);
        constraintSet2.clone(context, C20334R.layout.merge_news_feed_embedded_article_hero);
        constraintSet3.clone(context, C20334R.layout.constraint_set_news_feed_embedded_article_in_carousel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _init_$lambda$1(NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleView) {
        Content.EmbeddedArticle embeddedArticle = newsFeedEmbeddedArticleView.content;
        if (embeddedArticle != null) {
            return Contents.toEventData(embeddedArticle, UserInteractionEventData.Action.VIEW_NEWS_ARTICLE);
        }
        return null;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final boolean getInCarousel() {
        return this.inCarousel;
    }

    public final void setInCarousel(boolean z) {
        this.inCarousel = z;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Content.EmbeddedArticle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.content = state;
        if (state.isHero()) {
            this.heroConstraintSet.applyTo(this.rootView);
            this.titleTxt.setMinLines(0);
            this.titleTxt.setMaxLines(4);
            TextViewsKt.setTextAppearanceAttr(this.titleTxt, C20690R.attr.textAppearanceDisplaySmall);
        } else {
            if (this.inCarousel) {
                this.carouselConstraintSet.applyTo(this.rootView);
            } else {
                this.regularConstraintSet.applyTo(this.rootView);
            }
            this.titleTxt.setMinLines(2);
            this.titleTxt.setMaxLines(3);
            TextViewsKt.setTextAppearanceAttr(this.titleTxt, C20690R.attr.textAppearanceRegularMedium);
        }
        this.titleTxt.setText(state.getTitle());
        bindRelatedInstruments(state);
        bindSourceAndTimeText(state);
        bindPreviewImage(state);
    }

    private final void bindRelatedInstruments(final Content.EmbeddedArticle state) {
        this.relatedInstrumentsView.bind(state.getFirstInstrument(), state.getSecondInstrument(), state.getRelatedInstrumentEducationTourId());
        this.relatedInstrumentsView.setOnRelatedInstrumentClick(new Function1() { // from class: com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleView.bindRelatedInstruments$lambda$2(this.f$0, state, (RelatedInstrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRelatedInstruments$lambda$2(NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleView, Content.EmbeddedArticle embeddedArticle, RelatedInstrument relatedInstrument) {
        Intrinsics.checkNotNullParameter(relatedInstrument, "relatedInstrument");
        Callbacks callbacks = newsFeedEmbeddedArticleView.callbacks;
        if (callbacks != null) {
            callbacks.onRelatedInstrumentClick(embeddedArticle, relatedInstrument);
        }
        return Unit.INSTANCE;
    }

    private final void bindSourceAndTimeText(Content.EmbeddedArticle state) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String narrow$default = DurationFormatter.formatNarrow$default(resources, Durations.since(state.getPublishedAt()), false, 4, null);
        this.sourceTxt.setText(state.getSource());
        this.timeTxt.setText(narrow$default);
    }

    private final void bindPreviewImage(Content.EmbeddedArticle state) {
        ImageView imageView;
        if (state.isHero()) {
            this.previewImg.setVisibility(8);
            imageView = this.heroPreviewImg;
        } else {
            this.heroPreviewImg.setVisibility(8);
            imageView = this.previewImg;
        }
        ImageView imageView2 = imageView;
        HttpUrl previewImageUrl = state.getPreviewImageUrl();
        if (previewImageUrl != null) {
            ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(previewImageUrl).fit().centerCrop(), imageView2, null, null, 6, null);
            imageView2.setVisibility(0);
        } else {
            getImageLoader().cancelRequest(imageView2);
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
    }

    /* compiled from: NewsFeedEmbeddedArticleView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedEmbeddedArticleView> {
        private final /* synthetic */ Inflater<NewsFeedEmbeddedArticleView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedEmbeddedArticleView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedEmbeddedArticleView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20334R.layout.include_news_feed_embedded_article);
        }
    }

    /* compiled from: NewsFeedEmbeddedArticleView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView$Card;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/newsfeed/ui/NewsFeedEmbeddedArticleView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Card implements Inflater<NewsFeedEmbeddedArticleView> {
        private final /* synthetic */ Inflater<NewsFeedEmbeddedArticleView> $$delegate_0 = Inflater.INSTANCE.include(C20334R.layout.include_news_feed_embedded_article_card);
        public static final Card INSTANCE = new Card();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedEmbeddedArticleView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedEmbeddedArticleView) this.$$delegate_0.inflate(parent);
        }

        private Card() {
        }
    }
}
