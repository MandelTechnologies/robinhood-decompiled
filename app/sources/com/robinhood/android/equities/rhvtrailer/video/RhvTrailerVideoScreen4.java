package com.robinhood.android.equities.rhvtrailer.video;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.rhvtrailer.C14747R;
import com.robinhood.android.equities.rhvtrailer.RhvTrailerDuxo;
import com.robinhood.android.equities.rhvtrailer.RhvTrailerViewState;
import com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen4;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.AnimationExoPlayer2;
import com.robinhood.compose.common.AnimationExoPlayerConfig;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ventures.trailer.proto.p551v1.GetTrailerResponseDto;
import ventures.trailer.proto.p551v1.TrailerScreenDto;

/* compiled from: RhvTrailerVideoScreen.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001ac\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006 ²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "onContinueClicked", "onBackClicked", "Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerDuxo;", "duxo", "Landroidx/compose/ui/Modifier;", "modifier", "RhvTrailerVideoScreen", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Lventures/trailer/proto/v1/TrailerScreenDto;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equities/rhvtrailer/video/RhvTrailerVideoPlayerState;", "playerState", "Lkotlin/Function1;", "onPlayerStateChange", "videoPlayer", "RhvTrailerVideoMainSection", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lventures/trailer/proto/v1/TrailerScreenDto;Lcom/robinhood/android/equities/rhvtrailer/video/RhvTrailerVideoPlayerState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "videoUrl", "state", "onStateChange", "ClickToPauseVideoPlayer", "(Ljava/lang/String;Lcom/robinhood/android/equities/rhvtrailer/video/RhvTrailerVideoPlayerState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerViewState;", "viewState", "", "primedFirstFrame", "suppressNextPending", "feature-rhv-trailer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhvTrailerVideoScreen4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickToPauseVideoPlayer$lambda$29(String str, RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ClickToPauseVideoPlayer(str, rhvTrailerVideoScreen3, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvTrailerVideoMainSection$lambda$6(PaddingValues paddingValues, Function0 function0, TrailerScreenDto trailerScreenDto, RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, Function1 function1, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        RhvTrailerVideoMainSection(paddingValues, function0, trailerScreenDto, rhvTrailerVideoScreen3, function1, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvTrailerVideoScreen$lambda$4(Function0 function0, Function0 function02, RhvTrailerDuxo rhvTrailerDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhvTrailerVideoScreen(function0, function02, rhvTrailerDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhvTrailerVideoScreen(final Function0<Unit> onContinueClicked, final Function0<Unit> onBackClicked, final RhvTrailerDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(2037861723);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinueClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2037861723, i3, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen (RhvTrailerVideoScreen.kt:64)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(RhvTrailerVideoScreen3.PENDING, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(287450787, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(287450787, i5, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous> (RhvTrailerVideoScreen.kt:73)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null));
                        final Function0<Unit> function0 = onBackClicked;
                        final SnapshotState<RhvTrailerVideoScreen3> snapshotState2 = snapshotState;
                        final Function0<Unit> function02 = onContinueClicked;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(591646047, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(591646047, i6, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:78)");
                                }
                                Function2<Composer, Integer, Unit> function2M13568getLambda$732420270$feature_rhv_trailer_externalDebug = RhvTrailerVideoScreen.INSTANCE.m13568getLambda$732420270$feature_rhv_trailer_externalDebug();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1432759166, true, new C498671(function0), composer3, 54);
                                final SnapshotState<RhvTrailerVideoScreen3> snapshotState3 = snapshotState2;
                                final Function0<Unit> function03 = function02;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M13568getLambda$732420270$feature_rhv_trailer_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1018246525, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoScreen.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                        invoke(row5, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Row5 BentoAppBar, Composer composer4, int i7) {
                                        int i8;
                                        int i9;
                                        boolean z;
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i8 = (composer4.changed(BentoAppBar) ? 4 : 2) | i7;
                                        } else {
                                            i8 = i7;
                                        }
                                        if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1018246525, i8, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:88)");
                                        }
                                        if (RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(snapshotState3) == RhvTrailerVideoScreen3.PLAYING || RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(snapshotState3) == RhvTrailerVideoScreen3.ENDED) {
                                            i9 = i8;
                                            z = true;
                                        } else {
                                            i9 = i8;
                                            z = false;
                                        }
                                        AnimatedVisibilityKt.AnimatedVisibility(BentoAppBar, z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(-385069659, true, new C498681(function03, snapshotState3), composer4, 54), composer4, (i9 & 14) | 1600512, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: RhvTrailerVideoScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1, reason: invalid class name and collision with other inner class name */
                                    static final class C498681 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                        final /* synthetic */ Function0<Unit> $onContinueClicked;
                                        final /* synthetic */ SnapshotState<RhvTrailerVideoScreen3> $playerState$delegate;

                                        /* compiled from: RhvTrailerVideoScreen.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1$WhenMappings */
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[RhvTrailerVideoScreen3.values().length];
                                                try {
                                                    iArr[RhvTrailerVideoScreen3.PENDING.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[RhvTrailerVideoScreen3.PLAYING.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[RhvTrailerVideoScreen3.ENDED.ordinal()] = 3;
                                                } catch (NoSuchFieldError unused3) {
                                                }
                                                $EnumSwitchMapping$0 = iArr;
                                            }
                                        }

                                        C498681(Function0<Unit> function0, SnapshotState<RhvTrailerVideoScreen3> snapshotState) {
                                            this.$onContinueClicked = function0;
                                            this.$playerState$delegate = snapshotState;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                            invoke(animatedVisibilityScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-385069659, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:94)");
                                            }
                                            int i2 = WhenMappings.$EnumSwitchMapping$0[RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(this.$playerState$delegate).ordinal()];
                                            if (i2 == 1) {
                                                composer.startReplaceGroup(247556504);
                                                composer.endReplaceGroup();
                                            } else if (i2 == 2) {
                                                composer.startReplaceGroup(247651551);
                                                String strStringResource = StringResources_androidKt.stringResource(C14747R.string.trailer_video_screen_skip, composer, 0);
                                                TextStyle textM = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                                                FontWeight bold = FontWeight.INSTANCE.getBold();
                                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                                                composer.startReplaceGroup(5004770);
                                                boolean zChanged = composer.changed(this.$onContinueClicked);
                                                final Function0<Unit> function0 = this.$onContinueClicked;
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return RhvTrailerVideoScreen4.C147841.AnonymousClass1.AnonymousClass2.C498681.invoke$lambda$1$lambda$0(function0);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                BentoText2.m20747BentoText38GnDrw(strStringResource, ClickableKt.m4893clickableXHw0xAI$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, false, null, null, (Function0) objRememberedValue, 7, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8172);
                                                composer.endReplaceGroup();
                                            } else {
                                                if (i2 != 3) {
                                                    composer.startReplaceGroup(-684752246);
                                                    composer.endReplaceGroup();
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                composer.startReplaceGroup(248386592);
                                                String strStringResource2 = StringResources_androidKt.stringResource(C14747R.string.trailer_video_screen_replay, composer, 0);
                                                TextStyle textM2 = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                                                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                                                composer.startReplaceGroup(5004770);
                                                final SnapshotState<RhvTrailerVideoScreen3> snapshotState = this.$playerState$delegate;
                                                Object objRememberedValue2 = composer.rememberedValue();
                                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return RhvTrailerVideoScreen4.C147841.AnonymousClass1.AnonymousClass2.C498681.invoke$lambda$3$lambda$2(snapshotState);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer.endReplaceGroup();
                                                BentoText2.m20747BentoText38GnDrw(strStringResource2, ClickableKt.m4893clickableXHw0xAI$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, false, null, null, (Function0) objRememberedValue2, 7, null), null, null, bold2, null, null, 0, false, 0, 0, null, 0, textM2, composer, 24576, 0, 8172);
                                                composer.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                            function0.invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                            RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$3(snapshotState, RhvTrailerVideoScreen3.PLAYING);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer3, 54), null, true, false, null, null, 0L, null, composer3, 200070, 0, 2002);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: RhvTrailerVideoScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C498671 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                final /* synthetic */ Function0<Unit> $onBackClicked;

                                C498671(Function0<Unit> function0) {
                                    this.$onBackClicked = function0;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                    invoke(bentoAppBarScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 6) == 0) {
                                        i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1432759166, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:81)");
                                    }
                                    Color colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU());
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$onBackClicked);
                                    final Function0<Unit> function0 = this.$onBackClicked;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhvTrailerVideoScreen4.C147841.AnonymousClass1.C498671.invoke$lambda$1$lambda$0(function0);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(965778484, true, new AnonymousClass2(onContinueClicked, snapshotState4CollectAsStateWithLifecycle, snapshotState), composer2, 54), composer2, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: RhvTrailerVideoScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onContinueClicked;
                        final /* synthetic */ SnapshotState<RhvTrailerVideoScreen3> $playerState$delegate;
                        final /* synthetic */ SnapshotState4<RhvTrailerViewState> $viewState$delegate;

                        AnonymousClass2(Function0<Unit> function0, SnapshotState4<RhvTrailerViewState> snapshotState4, SnapshotState<RhvTrailerVideoScreen3> snapshotState) {
                            this.$onContinueClicked = function0;
                            this.$viewState$delegate = snapshotState4;
                            this.$playerState$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i |= composer.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(965778484, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:128)");
                            }
                            GetTrailerResponseDto trailerData = RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$0(this.$viewState$delegate).getTrailerData();
                            TrailerScreenDto trailer_screen = trailerData != null ? trailerData.getTrailer_screen() : null;
                            if (trailer_screen == null) {
                                composer.startReplaceGroup(400191096);
                                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer, 0, 15);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-478907106);
                                RhvTrailerVideoScreen3 rhvTrailerVideoScreen3RhvTrailerVideoScreen$lambda$2 = RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(this.$playerState$delegate);
                                Function0<Unit> function0 = this.$onContinueClicked;
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<RhvTrailerVideoScreen3> snapshotState = this.$playerState$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return RhvTrailerVideoScreen4.C147841.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (RhvTrailerVideoScreen3) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                RhvTrailerVideoScreen4.RhvTrailerVideoMainSection(paddingValues, function0, trailer_screen, rhvTrailerVideoScreen3RhvTrailerVideoScreen$lambda$2, (Function1) objRememberedValue, null, null, composer, (i & 14) | 24576, 96);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, RhvTrailerVideoScreen3 newState) {
                            Intrinsics.checkNotNullParameter(newState, "newState");
                            RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$3(snapshotState, newState);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$4(onContinueClicked, onBackClicked, duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<RhvTrailerViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SnapshotState<RhvTrailerVideoScreen3> snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(287450787, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(287450787, i5, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous> (RhvTrailerVideoScreen.kt:73)");
                    }
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null));
                    final Function0<Unit> function0 = onBackClicked;
                    final SnapshotState<RhvTrailerVideoScreen3> snapshotState22 = snapshotState2;
                    final Function0<Unit> function02 = onContinueClicked;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierNavigationBarsPadding, ComposableLambda3.rememberComposableLambda(591646047, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(591646047, i6, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:78)");
                            }
                            Function2<Composer, Integer, Unit> function2M13568getLambda$732420270$feature_rhv_trailer_externalDebug = RhvTrailerVideoScreen.INSTANCE.m13568getLambda$732420270$feature_rhv_trailer_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1432759166, true, new C498671(function0), composer3, 54);
                            final SnapshotState<RhvTrailerVideoScreen3> snapshotState3 = snapshotState22;
                            final Function0<Unit> function03 = function02;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M13568getLambda$732420270$feature_rhv_trailer_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1018246525, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoScreen.1.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                    invoke(row5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer4, int i7) {
                                    int i8;
                                    int i9;
                                    boolean z;
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i8 = (composer4.changed(BentoAppBar) ? 4 : 2) | i7;
                                    } else {
                                        i8 = i7;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1018246525, i8, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:88)");
                                    }
                                    if (RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(snapshotState3) == RhvTrailerVideoScreen3.PLAYING || RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(snapshotState3) == RhvTrailerVideoScreen3.ENDED) {
                                        i9 = i8;
                                        z = true;
                                    } else {
                                        i9 = i8;
                                        z = false;
                                    }
                                    AnimatedVisibilityKt.AnimatedVisibility(BentoAppBar, z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(-385069659, true, new C498681(function03, snapshotState3), composer4, 54), composer4, (i9 & 14) | 1600512, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: RhvTrailerVideoScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1, reason: invalid class name and collision with other inner class name */
                                static final class C498681 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                    final /* synthetic */ Function0<Unit> $onContinueClicked;
                                    final /* synthetic */ SnapshotState<RhvTrailerVideoScreen3> $playerState$delegate;

                                    /* compiled from: RhvTrailerVideoScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1$WhenMappings */
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[RhvTrailerVideoScreen3.values().length];
                                            try {
                                                iArr[RhvTrailerVideoScreen3.PENDING.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[RhvTrailerVideoScreen3.PLAYING.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[RhvTrailerVideoScreen3.ENDED.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    C498681(Function0<Unit> function0, SnapshotState<RhvTrailerVideoScreen3> snapshotState) {
                                        this.$onContinueClicked = function0;
                                        this.$playerState$delegate = snapshotState;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                        invoke(animatedVisibilityScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-385069659, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:94)");
                                        }
                                        int i2 = WhenMappings.$EnumSwitchMapping$0[RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(this.$playerState$delegate).ordinal()];
                                        if (i2 == 1) {
                                            composer.startReplaceGroup(247556504);
                                            composer.endReplaceGroup();
                                        } else if (i2 == 2) {
                                            composer.startReplaceGroup(247651551);
                                            String strStringResource = StringResources_androidKt.stringResource(C14747R.string.trailer_video_screen_skip, composer, 0);
                                            TextStyle textM = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                                            FontWeight bold = FontWeight.INSTANCE.getBold();
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(this.$onContinueClicked);
                                            final Function0 function0 = this.$onContinueClicked;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return RhvTrailerVideoScreen4.C147841.AnonymousClass1.AnonymousClass2.C498681.invoke$lambda$1$lambda$0(function0);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(strStringResource, ClickableKt.m4893clickableXHw0xAI$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, false, null, null, (Function0) objRememberedValue, 7, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8172);
                                            composer.endReplaceGroup();
                                        } else {
                                            if (i2 != 3) {
                                                composer.startReplaceGroup(-684752246);
                                                composer.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer.startReplaceGroup(248386592);
                                            String strStringResource2 = StringResources_androidKt.stringResource(C14747R.string.trailer_video_screen_replay, composer, 0);
                                            TextStyle textM2 = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                                            FontWeight bold2 = FontWeight.INSTANCE.getBold();
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
                                            composer.startReplaceGroup(5004770);
                                            final SnapshotState snapshotState = this.$playerState$delegate;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$2$1$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return RhvTrailerVideoScreen4.C147841.AnonymousClass1.AnonymousClass2.C498681.invoke$lambda$3$lambda$2(snapshotState);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(strStringResource2, ClickableKt.m4893clickableXHw0xAI$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, false, null, null, (Function0) objRememberedValue2, 7, null), null, null, bold2, null, null, 0, false, 0, 0, null, 0, textM2, composer, 24576, 0, 8172);
                                            composer.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                        function0.invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                        RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$3(snapshotState, RhvTrailerVideoScreen3.PLAYING);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), null, true, false, null, null, 0L, null, composer3, 200070, 0, 2002);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RhvTrailerVideoScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C498671 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ Function0<Unit> $onBackClicked;

                            C498671(Function0<Unit> function0) {
                                this.$onBackClicked = function0;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1432759166, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:81)");
                                }
                                Color colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU());
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$onBackClicked);
                                final Function0 function0 = this.$onBackClicked;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhvTrailerVideoScreen4.C147841.AnonymousClass1.C498671.invoke$lambda$1$lambda$0(function0);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                                function0.invoke();
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(965778484, true, new AnonymousClass2(onContinueClicked, snapshotState4CollectAsStateWithLifecycle2, snapshotState2), composer2, 54), composer2, 805306416, 508);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: RhvTrailerVideoScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ Function0<Unit> $onContinueClicked;
                    final /* synthetic */ SnapshotState<RhvTrailerVideoScreen3> $playerState$delegate;
                    final /* synthetic */ SnapshotState4<RhvTrailerViewState> $viewState$delegate;

                    AnonymousClass2(Function0<Unit> function0, SnapshotState4<RhvTrailerViewState> snapshotState4, SnapshotState<RhvTrailerVideoScreen3> snapshotState) {
                        this.$onContinueClicked = function0;
                        this.$viewState$delegate = snapshotState4;
                        this.$playerState$delegate = snapshotState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i |= composer.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(965778484, i, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen.<anonymous>.<anonymous> (RhvTrailerVideoScreen.kt:128)");
                        }
                        GetTrailerResponseDto trailerData = RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$0(this.$viewState$delegate).getTrailerData();
                        TrailerScreenDto trailer_screen = trailerData != null ? trailerData.getTrailer_screen() : null;
                        if (trailer_screen == null) {
                            composer.startReplaceGroup(400191096);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer, 0, 15);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-478907106);
                            RhvTrailerVideoScreen3 rhvTrailerVideoScreen3RhvTrailerVideoScreen$lambda$2 = RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$2(this.$playerState$delegate);
                            Function0<Unit> function0 = this.$onContinueClicked;
                            composer.startReplaceGroup(5004770);
                            final SnapshotState snapshotState = this.$playerState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$RhvTrailerVideoScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RhvTrailerVideoScreen4.C147841.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (RhvTrailerVideoScreen3) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            RhvTrailerVideoScreen4.RhvTrailerVideoMainSection(paddingValues, function0, trailer_screen, rhvTrailerVideoScreen3RhvTrailerVideoScreen$lambda$2, (Function1) objRememberedValue, null, null, composer, (i & 14) | 24576, 96);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, RhvTrailerVideoScreen3 newState) {
                        Intrinsics.checkNotNullParameter(newState, "newState");
                        RhvTrailerVideoScreen4.RhvTrailerVideoScreen$lambda$3(snapshotState, newState);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean ClickToPauseVideoPlayer$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ClickToPauseVideoPlayer$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhvTrailerViewState RhvTrailerVideoScreen$lambda$0(SnapshotState4<RhvTrailerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhvTrailerVideoScreen3 RhvTrailerVideoScreen$lambda$2(SnapshotState<RhvTrailerVideoScreen3> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RhvTrailerVideoScreen$lambda$3(SnapshotState<RhvTrailerVideoScreen3> snapshotState, RhvTrailerVideoScreen3 rhvTrailerVideoScreen3) {
        snapshotState.setValue(rhvTrailerVideoScreen3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhvTrailerVideoMainSection(final PaddingValues paddingValues, final Function0<Unit> onContinueClicked, final TrailerScreenDto data, final RhvTrailerVideoScreen3 playerState, final Function1<? super RhvTrailerVideoScreen3, Unit> onPlayerStateChange, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        Intrinsics.checkNotNullParameter(onPlayerStateChange, "onPlayerStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-27495787);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(data) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(playerState.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPlayerStateChange) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function23 = function22;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function2RememberComposableLambda = i4 == 0 ? ComposableLambda3.rememberComposableLambda(-1586525211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt.RhvTrailerVideoMainSection.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1586525211, i6, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoMainSection.<anonymous> (RhvTrailerVideoScreen.kt:159)");
                            }
                            RhvTrailerVideoScreen4.ClickToPauseVideoPlayer(data.getTrailer_url(), playerState, onPlayerStateChange, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 3072, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54) : function22;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-27495787, i3, -1, "com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoMainSection (RhvTrailerVideoScreen.kt:166)");
                    }
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier5 = modifier4;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection), 0.0f, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, layoutDirection), paddingValues.getBottom(), 2, null), 0.0f, 1, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function2RememberComposableLambda.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                    boolean z = playerState != RhvTrailerVideoScreen3.PENDING || playerState == RhvTrailerVideoScreen3.ENDED;
                    Function2<? super Composer, ? super Integer, Unit> function24 = function2RememberComposableLambda;
                    AnimatedVisibilityKt.AnimatedVisibility(z, boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), companion.getBottomCenter()), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(-519717641, true, new RhvTrailerVideoScreen7(playerState, data, onPlayerStateChange, onContinueClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function23 = function24;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhvTrailerVideoScreen4.RhvTrailerVideoMainSection$lambda$6(paddingValues, onContinueClicked, data, playerState, onPlayerStateChange, modifier3, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            function22 = function2;
            if ((599187 & i3) == 599186) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier52 = modifier4;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier4, androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, layoutDirection2), 0.0f, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, layoutDirection2), paddingValues.getBottom(), 2, null), 0.0f, 1, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    function2RememberComposableLambda.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                    if (playerState != RhvTrailerVideoScreen3.PENDING) {
                        Function2<? super Composer, ? super Integer, Unit> function242 = function2RememberComposableLambda;
                        AnimatedVisibilityKt.AnimatedVisibility(z, boxScopeInstance2.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), companion3.getBottomCenter()), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(-519717641, true, new RhvTrailerVideoScreen7(playerState, data, onPlayerStateChange, onContinueClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function23 = function242;
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        function22 = function2;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ClickToPauseVideoPlayer(final String videoUrl, final RhvTrailerVideoScreen3 state, final Function1<? super RhvTrailerVideoScreen3, Unit> onStateChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        final SnapshotState snapshotState3;
        boolean z;
        Object objRememberedValue4;
        boolean z2;
        Object objRememberedValue5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        boolean z3;
        boolean z4;
        Object objRememberedValue6;
        boolean z5;
        Object objRememberedValue7;
        boolean z6;
        Object objRememberedValue8;
        Object objRememberedValue9;
        boolean z7;
        Object objRememberedValue10;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onStateChange, "onStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1184807545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(videoUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStateChange) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1184807545, i3, -1, "com.robinhood.android.equities.rhvtrailer.video.ClickToPauseVideoPlayer (RhvTrailerVideoScreen.kt:275)");
                }
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
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                Object value = snapshotState.getValue();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i5 = i3 & 112;
                z = i5 != 32;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new RhvTrailerVideoScreen5(snapshotState, state, snapshotState3, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(state, value, (Function2) objRememberedValue4, composerStartRestartGroup, (i3 >> 3) & 14);
                Object value2 = snapshotState.getValue();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z2 = i5 != 32;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$18$lambda$17(snapshotState, state, snapshotState2, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(value2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                AnimationExoPlayerConfig animationExoPlayerConfig = new AnimationExoPlayerConfig(0, 4);
                if (state != RhvTrailerVideoScreen3.PLAYING) {
                    modifier3 = modifier5;
                    z3 = true;
                } else {
                    modifier3 = modifier5;
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i6 = i3 & 896;
                z4 = (i6 != 256) | (i5 != 32);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$20$lambda$19(snapshotState, state, onStateChange, snapshotState3, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                Function1 function1 = (Function1) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z5 = i6 != 256;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$22$lambda$21(onStateChange, (PlaybackException) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function1 function12 = (Function1) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z6 = (i3 & 14) != 4;
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!z6 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$24$lambda$23(snapshotState, videoUrl, (ExoPlayer) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier6 = modifier3;
                AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig, null, z3, 0, function1, function12, (Function1) objRememberedValue8, composerStartRestartGroup, AnimationExoPlayerConfig.$stable | 3072, 2);
                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z7 = (i5 != 32) | (i6 == 256);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!z7 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$27$lambda$26(state, onStateChange);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(modifierMatchParentSize, interactionSource3, null, false, null, null, (Function0) objRememberedValue10, 28, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$29(videoUrl, state, onStateChange, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
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
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Object value3 = snapshotState.getValue();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i52 = i3 & 112;
            if (i52 != 32) {
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue4 = new RhvTrailerVideoScreen5(snapshotState, state, snapshotState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(state, value3, (Function2) objRememberedValue4, composerStartRestartGroup, (i3 >> 3) & 14);
                Object value22 = snapshotState.getValue();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                if (i52 != 32) {
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$18$lambda$17(snapshotState, state, snapshotState2, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(value22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        AnimationExoPlayerConfig animationExoPlayerConfig2 = new AnimationExoPlayerConfig(0, 4);
                        if (state != RhvTrailerVideoScreen3.PLAYING) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        if (i52 != 32) {
                        }
                        int i62 = i3 & 896;
                        z4 = (i62 != 256) | (i52 != 32);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$20$lambda$19(snapshotState, state, onStateChange, snapshotState3, ((Integer) obj).intValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            Function1 function13 = (Function1) objRememberedValue6;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if (i62 != 256) {
                            }
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (!z5) {
                                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$22$lambda$21(onStateChange, (PlaybackException) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                Function1 function122 = (Function1) objRememberedValue7;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                if ((i3 & 14) != 4) {
                                }
                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (!z6) {
                                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$24$lambda$23(snapshotState, videoUrl, (ExoPlayer) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifier62 = modifier3;
                                    AnimationExoPlayer2.AnimationExoPlayer(animationExoPlayerConfig2, null, z3, 0, function13, function122, (Function1) objRememberedValue8, composerStartRestartGroup, AnimationExoPlayerConfig.$stable | 3072, 2);
                                    Modifier modifierMatchParentSize2 = boxScopeInstance2.matchParentSize(Modifier.INSTANCE);
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue9 == companion.getEmpty()) {
                                    }
                                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue9;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    z7 = (i52 != 32) | (i62 == 256);
                                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                    if (!z7) {
                                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$28$lambda$27$lambda$26(state, onStateChange);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                        composerStartRestartGroup.endReplaceGroup();
                                        BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(modifierMatchParentSize2, interactionSource32, null, false, null, null, (Function0) objRememberedValue10, 28, null), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier4 = modifier62;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClickToPauseVideoPlayer$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClickToPauseVideoPlayer$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.media3.common.Player$Listener, com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$2$1$listener$1] */
    public static final DisposableEffectResult ClickToPauseVideoPlayer$lambda$18$lambda$17(SnapshotState snapshotState, final RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, final SnapshotState snapshotState2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ExoPlayer exoPlayer = (ExoPlayer) snapshotState.getValue();
        if (exoPlayer == 0) {
            return new DisposableEffectResult() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$lambda$18$lambda$17$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
        final ?? r4 = new Player.Listener() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$2$1$listener$1
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
                if (rhvTrailerVideoScreen3 != RhvTrailerVideoScreen3.PENDING || RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$9(snapshotState2)) {
                    return;
                }
                exoPlayer.pause();
                RhvTrailerVideoScreen4.ClickToPauseVideoPlayer$lambda$10(snapshotState2, true);
            }
        };
        exoPlayer.addListener(r4);
        return new DisposableEffectResult() { // from class: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreenKt$ClickToPauseVideoPlayer$lambda$18$lambda$17$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                exoPlayer.removeListener(r4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickToPauseVideoPlayer$lambda$28$lambda$20$lambda$19(SnapshotState snapshotState, RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, Function1 function1, SnapshotState snapshotState2, int i) {
        ExoPlayer exoPlayer = (ExoPlayer) snapshotState.getValue();
        RhvTrailerVideoScreen3 rhvTrailerVideoScreen32 = RhvTrailerVideoScreen3.PLAYING;
        boolean z = rhvTrailerVideoScreen3 == rhvTrailerVideoScreen32;
        if (i == 1 || i == 2 || i == 3) {
            if (ClickToPauseVideoPlayer$lambda$12(snapshotState2) || ((exoPlayer != null && exoPlayer.getPlayWhenReady()) || z)) {
                if (rhvTrailerVideoScreen3 != rhvTrailerVideoScreen32) {
                    function1.invoke(rhvTrailerVideoScreen32);
                }
                ClickToPauseVideoPlayer$lambda$13(snapshotState2, false);
            } else {
                RhvTrailerVideoScreen3 rhvTrailerVideoScreen33 = RhvTrailerVideoScreen3.PENDING;
                if (rhvTrailerVideoScreen3 != rhvTrailerVideoScreen33) {
                    function1.invoke(rhvTrailerVideoScreen33);
                }
            }
        } else if (i == 4) {
            function1.invoke(RhvTrailerVideoScreen3.ENDED);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickToPauseVideoPlayer$lambda$28$lambda$22$lambda$21(Function1 function1, PlaybackException playbackException) {
        Intrinsics.checkNotNullParameter(playbackException, "<unused var>");
        function1.invoke(RhvTrailerVideoScreen3.PENDING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickToPauseVideoPlayer$lambda$28$lambda$24$lambda$23(SnapshotState snapshotState, String str, ExoPlayer AnimationExoPlayer) {
        Intrinsics.checkNotNullParameter(AnimationExoPlayer, "$this$AnimationExoPlayer");
        snapshotState.setValue(AnimationExoPlayer);
        AnimationExoPlayer.setMediaItem(MediaItem.fromUri(str));
        AnimationExoPlayer.prepare();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickToPauseVideoPlayer$lambda$28$lambda$27$lambda$26(RhvTrailerVideoScreen3 rhvTrailerVideoScreen3, Function1 function1) {
        RhvTrailerVideoScreen3 rhvTrailerVideoScreen32 = RhvTrailerVideoScreen3.PLAYING;
        if (rhvTrailerVideoScreen3 == rhvTrailerVideoScreen32) {
            function1.invoke(RhvTrailerVideoScreen3.PENDING);
        } else {
            function1.invoke(rhvTrailerVideoScreen32);
        }
        return Unit.INSTANCE;
    }
}
