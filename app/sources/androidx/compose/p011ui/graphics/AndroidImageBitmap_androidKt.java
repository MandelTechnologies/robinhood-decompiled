package androidx.compose.p011ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p011ui.graphics.ImageBitmap2;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0015\u001a\u00020\u0012*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0007*\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m3636d2 = {"Landroid/graphics/Bitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "asImageBitmap", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "ActualImageBitmap", "asAndroidBitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toBitmapConfig", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m6607ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configM6608toBitmapConfig1JJdX4A = m6608toBitmapConfig1JJdX4A(i3);
        if (Build.VERSION.SDK_INT < 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM6608toBitmapConfig1JJdX4A);
            bitmapCreateBitmap.setHasAlpha(z);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m6608toBitmapConfig1JJdX4A(i3), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m6608toBitmapConfig1JJdX4A(int i) {
        ImageBitmap2.Companion companion = ImageBitmap2.INSTANCE;
        if (ImageBitmap2.m6768equalsimpl0(i, companion.m6773getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmap2.m6768equalsimpl0(i, companion.m6772getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmap2.m6768equalsimpl0(i, companion.m6776getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && ImageBitmap2.m6768equalsimpl0(i, companion.m6774getF16_sVssgQ())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i2 >= 26 && ImageBitmap2.m6768equalsimpl0(i, companion.m6775getGpu_sVssgQ())) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmap2.INSTANCE.m6772getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmap2.INSTANCE.m6776getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmap2.INSTANCE.m6773getArgb8888_sVssgQ();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && config == Bitmap.Config.RGBA_F16) {
            return ImageBitmap2.INSTANCE.m6774getF16_sVssgQ();
        }
        if (i >= 26 && config == Bitmap.Config.HARDWARE) {
            return ImageBitmap2.INSTANCE.m6775getGpu_sVssgQ();
        }
        return ImageBitmap2.INSTANCE.m6773getArgb8888_sVssgQ();
    }
}
