package androidx.compose.animation;

import kotlin.Metadata;

/* compiled from: FlingCalculator.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"", "friction", "density", "computeDeceleration", "(FF)F", "DecelerationRate", "F", "animation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.animation.FlingCalculatorKt, reason: use source file name */
/* loaded from: classes.dex */
public final class FlingCalculator2 {
    private static final float DecelerationRate = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeDeceleration(float f, float f2) {
        return f2 * 386.0878f * 160.0f * f;
    }
}
