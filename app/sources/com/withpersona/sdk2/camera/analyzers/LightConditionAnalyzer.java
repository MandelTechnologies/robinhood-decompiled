package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import android.media.Image;
import android.util.Size;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LightConditionAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/LightConditionAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "", "imageWidth", "imageHeight", "Landroid/graphics/Rect;", "region", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "calculateLightConditions", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;", "averageLuma", "", "calculateRmsContrast", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D", "", "histogram", "sampleSize", "lowerPercentile", "higherPercentile", "calculateLowHighContrast", "([JIDD)I", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "", "byteArr", "[B", "Landroid/util/Size;", "preferredImageSize", "Landroid/util/Size;", "getPreferredImageSize", "()Landroid/util/Size;", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class LightConditionAnalyzer implements ComposableImageAnalyzer {
    private final byte[] byteArr = new byte[32768];
    private final Size preferredImageSize = new Size(0, 0);

    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    public Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation) {
        Image.Plane plane;
        int width = imageToAnalyze.getImage().getWidth();
        int height = imageToAnalyze.getImage().getHeight();
        Image.Plane[] planes = imageToAnalyze.getImage().getPlanes();
        if (planes == null || (plane = planes[0]) == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
        }
        if (rect == null) {
            rect = new Rect(0, 0, width, height);
        }
        ByteBuffer buffer = plane.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ImageLightCondition imageLightConditionCalculateLightConditions = calculateLightConditions(buffer, width, height, rect);
        if (imageLightConditionCalculateLightConditions == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m28550constructorimpl(new ComposableImageAnalyzer2.LightConditionData(imageLightConditionCalculateLightConditions));
    }

    private final ImageLightCondition calculateLightConditions(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        if (imageWidth == 0 || imageHeight == 0) {
            return null;
        }
        long[] jArr = new long[256];
        yPlaneBuffer.rewind();
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        if (iWidth2 > 32768) {
            return null;
        }
        int i = region.bottom;
        long j = 0;
        for (int i2 = region.top; i2 < i; i2++) {
            yPlaneBuffer.position((i2 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i3 = 0; i3 < iWidth2; i3++) {
                int i4 = this.byteArr[i3] & 255;
                j += i4;
                jArr[i4] = jArr[i4] + 1;
            }
        }
        double d = j / iWidth;
        return new ImageLightCondition(d / 255.0d, calculateRmsContrast(yPlaneBuffer, imageWidth, (int) d, region), calculateLowHighContrast$default(this, jArr, iWidth, 0.0d, 0.0d, 12, null) / 255.0d, iWidth);
    }

    private final double calculateRmsContrast(ByteBuffer yPlaneBuffer, int imageWidth, int averageLuma, Rect region) {
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        int i = region.bottom;
        long j = 0;
        for (int i2 = region.top; i2 < i; i2++) {
            yPlaneBuffer.position((i2 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i3 = 0; i3 < iWidth2; i3++) {
                int i4 = (this.byteArr[i3] & 255) - averageLuma;
                j += i4 * i4;
            }
        }
        return Math.sqrt(j / iWidth) / 128.0d;
    }

    static /* synthetic */ int calculateLowHighContrast$default(LightConditionAnalyzer lightConditionAnalyzer, long[] jArr, int i, double d, double d2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            d = 1.0d;
        }
        double d3 = d;
        if ((i2 & 8) != 0) {
            d2 = 99.0d;
        }
        return lightConditionAnalyzer.calculateLowHighContrast(jArr, i, d3, d2);
    }

    private final int calculateLowHighContrast(long[] histogram, int sampleSize, double lowerPercentile, double higherPercentile) {
        double d = 100;
        double d2 = sampleSize;
        double dFloor = Math.floor((lowerPercentile / d) * d2);
        double dFloor2 = Math.floor((higherPercentile / d) * d2);
        int length = histogram.length;
        int i = 0;
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = 0;
                break;
            }
            j2 += histogram[i2];
            if (j2 > dFloor) {
                break;
            }
            i2++;
        }
        double d3 = d2 - dFloor2;
        int length2 = histogram.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                j += histogram[length2];
                if (j > d3) {
                    i = length2;
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length2 = i3;
            }
        }
        return i - i2;
    }
}
