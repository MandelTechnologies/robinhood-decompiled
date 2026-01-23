package com.robinhood.shared.crypto.transfer.enrollment.valueProps;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.p014ui.PlayerView;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.TextStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.logging.CrashReporter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EnrollmentValuePropsComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a3\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a)\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\u0007\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, m3636d2 = {"EnrollmentValuePropsComposable", "", "files", "", "Landroid/net/Uri;", "getStarted", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Content", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VideoPlayer", "onVideoLoadFailed", "IntroText", "(Landroidx/compose/runtime/Composer;I)V", "prepareSources", "Landroidx/media3/exoplayer/ExoPlayer;", "mediaSource", "Landroidx/media3/exoplayer/source/MediaSource;", "getMediaSource", "(Landroid/net/Uri;)Landroidx/media3/exoplayer/source/MediaSource;", "PreviewValueProps", "feature-crypto-transfer_externalDebug", "isBackgroundVideoAvailable", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EnrollmentValuePropsComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$8(List list, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(list, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentValuePropsComposable$lambda$0(List list, Function0 function0, int i, Composer composer, int i2) {
        EnrollmentValuePropsComposable(list, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntroText$lambda$22(int i, Composer composer, int i2) {
        IntroText(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewValueProps$lambda$24(int i, Composer composer, int i2) {
        PreviewValueProps(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer$lambda$12(List list, Function0 function0, int i, Composer composer, int i2) {
        VideoPlayer(list, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer$lambda$20(List list, Function0 function0, int i, Composer composer, int i2) {
        VideoPlayer(list, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer$lambda$9(List list, Function0 function0, int i, Composer composer, int i2) {
        VideoPlayer(list, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult VideoPlayer$lambda$19$lambda$18(final ExoPlayer exoPlayer, final Player.Listener listener, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$VideoPlayer$lambda$19$lambda$18$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.removeListener(listener);
                exoPlayer.release();
            }
        };
    }

    public static final void EnrollmentValuePropsComposable(final List<? extends Uri> files, final Function0<Unit> getStarted, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(getStarted, "getStarted");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272264625);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(files) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(getStarted) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272264625, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposable (EnrollmentValuePropsComposable.kt:72)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableSingletons$EnrollmentValuePropsComposableKt.INSTANCE.getLambda$1483543146$feature_crypto_transfer_externalDebug(), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(814797664, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt.EnrollmentValuePropsComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues contentPadding, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i3 & 6) == 0) {
                        i3 |= composer3.changed(contentPadding) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(814797664, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposable.<anonymous> (EnrollmentValuePropsComposable.kt:78)");
                    }
                    EnrollmentValuePropsComposableKt.Content(files, getStarted, ModifiersKt.logScreenTransitions$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), contentPadding), null, 1, null), composer3, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306758, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentValuePropsComposableKt.EnrollmentValuePropsComposable$lambda$0(files, getStarted, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Content$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final List<? extends Uri> list, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        final Function0<Unit> function02;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1363746105);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                function02 = function0;
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1363746105, i3, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content (EnrollmentValuePropsComposable.kt:94)");
                }
                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
                OnBackPressedDispatcher onBackPressedDispatcher = current == null ? current.getOnBackPressedDispatcher() : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-970448028);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EnrollmentValuePropsComposableKt.Content$lambda$7$lambda$5$lambda$4(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    VideoPlayer(list, (Function0) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getTopCenter());
                ComposableSingletons$EnrollmentValuePropsComposableKt composableSingletons$EnrollmentValuePropsComposableKt = ComposableSingletons$EnrollmentValuePropsComposableKt.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$EnrollmentValuePropsComposableKt.m25019getLambda$1532273740$feature_crypto_transfer_externalDebug(), modifierAlign, ComposableLambda3.rememberComposableLambda(-2133690144, true, new EnrollmentValuePropsComposableKt$Content$1$2(onBackPressedDispatcher), composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
                Modifier modifierAlign2 = boxScopeInstance.align(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null)), companion2.getBottomCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (Content$lambda$2(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(-463904147);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-463905010);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet();
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21425getFg0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composableSingletons$EnrollmentValuePropsComposableKt.getLambda$1118487581$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 805306368, 509);
                composer2 = composerStartRestartGroup;
                final Styles styles = (Styles) composer2.consume(Styles2.getLocalStyles());
                function02 = function0;
                CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles(snapshotState) { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$Content$1$3$overrideStyles$1
                    private final /* synthetic */ Styles $$delegate_0;
                    final /* synthetic */ SnapshotState<Boolean> $isBackgroundVideoAvailable$delegate;

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public AppBarStyle getAppBar(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-2110221809);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2110221809, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-appBar> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        AppBarStyle appBar = this.$$delegate_0.getAppBar(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return appBar;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ButtonBarStyle getButtonBar(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1440186638);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1440186638, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-buttonBar> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return buttonBar;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CardStackStyle getCardStackStyle(Composer composer3, int i5) {
                        composer3.startReplaceGroup(99249063);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(99249063, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-cardStackStyle> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return cardStackStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ChartStyle getChart(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1541465099);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1541465099, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-chart> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        ChartStyle chart = this.$$delegate_0.getChart(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return chart;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CheckboxStyle getCheckBox(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-870268994);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-870268994, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-checkBox> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return checkBox;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1375995728);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1375995728, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-circularProgressIndicator> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return circularProgressIndicator;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public CommunicationCardStyle getCommunicationCard(Composer composer3, int i5) {
                        composer3.startReplaceGroup(799138611);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(799138611, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-communicationCard> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return communicationCard;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer3, int i5) {
                        composer3.startReplaceGroup(407228197);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407228197, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-expandableButtonTray> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return expandableButtonTray;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public IconButtonStyle getIconButton(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-100418762);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-100418762, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-iconButton> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return iconButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public InfoBannerStyle getInfoBanner(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1873203399);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1873203399, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-infoBanner> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return infoBanner;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer3, int i5) {
                        composer3.startReplaceGroup(183673524);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(183673524, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return loadingPlaceholderStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1078934702);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1078934702, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-markdownSpannedText> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return markdownSpannedText;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public NavigationBarStyle getNavigationBarStyle(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-487591794);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-487591794, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-navigationBarStyle> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return navigationBarStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public NumpadStyle getNumpad(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1525474420);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1525474420, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-numpad> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        NumpadStyle numpad = this.$$delegate_0.getNumpad(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return numpad;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public PlaceholderStyle getPlaceholder(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1570990208);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1570990208, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-placeholder> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return placeholder;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public PogStyle getPog(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-921886923);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-921886923, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-pog> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        PogStyle pog = this.$$delegate_0.getPog(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return pog;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ProgressBarStyle getProgressBarStyle(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-302702923);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-302702923, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-progressBarStyle> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return progressBarStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public RadioButtonStyle getRadioButton(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-1373578278);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1373578278, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-radioButton> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return radioButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public RowStyle getRow(Composer composer3, int i5) {
                        composer3.startReplaceGroup(521368455);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(521368455, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-row> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        RowStyle row = this.$$delegate_0.getRow(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return row;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public BentoSelectionRowStyle getSelectionRowStyle(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-1916327583);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1916327583, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-selectionRowStyle> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return selectionRowStyle;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public SpanButtonStyle getSpanButton(Composer composer3, int i5) {
                        composer3.startReplaceGroup(-148879579);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-148879579, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-spanButton> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return spanButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public TextStyle getText(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1394228308);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1394228308, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-text> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        TextStyle text = this.$$delegate_0.getText(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return text;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public TextButtonStyle getTextButton(Composer composer3, int i5) {
                        composer3.startReplaceGroup(724582786);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(724582786, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-textButton> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return textButton;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public TextInputStyle getTextInput(Composer composer3, int i5) {
                        composer3.startReplaceGroup(704204714);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(704204714, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-textInput> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        TextInputStyle textInput = this.$$delegate_0.getTextInput(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return textInput;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ToggleRowStyle getToggleRow(Composer composer3, int i5) {
                        composer3.startReplaceGroup(1927501075);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1927501075, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-toggleRow> (EnrollmentValuePropsComposable.kt:0)");
                        }
                        ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return toggleRow;
                    }

                    {
                        this.$isBackgroundVideoAvailable$delegate = snapshotState;
                        this.$$delegate_0 = this.$localStyles;
                    }

                    @Override // com.robinhood.compose.theme.Styles
                    @JvmName
                    public ButtonStyle getButton(Composer composer3, int i5) {
                        long jM21368getAccent0d7_KjU;
                        long jM21371getBg0d7_KjU;
                        composer3.startReplaceGroup(11482383);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(11482383, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-button> (EnrollmentValuePropsComposable.kt:137)");
                        }
                        ButtonStyle button = this.$localStyles.getButton(composer3, 0);
                        ButtonStyle.Style primary = this.$localStyles.getButton(composer3, 0).getPrimary();
                        ButtonStyle.Colors colors = this.$localStyles.getButton(composer3, 0).getPrimary().getColors();
                        if (EnrollmentValuePropsComposableKt.Content$lambda$2(this.$isBackgroundVideoAvailable$delegate)) {
                            composer3.startReplaceGroup(-1525365331);
                            jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getNova();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1525258133);
                            jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        ButtonStyle.StateColor stateColor = new ButtonStyle.StateColor(jM21368getAccent0d7_KjU, bentoTheme.getColors(composer3, i6).m21373getBg30d7_KjU(), null);
                        if (EnrollmentValuePropsComposableKt.Content$lambda$2(this.$isBackgroundVideoAvailable$delegate)) {
                            composer3.startReplaceGroup(-1524888210);
                            jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i6).getJet();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1524782097);
                            jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        ButtonStyle buttonStyleCopy$default = ButtonStyle.copy$default(button, ButtonStyle.Style.m21714copyd8LSEHM$default(primary, colors.copy(stateColor, new ButtonStyle.StateColor(jM21371getBg0d7_KjU, bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU(), null), null), null, 0.0f, null, 14, null), null, 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer3.endReplaceGroup();
                        return buttonStyleCopy$default;
                    }
                }), ComposableLambda3.rememberComposableLambda(-1750551669, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$Content$1$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750551669, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<anonymous> (EnrollmentValuePropsComposable.kt:163)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer3, 6, 0), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "GET_STARTED", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_get_started, composer3, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function03 = function02;
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnrollmentValuePropsComposableKt.Content$lambda$8(list, function03, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            if (current2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-970448028);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierAlign3 = boxScopeInstance2.align(companion42, companion22.getTopCenter());
                ComposableSingletons$EnrollmentValuePropsComposableKt composableSingletons$EnrollmentValuePropsComposableKt2 = ComposableSingletons$EnrollmentValuePropsComposableKt.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$EnrollmentValuePropsComposableKt2.m25019getLambda$1532273740$feature_crypto_transfer_externalDebug(), modifierAlign3, ComposableLambda3.rememberComposableLambda(-2133690144, true, new EnrollmentValuePropsComposableKt$Content$1$2(onBackPressedDispatcher), composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
                Modifier modifierAlign22 = boxScopeInstance2.align(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null)), companion22.getBottomCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign22);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    if (Content$lambda$2(snapshotState)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21425getFg0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composableSingletons$EnrollmentValuePropsComposableKt2.getLambda$1118487581$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 805306368, 509);
                    composer2 = composerStartRestartGroup;
                    final Styles styles2 = (Styles) composer2.consume(Styles2.getLocalStyles());
                    function02 = function0;
                    CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles(snapshotState) { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$Content$1$3$overrideStyles$1
                        private final /* synthetic */ Styles $$delegate_0;
                        final /* synthetic */ SnapshotState<Boolean> $isBackgroundVideoAvailable$delegate;

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public AppBarStyle getAppBar(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-2110221809);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2110221809, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-appBar> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            AppBarStyle appBar = this.$$delegate_0.getAppBar(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return appBar;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ButtonBarStyle getButtonBar(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1440186638);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1440186638, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-buttonBar> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return buttonBar;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CardStackStyle getCardStackStyle(Composer composer3, int i5) {
                            composer3.startReplaceGroup(99249063);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(99249063, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-cardStackStyle> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return cardStackStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ChartStyle getChart(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1541465099);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1541465099, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-chart> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            ChartStyle chart = this.$$delegate_0.getChart(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return chart;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CheckboxStyle getCheckBox(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-870268994);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-870268994, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-checkBox> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return checkBox;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1375995728);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1375995728, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-circularProgressIndicator> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return circularProgressIndicator;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public CommunicationCardStyle getCommunicationCard(Composer composer3, int i5) {
                            composer3.startReplaceGroup(799138611);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(799138611, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-communicationCard> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return communicationCard;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer3, int i5) {
                            composer3.startReplaceGroup(407228197);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(407228197, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-expandableButtonTray> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return expandableButtonTray;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public IconButtonStyle getIconButton(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-100418762);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-100418762, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-iconButton> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return iconButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public InfoBannerStyle getInfoBanner(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1873203399);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1873203399, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-infoBanner> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return infoBanner;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer3, int i5) {
                            composer3.startReplaceGroup(183673524);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(183673524, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return loadingPlaceholderStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1078934702);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1078934702, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-markdownSpannedText> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return markdownSpannedText;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public NavigationBarStyle getNavigationBarStyle(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-487591794);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-487591794, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-navigationBarStyle> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return navigationBarStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public NumpadStyle getNumpad(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1525474420);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1525474420, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-numpad> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            NumpadStyle numpad = this.$$delegate_0.getNumpad(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return numpad;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public PlaceholderStyle getPlaceholder(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1570990208);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1570990208, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-placeholder> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return placeholder;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public PogStyle getPog(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-921886923);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-921886923, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-pog> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            PogStyle pog = this.$$delegate_0.getPog(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return pog;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ProgressBarStyle getProgressBarStyle(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-302702923);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-302702923, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-progressBarStyle> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return progressBarStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public RadioButtonStyle getRadioButton(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-1373578278);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1373578278, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-radioButton> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return radioButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public RowStyle getRow(Composer composer3, int i5) {
                            composer3.startReplaceGroup(521368455);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(521368455, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-row> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            RowStyle row = this.$$delegate_0.getRow(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return row;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public BentoSelectionRowStyle getSelectionRowStyle(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-1916327583);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1916327583, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-selectionRowStyle> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return selectionRowStyle;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public SpanButtonStyle getSpanButton(Composer composer3, int i5) {
                            composer3.startReplaceGroup(-148879579);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-148879579, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-spanButton> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return spanButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextStyle getText(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1394228308);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1394228308, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-text> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            TextStyle text = this.$$delegate_0.getText(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return text;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextButtonStyle getTextButton(Composer composer3, int i5) {
                            composer3.startReplaceGroup(724582786);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(724582786, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-textButton> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return textButton;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public TextInputStyle getTextInput(Composer composer3, int i5) {
                            composer3.startReplaceGroup(704204714);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(704204714, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-textInput> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            TextInputStyle textInput = this.$$delegate_0.getTextInput(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return textInput;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ToggleRowStyle getToggleRow(Composer composer3, int i5) {
                            composer3.startReplaceGroup(1927501075);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1927501075, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-toggleRow> (EnrollmentValuePropsComposable.kt:0)");
                            }
                            ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return toggleRow;
                        }

                        {
                            this.$isBackgroundVideoAvailable$delegate = snapshotState;
                            this.$$delegate_0 = this.$localStyles;
                        }

                        @Override // com.robinhood.compose.theme.Styles
                        @JvmName
                        public ButtonStyle getButton(Composer composer3, int i5) {
                            long jM21368getAccent0d7_KjU;
                            long jM21371getBg0d7_KjU;
                            composer3.startReplaceGroup(11482383);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(11482383, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<no name provided>.<get-button> (EnrollmentValuePropsComposable.kt:137)");
                            }
                            ButtonStyle button = this.$localStyles.getButton(composer3, 0);
                            ButtonStyle.Style primary = this.$localStyles.getButton(composer3, 0).getPrimary();
                            ButtonStyle.Colors colors = this.$localStyles.getButton(composer3, 0).getPrimary().getColors();
                            if (EnrollmentValuePropsComposableKt.Content$lambda$2(this.$isBackgroundVideoAvailable$delegate)) {
                                composer3.startReplaceGroup(-1525365331);
                                jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getNova();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1525258133);
                                jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            ButtonStyle.StateColor stateColor = new ButtonStyle.StateColor(jM21368getAccent0d7_KjU, bentoTheme.getColors(composer3, i6).m21373getBg30d7_KjU(), null);
                            if (EnrollmentValuePropsComposableKt.Content$lambda$2(this.$isBackgroundVideoAvailable$delegate)) {
                                composer3.startReplaceGroup(-1524888210);
                                jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i6).getJet();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1524782097);
                                jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            ButtonStyle buttonStyleCopy$default = ButtonStyle.copy$default(button, ButtonStyle.Style.m21714copyd8LSEHM$default(primary, colors.copy(stateColor, new ButtonStyle.StateColor(jM21371getBg0d7_KjU, bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU(), null), null), null, 0.0f, null, 14, null), null, 2, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return buttonStyleCopy$default;
                        }
                    }), ComposableLambda3.rememberComposableLambda(-1750551669, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$Content$1$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1750551669, i5, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.Content.<anonymous>.<anonymous>.<anonymous> (EnrollmentValuePropsComposable.kt:163)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer3, 6, 0), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "GET_STARTED", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_get_started, composer3, 0), modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer3, 0, 0, 8184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Content$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$7$lambda$5$lambda$4(SnapshotState snapshotState) {
        Content$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void VideoPlayer(final List<? extends Uri> list, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-436138017);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-436138017, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.VideoPlayer (EnrollmentValuePropsComposable.kt:192)");
            }
            if (list.isEmpty()) {
                function0.invoke();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return EnrollmentValuePropsComposableKt.VideoPlayer$lambda$9(list, function0, i, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj2 = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                try {
                    ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                    Intrinsics.checkNotNull(exoPlayerBuild);
                    prepareSources(exoPlayerBuild, list);
                    exoPlayerBuild.setPlayWhenReady(true);
                    exoPlayerBuild.setVideoScalingMode(1);
                    obj = exoPlayerBuild;
                } catch (Throwable th) {
                    if (!(th instanceof ErrnoException) && !(th instanceof FileNotFoundException) && !(th instanceof FileDataSource.FileDataSourceException)) {
                        throw th;
                    }
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    obj = null;
                }
                composerStartRestartGroup.updateRememberedValue(obj);
                obj2 = obj;
            }
            final ExoPlayer exoPlayer = (ExoPlayer) obj2;
            composerStartRestartGroup.endReplaceGroup();
            if (exoPlayer == null) {
                function0.invoke();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return EnrollmentValuePropsComposableKt.VideoPlayer$lambda$12(list, function0, i, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Player.Listener() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$VideoPlayer$listener$1$1
                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                        super.onAudioAttributesChanged(audioAttributes);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i3) {
                        super.onAudioSessionIdChanged(i3);
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
                    public /* bridge */ /* synthetic */ void onCues(List list2) {
                        super.onCues((List<Cue>) list2);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                        super.onDeviceInfoChanged(deviceInfo);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i3, boolean z) {
                        super.onDeviceVolumeChanged(i3, z);
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
                    public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i3) {
                        super.onMediaItemTransition(mediaItem, i3);
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
                    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i3) {
                        super.onPlayWhenReadyChanged(z, i3);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                        super.onPlaybackParametersChanged(playbackParameters);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i3) {
                        super.onPlaybackStateChanged(i3);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i3) {
                        super.onPlaybackSuppressionReasonChanged(i3);
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
                    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i3) {
                        super.onPlayerStateChanged(z, i3);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                        super.onPlaylistMetadataChanged(mediaMetadata);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    @Deprecated
                    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i3) {
                        super.onPositionDiscontinuity(i3);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                        super.onRenderedFirstFrame();
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i3) {
                        super.onRepeatModeChanged(i3);
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
                    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i3, int i4) {
                        super.onSurfaceSizeChanged(i3, i4);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i3) {
                        super.onTimelineChanged(timeline, i3);
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
                    public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
                        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
                        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
                        super.onPositionDiscontinuity(oldPosition, newPosition, reason);
                        exoPlayer.setPlaybackParameters(PlaybackParameters.DEFAULT);
                        if (exoPlayer.getCurrentPeriodIndex() == 1) {
                            exoPlayer.setRepeatMode(1);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final EnrollmentValuePropsComposableKt$VideoPlayer$listener$1$1 enrollmentValuePropsComposableKt$VideoPlayer$listener$1$1 = (EnrollmentValuePropsComposableKt$VideoPlayer$listener$1$1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            exoPlayer.addListener(enrollmentValuePropsComposableKt$VideoPlayer$listener$1$1);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return EnrollmentValuePropsComposableKt.VideoPlayer$lambda$16$lambda$15(context, exoPlayer, (Context) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, null, null, composerStartRestartGroup, 0, 6);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(exoPlayer);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return EnrollmentValuePropsComposableKt.VideoPlayer$lambda$19$lambda$18(exoPlayer, enrollmentValuePropsComposableKt$VideoPlayer$listener$1$1, (DisposableEffectScope) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return EnrollmentValuePropsComposableKt.VideoPlayer$lambda$20(list, function0, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView VideoPlayer$lambda$16$lambda$15(Context context, ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(4);
        playerView.setShutterBackgroundColor(0);
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IntroText(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1340342298);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340342298, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.IntroText (EnrollmentValuePropsComposable.kt:266)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_intro_title, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getBookCoverCapsuleSmall(), composer2, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_intro_subtitle, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentValuePropsComposableKt.IntroText$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void prepareSources(ExoPlayer exoPlayer, List<? extends Uri> list) {
        ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource(new MediaSource[0]);
        concatenatingMediaSource.addMediaSource(getMediaSource(list.get(0)));
        concatenatingMediaSource.addMediaSource(getMediaSource(list.get(1)));
        exoPlayer.setMediaSource(concatenatingMediaSource);
        exoPlayer.prepare();
    }

    private static final MediaSource getMediaSource(Uri uri) throws IOException {
        final FileDataSource fileDataSource = new FileDataSource();
        fileDataSource.open(new DataSpec(uri));
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DataSource.Factory() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$mediaSource$factory$1
            @Override // androidx.media3.datasource.DataSource.Factory
            public final DataSource createDataSource() {
                return fileDataSource;
            }
        }, Mp4Extractor.newFactory(SubtitleParser.Factory.UNSUPPORTED)).createMediaSource(MediaItem.fromUri(uri));
        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
        return progressiveMediaSourceCreateMediaSource;
    }

    private static final void PreviewValueProps(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1011987348);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1011987348, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.valueProps.PreviewValueProps (EnrollmentValuePropsComposable.kt:316)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$EnrollmentValuePropsComposableKt.INSTANCE.getLambda$157304652$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.EnrollmentValuePropsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EnrollmentValuePropsComposableKt.PreviewValueProps$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
