package com.robinhood.android.search.newsfeed.videoplayer;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import androidx.media3.p014ui.PlayerView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.newsfeed.extensions.Contents;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.p200ui.NewsFeedRelatedInstrumentsView;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.video.VideoPlayerContainer;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: NewsFeedVideoView.kt */
@Metadata(m3635d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u00012\b\u0007\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002CDB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003H\u0016J\u0006\u00107\u001a\u000205J\u000e\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020+2\b\b\u0002\u0010<\u001a\u00020=J\u0010\u0010>\u001a\u0002052\u0006\u00106\u001a\u00020\u0003H\u0002J\u0010\u0010?\u001a\u0002052\u0006\u00106\u001a\u00020\u0003H\u0002J\u0010\u0010@\u001a\u0002052\u0006\u00106\u001a\u00020\u0003H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u00020+H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010-\u001a\u0004\u0018\u00010+2\b\u0010\u0010\u001a\u0004\u0018\u00010+@BX\u0082\u000e¢\u0006\n\n\u0002\u00100\"\u0004\b.\u0010/R\u0010\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$Callbacks;)V", "value", "", "videoTitle", "getVideoTitle", "()Ljava/lang/String;", "Lokhttp3/HttpUrl;", "videoUrl", "getVideoUrl", "()Lokhttp3/HttpUrl;", "captionsUrl", "getCaptionsUrl", "Ljava/util/UUID;", "contentId", "getContentId", "()Ljava/util/UUID;", "titleTxt", "Landroid/widget/TextView;", "relatedInstrumentsView", "Lcom/robinhood/android/newsfeed/ui/NewsFeedRelatedInstrumentsView;", "sourceTxt", "timeTxt", "videoPlayerContainer", "Lcom/robinhood/android/video/VideoPlayerContainer;", "soundOffBtn", "Landroid/view/View;", "soundOnBtn", "audioEnabled", "", "video", "isHero", "setHero", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "playerListener", "com/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$playerListener$1", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$playerListener$1;", "bind", "", "state", "unbindPlayerView", "bindPlayerView", "playerView", "Landroidx/media3/ui/PlayerView;", "isVideoViewVisible", "topOffset", "", "bindRelatedInstruments", "bindSourceAndTimeText", "bindSoundButtons", "updateSoundButtons", "isAutoplayingVideo", "Callbacks", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedVideoView extends FrameLayout implements Bindable<Content.Video> {
    private boolean audioEnabled;
    private Callbacks callbacks;
    private HttpUrl captionsUrl;
    private UUID contentId;
    private Boolean isHero;
    private final NewsFeedVideoView2 playerListener;
    private final NewsFeedRelatedInstrumentsView relatedInstrumentsView;
    private final View soundOffBtn;
    private final View soundOnBtn;
    private final TextView sourceTxt;
    private final TextView timeTxt;
    private final TextView titleTxt;
    private Content.Video video;
    private final VideoPlayerContainer videoPlayerContainer;
    private String videoTitle;
    private HttpUrl videoUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewsFeedVideoView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$Callbacks;", "", "onRelatedInstrumentClick", "", "video", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "onToggleVideoAudioClick", "enabled", "", "onToggleVideoAudioAppear", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRelatedInstrumentClick(Content.Video video, RelatedInstrument instrument);

        void onToggleVideoAudioAppear(Content.Video video, boolean enabled);

        void onToggleVideoAudioClick(Content.Video video, boolean enabled);
    }

    public /* synthetic */ NewsFeedVideoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView$playerListener$1] */
    public NewsFeedVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_news_feed_video, true);
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedVideoView._init_$lambda$0(this.f$0);
            }
        }, 1, null);
        View viewFindViewById = findViewById(C27909R.id.news_feed_video_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C27909R.id.news_feed_video_related_instruments);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.relatedInstrumentsView = (NewsFeedRelatedInstrumentsView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C27909R.id.news_feed_video_source_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.sourceTxt = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C27909R.id.news_feed_video_time_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.timeTxt = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C27909R.id.news_feed_video_player_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        VideoPlayerContainer videoPlayerContainer = (VideoPlayerContainer) viewFindViewById5;
        this.videoPlayerContainer = videoPlayerContainer;
        View viewFindViewById6 = findViewById(C27909R.id.news_feed_video_sound_off_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.soundOffBtn = viewFindViewById6;
        View viewFindViewById7 = findViewById(C27909R.id.news_feed_video_sound_on_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.soundOnBtn = viewFindViewById7;
        this.playerListener = new Player.Listener() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView$playerListener$1
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
                this.this$0.updateSoundButtons();
            }
        };
        videoPlayerContainer.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _init_$lambda$0(NewsFeedVideoView newsFeedVideoView) {
        Content.Video video = newsFeedVideoView.video;
        if (video != null) {
            return Contents.toEventData(video, UserInteractionEventData.Action.VIEW_BROWSE_NEWSFEED_THEATRE);
        }
        return null;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public final HttpUrl getVideoUrl() {
        return this.videoUrl;
    }

    public final HttpUrl getCaptionsUrl() {
        return this.captionsUrl;
    }

    public final UUID getContentId() {
        return this.contentId;
    }

    private final void setHero(Boolean bool) {
        int i;
        if (Intrinsics.areEqual(this.isHero, bool) || bool == null) {
            return;
        }
        this.isHero = bool;
        if (bool.booleanValue()) {
            i = C20690R.attr.textAppearanceDisplaySmall;
        } else {
            i = C20690R.attr.textAppearanceRegularMedium;
        }
        TextViewsKt.setTextAppearanceAttr(this.titleTxt, i);
        this.titleTxt.setMaxLines(bool.booleanValue() ? 4 : 3);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Content.Video state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.videoTitle = state.getTitle();
        this.videoUrl = state.getUrl();
        this.captionsUrl = state.getCaptions();
        this.contentId = state.getId();
        this.titleTxt.setText(state.getTitle());
        setHero(Boolean.valueOf(state.isHero()));
        bindRelatedInstruments(state);
        bindSourceAndTimeText(state);
        this.videoPlayerContainer.setPreviewImageUrl(state.getPreviewImageUrl());
        bindSoundButtons(state);
    }

    public final void unbindPlayerView() {
        Player player;
        PlayerView playerView = this.videoPlayerContainer.getPlayerView();
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.removeListener(this.playerListener);
        }
        this.videoPlayerContainer.unbindPlayerView();
        updateSoundButtons();
    }

    public final void bindPlayerView(PlayerView playerView) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        this.videoPlayerContainer.bindPlayerView(playerView);
        Player player = playerView.getPlayer();
        Intrinsics.checkNotNull(player);
        player.addListener(this.playerListener);
    }

    public static /* synthetic */ boolean isVideoViewVisible$default(NewsFeedVideoView newsFeedVideoView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return newsFeedVideoView.isVideoViewVisible(i);
    }

    public final boolean isVideoViewVisible(int topOffset) {
        View view = (View) getParent();
        return view != null && getTop() + this.videoPlayerContainer.getBottom() > view.getTop() + topOffset && getTop() + this.videoPlayerContainer.getTop() < view.getBottom();
    }

    private final void bindRelatedInstruments(final Content.Video state) {
        NewsFeedRelatedInstrumentsView.bind$default(this.relatedInstrumentsView, state.getFirstInstrument(), state.getSecondInstrument(), (String) null, 4, (Object) null);
        this.relatedInstrumentsView.setOnRelatedInstrumentClick(new Function1() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedVideoView.bindRelatedInstruments$lambda$1(this.f$0, state, (RelatedInstrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRelatedInstruments$lambda$1(NewsFeedVideoView newsFeedVideoView, Content.Video video, RelatedInstrument relatedInstrument) {
        Intrinsics.checkNotNullParameter(relatedInstrument, "relatedInstrument");
        Callbacks callbacks = newsFeedVideoView.callbacks;
        if (callbacks != null) {
            callbacks.onRelatedInstrumentClick(video, relatedInstrument);
        }
        return Unit.INSTANCE;
    }

    private final void bindSourceAndTimeText(Content.Video state) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String narrow$default = DurationFormatter.formatNarrow$default(resources, Durations.since(state.getPublishedAt()), false, 4, null);
        this.sourceTxt.setText(state.getSource());
        this.timeTxt.setText(narrow$default);
    }

    private final void bindSoundButtons(final Content.Video state) {
        this.video = state;
        this.audioEnabled = state.getAudioEnabled();
        OnClickListeners.onClick(this.soundOnBtn, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedVideoView.bindSoundButtons$lambda$2(this.f$0, state);
            }
        });
        OnClickListeners.onClick(this.soundOffBtn, new Function0() { // from class: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedVideoView.bindSoundButtons$lambda$3(this.f$0, state);
            }
        });
        updateSoundButtons();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSoundButtons$lambda$2(NewsFeedVideoView newsFeedVideoView, Content.Video video) {
        Callbacks callbacks = newsFeedVideoView.callbacks;
        if (callbacks != null) {
            callbacks.onToggleVideoAudioClick(video, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSoundButtons$lambda$3(NewsFeedVideoView newsFeedVideoView, Content.Video video) {
        Callbacks callbacks = newsFeedVideoView.callbacks;
        if (callbacks != null) {
            callbacks.onToggleVideoAudioClick(video, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSoundButtons() {
        Callbacks callbacks;
        boolean zIsAutoplayingVideo = isAutoplayingVideo();
        this.soundOnBtn.setVisibility(this.audioEnabled && zIsAutoplayingVideo ? 0 : 8);
        this.soundOffBtn.setVisibility(!this.audioEnabled && zIsAutoplayingVideo ? 0 : 8);
        Content.Video video = this.video;
        if (video != null) {
            if (this.soundOnBtn.getVisibility() == 0) {
                Callbacks callbacks2 = this.callbacks;
                if (callbacks2 != null) {
                    callbacks2.onToggleVideoAudioAppear(video, false);
                    return;
                }
                return;
            }
            if (this.soundOffBtn.getVisibility() != 0 || (callbacks = this.callbacks) == null) {
                return;
            }
            callbacks.onToggleVideoAudioAppear(video, true);
        }
    }

    private final boolean isAutoplayingVideo() {
        return this.videoPlayerContainer.getPlayerView() != null;
    }

    /* compiled from: NewsFeedVideoView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedVideoView> {
        private final /* synthetic */ Inflater<NewsFeedVideoView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedVideoView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedVideoView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_news_feed_video);
        }
    }
}
