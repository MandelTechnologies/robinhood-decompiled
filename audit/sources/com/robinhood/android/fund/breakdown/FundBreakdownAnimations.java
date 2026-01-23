package com.robinhood.android.fund.breakdown;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FundBreakdownAnimations.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"ROW_ANIMATION_INITIAL_DELAY", "", "ROW_ANIMATION_DURATION", "", "ROW_ANIMATION_DELAY_BETWEEN_ROWS", "ROW_ANIMATION_OFFSET_Y", "ROW_ANIMATION_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getROW_ANIMATION_EASING", "()Landroidx/compose/animation/core/CubicBezierEasing;", "rememberRowEnterTransition", "Landroidx/compose/animation/EnterTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "feature-fund-breakdown_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.fund.breakdown.FundBreakdownAnimationsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FundBreakdownAnimations {
    public static final long ROW_ANIMATION_DELAY_BETWEEN_ROWS = 83;
    public static final int ROW_ANIMATION_DURATION = 333;
    private static final CubicBezierEasing ROW_ANIMATION_EASING = new CubicBezierEasing(0.02f, 0.0f, 0.1f, 1.0f);
    public static final long ROW_ANIMATION_INITIAL_DELAY = 667;
    public static final int ROW_ANIMATION_OFFSET_Y = 40;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rememberRowEnterTransition$lambda$2$lambda$1(int i, int i2) {
        return i;
    }

    public static final CubicBezierEasing getROW_ANIMATION_EASING() {
        return ROW_ANIMATION_EASING;
    }

    public static final EnterTransition rememberRowEnterTransition(Composer composer, int i) {
        composer.startReplaceGroup(1750432876);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1750432876, i, -1, "com.robinhood.android.fund.breakdown.rememberRowEnterTransition (FundBreakdownAnimations.kt:18)");
        }
        final int iMo5016toPx0680j_4 = (int) ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(40));
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(333, 0, ROW_ANIMATION_EASING, 2, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(iMo5016toPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.fund.breakdown.FundBreakdownAnimationsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(FundBreakdownAnimations.rememberRowEnterTransition$lambda$2$lambda$1(iMo5016toPx0680j_4, ((Integer) obj).intValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 6, null), 0.0f, 2, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return enterTransitionPlus;
    }
}
