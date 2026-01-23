package com.robinhood.android.advisory.insights.detail;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
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
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InsightAudioComponents.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a{\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2<\b\u0002\u0010\n\u001a6\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0013\u001a\"\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"rememberAudioController", "Lkotlin/Pair;", "Lcom/robinhood/android/advisory/insights/detail/AudioControllerState;", "", "audioUrl", "", "providedPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "screenViewState", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState$Loaded;", "onToggleLog", "Lkotlin/Function2;", "Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;", "Lkotlin/ParameterName;", "name", "newStatus", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "descriptor", "", "(Ljava/lang/String;Landroidx/media3/exoplayer/ExoPlayer;Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState$Loaded;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)Lkotlin/Pair;", "reportAudioPlaybackError", "error", "Landroidx/media3/common/PlaybackException;", "viewState", "Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailViewState;", "feature-advisory-insights_externalDebug", "currentViewState", "desiredStatus", "status", "isReady", "", "durationMs", "currentUrl"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class InsightAudioComponents2 {

    /* compiled from: InsightAudioComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsightAudioComponents6.values().length];
            try {
                iArr[InsightAudioComponents6.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsightAudioComponents6.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsightAudioComponents6.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InsightAudioComponents6.PLAYING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Tuples2<AudioControllerState, Long> rememberAudioController(String str, ExoPlayer exoPlayer, AdvisoryInsightDetailViewState.Loaded loaded, Function2<? super InsightAudioComponents6, ? super UserInteractionEventDescriptor, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        int i4;
        composer.startReplaceGroup(389793509);
        final ExoPlayer exoPlayer2 = (i2 & 2) != 0 ? null : exoPlayer;
        AdvisoryInsightDetailViewState.Loaded loaded2 = (i2 & 4) != 0 ? null : loaded;
        final Function2<? super InsightAudioComponents6, ? super UserInteractionEventDescriptor, Unit> function22 = (i2 & 8) != 0 ? null : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(389793509, i, -1, "com.robinhood.android.advisory.insights.detail.rememberAudioController (InsightAudioComponents.kt:42)");
        }
        if (str == null || StringsKt.isBlank(str)) {
            Tuples2<AudioControllerState, Long> tuples2M3642to = Tuples4.m3642to(null, 0L);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return tuples2M3642to;
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(loaded2, composer, (i >> 6) & 14);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(exoPlayer2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (exoPlayer2 == null) {
                Object objBuild = new ExoPlayer.Builder(context).build();
                Intrinsics.checkNotNullExpressionValue(objBuild, "build(...)");
                objRememberedValue = objBuild;
            } else {
                objRememberedValue = exoPlayer2;
            }
            composer.updateRememberedValue(objRememberedValue);
        }
        final ExoPlayer exoPlayer3 = (ExoPlayer) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(InsightAudioComponents6.INITIAL, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(InsightAudioComponents6.INITIAL, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        SnapshotState snapshotState5 = (SnapshotState) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotLongState3.mutableLongStateOf(1L);
            composer.updateRememberedValue(objRememberedValue5);
        }
        final SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotState3.mutableStateOf$default("", null, 2, null);
            composer.updateRememberedValue(objRememberedValue6);
        }
        final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        int i5 = i & 14;
        boolean zChangedInstance = (((i5 ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | composer.changedInstance(exoPlayer3);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
            i3 = 0;
            Object insightAudioComponents3 = new InsightAudioComponents3(str, exoPlayer3, snapshotState6, snapshotState5, null);
            snapshotState = snapshotState5;
            composer.updateRememberedValue(insightAudioComponents3);
            objRememberedValue7 = insightAudioComponents3;
        } else {
            snapshotState = snapshotState5;
            i3 = 0;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, i5);
        InsightAudioComponents6 insightAudioComponents6RememberAudioController$lambda$3 = rememberAudioController$lambda$3(snapshotState3);
        Boolean boolValueOf = Boolean.valueOf(rememberAudioController$lambda$9(snapshotState));
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance2 = composer.changedInstance(exoPlayer3);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new InsightAudioComponents4(exoPlayer3, snapshotState, snapshotState3, snapshotState4, null);
            snapshotState2 = snapshotState4;
            composer.updateRememberedValue(objRememberedValue8);
        } else {
            snapshotState2 = snapshotState4;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(insightAudioComponents6RememberAudioController$lambda$3, boolValueOf, (Function2) objRememberedValue8, composer, i3);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance3 = composer.changedInstance(exoPlayer3) | composer.changed(snapshotState4RememberUpdatedState) | composer.changedInstance(exoPlayer2);
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
            i4 = i3;
            final SnapshotState snapshotState7 = snapshotState;
            Object obj = new Function1() { // from class: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InsightAudioComponents2.rememberAudioController$lambda$21$lambda$20(exoPlayer3, snapshotLongState2, snapshotState7, snapshotState3, snapshotState4RememberUpdatedState, snapshotState6, exoPlayer2, (DisposableEffectScope) obj2);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue9 = obj;
        } else {
            i4 = i3;
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(exoPlayer3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composer, i4);
        boolean zRememberAudioController$lambda$9 = rememberAudioController$lambda$9(snapshotState);
        InsightAudioComponents6 insightAudioComponents6RememberAudioController$lambda$6 = rememberAudioController$lambda$6(snapshotState2);
        InsightAudioComponents6 insightAudioComponents6RememberAudioController$lambda$32 = rememberAudioController$lambda$3(snapshotState3);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged2 = composer.changed(zRememberAudioController$lambda$9) | composer.changed(insightAudioComponents6RememberAudioController$lambda$6.ordinal()) | composer.changed(insightAudioComponents6RememberAudioController$lambda$32.ordinal());
        Object objRememberedValue10 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = new AudioControllerState(rememberAudioController$lambda$6(snapshotState2), rememberAudioController$lambda$3(snapshotState3), rememberAudioController$lambda$9(snapshotState), new Function1() { // from class: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InsightAudioComponents2.rememberAudioController$lambda$23$lambda$22(function22, snapshotState2, snapshotState3, (UserInteractionEventDescriptor) obj2);
                }
            });
            composer.updateRememberedValue(objRememberedValue10);
        }
        composer.endReplaceGroup();
        Tuples2<AudioControllerState, Long> tuples2M3642to2 = Tuples4.m3642to((AudioControllerState) objRememberedValue10, Long.valueOf(snapshotLongState2.getLongValue()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tuples2M3642to2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberAudioController$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisoryInsightDetailViewState.Loaded rememberAudioController$lambda$0(SnapshotState4<AdvisoryInsightDetailViewState.Loaded> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rememberAudioController$lambda$15(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InsightAudioComponents6 rememberAudioController$lambda$3(SnapshotState<InsightAudioComponents6> snapshotState) {
        return snapshotState.getValue();
    }

    private static final InsightAudioComponents6 rememberAudioController$lambda$6(SnapshotState<InsightAudioComponents6> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberAudioController$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.common.Player$Listener, com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$3$1$listener$1] */
    public static final DisposableEffectResult rememberAudioController$lambda$21$lambda$20(final ExoPlayer exoPlayer, final SnapshotLongState2 snapshotLongState2, final SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState4 snapshotState4, final SnapshotState snapshotState3, final ExoPlayer exoPlayer2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ?? r1 = new Player.Listener() { // from class: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$3$1$listener$1
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
            public void onPlaybackStateChanged(int state) {
                if (state != 3) {
                    if (state != 4) {
                        return;
                    }
                    snapshotState2.setValue(InsightAudioComponents6.STOPPED);
                } else {
                    long duration = exoPlayer.getDuration();
                    if (duration != -9223372036854775807L) {
                        snapshotLongState2.setLongValue(duration);
                    }
                    InsightAudioComponents2.rememberAudioController$lambda$10(snapshotState, true);
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                InsightAudioComponents2.reportAudioPlaybackError(error, InsightAudioComponents2.rememberAudioController$lambda$0(snapshotState4), InsightAudioComponents2.rememberAudioController$lambda$15(snapshotState3));
            }
        };
        exoPlayer.addListener(r1);
        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.insights.detail.InsightAudioComponentsKt$rememberAudioController$lambda$21$lambda$20$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                exoPlayer.removeListener(r1);
                if (exoPlayer2 == null) {
                    exoPlayer.stop();
                    exoPlayer.release();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioController$lambda$23$lambda$22(Function2 function2, SnapshotState snapshotState, SnapshotState snapshotState2, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        InsightAudioComponents6 insightAudioComponents6;
        int i = WhenMappings.$EnumSwitchMapping$0[rememberAudioController$lambda$6(snapshotState).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            insightAudioComponents6 = InsightAudioComponents6.PLAYING;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            insightAudioComponents6 = InsightAudioComponents6.PAUSED;
        }
        snapshotState2.setValue(insightAudioComponents6);
        if (function2 != null) {
            function2.invoke(rememberAudioController$lambda$3(snapshotState2), userInteractionEventDescriptor);
        }
        return Unit.INSTANCE;
    }

    public static final void reportAudioPlaybackError(PlaybackException error, AdvisoryInsightDetailViewState advisoryInsightDetailViewState, String audioUrl) {
        Map mapEmptyMap;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        AdvisoryInsightDetailViewState.Loaded loaded = advisoryInsightDetailViewState instanceof AdvisoryInsightDetailViewState.Loaded ? (AdvisoryInsightDetailViewState.Loaded) advisoryInsightDetailViewState : null;
        if (loaded != null) {
            mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to("contentful_id", loaded.getContentfulId()), Tuples4.m3642to("audio_url", audioUrl), Tuples4.m3642to(AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM, loaded.getInsightId()));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        CrashReporter.Companion companion = CrashReporter.INSTANCE;
        SentryTeam sentryTeam = SentryTeam.RAD;
        Tuples2 tuples2M3642to = Tuples4.m3642to("featureSurface", "ADVISORY");
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        companion.reportNonFatal(error, false, new EventMetadata(sentryTeam, MapsKt.plus(mapEmptyMap, MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to("error_message", message), Tuples4.m3642to("SCREEN", "ADVISORY_INSIGHT"))), null, 4, null));
    }
}
