package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.canhub.cropper.CropException;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.utils.GetUriForFile;
import com.plaid.internal.EnumC7081g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p481io.Closeable;

/* compiled from: BitmapUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0081\u0001\u0082\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u007f\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(Jw\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101J)\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001d2\u0006\u00102\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00104J?\u00105\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u00108J/\u00109\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010<J/\u0010>\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b>\u0010?J'\u0010A\u001a\u00020@2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001d¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u00020@2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bA\u0010EJ-\u0010F\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\bF\u0010GJO\u0010H\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\bH\u0010IJw\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b'\u0010JJ\u0015\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bN\u0010MJ\u0015\u0010O\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bO\u0010MJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bP\u0010MJ\u0015\u0010Q\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010MJ\u0015\u0010R\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bR\u0010MJ\u0015\u0010S\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bS\u0010MJ\u0015\u0010T\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0006¢\u0006\u0004\bT\u0010MJ=\u0010W\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ+\u0010Z\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bZ\u0010[J7\u0010]\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020\b2\b\u0010Y\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b]\u0010^J/\u0010`\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u00102\u001a\u00020_¢\u0006\u0004\b`\u0010aR\u0017\u0010b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010k\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bk\u0010h\u001a\u0004\bl\u0010jR\u0017\u0010m\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bq\u0010n\u001a\u0004\br\u0010pR\u0016\u0010s\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR6\u0010x\u001a\u0016\u0012\u0004\u0012\u00020v\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040w\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, m3636d2 = {"Lcom/canhub/cropper/BitmapUtils;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "cropPoints", "", "degreesRotated", "", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "", "scale", "flipHorizontally", "flipVertically", "cropBitmapObjectWithScale", "(Landroid/graphics/Bitmap;[FIZIIFZZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "rect", "", "fixRectForAspectRatio", "(Landroid/graphics/Rect;II)V", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "Landroid/net/Uri;", "buildUri", "(Landroid/content/Context;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;", "loadedImageUri", "orgWidth", "orgHeight", "reqWidth", "reqHeight", "sampleMulti", "Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "cropBitmap", "(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZI)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "width", "height", "(Landroid/content/Context;Landroid/net/Uri;[FIZIIILandroid/graphics/Rect;IIZZ)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "Landroid/content/ContentResolver;", "resolver", "uri", "Landroid/graphics/BitmapFactory$Options;", "decodeImageForOption", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/BitmapFactory$Options;", "options", "decodeImage", "(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "decodeSampledBitmapRegion", "(Landroid/content/Context;Landroid/net/Uri;Landroid/graphics/Rect;III)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "cropForRotatedImage", "(Landroid/graphics/Bitmap;[FLandroid/graphics/Rect;IZII)Landroid/graphics/Bitmap;", "calculateInSampleSizeByRequestedSize", "(IIII)I", "calculateInSampleSizeByMaxTextureSize", "(II)I", "degrees", "rotateAndFlipBitmapInt", "(Landroid/graphics/Bitmap;IZZ)Landroid/graphics/Bitmap;", "Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;", "orientateBitmapByExif", "(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/net/Uri;)Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;", "Landroidx/exifinterface/media/ExifInterface;", "exif", "(Landroid/graphics/Bitmap;Landroidx/exifinterface/media/ExifInterface;)Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;", "decodeSampledBitmap", "(Landroid/content/Context;Landroid/net/Uri;II)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "cropBitmapObjectHandleOOM", "(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "points", "getRectLeft", "([F)F", "getRectTop", "getRectRight", "getRectBottom", "getRectWidth", "getRectHeight", "getRectCenterX", "getRectCenterY", "imageWidth", "imageHeight", "getRectFromPoints", "([FIIZII)Landroid/graphics/Rect;", "customOutputUri", "writeTempStateStoreBitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)Landroid/net/Uri;", "compressQuality", "writeBitmapToUri", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)Landroid/net/Uri;", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "resizeBitmap", "(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;", "EMPTY_RECT", "Landroid/graphics/Rect;", "getEMPTY_RECT", "()Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "EMPTY_RECT_F", "Landroid/graphics/RectF;", "getEMPTY_RECT_F", "()Landroid/graphics/RectF;", "RECT", "getRECT", "POINTS", "[F", "getPOINTS", "()[F", "POINTS2", "getPOINTS2", "mMaxTextureSize", "I", "Landroid/util/Pair;", "", "Ljava/lang/ref/WeakReference;", "mStateBitmap", "Landroid/util/Pair;", "getMStateBitmap", "()Landroid/util/Pair;", "setMStateBitmap", "(Landroid/util/Pair;)V", "getMaxTextureSize", "()I", "maxTextureSize", "BitmapSampled", "RotateBitmapResult", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BitmapUtils {
    private static int mMaxTextureSize;
    private static Pair<String, WeakReference<Bitmap>> mStateBitmap;
    public static final BitmapUtils INSTANCE = new BitmapUtils();
    private static final Rect EMPTY_RECT = new Rect();
    private static final RectF EMPTY_RECT_F = new RectF();
    private static final RectF RECT = new RectF();
    private static final float[] POINTS = new float[6];
    private static final float[] POINTS2 = new float[6];

    /* compiled from: BitmapUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 7, 1}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BitmapUtils() {
    }

    public final Rect getEMPTY_RECT() {
        return EMPTY_RECT;
    }

    public final RectF getEMPTY_RECT_F() {
        return EMPTY_RECT_F;
    }

    public final RectF getRECT() {
        return RECT;
    }

    public final float[] getPOINTS() {
        return POINTS;
    }

    public final float[] getPOINTS2() {
        return POINTS2;
    }

    public final Pair<String, WeakReference<Bitmap>> getMStateBitmap() {
        return mStateBitmap;
    }

    public final void setMStateBitmap(Pair<String, WeakReference<Bitmap>> pair) {
        mStateBitmap = pair;
    }

    public final RotateBitmapResult orientateBitmapByExif(Bitmap bitmap, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ExifInterface exifInterface = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    ExifInterface exifInterface2 = new ExifInterface(inputStreamOpenInputStream);
                    Closeable.closeFinally(inputStreamOpenInputStream, null);
                    exifInterface = exifInterface2;
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        if (exifInterface != null) {
            return orientateBitmapByExif(bitmap, exifInterface);
        }
        return new RotateBitmapResult(bitmap, 0, false, false);
    }

    public final RotateBitmapResult orientateBitmapByExif(Bitmap bitmap, ExifInterface exif) {
        Intrinsics.checkNotNullParameter(exif, "exif");
        boolean z = true;
        int attributeInt = exif.getAttributeInt("Orientation", 1);
        int i = attributeInt != 3 ? (attributeInt == 5 || attributeInt == 6 || attributeInt == 7) ? 90 : attributeInt != 8 ? 0 : EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE : EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        boolean z2 = attributeInt == 2 || attributeInt == 5;
        if (attributeInt != 4 && attributeInt != 7) {
            z = false;
        }
        return new RotateBitmapResult(bitmap, i, z2, z);
    }

    public final BitmapSampled decodeSampledBitmap(Context context, Uri uri, int reqWidth, int reqHeight) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            ContentResolver resolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(resolver, "resolver");
            BitmapFactory.Options optionsDecodeImageForOption = decodeImageForOption(resolver, uri);
            int i = optionsDecodeImageForOption.outWidth;
            if (i == -1 && optionsDecodeImageForOption.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsDecodeImageForOption.inSampleSize = Math.max(calculateInSampleSizeByRequestedSize(i, optionsDecodeImageForOption.outHeight, reqWidth, reqHeight), calculateInSampleSizeByMaxTextureSize(optionsDecodeImageForOption.outWidth, optionsDecodeImageForOption.outHeight));
            return new BitmapSampled(decodeImage(resolver, uri, optionsDecodeImageForOption), optionsDecodeImageForOption.inSampleSize);
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(uri, e.getMessage());
        }
    }

    public final BitmapSampled cropBitmapObjectHandleOOM(Bitmap bitmap, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, boolean flipHorizontally, boolean flipVertically) {
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        int i = 1;
        do {
            try {
                Intrinsics.checkNotNull(bitmap);
                return new BitmapSampled(cropBitmapObjectWithScale(bitmap, cropPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, 1 / i, flipHorizontally, flipVertically), i);
            } catch (OutOfMemoryError e) {
                i *= 2;
            }
        } while (i <= 8);
        throw e;
    }

    private final Bitmap cropBitmapObjectWithScale(Bitmap bitmap, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, float scale, boolean flipHorizontally, boolean flipVertically) {
        float f = scale;
        Rect rectFromPoints = getRectFromPoints(cropPoints, bitmap.getWidth(), bitmap.getHeight(), fixAspectRatio, aspectRatioX, aspectRatioY);
        Matrix matrix = new Matrix();
        matrix.setRotate(degreesRotated, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f2 = flipHorizontally ? -f : f;
        if (flipVertically) {
            f = -f;
        }
        matrix.postScale(f2, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectFromPoints.left, rectFromPoints.top, rectFromPoints.width(), rectFromPoints.height(), matrix, true);
        if (Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return degreesRotated % 90 != 0 ? cropForRotatedImage(bitmapCreateBitmap, cropPoints, rectFromPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY) : bitmapCreateBitmap;
    }

    public final BitmapSampled cropBitmap(Context context, Uri loadedImageUri, float[] cropPoints, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, boolean flipHorizontally, boolean flipVertically) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        float[] cropPoints2 = cropPoints;
        Intrinsics.checkNotNullParameter(cropPoints2, "cropPoints");
        int i = 1;
        while (true) {
            try {
                Intrinsics.checkNotNull(loadedImageUri);
                return cropBitmap(context2, loadedImageUri, cropPoints2, degreesRotated, orgWidth, orgHeight, fixAspectRatio, aspectRatioX, aspectRatioY, reqWidth, reqHeight, flipHorizontally, flipVertically, i);
            } catch (OutOfMemoryError e) {
                i *= 2;
                if (i > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i + "): " + loadedImageUri + "\r\n" + e.getMessage(), e);
                }
                context2 = context;
                cropPoints2 = cropPoints;
            }
        }
    }

    public final float getRectLeft(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    public final float getRectTop(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    public final float getRectRight(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    public final float getRectBottom(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    public final float getRectWidth(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return getRectRight(points) - getRectLeft(points);
    }

    public final float getRectHeight(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return getRectBottom(points) - getRectTop(points);
    }

    public final float getRectCenterX(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (getRectRight(points) + getRectLeft(points)) / 2.0f;
    }

    public final float getRectCenterY(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (getRectBottom(points) + getRectTop(points)) / 2.0f;
    }

    public final Rect getRectFromPoints(float[] cropPoints, int imageWidth, int imageHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Rect rect = new Rect(MathKt.roundToInt(Math.max(0.0f, getRectLeft(cropPoints))), MathKt.roundToInt(Math.max(0.0f, getRectTop(cropPoints))), MathKt.roundToInt(Math.min(imageWidth, getRectRight(cropPoints))), MathKt.roundToInt(Math.min(imageHeight, getRectBottom(cropPoints))));
        if (fixAspectRatio) {
            fixRectForAspectRatio(rect, aspectRatioX, aspectRatioY);
        }
        return rect;
    }

    private final void fixRectForAspectRatio(Rect rect, int aspectRatioX, int aspectRatioY) {
        if (aspectRatioX != aspectRatioY || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    public final Uri writeTempStateStoreBitmap(Context context, Bitmap bitmap, Uri customOutputUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNull(bitmap);
            return writeBitmapToUri(context, bitmap, Bitmap.CompressFormat.JPEG, 95, customOutputUri);
        } catch (Exception e) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
            return null;
        }
    }

    public final Uri writeBitmapToUri(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int compressQuality, Uri customOutputUri) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        if (customOutputUri == null) {
            customOutputUri = buildUri(context, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(customOutputUri, "wt");
        try {
            bitmap.compress(compressFormat, compressQuality, outputStreamOpenOutputStream);
            Closeable.closeFinally(outputStreamOpenOutputStream, null);
            return customOutputUri;
        } finally {
        }
    }

    private final Uri buildUri(Context context, Bitmap.CompressFormat compressFormat) throws Throwable {
        String str;
        Uri uriForFile;
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[compressFormat.ordinal()];
            if (i == 1) {
                str = ".jpg";
            } else if (i == 2) {
                str = ".png";
            } else {
                str = ".webp";
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    File file = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    uriForFile = GetUriForFile.getUriForFile(context, file);
                } catch (Exception e) {
                    Log.e("AIC", String.valueOf(e.getMessage()));
                    File file2 = File.createTempFile("cropped", str, context.getCacheDir());
                    Intrinsics.checkNotNullExpressionValue(file2, "file");
                    uriForFile = GetUriForFile.getUriForFile(context, file2);
                }
            } else {
                uriForFile = Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            Intrinsics.checkNotNullExpressionValue(uriForFile, "{\n      val ext = when (….cacheDir))\n      }\n    }");
            return uriForFile;
        } catch (IOException e2) {
            throw new RuntimeException("Failed to create temp file for output image", e2);
        }
    }

    public final Bitmap resizeBitmap(Bitmap bitmap, int reqWidth, int reqHeight, CropImageView.RequestSizeOptions options) {
        Bitmap bitmapCreateScaledBitmap;
        Intrinsics.checkNotNullParameter(options, "options");
        if (reqWidth > 0 && reqHeight > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions = CropImageView.RequestSizeOptions.RESIZE_FIT;
                if (options == requestSizeOptions || options == CropImageView.RequestSizeOptions.RESIZE_INSIDE || options == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                    if (options == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                        Intrinsics.checkNotNull(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, reqWidth, reqHeight, false);
                    } else {
                        Intrinsics.checkNotNull(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / reqWidth, height / reqHeight);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == requestSizeOptions) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!Intrinsics.areEqual(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        Intrinsics.checkNotNull(bitmap);
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final BitmapSampled cropBitmap(Context context, Uri loadedImageUri, float[] cropPoints, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, boolean flipHorizontally, boolean flipVertically, int sampleMulti) {
        int sampleSize;
        Bitmap bitmap;
        Bitmap bitmapRotateAndFlipBitmapInt;
        Rect rectFromPoints = getRectFromPoints(cropPoints, orgWidth, orgHeight, fixAspectRatio, aspectRatioX, aspectRatioY);
        int iWidth = reqWidth > 0 ? reqWidth : rectFromPoints.width();
        int iHeight = reqHeight > 0 ? reqHeight : rectFromPoints.height();
        Bitmap bitmap2 = null;
        try {
            BitmapSampled bitmapSampledDecodeSampledBitmapRegion = decodeSampledBitmapRegion(context, loadedImageUri, rectFromPoints, iWidth, iHeight, sampleMulti);
            try {
                bitmap2 = bitmapSampledDecodeSampledBitmapRegion.getBitmap();
                sampleSize = bitmapSampledDecodeSampledBitmapRegion.getSampleSize();
            } catch (Exception unused) {
                sampleSize = 1;
                int i = sampleSize;
                bitmap = bitmap2;
                if (bitmap == null) {
                }
            }
        } catch (Exception unused2) {
            rectFromPoints = rectFromPoints;
        }
        int i2 = sampleSize;
        bitmap = bitmap2;
        if (bitmap == null) {
            try {
                bitmapRotateAndFlipBitmapInt = rotateAndFlipBitmapInt(bitmap, degreesRotated, flipHorizontally, flipVertically);
            } catch (OutOfMemoryError e) {
                e = e;
            }
            try {
                if (degreesRotated % 90 != 0) {
                    bitmapRotateAndFlipBitmapInt = cropForRotatedImage(bitmapRotateAndFlipBitmapInt, cropPoints, rectFromPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY);
                }
                return new BitmapSampled(bitmapRotateAndFlipBitmapInt, i2);
            } catch (OutOfMemoryError e2) {
                e = e2;
                bitmap = bitmapRotateAndFlipBitmapInt;
                bitmap.recycle();
                throw e;
            }
        }
        return cropBitmap(context, loadedImageUri, cropPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, sampleMulti, rectFromPoints, iWidth, iHeight, flipHorizontally, flipVertically);
    }

    private final BitmapSampled cropBitmap(Context context, Uri loadedImageUri, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int sampleMulti, Rect rect, int width, int height, boolean flipHorizontally, boolean flipVertically) throws Throwable {
        Bitmap bitmap;
        float[] fArr;
        Bitmap bitmapCropBitmapObjectWithScale = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iCalculateInSampleSizeByRequestedSize = sampleMulti * calculateInSampleSizeByRequestedSize(rect.width(), rect.height(), width, height);
            options.inSampleSize = iCalculateInSampleSizeByRequestedSize;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
            Bitmap bitmapDecodeImage = decodeImage(contentResolver, loadedImageUri, options);
            if (bitmapDecodeImage != null) {
                try {
                    int length = cropPoints.length;
                    try {
                        fArr = new float[length];
                        System.arraycopy(cropPoints, 0, fArr, 0, cropPoints.length);
                        for (int i = 0; i < length; i++) {
                            fArr[i] = fArr[i] / options.inSampleSize;
                        }
                        bitmap = bitmapDecodeImage;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapDecodeImage;
                    }
                    try {
                        bitmapCropBitmapObjectWithScale = cropBitmapObjectWithScale(bitmap, fArr, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, 1.0f, flipHorizontally, flipVertically);
                        if (!Intrinsics.areEqual(bitmapCropBitmapObjectWithScale, bitmap)) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!Intrinsics.areEqual((Object) null, bitmap)) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = bitmapDecodeImage;
                }
            }
            return new BitmapSampled(bitmapCropBitmapObjectWithScale, iCalculateInSampleSizeByRequestedSize);
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(loadedImageUri, e.getMessage());
        } catch (OutOfMemoryError e2) {
            if (0 != 0) {
                bitmapCropBitmapObjectWithScale.recycle();
            }
            throw e2;
        }
    }

    private final BitmapFactory.Options decodeImageForOption(ContentResolver resolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = resolver.openInputStream(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, EMPTY_RECT, options);
            options.inJustDecodeBounds = false;
            Closeable.closeFinally(inputStreamOpenInputStream, null);
            return options;
        } finally {
        }
    }

    private final Bitmap decodeImage(ContentResolver resolver, Uri uri, BitmapFactory.Options options) throws CropException.FailedToDecodeImage, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = resolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, EMPTY_RECT, options);
                    Closeable.closeFinally(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    Unit unit = Unit.INSTANCE;
                    Closeable.closeFinally(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    private final BitmapSampled decodeSampledBitmapRegion(Context context, Uri uri, Rect rect, int reqWidth, int reqHeight, int sampleMulti) throws CropException.FailedToLoadBitmap, FileNotFoundException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = sampleMulti * calculateInSampleSizeByRequestedSize(rect.width(), rect.height(), reqWidth, reqHeight);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    Intrinsics.checkNotNull(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    Intrinsics.checkNotNull(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            Intrinsics.checkNotNull(bitmapRegionDecoderNewInstance);
                            BitmapSampled bitmapSampled = new BitmapSampled(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            Closeable.closeFinally(inputStreamOpenInputStream, null);
                            return bitmapSampled;
                        } catch (OutOfMemoryError unused) {
                            i = options.inSampleSize * 2;
                            options.inSampleSize = i;
                        }
                    } finally {
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                    }
                } while (i <= 512);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(inputStreamOpenInputStream, null);
                return new BitmapSampled(null, 1);
            } finally {
            }
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(uri, e.getMessage());
        }
    }

    private final Bitmap cropForRotatedImage(Bitmap bitmap, float[] cropPoints, Rect rect, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (degreesRotated % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(degreesRotated);
        int i = (degreesRotated < 90 || (181 <= degreesRotated && degreesRotated < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= cropPoints.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f = cropPoints[i2];
            if (f >= i - 1 && f <= i + 1) {
                int i3 = i2 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * (rect.bottom - cropPoints[i3]));
                iAbs2 = (int) Math.abs(Math.cos(radians) * (cropPoints[i3] - rect.top));
                iAbs3 = (int) Math.abs((cropPoints[i3] - rect.top) / Math.sin(radians));
                iAbs = (int) Math.abs((rect.bottom - cropPoints[i3]) / Math.cos(radians));
                break;
            }
            i2 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (fixAspectRatio) {
            fixRectForAspectRatio(rect, aspectRatioX, aspectRatioY);
        }
        Intrinsics.checkNotNull(bitmap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!Intrinsics.areEqual(bitmap, bitmapCreateBitmap) && bitmap != null) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final int calculateInSampleSizeByRequestedSize(int width, int height, int reqWidth, int reqHeight) {
        int i = 1;
        if (height <= reqHeight && width <= reqWidth) {
            return 1;
        }
        while ((height / 2) / i > reqHeight && (width / 2) / i > reqWidth) {
            i *= 2;
        }
        return i;
    }

    private final int calculateInSampleSizeByMaxTextureSize(int width, int height) {
        if (mMaxTextureSize == 0) {
            mMaxTextureSize = getMaxTextureSize();
        }
        int i = 1;
        if (mMaxTextureSize <= 0) {
            return 1;
        }
        while (true) {
            int i2 = height / i;
            int i3 = mMaxTextureSize;
            if (i2 <= i3 && width / i <= i3) {
                return i;
            }
            i *= 2;
        }
    }

    private final Bitmap rotateAndFlipBitmapInt(Bitmap bitmap, int degrees, boolean flipHorizontally, boolean flipVertically) {
        if (degrees <= 0 && !flipHorizontally && !flipVertically) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(degrees);
        matrix.postScale(flipHorizontally ? -1 : 1, flipVertically ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (!Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "{\n      val matrix = Mat…  }\n      newBitmap\n    }");
        return bitmapCreateBitmap;
    }

    private final int getMaxTextureSize() {
        try {
            EGL egl = EGLContext.getEGL();
            Intrinsics.checkNotNull(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i, iArr);
            int[] iArr2 = new int[1];
            int i2 = iArr[0];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i4], 12332, iArr2);
                int i5 = iArr2[0];
                if (i3 < i5) {
                    i3 = i5;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i3, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    /* compiled from: BitmapUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/canhub/cropper/BitmapUtils$BitmapSampled;", "", "bitmap", "Landroid/graphics/Bitmap;", "sampleSize", "", "(Landroid/graphics/Bitmap;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getSampleSize", "()I", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
    public static final class BitmapSampled {
        private final Bitmap bitmap;
        private final int sampleSize;

        public BitmapSampled(Bitmap bitmap, int i) {
            this.bitmap = bitmap;
            this.sampleSize = i;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getSampleSize() {
            return this.sampleSize;
        }
    }

    /* compiled from: BitmapUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/canhub/cropper/BitmapUtils$RotateBitmapResult;", "", "bitmap", "Landroid/graphics/Bitmap;", "degrees", "", "flipHorizontally", "", "flipVertically", "(Landroid/graphics/Bitmap;IZZ)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getDegrees", "()I", "getFlipHorizontally", "()Z", "getFlipVertically", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
    public static final class RotateBitmapResult {
        private final Bitmap bitmap;
        private final int degrees;
        private final boolean flipHorizontally;
        private final boolean flipVertically;

        public RotateBitmapResult(Bitmap bitmap, int i, boolean z, boolean z2) {
            this.bitmap = bitmap;
            this.degrees = i;
            this.flipHorizontally = z;
            this.flipVertically = z2;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getDegrees() {
            return this.degrees;
        }

        public final boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        public final boolean getFlipVertically() {
            return this.flipVertically;
        }
    }
}
