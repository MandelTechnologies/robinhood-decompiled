package com.robinhood.android.camera.detection;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicColorMatrix;
import android.renderscript.ScriptIntrinsicConvolve3x3;
import androidx.core.graphics.ColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: BlurrinessDetection.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\u00020\u0007*\u00020\u00128Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/camera/detection/BlurrinessDetection;", "", "<init>", "()V", "CLASSIC_MATRIX", "", "THRESHOLD", "", "runDetection", "", "context", "Landroid/content/Context;", "sourceBitmap", "Landroid/graphics/Bitmap;", "threshold", "highestLuminanceFromBitmap", "bitmap", "luminance", "", "getLuminance", "(I)F", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlurrinessDetection {
    public static final BlurrinessDetection INSTANCE = new BlurrinessDetection();
    private static final float[] CLASSIC_MATRIX = {-1.0f, -1.0f, -1.0f, -1.0f, 8.0f, -1.0f, -1.0f, -1.0f, -1.0f};
    private static final float THRESHOLD = (float) ColorUtils.calculateLuminance(13553358);
    public static final int $stable = 8;

    private BlurrinessDetection() {
    }

    public static /* synthetic */ boolean runDetection$default(BlurrinessDetection blurrinessDetection, Context context, Bitmap bitmap, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = THRESHOLD;
        }
        return blurrinessDetection.runDetection(context, bitmap, f);
    }

    public final boolean runDetection(Context context, Bitmap sourceBitmap, float threshold) {
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        RenderScript renderScriptCreate = RenderScript.create(context);
        Bitmap.Config config = sourceBitmap.getConfig();
        if (config == null || (bitmapCreateBitmap = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config)) == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Bitmap.Config config2 = sourceBitmap.getConfig();
        if (config2 == null || (bitmapCreateBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config2)) == null) {
            bitmapCreateBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.RGBA_8888(renderScriptCreate));
        Allocation.MipmapControl mipmapControl = Allocation.MipmapControl.MIPMAP_NONE;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, sourceBitmap, mipmapControl, 128);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap, mipmapControl, 128);
        try {
            scriptIntrinsicBlurCreate.setRadius(1.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.destroy();
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
            Allocation allocationCreateFromBitmap3 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap, mipmapControl, 128);
            Allocation allocationCreateFromBitmap4 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2, mipmapControl, 128);
            ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrixCreate = ScriptIntrinsicColorMatrix.create(renderScriptCreate);
            try {
                scriptIntrinsicColorMatrixCreate.setGreyscale();
                scriptIntrinsicColorMatrixCreate.forEach(allocationCreateFromBitmap3, allocationCreateFromBitmap4);
                allocationCreateFromBitmap4.copyTo(bitmapCreateBitmap2);
                allocationCreateFromBitmap3.destroy();
                allocationCreateFromBitmap4.destroy();
                scriptIntrinsicColorMatrixCreate.destroy();
                bitmapCreateBitmap.eraseColor(0);
                Allocation allocationCreateFromBitmap5 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2, mipmapControl, 128);
                Allocation allocationCreateFromBitmap6 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap, mipmapControl, 128);
                ScriptIntrinsicConvolve3x3 scriptIntrinsicConvolve3x3Create = ScriptIntrinsicConvolve3x3.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                try {
                    scriptIntrinsicConvolve3x3Create.setInput(allocationCreateFromBitmap5);
                    scriptIntrinsicConvolve3x3Create.setCoefficients(CLASSIC_MATRIX);
                    scriptIntrinsicConvolve3x3Create.forEach(allocationCreateFromBitmap6);
                    allocationCreateFromBitmap6.copyTo(bitmapCreateBitmap);
                    allocationCreateFromBitmap5.destroy();
                    allocationCreateFromBitmap6.destroy();
                    scriptIntrinsicConvolve3x3Create.destroy();
                    float fHighestLuminanceFromBitmap = highestLuminanceFromBitmap(bitmapCreateBitmap);
                    boolean z = fHighestLuminanceFromBitmap < threshold;
                    Timber.INSTANCE.mo3356i("Checking blurriness, highest luminance: %f, threshold: %f", Float.valueOf(fHighestLuminanceFromBitmap), Float.valueOf(threshold));
                    bitmapCreateBitmap.recycle();
                    bitmapCreateBitmap2.recycle();
                    return z;
                } catch (Throwable th) {
                    allocationCreateFromBitmap5.destroy();
                    allocationCreateFromBitmap6.destroy();
                    scriptIntrinsicConvolve3x3Create.destroy();
                    throw th;
                }
            } catch (Throwable th2) {
                allocationCreateFromBitmap3.destroy();
                allocationCreateFromBitmap4.destroy();
                scriptIntrinsicColorMatrixCreate.destroy();
                throw th2;
            }
        } catch (Throwable th3) {
            scriptIntrinsicBlurCreate.destroy();
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
            throw th3;
        }
    }

    private final float highestLuminanceFromBitmap(Bitmap bitmap) {
        bitmap.setHasAlpha(false);
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        float fCalculateLuminance = (float) ColorUtils.calculateLuminance(-16777216);
        for (int i = 0; i < height; i++) {
            float fCalculateLuminance2 = (float) ColorUtils.calculateLuminance(iArr[i]);
            if (fCalculateLuminance2 > fCalculateLuminance) {
                fCalculateLuminance = fCalculateLuminance2;
            }
        }
        return fCalculateLuminance;
    }

    private final float getLuminance(int i) {
        return (float) ColorUtils.calculateLuminance(i);
    }
}
