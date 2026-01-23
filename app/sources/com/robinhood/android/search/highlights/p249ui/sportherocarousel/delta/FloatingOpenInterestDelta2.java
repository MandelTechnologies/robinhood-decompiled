package com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta;

import androidx.compose.animation.core.CubicBezierEasing;
import kotlin.Metadata;

/* compiled from: FloatingOpenInterestDelta.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"DELTA_EXIST_ON_SCREEN_TIME_IN_MILLS", "", "LINEAR_OUT_FAST_IN_RAMP_UP_EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "getLINEAR_OUT_FAST_IN_RAMP_UP_EASING", "()Landroidx/compose/animation/core/CubicBezierEasing;", "ALPHA_PROGRESS_BREAKPOINT", "ALPHA_PROGRESS_SECOND_HALF", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.delta.FloatingOpenInterestDeltaKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FloatingOpenInterestDelta2 {
    private static final float ALPHA_PROGRESS_BREAKPOINT = 0.3f;
    private static final float ALPHA_PROGRESS_SECOND_HALF = 0.7f;
    public static final float DELTA_EXIST_ON_SCREEN_TIME_IN_MILLS = 3000.0f;
    private static final CubicBezierEasing LINEAR_OUT_FAST_IN_RAMP_UP_EASING = new CubicBezierEasing(0.5f, 0.0f, 1.0f, 1.0f);

    public static final CubicBezierEasing getLINEAR_OUT_FAST_IN_RAMP_UP_EASING() {
        return LINEAR_OUT_FAST_IN_RAMP_UP_EASING;
    }
}
