package com.robinhood.android.feature.livetrivia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
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
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.engagement.contracts.LiveTriviaKey;
import com.robinhood.android.feature.livetrivia.LiveTriviaEvent;
import com.robinhood.android.feature.livetrivia.LiveTriviaFragment;
import com.robinhood.android.feature.livetrivia.composable.LoadingComposable4;
import com.robinhood.android.feature.livetrivia.composable.VideoPlayerComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;
import trivia.p550v1.GetVideoViewModelResponseDto;

/* compiled from: LiveTriviaFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\r\u0010 \u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0003J\b\u0010&\u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+²\u0006\u0012\u0010(\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/livetrivia/LiveTriviaDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onBackPressed", "", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "onDestroyView", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "getMediaSource", "Landroidx/media3/exoplayer/source/MediaSource;", "videoUrl", "", "dismissScreen", "setTriviaReminder", "event", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$SetTriviaEventReminder;", "Companion", "feature-live-trivia_externalDebug", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent;", "embeddedSectionHeight", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LiveTriviaFragment extends GenericComposeFragment {
    private static final int BOTTOM_SECTION_ANIMATION_DURATION = 500;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, LiveTriviaDuxo.class);
    private ExoPlayer exoPlayer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(LiveTriviaFragment liveTriviaFragment, int i, Composer composer, int i2) {
        liveTriviaFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LiveTriviaDuxo getDuxo() {
        return (LiveTriviaDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    @SuppressLint({"MissingSuperCall"})
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<LiveTriviaEvent> ComposeContent$lambda$1(SnapshotState4<Event<LiveTriviaEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getScarletManager().putOverlay(DayNightOverlay.NIGHT, Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().getLiveTriviaManager().clientService();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDuxo().getLiveTriviaManager().screenStateChanged(true);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getDuxo().getLiveTriviaManager().screenStateChanged(false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().closeTrivia();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(requireActivity()).build();
        exoPlayerBuild.setRepeatMode(0);
        exoPlayerBuild.addListener(new Player.Listener() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$onViewCreated$1$1
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
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                super.onPlaybackSuppressionReasonChanged(i);
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

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState != 2) {
                    if (playbackState != 3) {
                        return;
                    }
                    this.this$0.getDuxo().onBufferingFinished();
                    return;
                }
                ExoPlayer exoPlayer = this.this$0.exoPlayer;
                if (exoPlayer == null) {
                    return;
                }
                long jMax = Math.max(0L, exoPlayer.getBufferedPosition() - exoPlayer.getCurrentPosition());
                if (!exoPlayerBuild.isPlaying() && jMax < 300) {
                    this.this$0.getDuxo().onVideoLoadingChange(true);
                }
                if (jMax == 0) {
                    this.this$0.getDuxo().onBufferingStarted();
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                switch (error.errorCode) {
                    case 2000:
                    case 2001:
                    case 2002:
                        this.this$0.getDuxo().onVideoLoadingChange(true);
                        break;
                }
            }
        });
        this.exoPlayer = exoPlayerBuild;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        ExoPlayer exoPlayer;
        super.onStart();
        GetVideoViewModelResponseDto triviaVideoViewModel = getDuxo().getStateFlow().getValue().getTriviaVideoViewModel();
        if (triviaVideoViewModel == null || !triviaVideoViewModel.is_video_playing() || (exoPlayer = this.exoPlayer) == null) {
            return;
        }
        exoPlayer.play();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ExoPlayer exoPlayer = this.exoPlayer;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ExoPlayer exoPlayer = this.exoPlayer;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = this.exoPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.setPlayWhenReady(false);
        }
        ExoPlayer exoPlayer3 = this.exoPlayer;
        if (exoPlayer3 != null) {
            exoPlayer3.release();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        boolean z;
        EventConsumer<LiveTriviaEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1900403916);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1900403916, i2, -1, "com.robinhood.android.feature.livetrivia.LiveTriviaFragment.ComposeContent (LiveTriviaFragment.kt:180)");
            }
            final LiveTriviaViewState liveTriviaViewState = (LiveTriviaViewState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), Color.INSTANCE.m6725getTransparent0d7_KjU(), false, null, 4, null);
            final StateFlow<Event<LiveTriviaEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "LiveTriviaFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof LiveTriviaEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            Event<LiveTriviaEvent> value = eventFlow.getValue();
            Event<LiveTriviaEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof LiveTriviaEvent)) {
                value = null;
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1871965932, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment.ComposeContent.1

                /* compiled from: LiveTriviaFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<Event<LiveTriviaEvent>> $event$delegate;
                    final /* synthetic */ LiveTriviaViewState $state;
                    final /* synthetic */ LiveTriviaFragment this$0;

                    AnonymousClass1(LiveTriviaViewState liveTriviaViewState, LiveTriviaFragment liveTriviaFragment, SnapshotState4<Event<LiveTriviaEvent>> snapshotState4) {
                        this.$state = liveTriviaViewState;
                        this.this$0 = liveTriviaFragment;
                        this.$event$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(LiveTriviaFragment liveTriviaFragment) {
                        liveTriviaFragment.getDuxo().closeTrivia();
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        EventConsumer eventConsumer;
                        EventConsumer eventConsumer2;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(791136858, i, -1, "com.robinhood.android.feature.livetrivia.LiveTriviaFragment.ComposeContent.<anonymous>.<anonymous> (LiveTriviaFragment.kt:191)");
                        }
                        final Event eventComposeContent$lambda$1 = LiveTriviaFragment.ComposeContent$lambda$1(this.$event$delegate);
                        if (eventComposeContent$lambda$1 != null) {
                            final LiveTriviaFragment liveTriviaFragment = this.this$0;
                            if ((eventComposeContent$lambda$1.getData() instanceof LiveTriviaEvent.DismissView) && (eventConsumer2 = (EventConsumer) eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                                eventConsumer2.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1$invoke$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m14471invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m14471invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        liveTriviaFragment.dismissScreen();
                                    }
                                });
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        final Event eventComposeContent$lambda$12 = LiveTriviaFragment.ComposeContent$lambda$1(this.$event$delegate);
                        if (eventComposeContent$lambda$12 != null) {
                            final LiveTriviaFragment liveTriviaFragment2 = this.this$0;
                            if ((eventComposeContent$lambda$12.getData() instanceof LiveTriviaEvent.SetTriviaEventReminder) && (eventConsumer = (EventConsumer) eventComposeContent$lambda$12.getGetEventConsumer().invoke()) != null) {
                                eventConsumer.consume(eventComposeContent$lambda$12, new Function1() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1$invoke$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m14472invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m14472invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        liveTriviaFragment2.setTriviaReminder((LiveTriviaEvent.SetTriviaEventReminder) eventComposeContent$lambda$12.getData());
                                    }
                                });
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (this.$state.getLoading()) {
                            composer.startReplaceGroup(-2022081332);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final LiveTriviaFragment liveTriviaFragment3 = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LiveTriviaFragment.C167641.AnonymousClass1.invoke$lambda$3$lambda$2(liveTriviaFragment3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LoadingComposable4.LoadingComposable((Function0) objRememberedValue, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-2021765256);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion, BentoColor.INSTANCE.m21319getNightJet0d7_KjU(), null, 2, null), 0.0f, 1, null);
                            LiveTriviaViewState liveTriviaViewState = this.$state;
                            final LiveTriviaFragment liveTriviaFragment4 = this.this$0;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            GetVideoViewModelResponseDto triviaVideoViewModel = liveTriviaViewState.getTriviaVideoViewModel();
                            composer.startReplaceGroup(-1463358788);
                            if (triviaVideoViewModel != null) {
                                ExoPlayer exoPlayer = liveTriviaFragment4.exoPlayer;
                                composer.startReplaceGroup(-1463357140);
                                if (exoPlayer != null) {
                                    VideoPlayerComposable.VideoPlayerComposable(triviaVideoViewModel, exoPlayer, liveTriviaViewState.isVideoLoading(), composer, 0);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                            GetVideoViewModelResponseDto triviaVideoViewModel2 = liveTriviaViewState.getTriviaVideoViewModel();
                            boolean z = triviaVideoViewModel2 != null && triviaVideoViewModel2.is_video_playing();
                            Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierSystemBarsPadding);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            boolean z2 = z;
                            BentoAppBarScope bentoAppBarScope = BentoAppBarScope.INSTANCE;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(liveTriviaFragment4);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LiveTriviaFragment.C167641.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(liveTriviaFragment4);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            bentoAppBarScope.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue2, composer, BentoAppBarScope.$stable << 12, 7);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ROBINHOOD_24), "Robinhood logo", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5142padding3ABfNKs(ModifiersKt.isInvisible(companion, !z2), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, false, composer, BentoIcon4.Size24.$stable | 48, 48);
                            composer.endNode();
                            BoxWithConstraints.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambda3.rememberComposableLambda(272121040, true, new LiveTriviaFragment2(z2, liveTriviaViewState, liveTriviaFragment4), composer, 54), composer, 3078, 6);
                            composer.endNode();
                            composer.endNode();
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(LiveTriviaFragment liveTriviaFragment) {
                        liveTriviaFragment.getDuxo().closeTrivia();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1871965932, i3, -1, "com.robinhood.android.feature.livetrivia.LiveTriviaFragment.ComposeContent.<anonymous> (LiveTriviaFragment.kt:189)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, 0L, 0L, 0L, BentoColor.INSTANCE.m21137getBlackWidowNewTennis0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(791136858, true, new AnonymousClass1(liveTriviaViewState, this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306368, 383);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            final Event<LiveTriviaEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof LiveTriviaEvent.PlaybackCatchupEvent) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14470invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14470invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        LiveTriviaEvent.PlaybackCatchupEvent playbackCatchupEvent = (LiveTriviaEvent.PlaybackCatchupEvent) eventComposeContent$lambda$1.getData();
                        ExoPlayer exoPlayer = this.exoPlayer;
                        if (exoPlayer != null) {
                            exoPlayer.seekTo(playbackCatchupEvent.getSeekToMs());
                        }
                    }
                });
            }
            GetVideoViewModelResponseDto triviaVideoViewModel = liveTriviaViewState.getTriviaVideoViewModel();
            if (triviaVideoViewModel == null) {
                z = false;
            } else {
                String video_url = triviaVideoViewModel.getVideo_url();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(video_url) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LiveTriviaFragment3(video_url, this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                z = false;
                EffectsKt.LaunchedEffect(video_url, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(triviaVideoViewModel);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new LiveTriviaFragment4(this, triviaVideoViewModel, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(video_url, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            }
            ExoPlayer exoPlayer = this.exoPlayer;
            if (exoPlayer != null) {
                GetVideoViewModelResponseDto triviaVideoViewModel2 = liveTriviaViewState.getTriviaVideoViewModel();
                exoPlayer.setPlayWhenReady((triviaVideoViewModel2 == null || !triviaVideoViewModel2.is_video_playing()) ? z : true);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.livetrivia.LiveTriviaFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiveTriviaFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaSource getMediaSource(String videoUrl) {
        DefaultHttpDataSource.Factory allowCrossProtocolRedirects = new DefaultHttpDataSource.Factory().setAllowCrossProtocolRedirects(true);
        Intrinsics.checkNotNullExpressionValue(allowCrossProtocolRedirects, "setAllowCrossProtocolRedirects(...)");
        HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(allowCrossProtocolRedirects).setLoadErrorHandlingPolicy((LoadErrorHandlingPolicy) new DefaultLoadErrorHandlingPolicy(Integer.MAX_VALUE)).createMediaSource(MediaItem.fromUri(videoUrl));
        Intrinsics.checkNotNullExpressionValue(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
        return hlsMediaSourceCreateMediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissScreen() {
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTriviaReminder(LiveTriviaEvent.SetTriviaEventReminder event) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", event.getTitle());
        intent.putExtra("description", event.getDescription());
        Instant startTime = event.getStartTime();
        if (startTime != null) {
            intent.putExtra("beginTime", startTime.toEpochMilli());
        }
        Instant endTime = event.getEndTime();
        if (endTime != null) {
            intent.putExtra("endTime", endTime.toEpochMilli());
        }
        String eventUrl = event.getEventUrl();
        if (eventUrl != null) {
            intent.putExtra("eventLocation", eventUrl);
        }
        if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
            requireActivity().startActivity(intent);
        }
    }

    /* compiled from: LiveTriviaFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaFragment;", "Lcom/robinhood/android/engagement/contracts/LiveTriviaKey;", "<init>", "()V", "BOTTOM_SECTION_ANIMATION_DURATION", "", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LiveTriviaFragment, LiveTriviaKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LiveTriviaKey getArgs(LiveTriviaFragment liveTriviaFragment) {
            return (LiveTriviaKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, liveTriviaFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LiveTriviaFragment newInstance(LiveTriviaKey liveTriviaKey) {
            return (LiveTriviaFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, liveTriviaKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LiveTriviaFragment liveTriviaFragment, LiveTriviaKey liveTriviaKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, liveTriviaFragment, liveTriviaKey);
        }
    }
}
