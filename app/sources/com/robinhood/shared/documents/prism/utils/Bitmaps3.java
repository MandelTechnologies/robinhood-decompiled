package com.robinhood.shared.documents.prism.utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.mlkit.vision.face.Face;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Bitmaps.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0002H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"computeDarkness", "", "Landroid/graphics/Bitmap;", "quality", "", "computeGlare", "Lkotlin/Pair;", "cropFace", "face", "Lcom/google/mlkit/vision/face/Face;", "GlareTargetWidth", "GlareBrightnessThreshold", "feature-prism_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.prism.utils.BitmapsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Bitmaps3 {
    private static final int GlareBrightnessThreshold = 240;
    private static final int GlareTargetWidth = 256;

    public static /* synthetic */ double computeDarkness$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 40;
        }
        return computeDarkness(bitmap, i);
    }

    public static final Tuples2<Double, Double> computeGlare(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        double width = 256.0d / bitmap.getWidth();
        int width2 = (int) (bitmap.getWidth() * width);
        int height = (int) (bitmap.getHeight() * width);
        int i = 1;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width2, height, true);
        int width3 = bitmapCreateScaledBitmap.getWidth();
        int[][] iArr = new int[width3][];
        int i2 = 0;
        for (int i3 = 0; i3 < width3; i3++) {
            iArr[i3] = new int[bitmapCreateScaledBitmap.getHeight()];
        }
        int width4 = bitmapCreateScaledBitmap.getWidth();
        for (int i4 = 0; i4 < width4; i4++) {
            int height2 = bitmapCreateScaledBitmap.getHeight();
            for (int i5 = 0; i5 < height2; i5++) {
                int pixel = bitmapCreateScaledBitmap.getPixel(i4, i5);
                iArr[i4][i5] = RangesKt.coerceIn(MathKt.roundToInt((Color.red(pixel) * 0.299d) + (Color.green(pixel) * 0.587d) + (Color.blue(pixel) * 0.114d)), 0, 255);
            }
        }
        int width5 = bitmapCreateScaledBitmap.getWidth() - 1;
        int i6 = 1;
        int i7 = 0;
        double dAbs = 0.0d;
        while (i6 < width5) {
            int height3 = bitmapCreateScaledBitmap.getHeight() - i;
            int i8 = i;
            while (i8 < height3) {
                int i9 = iArr[i6][i8];
                if (i9 >= 240) {
                    i7++;
                    int i10 = i2;
                    for (int i11 = -1; i11 < 2; i11++) {
                        for (int i12 = -1; i12 < 2; i12++) {
                            if (i11 != 0 || i12 != 0) {
                                i10 += iArr[i6 + i11][i8 + i12];
                            }
                        }
                    }
                    dAbs += Math.abs(i9 - (i10 / 8.0d));
                }
                i8++;
                i2 = 0;
            }
            i6++;
            i = 1;
            i2 = 0;
        }
        double d = i7;
        return Tuples4.m3642to(Double.valueOf(d / (bitmapCreateScaledBitmap.getWidth() * bitmapCreateScaledBitmap.getHeight())), Double.valueOf(i7 > 0 ? dAbs / d : 0.0d));
    }

    public static final double computeDarkness(Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
        double dRed = 0.0d;
        double dGreen = 0.0d;
        double dBlue = 0.0d;
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                int pixel = bitmapCreateScaledBitmap.getPixel(i2, i3);
                dRed += Color.red(pixel) / 255.0d;
                dGreen += Color.green(pixel) / 255.0d;
                dBlue += Color.blue(pixel) / 255.0d;
            }
        }
        double d = i * i;
        return ((dRed / d) * 0.299d) + ((dGreen / d) * 0.587d) + ((dBlue / d) * 0.114d);
    }

    public static final Bitmap cropFace(Bitmap bitmap, Face face) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(face, "face");
        int iCoerceAtLeast = RangesKt.coerceAtLeast(face.getBoundingBox().left, 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(face.getBoundingBox().top, 0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iCoerceAtLeast, iCoerceAtLeast2, RangesKt.coerceAtMost(face.getBoundingBox().width(), bitmap.getWidth() - iCoerceAtLeast), RangesKt.coerceAtMost(face.getBoundingBox().height(), bitmap.getHeight() - iCoerceAtLeast2));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
