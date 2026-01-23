package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: Animatable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"negativeInfinityBounds1D", "Landroidx/compose/animation/core/AnimationVector1D;", "negativeInfinityBounds2D", "Landroidx/compose/animation/core/AnimationVector2D;", "negativeInfinityBounds3D", "Landroidx/compose/animation/core/AnimationVector3D;", "negativeInfinityBounds4D", "Landroidx/compose/animation/core/AnimationVector4D;", "positiveInfinityBounds1D", "positiveInfinityBounds2D", "positiveInfinityBounds3D", "positiveInfinityBounds4D", "Animatable", "Landroidx/compose/animation/core/Animatable;", "", "initialValue", "visibilityThreshold", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.animation.core.AnimatableKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Animatable2 {
    private static final AnimationVectors2 positiveInfinityBounds1D = AnimationVectors6.AnimationVector(Float.POSITIVE_INFINITY);
    private static final AnimationVectors3 positiveInfinityBounds2D = AnimationVectors6.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final AnimationVectors4 positiveInfinityBounds3D = AnimationVectors6.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final AnimationVectors5 positiveInfinityBounds4D = AnimationVectors6.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final AnimationVectors2 negativeInfinityBounds1D = AnimationVectors6.AnimationVector(Float.NEGATIVE_INFINITY);
    private static final AnimationVectors3 negativeInfinityBounds2D = AnimationVectors6.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final AnimationVectors4 negativeInfinityBounds3D = AnimationVectors6.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    private static final AnimationVectors5 negativeInfinityBounds4D = AnimationVectors6.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static /* synthetic */ Animatable Animatable$default(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return Animatable(f, f2);
    }

    public static final Animatable<Float, AnimationVectors2> Animatable(float f, float f2) {
        return new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(f2), null, 8, null);
    }
}
