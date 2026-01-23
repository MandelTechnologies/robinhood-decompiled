package com.robinhood.android.retirement.contributions;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Scale2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.retirement.lib.ContributionRings;
import com.robinhood.android.retirement.lib.ContributionRings2;
import com.robinhood.android.retirement.lib.MatchPill;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContributionProgressRing.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\u001a)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002"}, m3636d2 = {"MinRingHeight", "Landroidx/compose/ui/unit/Dp;", "F", "ContributionProgressRing", "", "state", "Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "maxHeight", "modifier", "Landroidx/compose/ui/Modifier;", "ContributionProgressRing-uFdPcIQ", "(Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-contributions_externalDebug", "innerRingComposition", "Lcom/airbnb/lottie/LottieComposition;", "innerRingProgress", "", "previousInput", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.contributions.ContributionProgressRingKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionProgressRing {
    private static final float MinRingHeight = C2002Dp.m7995constructorimpl(200);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$14 */
    public static final int m2426x41bc8d61(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$15 */
    public static final int m2427x41bc8d62(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$16 */
    public static final int m2428x41bc8d63(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17 */
    public static final int m2429x41bc8d64(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionProgressRing_uFdPcIQ$lambda$23(ContributionProgressRingState contributionProgressRingState, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m18111ContributionProgressRinguFdPcIQ(contributionProgressRingState, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /* renamed from: ContributionProgressRing-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18111ContributionProgressRinguFdPcIQ(final ContributionProgressRingState state, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue3;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue4;
        boolean z2;
        Object objRememberedValue5;
        Composer composer2;
        final String matchAmount;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1436870849);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1436870849, i3, -1, "com.robinhood.android.retirement.contributions.ContributionProgressRing (ContributionProgressRing.kt:61)");
                }
                ContributionRings contributionRings = ContributionRings.INSTANCE;
                Modifier modifier5 = modifier4;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(contributionRings.getProgressRingSpec(), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(state.getCurrentPercent(), contributionRings.getInnerRingTweenSpec(), 0.0f, "inner_ring_progress", null, composerStartRestartGroup, 3072, 20);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i5 = i3 & 14;
                z = i5 != 4;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ContributionProgressRing2(state, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5);
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5158heightInVpY3zN4$default(modifier5, 0.0f, ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(f), C2002Dp.m7993boximpl(MinRingHeight))).getValue(), 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 1.0f, false, 2, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                ContributionRings2.ContributionOuterRing(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), false, null, composerStartRestartGroup, 54, 4);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                LottieComposition lottieCompositionContributionProgressRing_uFdPcIQ$lambda$0 = ContributionProgressRing_uFdPcIQ$lambda$0(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ContributionProgressRing.ContributionProgressRing_uFdPcIQ$lambda$1(snapshotState4AnimateFloatAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionContributionProgressRing_uFdPcIQ$lambda$0, (Function0) objRememberedValue3, modifierFillMaxSize$default, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 384, 0, 65528);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
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
                Modifier modifierScale = Scale2.scale(SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(45)), 0.4f);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ContributionProgressRing.m2423x2282671b((Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1 = (Function1) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = i5 != 4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ContributionProgressRing.m2424xec7893c2(state, snapshotState, (TickerInputView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function1, modifierScale, (Function1) objRememberedValue5, composerStartRestartGroup, 54, 0);
                composer2 = composerStartRestartGroup;
                matchAmount = state.getMatchAmount();
                composer2.startReplaceGroup(-880226081);
                if (matchAmount != null) {
                    ApiRetirementMatchResponse3 matchType = state.getMatchType();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ContributionProgressRing.m2425xc7dcbf25((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceGroup();
                    AnimatedContentKt.AnimatedContent(matchType, null, (Function1) objRememberedValue6, null, "gold_match_pill_sliding", null, ComposableLambda3.rememberComposableLambda(845427088, true, new Function4<AnimatedContentScope, ApiRetirementMatchResponse3, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$ContributionProgressRing$2$2$3$2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, Composer composer3, Integer num) {
                            invoke(animatedContentScope, apiRetirementMatchResponse3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, ApiRetirementMatchResponse3 matchType2, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            Intrinsics.checkNotNullParameter(matchType2, "matchType");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(845427088, i6, -1, "com.robinhood.android.retirement.contributions.ContributionProgressRing.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContributionProgressRing.kt:141)");
                            }
                            MatchPill.MatchPill(StringResources_androidKt.stringResource(C26981R.string.match_amount, new Object[]{matchAmount}, composer3, 0), matchType2, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(4), 0.0f, 2, null), composer3, (i6 & 112) | 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 1597824, 42);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionProgressRing.ContributionProgressRing_uFdPcIQ$lambda$23(state, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ContributionRings contributionRings2 = ContributionRings.INSTANCE;
            Modifier modifier52 = modifier4;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(contributionRings2.getProgressRingSpec(), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(state.getCurrentPercent(), contributionRings2.getInnerRingTweenSpec(), 0.0f, "inner_ring_progress", null, composerStartRestartGroup, 3072, 20);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i52 = i3 & 14;
            if (i52 != 4) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue2 = new ContributionProgressRing2(state, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i52);
                Modifier modifierAspectRatio$default2 = AspectRatio3.aspectRatio$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5158heightInVpY3zN4$default(modifier52, 0.0f, ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(f), C2002Dp.m7993boximpl(MinRingHeight))).getValue(), 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 1.0f, false, 2, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
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
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    ContributionRings2.ContributionOuterRing(SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null), false, null, composerStartRestartGroup, 54, 4);
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                    LottieComposition lottieCompositionContributionProgressRing_uFdPcIQ$lambda$02 = ContributionProgressRing_uFdPcIQ$lambda$0(lottieCompositionResultRememberLottieComposition2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ContributionProgressRing.ContributionProgressRing_uFdPcIQ$lambda$1(snapshotState4AnimateFloatAsState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        LottieAnimation2.LottieAnimation(lottieCompositionContributionProgressRing_uFdPcIQ$lambda$02, (Function0) objRememberedValue3, modifierFillMaxSize$default2, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 384, 0, 65528);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
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
                            Modifier modifierScale2 = Scale2.scale(SizeKt.m5156height3ABfNKs(companion42, C2002Dp.m7995constructorimpl(45)), 0.4f);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            Function1 function12 = (Function1) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            if (i52 != 4) {
                            }
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ContributionProgressRing.m2424xec7893c2(state, snapshotState, (TickerInputView) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                AndroidView_androidKt.AndroidView(function12, modifierScale2, (Function1) objRememberedValue5, composerStartRestartGroup, 54, 0);
                                composer2 = composerStartRestartGroup;
                                matchAmount = state.getMatchAmount();
                                composer2.startReplaceGroup(-880226081);
                                if (matchAmount != null) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition ContributionProgressRing_uFdPcIQ$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContributionProgressRing_uFdPcIQ$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final String ContributionProgressRing_uFdPcIQ$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$10$lambda$9 */
    public static final TickerInputView m2423x2282671b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TickerInputView tickerInputView = new TickerInputView(context, null, 0, 0.0f, 0, 30, null);
        tickerInputView.setUseLegacyTextSizingAndLayout(false);
        tickerInputView.setClipToOutline(true);
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium));
        return tickerInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$13$lambda$12 */
    public static final Unit m2424xec7893c2(ContributionProgressRingState contributionProgressRingState, SnapshotState snapshotState, TickerInputView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        if (ContributionProgressRing_uFdPcIQ$lambda$3(snapshotState) != null && !Intrinsics.areEqual(ContributionProgressRing_uFdPcIQ$lambda$3(snapshotState), contributionProgressRingState.getInputChars())) {
            char[] charArray = contributionProgressRingState.getInputChars().toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            view.transitionTo(charArray);
        } else {
            char[] charArray2 = contributionProgressRingState.getInputChars().toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
            view.setValue(charArray2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ContributionProgressRing_uFdPcIQ$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18 */
    public static final ContentTransform m2425xc7dcbf25(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (AnimatedContent.getTargetState() == ApiRetirementMatchResponse3.GOLD) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ContributionProgressRing.m2426x41bc8d61(((Integer) obj).intValue()));
                }
            }, 1, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ContributionProgressRing.m2427x41bc8d62(((Integer) obj).intValue()));
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ContributionProgressRing.m2428x41bc8d63(((Integer) obj).intValue()));
            }
        }, 1, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.retirement.contributions.ContributionProgressRingKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ContributionProgressRing.m2429x41bc8d64(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
    }
}
