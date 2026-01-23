package com.robinhood.android.common.util;

import android.animation.TimeInterpolator;
import kotlin.Metadata;

/* compiled from: ExponentialDecayBounceInterpolator.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/ExponentialDecayBounceInterpolator;", "Landroid/animation/TimeInterpolator;", "amplification", "", "decayRate", "bounceCount", "", "<init>", "(FFI)V", "getInterpolation", "input", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ExponentialDecayBounceInterpolator implements TimeInterpolator {
    public static final int $stable = 0;
    private final float amplification;
    private final int bounceCount;
    private final float decayRate;

    public ExponentialDecayBounceInterpolator(float f, float f2, int i) {
        this.amplification = f;
        this.decayRate = f2;
        this.bounceCount = i;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        return (float) (this.amplification * ((float) Math.exp((-1) * this.decayRate * input)) * Math.abs(Math.sin(this.bounceCount * input * 3.141592653589793d)));
    }
}
