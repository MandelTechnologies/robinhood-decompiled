package com.robinhood.android.search.newsfeed.embeddedarticle;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.newsfeed.extensions.Quotes;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedContentViewState;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.newsfeed.p334db.NewsFeedEmbeddedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedMedia;
import com.robinhood.models.p320db.Quote;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.Colors;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.rx2.RxAwait3;
import okhttp3.HttpUrl;

/* compiled from: NewsFeedEmbeddedArticleFragment.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eH\u0016J\u001a\u0010f\u001a\u00020c2\u0006\u0010g\u001a\u0002022\b\u0010h\u001a\u0004\u0018\u00010iH\u0017J\b\u0010j\u001a\u00020cH\u0016J\b\u0010k\u001a\u00020lH\u0016J\u0010\u0010w\u001a\u00020c2\u0006\u0010x\u001a\u00020yH\u0002J\u0010\u0010z\u001a\u00020c2\u0006\u0010x\u001a\u00020yH\u0002J3\u0010{\u001a\u00020c2\u0006\u0010|\u001a\u00020B2\b\u0010`\u001a\u0004\u0018\u00010a2\u0017\u0010}\u001a\u0013\u0012\u0004\u0012\u00020\u007f\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u0001\u0018\u00010~H\u0002J&\u0010\u0081\u0001\u001a\u00020n*\u0011\u0012\u0004\u0012\u00020\u007f\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010~2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b>\u0010?R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bG\u0010DR\u001b\u0010I\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bJ\u0010DR\u001b\u0010L\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bM\u0010DR\u001b\u0010O\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00106\u001a\u0004\bP\u0010DR\u001b\u0010R\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\bS\u0010DR\u001b\u0010U\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u00106\u001a\u0004\bV\u0010DR\u001b\u0010X\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u00106\u001a\u0004\bZ\u0010[R\u0012\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e¢\u0006\u0004\n\u0002\u0010_R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010m\u001a\u00020nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010pR\u0016\u0010s\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010pR\u0016\u0010u\u001a\u0004\u0018\u00010n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010p¨\u0006\u0085\u0001"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleDuxo;", "getDuxo", "()Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "articleId", "Ljava/util/UUID;", "getArticleId", "()Ljava/util/UUID;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "getContentRenderer", "()Lcom/robinhood/contentful/markdown/ContentRenderer;", "setContentRenderer", "(Lcom/robinhood/contentful/markdown/ContentRenderer;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "progressBar", "Landroid/view/View;", "getProgressBar", "()Landroid/view/View;", "progressBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorView", "Lcom/robinhood/android/common/view/ErrorView;", "getErrorView", "()Lcom/robinhood/android/common/view/ErrorView;", "errorView$delegate", "headerImg", "Landroid/widget/ImageView;", "getHeaderImg", "()Landroid/widget/ImageView;", "headerImg$delegate", "firstInstrumentTxt", "Landroid/widget/TextView;", "getFirstInstrumentTxt", "()Landroid/widget/TextView;", "firstInstrumentTxt$delegate", "secondInstrumentTxt", "getSecondInstrumentTxt", "secondInstrumentTxt$delegate", "titleTxt", "getTitleTxt", "titleTxt$delegate", "authorsTxt", "getAuthorsTxt", "authorsTxt$delegate", "lastUpdatedTxt", "getLastUpdatedTxt", "lastUpdatedTxt$delegate", "imageCreditTxt", "getImageCreditTxt", "imageCreditTxt$delegate", "contentTxt", "getContentTxt", "contentTxt$delegate", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView$delegate", "lastTouchEvent", "", "Ljava/lang/Integer;", "content", "Lcom/robinhood/models/newsfeed/db/NewsFeedEmbeddedContent;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "screenMessageType", "getScreenMessageType", "screenType", "getScreenType", "updateViewState", "viewState", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState;", "updateBannerLogo", "bindInstrument", "textView", "relatedInstrumentPair", "Lkotlin/Pair;", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "Lcom/robinhood/models/db/Quote;", "getDisplayText", "resources", "Landroid/content/res/Resources;", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedEmbeddedArticleFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: authorsTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 authorsTxt;
    private NewsFeedEmbeddedContent content;
    public ContentRenderer contentRenderer;

    /* renamed from: contentTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentTxt;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorView$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorView;
    public EventLogger eventLogger;

    /* renamed from: firstInstrumentTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 firstInstrumentTxt;

    /* renamed from: headerImg$delegate, reason: from kotlin metadata */
    private final Interfaces2 headerImg;

    /* renamed from: imageCreditTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 imageCreditTxt;
    public ImageLoader imageLoader;
    private Integer lastTouchEvent;

    /* renamed from: lastUpdatedTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 lastUpdatedTxt;
    public Markwon markwon;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressBar;
    private final String screenName;

    /* renamed from: scrollView$delegate, reason: from kotlin metadata */
    private final Interfaces2 scrollView;

    /* renamed from: secondInstrumentTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondInstrumentTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "progressBar", "getProgressBar()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "errorView", "getErrorView()Lcom/robinhood/android/common/view/ErrorView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "headerImg", "getHeaderImg()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "firstInstrumentTxt", "getFirstInstrumentTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "secondInstrumentTxt", "getSecondInstrumentTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "authorsTxt", "getAuthorsTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "lastUpdatedTxt", "getLastUpdatedTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "imageCreditTxt", "getImageCreditTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "contentTxt", "getContentTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedEmbeddedArticleFragment.class, "scrollView", "getScrollView()Landroid/widget/ScrollView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NewsFeedEmbeddedArticleFragment() {
        super(C27909R.layout.fragment_news_feed_embedded_article);
        this.duxo = OldDuxos.oldDuxo(this, NewsFeedEmbeddedArticleDuxo.class);
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEmbeddedArticleFragment.newsFeedAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        this.progressBar = bindView(C27909R.id.news_feed_embedded_article_progress_bar);
        this.errorView = bindView(C27909R.id.news_feed_embedded_article_error_retry_view);
        this.headerImg = bindView(C27909R.id.news_feed_embedded_article_header_img);
        this.firstInstrumentTxt = bindView(C27909R.id.news_feed_embedded_article_first_instrument_txt);
        this.secondInstrumentTxt = bindView(C27909R.id.news_feed_embedded_article_second_instrument_txt);
        this.titleTxt = bindView(C27909R.id.news_feed_embedded_article_title_txt);
        this.authorsTxt = bindView(C27909R.id.news_feed_embedded_article_authors_txt);
        this.lastUpdatedTxt = bindView(C27909R.id.news_feed_embedded_article_last_updated_txt);
        this.imageCreditTxt = bindView(C27909R.id.news_feed_embedded_article_image_credit_txt);
        this.contentTxt = bindView(C27909R.id.news_feed_embedded_article_content_txt);
        this.scrollView = bindView(C27909R.id.news_feed_embedded_article_scroll_view);
        this.screenName = "EMBEDDED_ARTICLE_PAGE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewsFeedEmbeddedArticleDuxo getDuxo() {
        return (NewsFeedEmbeddedArticleDuxo) this.duxo.getValue();
    }

    private final UUID getArticleId() {
        return ((LegacyFragmentKey.NewsFeedEmbeddedArticle) INSTANCE.getArgs((Fragment) this)).getArticleId();
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final ContentRenderer getContentRenderer() {
        ContentRenderer contentRenderer = this.contentRenderer;
        if (contentRenderer != null) {
            return contentRenderer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentRenderer");
        return null;
    }

    public final void setContentRenderer(ContentRenderer contentRenderer) {
        Intrinsics.checkNotNullParameter(contentRenderer, "<set-?>");
        this.contentRenderer = contentRenderer;
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$0(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment) {
        return new NewsFeedAnalytics(newsFeedEmbeddedArticleFragment.getAnalytics(), ((LegacyFragmentKey.NewsFeedEmbeddedArticle) INSTANCE.getArgs((Fragment) newsFeedEmbeddedArticleFragment)).getAnalyticsPrefix(), newsFeedEmbeddedArticleFragment.getEventLogger(), new Screen(Screen.Name.EMBEDDED_ARTICLE_PAGE, null, null, null, 14, null));
    }

    private final View getProgressBar() {
        return (View) this.progressBar.getValue(this, $$delegatedProperties[0]);
    }

    private final ErrorView getErrorView() {
        return (ErrorView) this.errorView.getValue(this, $$delegatedProperties[1]);
    }

    private final ImageView getHeaderImg() {
        return (ImageView) this.headerImg.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getFirstInstrumentTxt() {
        return (TextView) this.firstInstrumentTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getSecondInstrumentTxt() {
        return (TextView) this.secondInstrumentTxt.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[5]);
    }

    private final TextView getAuthorsTxt() {
        return (TextView) this.authorsTxt.getValue(this, $$delegatedProperties[6]);
    }

    private final TextView getLastUpdatedTxt() {
        return (TextView) this.lastUpdatedTxt.getValue(this, $$delegatedProperties[7]);
    }

    private final TextView getImageCreditTxt() {
        return (TextView) this.imageCreditTxt.getValue(this, $$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getContentTxt() {
        return (TextView) this.contentTxt.getValue(this, $$delegatedProperties[9]);
    }

    private final ScrollView getScrollView() {
        return (ScrollView) this.scrollView.getValue(this, $$delegatedProperties[10]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getErrorView().setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEmbeddedArticleFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C280572(this));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C280583(null), 3, null);
        getScrollView().setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment.onViewCreated.4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                Integer num;
                if (motionEvent.getAction() == 2 && ((num = NewsFeedEmbeddedArticleFragment.this.lastTouchEvent) == null || num.intValue() != 2)) {
                    NewsFeedEmbeddedArticleFragment.this.getNewsFeedAnalytics().logEmbeddedArticleScroll(NewsFeedEmbeddedArticleFragment.this.content);
                }
                NewsFeedEmbeddedArticleFragment.this.lastTouchEvent = Integer.valueOf(motionEvent.getAction());
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment) {
        newsFeedEmbeddedArticleFragment.getDuxo().refreshEmbeddedArticle();
        return Unit.INSTANCE;
    }

    /* compiled from: NewsFeedEmbeddedArticleFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$2 */
    /* synthetic */ class C280572 extends FunctionReferenceImpl implements Function1<NewsFeedEmbeddedContentViewState, Unit> {
        C280572(Object obj) {
            super(1, obj, NewsFeedEmbeddedArticleFragment.class, "updateViewState", "updateViewState(Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedContentViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NewsFeedEmbeddedContentViewState newsFeedEmbeddedContentViewState) throws Resources.NotFoundException {
            invoke2(newsFeedEmbeddedContentViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NewsFeedEmbeddedContentViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((NewsFeedEmbeddedArticleFragment) this.receiver).updateViewState(p0);
        }
    }

    /* compiled from: NewsFeedEmbeddedArticleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3", m3645f = "NewsFeedEmbeddedArticleFragment.kt", m3646l = {346, 128}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3 */
    static final class C280583 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C280583(Continuation<? super C280583> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NewsFeedEmbeddedArticleFragment.this.new C280583(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C280583) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (androidx.lifecycle.PausingDispatcherKt.whenStarted(r1, r3, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<R> map = NewsFeedEmbeddedArticleFragment.this.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NewsFeedEmbeddedContentViewState.ContentState contentState = ((NewsFeedEmbeddedContentViewState) it).getContentState();
                        return Optional3.asOptional(contentState instanceof NewsFeedEmbeddedContentViewState.ContentState.Success ? (NewsFeedEmbeddedContentViewState.ContentState.Success) contentState : null);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                        return apply((C28055xd2af51be<T, R>) obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Single singleFirstOrError = ObservablesKt.filterIsPresent(map).firstOrError();
                Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
                this.label = 1;
                obj = RxAwait3.await(singleFirstOrError, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment = NewsFeedEmbeddedArticleFragment.this;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((NewsFeedEmbeddedContentViewState.ContentState.Success) obj, newsFeedEmbeddedArticleFragment, null);
            this.label = 2;
        }

        /* compiled from: NewsFeedEmbeddedArticleFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$1", m3645f = "NewsFeedEmbeddedArticleFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NewsFeedEmbeddedContentViewState.ContentState.Success $contentStatus;
            int label;
            final /* synthetic */ NewsFeedEmbeddedArticleFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NewsFeedEmbeddedContentViewState.ContentState.Success success, NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$contentStatus = success;
                this.this$0 = newsFeedEmbeddedArticleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$contentStatus, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        NewsFeedEmbeddedContent content = this.$contentStatus.getContent();
                        this.this$0.getTitleTxt().setText(content.getTitle());
                        RhToolbar rhToolbar = this.this$0.getRhToolbar();
                        Intrinsics.checkNotNull(rhToolbar);
                        rhToolbar.setTitle(content.getSource());
                        PrecomputedTextCompat.Params textMetricsParams = TextViewCompat.getTextMetricsParams(this.this$0.getContentTxt());
                        Intrinsics.checkNotNullExpressionValue(textMetricsParams, "getTextMetricsParams(...)");
                        NewsFeedEmbeddedArticleFragment2 newsFeedEmbeddedArticleFragment2 = new NewsFeedEmbeddedArticleFragment2(this.this$0, content, textMetricsParams, null);
                        this.label = 1;
                        obj = Supervisor3.supervisorScope(newsFeedEmbeddedArticleFragment2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.getMarkwon().setParsedMarkdown(this.this$0.getContentTxt(), (PrecomputedTextCompat) obj);
                } catch (IOException e) {
                    this.this$0.getActivityErrorHandler().invoke2((Throwable) e);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, Markwons.linkClicks(getMarkwon()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedEmbeddedArticleFragment.onStart$lambda$3(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        AnalyticsLogger analytics = newsFeedEmbeddedArticleFragment.getAnalytics();
        Companion companion = INSTANCE;
        String str = ((LegacyFragmentKey.NewsFeedEmbeddedArticle) companion.getArgs((Fragment) newsFeedEmbeddedArticleFragment)).getAnalyticsPrefix() + AnalyticsStrings.BUTTON_GROUP_NEWS_FEED_EMBEDDED_CONTENT_LINK;
        String string2 = newsFeedEmbeddedArticleFragment.getArticleId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        UUID sourceAssetId = ((LegacyFragmentKey.NewsFeedEmbeddedArticle) companion.getArgs((Fragment) newsFeedEmbeddedArticleFragment)).getSourceAssetId();
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, str, string2, url, null, null, null, sourceAssetId != null ? sourceAssetId.toString() : null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        newsFeedEmbeddedArticleFragment.getNewsFeedAnalytics().logEmbeddedArticleLinkClick(newsFeedEmbeddedArticleFragment.content, url);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        String navBackUrl = ((LegacyFragmentKey.NewsFeedEmbeddedArticle) INSTANCE.getArgs((Fragment) this)).getNavBackUrl();
        Uri uri = navBackUrl != null ? Uri.parse(navBackUrl) : null;
        if (uri != null && getNavigator().isDeepLinkSupported(uri)) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = getArticleId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenMessageType() {
        return ((LegacyFragmentKey.NewsFeedEmbeddedArticle) INSTANCE.getArgs((Fragment) this)).getArticleTemplate();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenType() {
        return ((LegacyFragmentKey.NewsFeedEmbeddedArticle) INSTANCE.getArgs((Fragment) this)).getArticleType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(NewsFeedEmbeddedContentViewState viewState) throws Resources.NotFoundException {
        this.content = viewState.getContent();
        NewsFeedEmbeddedContentViewState.ContentState contentState = viewState.getContentState();
        if (Intrinsics.areEqual(contentState, NewsFeedEmbeddedContentViewState.ContentState.Loading.INSTANCE)) {
            getProgressBar().setVisibility(0);
            getErrorView().setVisibility(8);
        } else if (Intrinsics.areEqual(contentState, NewsFeedEmbeddedContentViewState.ContentState.Failed.INSTANCE)) {
            getProgressBar().setVisibility(8);
            getErrorView().setVisibility(0);
        } else {
            if (!(contentState instanceof NewsFeedEmbeddedContentViewState.ContentState.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            getProgressBar().setVisibility(8);
            getErrorView().setVisibility(8);
        }
        updateBannerLogo(viewState);
        NewsFeedEmbeddedContent content = viewState.getContent();
        if (content != null) {
            getAuthorsTxt().setVisibility(!content.getAuthors().isEmpty() ? 0 : 8);
            if (getAuthorsTxt().getVisibility() == 0) {
                getAuthorsTxt().setText(CollectionsKt.joinToString$default(content.getAuthors(), null, null, null, 0, null, null, 63, null));
            }
            getImageCreditTxt().setVisibility(content.getDisplayImageCredit() != null ? 0 : 8);
            if (getImageCreditTxt().getVisibility() == 0) {
                getImageCreditTxt().setText(content.getDisplayImageCredit());
            }
            getLastUpdatedTxt().setText(getString(C27909R.string.news_feed_embedded_content_last_updated, InstantFormatter.NATURAL_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) content.getPublishedAt())));
        }
        NewsFeedMedia headerMedia = viewState.getHeaderMedia();
        if (headerMedia != null) {
            HttpUrl imageUrl = headerMedia.getImageUrl();
            if (imageUrl != null) {
                getHeaderImg().setVisibility(0);
                float dimension = getResources().getDimension(C27909R.dimen.news_feed_embedded_article_max_image_height);
                if (headerMedia.getHeight() > 0.0d) {
                    int iMin = Math.min((int) dimension, (int) (requireView().getWidth() / (headerMedia.getWidth() / headerMedia.getHeight())));
                    getHeaderImg().setMinimumHeight(iMin);
                    getHeaderImg().setMaxHeight(iMin);
                } else {
                    getHeaderImg().setMinimumHeight(0);
                    getHeaderImg().setMaxHeight((int) dimension);
                }
                ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(imageUrl).fit().centerCrop(), getHeaderImg(), null, null, 6, null);
            } else {
                getHeaderImg().setVisibility(8);
            }
        }
        bindInstrument(getFirstInstrumentTxt(), viewState.getContent(), viewState.getFirstRelatedInstrumentAndQuote());
        bindInstrument(getSecondInstrumentTxt(), viewState.getContent(), viewState.getSecondRelatedInstrumentAndQuote());
    }

    private final void bindInstrument(TextView textView, final NewsFeedEmbeddedContent content, final Tuples2<RelatedInstrument, Quote> relatedInstrumentPair) {
        if (relatedInstrumentPair == null) {
            textView.setVisibility(8);
            return;
        }
        final RelatedInstrument relatedInstrumentComponent1 = relatedInstrumentPair.component1();
        Quote quoteComponent2 = relatedInstrumentPair.component2();
        if (textView.getVisibility() != 0) {
            getNewsFeedAnalytics().logEmbeddedArticleInstrumentAppear(content, relatedInstrumentPair.getFirst());
        }
        textView.setVisibility(0);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        textView.setText(getDisplayText(relatedInstrumentPair, resources));
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(textView), Quotes.getDirection(quoteComponent2), null, 2, null);
        OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedEmbeddedArticleFragment.bindInstrument$lambda$10$lambda$9(this.f$0, content, relatedInstrumentPair, relatedInstrumentComponent1);
            }
        });
    }

    private final void updateBannerLogo(NewsFeedEmbeddedContentViewState viewState) {
        NewsFeedEmbeddedContent.BannerLogo bannerLogo = viewState.getBannerLogo();
        if (bannerLogo != null) {
            final RhToolbar rhToolbar = getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            if (rhToolbar.findViewById(C27909R.id.embedded_article_logo_img) == null) {
                final View viewAddCustomView$default = RhToolbar.addCustomView$default(rhToolbar, C27909R.layout.embedded_article_banner_logo, false, 0, 6, null);
                OneShotPreDrawListener.add(viewAddCustomView$default, new Runnable() { // from class: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$updateBannerLogo$lambda$8$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewAddCustomView$default.setTranslationX(-((rhToolbar.getWidth() - viewAddCustomView$default.getWidth()) / 2));
                    }
                });
                ImageView imageView = (ImageView) rhToolbar.findViewById(C27909R.id.embedded_article_logo_img);
                ImageLoader.ImageRequest imageRequestCenterInside = getImageLoader().load(bannerLogo.getImageUrl()).fit().centerInside();
                Intrinsics.checkNotNull(imageView);
                ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestCenterInside, imageView, null, null, 6, null);
            }
            int color = bannerLogo.getColor();
            requireActivity().getWindow().setStatusBarColor(Colors.adjustColorForStatusBar(color));
            ScarletManager2.overrideAttribute(rhToolbar, R.attr.backgroundTint, ResourceValue.INSTANCE.getEMPTY());
            rhToolbar.setBackgroundTintList(ColorStateList.valueOf(color));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInstrument$lambda$10$lambda$9(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment, NewsFeedEmbeddedContent newsFeedEmbeddedContent, Tuples2 tuples2, RelatedInstrument relatedInstrument) {
        newsFeedEmbeddedArticleFragment.getNewsFeedAnalytics().logEmbeddedArticleInstrumentClick(newsFeedEmbeddedContent, (RelatedInstrument) tuples2.getFirst());
        Navigator navigator = newsFeedEmbeddedArticleFragment.getNavigator();
        Context contextRequireContext = newsFeedEmbeddedArticleFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(relatedInstrument.getId(), null, null, InstrumentDetailSource.NEWS_FEED, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
        return Unit.INSTANCE;
    }

    private final String getDisplayText(Tuples2<RelatedInstrument, Quote> tuples2, Resources resources) throws Resources.NotFoundException {
        RelatedInstrument relatedInstrumentComponent1 = tuples2.component1();
        Quote quoteComponent2 = tuples2.component2();
        if (quoteComponent2 == null) {
            return relatedInstrumentComponent1.getSymbol();
        }
        String string2 = resources.getString(C20334R.string.news_feed_related_instrument_display_text, relatedInstrumentComponent1.getSymbol(), Formats.getPercentDeltaFormat().format(quoteComponent2.getTodaysPercentChange()));
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* compiled from: NewsFeedEmbeddedArticleFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedEmbeddedArticle;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/search/newsfeed/embeddedarticle/NewsFeedEmbeddedArticleFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.NewsFeedEmbeddedArticle>, FragmentWithArgsCompanion<NewsFeedEmbeddedArticleFragment, LegacyFragmentKey.NewsFeedEmbeddedArticle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.NewsFeedEmbeddedArticle getArgs(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment) {
            return (LegacyFragmentKey.NewsFeedEmbeddedArticle) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, newsFeedEmbeddedArticleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewsFeedEmbeddedArticleFragment newInstance(LegacyFragmentKey.NewsFeedEmbeddedArticle newsFeedEmbeddedArticle) {
            return (NewsFeedEmbeddedArticleFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, newsFeedEmbeddedArticle);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment, LegacyFragmentKey.NewsFeedEmbeddedArticle newsFeedEmbeddedArticle) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, newsFeedEmbeddedArticleFragment, newsFeedEmbeddedArticle);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.NewsFeedEmbeddedArticle key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return NewsFeedEmbeddedArticleFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
