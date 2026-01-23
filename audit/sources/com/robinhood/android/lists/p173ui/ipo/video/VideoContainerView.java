package com.robinhood.android.lists.p173ui.ipo.video;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.p014ui.PlayerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.MergeVideoViewBinding;
import com.robinhood.android.lists.p173ui.ipo.video.VideoContainerViewState;
import com.robinhood.android.video.VideoPlayerContainer;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: VideoContainerView.kt */
@Metadata(m3635d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001#\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0016J\b\u0010,\u001a\u00020*H\u0014J\b\u0010-\u001a\u00020*H\u0015J\u0010\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0003J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000202H\u0003R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState$VideoViewState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerDuxo;", "getDuxo", "()Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerDuxo;", "setDuxo", "(Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerDuxo;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "getUserAgentProvider", "()Lcom/robinhood/shared/user/agent/UserAgentProvider;", "setUserAgentProvider", "(Lcom/robinhood/shared/user/agent/UserAgentProvider;)V", "binding", "Lcom/robinhood/android/lists/databinding/MergeVideoViewBinding;", "getBinding", "()Lcom/robinhood/android/lists/databinding/MergeVideoViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "playerListener", "com/robinhood/android/lists/ui/ipo/video/VideoContainerView$playerListener$1", "Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerView$playerListener$1;", "playerView", "Landroidx/media3/ui/PlayerView;", "player", "Landroidx/media3/common/Player;", "bind", "", "state", "onAttachedToWindow", "onDetachedFromWindow", "updateUi", "Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState;", "preparePlayer", "videoUri", "Landroid/net/Uri;", "buildMediaSource", "Landroidx/media3/exoplayer/source/MediaSource;", "uri", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class VideoContainerView extends Hammer_VideoContainerView implements Bindable<VideoContainerViewState.VideoViewState> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(VideoContainerView.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/MergeVideoViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public VideoContainerDuxo duxo;
    public EventLogger eventLogger;
    private Player player;
    private final VideoContainerView3 playerListener;
    private PlayerView playerView;
    public UserAgentProvider userAgentProvider;

    public /* synthetic */ VideoContainerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.robinhood.android.lists.ui.ipo.video.VideoContainerView$playerListener$1] */
    public VideoContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, VideoContainerView2.INSTANCE);
        this.playerListener = new Player.Listener() { // from class: com.robinhood.android.lists.ui.ipo.video.VideoContainerView$playerListener$1
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

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                if ((playbackState != 3 || playWhenReady) && !(playbackState == 4 && playWhenReady)) {
                    return;
                }
                VideoContainerDuxo duxo = this.this$0.getDuxo();
                Player player = this.this$0.player;
                Long lValueOf = player != null ? Long.valueOf(player.getCurrentPosition()) : null;
                Player player2 = this.this$0.player;
                duxo.logPause(lValueOf, player2 != null ? Long.valueOf(player2.getDuration()) : null);
            }
        };
        ViewGroups.inflate(this, C20839R.layout.merge_video_view, true);
        getBinding().videoPlayerContainer.setClipToOutline(true);
    }

    public final VideoContainerDuxo getDuxo() {
        VideoContainerDuxo videoContainerDuxo = this.duxo;
        if (videoContainerDuxo != null) {
            return videoContainerDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(VideoContainerDuxo videoContainerDuxo) {
        Intrinsics.checkNotNullParameter(videoContainerDuxo, "<set-?>");
        this.duxo = videoContainerDuxo;
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

    private final MergeVideoViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeVideoViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(VideoContainerViewState.VideoViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getDuxo().initialize(state);
        this.player = state.getPlayer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.playerView == null) {
            View viewInflate$default = ViewGroups.inflate$default(this, C20839R.layout.include_curated_lists_ipo_list_video_player_view, false, 2, null);
            Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
            this.playerView = (PlayerView) viewInflate$default;
        }
        PlayerView playerView = this.playerView;
        Intrinsics.checkNotNull(playerView);
        playerView.setPlayer(this.player);
        Player player = this.player;
        Intrinsics.checkNotNull(player);
        player.addListener(this.playerListener);
        VideoPlayerContainer videoPlayerContainer = getBinding().videoPlayerContainer;
        PlayerView playerView2 = this.playerView;
        Intrinsics.checkNotNull(playerView2);
        videoPlayerContainer.bindPlayerView(playerView2);
        Observable<VideoContainerViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new C208621(this));
    }

    /* compiled from: VideoContainerView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.ipo.video.VideoContainerView$onAttachedToWindow$1 */
    /* synthetic */ class C208621 extends FunctionReferenceImpl implements Function1<VideoContainerViewState, Unit> {
        C208621(Object obj) {
            super(1, obj, VideoContainerView.class, "updateUi", "updateUi(Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VideoContainerViewState videoContainerViewState) {
            invoke2(videoContainerViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VideoContainerViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VideoContainerView) this.receiver).updateUi(p0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().videoPlayerContainer.unbindPlayerView();
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            Player player = playerView.getPlayer();
            if (player != null) {
                player.removeListener(this.playerListener);
            }
            Player player2 = playerView.getPlayer();
            if (player2 != null) {
                player2.setPlayWhenReady(false);
            }
            playerView.setControllerAutoShow(true);
            playerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUi(VideoContainerViewState state) {
        Player player;
        MergeVideoViewBinding binding = getBinding();
        Uri videoUri = state.getVideoUri();
        if (videoUri != null) {
            preparePlayer(videoUri);
        }
        ViewGroup.LayoutParams layoutParams = binding.videoPlayerContainer.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).dimensionRatio = state.getAspectRatio();
        binding.videoPlayerContainer.setPreviewImageUrl(state.getPreviewUri());
        binding.videoPlayerContainer.setEnablePlayIcon(true);
        PlayerView playerView = this.playerView;
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.setVolume(state.getVolume());
        }
        ImageView soundOnImg = binding.soundOnImg;
        Intrinsics.checkNotNullExpressionValue(soundOnImg, "soundOnImg");
        soundOnImg.setVisibility(state.getShowSoundOn() ? 0 : 8);
        ImageView soundOnImg2 = binding.soundOnImg;
        Intrinsics.checkNotNullExpressionValue(soundOnImg2, "soundOnImg");
        OnClickListeners.onClick(soundOnImg2, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.video.VideoContainerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoContainerView.updateUi$lambda$3$lambda$1(this.f$0);
            }
        });
        ImageView soundOffImg = binding.soundOffImg;
        Intrinsics.checkNotNullExpressionValue(soundOffImg, "soundOffImg");
        soundOffImg.setVisibility(state.getShowSoundOff() ? 0 : 8);
        ImageView soundOffImg2 = binding.soundOffImg;
        Intrinsics.checkNotNullExpressionValue(soundOffImg2, "soundOffImg");
        OnClickListeners.onClick(soundOffImg2, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.video.VideoContainerView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoContainerView.updateUi$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUi$lambda$3$lambda$1(VideoContainerView videoContainerView) {
        videoContainerView.getDuxo().disableAudio();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateUi$lambda$3$lambda$2(VideoContainerView videoContainerView) {
        videoContainerView.getDuxo().enableAudio();
        return Unit.INSTANCE;
    }

    private final void preparePlayer(Uri videoUri) {
        PlayerView playerView = this.playerView;
        Player player = playerView != null ? playerView.getPlayer() : null;
        Intrinsics.checkNotNull(player, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
        ExoPlayer exoPlayer = (ExoPlayer) player;
        if (exoPlayer.getPlaybackState() == 1) {
            exoPlayer.setMediaSource(buildMediaSource(videoUri));
            exoPlayer.prepare();
        }
    }

    private final MediaSource buildMediaSource(Uri uri) {
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(getContext(), new DefaultHttpDataSource.Factory().setUserAgent(getUserAgentProvider().getUserAgent()))).createMediaSource(MediaItem.fromUri(uri));
        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
        return progressiveMediaSourceCreateMediaSource;
    }
}
