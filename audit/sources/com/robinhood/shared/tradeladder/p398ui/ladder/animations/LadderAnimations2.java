package com.robinhood.shared.tradeladder.p398ui.ladder.animations;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;

/* compiled from: LadderAnimations.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"FADE_DURATION_MILLS", "", "LadderFadeInAnimation", "Landroidx/compose/animation/EnterTransition;", "getLadderFadeInAnimation", "()Landroidx/compose/animation/EnterTransition;", "LadderFadeOutAnimation", "Landroidx/compose/animation/ExitTransition;", "getLadderFadeOutAnimation", "()Landroidx/compose/animation/ExitTransition;", "LADDER_COMPONENTS_ENTRY_DELAY_IN_MILLIS", "LADDER_COMPONENTS_ENTRY_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getLADDER_COMPONENTS_ENTRY_EASING", "()Landroidx/compose/animation/core/CubicBezierEasing;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.animations.LadderAnimationsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderAnimations2 {
    private static final int FADE_DURATION_MILLS = 100;
    public static final int LADDER_COMPONENTS_ENTRY_DELAY_IN_MILLIS = 333;
    private static final EnterTransition LadderFadeInAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);
    private static final ExitTransition LadderFadeOutAnimation = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);
    private static final CubicBezierEasing LADDER_COMPONENTS_ENTRY_EASING = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);

    public static final EnterTransition getLadderFadeInAnimation() {
        return LadderFadeInAnimation;
    }

    public static final ExitTransition getLadderFadeOutAnimation() {
        return LadderFadeOutAnimation;
    }

    public static final CubicBezierEasing getLADDER_COMPONENTS_ENTRY_EASING() {
        return LADDER_COMPONENTS_ENTRY_EASING;
    }
}
