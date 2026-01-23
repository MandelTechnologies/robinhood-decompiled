package com.robinhood.android.search.newsfeed.asset;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.newsfeed.extensions.LoggedCustomTabs2;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.databinding.FragmentNewsFeedAssetBinding;
import com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter;
import com.robinhood.android.util.style.DesignSystemLegacyShim;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NewsFeedAssetFragment.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020NH\u0016J\u0012\u0010O\u001a\u00020I2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u001a\u0010R\u001a\u00020I2\u0006\u0010S\u001a\u00020T2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010U\u001a\u00020IH\u0016J\b\u0010V\u001a\u00020IH\u0016J\b\u0010W\u001a\u00020IH\u0016J\b\u0010X\u001a\u00020IH\u0016J\u0018\u0010_\u001a\u00020I2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020DH\u0016J \u0010c\u001a\u00020I2\u0006\u0010`\u001a\u00020a2\u0006\u0010d\u001a\u00020e2\u0006\u0010b\u001a\u00020DH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b9\u0010:R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020@0?X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020@0BX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010ER\u0014\u0010F\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0014\u0010Y\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\¨\u0006g"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "getLoggedCustomTabs", "()Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "setLoggedCustomTabs", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetDuxo;", "getDuxo", "()Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetDuxo;", "duxo$delegate", "assetId", "Ljava/util/UUID;", "getAssetId", "()Ljava/util/UUID;", "binding", "Lcom/robinhood/android/search/databinding/FragmentNewsFeedAssetBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/FragmentNewsFeedAssetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "adapter", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter;", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/android/newsfeed/model/Element;", "visibleAutoLoggableViewManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "isCrypto", "", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onStop", "onDestroy", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "onContentClick", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "inCarousel", "onContentRelatedInstrumentClick", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedAssetFragment extends BaseFragment implements NewsFeedElementAdapter.Callbacks, AutoLoggableFragment {
    private static final String ANALYTICS_PREFIX = "equity_news";
    private static final String CRYPTO_SCREEN_NAME = "CRYPTO_NEWSFEED";
    private static final String STOCK_SCREEN_NAME = "STOCK_NEWSFEED";
    private final NewsFeedElementAdapter adapter;
    public AnalyticsLogger analytics;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public LoggedCustomTabs loggedCustomTabs;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;
    private VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager;
    private VisibleItemsManager<UUID, Element> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedAssetFragment.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/FragmentNewsFeedAssetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedAssetFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentAppear(Content content) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onCarouselContentAppear(this, content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentClick(Content content) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onCarouselContentClick(this, content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentDisappear(Content content, long j) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onCarouselContentDisappear(this, content, j);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentRelatedAssetClick(Content content, RelatedAsset relatedAsset, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onContentRelatedAssetClick(this, content, relatedAsset, z);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onEducationHomeEntryPointClick() {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onEducationHomeEntryPointClick(this);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onEducationLessonsAppear(List<EducationLessonPreview> list) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onEducationLessonsAppear(this, list);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onListsChipContentAppear(Content.ListPreview listPreview) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onListsChipContentAppear(this, listPreview);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onListsChipContentClick(Content.ListPreview listPreview) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onListsChipContentClick(this, listPreview);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onToggleVideoAudioAppear(Content.Video video, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onToggleVideoAudioAppear(this, video, z);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onToggleVideoAudioClick(Content.Video video, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onToggleVideoAudioClick(this, video, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedAssetFragment() {
        super(C27909R.layout.fragment_news_feed_asset);
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedAssetFragment.newsFeedAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, NewsFeedAssetDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, NewsFeedAssetFragment2.INSTANCE);
        this.recyclerView = bindView(C27909R.id.news_feed_asset_recycler_view);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        NewsFeedElementAdapter newsFeedElementAdapter = new NewsFeedElementAdapter(lifecycle, null, 2, 0 == true ? 1 : 0);
        newsFeedElementAdapter.setCallbacks(this);
        this.adapter = newsFeedElementAdapter;
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

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = get_isCrypto() ? Screen.Name.CRYPTO_NEWSFEED : Screen.Name.STOCK_NEWSFEED;
        String string2 = getAssetId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$0(NewsFeedAssetFragment newsFeedAssetFragment) {
        return new NewsFeedAnalytics(newsFeedAssetFragment.getAnalytics(), ANALYTICS_PREFIX, newsFeedAssetFragment.getEventLogger(), newsFeedAssetFragment.getEventScreen());
    }

    private final NewsFeedAssetDuxo getDuxo() {
        return (NewsFeedAssetDuxo) this.duxo.getValue();
    }

    private final UUID getAssetId() {
        return ((LegacyFragmentKey.NewsFeedAsset) INSTANCE.getArgs((Fragment) this)).getAssetId();
    }

    private final FragmentNewsFeedAssetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentNewsFeedAssetBinding) value;
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        return ((LegacyFragmentKey.NewsFeedAsset) INSTANCE.getArgs((Fragment) this)).getIsCrypto();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return !get_isCrypto() || getAppType() == AppType.RHC;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay(DesignSystemLegacyShim.INSTANCE, Boolean.FALSE);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C27909R.string.news_feed_asset_title, ((LegacyFragmentKey.NewsFeedAsset) INSTANCE.getArgs((Fragment) this)).getAssetSymbol()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = NewsFeedAssetFragment.this.visibleItemsManager;
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = null;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager2 = NewsFeedAssetFragment.this.visibleAutoLoggableViewManager;
                if (visibleAutoLoggableViewManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
                } else {
                    visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
                }
                visibleAutoLoggableViewManager.update();
            }
        });
        LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        loggedCustomTabs.bind(contextRequireContext);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            FrameLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        RecyclerView.ItemAnimator itemAnimator = getRecyclerView().getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        bindAdapter(getRecyclerView(), this.adapter);
        RecyclerView recyclerView = getRecyclerView();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new NewsFeedElementAdapter.PaddingItemDecoration(contextRequireContext));
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        VisibleItemsManager<UUID, Element> visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedAssetFragment.onViewCreated$lambda$3(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$4(this.f$0, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$5((Element) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager.getItemAppearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$6(this.f$0, (Element) obj);
            }
        });
        VisibleItemsManager<UUID, Element> visibleItemsManager2 = this.visibleItemsManager;
        if (visibleItemsManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager2 = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager2.getItemDisappearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$7(this.f$0, (VisibleItemsManager.Data) obj);
            }
        });
        RecyclerView.LayoutManager layoutManager2 = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2);
        this.visibleAutoLoggableViewManager = new VisibleAutoLoggableViewManager<>(layoutManager2, new Function0() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedAssetFragment.onViewCreated$lambda$8(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$9(this.f$0, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$10((Element) obj);
            }
        }, false, false, 48, null);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(getRecyclerView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onViewCreated$lambda$11(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$3(NewsFeedAssetFragment newsFeedAssetFragment) {
        return newsFeedAssetFragment.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Element onViewCreated$lambda$4(NewsFeedAssetFragment newsFeedAssetFragment, int i) {
        Element item = newsFeedAssetFragment.adapter.getItem(i);
        if (item instanceof Element.Regular) {
            return (Element.Regular) item;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onViewCreated$lambda$5(Element VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return ((Element.Regular) VisibleItemsManager).getContent().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(NewsFeedAssetFragment newsFeedAssetFragment, Element item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof Element.Regular) {
            newsFeedAssetFragment.getNewsFeedAnalytics().logContentAppear(((Element.Regular) item).getContent(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(NewsFeedAssetFragment newsFeedAssetFragment, VisibleItemsManager.Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Element element = (Element) data.getItem();
        if (element instanceof Element.Regular) {
            newsFeedAssetFragment.getNewsFeedAnalytics().logContentDisappear(((Element.Regular) element).getContent(), data.getDurationVisible(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$8(NewsFeedAssetFragment newsFeedAssetFragment) {
        return newsFeedAssetFragment.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Element onViewCreated$lambda$9(NewsFeedAssetFragment newsFeedAssetFragment, int i) {
        Element item = newsFeedAssetFragment.adapter.getItem(i);
        if (item instanceof Element.Regular) {
            return (Element.Regular) item;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onViewCreated$lambda$10(Element VisibleAutoLoggableViewManager) {
        Intrinsics.checkNotNullParameter(VisibleAutoLoggableViewManager, "$this$VisibleAutoLoggableViewManager");
        return ((Element.Regular) VisibleAutoLoggableViewManager).getContent().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(NewsFeedAssetFragment newsFeedAssetFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<UUID, Element> visibleItemsManager = newsFeedAssetFragment.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = newsFeedAssetFragment.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.update();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.update();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.asset.NewsFeedAssetFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedAssetFragment.onResume$lambda$12(this.f$0, (NewsFeedAssetViewState) obj);
            }
        });
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ToolbarScrollAnimator.subscribe$default(new ToolbarScrollAnimator(rhToolbar, getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null), getRecyclerView(), this, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(NewsFeedAssetFragment newsFeedAssetFragment, NewsFeedAssetViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        newsFeedAssetFragment.adapter.submitList(viewState.getElements());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.clear();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.clear();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        loggedCustomTabs.unbind(contextRequireContext);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return get_isCrypto() ? CRYPTO_SCREEN_NAME : STOCK_SCREEN_NAME;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = getAssetId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentClick(Content content, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (content instanceof Content.Article) {
            LoggedCustomTabs2.showNewsFeedArticle(getLoggedCustomTabs(), contextRequireContext, (Content.Article) content, ANALYTICS_PREFIX, getScreenName());
        } else if (content instanceof Content.EmbeddedArticle) {
            Content.EmbeddedArticle embeddedArticle = (Content.EmbeddedArticle) content;
            Navigator.DefaultImpls.showFragment$default(getNavigator(), contextRequireContext, new LegacyFragmentKey.NewsFeedEmbeddedArticle(embeddedArticle.getId(), embeddedArticle.getParentElement().getTemplate(), embeddedArticle.getAnalyticsContentType(), ANALYTICS_PREFIX, getAssetId(), null, 32, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        } else {
            if (!(content instanceof Content.Instrument) && !(content instanceof Content.Video) && !(content instanceof Content.EducationSeries) && !(content instanceof Content.MarketUpdates) && !(content instanceof Content.MarketIndicator) && !(content instanceof Content.ListPreview)) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(content);
            throw new ExceptionsH();
        }
        getNewsFeedAnalytics().logContentClick(content, inCarousel);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        getNewsFeedAnalytics().logContentRelatedInstrumentClick(content, instrument, inCarousel);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.NEWS_FEED, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
    }

    /* compiled from: NewsFeedAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewsFeedAsset;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/search/newsfeed/asset/NewsFeedAssetFragment;", "<init>", "()V", "STOCK_SCREEN_NAME", "", "CRYPTO_SCREEN_NAME", "ANALYTICS_PREFIX", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.NewsFeedAsset>, FragmentWithArgsCompanion<NewsFeedAssetFragment, LegacyFragmentKey.NewsFeedAsset> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.NewsFeedAsset getArgs(NewsFeedAssetFragment newsFeedAssetFragment) {
            return (LegacyFragmentKey.NewsFeedAsset) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, newsFeedAssetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewsFeedAssetFragment newInstance(LegacyFragmentKey.NewsFeedAsset newsFeedAsset) {
            return (NewsFeedAssetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, newsFeedAsset);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewsFeedAssetFragment newsFeedAssetFragment, LegacyFragmentKey.NewsFeedAsset newsFeedAsset) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, newsFeedAssetFragment, newsFeedAsset);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.NewsFeedAsset key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return NewsFeedAssetFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
