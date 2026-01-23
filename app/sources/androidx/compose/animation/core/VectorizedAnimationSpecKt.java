package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "playTimeMillis", "start", "end", "startVelocity", "getValueFromMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "playTime", "clampPlayTime", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Landroidx/compose/animation/core/Animations;", "createSpringAnimations", "(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;", "", "EmptyIntArray", "[I", "", "EmptyFloatArray", "[F", "Landroidx/compose/animation/core/ArcSpline;", "EmptyArcSpline", "Landroidx/compose/animation/core/ArcSpline;", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int[] EmptyIntArray = new int[0];
    private static final float[] EmptyFloatArray = new float[0];
    private static final ArcSpline EmptyArcSpline = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final <V extends AnimationVectors> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j, V v, V v2, V v3) {
        return (V) vectorizedAnimationSpec.getValueFromNanos(j * 1000000, v, v2, v3);
    }

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j) {
        long delayMillis = j - vectorizedDurationBasedAnimationSpec.getDelayMillis();
        long durationMillis = vectorizedDurationBasedAnimationSpec.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AnimationVectors> Animations createSpringAnimations(V v, float f, float f2) {
        if (v != null) {
            return new Animations(v, f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.1
                private final FloatAnimationSpec2[] anims;

                /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
                {
                    int size = v.getSize();
                    FloatAnimationSpec2[] floatAnimationSpec2Arr = new FloatAnimationSpec2[size];
                    for (int i = 0; i < size; i++) {
                        floatAnimationSpec2Arr[i] = new FloatAnimationSpec2(f, f2, v.get$animation_core_release(i));
                    }
                    this.anims = floatAnimationSpec2Arr;
                }

                @Override // androidx.compose.animation.core.Animations
                public FloatAnimationSpec2 get(int index) {
                    return this.anims[index];
                }
            };
        }
        return new Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.2
            private final FloatAnimationSpec2 anim;

            {
                this.anim = new FloatAnimationSpec2(f, f2, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec2 get(int index) {
                return this.anim;
            }
        };
    }
}
