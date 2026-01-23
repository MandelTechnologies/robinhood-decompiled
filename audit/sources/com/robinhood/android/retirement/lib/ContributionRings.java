package com.robinhood.android.retirement.lib;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: ContributionRings.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/retirement/lib/ContributionRingConstants;", "", "<init>", "()V", "OuterRingSetFrame", "", "InnerRingEasing", "Landroidx/compose/animation/core/Easing;", "getInnerRingEasing", "()Landroidx/compose/animation/core/Easing;", "InnerRingTweenSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "getInnerRingTweenSpec", "()Landroidx/compose/animation/core/TweenSpec;", "OuterRingSpec", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "getOuterRingSpec", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "ProgressRingSpec", "getProgressRingSpec", "()Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "lib-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.ContributionRingConstants, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionRings {
    public static final int $stable;
    public static final ContributionRings INSTANCE = new ContributionRings();
    private static final Easing InnerRingEasing;
    private static final TweenSpec<Float> InnerRingTweenSpec;
    public static final int OuterRingSetFrame = 27;
    private static final LottieCompositionSpec ProgressRingSpec;

    private ContributionRings() {
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.01f, 0.0f, 0.21f, 1.0f);
        InnerRingEasing = cubicBezierEasing;
        InnerRingTweenSpec = AnimationSpecKt.tween$default(1000, 0, cubicBezierEasing, 2, null);
        ProgressRingSpec = LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C27011R.raw.contribution_progress_ring_lottie));
        $stable = 8;
    }

    public final Easing getInnerRingEasing() {
        return InnerRingEasing;
    }

    public final TweenSpec<Float> getInnerRingTweenSpec() {
        return InnerRingTweenSpec;
    }

    @JvmName
    public final LottieCompositionSpec getOuterRingSpec(Composer composer, int i) {
        int i2;
        composer.startReplaceGroup(1673959715);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1673959715, i, -1, "com.robinhood.android.retirement.lib.ContributionRingConstants.<get-OuterRingSpec> (ContributionRings.kt:106)");
        }
        if (BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay()) {
            i2 = C27011R.raw.contribution_outer_ring_day_lottie;
        } else {
            i2 = C27011R.raw.contribution_outer_ring_night_lottie;
        }
        int iM9171constructorimpl = LottieCompositionSpec.RawRes.m9171constructorimpl(i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return LottieCompositionSpec.RawRes.m9170boximpl(iM9171constructorimpl);
    }

    public final LottieCompositionSpec getProgressRingSpec() {
        return ProgressRingSpec;
    }
}
