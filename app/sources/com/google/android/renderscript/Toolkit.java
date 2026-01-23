package com.google.android.renderscript;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Toolkit.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "<init>", "()V", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "coefficients", "Lcom/google/android/renderscript/Range2d;", "restriction", "", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "convolve", "(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;", "J", "renderscript-toolkit_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class Toolkit {
    public static final Toolkit INSTANCE;
    private static long nativeHandle;

    private final native long createNative();

    private final native void nativeConvolveBitmap(long nativeHandle2, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Toolkit2 restriction);

    private Toolkit() {
    }

    public static /* synthetic */ Bitmap convolve$default(Toolkit toolkit, Bitmap bitmap, float[] fArr, Toolkit2 toolkit2, int i, Object obj) {
        if ((i & 4) != 0) {
            toolkit2 = null;
        }
        return toolkit.convolve(bitmap, fArr, toolkit2);
    }

    @JvmOverloads
    public final Bitmap convolve(Bitmap inputBitmap, float[] coefficients, Toolkit2 restriction) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        Toolkit3.validateBitmap$default("convolve", inputBitmap, false, 4, null);
        if (coefficients.length != 9 && coefficients.length != 25) {
            throw new IllegalArgumentException(("RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. " + coefficients.length + " coefficients provided.").toString());
        }
        Toolkit3.validateRestriction("convolve", inputBitmap, restriction);
        Bitmap bitmapCreateCompatibleBitmap = Toolkit3.createCompatibleBitmap(inputBitmap);
        nativeConvolveBitmap(nativeHandle, inputBitmap, bitmapCreateCompatibleBitmap, coefficients, restriction);
        return bitmapCreateCompatibleBitmap;
    }

    static {
        Toolkit toolkit = new Toolkit();
        INSTANCE = toolkit;
        try {
            System.loadLibrary("renderscript-toolkit");
            nativeHandle = toolkit.createNative();
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
