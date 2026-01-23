package com.robinhood.android.cortex.digest.common.splash;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CortexDigestSplashAnimation.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001aÊ\u0001\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2.\b\u0002\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\b\u00152.\b\u0002\u0010\u0018\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\"²\u0006\u000e\u0010\u001b\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m3636d2 = {"", "videoUrl", "fallbackImageUrl", "", "videoKillswitchEnabled", "skipToEnd", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDuration", "", "onAnimationStarted", "Lkotlin/Function0;", "onAnimationComplete", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/BoxScope;", "", "placeHolderAlpha", "Lkotlin/ExtensionFunctionType;", "placeholderContent", "animatedContentAlpha", "videoAccessoryContent", "CortexDigestSplashAnimation", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "hasPlayerError", "initialIsReady", "isReady", "isDone", "lastPosition", "coverAlpha", "placeholderAlpha", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CortexDigestSplashAnimationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CortexDigestSplashAnimation$lambda$32(String str, String str2, boolean z, boolean z2, Function1 function1, Function0 function0, Modifier modifier, Function4 function4, Function4 function42, int i, int i2, Composer composer, int i3) {
        CortexDigestSplashAnimation(str, str2, z, z2, function1, function0, modifier, function4, function42, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CortexDigestSplashAnimation$lambda$8(String str, String str2, boolean z, boolean z2, Function1 function1, Function0 function0, Modifier modifier, Function4 function4, Function4 function42, int i, int i2, Composer composer, int i3) {
        CortexDigestSplashAnimation(str, str2, z, z2, function1, function0, modifier, function4, function42, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57, types: [androidx.compose.animation.core.Easing, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CortexDigestSplashAnimation(final String videoUrl, final String fallbackImageUrl, final boolean z, final boolean z2, final Function1<? super Long, Unit> onAnimationStarted, final Function0<Unit> onAnimationComplete, Modifier modifier, Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function4, Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function42, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function43;
        int i6;
        Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
        Modifier modifier3;
        Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function4M12584getLambda$2014003038$lib_cortex_digest_common_externalDebug;
        Object objRememberedValue;
        Composer.Companion companion;
        int i7;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        int i8;
        boolean z3;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object obj;
        int i9;
        int i10;
        int i11;
        final LifecycleOwner lifecycleOwner;
        Object objRememberedValue4;
        final SnapshotLongState2 snapshotLongState2;
        Unit unit;
        boolean zChangedInstance;
        final ExoPlayer exoPlayer;
        Object obj2;
        BoxScopeInstance boxScopeInstance;
        int i12;
        Unit unit2;
        Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function44;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        final SnapshotState snapshotState4;
        Composer composer2;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        ?? r10;
        boolean zChangedInstance3;
        Object objRememberedValue6;
        final Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function45;
        final Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function46;
        final Modifier modifier4;
        Object objRememberedValue7;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        int i13;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(fallbackImageUrl, "fallbackImageUrl");
        Intrinsics.checkNotNullParameter(onAnimationStarted, "onAnimationStarted");
        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(867400849);
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
            i3 |= composerStartRestartGroup.changed(fallbackImageUrl) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAnimationStarted) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            i13 = (196608 & i) == 0 ? composerStartRestartGroup.changedInstance(onAnimationComplete) ? 131072 : 65536 : 196608;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
                function43 = function4;
            } else {
                function43 = function4;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function43) ? 8388608 : 4194304;
                }
            }
            i6 = i2 & 256;
            if (i6 == 0) {
                i3 |= 100663296;
                function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug = function42;
            } else {
                function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug = function42;
                if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug) ? 67108864 : 33554432;
                }
            }
            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                function4M12584getLambda$2014003038$lib_cortex_digest_common_externalDebug = i5 == 0 ? ComposableSingletons$CortexDigestSplashAnimationKt.INSTANCE.m12584getLambda$2014003038$lib_cortex_digest_common_externalDebug() : function43;
                if (i6 != 0) {
                    function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug = ComposableSingletons$CortexDigestSplashAnimationKt.INSTANCE.m12585getLambda$495484214$lib_cortex_digest_common_externalDebug();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(867400849, i3, -1, "com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimation (CortexDigestSplashAnimation.kt:55)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    i7 = 2;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i7 = 2;
                }
                final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(348580644);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue() && !z) {
                    Boolean boolValueOf = Boolean.valueOf(CortexDigestSplashAnimation$lambda$4(snapshotState));
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$1$1(snapshotState, snapshotState5, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(348591724);
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue() || CortexDigestSplashAnimation$lambda$1(snapshotState5) || z) {
                    final Modifier modifier5 = modifier3;
                    final Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function47 = function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
                    i8 = i3;
                    final Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function48 = function4M12584getLambda$2014003038$lib_cortex_digest_common_externalDebug;
                    boolean z4 = true;
                    BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(fallbackImageUrl, null, null, null, 0, null, composerStartRestartGroup, (i8 >> 3) & 14, 62), null, modifier5, null, null, 0.0f, null, composerStartRestartGroup, ((i8 >> 12) & 896) | 48, 120);
                    Unit unit3 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z5 = (i8 & 57344) != 16384;
                    if ((i8 & 458752) != 131072) {
                        z4 = false;
                    }
                    z3 = z5 | z4;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1(onAnimationStarted, onAnimationComplete, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$8(videoUrl, fallbackImageUrl, z, z2, onAnimationStarted, onAnimationComplete, modifier5, function48, function47, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.endReplaceGroup();
                int i14 = i3 >> 18;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier6 = modifier3;
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                    exoPlayerBuild.setRepeatMode(0);
                    exoPlayerBuild.setPlayWhenReady(true);
                    exoPlayerBuild.setVideoScalingMode(1);
                    composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                    obj = exoPlayerBuild;
                } else {
                    obj = objRememberedValue8;
                }
                final ExoPlayer exoPlayer2 = (ExoPlayer) obj;
                composerStartRestartGroup.endReplaceGroup();
                Intrinsics.checkNotNull(exoPlayer2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    i9 = 2;
                    objRememberedValue9 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    i9 = 2;
                }
                SnapshotState snapshotState6 = (SnapshotState) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i9, null);
                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                    objRememberedValue10 = snapshotStateMutableStateOf$default;
                }
                SnapshotState snapshotState7 = (SnapshotState) objRememberedValue10;
                composerStartRestartGroup.endReplaceGroup();
                float f = (CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState6) || CortexDigestSplashAnimation$lambda$31$lambda$15(snapshotState7)) ? 1.0f : 0.0f;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierAlpha = Alpha.alpha(companion3, f);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(exoPlayer2);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    i10 = i3;
                } else {
                    i10 = i3;
                    if (objRememberedValue11 == companion.getEmpty()) {
                    }
                    Function1 function1 = (Function1) objRememberedValue11;
                    composerStartRestartGroup.endReplaceGroup();
                    Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function49 = function4M12584getLambda$2014003038$lib_cortex_digest_common_externalDebug;
                    i11 = i10;
                    AndroidView_androidKt.AndroidView(function1, modifierAlpha, null, composerStartRestartGroup, 0, 4);
                    function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug.invoke(boxScopeInstance2, Float.valueOf(CortexDigestSplashAnimation$lambda$31$lambda$20(AnimateAsState.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30))), composerStartRestartGroup, Integer.valueOf((i14 & 896) | 6));
                    lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotLongState3.mutableLongStateOf(0L);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    snapshotLongState2 = (SnapshotLongState2) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer2) | composerStartRestartGroup.changedInstance(lifecycleOwner) | ((57344 & i11) != 16384) | ((458752 & i11) != 131072);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue12 == companion.getEmpty()) {
                        Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function410 = function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
                        exoPlayer = exoPlayer2;
                        boxScopeInstance = boxScopeInstance2;
                        i12 = i11;
                        unit2 = unit;
                        function44 = function410;
                        snapshotState2 = snapshotState6;
                        snapshotState3 = snapshotState7;
                        snapshotState4 = snapshotState;
                        composer2 = composerStartRestartGroup;
                        obj2 = new Function1() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$26$lambda$25(lifecycleOwner, exoPlayer, snapshotLongState2, onAnimationStarted, onAnimationComplete, snapshotState4, snapshotState2, snapshotState3, snapshotState5, (DisposableEffectScope) obj3);
                            }
                        };
                        composer2.updateRememberedValue(obj2);
                    } else {
                        boxScopeInstance = boxScopeInstance2;
                        i12 = i11;
                        function44 = function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
                        composer2 = composerStartRestartGroup;
                        unit2 = unit;
                        snapshotState3 = snapshotState7;
                        snapshotState4 = snapshotState;
                        exoPlayer = exoPlayer2;
                        obj2 = objRememberedValue12;
                        snapshotState2 = snapshotState6;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj2, composer2, 6);
                    composer2.startReplaceGroup(-1633490746);
                    int i15 = i12;
                    int i16 = i15 & 14;
                    zChangedInstance2 = composer2.changedInstance(exoPlayer) | (i16 != 4);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        r10 = 0;
                        objRememberedValue5 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$3$1(exoPlayer, videoUrl, null);
                        composer2.updateRememberedValue(objRememberedValue5);
                    } else {
                        r10 = 0;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(videoUrl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, i16);
                    Boolean boolValueOf2 = Boolean.valueOf(CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState2));
                    Boolean boolValueOf3 = Boolean.valueOf(z2);
                    composer2.startReplaceGroup(-1746271574);
                    zChangedInstance3 = composer2.changedInstance(exoPlayer) | ((i15 & 7168) != 2048);
                    objRememberedValue6 = composer2.rememberedValue();
                    if (!zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1(exoPlayer, z2, snapshotState2, r10);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, boolValueOf3, (Function2) objRememberedValue6, composer2, (i15 >> 6) & 112);
                    Composer composer4 = composer2;
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Alpha.alpha(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, r10), CortexDigestSplashAnimation$lambda$31$lambda$29(AnimateAsState.animateFloatAsState((!CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState2) || CortexDigestSplashAnimation$lambda$31$lambda$15(snapshotState3)) ? 0.0f : 1.0f, AnimationSpecKt.tween$default(0, 0, r10, 7, r10), 0.0f, null, null, composer4, 48, 28))), BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer4, 0);
                    float f2 = !CortexDigestSplashAnimation$lambda$4(snapshotState4) ? 0.0f : 1.0f;
                    Composer composer5 = composer4;
                    function45 = function49;
                    function45.invoke(boxScopeInstance, Float.valueOf(CortexDigestSplashAnimation$lambda$31$lambda$30(AnimateAsState.animateFloatAsState(f2, AnimationSpecKt.tween$default(0, 0, r10, 7, r10), 0.0f, null, null, composer4, 48, 28))), composer5, Integer.valueOf(6 | ((i15 >> 15) & 896)));
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function46 = function44;
                    modifier4 = modifier6;
                    composer3 = composer5;
                }
                objRememberedValue11 = new Function1() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$19$lambda$18(context, exoPlayer2, (Context) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                Function1 function12 = (Function1) objRememberedValue11;
                composerStartRestartGroup.endReplaceGroup();
                Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function492 = function4M12584getLambda$2014003038$lib_cortex_digest_common_externalDebug;
                i11 = i10;
                AndroidView_androidKt.AndroidView(function12, modifierAlpha, null, composerStartRestartGroup, 0, 4);
                function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug.invoke(boxScopeInstance2, Float.valueOf(CortexDigestSplashAnimation$lambda$31$lambda$20(AnimateAsState.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30))), composerStartRestartGroup, Integer.valueOf((i14 & 896) | 6));
                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotLongState2 = (SnapshotLongState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer2) | composerStartRestartGroup.changedInstance(lifecycleOwner) | ((57344 & i11) != 16384) | ((458752 & i11) != 131072);
                Object objRememberedValue122 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    Function4<? super BoxScope, ? super Float, ? super Composer, ? super Integer, Unit> function4102 = function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
                    exoPlayer = exoPlayer2;
                    boxScopeInstance = boxScopeInstance2;
                    i12 = i11;
                    unit2 = unit;
                    function44 = function4102;
                    snapshotState2 = snapshotState6;
                    snapshotState3 = snapshotState7;
                    snapshotState4 = snapshotState;
                    composer2 = composerStartRestartGroup;
                    obj2 = new Function1() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$26$lambda$25(lifecycleOwner, exoPlayer, snapshotLongState2, onAnimationStarted, onAnimationComplete, snapshotState4, snapshotState2, snapshotState3, snapshotState5, (DisposableEffectScope) obj3);
                        }
                    };
                    composer2.updateRememberedValue(obj2);
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj2, composer2, 6);
                    composer2.startReplaceGroup(-1633490746);
                    int i152 = i12;
                    int i162 = i152 & 14;
                    zChangedInstance2 = composer2.changedInstance(exoPlayer) | (i162 != 4);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance2) {
                        r10 = 0;
                        objRememberedValue5 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$3$1(exoPlayer, videoUrl, null);
                        composer2.updateRememberedValue(objRememberedValue5);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(videoUrl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, i162);
                        Boolean boolValueOf22 = Boolean.valueOf(CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState2));
                        Boolean boolValueOf32 = Boolean.valueOf(z2);
                        composer2.startReplaceGroup(-1746271574);
                        zChangedInstance3 = composer2.changedInstance(exoPlayer) | ((i152 & 7168) != 2048);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue6 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1(exoPlayer, z2, snapshotState2, r10);
                            composer2.updateRememberedValue(objRememberedValue6);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf22, boolValueOf32, (Function2) objRememberedValue6, composer2, (i152 >> 6) & 112);
                            if (CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState2)) {
                                Composer composer42 = composer2;
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Alpha.alpha(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, r10), CortexDigestSplashAnimation$lambda$31$lambda$29(AnimateAsState.animateFloatAsState((!CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState2) || CortexDigestSplashAnimation$lambda$31$lambda$15(snapshotState3)) ? 0.0f : 1.0f, AnimationSpecKt.tween$default(0, 0, r10, 7, r10), 0.0f, null, null, composer42, 48, 28))), BentoTheme.INSTANCE.getColors(composer42, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer42, 0);
                                if (!CortexDigestSplashAnimation$lambda$4(snapshotState4)) {
                                }
                                Composer composer52 = composer42;
                                function45 = function492;
                                function45.invoke(boxScopeInstance, Float.valueOf(CortexDigestSplashAnimation$lambda$31$lambda$30(AnimateAsState.animateFloatAsState(f2, AnimationSpecKt.tween$default(0, 0, r10, 7, r10), 0.0f, null, null, composer42, 48, 28))), composer52, Integer.valueOf(6 | ((i152 >> 15) & 896)));
                                composer52.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function46 = function44;
                                modifier4 = modifier6;
                                composer3 = composer52;
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function46 = function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
                modifier4 = modifier2;
                function45 = function43;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$32(videoUrl, fallbackImageUrl, z, z2, onAnimationStarted, onAnimationComplete, modifier4, function45, function46, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= i13;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            final SnapshotState snapshotState52 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(348580644);
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                Boolean boolValueOf4 = Boolean.valueOf(CortexDigestSplashAnimation$lambda$4(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(348591724);
            if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            final Modifier modifier52 = modifier3;
            final Function4 function472 = function4M12585getLambda$495484214$lib_cortex_digest_common_externalDebug;
            i8 = i3;
            final Function4 function482 = function4M12584getLambda$2014003038$lib_cortex_digest_common_externalDebug;
            boolean z42 = true;
            BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(fallbackImageUrl, null, null, null, 0, null, composerStartRestartGroup, (i8 >> 3) & 14, 62), null, modifier52, null, null, 0.0f, null, composerStartRestartGroup, ((i8 >> 12) & 896) | 48, 120);
            Unit unit32 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i8 & 57344) != 16384) {
            }
            if ((i8 & 458752) != 131072) {
            }
            z3 = z5 | z42;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!z3) {
                objRememberedValue3 = new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$2$1(onAnimationStarted, onAnimationComplete, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CortexDigestSplashAnimation$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CortexDigestSplashAnimation$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean CortexDigestSplashAnimation$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CortexDigestSplashAnimation$lambda$31$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CortexDigestSplashAnimation$lambda$31$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float CortexDigestSplashAnimation$lambda$31$lambda$20(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float CortexDigestSplashAnimation$lambda$31$lambda$29(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float CortexDigestSplashAnimation$lambda$31$lambda$30(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CortexDigestSplashAnimation$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CortexDigestSplashAnimation$lambda$31$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CortexDigestSplashAnimation$lambda$31$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView CortexDigestSplashAnimation$lambda$31$lambda$19$lambda$18(Context context, ExoPlayer exoPlayer, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(0);
        playerView.setShutterBackgroundColor(0);
        playerView.setPlayer(exoPlayer);
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.common.Player$Listener, com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$2$1$listener$1] */
    public static final DisposableEffectResult CortexDigestSplashAnimation$lambda$31$lambda$26$lambda$25(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, final SnapshotLongState2 snapshotLongState2, final Function1 function1, final Function0 function0, final SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState snapshotState3, final SnapshotState snapshotState4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$2$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    snapshotLongState2.setLongValue(exoPlayer.getCurrentPosition());
                    exoPlayer.getDuration();
                    exoPlayer.pause();
                } else if (event == Lifecycle.Event.ON_START) {
                    exoPlayer.seekTo(snapshotLongState2.getLongValue());
                    exoPlayer.play();
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final ?? r1 = new Player.Listener() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$2$1$listener$1
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
                SnapshotState<Boolean> snapshotState5 = snapshotState;
                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$5(snapshotState5, CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$4(snapshotState5) || playbackState == 3);
                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$13(snapshotState2, playbackState == 3);
                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$16(snapshotState3, playbackState == 4);
                if (CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$12(snapshotState2)) {
                    function1.invoke(Long.valueOf(exoPlayer.getDuration()));
                }
                if (CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$15(snapshotState3)) {
                    function0.invoke();
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                super.onPlayerError(error);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, false, null, 4, null);
                CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$2(snapshotState4, true);
            }
        };
        exoPlayer.addListener(r1);
        return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$lambda$31$lambda$26$lambda$25$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.removeListener(r1);
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.release();
            }
        };
    }
}
