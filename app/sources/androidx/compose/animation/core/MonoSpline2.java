package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: MonoSpline.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\n\u001a?\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"", "h", "x", "y1", "y2", "t1", "t2", "hermiteInterpolate", "(FFFFFF)F", "hermiteDifferential", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.animation.core.MonoSplineKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class MonoSpline2 {
    public static final float hermiteDifferential(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        float f8 = 2;
        return (f * ((f5 - ((f8 * f2) * ((f8 * f5) + f6))) + ((3 * (f5 + f6)) * f7))) - ((6 * (f2 - f7)) * (f3 - f4));
    }

    public static final float hermiteInterpolate(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        float f8 = f7 * f2;
        float f9 = 2;
        return ((((f5 * f) * ((f2 - (f9 * f7)) + f8)) + ((f * f6) * (f8 - f7))) + f3) - (((3 * f7) - (f9 * f8)) * (f3 - f4));
    }
}
