package com.robinhood.android.camera;

import android.graphics.Rect;
import android.hardware.Camera;
import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.math.MathKt;

/* compiled from: CameraUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0011J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/camera/CameraUtils;", "", "<init>", "()V", "NECESSARY_BYTES", "", "cameraSupported", "", "getCameraSupported", "()Z", "getRectOffsets", "Lkotlin/Pair;", "", "width", "height", "aspectRatio", GoldFeature.MARGIN, "getRectOffsets$lib_camera_externalDebug", "roundToInt", "getCroppingRect", "Landroid/graphics/Rect;", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CameraUtils {
    public static final int $stable = 0;
    public static final CameraUtils INSTANCE = new CameraUtils();
    private static final int NECESSARY_BYTES = 16777216;

    private CameraUtils() {
    }

    public final boolean getCameraSupported() {
        boolean z = Camera.getNumberOfCameras() > 0;
        Runtime runtime = Runtime.getRuntime();
        return z && (((runtime.maxMemory() - runtime.totalMemory()) > 16777216L ? 1 : ((runtime.maxMemory() - runtime.totalMemory()) == 16777216L ? 0 : -1)) > 0);
    }

    public final Tuples2<Float, Float> getRectOffsets$lib_camera_externalDebug(int width, int height, float aspectRatio, float margin) {
        if (aspectRatio <= 0.0f) {
            return Tuples4.m3642to(Float.valueOf(margin), Float.valueOf(margin));
        }
        float f = height;
        float f2 = 2;
        float f3 = margin * f2;
        float f4 = f - f3;
        float f5 = width;
        float f6 = f5 - f3;
        float f7 = f4 / aspectRatio;
        float f8 = aspectRatio * f6;
        if (f7 > f6) {
            return Tuples4.m3642to(Float.valueOf(margin), Float.valueOf((f - f8) / f2));
        }
        return Tuples4.m3642to(Float.valueOf((f5 - f7) / f2), Float.valueOf(margin));
    }

    private final Tuples2<Integer, Integer> roundToInt(Tuples2<Float, Float> tuples2) {
        return Tuples4.m3642to(Integer.valueOf(MathKt.roundToInt(tuples2.getFirst().floatValue())), Integer.valueOf(MathKt.roundToInt(tuples2.getSecond().floatValue())));
    }

    public final Rect getCroppingRect(int width, int height, float aspectRatio, float margin) {
        Tuples2<Integer, Integer> tuples2RoundToInt = roundToInt(getRectOffsets$lib_camera_externalDebug(width, height, aspectRatio, margin));
        int iIntValue = tuples2RoundToInt.component1().intValue();
        int iIntValue2 = tuples2RoundToInt.component2().intValue();
        Rect rect = new Rect(iIntValue, iIntValue2, width - iIntValue, height - iIntValue2);
        int i = rect.left;
        int i2 = i < 0 ? -i : 0;
        int i3 = rect.top;
        rect.inset(i2, i3 < 0 ? -i3 : 0);
        return rect;
    }
}
