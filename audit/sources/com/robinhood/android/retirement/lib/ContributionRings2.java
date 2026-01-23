package com.robinhood.android.retirement.lib;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContributionRings.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a)\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"ContributionOuterRing", "", "modifier", "Landroidx/compose/ui/Modifier;", "animate", "", "onRingSet", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SpinningRingsLoopStartFrame", "", "SpinningRingsAnimation", "playFromStart", "forceDay", "(ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "lib-retirement_externalDebug", "outerRingComposition", "Lcom/airbnb/lottie/LottieComposition;", "composition", "startFrame", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.lib.ContributionRingsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionRings2 {
    private static final int SpinningRingsLoopStartFrame = 209;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ContributionOuterRing$lambda$4$lambda$3(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionOuterRing$lambda$5(Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        ContributionOuterRing(modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinningRingsAnimation$lambda$14(boolean z, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        SpinningRingsAnimation(z, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionOuterRing(Modifier modifier, final boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        int i4;
        final Function0<Unit> function03;
        int i5;
        final float progress;
        boolean zChanged;
        Object objRememberedValue;
        float f;
        LottieComposition lottieCompositionContributionOuterRing$lambda$2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-188063961);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (i7 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function03 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-188063961, i4, -1, "com.robinhood.android.retirement.lib.ContributionOuterRing (ContributionRings.kt:32)");
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(ContributionRings.INSTANCE.getOuterRingSpec(composerStartRestartGroup, 0), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(-340831718);
                if (z) {
                    i5 = i4;
                    progress = 1.0f;
                } else {
                    i5 = i4;
                    LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(ContributionOuterRing$lambda$2(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, 0, null, false, false, composerStartRestartGroup, 0, 1022);
                    composerStartRestartGroup = composerStartRestartGroup;
                    progress = lottieAnimationStateAnimateLottieCompositionAsState.getProgress();
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieComposition lottieCompositionContributionOuterRing$lambda$22 = ContributionOuterRing$lambda$2(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(progress);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ContributionRings2.ContributionOuterRing$lambda$4$lambda$3(progress));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                f = progress;
                Composer composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                LottieAnimation2.LottieAnimation(lottieCompositionContributionOuterRing$lambda$22, (Function0) objRememberedValue, modifier5, false, false, false, null, false, null, null, null, false, false, null, null, false, composer2, (i5 << 6) & 896, 0, 65528);
                composerStartRestartGroup = composer2;
                lottieCompositionContributionOuterRing$lambda$2 = ContributionOuterRing$lambda$2(lottieCompositionResultRememberLottieComposition);
                if ((lottieCompositionContributionOuterRing$lambda$2 == null ? lottieCompositionContributionOuterRing$lambda$2.getFrameForProgress(f) : 0.0f) > 27.0f) {
                    EffectsKt.SideEffect(function03, composerStartRestartGroup, (i5 >> 6) & 14);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function03 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionRings2.ContributionOuterRing$lambda$5(modifier3, z, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        function02 = function0;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(ContributionRings.INSTANCE.getOuterRingSpec(composerStartRestartGroup, 0), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            composerStartRestartGroup.startReplaceGroup(-340831718);
            if (z) {
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieComposition lottieCompositionContributionOuterRing$lambda$222 = ContributionOuterRing$lambda$2(lottieCompositionResultRememberLottieComposition2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(progress);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ContributionRings2.ContributionOuterRing$lambda$4$lambda$3(progress));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                f = progress;
                Composer composer22 = composerStartRestartGroup;
                Modifier modifier52 = modifier4;
                LottieAnimation2.LottieAnimation(lottieCompositionContributionOuterRing$lambda$222, (Function0) objRememberedValue, modifier52, false, false, false, null, false, null, null, null, false, false, null, null, false, composer22, (i5 << 6) & 896, 0, 65528);
                composerStartRestartGroup = composer22;
                lottieCompositionContributionOuterRing$lambda$2 = ContributionOuterRing$lambda$2(lottieCompositionResultRememberLottieComposition2);
                if ((lottieCompositionContributionOuterRing$lambda$2 == null ? lottieCompositionContributionOuterRing$lambda$2.getFrameForProgress(f) : 0.0f) > 27.0f) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpinningRingsAnimation(final boolean z, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Object objRememberedValue;
        Composer.Companion companion;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        boolean zChanged;
        Object objRememberedValue2;
        LottieComposition lottieCompositionSpinningRingsAnimation$lambda$6;
        final Modifier modifier3;
        final boolean z4;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(971400743);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z3;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 == 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(971400743, i3, -1, "com.robinhood.android.retirement.lib.SpinningRingsAnimation (ContributionRings.kt:57)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1508218570);
                    boolean z6 = !z5 || BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                    composerStartRestartGroup.endReplaceGroup();
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(!z6 ? C27011R.raw.unfunded_ring_day_lottie : C27011R.raw.unfunded_ring_night_lottie)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(z ? 0 : 209);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(SpinningRingsAnimation$lambda$6(lottieCompositionResultRememberLottieComposition), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(snapshotIntState2.getIntValue()), null, false, 6, null), 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, (LottieClipSpec.Frame.$stable << 12) | 1572864, 942);
                    LottieComposition lottieCompositionSpinningRingsAnimation$lambda$62 = SpinningRingsAnimation$lambda$6(lottieCompositionResultRememberLottieComposition);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ContributionRings2.SpinningRingsAnimation$lambda$10(lottieAnimationStateAnimateLottieCompositionAsState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    LottieAnimation2.LottieAnimation(lottieCompositionSpinningRingsAnimation$lambda$62, (Function0) objRememberedValue2, modifier5, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, (i3 << 3) & 896, 0, 65528);
                    composerStartRestartGroup = composerStartRestartGroup;
                    lottieCompositionSpinningRingsAnimation$lambda$6 = SpinningRingsAnimation$lambda$6(lottieCompositionResultRememberLottieComposition);
                    if ((lottieCompositionSpinningRingsAnimation$lambda$6 == null ? lottieCompositionSpinningRingsAnimation$lambda$6.getFrameForProgress(SpinningRingsAnimation$lambda$10(lottieAnimationStateAnimateLottieCompositionAsState)) : 0.0f) > 209.0f && snapshotIntState2.getIntValue() == 0) {
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new ContributionRings3(snapshotIntState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z4 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContributionRings2.SpinningRingsAnimation$lambda$14(z, modifier3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            z3 = z2;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1508218570);
                if (z5) {
                    composerStartRestartGroup.endReplaceGroup();
                    LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(!z6 ? C27011R.raw.unfunded_ring_day_lottie : C27011R.raw.unfunded_ring_night_lottie)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(SpinningRingsAnimation$lambda$6(lottieCompositionResultRememberLottieComposition2), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(snapshotIntState22.getIntValue()), null, false, 6, null), 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, (LottieClipSpec.Frame.$stable << 12) | 1572864, 942);
                    LottieComposition lottieCompositionSpinningRingsAnimation$lambda$622 = SpinningRingsAnimation$lambda$6(lottieCompositionResultRememberLottieComposition2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.lib.ContributionRingsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(ContributionRings2.SpinningRingsAnimation$lambda$10(lottieAnimationStateAnimateLottieCompositionAsState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        LottieAnimation2.LottieAnimation(lottieCompositionSpinningRingsAnimation$lambda$622, (Function0) objRememberedValue2, modifier52, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, (i3 << 3) & 896, 0, 65528);
                        composerStartRestartGroup = composerStartRestartGroup;
                        lottieCompositionSpinningRingsAnimation$lambda$6 = SpinningRingsAnimation$lambda$6(lottieCompositionResultRememberLottieComposition2);
                        if ((lottieCompositionSpinningRingsAnimation$lambda$6 == null ? lottieCompositionSpinningRingsAnimation$lambda$6.getFrameForProgress(SpinningRingsAnimation$lambda$10(lottieAnimationStateAnimateLottieCompositionAsState)) : 0.0f) > 209.0f) {
                            Unit unit2 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z4 = z5;
                    }
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
        z3 = z2;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final LottieComposition ContributionOuterRing$lambda$2(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SpinningRingsAnimation$lambda$10(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition SpinningRingsAnimation$lambda$6(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}
