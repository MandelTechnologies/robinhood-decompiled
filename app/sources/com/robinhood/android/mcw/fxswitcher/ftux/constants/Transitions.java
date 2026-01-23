package com.robinhood.android.mcw.fxswitcher.ftux.constants;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.p011ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Transitions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"CurrencySwapTransition", "Landroidx/compose/animation/ContentTransform;", "getCurrencySwapTransition", "()Landroidx/compose/animation/ContentTransform;", "CurrencySwapSizeTransform", "Landroidx/compose/animation/SizeTransform;", "getCurrencySwapSizeTransform", "()Landroidx/compose/animation/SizeTransform;", "lib-fx-switcher-ftux-constants_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.fxswitcher.ftux.constants.TransitionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Transitions {
    private static final SizeTransform CurrencySwapSizeTransform;
    private static final ContentTransform CurrencySwapTransition;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CurrencySwapTransition$lambda$1(int i) {
        return -i;
    }

    public static final ContentTransform getCurrencySwapTransition() {
        return CurrencySwapTransition;
    }

    static {
        BezierControlPoints introCurveSpec = FxSwitcherAnimationConstants.INSTANCE.getIntroCurveSpec();
        CurrencySwapTransition = new ContentTransform(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween(600, 225, new CubicBezierEasing(introCurveSpec.getA(), introCurveSpec.getB(), introCurveSpec.getC(), introCurveSpec.getD())), new Function1() { // from class: com.robinhood.android.mcw.fxswitcher.ftux.constants.TransitionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(Transitions.CurrencySwapTransition$lambda$1(((Integer) obj).intValue()));
            }
        }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 225, null, 5, null), 0.0f, 2, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, Easing3.getLinearEasing(), 2, null), 0.0f, 2, null), 0.0f, null, 12, null);
        CurrencySwapSizeTransform = AnimatedContentKt.SizeTransform$default(false, new Function2() { // from class: com.robinhood.android.mcw.fxswitcher.ftux.constants.TransitionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Transitions.CurrencySwapSizeTransform$lambda$3((IntSize) obj, (IntSize) obj2);
            }
        }, 1, null);
    }

    public static final SizeTransform getCurrencySwapSizeTransform() {
        return CurrencySwapSizeTransform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec CurrencySwapSizeTransform$lambda$3(final IntSize intSize, final IntSize intSize2) {
        return AnimationSpecKt.keyframes(new Function1() { // from class: com.robinhood.android.mcw.fxswitcher.ftux.constants.TransitionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Transitions.CurrencySwapSizeTransform$lambda$3$lambda$2(intSize, intSize2, (KeyframesSpec.KeyframesSpecConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencySwapSizeTransform$lambda$3$lambda$2(IntSize intSize, IntSize intSize2, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) IntSize.m8055boximpl(IntSize.m8056constructorimpl((((int) (intSize2.getPackedValue() & 4294967295L)) & 4294967295L) | (Math.max((int) (intSize.getPackedValue() >> 32), (int) (intSize2.getPackedValue() >> 32)) << 32))), 300);
        return Unit.INSTANCE;
    }
}
