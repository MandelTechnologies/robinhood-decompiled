package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;

/* compiled from: LadderAnimations.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"FADE_DURATION_MILLS", "", "LadderFadeInAnimation", "Landroidx/compose/animation/EnterTransition;", "getLadderFadeInAnimation", "()Landroidx/compose/animation/EnterTransition;", "LadderFadeOutAnimation", "Landroidx/compose/animation/ExitTransition;", "getLadderFadeOutAnimation", "()Landroidx/compose/animation/ExitTransition;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderAnimationsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderAnimations {
    private static final int FADE_DURATION_MILLS = 100;
    private static final EnterTransition LadderFadeInAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);
    private static final ExitTransition LadderFadeOutAnimation = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null);

    public static final EnterTransition getLadderFadeInAnimation() {
        return LadderFadeInAnimation;
    }

    public static final ExitTransition getLadderFadeOutAnimation() {
        return LadderFadeOutAnimation;
    }
}
