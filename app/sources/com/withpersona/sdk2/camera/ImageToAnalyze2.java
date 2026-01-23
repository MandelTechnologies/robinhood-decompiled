package com.withpersona.sdk2.camera;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.common.InputImage;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.withpersona.sdk2.camera.ImageToAnalyze2;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: ImageToAnalyze.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u000f"}, m3636d2 = {"toImageToAnalyze", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "Landroidx/camera/core/ImageProxy;", "Landroid/media/Image;", "rotationDegrees", "", "toBitmap", "Landroid/graphics/Bitmap;", "getBitmap", WebsocketGatewayConstants.DATA_KEY, "Ljava/nio/ByteBuffer;", "metadata", "Lcom/withpersona/sdk2/camera/FrameMetadata;", "rotateBitmap", "bitmap", "camera_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.ImageToAnalyzeKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ImageToAnalyze2 {
    @SuppressLint({"UnsafeOptInUsageError"})
    public static final ImageToAnalyze toImageToAnalyze(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        try {
            Image image = imageProxy.getImage();
            if (image == null) {
                return null;
            }
            return toImageToAnalyze(image, imageProxy.getImageInfo().getRotationDegrees());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }

    /* compiled from: ImageToAnalyze.kt */
    @Metadata(m3635d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m3636d2 = {"com/withpersona/sdk2/camera/ImageToAnalyzeKt$toImageToAnalyze$1", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "inputImage", "Lcom/google/mlkit/vision/common/InputImage;", "getInputImage", "()Lcom/google/mlkit/vision/common/InputImage;", "inputImage$delegate", "Lkotlin/Lazy;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap$delegate", "width", "", "getWidth", "()I", "height", "getHeight", "rotationDegrees", "getRotationDegrees", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1 */
    public static final class C435431 implements ImageToAnalyze {

        /* renamed from: bitmap$delegate, reason: from kotlin metadata */
        private final Lazy bitmap;
        private final int height;
        private final Image image;

        /* renamed from: inputImage$delegate, reason: from kotlin metadata */
        private final Lazy inputImage;
        private final int rotationDegrees;
        private final int width;

        C435431(final Image image, final int i) {
            this.image = image;
            this.inputImage = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageToAnalyze2.C435431.inputImage_delegate$lambda$0(image, i);
                }
            });
            this.bitmap = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.camera.ImageToAnalyzeKt$toImageToAnalyze$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageToAnalyze2.toBitmap(image, i);
                }
            });
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.rotationDegrees = i;
        }

        @Override // com.withpersona.sdk2.camera.ImageToAnalyze
        public Image getImage() {
            return this.image;
        }

        @Override // com.withpersona.sdk2.camera.ImageToAnalyze
        public InputImage getInputImage() {
            return (InputImage) this.inputImage.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputImage inputImage_delegate$lambda$0(Image image, int i) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image, i);
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            return inputImageFromMediaImage;
        }

        @Override // com.withpersona.sdk2.camera.ImageToAnalyze
        public Bitmap getBitmap() {
            return (Bitmap) this.bitmap.getValue();
        }

        @Override // com.withpersona.sdk2.camera.ImageToAnalyze
        public int getWidth() {
            return this.width;
        }

        @Override // com.withpersona.sdk2.camera.ImageToAnalyze
        public int getHeight() {
            return this.height;
        }

        @Override // com.withpersona.sdk2.camera.ImageToAnalyze
        public int getRotationDegrees() {
            return this.rotationDegrees;
        }
    }

    public static final ImageToAnalyze toImageToAnalyze(Image image, int i) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        return new C435431(image, i);
    }

    public static final Bitmap toBitmap(Image image, int i) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        FrameMetadata frameMetadata = new FrameMetadata(image.getWidth(), image.getHeight(), i);
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        return getBitmap(bitmapUtils.yuv420ThreePlanesToNV21$camera_release(planes, image.getWidth(), image.getHeight()), frameMetadata);
    }

    private static final Bitmap getBitmap(ByteBuffer byteBuffer, FrameMetadata frameMetadata) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, frameMetadata.getWidth(), frameMetadata.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, frameMetadata.getWidth(), frameMetadata.getHeight()), 80, byteArrayOutputStream);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                Closeable.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNull(bitmapDecodeByteArray);
                return rotateBitmap(bitmapDecodeByteArray, frameMetadata.getRotation());
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static final Bitmap rotateBitmap(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (!Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }
}
