package com.robinhood.android.newsfeed.p200ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.newsfeed.extensions.LoggedCustomTabs2;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.p200ui.NewsFeedArticleView;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEmbeddedArticleView;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: AssetNewsFeedView.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002AD\b\u0007\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002Z[B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010F\u001a\u00020GH\u0014J\b\u0010H\u001a\u00020GH\u0014J\u0010\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020\u0002H\u0016J\u0018\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u000203H\u0016J\u001a\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010Q\u001a\u00020GH\u0016J\b\u0010R\u001a\u00020GH\u0016J,\u0010S\u001a\u00020G2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020U2\u0006\u0010>\u001a\u00020?R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R&\u0010-\u001a\u001a\u0012\u0004\u0012\u00020/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000201000.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u0010\u0010;\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0004\n\u0002\u0010BR\u0010\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0004\n\u0002\u0010ER\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020WX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010Y¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView;", "Lcom/robinhood/android/common/ui/view/ListWithMoreView;", "Lcom/robinhood/android/newsfeed/model/Content;", "Landroid/view/View;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "getLoggedCustomTabs", "()Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "setLoggedCustomTabs", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "Lkotlin/Lazy;", "eventLogScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getEventLogScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "sentAppearAnalytics", "", "Ljava/util/UUID;", "Lkotlin/Pair;", "", "articleViewType", "", "getArticleViewType", "()I", "setArticleViewType", "(I)V", "embeddedArticleViewType", "getEmbeddedArticleViewType", "setEmbeddedArticleViewType", "assetId", "assetSymbol", "", "isCrypto", "", "articleCallbacks", "com/robinhood/android/newsfeed/ui/AssetNewsFeedView$articleCallbacks$1", "Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView$articleCallbacks$1;", "embeddedArticleCallbacks", "com/robinhood/android/newsfeed/ui/AssetNewsFeedView$embeddedArticleCallbacks$1", "Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView$embeddedArticleCallbacks$1;", "onAttachedToWindow", "", "onDetachedFromWindow", "getViewType", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "createView", "parent", "Landroid/view/ViewGroup;", "viewType", "bindView", "view", "onMoreClicked", "onMoreAppeared", "bind", "content", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "ViewType", "Companion", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AssetNewsFeedView extends Hammer_AssetNewsFeedView<Content, View> implements UiCallbacks.Clearable {
    private static final String ANALYTICS_PREFIX = "sdp";
    private static final String SCREEN_NAME = "InstrumentNewsFeedView";
    public AnalyticsLogger analytics;
    private final AssetNewsFeedView2 articleCallbacks;
    private int articleViewType;
    private UUID assetId;
    private String assetSymbol;
    private final DiffUtil.ItemCallback<Content> diffCallback;
    private final AssetNewsFeedView4 embeddedArticleCallbacks;
    private int embeddedArticleViewType;
    public EventLogger eventLogger;
    private boolean isCrypto;
    public LoggedCustomTabs loggedCustomTabs;
    public Navigator navigator;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;
    private final Map<UUID, Tuples2<Content, Long>> sentAppearAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.robinhood.android.newsfeed.ui.AssetNewsFeedView$articleCallbacks$1] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.robinhood.android.newsfeed.ui.AssetNewsFeedView$embeddedArticleCallbacks$1] */
    public AssetNewsFeedView(final Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetNewsFeedView.newsFeedAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        this.sentAppearAnalytics = new LinkedHashMap();
        this.articleViewType = ViewType.NEWS_FEED_ARTICLE_ROW_VIEW.ordinal();
        this.embeddedArticleViewType = ViewType.NEWS_FEED_EMBEDDED_ARTICLE_ROW_VIEW.ordinal();
        this.articleCallbacks = new NewsFeedArticleView.Callbacks() { // from class: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$articleCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedArticleView.Callbacks
            public void onRelatedInstrumentClick(Content.Article article, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.this$0.getNewsFeedAnalytics().logContentRelatedInstrumentClick(article, instrument, false);
                Navigator.DefaultImpls.showFragment$default(this.this$0.getNavigator(), context, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.ASSET_NEWS, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, false, null, false, false, null, null, 4060, null);
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedArticleView.Callbacks
            public void onRelatedAssetClick(Content.Article article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                Navigator navigator = this.this$0.getNavigator();
                Context context2 = context;
                FragmentKey fragmentKey = asset.getFragmentKey(InstrumentDetailSource.ASSET_NEWS.getServerValue(), null);
                if (fragmentKey == null) {
                    return;
                }
                Navigator.DefaultImpls.showFragment$default(navigator, context2, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            }
        };
        this.embeddedArticleCallbacks = new NewsFeedEmbeddedArticleView.Callbacks() { // from class: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$embeddedArticleCallbacks$1
            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView.Callbacks
            public void onRelatedInstrumentClick(Content.EmbeddedArticle article, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.this$0.getNewsFeedAnalytics().logContentRelatedInstrumentClick(article, instrument, false);
                Navigator.DefaultImpls.showFragment$default(this.this$0.getNavigator(), context, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.ASSET_NEWS, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, false, null, false, false, null, null, 4060, null);
            }

            @Override // com.robinhood.android.newsfeed.ui.NewsFeedEmbeddedArticleView.Callbacks
            public void onRelatedAssetClick(Content.Article article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                Navigator navigator = this.this$0.getNavigator();
                Context context2 = context;
                FragmentKey fragmentKey = asset.getFragmentKey(InstrumentDetailSource.ASSET_NEWS.getServerValue(), null);
                if (fragmentKey == null) {
                    return;
                }
                Navigator.DefaultImpls.showFragment$default(navigator, context2, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            }
        };
        setMaxNumItemsShown(3);
        this.diffCallback = DiffCallbacks.INSTANCE.byEquality(new AssetNewsFeedView3(this));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssetNewsFeedView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "NEWS_FEED_ARTICLE_ROW_VIEW", "NEWS_FEED_EMBEDDED_ARTICLE_ROW_VIEW", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType NEWS_FEED_ARTICLE_ROW_VIEW = new ViewType("NEWS_FEED_ARTICLE_ROW_VIEW", 0);
        public static final ViewType NEWS_FEED_EMBEDDED_ARTICLE_ROW_VIEW = new ViewType("NEWS_FEED_EMBEDDED_ARTICLE_ROW_VIEW", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{NEWS_FEED_ARTICLE_ROW_VIEW, NEWS_FEED_EMBEDDED_ARTICLE_ROW_VIEW};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
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

    public final LoggedCustomTabs getLoggedCustomTabs() {
        LoggedCustomTabs loggedCustomTabs = this.loggedCustomTabs;
        if (loggedCustomTabs != null) {
            return loggedCustomTabs;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loggedCustomTabs");
        return null;
    }

    public final void setLoggedCustomTabs(LoggedCustomTabs loggedCustomTabs) {
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "<set-?>");
        this.loggedCustomTabs = loggedCustomTabs;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$0(AssetNewsFeedView assetNewsFeedView) {
        AnalyticsLogger analytics = assetNewsFeedView.getAnalytics();
        EventLogger eventLogger = assetNewsFeedView.getEventLogger();
        Screen.Name eventLogScreenName = assetNewsFeedView.getEventLogScreenName();
        UUID uuid = assetNewsFeedView.assetId;
        String string2 = uuid != null ? uuid.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        return new NewsFeedAnalytics(analytics, ANALYTICS_PREFIX, eventLogger, new Screen(eventLogScreenName, null, string2, null, 10, null));
    }

    private final Screen.Name getEventLogScreenName() {
        return this.isCrypto ? Screen.Name.CRYPTO_DETAIL_PAGE : Screen.Name.STOCK_DETAIL_PAGE;
    }

    public final int getArticleViewType() {
        return this.articleViewType;
    }

    public final void setArticleViewType(int i) {
        this.articleViewType = i;
    }

    public final int getEmbeddedArticleViewType() {
        return this.embeddedArticleViewType;
    }

    public final void setEmbeddedArticleViewType(int i) {
        this.embeddedArticleViewType = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        loggedCustomTabs.bind(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        loggedCustomTabs.unbind(context);
        Iterator<T> it = this.sentAppearAnalytics.values().iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            getNewsFeedAnalytics().logContentDisappear((Content) tuples2.component1(), SystemClock.elapsedRealtime() - ((Number) tuples2.component2()).longValue(), false);
        }
        this.sentAppearAnalytics.clear();
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public int getViewType(Content item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof Content.Article) {
            return this.articleViewType;
        }
        if (item instanceof Content.EmbeddedArticle) {
            return this.embeddedArticleViewType;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
        throw new ExceptionsH();
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public View createView(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == this.articleViewType) {
            NewsFeedArticleView newsFeedArticleViewInflate = NewsFeedArticleView.INSTANCE.inflate(parent);
            newsFeedArticleViewInflate.setCallbacks(this.articleCallbacks);
            return newsFeedArticleViewInflate;
        }
        if (viewType == this.embeddedArticleViewType) {
            NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleViewInflate = NewsFeedEmbeddedArticleView.INSTANCE.inflate(parent);
            newsFeedEmbeddedArticleViewInflate.setCallbacks(this.embeddedArticleCallbacks);
            return newsFeedEmbeddedArticleViewInflate;
        }
        Preconditions.INSTANCE.failUnknownEnumKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bindView(final View view, final Content item) {
        String str;
        String str2;
        String str3;
        Content contentCopy$default;
        Intrinsics.checkNotNullParameter(view, "view");
        if (item == null) {
            return;
        }
        int itemPosition = getItemPosition(item);
        if (itemPosition == 0) {
            str = EducationTourElementIds.NEWS_ROW_0_ELEMENT_ID;
        } else if (itemPosition == 1) {
            str = EducationTourElementIds.NEWS_ROW_1_ELEMENT_ID;
        } else {
            str = itemPosition != 2 ? null : EducationTourElementIds.NEWS_ROW_2_ELEMENT_ID;
        }
        ViewsKt.setEducationTourId(view, str);
        if (itemPosition == 0) {
            str2 = EducationTourElementIds.NEWS_TICKER_ROW_0_ELEMENT_ID;
        } else if (itemPosition == 1) {
            str2 = EducationTourElementIds.NEWS_TICKER_ROW_1_ELEMENT_ID;
        } else if (itemPosition == 2) {
            str2 = EducationTourElementIds.NEWS_TICKER_ROW_2_ELEMENT_ID;
        } else {
            str3 = null;
            if (item instanceof Content.Article) {
                contentCopy$default = item instanceof Content.EmbeddedArticle ? Content.EmbeddedArticle.copy$default((Content.EmbeddedArticle) item, null, 0, null, null, null, null, null, str3, null, null, null, false, 3967, null) : item;
            } else {
                Content.Article article = (Content.Article) item;
                contentCopy$default = article.copy((64511 & 1) != 0 ? article.id : null, (64511 & 2) != 0 ? article.rank : 0, (64511 & 4) != 0 ? article.parentElement : null, (64511 & 8) != 0 ? article.analyticsContentType : null, (64511 & 16) != 0 ? article.title : null, (64511 & 32) != 0 ? article.url : null, (64511 & 64) != 0 ? article.firstInstrument : null, (64511 & 128) != 0 ? article.secondInstrument : null, (64511 & 256) != 0 ? article.firstAsset : null, (64511 & 512) != 0 ? article.secondAsset : null, (64511 & 1024) != 0 ? article.relatedInstrumentEducationTourId : str3, (64511 & 2048) != 0 ? article.source : null, (64511 & 4096) != 0 ? article.publishedAt : null, (64511 & 8192) != 0 ? article.previewImageUrl : null, (64511 & 16384) != 0 ? article.isHero : false, (64511 & 32768) != 0 ? article.logoAssetName : null);
            }
            ((Bindable) view).bind(contentCopy$default);
            if (!this.sentAppearAnalytics.containsKey(item.getId())) {
                this.sentAppearAnalytics.put(item.getId(), Tuples4.m3642to(item, Long.valueOf(SystemClock.elapsedRealtime())));
                getNewsFeedAnalytics().logContentAppear(item, false);
                if (!isLaidOut() || isLayoutRequested()) {
                    addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$bindView$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view2.removeOnLayoutChangeListener(this);
                            com.robinhood.android.autoeventlogging.ViewsKt.logAppear$default(view, Boolean.FALSE, false, 2, null);
                        }
                    });
                } else {
                    com.robinhood.android.autoeventlogging.ViewsKt.logAppear$default(view, Boolean.FALSE, false, 2, null);
                }
            }
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetNewsFeedView.bindView$lambda$5(item, this);
                }
            });
        }
        str3 = str2;
        if (item instanceof Content.Article) {
        }
        ((Bindable) view).bind(contentCopy$default);
        if (!this.sentAppearAnalytics.containsKey(item.getId())) {
        }
        OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.newsfeed.ui.AssetNewsFeedView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetNewsFeedView.bindView$lambda$5(item, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(Content content, AssetNewsFeedView assetNewsFeedView) {
        AssetNewsFeedView assetNewsFeedView2;
        if (content instanceof Content.Article) {
            LoggedCustomTabs loggedCustomTabs = assetNewsFeedView.getLoggedCustomTabs();
            Context context = assetNewsFeedView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LoggedCustomTabs2.showNewsFeedArticle(loggedCustomTabs, context, (Content.Article) content, ANALYTICS_PREFIX, SCREEN_NAME);
            assetNewsFeedView2 = assetNewsFeedView;
        } else if (content instanceof Content.EmbeddedArticle) {
            Navigator navigator = assetNewsFeedView.getNavigator();
            Context context2 = assetNewsFeedView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Content.EmbeddedArticle embeddedArticle = (Content.EmbeddedArticle) content;
            UUID id = embeddedArticle.getId();
            String template = embeddedArticle.getParentElement().getTemplate();
            String analyticsContentType = embeddedArticle.getAnalyticsContentType();
            assetNewsFeedView2 = assetNewsFeedView;
            Navigator.DefaultImpls.showFragment$default(navigator, context2, new LegacyFragmentKey.NewsFeedEmbeddedArticle(id, template, analyticsContentType, ANALYTICS_PREFIX, assetNewsFeedView2.assetId, null, 32, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        } else {
            if (!(content instanceof Content.Instrument) && !(content instanceof Content.Video) && !(content instanceof Content.EducationSeries) && !(content instanceof Content.MarketUpdates) && !(content instanceof Content.MarketIndicator) && !(content instanceof Content.ListPreview)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(content);
            throw new ExceptionsH();
        }
        assetNewsFeedView2.getNewsFeedAnalytics().logContentClick(content, false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void onMoreClicked() {
        getNewsFeedAnalytics().logShowMoreClick(this.isCrypto);
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UUID uuid = this.assetId;
        Intrinsics.checkNotNull(uuid);
        String str = this.assetSymbol;
        Intrinsics.checkNotNull(str);
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.NewsFeedAsset(uuid, str, this.isCrypto), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void onMoreAppeared() {
        getNewsFeedAnalytics().logShowMoreAppear(this.isCrypto);
    }

    public final void bind(UUID assetId, String assetSymbol, List<? extends Content> content, boolean isCrypto) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
        Intrinsics.checkNotNullParameter(content, "content");
        this.assetId = assetId;
        this.assetSymbol = assetSymbol;
        this.isCrypto = isCrypto;
        setData(content.subList(0, RangesKt.coerceAtMost(content.size(), getMaxNumItemsShown())), content.size());
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public DiffUtil.ItemCallback<Content> getDiffCallback() {
        return this.diffCallback;
    }

    /* compiled from: AssetNewsFeedView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/newsfeed/ui/AssetNewsFeedView;", "<init>", "()V", "ANALYTICS_PREFIX", "", "SCREEN_NAME", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AssetNewsFeedView> {
        private final /* synthetic */ Inflater<AssetNewsFeedView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AssetNewsFeedView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AssetNewsFeedView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20334R.layout.include_news_feed_view);
        }
    }
}
