package com.robinhood.compose.common;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
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
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.AspectRatioAwareExoPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AspectRatioAwareExoPlayer.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\u0018\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002"}, m3636d2 = {"AspectRatioAwareExoPlayer", "", "repeatMode", "", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "configureMediaSource", "Lkotlin/Function1;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ASPECT_RATIO_EXO_PLAYER_VIEW_TEST_TAG", "", "lib-compose-common_externalDebug", "videoWidth", "videoHeight", "size", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AspectRatioAwareExoPlayer {
    public static final String ASPECT_RATIO_EXO_PLAYER_VIEW_TEST_TAG = "aspect-ratio-aware-player-view";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AspectRatioAwareExoPlayer$lambda$14(int i, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function1 function1, int i2, int i3, Composer composer, int i4) {
        AspectRatioAwareExoPlayer(i, modifier, enterTransition, exitTransition, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AspectRatioAwareExoPlayer(final int i, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function1<? super ExoPlayer, Unit> configureMediaSource, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        EnterTransition enterTransition2;
        int i6;
        ExitTransition exitTransition2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        final ExoPlayer exoPlayer;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final LifecycleOwner lifecycleOwner;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(configureMediaSource, "configureMediaSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520669639);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    enterTransition2 = enterTransition;
                    i4 |= composerStartRestartGroup.changed(enterTransition2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 == 0) {
                    if ((i2 & 3072) == 0) {
                        exitTransition2 = exitTransition;
                        i4 |= composerStartRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(configureMediaSource) ? 16384 : 8192;
                    }
                    if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        EnterTransition enterTransitionPlus = i5 == 0 ? EnterExitTransitionKt.m4780scaleInL8ZKhE$default(null, 0.0f, 0L, 7, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                        ExitTransition exitTransitionPlus = i6 == 0 ? EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(null, 0.0f, 0L, 7, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1520669639, i4, -1, "com.robinhood.compose.common.AspectRatioAwareExoPlayer (AspectRatioAwareExoPlayer.kt:53)");
                        }
                        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        Object obj = objRememberedValue3;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                            Intrinsics.checkNotNull(exoPlayerBuild);
                            configureMediaSource.invoke(exoPlayerBuild);
                            exoPlayerBuild.setRepeatMode(i);
                            exoPlayerBuild.setPlayWhenReady(true);
                            exoPlayerBuild.setVideoScalingMode(1);
                            composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                            obj = exoPlayerBuild;
                        }
                        exoPlayer = (ExoPlayer) obj;
                        composerStartRestartGroup.endReplaceGroup();
                        Intrinsics.checkNotNull(exoPlayer);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$10$lambda$9(exoPlayer, snapshotState, snapshotState2, (DisposableEffectScope) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(context, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(-597258737, true, new C326732(enterTransitionPlus, exitTransitionPlus, snapshotState, snapshotState2, context, exoPlayer), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 3072, 6);
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$13$lambda$12(lifecycleOwner, exoPlayer, (DisposableEffectScope) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        enterTransition3 = enterTransitionPlus;
                        exitTransition3 = exitTransitionPlus;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    }
                    final Modifier modifier3 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$14(i, modifier3, enterTransition3, exitTransition3, configureMediaSource, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 3072;
                exitTransition2 = exitTransition;
                if ((i3 & 16) == 0) {
                }
                if ((i4 & 9363) == 9362) {
                    if (i7 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    Object obj2 = objRememberedValue3;
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    exoPlayer = (ExoPlayer) obj2;
                    composerStartRestartGroup.endReplaceGroup();
                    Intrinsics.checkNotNull(exoPlayer);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj22) {
                                return AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$10$lambda$9(exoPlayer, snapshotState, snapshotState2, (DisposableEffectScope) obj22);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(context2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        BoxWithConstraints.BoxWithConstraints(modifier2, null, false, ComposableLambda3.rememberComposableLambda(-597258737, true, new C326732(enterTransitionPlus, exitTransitionPlus, snapshotState, snapshotState2, context2, exoPlayer), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 3072, 6);
                        lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj22) {
                                    return AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$13$lambda$12(lifecycleOwner, exoPlayer, (DisposableEffectScope) obj22);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            enterTransition3 = enterTransitionPlus;
                            exitTransition3 = exitTransitionPlus;
                        }
                    }
                }
                final Modifier modifier32 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i6 = i3 & 8;
            if (i6 == 0) {
            }
            exitTransition2 = exitTransition;
            if ((i3 & 16) == 0) {
            }
            if ((i4 & 9363) == 9362) {
            }
            final Modifier modifier322 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        enterTransition2 = enterTransition;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        exitTransition2 = exitTransition;
        if ((i3 & 16) == 0) {
        }
        if ((i4 & 9363) == 9362) {
        }
        final Modifier modifier3222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.media3.common.Player$Listener, com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$1$1$listener$1] */
    public static final DisposableEffectResult AspectRatioAwareExoPlayer$lambda$10$lambda$9(final ExoPlayer exoPlayer, final SnapshotState snapshotState, final SnapshotState snapshotState2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ?? r4 = new Player.Listener() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$1$1$listener$1
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
                Format videoFormat;
                if (playbackState != 3 || (videoFormat = exoPlayer.getVideoFormat()) == null) {
                    return;
                }
                SnapshotState<Integer> snapshotState3 = snapshotState;
                SnapshotState<Integer> snapshotState4 = snapshotState2;
                snapshotState3.setValue(Integer.valueOf(videoFormat.width));
                snapshotState4.setValue(Integer.valueOf(videoFormat.height));
            }
        };
        exoPlayer.addListener(r4);
        exoPlayer.prepare();
        return new DisposableEffectResult() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$lambda$10$lambda$9$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                exoPlayer.removeListener(r4);
            }
        };
    }

    /* compiled from: AspectRatioAwareExoPlayer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$2 */
    static final class C326732 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ ExoPlayer $exoPlayer;
        final /* synthetic */ SnapshotState<Integer> $videoHeight$delegate;
        final /* synthetic */ SnapshotState<Integer> $videoWidth$delegate;

        C326732(EnterTransition enterTransition, ExitTransition exitTransition, SnapshotState<Integer> snapshotState, SnapshotState<Integer> snapshotState2, Context context, ExoPlayer exoPlayer) {
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$videoWidth$delegate = snapshotState;
            this.$videoHeight$delegate = snapshotState2;
            this.$context = context;
            this.$exoPlayer = exoPlayer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Tuples2<C2002Dp, C2002Dp> invoke$lambda$6(SnapshotState4<Tuples2<C2002Dp, C2002Dp>> snapshotState4) {
            return snapshotState4.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Tuples2 invoke$lambda$5$lambda$4(Integer num, Integer num2, Density density, float f, float f2) {
            if (num == null || num2 == null) {
                return null;
            }
            float fMin = Math.min(density.mo5016toPx0680j_4(f) / num.intValue(), density.mo5016toPx0680j_4(f2) / num2.intValue());
            return Tuples4.m3642to(C2002Dp.m7993boximpl(density.mo5012toDpu2uoSUM(Math.min(num.intValue() * fMin, density.mo5016toPx0680j_4(f)))), C2002Dp.m7993boximpl(density.mo5012toDpu2uoSUM(Math.min(fMin * num2.intValue(), density.mo5016toPx0680j_4(f2)))));
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i |= composer.changed(BoxWithConstraints) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-597258737, i, -1, "com.robinhood.compose.common.AspectRatioAwareExoPlayer.<anonymous> (AspectRatioAwareExoPlayer.kt:88)");
            }
            final float fMo5103getMaxWidthD9Ej5fM = BoxWithConstraints.mo5103getMaxWidthD9Ej5fM();
            final float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
            final Integer numAspectRatioAwareExoPlayer$lambda$1 = AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$1(this.$videoWidth$delegate);
            final Integer numAspectRatioAwareExoPlayer$lambda$4 = AspectRatioAwareExoPlayer.AspectRatioAwareExoPlayer$lambda$4(this.$videoHeight$delegate);
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(numAspectRatioAwareExoPlayer$lambda$1) | composer.changed(numAspectRatioAwareExoPlayer$lambda$4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AspectRatioAwareExoPlayer.C326732.invoke$lambda$5$lambda$4(numAspectRatioAwareExoPlayer$lambda$1, numAspectRatioAwareExoPlayer$lambda$4, density, fMo5103getMaxWidthD9Ej5fM, fMo5102getMaxHeightD9Ej5fM);
                    }
                });
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composer.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(invoke$lambda$6(snapshotState4) != null, (Modifier) null, this.$enter, this.$exit, (String) null, ComposableLambda3.rememberComposableLambda(1094095079, true, new AnonymousClass1(this.$context, this.$exoPlayer, snapshotState4), composer, 54), composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: AspectRatioAwareExoPlayer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$2$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ ExoPlayer $exoPlayer;
            final /* synthetic */ SnapshotState4<Tuples2<C2002Dp, C2002Dp>> $size$delegate;

            AnonymousClass1(Context context, ExoPlayer exoPlayer, SnapshotState4<Tuples2<C2002Dp, C2002Dp>> snapshotState4) {
                this.$context = context;
                this.$exoPlayer = exoPlayer;
                this.$size$delegate = snapshotState4;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1094095079, i, -1, "com.robinhood.compose.common.AspectRatioAwareExoPlayer.<anonymous>.<anonymous> (AspectRatioAwareExoPlayer.kt:120)");
                }
                Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null);
                Tuples2 tuples2Invoke$lambda$6 = C326732.invoke$lambda$6(this.$size$delegate);
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierWithBentoPlaceholder$default, tuples2Invoke$lambda$6 != null ? ((C2002Dp) tuples2Invoke$lambda$6.getFirst()).getValue() : C2002Dp.m7995constructorimpl(0));
                Tuples2 tuples2Invoke$lambda$62 = C326732.invoke$lambda$6(this.$size$delegate);
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5156height3ABfNKs(modifierM5174width3ABfNKs, tuples2Invoke$lambda$62 != null ? ((C2002Dp) tuples2Invoke$lambda$62.getSecond()).getValue() : C2002Dp.m7995constructorimpl(0)), AspectRatioAwareExoPlayer.ASPECT_RATIO_EXO_PLAYER_VIEW_TEST_TAG);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$context) | composer.changedInstance(this.$exoPlayer);
                final Context context = this.$context;
                final ExoPlayer exoPlayer = this.$exoPlayer;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AspectRatioAwareExoPlayer.C326732.AnonymousClass1.invoke$lambda$2$lambda$1(context, exoPlayer, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierTestTag, null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PlayerView invoke$lambda$2$lambda$1(Context context, ExoPlayer exoPlayer, Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PlayerView playerView = new PlayerView(context);
                playerView.hideController();
                playerView.setUseController(false);
                playerView.setResizeMode(3);
                playerView.setShutterBackgroundColor(0);
                playerView.setPlayer(exoPlayer);
                return playerView;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer AspectRatioAwareExoPlayer$lambda$1(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer AspectRatioAwareExoPlayer$lambda$4(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AspectRatioAwareExoPlayer$lambda$13$lambda$12(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$3$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    exoPlayer.pause();
                } else if (event == Lifecycle.Event.ON_START) {
                    exoPlayer.play();
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.robinhood.compose.common.AspectRatioAwareExoPlayerKt$AspectRatioAwareExoPlayer$lambda$13$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.release();
            }
        };
    }
}
