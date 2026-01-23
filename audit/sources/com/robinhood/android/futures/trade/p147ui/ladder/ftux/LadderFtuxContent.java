package com.robinhood.android.futures.trade.p147ui.ladder.ftux;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClip;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: LadderFtuxContent.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"LadderFtuxContent", "", "ladderEducationContentData", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationComplete", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-futures-trade_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.ftux.LadderFtuxContentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderFtuxContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderFtuxContent$lambda$6(LadderFtuxProgressState ladderFtuxProgressState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        LadderFtuxContent(ladderFtuxProgressState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderFtuxContent(final LadderFtuxProgressState ladderEducationContentData, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        BentoTheme bentoTheme;
        int i5;
        HttpUrl url;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function03;
        Composer composer2;
        Unit unit;
        Tuples2<Integer, Integer> loopIntervalFrames;
        Unit unit2;
        final Function0<Unit> function04;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ladderEducationContentData, "ladderEducationContentData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1253581731);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(ladderEducationContentData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        function02 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1253581731, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.ftux.LadderFtuxContent (LadderFtuxContent.kt:24)");
                    }
                    bentoTheme = BentoTheme.INSTANCE;
                    i5 = BentoTheme.$stable;
                    if (!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
                        url = ladderEducationContentData.getLottieAnimationSpec().getDayThemeLottieUrl().getUrl();
                    } else {
                        url = ladderEducationContentData.getLottieAnimationSpec().getNightThemeLottieUrl().getUrl();
                    }
                    composerStartRestartGroup.startMovableGroup(2101216299, url);
                    LadderFtuxProgressState.LottieAnimationSpec lottieAnimationSpec = ladderEducationContentData.getLottieAnimationSpec();
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                    Modifier modifier5 = modifier4;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function03 = function02;
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(url.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(LadderFtuxContent$lambda$5$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, lottieAnimationSpec.getLottieIterations(), null, false, false, composerStartRestartGroup, 0, 958);
                    composer2 = composerStartRestartGroup;
                    ContentScale contentScale = lottieAnimationSpec.getContentScale();
                    composer2.startReplaceGroup(1214977051);
                    if (function03 == null && (lottieAnimationStateAnimateLottieCompositionAsState.getProgress() == 1.0f || (lottieAnimationStateAnimateLottieCompositionAsState.isAtEnd() && lottieAnimationStateAnimateLottieCompositionAsState.isPlaying()))) {
                        Unit unit3 = Unit.INSTANCE;
                        composer2.startReplaceGroup(5004770);
                        boolean z = (i3 & 896) == 256;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            unit = null;
                            objRememberedValue = new LadderFtuxContent2(function03, null);
                            composer2.updateRememberedValue(objRememberedValue);
                        } else {
                            unit = null;
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                    } else {
                        unit = null;
                    }
                    composer2.endReplaceGroup();
                    loopIntervalFrames = lottieAnimationSpec.getLoopIntervalFrames();
                    composer2.startReplaceGroup(1214987282);
                    if (loopIntervalFrames != null) {
                        unit2 = unit;
                    } else {
                        LoopingLottieAnimationWithInitialClip.LoopingLottieAnimationWithInitialClip(Modifier.INSTANCE, LadderFtuxContent$lambda$5$lambda$0(lottieCompositionResultRememberLottieComposition), contentScale, new LottieClipSpec.Progress(0.0f, 1.0f), new LottieClipSpec.Frame(Integer.valueOf(loopIntervalFrames.component1().intValue()), Integer.valueOf(loopIntervalFrames.component2().intValue()), false, 4, null), composer2, (LottieClipSpec.Progress.$stable << 9) | 6 | (LottieClipSpec.Frame.$stable << 12));
                        composer2 = composer2;
                        unit2 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1214986220);
                    if (unit2 == null) {
                        LottieComposition lottieCompositionLadderFtuxContent$lambda$5$lambda$0 = LadderFtuxContent$lambda$5$lambda$0(lottieCompositionResultRememberLottieComposition);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.ftux.LadderFtuxContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.getProgress());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Composer composer3 = composer2;
                        LottieAnimation2.LottieAnimation(lottieCompositionLadderFtuxContent$lambda$5$lambda$0, (Function0) objRememberedValue2, null, false, false, false, null, false, null, null, contentScale, false, false, null, null, false, composer3, 0, 0, 64508);
                        composer2 = composer3;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endMovableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function03;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.ftux.LadderFtuxContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderFtuxContent.LadderFtuxContent$lambda$6(ladderEducationContentData, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i3 & 147) != 146) {
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                bentoTheme = BentoTheme.INSTANCE;
                i5 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay()) {
                }
                composerStartRestartGroup.startMovableGroup(2101216299, url);
                LadderFtuxProgressState.LottieAnimationSpec lottieAnimationSpec2 = ladderEducationContentData.getLottieAnimationSpec();
                Alignment center2 = Alignment.INSTANCE.getCenter();
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null);
                Modifier modifier52 = modifier4;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    function03 = function02;
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(url.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(LadderFtuxContent$lambda$5$lambda$0(lottieCompositionResultRememberLottieComposition2), false, false, false, null, 0.0f, lottieAnimationSpec2.getLottieIterations(), null, false, false, composerStartRestartGroup, 0, 958);
                    composer2 = composerStartRestartGroup;
                    ContentScale contentScale2 = lottieAnimationSpec2.getContentScale();
                    composer2.startReplaceGroup(1214977051);
                    if (function03 == null) {
                        unit = null;
                        composer2.endReplaceGroup();
                        loopIntervalFrames = lottieAnimationSpec2.getLoopIntervalFrames();
                        composer2.startReplaceGroup(1214987282);
                        if (loopIntervalFrames != null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1214986220);
                        if (unit2 == null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endMovableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function03;
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final LottieComposition LadderFtuxContent$lambda$5$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}
