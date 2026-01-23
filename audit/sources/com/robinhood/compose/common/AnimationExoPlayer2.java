package com.robinhood.compose.common;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
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
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.p014ui.PlayerView;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimationExoPlayer.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\u001ax\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0007\u001a\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, m3636d2 = {"AnimationExoPlayer", "", "config", "Lcom/robinhood/compose/common/AnimationExoPlayerConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "playOnReady", "", "shutterBackgroundColor", "", "onPlaybackStateChanged", "Lkotlin/Function1;", "onPlaybackError", "Landroidx/media3/common/PlaybackException;", "configureMediaSource", "Landroidx/media3/exoplayer/ExoPlayer;", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/compose/common/AnimationExoPlayerConfig;Landroidx/compose/ui/Modifier;ZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "mp4MediaSourceFromLocalFile", "Landroidx/media3/exoplayer/source/MediaSource;", "Landroid/net/Uri;", "mp4MediaSourceFromAssets", "context", "Landroid/content/Context;", "lib-compose-common_externalDebug", "lastPosition", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.AnimationExoPlayerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AnimationExoPlayer2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimationExoPlayer$lambda$15(AnimationExoPlayerConfig animationExoPlayerConfig, Modifier modifier, boolean z, int i, Function1 function1, Function1 function12, Function1 function13, int i2, int i3, Composer composer, int i4) {
        AnimationExoPlayer(animationExoPlayerConfig, modifier, z, i, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimationExoPlayer$lambda$1$lambda$0(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimationExoPlayer$lambda$3$lambda$2(PlaybackException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimationExoPlayer(final AnimationExoPlayerConfig config, Modifier modifier, boolean z, int i, Function1<? super Integer, Unit> function1, Function1<? super PlaybackException, Unit> function12, final Function1<? super ExoPlayer, Unit> configureMediaSource, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Function1<? super Integer, Unit> function13;
        int i8;
        Function1<? super PlaybackException, Unit> function14;
        final int i9;
        final Function1<? super Integer, Unit> function15;
        final Function1<? super PlaybackException, Unit> function16;
        final Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        final ExoPlayer exoPlayer;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final LifecycleOwner lifecycleOwner;
        Object objRememberedValue3;
        final SnapshotLongState2 snapshotLongState2;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        final Modifier modifier3;
        final boolean z3;
        final int i10;
        final Function1<? super Integer, Unit> function17;
        final Function1<? super PlaybackException, Unit> function18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(configureMediaSource, "configureMediaSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-361839760);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(config) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
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
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        if ((i2 & 24576) == 0) {
                            function13 = function1;
                            i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            function14 = function12;
                        } else {
                            function14 = function12;
                            if ((i2 & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(configureMediaSource) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            i10 = i;
                            modifier3 = modifier2;
                            z3 = z2;
                            function18 = function14;
                            function17 = function13;
                        } else {
                            Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? true : z2;
                            i9 = i6 == 0 ? 0 : i;
                            if (i7 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AnimationExoPlayer2.AnimationExoPlayer$lambda$1$lambda$0(((Integer) obj).intValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function15 = (Function1) objRememberedValue5;
                            } else {
                                function15 = function13;
                            }
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AnimationExoPlayer2.AnimationExoPlayer$lambda$3$lambda$2((PlaybackException) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function16 = (Function1) objRememberedValue6;
                            } else {
                                function16 = function14;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-361839760, i4, -1, "com.robinhood.compose.common.AnimationExoPlayer (AnimationExoPlayer.kt:51)");
                            }
                            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            Object obj = objRememberedValue;
                            if (objRememberedValue == companion.getEmpty()) {
                                ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                                Intrinsics.checkNotNull(exoPlayerBuild);
                                configureMediaSource.invoke(exoPlayerBuild);
                                exoPlayerBuild.prepare();
                                exoPlayerBuild.setRepeatMode(config.getRepeatMode());
                                exoPlayerBuild.setPlayWhenReady(z4);
                                exoPlayerBuild.setVideoScalingMode(1);
                                composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                                obj = exoPlayerBuild;
                            }
                            exoPlayer = (ExoPlayer) obj;
                            composerStartRestartGroup.endReplaceGroup();
                            Intrinsics.checkNotNull(exoPlayer);
                            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(context) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | composerStartRestartGroup.changedInstance(exoPlayer);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AnimationExoPlayer2.AnimationExoPlayer$lambda$8$lambda$7(context, config, i9, exoPlayer, (Context) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i12 = i9;
                            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifierWithBentoPlaceholder$default, null, composerStartRestartGroup, 0, 4);
                            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotLongState3.mutableLongStateOf(0L);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            snapshotLongState2 = (SnapshotLongState2) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance2 = ((i4 & 458752) != 131072) | composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner) | ((57344 & i4) != 16384);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AnimationExoPlayer2.AnimationExoPlayer$lambda$14$lambda$13(lifecycleOwner, exoPlayer, snapshotLongState2, function15, function16, (DisposableEffectScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            i10 = i12;
                            function17 = function15;
                            function18 = function16;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return AnimationExoPlayer2.AnimationExoPlayer$lambda$15(config, modifier3, z3, i10, function17, function18, configureMediaSource, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    function13 = function1;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i4 & 599187) == 599186) {
                        if (i11 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        Object obj2 = objRememberedValue;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        exoPlayer = (ExoPlayer) obj2;
                        composerStartRestartGroup.endReplaceGroup();
                        Intrinsics.checkNotNull(exoPlayer);
                        Modifier modifierWithBentoPlaceholder$default2 = LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = composerStartRestartGroup.changedInstance(context) | ((i4 & 14) != 4) | ((i4 & 7168) != 2048) | composerStartRestartGroup.changedInstance(exoPlayer);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj22) {
                                    return AnimationExoPlayer2.AnimationExoPlayer$lambda$8$lambda$7(context, config, i9, exoPlayer, (Context) obj22);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            int i122 = i9;
                            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifierWithBentoPlaceholder$default2, null, composerStartRestartGroup, 0, 4);
                            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            snapshotLongState2 = (SnapshotLongState2) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance2 = ((i4 & 458752) != 131072) | composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changedInstance(lifecycleOwner) | ((57344 & i4) != 16384);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj22) {
                                        return AnimationExoPlayer2.AnimationExoPlayer$lambda$14$lambda$13(lifecycleOwner, exoPlayer, snapshotLongState2, function15, function16, (DisposableEffectScope) obj22);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                i10 = i122;
                                function17 = function15;
                                function18 = function16;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                function13 = function1;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            function13 = function1;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        function13 = function1;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView AnimationExoPlayer$lambda$8$lambda$7(Context context, AnimationExoPlayerConfig animationExoPlayerConfig, int i, ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(animationExoPlayerConfig.getResizeMode());
        playerView.setShutterBackgroundColor(i);
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.media3.common.Player$Listener, com.robinhood.compose.common.AnimationExoPlayerKt$AnimationExoPlayer$4$1$listener$1] */
    public static final DisposableEffectResult AnimationExoPlayer$lambda$14$lambda$13(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, final SnapshotLongState2 snapshotLongState2, final Function1 function1, final Function1 function12, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$AnimationExoPlayer$4$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != Lifecycle.Event.ON_STOP) {
                    if (event == Lifecycle.Event.ON_START) {
                        exoPlayer.seekTo(snapshotLongState2.getLongValue());
                        exoPlayer.play();
                        return;
                    }
                    return;
                }
                snapshotLongState2.setLongValue(exoPlayer.getCurrentPosition());
                exoPlayer.pause();
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final ?? r3 = new Player.Listener() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$AnimationExoPlayer$4$1$listener$1
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
                super.onPlaybackStateChanged(playbackState);
                function1.invoke(Integer.valueOf(playbackState));
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                super.onPlayerError(error);
                function12.invoke(error);
            }
        };
        exoPlayer.addListener(r3);
        return new DisposableEffectResult() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$AnimationExoPlayer$lambda$14$lambda$13$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.removeListener(r3);
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.release();
            }
        };
    }

    public static final MediaSource mp4MediaSourceFromLocalFile(Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        final FileDataSource fileDataSource = new FileDataSource();
        fileDataSource.open(new DataSpec(uri));
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DataSource.Factory() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$mp4MediaSourceFromLocalFile$factory$1
            @Override // androidx.media3.datasource.DataSource.Factory
            public final DataSource createDataSource() {
                return fileDataSource;
            }
        }, Mp4Extractor.newFactory(SubtitleParser.Factory.UNSUPPORTED)).createMediaSource(MediaItem.fromUri(uri));
        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
        return progressiveMediaSourceCreateMediaSource;
    }

    public static final MediaSource mp4MediaSourceFromAssets(Uri uri, Context context) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        final AssetDataSource assetDataSource = new AssetDataSource(context);
        assetDataSource.open(new DataSpec(uri));
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DataSource.Factory() { // from class: com.robinhood.compose.common.AnimationExoPlayerKt$mp4MediaSourceFromAssets$factory$1
            @Override // androidx.media3.datasource.DataSource.Factory
            public final DataSource createDataSource() {
                return assetDataSource;
            }
        }, Mp4Extractor.newFactory(SubtitleParser.Factory.UNSUPPORTED)).createMediaSource(MediaItem.fromUri(uri));
        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
        return progressiveMediaSourceCreateMediaSource;
    }
}
