package com.robinhood.android.search.newsfeed.videoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.videoplayer.extensions.ExoPlayers;
import com.robinhood.android.search.newsfeed.videoplayer.extensions.MuxWrappers;
import com.robinhood.android.search.newsfeed.videoplayer.mux.MuxWrapper;
import com.robinhood.android.search.newsfeed.view.util.DummyErrorMessageProvider;
import com.robinhood.android.video.VideoPlayerContainer;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* compiled from: NewsFeedLandscapeVideoPlayerFragment.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0002[\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J&\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u001a\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020%2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010J\u001a\u00020>H\u0016J\b\u0010K\u001a\u00020>H\u0016J\b\u0010L\u001a\u00020>H\u0016J\u0010\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u00020OH\u0007J&\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020R2\b\b\u0001\u0010S\u001a\u00020T2\n\u0010U\u001a\u00060Vj\u0002`WH\u0003J\u001e\u0010X\u001a\u00020>2\u0006\u0010Y\u001a\u00020T2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010Q\u001a\u00020RR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b1\u00102R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b:\u0010;¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "currentVideoId", "Ljava/util/UUID;", "getCurrentVideoId", "()Ljava/util/UUID;", "currentPlayerPosition", "", "getCurrentPlayerPosition", "()Ljava/lang/Long;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "getUserAgentProvider", "()Lcom/robinhood/shared/user/agent/UserAgentProvider;", "setUserAgentProvider", "(Lcom/robinhood/shared/user/agent/UserAgentProvider;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "Lkotlin/Lazy;", "progressBar", "Landroid/view/View;", "getProgressBar", "()Landroid/view/View;", "progressBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorView", "Lcom/robinhood/android/common/view/ErrorView;", "getErrorView", "()Lcom/robinhood/android/common/view/ErrorView;", "errorView$delegate", "playerContainer", "Lcom/robinhood/android/video/VideoPlayerContainer;", "getPlayerContainer", "()Lcom/robinhood/android/video/VideoPlayerContainer;", "playerContainer$delegate", "muxWrapper", "Lcom/robinhood/android/search/newsfeed/videoplayer/mux/MuxWrapper;", "playerView", "Landroidx/media3/ui/PlayerView;", "callbacks", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onResume", "onPause", "onDestroyView", "bind", "viewState", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoPlayerViewState;", "setControlButtonListener", "video", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "viewId", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "seekTo", "windowIndex", "positionMs", "Callbacks", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedLandscapeVideoPlayerFragment extends BaseFragment {
    private static final String PLAYER_NAME = "theater-mode";
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: errorView$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorView;
    public EventLogger eventLogger;
    private final MuxWrapper muxWrapper;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;

    /* renamed from: playerContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 playerContainer;
    private PlayerView playerView;

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressBar;
    public UserAgentProvider userAgentProvider;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedLandscapeVideoPlayerFragment.class, "progressBar", "getProgressBar()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedLandscapeVideoPlayerFragment.class, "errorView", "getErrorView()Lcom/robinhood/android/common/view/ErrorView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedLandscapeVideoPlayerFragment.class, "playerContainer", "getPlayerContainer()Lcom/robinhood/android/video/VideoPlayerContainer;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedLandscapeVideoPlayerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment$Callbacks;", 0))};
    public static final int $stable = 8;

    /* compiled from: NewsFeedLandscapeVideoPlayerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedLandscapeVideoPlayerFragment$Callbacks;", "", "onRetryClick", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRetryClick();
    }

    public NewsFeedLandscapeVideoPlayerFragment() {
        super(0);
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedLandscapeVideoPlayerFragment.newsFeedAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        this.progressBar = bindView(C27909R.id.news_feed_video_landscape_progress_bar);
        this.errorView = bindView(C27909R.id.news_feed_video_landscape_error_retry_view);
        this.playerContainer = bindView(C27909R.id.news_feed_video_landscape_player_container);
        this.muxWrapper = new MuxWrapper();
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final UUID getCurrentVideoId() {
        MediaItem currentMediaItem;
        MediaItem.LocalConfiguration localConfiguration;
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        Player player = playerView.getPlayer();
        Object obj = (player == null || (currentMediaItem = player.getCurrentMediaItem()) == null || (localConfiguration = currentMediaItem.localConfiguration) == null) ? null : localConfiguration.tag;
        Video video = obj instanceof Video ? (Video) obj : null;
        if (video != null) {
            return video.getId();
        }
        return null;
    }

    public final Long getCurrentPlayerPosition() {
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        Player player = playerView.getPlayer();
        if (player != null) {
            return Long.valueOf(player.getCurrentPosition());
        }
        return null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$0(NewsFeedLandscapeVideoPlayerFragment newsFeedLandscapeVideoPlayerFragment) {
        return new NewsFeedAnalytics(newsFeedLandscapeVideoPlayerFragment.getAnalytics(), "", newsFeedLandscapeVideoPlayerFragment.getEventLogger(), new Screen(Screen.Name.BROWSE_NEWSFEED_THEATRE, null, null, null, 14, null));
    }

    private final View getProgressBar() {
        return (View) this.progressBar.getValue(this, $$delegatedProperties[0]);
    }

    private final ErrorView getErrorView() {
        return (ErrorView) this.errorView.getValue(this, $$delegatedProperties[1]);
    }

    private final VideoPlayerContainer getPlayerContainer() {
        return (VideoPlayerContainer) this.playerContainer.getValue(this, $$delegatedProperties[2]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((parentFragment + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (container != null) {
            return inflater.inflate(C27909R.layout.merge_news_feed_landscape_video_player_view, container, false);
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getPlayerContainer().setEnablePreviewImage(false);
        getErrorView().setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedLandscapeVideoPlayerFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        View viewInflate$default = ViewGroups.inflate$default(getPlayerContainer(), C27909R.layout.include_video_viewer_player_view, false, 2, null);
        Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) viewInflate$default;
        playerView.setErrorMessageProvider(new DummyErrorMessageProvider());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final ActionBar supportActionBar = Contexts7.requireBaseActivityBaseContext(contextRequireContext).getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        supportActionBar.hide();
        playerView.setControllerVisibilityListener(new PlayerView.ControllerVisibilityListener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment.onViewCreated.2
            @Override // androidx.media3.ui.PlayerView.ControllerVisibilityListener
            public final void onVisibilityChanged(int i) {
                if (i == 0) {
                    supportActionBar.show();
                } else {
                    supportActionBar.hide();
                }
            }
        });
        this.playerView = playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(NewsFeedLandscapeVideoPlayerFragment newsFeedLandscapeVideoPlayerFragment) {
        newsFeedLandscapeVideoPlayerFragment.getCallbacks().onRetryClick();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getView() == null) {
            return;
        }
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.onResume();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getView() == null) {
            return;
        }
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.onPause();
        Player player = playerView.getPlayer();
        if (player != null) {
            player.setPlayWhenReady(false);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (getView() == null) {
            return;
        }
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        Player player = playerView.getPlayer();
        if (player != null) {
            player.release();
        }
    }

    public final void bind(NewsFeedVideoPlayerViewState viewState) throws JSONException {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        getProgressBar().setVisibility(viewState.getShowLoading() ? 0 : 8);
        getPlayerContainer().setVisibility(viewState.getShowContent() ? 0 : 8);
        getErrorView().setVisibility(viewState.getShowError() ? 0 : 8);
        if (viewState.getVideos().isEmpty()) {
            return;
        }
        PlayerView playerView = this.playerView;
        PlayerView playerView2 = null;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        if (playerView.getPlayer() == null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            final ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(contextRequireContext).setSeekForwardIncrementMs(15000L).setSeekBackIncrementMs(15000L).build();
            Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
            PlayerView playerView3 = this.playerView;
            if (playerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerView");
                playerView3 = null;
            }
            playerView3.setPlayer(exoPlayerBuild);
            MuxWrapper muxWrapper = this.muxWrapper;
            AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(contextRequireContext);
            PlayerView playerView4 = this.playerView;
            if (playerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerView");
                playerView4 = null;
            }
            muxWrapper.setPlayer(appCompatActivityRequireActivityBaseContext, PLAYER_NAME, playerView4);
            exoPlayerBuild.setPlayWhenReady(true);
            String userAgent = getUserAgentProvider().getUserAgent();
            List<Video> videos = viewState.getVideos();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(videos, 10));
            for (Video video : videos) {
                Uri androidUri = HttpUrl2.toAndroidUri(video.getUrl());
                HttpUrl captions = video.getCaptions();
                arrayList.add(new Tuples3(androidUri, captions != null ? HttpUrl2.toAndroidUri(captions) : null, video));
            }
            ExoPlayers.prepareNewsFeedVideos(exoPlayerBuild, contextRequireContext, userAgent, arrayList);
            Video video2 = viewState.getVideos().get(0);
            MuxWrappers.updateVideo(this.muxWrapper, video2);
            exoPlayerBuild.addListener(new Player.Listener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment.bind.2
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

                @Override // androidx.media3.common.Player.Listener
                public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) throws JSONException {
                    MediaItem.LocalConfiguration localConfiguration;
                    Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
                    Intrinsics.checkNotNullParameter(newPosition, "newPosition");
                    super.onPositionDiscontinuity(oldPosition, newPosition, reason);
                    if (reason == 0) {
                        MediaItem currentMediaItem = exoPlayerBuild.getCurrentMediaItem();
                        Object obj = (currentMediaItem == null || (localConfiguration = currentMediaItem.localConfiguration) == null) ? null : localConfiguration.tag;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.android.search.newsfeed.videoplayer.Video");
                        MuxWrappers.updateVideo(this.muxWrapper, (Video) obj);
                    }
                }
            });
            setControlButtonListener(video2, R$id.exo_rew, UserInteractionEventData.Action.SKIP_BACKWARD);
            setControlButtonListener(video2, R$id.exo_play, UserInteractionEventData.Action.PLAY);
            setControlButtonListener(video2, R$id.exo_pause, UserInteractionEventData.Action.PAUSE);
            setControlButtonListener(video2, R$id.exo_ffwd, UserInteractionEventData.Action.SKIP_FORWARD);
            setControlButtonListener(video2, R$id.exo_progress, UserInteractionEventData.Action.SCRUB);
            VideoPlayerContainer playerContainer = getPlayerContainer();
            PlayerView playerView5 = this.playerView;
            if (playerView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerView");
            } else {
                playerView2 = playerView5;
            }
            playerContainer.bindPlayerView(playerView2);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setControlButtonListener(final Video video, int viewId, final UserInteractionEventData.Action action) {
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        playerView.findViewById(viewId).setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedLandscapeVideoPlayerFragment.setControlButtonListener.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                NewsFeedLandscapeVideoPlayerFragment.this.getNewsFeedAnalytics().logVideoControlButtonClick(video.toContentVideo(), action);
                return false;
            }
        });
    }

    public final void seekTo(int windowIndex, long positionMs, Video video) throws JSONException {
        Intrinsics.checkNotNullParameter(video, "video");
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            playerView = null;
        }
        Player player = playerView.getPlayer();
        if (player != null) {
            player.seekTo(windowIndex, positionMs);
        }
        MuxWrappers.updateVideo(this.muxWrapper, video);
    }
}
