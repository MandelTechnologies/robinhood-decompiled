package com.robinhood.android.search.newsfeed.videoplayer;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import androidx.media3.p014ui.R$id;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.BetterDividerItemDecoration;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView;
import com.robinhood.android.search.newsfeed.videoplayer.extensions.ExoPlayers;
import com.robinhood.android.search.newsfeed.videoplayer.extensions.MuxWrappers;
import com.robinhood.android.search.newsfeed.videoplayer.mux.MuxWrapper;
import com.robinhood.android.search.newsfeed.view.util.DummyErrorMessageProvider;
import com.robinhood.android.search.newsfeed.view.util.LinearSnapToTopHelper;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SmoothTopScroller;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* compiled from: NewsFeedPortraitVideoPlayerFragment.kt */
@Metadata(m3635d1 = {"\u0000á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001V\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0003{|}B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0016J\u0012\u0010\\\u001a\u00020Y2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J&\u0010_\u001a\u0004\u0018\u00010&2\u0006\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010R2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\u001a\u0010c\u001a\u00020Y2\u0006\u0010d\u001a\u00020&2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\b\u0010e\u001a\u00020YH\u0016J\b\u0010f\u001a\u00020YH\u0016J\b\u0010g\u001a\u00020YH\u0016J\b\u0010h\u001a\u00020YH\u0016J\b\u0010i\u001a\u00020YH\u0016J\u000e\u0010j\u001a\u00020Y2\u0006\u0010k\u001a\u00020lJ\u0016\u0010m\u001a\u00020Y2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020<J\u0010\u0010q\u001a\u00020Y2\u0006\u0010r\u001a\u00020oH\u0002J\u0018\u0010s\u001a\u0002052\u0006\u0010d\u001a\u0002072\u0006\u0010Z\u001a\u00020[H\u0003J$\u0010t\u001a\u00020Y2\u0006\u0010u\u001a\u0002072\u0006\u0010v\u001a\u00020&2\n\u0010w\u001a\u00060xj\u0002`yH\u0003J\b\u0010z\u001a\u00020YH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b1\u00102R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020<\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020<\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020@8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001b\u0010H\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR\u000e\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020<0QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u00020VX\u0082\u0004¢\u0006\u0004\n\u0002\u0010W¨\u0006~"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "currentVideoId", "Ljava/util/UUID;", "getCurrentVideoId", "()Ljava/util/UUID;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "getUserAgentProvider", "()Lcom/robinhood/shared/user/agent/UserAgentProvider;", "setUserAgentProvider", "(Lcom/robinhood/shared/user/agent/UserAgentProvider;)V", "callbacks", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "progressBar", "Landroid/view/View;", "getProgressBar", "()Landroid/view/View;", "progressBar$delegate", "errorView", "Lcom/robinhood/android/common/view/ErrorView;", "getErrorView", "()Lcom/robinhood/android/common/view/ErrorView;", "errorView$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "playerView", "Landroidx/media3/ui/PlayerView;", "activeItemView", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoViewerItemView;", "muxWrapper", "Lcom/robinhood/android/search/newsfeed/videoplayer/mux/MuxWrapper;", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "visibleAutoLoggableViewManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "<set-?>", "", "autoPlayOnResume", "getAutoPlayOnResume", "()Z", "setAutoPlayOnResume", "(Z)V", "autoPlayOnResume$delegate", "Lkotlin/properties/ReadWriteProperty;", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerAdapter;", "lastItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/view/ViewGroup;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "videoItemCallbacks", "com/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$videoItemCallbacks$1", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$videoItemCallbacks$1;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "bind", "viewState", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState;", "scrollToPosition", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "video", "updateAutoplayVideo", "state", "inflatePlayerView", "setControlButtonListener", "parentView", "controlButtonView", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "resetAutoplayingVideoView", "Callbacks", "PlayNextVideoListener", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedPortraitVideoPlayerFragment extends BaseFragment implements AutoLoggableFragment {
    private static final String ANALYTICS_PREFIX = "theater_mode";
    private static final String PLAYER_NAME = "theater-mode";
    private NewsFeedVideoViewerItemView activeItemView;
    private final NewsFeedVideoPlayerAdapter adapter;
    public AnalyticsLogger analytics;

    /* renamed from: autoPlayOnResume$delegate, reason: from kotlin metadata */
    private final Interfaces3 autoPlayOnResume;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final CompositeAdapter compositeAdapter;

    /* renamed from: errorView$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorView;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final SingleItemAdapter<ViewGroup, Video> lastItemAdapter;
    private final MuxWrapper muxWrapper;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;
    private PlayerView playerView;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressBar;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;
    public UserAgentProvider userAgentProvider;
    private final NewsFeedPortraitVideoPlayerFragment8 videoItemCallbacks;
    private VisibleAutoLoggableViewManager<UUID, Video> visibleAutoLoggableViewManager;
    private VisibleItemsManager<UUID, Video> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedPortraitVideoPlayerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedPortraitVideoPlayerFragment.class, "progressBar", "getProgressBar()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedPortraitVideoPlayerFragment.class, "errorView", "getErrorView()Lcom/robinhood/android/common/view/ErrorView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedPortraitVideoPlayerFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NewsFeedPortraitVideoPlayerFragment.class, "autoPlayOnResume", "getAutoPlayOnResume()Z", 0))};
    public static final int $stable = 8;

    /* compiled from: NewsFeedPortraitVideoPlayerFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$Callbacks;", "", "onReplayClick", "", "video", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "onVideoEnded", "onRetryClick", "getSavedPlaybackPosition", "", "videoId", "Ljava/util/UUID;", "(Ljava/util/UUID;)Ljava/lang/Long;", "setSavedPlaybackPosition", "position", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        Long getSavedPlaybackPosition(UUID videoId);

        void onReplayClick(Video video);

        void onRetryClick();

        void onVideoEnded(Video video);

        void setSavedPlaybackPosition(UUID videoId, long position);
    }

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

    /* JADX WARN: Type inference failed for: r0v2, types: [com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$videoItemCallbacks$1] */
    public NewsFeedPortraitVideoPlayerFragment() {
        super(0);
        this.eventScreen = new Screen(Screen.Name.BROWSE_NEWSFEED_THEATRE, null, null, null, 14, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.progressBar = bindView(C27909R.id.news_feed_video_progress_bar);
        this.errorView = bindView(C27909R.id.news_feed_video_error_retry_view);
        this.recyclerView = bindView(C27909R.id.news_feed_video_recycler_view);
        this.muxWrapper = new MuxWrapper();
        this.autoPlayOnResume = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[4]);
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedPortraitVideoPlayerFragment.newsFeedAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        NewsFeedVideoPlayerAdapter newsFeedVideoPlayerAdapter = new NewsFeedVideoPlayerAdapter(new Function2() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewsFeedPortraitVideoPlayerFragment.adapter$lambda$1(this.f$0, (NewsFeedVideoViewerItemView) obj, (Video) obj2);
            }
        });
        this.adapter = newsFeedVideoPlayerAdapter;
        SingleItemAdapter<ViewGroup, Video> singleItemAdapterM2991of = SingleItemAdapter.INSTANCE.m2991of(C27909R.layout.video_viewer_last_item, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$lastItemAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Video) obj).getId();
            }
        }), new Function2() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewsFeedPortraitVideoPlayerFragment.lastItemAdapter$lambda$2(this.f$0, (ViewGroup) obj, (Video) obj2);
            }
        });
        this.lastItemAdapter = singleItemAdapterM2991of;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{newsFeedVideoPlayerAdapter, singleItemAdapterM2991of});
        this.videoItemCallbacks = new NewsFeedVideoViewerItemView.Callbacks() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$videoItemCallbacks$1
            @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView.Callbacks
            public void onRelatedInstrumentClick(Video video, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.this$0.getNewsFeedAnalytics().logContentRelatedInstrumentClick(video.toContentVideo(), instrument, false);
                this.this$0.setAutoPlayOnResume(true);
                Navigator navigator = this.this$0.getNavigator();
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.NEWS_FEED, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4052, null);
            }

            @Override // com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView.Callbacks
            public void onReplayClick(Video video) {
                Intrinsics.checkNotNullParameter(video, "video");
                this.this$0.getCallbacks().onReplayClick(video);
                PlayerView playerView = this.this$0.playerView;
                Intrinsics.checkNotNull(playerView);
                Player player = playerView.getPlayer();
                Intrinsics.checkNotNull(player);
                player.seekTo(0L);
                this.this$0.getNewsFeedAnalytics().logVideoControlButtonClick(video.toContentVideo(), UserInteractionEventData.Action.REPLAY);
            }
        };
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    public final UUID getCurrentVideoId() {
        Video video;
        NewsFeedVideoViewerItemView newsFeedVideoViewerItemView = this.activeItemView;
        if (newsFeedVideoViewerItemView == null || (video = newsFeedVideoViewerItemView.getVideo()) == null) {
            return null;
        }
        return video.getId();
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

    public final UserAgentProvider getUserAgentProvider() {
        UserAgentProvider userAgentProvider = this.userAgentProvider;
        if (userAgentProvider != null) {
            return userAgentProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAgentProvider");
        return null;
    }

    public final void setUserAgentProvider(UserAgentProvider userAgentProvider) {
        Intrinsics.checkNotNullParameter(userAgentProvider, "<set-?>");
        this.userAgentProvider = userAgentProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final View getProgressBar() {
        return (View) this.progressBar.getValue(this, $$delegatedProperties[1]);
    }

    private final ErrorView getErrorView() {
        return (ErrorView) this.errorView.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[3]);
    }

    private final boolean getAutoPlayOnResume() {
        return ((Boolean) this.autoPlayOnResume.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutoPlayOnResume(boolean z) {
        this.autoPlayOnResume.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$0(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment) {
        return new NewsFeedAnalytics(newsFeedPortraitVideoPlayerFragment.getAnalytics(), ANALYTICS_PREFIX, newsFeedPortraitVideoPlayerFragment.getEventLogger(), newsFeedPortraitVideoPlayerFragment.getEventScreen());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment, NewsFeedVideoViewerItemView NewsFeedVideoPlayerAdapter, Video state) {
        Intrinsics.checkNotNullParameter(NewsFeedVideoPlayerAdapter, "$this$NewsFeedVideoPlayerAdapter");
        Intrinsics.checkNotNullParameter(state, "state");
        NewsFeedVideoPlayerAdapter.bind(state);
        NewsFeedVideoPlayerAdapter.setCallbacks(newsFeedPortraitVideoPlayerFragment.videoItemCallbacks);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lastItemAdapter$lambda$2(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment, ViewGroup of, Video video) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(video, "video");
        View childAt = of.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView");
        NewsFeedVideoViewerItemView newsFeedVideoViewerItemView = (NewsFeedVideoViewerItemView) childAt;
        newsFeedVideoViewerItemView.bind(video);
        newsFeedVideoViewerItemView.setCallbacks(newsFeedPortraitVideoPlayerFragment.videoItemCallbacks);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((parentFragment + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = NewsFeedPortraitVideoPlayerFragment.this.visibleItemsManager;
                if (visibleItemsManager != null) {
                    visibleItemsManager.update();
                }
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = NewsFeedPortraitVideoPlayerFragment.this.visibleAutoLoggableViewManager;
                if (visibleAutoLoggableViewManager != null) {
                    visibleAutoLoggableViewManager.update();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (container != null) {
            return inflater.inflate(C27909R.layout.fragment_news_feed_portrait_video_player, container, false);
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws IllegalStateException, Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getErrorView().setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        final RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        bindAdapter(recyclerView, this.compositeAdapter);
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BetterDividerItemDecoration betterDividerItemDecoration = new BetterDividerItemDecoration(context, 1);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
        Drawable drawable = ViewsKt.getDrawable(recyclerView, C27909R.drawable.video_viewer_item_divider);
        drawable.setAlpha(51);
        betterDividerItemDecoration.setDrawable(drawable);
        betterDividerItemDecoration.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        recyclerView.addItemDecoration(betterDividerItemDecoration);
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        new LinearSnapToTopHelper(context2).attachToRecyclerView(recyclerView);
        Observable<Integer> observableScrollStateChanges = RxRecyclerView.scrollStateChanges(recyclerView);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<Integer> observableDebounce = observableScrollStateChanges.debounce(10L, timeUnit, AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDebounce, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$7(this.f$0, (Integer) obj);
            }
        });
        Observable<RecyclerViewScrollEvent> observableScrollEvents = RxRecyclerView.scrollEvents(recyclerView);
        LifecycleHost.DefaultImpls.bind$default(this, observableScrollEvents, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$8(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        final Rect rect = new Rect();
        Observable<RecyclerViewScrollEvent> observableThrottleLatest = observableScrollEvents.throttleLatest(300L, timeUnit, AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableThrottleLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$9(this.f$0, rect, (RecyclerViewScrollEvent) obj);
            }
        });
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$onViewCreated$2$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws JSONException {
                if (recyclerView.getChildCount() > 0) {
                    recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.updateAutoplayVideo(0);
                }
            }
        });
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        VisibleItemsManager<UUID, Video> visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$10(this.f$0));
            }
        }, new NewsFeedPortraitVideoPlayerFragment5(this.adapter), new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$11((Video) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        Intrinsics.checkNotNull(visibleItemsManager);
        visibleItemsManager.setCallbacks(new VisibleItemsManager.Callbacks<Video>() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$onViewCreated$2$8
            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemAppeared(Video item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.this$0.getNewsFeedAnalytics().logContentAppear(item.toContentVideo(), false);
            }

            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemDisappeared(Video item, long durationVisible) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.this$0.getNewsFeedAnalytics().logContentDisappear(item.toContentVideo(), durationVisible, false);
            }
        });
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2);
        this.visibleAutoLoggableViewManager = new VisibleAutoLoggableViewManager<>(layoutManager2, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$12(this.f$0));
            }
        }, new NewsFeedPortraitVideoPlayerFragment4(this.adapter), new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedPortraitVideoPlayerFragment.onViewCreated$lambda$14$lambda$13((Video) obj);
            }
        }, false, false, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment) {
        newsFeedPortraitVideoPlayerFragment.getCallbacks().onRetryClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$7(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment, Integer num) throws JSONException {
        Intrinsics.checkNotNull(num);
        newsFeedPortraitVideoPlayerFragment.updateAutoplayVideo(num.intValue());
        if (1 == num.intValue()) {
            newsFeedPortraitVideoPlayerFragment.getNewsFeedAnalytics().logPageScroll();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$8(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<UUID, Video> visibleItemsManager = newsFeedPortraitVideoPlayerFragment.visibleItemsManager;
        Intrinsics.checkNotNull(visibleItemsManager);
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Video> visibleAutoLoggableViewManager = newsFeedPortraitVideoPlayerFragment.visibleAutoLoggableViewManager;
        Intrinsics.checkNotNull(visibleAutoLoggableViewManager);
        visibleAutoLoggableViewManager.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$9(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment, Rect rect, RecyclerViewScrollEvent recyclerViewScrollEvent) {
        NewsFeedVideoViewerItemView newsFeedVideoViewerItemView = newsFeedPortraitVideoPlayerFragment.activeItemView;
        if (newsFeedVideoViewerItemView == null) {
            return Unit.INSTANCE;
        }
        if (newsFeedVideoViewerItemView.getParent() == null || !newsFeedVideoViewerItemView.getGlobalVisibleRect(rect)) {
            newsFeedPortraitVideoPlayerFragment.resetAutoplayingVideoView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$14$lambda$10(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment) {
        return newsFeedPortraitVideoPlayerFragment.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onViewCreated$lambda$14$lambda$11(Video VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$14$lambda$12(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment) {
        return newsFeedPortraitVideoPlayerFragment.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onViewCreated$lambda$14$lambda$13(Video VisibleAutoLoggableViewManager) {
        Intrinsics.checkNotNullParameter(VisibleAutoLoggableViewManager, "$this$VisibleAutoLoggableViewManager");
        return VisibleAutoLoggableViewManager.getId();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getView() == null) {
            return;
        }
        VisibleItemsManager<UUID, Video> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager != null) {
            visibleItemsManager.update();
        }
        VisibleAutoLoggableViewManager<UUID, Video> visibleAutoLoggableViewManager = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager != null) {
            visibleAutoLoggableViewManager.update();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Player player;
        super.onResume();
        if (getView() == null) {
            return;
        }
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.onResume();
        }
        if (getAutoPlayOnResume()) {
            setAutoPlayOnResume(false);
            PlayerView playerView2 = this.playerView;
            if (playerView2 == null || (player = playerView2.getPlayer()) == null) {
                return;
            }
            player.setPlayWhenReady(true);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        PlayerView playerView;
        super.onPause();
        if (getView() == null || (playerView = this.playerView) == null) {
            return;
        }
        playerView.onPause();
        Player player = playerView.getPlayer();
        if (player != null) {
            player.setPlayWhenReady(false);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (getView() == null) {
            return;
        }
        VisibleItemsManager<UUID, Video> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager != null) {
            visibleItemsManager.clear();
        }
        VisibleAutoLoggableViewManager<UUID, Video> visibleAutoLoggableViewManager = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager != null) {
            visibleAutoLoggableViewManager.clear();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Player player;
        super.onDestroyView();
        if (getView() == null) {
            return;
        }
        resetAutoplayingVideoView();
        this.muxWrapper.release();
        PlayerView playerView = this.playerView;
        if (playerView == null || (player = playerView.getPlayer()) == null) {
            return;
        }
        player.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(NewsFeedVideoPlayerViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        getRecyclerView().setVisibility(viewState.getShowContent() ? 0 : 8);
        getProgressBar().setVisibility(viewState.getShowLoading() ? 0 : 8);
        getErrorView().setVisibility(viewState.getShowError() ? 0 : 8);
        if (viewState.getVideos().isEmpty()) {
            return;
        }
        this.adapter.submitList(CollectionsKt.take(viewState.getVideos(), viewState.getVideos().size() - 1));
        this.lastItemAdapter.setData(CollectionsKt.last((List) viewState.getVideos()));
    }

    public final void scrollToPosition(int index, Video video) throws JSONException {
        Intrinsics.checkNotNullParameter(video, "video");
        getRecyclerView().scrollToPosition(index);
        MuxWrappers.updateVideo(this.muxWrapper, video);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAutoplayVideo(int state) throws JSONException {
        if (state != 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = getRecyclerView().findViewHolderForAdapterPosition(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition());
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            resetAutoplayingVideoView();
            return;
        }
        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
        NewsFeedVideoViewerItemView newsFeedVideoViewerItemView = view instanceof NewsFeedVideoViewerItemView ? (NewsFeedVideoViewerItemView) view : null;
        if (newsFeedVideoViewerItemView == null) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt = ((ViewGroup) view).getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView");
            newsFeedVideoViewerItemView = (NewsFeedVideoViewerItemView) childAt;
        }
        if (Intrinsics.areEqual(newsFeedVideoViewerItemView, this.activeItemView)) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        PlayerView playerViewInflatePlayerView = this.playerView;
        if (playerViewInflatePlayerView == null) {
            playerViewInflatePlayerView = inflatePlayerView(newsFeedVideoViewerItemView, contextRequireContext);
            this.playerView = playerViewInflatePlayerView;
        }
        resetAutoplayingVideoView();
        newsFeedVideoViewerItemView.bindPlayerView(playerViewInflatePlayerView);
        Player player = playerViewInflatePlayerView.getPlayer();
        Intrinsics.checkNotNull(player, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
        ExoPlayer exoPlayer = (ExoPlayer) player;
        Video video = newsFeedVideoViewerItemView.getVideo();
        Intrinsics.checkNotNull(video);
        String userAgent = getUserAgentProvider().getUserAgent();
        Uri androidUri = HttpUrl2.toAndroidUri(video.getUrl());
        HttpUrl captions = video.getCaptions();
        ExoPlayers.prepareNewsFeedVideo(exoPlayer, contextRequireContext, userAgent, androidUri, captions != null ? HttpUrl2.toAndroidUri(captions) : null);
        MuxWrappers.updateVideo(this.muxWrapper, video);
        exoPlayer.setPlayWhenReady(true);
        Long savedPlaybackPosition = getCallbacks().getSavedPlaybackPosition(video.getId());
        if (savedPlaybackPosition != null) {
            exoPlayer.seekTo(savedPlaybackPosition.longValue());
        }
        this.activeItemView = newsFeedVideoViewerItemView;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private final PlayerView inflatePlayerView(NewsFeedVideoViewerItemView view, android.content.Context context) throws JSONException {
        View viewInflate$default = ViewGroups.inflate$default(view, C27909R.layout.include_video_viewer_player_view, false, 2, null);
        Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) viewInflate$default;
        playerView.setErrorMessageProvider(new DummyErrorMessageProvider());
        final View viewFindViewById = playerView.findViewById(C27909R.id.exo_fullscreen_btn);
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNull(exoPlayerBuild);
        exoPlayerBuild.addListener(new PlayNextVideoListener(this, exoPlayerBuild));
        exoPlayerBuild.addListener(new Player.Listener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$inflatePlayerView$1$1$1
            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                super.onAudioAttributesChanged(audioAttributes);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
                super.onAudioSessionIdChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                super.onAvailableCommandsChanged(commands);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
                super.onCues(cueGroup);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
                super.onCues((List<Cue>) list);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                super.onDeviceInfoChanged(deviceInfo);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                super.onDeviceVolumeChanged(i, z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                super.onEvents(player, events);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                super.onIsLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
                super.onIsPlayingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                super.onLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                super.onMaxSeekToPreviousPositionChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                super.onMediaItemTransition(mediaItem, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                super.onMediaMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
                super.onMetadata(metadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                super.onPlayWhenReadyChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                super.onPlaybackParametersChanged(playbackParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
                super.onPlaybackStateChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                super.onPlaybackSuppressionReasonChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                super.onPlayerError(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                super.onPlayerErrorChanged(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                super.onPlayerStateChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                super.onPlaylistMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                super.onPositionDiscontinuity(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                super.onPositionDiscontinuity(positionInfo, positionInfo2, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                super.onRepeatModeChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
                super.onSeekBackIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                super.onSeekForwardIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                super.onShuffleModeEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                super.onSkipSilenceEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                super.onSurfaceSizeChanged(i, i2);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                super.onTimelineChanged(timeline, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                super.onTrackSelectionParametersChanged(trackSelectionParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
                super.onTracksChanged(tracks);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                super.onVideoSizeChanged(videoSize);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
                super.onVolumeChanged(f);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onRenderedFirstFrame() {
                View view2 = viewFindViewById;
                Intrinsics.checkNotNull(view2);
                view2.setVisibility(0);
            }
        });
        playerView.setPlayer(exoPlayerBuild);
        MuxWrapper muxWrapper = this.muxWrapper;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        muxWrapper.setPlayer(fragmentActivityRequireActivity, PLAYER_NAME, playerView);
        Intrinsics.checkNotNull(viewFindViewById);
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedPortraitVideoPlayerFragment.inflatePlayerView$lambda$18$lambda$17(this.f$0);
            }
        });
        View viewFindViewById2 = playerView.findViewById(R$id.exo_rew);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        setControlButtonListener(view, viewFindViewById2, UserInteractionEventData.Action.SKIP_BACKWARD);
        View viewFindViewById3 = playerView.findViewById(R$id.exo_play);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        setControlButtonListener(view, viewFindViewById3, UserInteractionEventData.Action.PLAY);
        View viewFindViewById4 = playerView.findViewById(R$id.exo_pause);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        setControlButtonListener(view, viewFindViewById4, UserInteractionEventData.Action.PAUSE);
        View viewFindViewById5 = playerView.findViewById(R$id.exo_ffwd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        setControlButtonListener(view, viewFindViewById5, UserInteractionEventData.Action.SKIP_FORWARD);
        View viewFindViewById6 = playerView.findViewById(R$id.exo_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        setControlButtonListener(view, viewFindViewById6, UserInteractionEventData.Action.SCRUB);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inflatePlayerView$lambda$18$lambda$17(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment) {
        newsFeedPortraitVideoPlayerFragment.requireActivity().setRequestedOrientation(11);
        return Unit.INSTANCE;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setControlButtonListener(final NewsFeedVideoViewerItemView parentView, View controlButtonView, final UserInteractionEventData.Action action) {
        controlButtonView.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment.setControlButtonListener.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Video video;
                if (motionEvent.getAction() != 1 || (video = parentView.getVideo()) == null) {
                    return false;
                }
                this.getNewsFeedAnalytics().logVideoControlButtonClick(video.toContentVideo(), action);
                return false;
            }
        });
    }

    private final void resetAutoplayingVideoView() {
        Player player;
        Player player2;
        NewsFeedVideoViewerItemView newsFeedVideoViewerItemView = this.activeItemView;
        if (newsFeedVideoViewerItemView != null) {
            PlayerView playerView = this.playerView;
            if (playerView != null && (player2 = playerView.getPlayer()) != null) {
                long currentPosition = player2.getCurrentPosition();
                Callbacks callbacks = getCallbacks();
                Video video = newsFeedVideoViewerItemView.getVideo();
                Intrinsics.checkNotNull(video);
                callbacks.setSavedPlaybackPosition(video.getId(), currentPosition);
            }
            newsFeedVideoViewerItemView.unbindPlayerView();
            this.activeItemView = null;
            if (playerView == null || (player = playerView.getPlayer()) == null) {
                return;
            }
            player.setPlayWhenReady(false);
        }
    }

    /* compiled from: NewsFeedPortraitVideoPlayerFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment$PlayNextVideoListener;", "Landroidx/media3/common/Player$Listener;", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "<init>", "(Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedPortraitVideoPlayerFragment;Landroidx/media3/exoplayer/ExoPlayer;)V", "onPlaybackStateChanged", "", "playbackState", "", "onPlayWhenReadyChanged", "playWhenReady", "", "reason", "handleStateChange", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class PlayNextVideoListener implements Player.Listener {
        private final ExoPlayer exoPlayer;
        final /* synthetic */ NewsFeedPortraitVideoPlayerFragment this$0;

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            super.onAudioAttributesChanged(audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
            super.onAudioSessionIdChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            super.onAvailableCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
            super.onCues(cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues((List<Cue>) list);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            super.onDeviceInfoChanged(deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            super.onDeviceVolumeChanged(i, z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
            super.onEvents(player, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            super.onIsLoadingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
            super.onIsPlayingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            super.onLoadingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            super.onMaxSeekToPreviousPositionChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            super.onMediaItemTransition(mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            super.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
            super.onMetadata(metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            super.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            super.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            super.onPlayerError(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            super.onPlayerErrorChanged(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            super.onPlayerStateChanged(z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            super.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
            super.onPositionDiscontinuity(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            super.onPositionDiscontinuity(positionInfo, positionInfo2, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
            super.onRepeatModeChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            super.onSeekBackIncrementChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            super.onSeekForwardIncrementChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            super.onShuffleModeEnabledChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            super.onSkipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            super.onSurfaceSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            super.onTimelineChanged(timeline, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            super.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
            super.onTracksChanged(tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            super.onVideoSizeChanged(videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
            super.onVolumeChanged(f);
        }

        public PlayNextVideoListener(NewsFeedPortraitVideoPlayerFragment newsFeedPortraitVideoPlayerFragment, ExoPlayer exoPlayer) {
            Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
            this.this$0 = newsFeedPortraitVideoPlayerFragment;
            this.exoPlayer = exoPlayer;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int playbackState) {
            handleStateChange(this.exoPlayer.getPlayWhenReady(), playbackState);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
            handleStateChange(playWhenReady, this.exoPlayer.getPlaybackState());
        }

        private final void handleStateChange(boolean playWhenReady, int playbackState) {
            if (playWhenReady && playbackState == 4) {
                NewsFeedVideoViewerItemView newsFeedVideoViewerItemView = this.this$0.activeItemView;
                Intrinsics.checkNotNull(newsFeedVideoViewerItemView);
                Video video = newsFeedVideoViewerItemView.getVideo();
                Intrinsics.checkNotNull(video);
                if (video.getShowReplay()) {
                    return;
                }
                Callbacks callbacks = this.this$0.getCallbacks();
                Video video2 = newsFeedVideoViewerItemView.getVideo();
                Intrinsics.checkNotNull(video2);
                callbacks.onVideoEnded(video2);
                RecyclerView.LayoutManager layoutManager = this.this$0.getRecyclerView().getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                SmoothTopScroller smoothTopScroller = new SmoothTopScroller(contextRequireContext, 0.0f, 2, null);
                smoothTopScroller.setTargetPosition(iFindFirstVisibleItemPosition + 1);
                linearLayoutManager.startSmoothScroll(smoothTopScroller);
            }
        }
    }
}
