package com.robinhood.android.support.call.textanimator;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: TimingInterpolator.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/TimingInterpolator;", "", "<init>", "()V", "getInterpolation", "", "fraction", "startDelayFraction", "durationFraction", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TimingInterpolator {
    public static final int $stable = 0;
    public static final TimingInterpolator INSTANCE = new TimingInterpolator();

    private TimingInterpolator() {
    }

    public final float getInterpolation(float fraction, float startDelayFraction, float durationFraction) {
        if (startDelayFraction + durationFraction > 1.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return RangesKt.coerceIn((fraction - startDelayFraction) / durationFraction, 0.0f, 1.0f);
    }
}
