package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVectors;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VectorizedMonoSplineKeyframesSpec.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000bH\u0002J-\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J-\u0010+\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J%\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010.R\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006/"}, m3636d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "timestamps", "Landroidx/collection/IntList;", "keyframes", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "", "delayMillis", "periodicBias", "", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "getDelayMillis", "()I", "getDurationMillis", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "times", "", "valueVector", "values", "", "[[F", "velocityVector", "findEntryForTimeMillis", "timeMillis", "getEasedTimeFromIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getEasing", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVectors> implements VectorizedDurationBasedAnimationSpec<V> {
    private final int delayMillis;
    private final int durationMillis;
    private final IntObjectMap<Tuples2<V, Easing>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap<Tuples2<V, Easing>> intObjectMap, int i, int i2, float f) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i2;
        this.periodicBias = f;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectors6.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectors6.newInstance(initialVelocity);
            int i = this.timestamps._size;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.timestamps.get(i2) / 1000;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && Intrinsics.areEqual(this.lastInitialValue, initialValue) && Intrinsics.areEqual(this.lastTargetValue, targetValue)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.lastInitialValue, initialValue);
        boolean zAreEqual2 = Intrinsics.areEqual(this.lastTargetValue, targetValue);
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int size = initialValue.getSize();
        float[][] fArr3 = this.values;
        if (fArr3 == null) {
            int i3 = this.timestamps._size;
            fArr3 = new float[i3][];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = this.timestamps.get(i4);
                Tuples2<V, Easing> tuples2 = this.keyframes.get(i5);
                if (i5 == 0 && tuples2 == null) {
                    fArr = new float[size];
                    for (int i6 = 0; i6 < size; i6++) {
                        fArr[i6] = initialValue.get$animation_core_release(i6);
                    }
                } else if (i5 == getDurationMillis() && tuples2 == null) {
                    fArr = new float[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        fArr[i7] = targetValue.get$animation_core_release(i7);
                    }
                } else {
                    Intrinsics.checkNotNull(tuples2);
                    V first = tuples2.getFirst();
                    float[] fArr4 = new float[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        fArr4[i8] = first.get$animation_core_release(i8);
                    }
                    fArr = fArr4;
                }
                fArr3[i4] = fArr;
            }
            this.values = fArr3;
        } else {
            if (!zAreEqual && !this.keyframes.containsKey(0)) {
                int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr5 = new float[size];
                for (int i9 = 0; i9 < size; i9++) {
                    fArr5[i9] = initialValue.get$animation_core_release(i9);
                }
                fArr3[iBinarySearch$default] = fArr5;
            }
            if (!zAreEqual2 && !this.keyframes.containsKey(getDurationMillis())) {
                int iBinarySearch$default2 = IntList.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr6 = new float[size];
                for (int i10 = 0; i10 < size; i10++) {
                    fArr6[i10] = targetValue.get$animation_core_release(i10);
                }
                fArr3[iBinarySearch$default2] = fArr6;
            }
        }
        float[] fArr7 = this.times;
        if (fArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("times");
            fArr7 = null;
        }
        this.monoSpline = new MonoSpline(fArr7, fArr3, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        Tuples2<V, Easing> tuples2 = this.keyframes.get(iClampPlayTime);
        if (tuples2 != null) {
            return tuples2.getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v = this.valueVector;
        Intrinsics.checkNotNull(v);
        MonoSpline monoSpline = this.monoSpline;
        Intrinsics.checkNotNull(monoSpline);
        monoSpline.getPos(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v, iFindEntryForTimeMillis);
        return v;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        init(initialValue, targetValue, initialVelocity);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v = this.velocityVector;
        Intrinsics.checkNotNull(v);
        MonoSpline monoSpline = this.monoSpline;
        Intrinsics.checkNotNull(monoSpline);
        monoSpline.getSlope(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v, iFindEntryForTimeMillis);
        return v;
    }

    private final Easing getEasing(int index) {
        Easing second;
        Tuples2<V, Easing> tuples2 = this.keyframes.get(this.timestamps.get(index));
        return (tuples2 == null || (second = tuples2.getSecond()) == null) ? Easing3.getLinearEasing() : second;
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis) {
        float f;
        IntList intList = this.timestamps;
        if (index >= intList._size - 1) {
            f = timeMillis;
        } else {
            int i = intList.get(index);
            int i2 = this.timestamps.get(index + 1);
            if (timeMillis != i) {
                float f2 = i2 - i;
                return ((f2 * getEasing(index).transform((timeMillis - i) / f2)) + i) / 1000;
            }
            f = i;
        }
        return f / 1000;
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }
}
