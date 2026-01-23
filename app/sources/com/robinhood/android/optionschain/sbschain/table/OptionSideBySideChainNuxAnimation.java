package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainNuxAnimation.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainNuxAnimation", "", "onNuxExitAnimationFinished", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-options-chain_externalDebug", "cellWidthToNumOfCellsCanHoldOneSide", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Dp;", "", "startAnimation", "", "leftComposition", "Lcom/airbnb/lottie/LottieComposition;", "rightComposition", "composition"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainNuxAnimation {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainNuxAnimation$lambda$28(Function0 function0, int i, Composer composer, int i2) {
        OptionSideBySideChainNuxAnimation(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionSideBySideChainNuxAnimation(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Object obj;
        Object obj2;
        final Function0<Unit> onNuxExitAnimationFinished = function0;
        Intrinsics.checkNotNullParameter(onNuxExitAnimationFinished, "onNuxExitAnimationFinished");
        Composer composerStartRestartGroup = composer.startRestartGroup(-310511180);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onNuxExitAnimationFinished) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310511180, i2, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimation (OptionSideBySideChainNuxAnimation.kt:32)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final int iMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32);
            boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainNuxAnimation.OptionSideBySideChainNuxAnimation$lambda$4$lambda$3(density, iMo7449getContainerSizeYbymL2g);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Tuples2<C2002Dp, Integer> tuples2OptionSideBySideChainNuxAnimation$lambda$5 = OptionSideBySideChainNuxAnimation$lambda$5((SnapshotState4) objRememberedValue);
            float value = tuples2OptionSideBySideChainNuxAnimation$lambda$5.component1().getValue();
            int iIntValue = tuples2OptionSideBySideChainNuxAnimation$lambda$5.component2().intValue();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OptionSideBySideChainNuxAnimation2(snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (iIntValue > 2) {
                composerStartRestartGroup.startReplaceGroup(-508165688);
                int i3 = isDay ? C24135R.raw.side_by_side_nux_unfolded_left_light_lottie : C24135R.raw.side_by_side_nux_unfolded_left_dark_lottie;
                int i4 = isDay ? C24135R.raw.side_by_side_nux_unfolded_right_light_lottie : C24135R.raw.side_by_side_nux_unfolded_right_dark_lottie;
                Modifier modifierWrapContentSize = SizeKt.wrapContentSize(companion2, companion3.getCenterStart(), true);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = OptionSideBySideChainNuxAnimation3.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierWrapContentSize, unit, (PointerInputEventHandler) objRememberedValue4);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i3)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(OptionSideBySideChainNuxAnimation$lambda$27$lambda$15$lambda$11(lottieCompositionResultRememberLottieComposition), OptionSideBySideChainNuxAnimation$lambda$7(snapshotState), false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, 1572864, 956);
                Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.isPlaying());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | ((i2 & 14) == 4);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                    obj2 = null;
                    objRememberedValue5 = new OptionSideBySideChainNuxAnimation4(lottieAnimationStateAnimateLottieCompositionAsState, onNuxExitAnimationFinished, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    obj2 = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj2);
                ContentScale.Companion companion5 = ContentScale.INSTANCE;
                ContentScale fit = companion5.getFit();
                LottieComposition lottieCompositionOptionSideBySideChainNuxAnimation$lambda$27$lambda$15$lambda$11 = OptionSideBySideChainNuxAnimation$lambda$27$lambda$15$lambda$11(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged2 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.getProgress());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionOptionSideBySideChainNuxAnimation$lambda$27$lambda$15$lambda$11, (Function0) objRememberedValue6, modifierFillMaxSize$default, false, false, false, null, false, null, null, fit, false, false, null, null, false, composerStartRestartGroup, 384, 6, 64504);
                composerStartRestartGroup.endNode();
                Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.wrapContentSize(companion2, companion3.getCenterStart(), true), C2002Dp.m7995constructorimpl(value * iIntValue), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = OptionSideBySideChainNuxAnimation5.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierM5125offsetVpY3zN4$default, unit, (PointerInputEventHandler) objRememberedValue7);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i4)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(OptionSideBySideChainNuxAnimation$lambda$27$lambda$20$lambda$17(lottieCompositionResultRememberLottieComposition2), OptionSideBySideChainNuxAnimation$lambda$7(snapshotState), false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, 1572864, 956);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                ContentScale fit2 = companion5.getFit();
                LottieComposition lottieCompositionOptionSideBySideChainNuxAnimation$lambda$27$lambda$20$lambda$17 = OptionSideBySideChainNuxAnimation$lambda$27$lambda$20$lambda$17(lottieCompositionResultRememberLottieComposition2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged3 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState2);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState2.getProgress());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionOptionSideBySideChainNuxAnimation$lambda$27$lambda$20$lambda$17, (Function0) objRememberedValue8, modifierFillMaxSize$default2, false, false, false, null, false, null, null, fit2, false, false, null, null, false, composerStartRestartGroup, 384, 6, 64504);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                onNuxExitAnimationFinished = function0;
            } else {
                int i5 = i2;
                composerStartRestartGroup.startReplaceGroup(-505524767);
                Modifier modifierWrapContentHeight = SizeKt.wrapContentHeight(companion2, companion3.getCenterVertically(), true);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = OptionSideBySideChainNuxAnimation6.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput3 = SuspendingPointerInputFilterKt.pointerInput(modifierWrapContentHeight, unit, (PointerInputEventHandler) objRememberedValue9);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput3);
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                LottieCompositionResult lottieCompositionResultRememberLottieComposition3 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(isDay ? C24135R.raw.side_by_side_nux_light_lottie : C24135R.raw.side_by_side_nux_dark_lottie)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState3 = animateLottieCompositionAsState.animateLottieCompositionAsState(OptionSideBySideChainNuxAnimation$lambda$27$lambda$26$lambda$22(lottieCompositionResultRememberLottieComposition3), OptionSideBySideChainNuxAnimation$lambda$7(snapshotState), false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, 1572864, 956);
                Boolean boolValueOf2 = Boolean.valueOf(lottieAnimationStateAnimateLottieCompositionAsState3.isPlaying());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged4 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState3) | ((i5 & 14) == 4);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue10 == companion.getEmpty()) {
                    obj = null;
                    onNuxExitAnimationFinished = function0;
                    objRememberedValue10 = new OptionSideBySideChainNuxAnimation7(lottieAnimationStateAnimateLottieCompositionAsState3, onNuxExitAnimationFinished, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    obj = null;
                    onNuxExitAnimationFinished = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj);
                ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                LottieComposition lottieCompositionOptionSideBySideChainNuxAnimation$lambda$27$lambda$26$lambda$22 = OptionSideBySideChainNuxAnimation$lambda$27$lambda$26$lambda$22(lottieCompositionResultRememberLottieComposition3);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged5 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState3);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged5 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState3.getProgress());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionOptionSideBySideChainNuxAnimation$lambda$27$lambda$26$lambda$22, (Function0) objRememberedValue11, modifierFillMaxSize$default3, false, false, false, null, false, null, null, fillWidth, false, false, null, null, false, composerStartRestartGroup, 384, 6, 64504);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainNuxAnimationKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return OptionSideBySideChainNuxAnimation.OptionSideBySideChainNuxAnimation$lambda$28(onNuxExitAnimationFinished, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 OptionSideBySideChainNuxAnimation$lambda$4$lambda$3(Density density, int i) {
        float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(TableConstants.getTargetTableCellWidthDp());
        float fMo5016toPx0680j_42 = (i - density.mo5016toPx0680j_4(TableConstants.getStrikeCellWidthDp())) * 0.5f;
        int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (fMo5016toPx0680j_42 / fMo5016toPx0680j_4), 2);
        return Tuples4.m3642to(C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (fMo5016toPx0680j_42 / iCoerceAtLeast))), Integer.valueOf(iCoerceAtLeast));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionSideBySideChainNuxAnimation$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final LottieComposition OptionSideBySideChainNuxAnimation$lambda$27$lambda$15$lambda$11(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition OptionSideBySideChainNuxAnimation$lambda$27$lambda$20$lambda$17(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition OptionSideBySideChainNuxAnimation$lambda$27$lambda$26$lambda$22(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final Tuples2<C2002Dp, Integer> OptionSideBySideChainNuxAnimation$lambda$5(SnapshotState4<Tuples2<C2002Dp, Integer>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean OptionSideBySideChainNuxAnimation$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
