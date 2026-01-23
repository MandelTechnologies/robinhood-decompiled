package com.robinhood.android.engagement.goldevent;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
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
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.mux.stats.sdk.core.MuxSDKViewOrientation;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.muxstats.ExoPlayerExt;
import com.mux.stats.sdk.muxstats.MuxSDKViewPresentation;
import com.mux.stats.sdk.muxstats.MuxStatsSdkMedia3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.engagement.goldevent.LiveEventStreamEvent;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionschain.OptionChainListView9;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.shared.engagement.contracts.LiveEventStreamKey;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;
import microgram.contracts.gold_live_event.proto.p490v1.DismissRequestDto;
import microgram.contracts.gold_live_event.proto.p490v1.DismissResponseDto;
import microgram.contracts.gold_live_event.proto.p490v1.EventHostService;
import microgram.contracts.gold_live_event.proto.p490v1.EventService;
import microgram.contracts.gold_live_event.proto.p490v1.GetEventConfigurationRequestDto;
import microgram.contracts.gold_live_event.proto.p490v1.GetEventConfigurationResponseDto;
import microgram.contracts.gold_live_event.proto.p490v1.ReloadExperimentRequestDto;
import microgram.contracts.gold_live_event.proto.p490v1.ReloadExperimentResponseDto;
import microgram.contracts.gold_live_event.proto.p490v1.UpdateEventPageVisibilityRequestDto;
import microgram.contracts.gold_live_event.proto.p490v1.UpdatePlaybackStatusRequestDto;
import org.json.JSONException;
import timber.log.Timber;

/* compiled from: LiveEventStreamDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001EB=\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020 0$H\u0003J\b\u0010(\u001a\u00020)H\u0017J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0003J\b\u0010,\u001a\u00020)H\u0002J\u0006\u0010-\u001a\u00020)J\b\u0010.\u001a\u00020)H\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020)H\u0016J\b\u00103\u001a\u00020)H\u0014J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\u0006\u00106\u001a\u00020)J\u000e\u00107\u001a\u00020)2\u0006\u00108\u001a\u000201J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020?2\u0006\u0010;\u001a\u00020@H\u0096@¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020 0$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/engagement/goldevent/PlaybackController;", "Lmicrogram/contracts/gold_live_event/proto/v1/EventHostService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "appContext", "Landroid/content/Context;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroid/content/Context;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlinx/coroutines/CoroutineScope;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "streamStateMonitoringJob", "Lkotlinx/coroutines/Job;", "key", "Lcom/robinhood/shared/engagement/contracts/LiveEventStreamKey;", "getKey", "()Lcom/robinhood/shared/engagement/contracts/LiveEventStreamKey;", "goldEventService", "Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "exoPlayerInstance", "Landroidx/media3/exoplayer/ExoPlayer;", "getExoPlayerInstance", "()Landroidx/media3/exoplayer/ExoPlayer;", "muxStats", "Lcom/mux/stats/sdk/muxstats/MuxStatsSdkMedia3;", "getMuxStats", "()Lcom/mux/stats/sdk/muxstats/MuxStatsSdkMedia3;", "createMuxBoundExoPlayerInstance", "onCreate", "", "onResume", "startStreamStateMonitoring", "onStreamEnded", "sendPlaybackStatusEnded", "onPauseRequested", "onLayoutChanged", "isLandscope", "", "onPlayRequested", "onCleared", "onStart", "onStop", "onDismiss", "onPipModeChanged", "isInPipMode", BentoAlertSheet6.button2Title, "Lmicrogram/contracts/gold_live_event/proto/v1/DismissResponseDto;", "request", "Lmicrogram/contracts/gold_live_event/proto/v1/DismissRequestDto;", "(Lmicrogram/contracts/gold_live_event/proto/v1/DismissRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ReloadExperiment", "Lmicrogram/contracts/gold_live_event/proto/v1/ReloadExperimentResponseDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/ReloadExperimentRequestDto;", "(Lmicrogram/contracts/gold_live_event/proto/v1/ReloadExperimentRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMuxStates", "url", "", "Companion", "feature-live-event-stream_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LiveEventStreamDuxo extends BaseDuxo5<LiveEventStreamViewState, LiveEventStreamEvent> implements HasSavedState, PlaybackController, EventHostService {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context appContext;
    private final ExoPlayer exoPlayerInstance;
    private final EventService goldEventService;
    private final LiveEventStreamKey key;
    private final MuxStatsSdkMedia3<ExoPlayer> muxStats;
    private final CoroutineScope rootCoroutineScope;
    private final SavedStateHandle savedStateHandle;
    private Job streamStateMonitoringJob;

    public Object Dismiss(Request<DismissRequestDto> request, Continuation<? super Response<DismissResponseDto>> continuation) {
        return EventHostService.DefaultImpls.Dismiss(this, request, continuation);
    }

    public Object ReloadExperiment(Request<ReloadExperimentRequestDto> request, Continuation<? super Response<ReloadExperimentResponseDto>> continuation) {
        return EventHostService.DefaultImpls.ReloadExperiment(this, request, continuation);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveEventStreamDuxo(DuxoBundle duxoBundle, Context appContext, SavedStateHandle savedStateHandle, MicrogramManager microgramManager, LazyMoshi moshi, @RootCoroutineScope CoroutineScope rootCoroutineScope) {
        super(new LiveEventStreamViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.appContext = appContext;
        this.savedStateHandle = savedStateHandle;
        this.rootCoroutineScope = rootCoroutineScope;
        LiveEventStreamKey liveEventStreamKey = (LiveEventStreamKey) INSTANCE.getArgs(getSavedStateHandle());
        this.key = liveEventStreamKey;
        this.goldEventService = (EventService) RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication(liveEventStreamKey.getMicrogramId(), null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(EventHostService.class), this)), new Function1() { // from class: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEventStreamDuxo.goldEventService$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEventStreamDuxo.goldEventService$lambda$1((DialogFragmentKey) obj);
            }
        }).getServiceLocator().getClient(EventService.class);
        MuxStatsSdkMedia3<ExoPlayer> muxStatsSdkMedia3CreateMuxBoundExoPlayerInstance = createMuxBoundExoPlayerInstance();
        this.muxStats = muxStatsSdkMedia3CreateMuxBoundExoPlayerInstance;
        this.exoPlayerInstance = (ExoPlayer) muxStatsSdkMedia3CreateMuxBoundExoPlayerInstance.getBoundPlayer();
    }

    public final LiveEventStreamKey getKey() {
        return this.key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goldEventService$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goldEventService$lambda$1(DialogFragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final ExoPlayer getExoPlayerInstance() {
        return this.exoPlayerInstance;
    }

    public final MuxStatsSdkMedia3<ExoPlayer> getMuxStats() {
        return this.muxStats;
    }

    private final MuxStatsSdkMedia3<ExoPlayer> createMuxBoundExoPlayerInstance() {
        Timber.INSTANCE.mo3350d("Creating ExoPlayer instance", new Object[0]);
        final ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.appContext).setLoadControl(new DefaultLoadControl.Builder().setBufferDurationsMs(AchTransfer.MAX_DEPOSIT_LIMIT, AchTransfer.MAX_DEPOSIT_LIMIT, 2500, OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS).build()).setMediaSourceFactory(new DefaultMediaSourceFactory(this.appContext).setLiveTargetOffsetMs(3000L).setLoadErrorHandlingPolicy((LoadErrorHandlingPolicy) new DefaultLoadErrorHandlingPolicy(3))).setRenderersFactory(new DefaultRenderersFactory(this.appContext).setExtensionRendererMode(2)).setSeekBackIncrementMs(1000L).setSeekForwardIncrementMs(1000L).build();
        exoPlayerBuild.setSeekParameters(SeekParameters.CLOSEST_SYNC);
        exoPlayerBuild.setRepeatMode(0);
        exoPlayerBuild.setVideoChangeFrameRateStrategy(0);
        exoPlayerBuild.setVideoScalingMode(1);
        exoPlayerBuild.addListener(new Player.Listener() { // from class: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$createMuxBoundExoPlayerInstance$1$1
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
            public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                super.onPlayerError(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerErrorChanged(PlaybackException error) {
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
            public void onPlaybackStateChanged(int state) {
                int playbackState = exoPlayerBuild.getPlaybackState();
                if (playbackState == 1) {
                    Timber.INSTANCE.mo3350d("Playback state -> Idle", new Object[0]);
                    return;
                }
                if (playbackState == 2) {
                    Timber.INSTANCE.mo3350d("Playback state -> Buffering", new Object[0]);
                    this.applyMutation(new LiveEventStreamDuxo3(null));
                } else if (playbackState == 3) {
                    Timber.INSTANCE.mo3350d("Playback state -> Ready", new Object[0]);
                    exoPlayerBuild.setPlayWhenReady(true);
                    this.applyMutation(new LiveEventStreamDuxo4(null));
                } else {
                    if (playbackState != 4) {
                        return;
                    }
                    Timber.INSTANCE.mo3350d("Playback state -> Ended", new Object[0]);
                    this.onStreamEnded();
                }
            }
        });
        Intrinsics.checkNotNull(exoPlayerBuild);
        return ExoPlayerExt.monitorWithMuxData$default(exoPlayerBuild, this.appContext, "1ei965u9fpdb61fpmb3rtas34", new CustomerData(), null, null, null, 56, null);
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onCreate$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onCreate$1 */
    static final class C145361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145361(Continuation<? super C145361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveEventStreamDuxo.this.new C145361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LiveEventStreamDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onCreate$1$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GetEventConfigurationResponseDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LiveEventStreamDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LiveEventStreamDuxo liveEventStreamDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = liveEventStreamDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GetEventConfigurationResponseDto getEventConfigurationResponseDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(getEventConfigurationResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws JSONException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GetEventConfigurationResponseDto getEventConfigurationResponseDto = (GetEventConfigurationResponseDto) this.L$0;
                String live_url = this.this$0.getStateFlow().getValue().getEventConfiguration().getLive_url();
                String live_url2 = getEventConfigurationResponseDto.getLive_url();
                if (!Intrinsics.areEqual(live_url2, live_url)) {
                    this.this$0.updateMuxStates(live_url2);
                    this.this$0.getExoPlayerInstance().setMediaSource(StreamingUtils.getMediaSource(live_url2));
                    this.this$0.getExoPlayerInstance().prepare();
                    this.this$0.getExoPlayerInstance().setPlayWhenReady(true);
                }
                this.this$0.applyMutation(new C498591(getEventConfigurationResponseDto, null));
                return Unit.INSTANCE;
            }

            /* compiled from: LiveEventStreamDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onCreate$1$1$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498591 extends ContinuationImpl7 implements Function2<LiveEventStreamViewState, Continuation<? super LiveEventStreamViewState>, Object> {
                final /* synthetic */ GetEventConfigurationResponseDto $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498591(GetEventConfigurationResponseDto getEventConfigurationResponseDto, Continuation<? super C498591> continuation) {
                    super(2, continuation);
                    this.$response = getEventConfigurationResponseDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498591 c498591 = new C498591(this.$response, continuation);
                    c498591.L$0 = obj;
                    return c498591;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(LiveEventStreamViewState liveEventStreamViewState, Continuation<? super LiveEventStreamViewState> continuation) {
                    return ((C498591) create(liveEventStreamViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return LiveEventStreamViewState.copy$default((LiveEventStreamViewState) this.L$0, this.$response.toProto(), null, 2, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<GetEventConfigurationResponseDto> flowGetEventConfiguration = LiveEventStreamDuxo.this.goldEventService.GetEventConfiguration(new GetEventConfigurationRequestDto());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LiveEventStreamDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowGetEventConfiguration, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        startStreamStateMonitoring();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C145361(null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        onPlayRequested();
    }

    private final void startStreamStateMonitoring() {
        Job job = this.streamStateMonitoringJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.streamStateMonitoringJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C145441(null), 3, null);
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$startStreamStateMonitoring$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {239}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$startStreamStateMonitoring$1 */
    static final class C145441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C145441(Continuation<? super C145441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145441 c145441 = LiveEventStreamDuxo.this.new C145441(continuation);
            c145441.L$0 = obj;
            return c145441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (CoroutineScope2.isActive(coroutineScope)) {
                if (StreamingUtils.hasValidHlsStream(LiveEventStreamDuxo.this.getExoPlayerInstance())) {
                    boolean z = LiveEventStreamDuxo.this.getExoPlayerInstance().getDuration() - LiveEventStreamDuxo.this.getExoPlayerInstance().getCurrentPosition() < 1000;
                    if (StreamingUtils.hasEndTag(LiveEventStreamDuxo.this.getExoPlayerInstance()) && z) {
                        Timber.INSTANCE.mo3350d("Detected end tag in HLS stream, position=" + LiveEventStreamDuxo.this.getExoPlayerInstance().getCurrentPosition() + " vs duration=" + LiveEventStreamDuxo.this.getExoPlayerInstance().getDuration(), new Object[0]);
                        LiveEventStreamDuxo.this.onStreamEnded();
                        CoroutineScope2.cancel$default(coroutineScope, null, 1, null);
                    }
                }
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStreamEnded() {
        Timber.INSTANCE.mo3350d("onStreamEnded", new Object[0]);
        submit(LiveEventStreamEvent.StreamEnded.INSTANCE);
        this.exoPlayerInstance.stop();
        this.exoPlayerInstance.release();
        applyMutation(new C145421(null));
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onStreamEnded$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onStreamEnded$1 */
    static final class C145421 extends ContinuationImpl7 implements Function2<LiveEventStreamViewState, Continuation<? super LiveEventStreamViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C145421(Continuation<? super C145421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145421 c145421 = new C145421(continuation);
            c145421.L$0 = obj;
            return c145421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveEventStreamViewState liveEventStreamViewState, Continuation<? super LiveEventStreamViewState> continuation) {
            return ((C145421) create(liveEventStreamViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LiveEventStreamViewState.copy$default((LiveEventStreamViewState) this.L$0, null, LiveEventStreamViewState3.ENDED, 1, null);
        }
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$sendPlaybackStatusEnded$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$sendPlaybackStatusEnded$1 */
    static final class C145431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145431(Continuation<? super C145431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveEventStreamDuxo.this.new C145431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventService eventService = LiveEventStreamDuxo.this.goldEventService;
                UpdatePlaybackStatusRequestDto updatePlaybackStatusRequestDto = new UpdatePlaybackStatusRequestDto(true, false, 2, null);
                this.label = 1;
                if (eventService.UpdatePlaybackStatus(updatePlaybackStatusRequestDto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void sendPlaybackStatusEnded() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C145431(null), 3, null);
    }

    @Override // com.robinhood.android.engagement.goldevent.PlaybackController
    public void onPauseRequested() {
        Timber.INSTANCE.mo3350d("onPauseRequested", new Object[0]);
        this.exoPlayerInstance.pause();
        applyMutation(new C145371(null));
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onPauseRequested$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onPauseRequested$1 */
    static final class C145371 extends ContinuationImpl7 implements Function2<LiveEventStreamViewState, Continuation<? super LiveEventStreamViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C145371(Continuation<? super C145371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145371 c145371 = new C145371(continuation);
            c145371.L$0 = obj;
            return c145371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveEventStreamViewState liveEventStreamViewState, Continuation<? super LiveEventStreamViewState> continuation) {
            return ((C145371) create(liveEventStreamViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LiveEventStreamViewState.copy$default((LiveEventStreamViewState) this.L$0, null, LiveEventStreamViewState3.PAUSED, 1, null);
        }
    }

    @Override // com.robinhood.android.engagement.goldevent.PlaybackController
    public void onLayoutChanged(boolean isLandscope) {
        if (isLandscope) {
            this.muxStats.orientationChange(MuxSDKViewOrientation.LANDSCAPE);
            this.muxStats.presentationChange(MuxSDKViewPresentation.FULLSCREEN);
        } else {
            this.muxStats.orientationChange(MuxSDKViewOrientation.PORTRAIT);
            this.muxStats.presentationChange(MuxSDKViewPresentation.NORMAL);
        }
    }

    @Override // com.robinhood.android.engagement.goldevent.PlaybackController
    public void onPlayRequested() {
        Timber.INSTANCE.mo3350d("onPlayRequested", new Object[0]);
        this.exoPlayerInstance.setPlayWhenReady(true);
        applyMutation(new C145391(null));
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onPlayRequested$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onPlayRequested$1 */
    static final class C145391 extends ContinuationImpl7 implements Function2<LiveEventStreamViewState, Continuation<? super LiveEventStreamViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C145391(Continuation<? super C145391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145391 c145391 = new C145391(continuation);
            c145391.L$0 = obj;
            return c145391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveEventStreamViewState liveEventStreamViewState, Continuation<? super LiveEventStreamViewState> continuation) {
            return ((C145391) create(liveEventStreamViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LiveEventStreamViewState.copy$default((LiveEventStreamViewState) this.L$0, null, LiveEventStreamViewState3.PLAYING, 1, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        this.exoPlayerInstance.release();
        Job job = this.streamStateMonitoringJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.muxStats.release();
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onStart$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onStart$1 */
    static final class C145401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145401(Continuation<? super C145401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveEventStreamDuxo.this.new C145401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventService eventService = LiveEventStreamDuxo.this.goldEventService;
                UpdateEventPageVisibilityRequestDto updateEventPageVisibilityRequestDto = new UpdateEventPageVisibilityRequestDto(true);
                this.label = 1;
                if (eventService.UpdateEventPageVisibility(updateEventPageVisibilityRequestDto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C145401(null), 3, null);
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onStop$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onStop$1 */
    static final class C145411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C145411(Continuation<? super C145411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveEventStreamDuxo.this.new C145411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventService eventService = LiveEventStreamDuxo.this.goldEventService;
                UpdateEventPageVisibilityRequestDto updateEventPageVisibilityRequestDto = new UpdateEventPageVisibilityRequestDto(false);
                this.label = 1;
                if (eventService.UpdateEventPageVisibility(updateEventPageVisibilityRequestDto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        onPauseRequested();
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C145411(null), 3, null);
        super.onStop();
    }

    public final void onDismiss() {
        withDataState(new Function1() { // from class: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEventStreamDuxo.onDismiss$lambda$4(this.f$0, (LiveEventStreamViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDismiss$lambda$4(LiveEventStreamDuxo liveEventStreamDuxo, LiveEventStreamViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getEventConfiguration().getIntercept_dismiss()) {
            BuildersKt__Builders_commonKt.launch$default(liveEventStreamDuxo.getLifecycleScope(), null, null, new LiveEventStreamDuxo5(liveEventStreamDuxo, null), 3, null);
        } else {
            liveEventStreamDuxo.submit(LiveEventStreamEvent.Dismiss.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onPipModeChanged$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {343}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$onPipModeChanged$1 */
    static final class C145381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isInPipMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C145381(boolean z, Continuation<? super C145381> continuation) {
            super(2, continuation);
            this.$isInPipMode = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LiveEventStreamDuxo.this.new C145381(this.$isInPipMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C145381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventService eventService = LiveEventStreamDuxo.this.goldEventService;
                UpdatePlaybackStatusRequestDto updatePlaybackStatusRequestDto = new UpdatePlaybackStatusRequestDto(false, this.$isInPipMode, 1, null);
                this.label = 1;
                if (eventService.UpdatePlaybackStatus(updatePlaybackStatusRequestDto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPipModeChanged(boolean isInPipMode) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C145381(isInPipMode, null), 3, null);
    }

    @Override // microgram.contracts.gold_live_event.proto.p490v1.EventHostService
    public Object Dismiss(DismissRequestDto dismissRequestDto, Continuation<? super DismissResponseDto> continuation) {
        submit(LiveEventStreamEvent.Dismiss.INSTANCE);
        return new DismissResponseDto();
    }

    @Override // microgram.contracts.gold_live_event.proto.p490v1.EventHostService
    public Object ReloadExperiment(ReloadExperimentRequestDto reloadExperimentRequestDto, Continuation<? super ReloadExperimentResponseDto> continuation) {
        return new ReloadExperimentResponseDto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMuxStates(String url) throws JSONException {
        MuxStatsSdkMedia3<ExoPlayer> muxStatsSdkMedia3 = this.muxStats;
        CustomerVideoData customerVideoData = new CustomerVideoData();
        customerVideoData.setVideoSourceUrl(url);
        customerVideoData.setVideoId(this.key.getMicrogramId());
        muxStatsSdkMedia3.videoChange(customerVideoData);
    }

    /* compiled from: LiveEventStreamDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo;", "Lcom/robinhood/shared/engagement/contracts/LiveEventStreamKey;", "<init>", "()V", "feature-live-event-stream_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LiveEventStreamDuxo, LiveEventStreamKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LiveEventStreamKey getArgs(SavedStateHandle savedStateHandle) {
            return (LiveEventStreamKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LiveEventStreamKey getArgs(LiveEventStreamDuxo liveEventStreamDuxo) {
            return (LiveEventStreamKey) DuxoCompanion.DefaultImpls.getArgs(this, liveEventStreamDuxo);
        }
    }
}
