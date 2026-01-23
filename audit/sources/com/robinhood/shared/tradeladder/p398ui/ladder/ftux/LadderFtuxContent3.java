package com.robinhood.shared.tradeladder.p398ui.ladder.ftux;

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
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClip;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
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
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"LadderFtuxContent", "", "ladderEducationContentData", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationComplete", "Lkotlin/Function0;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-trade-ladder_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ftux.LadderFtuxContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderFtuxContent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderFtuxContent$lambda$0(GenericLadderFtuxProgressState genericLadderFtuxProgressState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        LadderFtuxContent(genericLadderFtuxProgressState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderFtuxContent$lambda$7(GenericLadderFtuxProgressState genericLadderFtuxProgressState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        LadderFtuxContent(genericLadderFtuxProgressState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderFtuxContent(final GenericLadderFtuxProgressState ladderEducationContentData, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        GenericLadderFtuxProgressState.LottieAnimationSpec lottieAnimationSpec;
        HttpUrl url;
        Unit unit;
        Unit unit2;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ladderEducationContentData, "ladderEducationContentData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-882684054);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ladderEducationContentData) : composerStartRestartGroup.changedInstance(ladderEducationContentData) ? 4 : 2) | i;
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
                i5 = i3;
                if ((i5 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    final Function0<Unit> function05 = i4 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-882684054, i5, -1, "com.robinhood.shared.tradeladder.ui.ladder.ftux.LadderFtuxContent (LadderFtuxContent.kt:23)");
                    }
                    lottieAnimationSpec = ladderEducationContentData.getLottieAnimationSpec();
                    if (lottieAnimationSpec != null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            final Modifier modifier5 = modifier4;
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ftux.LadderFtuxContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return LadderFtuxContent3.LadderFtuxContent$lambda$0(ladderEducationContentData, modifier5, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    Function0<Unit> function06 = function05;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    if (bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay()) {
                        url = lottieAnimationSpec.getDayThemeLottieUrl().getUrl();
                    } else {
                        url = lottieAnimationSpec.getNightThemeLottieUrl().getUrl();
                    }
                    composerStartRestartGroup.startMovableGroup(2144165601, url);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), null, 2, null);
                    Modifier modifier6 = modifier4;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(url.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(LadderFtuxContent$lambda$6$lambda$1(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, lottieAnimationSpec.getLottieIterations(), null, false, false, composerStartRestartGroup, 0, 958);
                    ContentScale contentScale = lottieAnimationSpec.getContentScale();
                    composerStartRestartGroup.startReplaceGroup(-142493534);
                    if (function06 != null) {
                        if ((lottieAnimationStateAnimateLottieCompositionAsState.getProgress() == 1.0f) || (lottieAnimationStateAnimateLottieCompositionAsState.isAtEnd() && lottieAnimationStateAnimateLottieCompositionAsState.isPlaying())) {
                            Unit unit3 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z = (i5 & 896) == 256;
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                unit = null;
                                objRememberedValue = new LadderFtuxContent4(function06, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                unit = null;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                        } else {
                            unit = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Tuples2<Integer, Integer> loopIntervalFrames = lottieAnimationSpec.getLoopIntervalFrames();
                        composerStartRestartGroup.startReplaceGroup(-142483303);
                        if (loopIntervalFrames == null) {
                            unit2 = unit;
                        } else {
                            LoopingLottieAnimationWithInitialClip.LoopingLottieAnimationWithInitialClip(Modifier.INSTANCE, LadderFtuxContent$lambda$6$lambda$1(lottieCompositionResultRememberLottieComposition), contentScale, new LottieClipSpec.Progress(0.0f, 1.0f), new LottieClipSpec.Frame(Integer.valueOf(loopIntervalFrames.component1().intValue()), Integer.valueOf(loopIntervalFrames.component2().intValue()), false, 4, null), composerStartRestartGroup, (LottieClipSpec.Progress.$stable << 9) | 6 | (LottieClipSpec.Frame.$stable << 12));
                            unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-142484365);
                        if (unit2 == null) {
                            LottieComposition lottieCompositionLadderFtuxContent$lambda$6$lambda$1 = LadderFtuxContent$lambda$6$lambda$1(lottieCompositionResultRememberLottieComposition);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ftux.LadderFtuxContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.getProgress());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = function06;
                            LottieAnimation2.LottieAnimation(lottieCompositionLadderFtuxContent$lambda$6$lambda$1, (Function0) objRememberedValue2, null, false, false, false, null, false, null, null, contentScale, false, false, null, null, false, composerStartRestartGroup, 0, 0, 64508);
                            composerStartRestartGroup = composerStartRestartGroup;
                        } else {
                            function03 = function06;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endMovableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function03;
                        modifier3 = modifier6;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.ftux.LadderFtuxContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderFtuxContent3.LadderFtuxContent$lambda$7(ladderEducationContentData, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            i5 = i3;
            if ((i5 & 147) != 146) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                lottieAnimationSpec = ladderEducationContentData.getLottieAnimationSpec();
                if (lottieAnimationSpec != null) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        i5 = i3;
        if ((i5 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final LottieComposition LadderFtuxContent$lambda$6$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}
