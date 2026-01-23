package androidx.compose.animation.core;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MonoSpline.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", "time", "", "y", "", "periodicBias", "<init>", "([F[[FF)V", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "makeFloatArray", "(II)[[F", "v", "", "getSlope", "(F[F)V", "Landroidx/compose/animation/core/AnimationVector;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getPos", "(FLandroidx/compose/animation/core/AnimationVector;I)V", "timePoints", "[F", "values", "[[F", "tangents", "slopeTemp", "animation-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MonoSpline {
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    public MonoSpline(float[] fArr, float[][] fArr2, float f) {
        int i;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i3 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i3, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i4 = 0; i4 < length2; i4++) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                float f2 = fArr[i6] - fArr[i5];
                float[] fArr3 = fArrMakeFloatArray[i5];
                float f3 = (fArr2[i6][i4] - fArr2[i5][i4]) / f2;
                fArr3[i4] = f3;
                if (i5 == 0) {
                    fArrMakeFloatArray2[i5][i4] = f3;
                } else {
                    fArrMakeFloatArray2[i5][i4] = (fArrMakeFloatArray[i5 - 1][i4] + f3) * 0.5f;
                }
                i5 = i6;
            }
            fArrMakeFloatArray2[i3][i4] = fArrMakeFloatArray[length - 2][i4];
        }
        if (!Float.isNaN(f)) {
            for (int i7 = 0; i7 < length2; i7++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f4 = fArr4[i7] * (1 - f);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f5 = f4 + (fArr5[i7] * f);
                fArr5[i7] = f5;
                fArr4[i7] = f5;
                fArrMakeFloatArray2[i3][i7] = f5;
                fArrMakeFloatArray2[0][i7] = f5;
            }
        }
        int i8 = 0;
        while (i8 < i3) {
            int i9 = i2;
            while (i9 < length2) {
                float f6 = fArrMakeFloatArray[i8][i9];
                if (f6 == 0.0f) {
                    fArrMakeFloatArray2[i8][i9] = 0.0f;
                    fArrMakeFloatArray2[i8 + 1][i9] = 0.0f;
                    i = length2;
                } else {
                    float f7 = fArrMakeFloatArray2[i8][i9] / f6;
                    int i10 = i8 + 1;
                    float f8 = fArrMakeFloatArray2[i10][i9] / f6;
                    i = length2;
                    float fHypot = (float) Math.hypot(f7, f8);
                    if (fHypot > 9.0d) {
                        float f9 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i8];
                        float[] fArr7 = fArrMakeFloatArray[i8];
                        fArr6[i9] = f7 * f9 * fArr7[i9];
                        fArrMakeFloatArray2[i10][i9] = f9 * f8 * fArr7[i9];
                    }
                }
                i9++;
                length2 = i;
            }
            i8++;
            i2 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    private final float[][] makeFloatArray(int a, int b) {
        float[][] fArr = new float[a][];
        for (int i = 0; i < a; i++) {
            fArr[i] = new float[b];
        }
        return fArr;
    }

    public final void getPos(float time, AnimationVectors v, int index) {
        int i;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i2 = 0;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (time < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            getSlope(fArr[i], this.slopeTemp);
            while (i2 < length2) {
                v.set$animation_core_release(i2, this.values[i][i2] + ((time - this.timePoints[i]) * this.slopeTemp[i2]));
                i2++;
            }
            return;
        }
        int i3 = length - 1;
        int i4 = index;
        while (i4 < i3) {
            float[] fArr2 = this.timePoints;
            float f = fArr2[i4];
            if (time == f) {
                while (i2 < length2) {
                    v.set$animation_core_release(i2, this.values[i4][i2]);
                    i2++;
                }
                return;
            }
            int i5 = i4 + 1;
            float f2 = fArr2[i5];
            if (time < f2) {
                float f3 = f2 - f;
                float f4 = (time - f) / f3;
                while (i2 < length2) {
                    float[][] fArr3 = this.values;
                    float f5 = fArr3[i4][i2];
                    float f6 = fArr3[i5][i2];
                    float[][] fArr4 = this.tangents;
                    v.set$animation_core_release(i2, MonoSpline2.hermiteInterpolate(f3, f4, f5, f6, fArr4[i4][i2], fArr4[i5][i2]));
                    i2++;
                }
                return;
            }
            i4 = i5;
        }
    }

    private final void getSlope(float time, float[] v) {
        int length = this.values[0].length;
        float[] fArr = this.timePoints;
        int length2 = fArr.length;
        float f = fArr[0];
        int i = length2 - 1;
        float f2 = fArr[i];
        if (time < f) {
            time = f;
        }
        if (time <= f2) {
            f2 = time;
        }
        if (v.length < length) {
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            float[] fArr2 = this.timePoints;
            int i3 = i2 + 1;
            float f3 = fArr2[i3];
            if (f2 <= f3) {
                float f4 = fArr2[i2];
                float f5 = f3 - f4;
                float f6 = (f2 - f4) / f5;
                for (int i4 = 0; i4 < length; i4++) {
                    float[][] fArr3 = this.values;
                    float f7 = fArr3[i2][i4];
                    float f8 = fArr3[i3][i4];
                    float[][] fArr4 = this.tangents;
                    v[i4] = MonoSpline2.hermiteDifferential(f5, f6, f7, f8, fArr4[i2][i4], fArr4[i3][i4]) / f5;
                }
                return;
            }
            i2 = i3;
        }
    }

    public final void getSlope(float time, AnimationVectors v, int index) {
        int i;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (time < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float[] fArr4 = fArr3[i];
            if (fArr4.length < length2) {
                return;
            }
            while (i2 < length2) {
                v.set$animation_core_release(i2, fArr4[i2]);
                i2++;
            }
            return;
        }
        int i3 = length - 1;
        int i4 = index;
        while (i4 < i3) {
            int i5 = i4 + 1;
            float f = fArr[i5];
            if (time <= f) {
                float f2 = fArr[i4];
                float f3 = f - f2;
                float f4 = (time - f2) / f3;
                while (i2 < length2) {
                    v.set$animation_core_release(i2, MonoSpline2.hermiteDifferential(f3, f4, fArr2[i4][i2], fArr2[i5][i2], fArr3[i4][i2], fArr3[i5][i2]) / f3);
                    i2++;
                }
                return;
            }
            i4 = i5;
        }
    }
}
