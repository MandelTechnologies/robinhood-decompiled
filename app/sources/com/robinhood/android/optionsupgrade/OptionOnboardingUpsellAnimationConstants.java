package com.robinhood.android.optionsupgrade;

import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;

/* compiled from: OptionOnboardingUpsellAnimationConstants.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"UPSELL_ANIMATION_DURATION", "", "UPSELL_ANIMATED_PROPS_COUNT", "UPSELL_CTA_ANIMATION_DELAY", "upsellAnimationEasingCurve", "Landroidx/compose/animation/core/CubicBezierEasing;", "getUpsellAnimationEasingCurve", "()Landroidx/compose/animation/core/CubicBezierEasing;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAnimationConstantsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellAnimationConstants {
    public static final int UPSELL_ANIMATED_PROPS_COUNT = 3;
    public static final int UPSELL_ANIMATION_DURATION = 750;
    public static final int UPSELL_CTA_ANIMATION_DELAY = 2250;
    private static final CubicBezierEasing upsellAnimationEasingCurve = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    public static final CubicBezierEasing getUpsellAnimationEasingCurve() {
        return upsellAnimationEasingCurve;
    }
}
