package com.robinhood.android.video;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
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
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: VideoPlayerContainer.kt */
@Metadata(m3635d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n*\u00015\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00107\u001a\u000208H\u0014J\u0010\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000fH\u0016J\u0006\u0010;\u001a\u000208J\u000e\u0010<\u001a\u0002082\u0006\u0010!\u001a\u00020\"J\b\u0010=\u001a\u000208H\u0002J\b\u0010>\u001a\u000208H\u0002J\b\u0010?\u001a\u000208H\u0003J\b\u0010@\u001a\u000208H\u0003J\b\u0010A\u001a\u000208H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0004\n\u0002\u00106¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/video/VideoPlayerContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "value", "", "enablePreviewImage", "getEnablePreviewImage", "()Z", "setEnablePreviewImage", "(Z)V", "Lokhttp3/HttpUrl;", "previewImageUrl", "getPreviewImageUrl", "()Lokhttp3/HttpUrl;", "setPreviewImageUrl", "(Lokhttp3/HttpUrl;)V", "enablePlayIcon", "getEnablePlayIcon", "setEnablePlayIcon", "enableBufferingView", "getEnableBufferingView", "setEnableBufferingView", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "previewImg", "Landroid/widget/ImageView;", "getPreviewImg", "()Landroid/widget/ImageView;", "isBuffering", "playerContainer", "Landroid/widget/FrameLayout;", "errorTxt", "Landroid/widget/TextView;", "retryBtn", "previewImgForegroundDrawable", "Landroid/graphics/drawable/Drawable;", "errorTxtDisposable", "Lio/reactivex/disposables/Disposable;", "renderedFirstFrame", "playerListener", "com/robinhood/android/video/VideoPlayerContainer$playerListener$1", "Lcom/robinhood/android/video/VideoPlayerContainer$playerListener$1;", "onAttachedToWindow", "", "setClipToOutline", "clipToOutline", "unbindPlayerView", "bindPlayerView", "bindErrorView", "updatePreviewImage", "updateBufferingIcon", "updateController", "updateScreenDim", "feature-lib-video_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class VideoPlayerContainer extends Hammer_VideoPlayerContainer {
    private boolean enableBufferingView;
    private boolean enablePlayIcon;
    private boolean enablePreviewImage;
    private final TextView errorTxt;
    private Disposable errorTxtDisposable;
    public ImageLoader imageLoader;
    private final FrameLayout playerContainer;
    private final VideoPlayerContainer2 playerListener;
    private HttpUrl previewImageUrl;
    private final Drawable previewImgForegroundDrawable;
    private boolean renderedFirstFrame;
    private final ImageView retryBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.robinhood.android.video.VideoPlayerContainer$playerListener$1] */
    public VideoPlayerContainer(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C31440R.layout.merge_video_player_container, true);
        this.enablePreviewImage = true;
        this.enablePlayIcon = true;
        this.enableBufferingView = true;
        View viewFindViewById = findViewById(C31440R.id.player_view_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.playerContainer = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(C31440R.id.player_error_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.errorTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C31440R.id.player_retry_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.retryBtn = imageView;
        Drawable drawable = ContextCompat.getDrawable(context, C31440R.drawable.svg_ic_play_40dp);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        this.previewImgForegroundDrawable = drawableMutate;
        Disposable disposableDisposed = Disposables.disposed();
        Intrinsics.checkNotNullExpressionValue(disposableDisposed, "disposed(...)");
        this.errorTxtDisposable = disposableDisposed;
        this.playerListener = new Player.Listener() { // from class: com.robinhood.android.video.VideoPlayerContainer$playerListener$1
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
            public void onPlaybackStateChanged(int playbackState) {
                handleStateChange();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
                handleStateChange();
            }

            private final void handleStateChange() {
                this.this$0.updateController();
                this.this$0.updateBufferingIcon();
                this.this$0.updatePreviewImage();
                this.this$0.updateScreenDim();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
                VideoPlayerContainer videoPlayerContainer = this.this$0;
                Fade fade = new Fade();
                VideoPlayerContainer videoPlayerContainer2 = this.this$0;
                fade.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.video.VideoPlayerContainer$playerListener$1$onRenderedFirstFrame$$inlined$beginDelayedTransition$1
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                    }
                });
                fade.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.video.VideoPlayerContainer$playerListener$1$onRenderedFirstFrame$$inlined$beginDelayedTransition$2
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                    }
                });
                fade.addTarget(videoPlayerContainer2.getPreviewImg());
                TransitionManager.beginDelayedTransition(videoPlayerContainer, fade);
                this.this$0.renderedFirstFrame = true;
                this.this$0.updatePreviewImage();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onVolumeChanged(float volume) {
                super.onVolumeChanged(volume);
                this.this$0.updateScreenDim();
            }
        };
        OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.video.VideoPlayerContainer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoPlayerContainer._init_$lambda$0(this.f$0);
            }
        });
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

    public final boolean getEnablePreviewImage() {
        return this.enablePreviewImage;
    }

    public final void setEnablePreviewImage(boolean z) {
        this.enablePreviewImage = z;
        updatePreviewImage();
    }

    public final HttpUrl getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final void setPreviewImageUrl(HttpUrl httpUrl) {
        this.previewImageUrl = httpUrl;
        updatePreviewImage();
    }

    public final boolean getEnablePlayIcon() {
        return this.enablePlayIcon;
    }

    public final void setEnablePlayIcon(boolean z) {
        this.enablePlayIcon = z;
        updatePreviewImage();
    }

    public final boolean getEnableBufferingView() {
        return this.enableBufferingView;
    }

    public final void setEnableBufferingView(boolean z) {
        this.enableBufferingView = z;
        updateBufferingIcon();
    }

    public final PlayerView getPlayerView() {
        return (PlayerView) this.playerContainer.getChildAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getPreviewImg() {
        View viewFindViewById = findViewById(C31440R.id.player_preview_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (ImageView) viewFindViewById;
    }

    private final boolean isBuffering() {
        Player player;
        PlayerView playerView = getPlayerView();
        return (playerView == null || (player = playerView.getPlayer()) == null || player.getPlaybackState() != 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(VideoPlayerContainer videoPlayerContainer) {
        PlayerView playerView = videoPlayerContainer.getPlayerView();
        Intrinsics.checkNotNull(playerView);
        Player player = playerView.getPlayer();
        Intrinsics.checkNotNull(player, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
        ((ExoPlayer) player).prepare();
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bindErrorView();
    }

    @Override // android.view.View
    public void setClipToOutline(boolean clipToOutline) {
        super.setClipToOutline(clipToOutline);
        this.playerContainer.setClipToOutline(clipToOutline);
    }

    public final void unbindPlayerView() {
        Player player;
        this.errorTxtDisposable.dispose();
        this.errorTxt.setVisibility(8);
        this.retryBtn.setVisibility(8);
        PlayerView playerView = getPlayerView();
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.removeListener(this.playerListener);
        }
        this.playerContainer.removeAllViews();
        this.renderedFirstFrame = false;
        updateBufferingIcon();
    }

    public final void bindPlayerView(PlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.playerContainer.addView(playerView);
        Player player = playerView.getPlayer();
        Intrinsics.checkNotNull(player);
        player.addListener(this.playerListener);
        updatePreviewImage();
        updateBufferingIcon();
        bindErrorView();
    }

    private final void bindErrorView() {
        final View viewFindViewById;
        PlayerView playerView = getPlayerView();
        if (playerView != null && isAttachedToWindow() && this.errorTxtDisposable.isDisposed() && (viewFindViewById = playerView.findViewById(androidx.media3.p014ui.R$id.exo_error_message)) != null) {
            this.errorTxtDisposable = ViewDisposerKt.bindTo$default(RxView.globalLayouts(viewFindViewById), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.video.VideoPlayerContainer$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoPlayerContainer.bindErrorView$lambda$1(this.f$0, viewFindViewById, (Unit) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindErrorView$lambda$1(VideoPlayerContainer videoPlayerContainer, View view, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((videoPlayerContainer.errorTxt.getVisibility() == 0) != (view.getVisibility() == 0)) {
            videoPlayerContainer.errorTxt.setVisibility(view.getVisibility() == 0 ? 0 : 8);
            videoPlayerContainer.retryBtn.setVisibility(view.getVisibility() == 0 ? 0 : 8);
            videoPlayerContainer.updatePreviewImage();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final void updatePreviewImage() {
        if (getPlayerView() == null) {
            return;
        }
        if (!this.enablePreviewImage) {
            getPreviewImg().setVisibility(8);
            return;
        }
        getPreviewImg().setVisibility(this.renderedFirstFrame ? 4 : 0);
        getPreviewImg().setClipToOutline(getClipToOutline());
        HttpUrl httpUrl = this.previewImageUrl;
        Drawable drawable = null;
        if (httpUrl != null) {
            if (!this.renderedFirstFrame) {
                ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(httpUrl).fit().centerCrop(), getPreviewImg(), null, null, 6, null);
            }
        } else {
            getImageLoader().cancelRequest(getPreviewImg());
            getPreviewImg().setImageDrawable(null);
        }
        ImageView previewImg = getPreviewImg();
        if (this.enablePlayIcon && !isBuffering() && this.errorTxt.getVisibility() == 8) {
            drawable = this.previewImgForegroundDrawable;
        }
        previewImg.setForeground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBufferingIcon() {
        PlayerView playerView = getPlayerView();
        if (playerView != null) {
            playerView.setShowBuffering(this.enableBufferingView ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateController() {
        PlayerView playerView;
        if (this.enableBufferingView && isBuffering() && (playerView = getPlayerView()) != null) {
            playerView.hideController();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScreenDim() {
        Player player;
        PlayerView playerView = getPlayerView();
        if (playerView == null || (player = playerView.getPlayer()) == null) {
            return;
        }
        boolean z = false;
        boolean z2 = player.getVolume() > 0.0f;
        boolean z3 = (!player.getPlayWhenReady() || player.getPlaybackState() == 4 || player.getPlaybackState() == 1) ? false : true;
        if (z2 && z3) {
            z = true;
        }
        playerView.setKeepScreenOn(z);
    }
}
